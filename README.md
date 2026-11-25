Fabio, reiniciei o JBoss do batch (caddeapllx2884) às 17:12 e segue o log do boot e o gec-ear.ear.failed, que tem o motivo da falha do deploy.

O que aparece: o JBoss sobe "com erros" (17 serviços falharam ou com dependências ausentes) e o gec-ear.ear fica com o .failed. Erro do deploy: <colar a causa do .failed>.

Depois de subir, o log se enche de ConcurrentAccessTimeoutException no GerenciadorTimersBean (5s) e no PreProcessadorRecebimentoBean (90s). Parece o travamento dos timers do batch.

O EAR que está no batch é de 18/11 17:33, não foi atualizado hoje.

Sobre reiniciar: a esteira reinicia o JBoss sozinha no deploy. À mão, é systemctl restart jboss-eap-standalone no 2884, com sudo. Se precisar de novo, é só pedir.
