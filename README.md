Causa raiz e resolução — Restart JBoss SISMH (TQS)

Servidor: scttqapllx0032.df.caixa (10.116.18.146)
Ambiente: TQS / Site Negocial-Brasília
Sistema: SISMH (JBoss EAP 6.0.1.GA / AS 7.1.3.Final-redhat-4)

Sintoma relatado: Impossibilidade de publicar nova versão do SISMH.

Diagnóstico:
Análise do server.log mostrou múltiplas falhas de deploy entre 14:03 e 14:18, todas com a mesma causa raiz:

java.lang.OutOfMemoryError: PermGen space

As falhas ocorreram em sucessivas tentativas de publicação de diferentes versões do EAR (sismh.ear, sismh_2.59.36.11.ear, sismh_2.59.35.11a.ear). Isso é um padrão conhecido em JBoss EAP 6/AS7 rodando sob Java 7: quando um deploy falha, o classloader da tentativa anterior nem sempre é descarregado corretamente, e os metadados de classe permanecem retidos no PermGen. Redeploys sucessivos após uma falha inicial agravam o problema em vez de resolvê-lo, até esgotar o espaço configurado (-XX:MaxPermSize=256m) e travar qualquer nova publicação, mesmo sem relação com o conteúdo do EAR em si.

Ação executada:
Restart completo do JBoss standalone via /etc/init.d/jboss-standalone restart, liberando o PermGen. Subida confirmada no log:

15:32:55,772 INFO [org.jboss.as] JBAS015874: JBoss EAP 6.0.1.GA (AS 7.1.3.Final-redhat-4) iniciado em 2125ms - Iniciado 147 de serviços 230

Datasources SiicoDS e SismhDS bindados normalmente, sem erros subsequentes.

Recomendações:

Publicação liberada — ambiente TQS operacional para nova tentativa.
Avaliar aumento do -XX:MaxPermSize (atualmente 256m) no script de start, dado o histórico de saturação com múltiplas tentativas de redeploy.
Em caso de nova falha de publicação, priorizar restart completo antes de repetir o deploy — redeploy sobre PermGen já saturado tende a repetir o erro.
