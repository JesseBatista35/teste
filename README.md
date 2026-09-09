# 1. Descobrir o IP de um host saudável (ex: sbrdeapllx105, citado no manual com bind 10.116.94.212)
getent hosts sbrdeapllx105

# 2. Validar no host saudável (troque o IP se usar outro host) - a partir do bastion ou direto por sudo su
ssh p585600@sbrdeapllx105 "unzip -t /opt/jboss/jboss-eap/modules/system/layers/base/org/jboss/logmanager/main/jboss-logmanager-1.5.4.Final-redhat-1.jar"

# 3. Se OK, copiar o arquivo de lá para cá
scp p585600@sbrdeapllx105:/opt/jboss/jboss-eap/modules/system/layers/base/org/jboss/logmanager/main/jboss-logmanager-1.5.4.Final-redhat-1.jar /tmp/

# 4. No sbrdeapllx104, fazer backup do corrompido e substituir
cp /opt/jboss/jboss-eap/modules/system/layers/base/org/jboss/logmanager/main/jboss-logmanager-1.5.4.Final-redhat-1.jar /tmp/jboss-logmanager-1.5.4.Final-redhat-1.jar.corrompido
cp /tmp/jboss-logmanager-1.5.4.Final-redhat-1.jar /opt/jboss/jboss-eap/modules/system/layers/base/org/jboss/logmanager/main/jboss-logmanager-1.5.4.Final-redhat-1.jar
chown jboss:jboss /opt/jboss/jboss-eap/modules/system/layers/base/org/jboss/logmanager/main/jboss-logmanager-1.5.4.Final-redhat-1.jar
chmod 644 /opt/jboss/jboss-eap/modules/system/layers/base/org/jboss/logmanager/main/jboss-logmanager-1.5.4.Final-redhat-1.jar

# 5. Validar
unzip -t /opt/jboss/jboss-eap/modules/system/layers/base/org/jboss/logmanager/main/jboss-logmanager-1.5.4.Final-redhat-1.jar

# 6. Tentar subir de novo
systemctl reset-failed jboss-eap7_hc
systemctl start jboss-eap7_hc
sleep 60
ps -ef | grep jboss
tail -50 /logs/jboss-eap/console-stdout.log
