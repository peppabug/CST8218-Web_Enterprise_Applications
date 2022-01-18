#!/bin/sh
mvn clean package && docker build -t com.mycompany/AppUser .
docker rm -f AppUser || true && docker run -d -p 9080:9080 -p 9443:9443 --name AppUser com.mycompany/AppUser