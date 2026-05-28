Adiciona isso no seu Dockerfile.jvm antes do ENTRYPOINT:
dockerfile# Exportar secrets como variáveis de ambiente
RUN echo '#!/bin/bash' > /deployments/export-secrets.sh && \
    echo 'export SISGF_APIKEY=$(cat /usr/src/app/secrets_files/SISGF_DES/SISGF_APIKEY 2>/dev/null)' >> /deployments/export-secrets.sh && \
    echo 'export SSGFRD01_DB2=$(cat /usr/src/app/secrets_files/SISGF_DES/SSGFRD01_DB2 2>/dev/null)' >> /deployments/export-secrets.sh && \
    echo 'export SSGFRD02_ORA=$(cat /usr/src/app/secrets_files/SISGF_DES/SSGFRD02_ORA 2>/dev/null)' >> /deployments/export-secrets.sh && \
    echo 'export CLISERSGF_SSO_INTRA=$(cat /usr/src/app/secrets_files/SISGF_DES/CLISERSGF_SSO_INTRA 2>/dev/null)' >> /deployments/export-secrets.sh && \
    echo 'export SSGFDR01_SFTP=$(cat /usr/src/app/secrets_files/SISGF_DES/SSGFDR01_SFTP 2>/dev/null)' >> /deployments/export-secrets.sh && \
    chmod +x /deployments/export-secrets.sh
E muda o ENTRYPOINT de:
dockerfileENTRYPOINT [ "/deployments/run-java.sh" ]
Para:
dockerfileENTRYPOINT [ "sh", "-c", "/deployments/export-secrets.sh && /deployments/run-java.sh" ]
Quer que eu prepare o Dockerfile completo com essas mudanças?
