@echo off
call mvn clean package
call docker build -t com.mycompany/mavenproject3 .
call docker rm -f mavenproject3
call docker run -d -p 9080:9080 -p 9443:9443 --name mavenproject3 com.mycompany/mavenproject3