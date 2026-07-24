Prezados,

Durante a execução do pipeline de build do projeto SICED-frontend (branch/tag Cesti-teste), identificamos uma falha recorrente na etapa de "npm install" que impede a conclusão da compilação da aplicação.

Causa raiz identificada:

A dependência jspdf, na versão fixada em package.json (^1.5.3), referencia internamente o pacote file-saver através de uma URL Git via protocolo SSH (github:eligrey/FileSaver.js#1.3.8). Os agentes de build da esteira DevOps não possuem liberação de rede para acesso à porta 22 (SSH) do domínio github.com, resultando em timeout de conexão e interrupção total da instalação de dependências (nenhum pacote é instalado quando isso ocorre).

Adicionalmente, verificamos que o arquivo package-lock.json do repositório está posicionado na raiz do projeto, e não dentro da pasta web/, onde efetivamente reside o package.json da aplicação Angular. Verificamos também que o conteúdo desse arquivo está vazio, contendo apenas a estrutura mínima ({"lockfileVersion": 1}), sem qualquer resolução de dependências. Dessa forma, mesmo que estivesse no diretório correto, ele não cumpriria sua função de fixar versões e evitar resoluções via Git.

Solicitação:

Considerando que ambos os pontos envolvem definição de dependências e arquivos de controle de versão do código-fonte da aplicação (fora do escopo de configuração de pipeline/esteira), solicitamos que o time de desenvolvimento avalie e execute uma das seguintes ações:

Atualizar a dependência jspdf para uma versão que não referencie file-saver via Git/SSH (a partir da versão 2.x, o pacote passa a utilizar uma implementação própria ou referência via npm registry padrão); ou
Caso a atualização de major version não seja viável no momento, fixar explicitamente a dependência file-saver em uma versão publicada no repositório npm (ex.: "file-saver": "^1.3.8"), eliminando a referência Git.

Em ambos os casos, é necessário gerar corretamente o arquivo package-lock.json dentro da pasta web/ (executando npm install localmente no ambiente de desenvolvimento) e versioná-lo no repositório, garantindo que as dependências sejam resolvidas de forma determinística e compatível com o ambiente restrito de rede dos agentes de build.
