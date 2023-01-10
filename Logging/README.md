Clean up the maven project
```
mvn clean
```

Run Spring Boot locally
```
mvn spring-boot:run
```

Spring Boot port configuration 
```
mvn spring-boot:run -Dspring-boot.run.arguments=--port=8085
```

Setting environment variable port value
```
export APP_PORT=8090 (for mac)
set APP_PORT=8090 (for windows)
```