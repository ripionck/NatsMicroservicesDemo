## Running NATS server on docker
docker run -d --name nats-server -p 4222:4222 -p 8222:8222 nats

## Endpoint testing
GET http://localhost:8080/publish?subject=connections&message=Hello%20NATS
