A esteira está entregando corretamente o pacote certo a cada deploy. O que precisa ser investigado agora é onde o footer da tela busca essa informação de versão — ela não está vindo de um versao.txt nem version.txt dentro do pacote, então deve estar fixa em algum XHTML, JS ou cache do navegador. Você sabe me dizer em qual arquivo/componente o rodapé lê esse valor?"



ls -la /opt/jboss-eap/standalone/deployments/sisme-ear.ear*


cd /tmp && rm -rf checkver_call && mkdir checkver_call && cd checkver_call
unzip -o /opt/jboss-eap/standalone/deployments/sisme-ear.ear -d ear_extracted | grep -E "\.war|\.jar" | grep -iE "sisme-web|sisme-api|sisme-ejb"
