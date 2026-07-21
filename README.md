scp OpenJDK17U-jdk_x64_linux_hotspot_17.0.19_10.tar.gz p585600@caddeapllx1369.agil.nprd.caixa.gov.br:/tmp/


ls -la /tmp/OpenJDK17U-jdk_x64_linux_hotspot_17.0.19_10.tar.gz


sudo mkdir -p /usr/lib/jvm
sudo tar -xzf /tmp/OpenJDK17U-jdk_x64_linux_hotspot_17.0.19_10.tar.gz -C /usr/lib/jvm/
ls /usr/lib/jvm/
