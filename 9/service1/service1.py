from fastapi import FastAPI
import requests
import uvicorn



app = FastAPI()
@app.get("/1")
async def main():
    return "this is a response from serice no.1"

@app.get("/2")
async def main():
    message = requests.get('http://host.docker.internal:8082/2')
    return message.text

if __name__ == '__main__':
    uvicorn.run(
        app='service1:app',
        host="0.0.0.0",
        port=8083,
        workers=1,
        # log_level="DEBUG",
    )