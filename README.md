# spring-boot-microservices
spring boot microservices demo

Spring Boot Microservices Level 1: Communication and Discovery
https://www.youtube.com/playlist?list=PLqq-6Pq4lTTZSKAFG6aCDVDP86Qx4lNas

Spring Boot Microservices Level 2: Fault Tolerance and Resilience
https://www.youtube.com/playlist?list=PLqq-6Pq4lTTbXZY_elyGv7IkKrfkSrX5e

Spring Boot Microservices Level 3: Microservice configuration
https://www.youtube.com/playlist?list=PLqq-6Pq4lTTaoaVoQVfRJPqvNTCjcTvJB

------------------------------------------------------------------------

Local config repo creation steps for 'spring-cloud-config-server' project

$ cd $HOME
$ mkdir configrepo
$ cd configrepo
$ vi application.yaml
$ paste below content to it and save

my:
  greeting: Hello from config server
  list:
    value: one,two,three, four
  map:
    value: "{key1:'value1',key2: 'value2'}"

app:
  name: My App
  description: Welcome to ${app.name}

db:
  connection: connectionStringFromConfigServer
  username: user
  password: pwd
  
$ git init
$ git add .
$ git commit -m "config yaml file added"
$ git commit -m "Add application.properties"
