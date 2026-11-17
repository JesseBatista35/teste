systemctl status jboss* --no-pager
journalctl -u <nome-do-serviço> --no-pager | tail -100

Se não souber o nome do serviço, systemctl list-units | grep -i jboss mostra. Depois pegue o log de boot, que costuma ficar em $JBOSS_HOME/standalone/log/server.log. Se o caminho for outro, find / -name server.log -path '*jboss*' 2>/dev/null acha. Me mande as últimas 200 a 300 linhas ou o arquivo inteiro.

Nesse log procuro:

JBoss EAP 7.4 ou WildFly, para confirmar a versão (tira a dúvida entre EAP 7.4 e 8);
jboss.security., Services with missing/unavailable dependencies e WFLYCTL, para confirmar a segurança legada;
UnsupportedClassVersionError ou Unrecognized VM option, que apontariam para outra causa: o Java usado pelo serviço diferente do esperado.

Se o log estiver vazio ou nem existir, o problema é anterior ao JBoss, como o systemd falhando ao executar o script ou o JAVA_HOME apontando para um caminho inexistente. Nesse caso o systemctl status já mostra o motivo.

Me mande também qual imagem ou versão a esteira instalou nesse host.
