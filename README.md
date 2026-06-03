me ajuda a reiniciar

16:23
Tenta assim, às vezes funciona pelo script direto:

bash
/opt/jboss/jboss-eap-7.0/bin/jboss-cli.sh --connect --controller=10.116.88.98:9990 --user=jboss7
Se não funcionar, tenta achar a senha no arquivo de propriedades:

bash
cat /opt/jboss/jboss-eap-7.0/domain/configuration/mgmt-users.properties
Cola o resultado!
