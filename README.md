1. Entrar e salvar o XML atual:

bash
ssh p585600@10.116.194.179
sudo su
ls -la /log_jboss/config-log4j/
cp -p /log_jboss/config-log4j/sigsj_intranet.xml /tmp/sigsj_intranet.xml.bkp 2>/dev/null

2. Rodar o script do intranet:

bash
vi /tmp/custom-log4j.sh          # colar o custom.sh do INTRANET
bash /tmp/custom-log4j.sh
ls -la /log_jboss/config-log4j/ /log_jboss/sigsj_intranet/
grep 'File' /log_jboss/config-log4j/sigsj_intranet.xml

O grep deve mostrar /log_jboss/sigsj_intranet/sigsj_intranet.log.

3. Fazer o redeploy do EAR:

bash
cd /opt/jboss-eap/standalone/deployments/
touch sigsj_intranet-ear.ear.dodeploy

Se o chown der “inexistente” como no boleto, pode ignorar: o JBoss já consumiu o arquivo.

4. Conferir, depois de uns 60 segundos:

bash
ls /opt/jboss-eap/standalone/deployments/ | grep sigsj_intranet
ls -la /log_jboss/sigsj_intranet/
tail -3 /log_jboss/sigsj_intranet/sigsj_intranet.log
grep -E 'WFLYSRV0016|log4j:ERROR' /logs/jboss/jboss-eap/standalone/sigsj-intranet/server.log | tail -2

O esperado é .deployed sem .failed, o sigsj_intranet.log com conteúdo e a última linha do grep sendo o WFLYSRV0016 de agora, sem log4j:ERROR depois.
