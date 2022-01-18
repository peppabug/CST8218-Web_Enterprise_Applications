#!/bin/sh
mvn clean package && docker build -t com.mycompany/mavenproject4 .
docker rm -f mavenproject4 || true && docker run -d -p 9080:9080 -p 9443:9443 --name mavenproject4 com.mycompany/mavenproject4