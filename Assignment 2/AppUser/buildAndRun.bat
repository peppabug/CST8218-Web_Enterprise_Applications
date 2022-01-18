@echo off
call mvn clean package
call docker build -t com.mycompany/AppUser .
call docker rm -f AppUser
call docker run -d -p 9080:9080 -p 9443:9443 --name AppUser com.mycompany/AppUser