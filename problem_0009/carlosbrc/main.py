from fastapi import FastAPI, HTTPException, Response
import httpx

app = FastAPI(description="Proxy para peticiones HTTP GET, POST, PUT y DELETE", 
              version="0.1.0", 
              title="Proxy Cors",
              docs_url='/proxy',
              )

# Configurar con CORSMiddleware
# from fastapi.middleware.cors import CORSMiddleware
# app.add_middleware(
#     CORSMiddleware,
#     allow_origins=["*"],
#     allow_credentials=True,
#     allow_methods=["*"],
#     allow_headers=["*"],
# )

def get_headers(response: httpx.Response):
    headers = dict()
    
    # for key, value in response.headers.items():
    #     headers[key] = value
        
    headers["Access-Control-Allow-Origin"] = "*"
    headers["Access-Control-Allow-Headers"] = "*"
    headers["Access-Control-Allow-Methods"]= "GET, POST, PUT, DELETE, OPTIONS"
    return headers

async def endpoint(url):
    async with httpx.AsyncClient() as client:
        try:
            response = await client.get(url)
            
            if response.status_code == 200:
                return Response(content=response.text, headers=get_headers(response))
            else:
                raise HTTPException(status_code=response.status_code, detail="Error al procesar la solicitud")
        except httpx.HTTPError as e:
            print(e)
            raise HTTPException(status_code=500, detail="Error de conexión al servidor")

# Endpoint para el proxy get
@app.get("/", description="Proxy para peticiones HTTP GET", tags='A')
async def proxy_get(url: str):
    return await endpoint(url)

# Endpoint para el proxy post
@app.post("/", description="Proxy para peticiones HTTP POST", tags='A')
async def proxy_post(url: str):
    return await endpoint(url)

# Endpoint para el proxy PUT
@app.put("/" , description="Proxy para peticiones HTTP PUT", tags='A')
async def proxy_put(url: str):
    return await endpoint(url)

# Endpoint para el proxy DELETE
@app.delete("/", description="Proxy para peticiones HTTP DELETE", tags='A')
async def proxy_delete(url: str):
    return await endpoint(url)


