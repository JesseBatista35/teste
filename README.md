Pessoal, boa tarde!

A esteira do SICOW-penhor-okd (DES) foi regularizada. A release SICOW-penhor-okd-1.0.15.9(5) concluiu com sucesso e o JBoss voltou a subir no pod.

Causa do timeout: o JBoss não iniciava por erros no standalone-okd.xml. O container reiniciava em loop e a release estourava o tempo aguardando o rollout.

Ajustes realizados no standalone-okd.xml:

Incluída a extensão org.wildfly.extension.messaging-activemq, que faltava no bloco <extensions> e causava erro de parse no subsystem de messaging.
Corrigido o handler de log: o arquivo definia SICOWPORTAL, mas o root-logger referenciava SICOWPENHOR.
Criadas as filas DLQ e ExpiryQueue, referenciadas no address-setting.
