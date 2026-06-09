✅ SOLUÇÃO:
Remova a versão ANTIGA:
bashrm -f /opt/jboss/jboss-eap/modules/system/layers/base/org/dom4j/main/dom4j-1.6.1.redhat-7.jar
Verifique:
bashls -la /opt/jboss/jboss-eap/modules/system/layers/base/org/dom4j/main/
Deve mostrar APENAS o dom4j-2.1.1

Agora REINICIE o JBOSS:
bashkill -TERM 26176
sleep 15
tail -50 /opt/jboss/jboss-eap/hc/log/servers/siosp_node1_lx099/server.log
Se ver "Server started" ou SUCCESS ✅ = problema resolvido!

Sobre o login: Ótimo que conseguiu logar! Depois vamos testar se a aplicação está respondendo na URL correta.
Execute os comandos acima agora! 🚀
