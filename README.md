✅ Próxima verificação: Testar IBM MQ
bash# Tentar conectar à porta 1414 (IBM MQ)
telnet 10.192.228.146 1414
nc -zv 10.192.228.146 1414

# Ver logs mais recentes do SIPEN
tail -100 /logs/jboss-eap/hc/servers/sipen_node3_lx0006/sipen.log
