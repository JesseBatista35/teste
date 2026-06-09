🆘 O QUE FAZER AGORA (URGENTE - 20 MIN):
OPÇÃO 1 - Mais rápida:
bashls -la /opt/jboss/jboss-eap/hc/data/servers/siosp_node1_lx099/
Se houver um "deployments" ou "content", a aplicação pode estar lá. Compartilhe!
OPÇÃO 2:
bashcat /opt/jboss/jboss-eap/hc/log/servers/siosp_node1_lx099/server.log | grep -i "deploy\|artifact" | tail -20
OPÇÃO 3 - MAIS IMPORTANTE:
Você tem contato com quem faz o deploy? Ou tem acesso a um repositório Maven/Nexus?

Responda RÁPIDO qual é o caminho! ⏰
