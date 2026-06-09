Vamos procurar pelo arquivo .ear da aplicação:
bashfind /opt/jboss -name "siosp*.ear" -type f 2>/dev/null
find /upload -name "*.ear" -type f 2>/dev/null
find /home -name "*.ear" -type f 2>/dev/null
Ou procure por arquivos recentes:
bashfind /opt/jboss -name "*.ear" -type f -mtime -30 2>/dev/null

Execute estes comandos! Aí vamos encontrar onde está o arquivo SIOSP.ear que precisa ser deployado!
