# 1. Copiar a estrutura completa do overlay do patch 7.1.6.CP para a instalação ativa
cp -r /opt/jboss/jboss-eap/modules_bkp/system/layers/base/.overlays/layer-base-jboss-eap-7.1.6.CP \
      /opt/jboss/jboss-eap/modules/system/layers/base/.overlays/

# 2. Ajustar dono/permissões
chown -R jboss:jboss /opt/jboss/jboss-eap/modules/system/layers/base/.overlays/layer-base-jboss-eap-7.1.6.CP

# 3. Registrar o overlay (adiciona nova linha, mantém a 6.4.7.CP existente)
echo "layer-base-jboss-eap-7.1.6.CP" >> /opt/jboss/jboss-eap/modules/system/layers/base/.overlays/.overlays

# 4. Validar o jar que o patch traz
unzip -t /opt/jboss/jboss-eap/modules/system/layers/base/.overlays/layer-base-jboss-eap-7.1.6.CP/org/jboss/logmanager/main/jboss-logmanager-2.0.11.Final-redhat-00001.jar

# 5. Tentar subir
systemctl reset-failed jboss-eap7_hc
systemctl start jboss-eap7_hc
sleep 60
ps -ef | grep jboss
tail -80 /logs/jboss-eap/console-stdout.log
