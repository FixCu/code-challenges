import pytest
from fastapi.testclient import TestClient

from main import app

@pytest.fixture
def client():
    return TestClient(app)

@pytest.mark.asyncio
async def test_proxy_endpoint(client):
    url = "https://jsonplaceholder.typicode.com/todos/1"
    response = await client.get(f"/proxy/?url={url}")
    assert response.status_code == 200
    assert response.headers["content-type"] == "application/json; charset=utf-8"
    assert "userId" in response.json()
    assert "id" in response.json()
    assert "title" in response.json()
    assert "completed" in response.json()