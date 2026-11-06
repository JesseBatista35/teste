2. Confira que o JBoss está rodando:

bash
ps -ef | grep -c '[s]tandalone-full-ha.xml'

O esperado é 1 ou mais.

3. Veja os deploys e procure marcadores de falha:

bash
ls -la /opt/jboss-eap/standalone/deployments/
ls /opt/jboss-eap/standalone/deployments/ | grep -E '\.(failed|undeployed)$'
Primeiro comando: o esperado é boletoService-ear.ear com boletoService-ear.ear.deployed e nenhum sirotcon-ejb.jar.
Segundo comando: precisa voltar vazio.

4. Veja no log se o contexto subiu e se há erros conhecidos:

bash
grep -E 'WFLYUT0021|WFLYSRV0010|WFLYEE0047|NumberFormatException|ClassNotFound' /logs/jboss/jboss-eap/standalone/sigsj-boleto/server.log | tail -20

O esperado é /boletoService registrado, boletoService-ear.ear implantado e nenhuma das três exceções.

5. Teste a aplicação respondendo pelo Apache:

bash
curl -s -o /dev/null -w '%{http_code}\n' http://localhost/boletoService/

O esperado é 200, 302, 403 ou 404. Qualquer um desses mostra que o Apache entregou a requisição ao JBoss; o boleto é um serviço e pode não ter página na raiz. Se voltar 503 ou 000, tem problema.

6. Confira o log4j, que deve dar o mesmo aviso do DES:

bash
grep -E 'log4j:ERROR|FileNotFoundException' /logs/jboss/jboss-eap/standalone/sigsj-boleto/server.log | tail -3

Me manda as saídas que eu confiro.
