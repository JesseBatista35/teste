Segue a nota atualizada, já com o caminho exato do arquivo, pronta pra enviar:

Assunto: Falha crítica no script de entrypoint da imagem – SIAVL-enviomsgativa-microfront (afeta todos os ambientes)

Prezados,

Identificamos a causa raiz da falha de deployment da aplicação siavl-enviomsgativa-microfront, que impede a subida do componente em todos os ambientes (DES, TQS e demais).

O script responsável por realizar as substituições de variáveis e iniciar o nginx no container, localizado no repositório em .s2i/bin/run (branch feature/STRY00014921), contém um erro de sintaxe em sua última linha:

exec nginx -g "daemon off;*

O caractere de fechamento da aspa dupla foi substituído por um asterisco (*), impedindo o fechamento correto da string. Como consequência, o shell interpreta o script como incompleto (erro: unexpected EOF while looking for matching '"'), o comando nginx nunca é executado, o processo do container não inicia, o readiness probe falha indefinidamente e o rollout do DeploymentConfig é revertido após o tempo limite de 600 segundos.

Esse comportamento foi validado diretamente na imagem publicada em produtos4 (build-images-ads/siavl-enviomsgativa-microfront:1.0.0-SNAPSHOT), por meio de execução isolada do container, e ocorre independentemente das variáveis de ambiente configuradas (AMBIENTE, CERT_REQUIRED), o que explica a falha consistente em todos os ambientes.

Solicitamos a correção do arquivo .s2i/bin/run na origem, restaurando a linha final para:

exec nginx -g "daemon off;"

Após a correção e nova geração da imagem
