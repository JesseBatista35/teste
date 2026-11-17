Rode estes comandos, trocando o nome do serviço (o <nome-do-serviço> do meu exemplo anterior era placeholder):

journalctl -u jboss-eap-standalone --no-pager | tail -100
ls -lt /opt/jboss-eap/standalone/log/
tail -300 /opt/jboss-eap/standalone/log/server.log

Se o server.log não existir ou estiver vazio, o JBoss morreu antes de abrir o log. Aí o motivo costuma estar no stdout do script, que pode estar em outro arquivo:

cat /opt/jboss-eap/bin/init.d/jboss-eap-standalone.sh | head -60
ls -lt /opt/jboss-eap/standalone/log/ /var/log/jboss* 2>/dev/null

Se você não tiver permissão para ler algum desses, rode com sudo ou me diga qual deu “Permissão negada”.

Também mande a saída de:

/opt/jboss-eap/bin/standalone.sh --version
java -version

Isso mostra a versão exata do JBoss e o Java que o serviço usa, para confirmar se é EAP 7.4 e se o JAVA_HOME está certo.

Do que vier, o que mais importa é:

WFLYCTL e jboss.security.: segurança legada, como o Jeferson descreveu;
UnsupportedClassVersionError, Unrecognized VM option ou --add-opens: Java incompatível com o JBoss;
Address already in use ou Permission denied: porta ou arquivo, problema de ambiente e não de aplicação.
Como o Claude está se saindo nes
