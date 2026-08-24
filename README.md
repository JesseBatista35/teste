# Confirmar se o /etc/jboss-as/jboss-as.conf realmente tem essa linha (pode ter sido editado por outra sessão)
cat /etc/jboss-as/jboss-as.conf

# Ver se o launcher genérico standalone.sh existe no home correto
ls -la /home/jboss-eap-6.4/bin/standalone.sh

# Ver a estrutura real de base-dir do CSD2 (paralelo ao CSD1)
ls -la /home/jboss-eap-6.4/standaloneCSD2/
ls -la /home/jboss-eap-6.4/standaloneCSD2/configuration/standaloneCSD2.xml

