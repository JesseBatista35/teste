
^C
[p585600@caddeapllx1992 logs]$
[p585600@caddeapllx1992 logs]$
[p585600@caddeapllx1992 logs]$ ps -ef | grep java
p585600   170138  134578  0 12:02 pts/1    00:00:00 grep --color=auto java
[p585600@caddeapllx1992 logs]$ ps -ef | grep jboss
p585600   170200  134578  0 12:02 pts/1    00:00:00 grep --color=auto jboss
[p585600@caddeapllx1992 logs]$ tail -f /logs/jboss/jboss-eap/standalone/siatd-intranet-vm/server.log
2026-08-20 11:53:37,050 WARN  [org.wildfly.extension.elytron] (MSC service thread 1-4) WFLYELY01084: KeyStore /opt/jboss-eap/standalone/configuration/application.keystore não encontrado; ele será gerado automaticamente na primeira utilização com um certificado autoassinado para o host localhost
2026-08-20 11:53:37,065 INFO  [org.wildfly.extension.undertow] (ServerService Thread Pool -- 71) WFLYUT0014: Criando identificador de arquivo para caminho de acesso '/opt/jboss-eap/welcome-content' com as opções [directory-listing: 'false', follow-symlink: 'false', case-sensitive: 'true', safe-symlink-paths: '[]']
2026-08-20 11:53:37,087 INFO  [org.jboss.as.mail.extension] (MSC service thread 1-4) WFLYMAIL0001: Sessão de e-mail associada [java:jboss/mail/caixamail]
2026-08-20 11:53:37,087 INFO  [org.jboss.as.mail.extension] (MSC service thread 1-4) WFLYMAIL0001: Sessão de e-mail associada [java:jboss/mail/sisou]
2026-08-20 11:53:55,045 ERROR [org.jboss.as.server] (ServerService Thread Pool -- 43) WFLYSRV0022: O procedimento da implantação "siatdEAR.ear" foi revertido sem mensagem de falha
2026-08-20 11:53:55,047 ERROR [org.jboss.as.server] (ServerService Thread Pool -- 43) WFLYSRV0022: O procedimento da implantação "applicationinsights-agent.jar" foi revertido sem mensagem de falha
2026-08-20 11:53:55,047 ERROR [org.jboss.as.server] (ServerService Thread Pool -- 43) WFLYSRV0022: O procedimento da implantação "ojdbc17.jar" foi revertido sem mensagem de falha
2026-08-20 11:53:55,047 ERROR [org.jboss.as.server] (ServerService Thread Pool -- 43) WFLYSRV0022: O procedimento da implantação "wmq.jmsra.rar" foi revertido sem mensagem de falha
2026-08-20 11:53:55,047 ERROR [org.jboss.as.server] (ServerService Thread Pool -- 43) WFLYSRV0022: O procedimento da implantação "framework.jar" foi revertido sem mensagem de falha
2026-08-20 11:53:55,070 INFO  [org.jboss.as] (MSC service thread 1-3) WFLYSRV0050: JBoss EAP 7.4.18.GA (WildFly Core 15.0.37.Final-redhat-00001) interrompido em 2148ms
^C
[p585600@caddeapllx1992 logs]$
[p585600@caddeapllx1992 logs]$
[p585600@caddeapllx1992 logs]$ watch -2 "ss-tlnp | grep 9990"
watch: opção inválida -- “2”

Usage:
 watch [options] command

Options:
  -b, --beep             beep if command has a non-zero exit
  -c, --color            interpret ANSI color and style sequences
  -d, --differences[=<permanent>]
                         highlight changes between updates
  -e, --errexit          exit if command has a non-zero exit
  -g, --chgexit          exit when output from command changes
  -n, --interval <secs>  seconds to wait between updates
  -p, --precise          attempt run command in precise intervals
  -t, --no-title         turn off header
  -w, --no-wrap          turn off line wrapping
  -x, --exec             pass command to exec instead of "sh -c"

 -h, --help     display this help and exit
 -v, --version  output version information and exit

For more details see watch(1).
[p585600@caddeapllx1992 logs]$ watch -n 2 "ss-tlnp | grep 9990"
[p585600@caddeapllx1992 logs]$
[p585600@caddeapllx1992 logs]$
[p585600@caddeapllx1992 logs]$ watch -n 2 "ss -tlnp | grep 9990"
[p585600@caddeapllx1992 logs]$
