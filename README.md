sed -n '85,105p' /tmp/jboss_start.log

telnet cnpexdadvm01-scan2.extra.caixa.gov.br 1521

timeout 5 bash -c "echo > /dev/tcp/cnpexdadvm01-scan2.extra.caixa.gov.br/1521" && echo "porta aberta" || echo "porta fechada/bloqueada"
