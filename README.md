cat /etc/redhat-release
ldd --version | head -1
rpm -qa | grep -i jdk
ls -la /opt/batch/deploy/ 2>/dev/null
alternatives --display java 2>/dev/null


100
scp OpenJDK21U-jdk_x64_linux_hotspot_21.0.11_10.tar.gz p585600@caddeapllx1567.agil.nprd.caixa.gov.br:/tmp/

sudo su
mkdir -p /usr/lib/jvm
tar -xzf /tmp/OpenJDK21U-jdk_x64_linux_hotspot_21.0.11_10.tar.gz -C /usr/lib/jvm/
chown -R root:root /usr/lib/jvm/jdk-21.0.11+10
/usr/lib/jvm/jdk-21.0.11+10/bin/java -version
