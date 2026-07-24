# Ver o que o script realmente faz (rápido, só pra confirmar a lógica)
cat /etc/rc.d/init.d/connector | head -60

# Rodar o stop.sh diretamente como root, vendo o output completo
/connector/stop.sh
echo "EXIT CODE: $?"

# Confirmar se caiu de verdade
ps -ef | grep jboss

kill 1989284
sleep 3
ps -ef | grep jboss   # se ainda estiver lá, kill -9 1989284

/connector/start.sh
echo "EXIT CODE: $?"
ps -ef | grep jboss   # confirma PID novo
