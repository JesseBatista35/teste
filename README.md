scp OpenJDK21U-jdk_x64_linux_hotspot_21.0.11_10.tar.gz p585600@caddeapllx1567.agil.nprd.caixa.gov.br:/tmp/


ls -la /tmp/OpenJDK21U-jdk_x64_linux_hotspot_21.0.11_10.tar.gz
sudo su
mkdir -p /usr/java
tar -xzf /tmp/OpenJDK21U-jdk_x64_linux_hotspot_21.0.11_10.tar.gz -C /usr/java/
chown -R root:root /usr/java/jdk-21.0.11+10
ls -la /usr/java/


/usr/java/jdk-21.0.11+10/bin/java -version
