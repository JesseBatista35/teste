# Estado das conexões: muitas em CLOSE_WAIT indicam que a app não fecha o socket
ss -tnp | grep "pid=72951" | grep -E "10.252.32.6[35]:80" | awk '{print $1}' | sort | uniq -c

# Para qual host o batch está pedindo CONNECT ao proxy (20 pacotes, rápido)
timeout 60 tcpdump -i any -A -s0 -c 20 'dst host 10.252.32.65 or dst host 10.252.32.63' 2>/dev/null | grep -aiE "CONNECT |Host:"

No DC, o comando falhou porque o placeholder ficou no lugar do caminho. Use o caminho real:


grep -nE "SIGEC-PORTABILIDADE-BATCH|deploy" /opt/jboss/jboss-eap/dc/log/host-controller.log | tail -40
