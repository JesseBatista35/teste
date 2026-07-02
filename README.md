-sh-4.2$ nslookup servicossociais.des.corerj.caixa
Server:         10.116.193.77
Address:        10.116.193.77#53

Non-authoritative answer:
Name:   servicossociais.des.corerj.caixa
Address: 10.116.98.168

-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ find / -path "*sicmu*scripts*" 2>/dev/null
-sh-4.2$ find / -iname "vendor.js" 2>/dev/null
/opt/httpd/htdocs/httpd_eap_esteiraagil/scripts/vendor.js
/opt/httpd/htdocs/httpd_eap_esteiraagil/temp/scripts/vendor.js
-sh-4.2$ find / -iname "standalone.xml" 2>/dev/null
/opt/jboss-eap/standalone/configuration/standalone.xml
/opt/jboss-eap/.installation/patches/jboss-eap-7.4.8.CP/configuration/standalone/standalone.xml
-sh-4.2$ find / -iname "*sicmu*" -maxdepth 6 2>/dev/null
/logs/httpd/sicmu-intranet-update.caixa-access.log-20260616.gz
/logs/httpd/sicmu-intranet-update.caixa-access.log-20260618.gz
/logs/httpd/sicmu-intranet-update.caixa-access.log-20260623.gz
/logs/httpd/sicmu-intranet-update.caixa-access.log-20260612.gz
/logs/httpd/sicmu-intranet-update.caixa-error.log-20260612.gz
/logs/httpd/sicmu-intranet-update.caixa-error.log-20260621.gz
/logs/httpd/sicmu-intranet-update.caixa-error.log-20260623.gz
/logs/httpd/sicmu-intranet-update.caixa-error.log-20260619.gz
/logs/httpd/sicmu-intranet-update.caixa-access.log-20260620.gz
/logs/httpd/sicmu-intranet-update.caixa-access.log-20260613.gz
/logs/httpd/sicmu-intranet-update.caixa-error.log-20260613.gz
/logs/httpd/sicmu-intranet-update.caixa-access.log
/logs/httpd/sicmu-intranet-update.caixa-access.log-20260617.gz
/logs/httpd/sicmu-intranet-update.caixa-error.log-20260618.gz
/logs/httpd/sicmu-intranet-update.caixa-access.log-20260619.gz
/logs/httpd/sicmu-intranet-update.caixa-access.log-20260614.gz
/logs/httpd/sicmu-intranet-update.caixa-error.log-20260614.gz
/logs/httpd/sicmu-intranet-update.caixa-error.log-20260617.gz
/logs/httpd/sicmu-intranet-update.caixa-error.log-20260620.gz
/logs/httpd/sicmu-intranet-update.caixa-error.log
/logs/httpd/sicmu-intranet-update.caixa-access.log-20260615.gz
/logs/httpd/sicmu-intranet-update.caixa-error.log-20260615.gz
/logs/httpd/sicmu-intranet-update.caixa-access.log-20260621.gz
/logs/httpd/sicmu-intranet-update.caixa-error.log-20260616.gz
/logs/httpd/sicmu-intranet-update.caixa-access.log-20260625.gz
/logs/httpd/sicmu-intranet-update.caixa-access.log-20260622.gz
/logs/httpd/sicmu-intranet-update.caixa-error.log-20260622.gz
/logs/httpd/sicmu-intranet-update.caixa-access.log-20260624.gz
/logs/httpd/sicmu-intranet-update.caixa-error.log-20260624.gz
/logs/httpd/sicmu-intranet-update.caixa-error.log-20260625.gz
/logs/httpd/sicmu-intranet-update.caixa-access.log-20260626.gz
/logs/httpd/sicmu-intranet-update.caixa-error.log-20260626.gz
/logs/httpd/sicmu-intranet-update.caixa-access.log-20260627.gz
/logs/httpd/sicmu-intranet-update.caixa-error.log-20260627.gz
/logs/httpd/sicmu-intranet-update.caixa-access.log-20260628.gz
/logs/httpd/sicmu-intranet-update.caixa-error.log-20260628.gz
/logs/httpd/sicmu-intranet-update.caixa-access.log-20260629.gz
/logs/httpd/sicmu-intranet-update.caixa-error.log-20260629.gz
/logs/httpd/sicmu-intranet-update.caixa-access.log-20260630.gz
/logs/httpd/sicmu-intranet-update.caixa-error.log-20260630.gz
/logs/httpd/sicmu-intranet-update.caixa-access.log-20260701
/logs/httpd/sicmu-intranet-update.caixa-error.log-20260701
/logs/jboss/jboss-eap/standalone/sicmu-intranet-update
/logs/monitoracao/apache_access_sicmu-intranet-update.log-20260701
/logs/monitoracao/apache_access_sicmu-intranet-update.log
/opt/jboss-eap/standalone/deployments/SICMU-ear.ear
/opt/jboss-eap/standalone/deployments/SICMU-ear.ear.deployed
/opt/jboss-eap/standalone/tmp/SICMU-ear.ear.SICMU-web.war
-sh-4.2$



outra questão

nao sei se isso tem haver mais ta acontecendi isso:

Magnus dos Santos Silva, bom dia tudo bem? cara fizemos a solicitação de reconfiguração e foi atendida, agora estamos com o seguinte problema, 
 
https://sicmu-intranet-update.esteiras.des.caixa/
 
eu consigo acessar e entra normalmente, estou pela VPN CAIXA TI.
 
Já o Marcelo esta pela VPN CAIXA e não consegue entrar.
 
ja solicitei para colegas que estão presencial na 512 norte e eles também conseguem acessar. 
 
sabe me informar o que pode está acontecendo?
 
o marcela já esta abrindo a req para cetel


 responsta do magnus:


 Verifiquei que de fato não há regra permitindo o acesso https://sicmu-intranet-update.esteiras.des.caixa/ a partir do túnel de VPN do Marcelo, bem como uma regra em direção a esse serviço nunca foi solicitada no portal regras.telecom.caixa. Para os que funcionam, é porque há uma outra regra abrangente permitindo. O Marcelo teria que solicitar assim:
 
Origem: VPN_CAIXA
Destino: 10.116.181.177 (sicmu-intranet-update.esteiras.des.caixa)
Porta: 443


<img width="1243" height="690" alt="imagem (8)" src="https://github.com/user-attachments/assets/41591469-94c4-4fdf-8fb0-d07cee1ce8c3" />

o marcelo ja esta verificnado com a cerpto sobre a regra de firewall




