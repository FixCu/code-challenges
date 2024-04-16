# FastAPI CORS Proxy

Este es un simple API proxy CORS construido con FastAPI en Python. Permite realizar solicitudes a recursos externos desde un navegador web que normalmente estarían bloqueados por la política de seguridad de mismo origen (CORS).

## Instalación

1. Clona este repositorio en tu máquina local:

    ```bash
    git clone <url-del-repositorio>
    ```

2. Usar entorno virtual de Python (Opcional):

    ```bash
    python -m venv myenv
    source myenv/bin/activate
    ```

3. Instala las dependencias usando pip:

    ```bash
    pip install -r requirements.txt
    ```

## Uso

1. Ejecuta la aplicación usando uvicorn:

    ```bash
    uvicorn main:app --reload
    ```

2. Una vez que la aplicación esté en ejecución, puedes acceder a la documentación de API Cors Proxy para hacer un uso eficiente a través de la URL `http://localhost:8000/proxy`.

3. Una vez que la aplicación esté en ejecución, puedes acceder al proxy a través de la URL `http://localhost:8000/`.

4. Para realizar una solicitud al recurso deseado a través del proxy, simplemente agrega el parámetro `url` con la URL del recurso después de `/`. Por ejemplo:

    ```
    http://localhost:8000/?url=https://example.com/api/data
    ```

## Contribución

Las contribuciones son bienvenidas. Si encuentras algún problema o tienes alguna mejora, no dudes en abrir un problema o enviar una solicitud de extracción.

## Atribuciones

Este proyecto fue creado utilizando FastAPI, una excelente biblioteca para la creación rápida de APIs con Python.