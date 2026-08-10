
[p585600@caddeapllx2725 deployments]$
[p585600@caddeapllx2725 deployments]$
[p585600@caddeapllx2725 deployments]$ ss -tlnp | grep -E ':8080|:8009|:9990'
LISTEN 0      10000        0.0.0.0:8080      0.0.0.0:*
LISTEN 0      10000        0.0.0.0:8009      0.0.0.0:*
LISTEN 0      50           0.0.0.0:9990      0.0.0.0:*
[p585600@caddeapllx2725 deployments]$
[p585600@caddeapllx2725 deployments]$
[p585600@caddeapllx2725 deployments]$ netstat -tlnp | grep -E ':8080|:8009|:9990'
(Nem todos os processos puderam ser identificados, informações sobre processos
 de outrem não serão mostrados, você deve ser root para vê-los todos.)
tcp        0      0 0.0.0.0:8080            0.0.0.0:*               OUÇA       -
tcp        0      0 0.0.0.0:8009            0.0.0.0:*               OUÇA       -
tcp        0      0 0.0.0.0:9990            0.0.0.0:*               OUÇA       -
[p585600@caddeapllx2725 deployments]$
[p585600@caddeapllx2725 deployments]$
[p585600@caddeapllx2725 deployments]$
