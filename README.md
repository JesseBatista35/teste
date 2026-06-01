
# Script para exportar secrets e rodar o Java
RUN echo '#!/bin/bash' > /deployments/startup.sh && \
    echo 'export SIFUG_DATASOURCE_02=$(cat /usr/src/app/secrets_files/SIOFG_DES/SIFUG_DATASOURCE_02 2>/dev/null || echo "")' >> /deployments/startup.sh && \
    echo 'export SIFUG_DATASOURCE_15=$(cat /usr/src/app/secrets_files/SIOFG_DES/SIFUG_DATASOURCE_15 2>/dev/null || echo "")' >> /deployments/startup.sh && \
    echo 'export SIOFG_XMQD1=$(cat /usr/src/app/secrets_files/SIOFG_DES/SIOFG_XMQD1 2>/dev/null || echo "")' >> /deployments/startup.sh && \
    echo 'export SIFUG_BT_APIKEY=$(cat /usr/src/app/secrets_files/SIOFG_DES/SIFUG_BT_APIKEY 2>/dev/null || echo "")' >> /deployments/startup.sh && \
    echo 'export CLISERFUG_SSO_INTER=$(cat /usr/src/app/secrets_files/SIOFG_DES/CLISERFUG_SSO_INTER 2>/dev/null || echo "")' >> /deployments/startup.sh && \
    echo 'exec /deployments/run-java.sh' >> /deployments/startup.sh && \
    chmod +x /deployments/startup.sh

EXPOSE 8080
USER 1001
ENTRYPOINT [ "/deployments/startup.sh" ]
