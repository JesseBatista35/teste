# Script startup que exporta as variáveis e executa o Java
RUN echo '#!/bin/bash' > /deployments/startup.sh && \
    echo 'source /deployments/export-secrets.sh' >> /deployments/startup.sh && \
    echo 'exec /deployments/run-java.sh' >> /deployments/startup.sh && \
    chmod +x /deployments/startup.sh

EXPOSE 8080
USER 1001
ENTRYPOINT [ "/deployments/startup.sh" ]
