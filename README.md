# backend
Backend code + infra code

## How to run
### IDE
Start Application class for particular application (e.g. `gateway/application/src/main/kotlin/io/mart/Application.kt`)

### Gradle (CLI)
Execute gradle command for corresponding module ("*-application" is a module for SpringBoot application class)  
`./gradlew :gateway-application:bootRun`

### as Docker container
```shell
./gradlew build
cd apps/gateway/application
docker build -t amartyushov/gateway:0.0.1 .
(`docker images` to check locally built images)
docker login
docker push amartyushov/gateway:0.0.1
```


# Tooling
## httpie
Cli for "normal" curl  
`brew install httpie`  
https://httpie.io/cli
### Examples
```shell
http :8080/users
```
