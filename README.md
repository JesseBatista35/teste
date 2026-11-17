1. Confirme se o EAR tem a correção (o bloco do gec-web.war deve mostrar as duas dependências):

cd /opt/jboss-eap/standalone/deployments
ls -l gec-ear.ear
unzip -p gec-ear.ear META-INF/jboss-deployment-structure.xml | sed -n '/gec-web.war/,/<\/sub-deployment>/p'
Se o bloco vier vazio (só comentários), esta release ainda usou o EAR antigo. Confira se o commit foi feito na Cesti-test-001, se o -Ponline rodou depois dele e se a release pegou esse build novo.
Se o bloco vier com as dependências, a correção entrou e o erro agora é outro.

2. O erro desta subida. Extraia só o boot de 12:32 e procure a causa:

L=/logs/jboss/jboss-eap/standalone/sigec-portabilidade/server.log
sed -n '/2026-11-17 12:32:5/,$p' $L > /tmp/boot.log
grep -n -A14 "WFLYCTL0013.*deploy" /tmp/boot.log | head -80
grep -n "Caused by" /tmp/boot.log | head -20

Me mande a saída dos dois blocos.

Se o descritor estiver certo e o erro agora for outro, é a próxima camada, como o Keycloak, uma fila ou um datasource. Aí eu corrijo em seguida. Depois que o online estiver verde, passamos para o batch com a cópia dos três deployments.
