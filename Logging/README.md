## Notes

1. Run Spring Boot locally (e.g set default port to 8080)
```
mvn spring-boot:run
```

2. Spring Boot port configuration (e.g set to port 8085)
```
mvn spring-boot:run -Dspring-boot.run.arguments=--port=8085
```

3. Setting environment variable port value (e.g set to 8090)
```
export APP_PORT=8090 (for mac)
set APP_PORT=8090 (for windows)
```

4. Setting port directly in application.properties will override the above (this program uses port 8082 as example)