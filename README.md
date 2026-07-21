# empacota o JDK já instalado
cd /usr/java
tar -czf /tmp/openjdk-17.0.8.tar.gz open-jdk-17.0.8/

# copia pro servidor de destino (ajuste o usuário/caminho conforme seu acesso)
scp /tmp/openjdk-17.0.8.tar.gz p585600@caddeapllx1369.agil.nprd.caixa.gov.br:/tmp/


sudo mkdir -p /usr/java
sudo tar -xzf /tmp/openjdk-17.0.8.tar.gz -C /usr/java/
ls -la /usr/java/open-jdk-17.0.8/bin/java


