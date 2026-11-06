Boleto TQS fechado ✅. O 404 é esperado: o RESTEasy atende /* e não tem nada na raiz.

O EAR do TQS traz boletoService-war-2.0.2.8.war, a mesma versão do DES. Então a tag 0.0.0.1 da release não trocou a versão da aplicação, e esse ponto já pode sair da lista para a sala.

Se quiser, limpe o que extraímos: rm -rf /tmp/boleto

Próximo: intranet TQS. Pegue o hostname da VM no log da task “Alocando o IP” do stage EC TQS da release do intranet, entre nela, rode sudo su e cole tudo de uma vez:

bash
ps -ef | grep -c '[s]tandalone-full-ha.xml'
ls /opt/jboss-eap/standalone/deployments/
ls /opt/jboss-eap/standalone/deployments/ | grep -E '\.(failed|undeployed)$'
grep -E 'WFLYUT0021|WFLYSRV0010|WFLYEE0047|NumberFormatException|ClassNotFound' /logs/jboss/jboss-eap/standalone/sigsj-intranet/server.log | tail -10
grep -iE 'SIGSJ04|ORA-[0-9]' /logs/jboss/jboss-eap/standalone/sigsj-intranet/server.log | tail -5
curl -s -o /dev/null -w '%{http_code}\n' http://localhost/sigsj_intranet/

O que se espera de cada linha, na ordem:

3.
O EAR com .deployed e o ojdbc8.jar, sem sirotcon-ejb.jar.
Saída vazia.
/sigsj_intranet e /sigsjintrastatic registrados, o EAR implantado e nenhum erro.
O datasource SIGSJ04 ligado, sem ORA-.
200 ou 302 (a tela de login).

Me manda o resultado.
