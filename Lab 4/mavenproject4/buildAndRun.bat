@echo off
call mvn clean package
call docker build -t com.mycompany/mavenproject4 .
call docker rm -f mavenproject4
call docker run -d -p 9080:9080 -p 9443:9443 --name mavenproject4 com.mycompany/mavenproject4