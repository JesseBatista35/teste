Fechamento – Reinício JBoss SISMH
O servidor JBoss da aplicação SISMH (scttqapllx0032) apresentou indisponibilidade por esgotamento de memória PermGen (OutOfMemoryError), que travou o processo e impediu o reinício via CLI de gerenciamento.
Processo finalizado e serviço reiniciado com sucesso às 12h38 de 13/07/2026.
Evidência do restart (log do servidor):
12:38:32,398 INFO  [org.jboss.as.server] (Controller Boot Thread) JBAS018559: Implantado "sismh_2_59_34_11.ear"
12:38:32,455 INFO  [org.jboss.as] (Controller Boot Thread) JBAS015874: JBoss EAP 6.0.1.GA (AS 7.1.3.Final-redhat-4) iniciado em 16796ms - Iniciado 5269 de serviços 5362 (os serviços 91 são passivos ou em demanda)
12:38:41,344 INFO  [javamelody] (thread_size-threads - 1) remoteAddr = 127.0.0.1, request = /login.cef GET: 352 ms, 9 Ko
Aplicação reimplantada, servidor iniciado e respondendo normalmente às requisições (tela de login validada).
Situação: Demanda concluída, serviço normalizado.
