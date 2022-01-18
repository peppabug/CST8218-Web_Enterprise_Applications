@echo off
call mvn clean package
call docker build -t com.mycompany/WidgetAppMichael .
call docker rm -f WidgetAppMichael
call docker run -d -p 9080:9080 -p 9443:9443 --name WidgetAppMichael com.mycompany/WidgetAppMichael