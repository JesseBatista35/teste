Antes de mandar, confira se o EAR realmente não tem a lib:

unzip -l /opt/jboss-eap/standalone/deployments/gec-ear.ear | grep -i lang3

Se não aparecer nada, está confirmado. Se aparecer, me cole a saída, porque aí o problema seria de classloading e não de empacotamento.

Sobre o travamento dos timers (ACTC403): com o gec-ear falhando, o WFLYEJB0241 pode ser só consequência. Vale rever depois que o EAR subir.

cade o comando apra  pegasr  olog inteiro no bnastian

No bastion (o 100), rode isto:

scp p585600@10.116.202.70:/logs/jboss/jboss-eap/standalone/sigec-portabilidade-batch/server.log .

Hoje o server.log está pequeno (464 KB), porque o JBoss reiniciou às 12:06. Ele tem o boot com o erro do commons-lang3, então serve para o Fabio.

Os logs antigos ficam na mesma pasta. Se quiser o dia da trava, pegue o de 26/11 (102 MB, sem compactar) e os compactados:
