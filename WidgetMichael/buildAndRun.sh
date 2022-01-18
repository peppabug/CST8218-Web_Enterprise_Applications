#!/bin/sh
mvn clean package && docker build -t com.mycompany/WidgetAppMichael .
docker rm -f WidgetAppMichael || true && docker run -d -p 9080:9080 -p 9443:9443 --name WidgetAppMichael com.mycompany/WidgetAppMichael