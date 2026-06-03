
[p585600@sspdeapllx0041 tmp]$ sudo su jboss7
[jboss7@sspdeapllx0041 tmp]$ cp /opt/azure/config/appinsights/applicationinsights-agent-3.3.1.jar /opt/azure/config/appinsights/applicationinsights-agent-3.3.1.jar.bkp
[jboss7@sspdeapllx0041 tmp]$ cp /tmp/applicationinsights-agent-3.7.8.jar /opt/azure/config/appinsights/applicationinsights-agent-3.7.8.jar
[jboss7@sspdeapllx0041 tmp]$
[jboss7@sspdeapllx0041 tmp]$
[jboss7@sspdeapllx0041 tmp]$
[jboss7@sspdeapllx0041 tmp]$ chmod 644 /opt/azure/config/appinsights/applicationinsights-agent-3.7.8.jar
[jboss7@sspdeapllx0041 tmp]$ ls -la /opt/azure/config/appinsights/
total 139604
drwxr-xr-x. 2 jboss7 jboss7     4096 2026-06-03 16:20 .
drwxr-xr-x. 3 jboss7 jboss7     4096 2022-05-26 16:48 ..
-rw-r--r--. 1 jboss7 jboss7 20878747 2022-05-26 16:48 applicationinsights-agent-3.1.1.jar
-rw-r--r--. 1 jboss7 jboss7 37660417 2022-12-21 20:03 applicationinsights-agent-3.3.1.jar
-rw-r--r--  1 jboss7 jboss7 37660417 2026-06-03 16:20 applicationinsights-agent-3.3.1.jar.bkp
-rw-r--r--  1 jboss7 jboss7 46275771 2026-06-03 16:20 applicationinsights-agent-3.7.8.jar
lrwxrwxrwx. 1 jboss7 jboss7       35 2022-12-21 20:23 applicationinsights-agent.jar -> applicationinsights-agent-3.3.1.jar
-rw-r--r--  1 jboss7 jboss7      730 2026-06-02 14:38 applicationinsights.json
-rw-r--r--. 1 jboss7 jboss7      452 2022-05-26 16:48 applicationinsights.json.20210828
-rw-r--r--. 1 jboss7 jboss7      452 2022-06-02 16:37 applicationinsights.json.20221221
-rw-r--r--  1 jboss7 jboss7   434284 2026-06-03 16:16 applicationinsights.log
[jboss7@sspdeapllx0041 tmp]$
