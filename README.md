1️⃣ Tente restaurar do cache do sistema:
bashyum reinstall dom4j-1.6.1 -y
2️⃣ Ou procure em backup automático:
bashfind / -name "dom4j-1.6.1*" -type f 2>/dev/null
3️⃣ Ou copie de outra máquina com SIOSP funcionando:
bashscp user@outra-maquina:/opt/jboss/jboss-eap/modules/system/layers/base/org/dom4j/main/dom4j-1.6.1.redhat-7.jar /opt/jboss/jboss-eap/modules/system/layers/base/org/dom4j/main/
4️⃣ Se não encontrar, reinstale via yum:
bashyum install dom4j-1.6 -y

Execute um desses comandos! Qual você consegue fazer primeiro? ⏰
Desculpa novamente - deveria ter sido mais cuidadoso!
