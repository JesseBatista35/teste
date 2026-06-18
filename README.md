find /deployments -name "*.jks" -o -name "*.p12" -o -name "*.pkcs12" 2>/dev/null


ls -la /deployments/
ls -la /opt/
ls -la /app/
find / -name "*truststore*" 2>/dev/null | head -20

