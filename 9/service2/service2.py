from fastapi import FastAPI
import uvicorn


app = FastAPI()
@app.get("/2")
async def main():
    return "this is a response from serice no.2"

if __name__ == '__main__':
    uvicorn.run(
        app='service2:app',
        host="0.0.0.0",
        port=8082,
        workers=1,
        # log_level="DEBUG",
    )