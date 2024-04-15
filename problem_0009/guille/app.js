const https = require('https');

// express service
const app = require('express')();
const port = process.env.PORT || 3000;

function applyCors(res) {
    res.header('Access-Control-Allow-Origin', '*');
    res.header('Access-Control-Allow-Credentials', 'true');
    res.header('Access-Control-Allow-Methods', 'GET, POST, PUT, DELETE, OPTIONS');
}

app.use((req, res, next) => {
    // apply CORS to all responses (middleware)
    applyCors(res);
    next();
});

app.options('*', (req, res) => {
    res.send();
})

app.get('/', async (req, res) => {
    if (!req.query.url) {
        res.status(400).send('Missing url parameter');
        return;
    }

    console.log('Requesting:', decodeURIComponent(req.query.url));

    https.get(decodeURIComponent(req.query.url), (response) => {
        let data = '';
        response.on('data', (chunk) => {
            data += chunk;
        });
        response.on('end', () => {
            res.status(response.statusCode);
            const {headers} = response;
            Object.keys(headers).forEach((header) => {
                res.header(header, headers[header]);
            });
            res.send(data);
        });
    }).on('error', (err) => {
        res.status(500).send(err);
    });
});

app.listen(port, () => {
    console.log(`Server started on http://localhost:${port}`);
});

module.exports = app;
