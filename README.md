## To run NATS image on docker, run the following command
```bash
 docker run -d --name nats-server -p 4222:4222 -p 8222:8222 nats
```

## Endpoint testing
```http
  GET http://localhost:8080/publish?subject=connections&message=Hello%20NATS
```

