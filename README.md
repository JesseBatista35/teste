Prezados,

Dando sequência ao chamado do MFE caixa-sicbp-avaliarisco-mfe: o problema anterior (404 do node-releases no Nexus) foi resolvido do lado da infraestrutura, com o cache do repositório npm-all invalidado.

Identificamos também que a pipeline estava configurada anteriormente com Node 22, versão não suportada pelo Angular 16 do projeto. Já ajustamos a etapa de instalação para Node 16, compatível com o Angular utilizado.

Na etapa de build, surgiu um novo erro, desta vez de dependência do projeto e não de infraestrutura: o pacote sidsc-components (versão 16.6.1) tenta importar o inputmask através do caminho ./dist/inputmask.es6.js, mas esse caminho não está declarado no campo exports da versão do inputmask atualmente instalada (^5.0.9-beta.62). Isso indica incompatibilidade entre a versão do inputmask e a versão esperada pelo sidsc-components.

Solicitamos que o time de desenvolvimento verifique qual versão de inputmask é compatível com o sidsc-components 16.6.1, fixe essa versão via overrides no package.json, da mesma forma que foi feito com o node-releases, ou avalie atualizar o sidsc-components para uma versão que já resolva essa dependência. Depois, regenerar o package-lock.json localmente e commitar.

Reforçamos que esse novo erro não é da pipeline nem do Nexus, é compatibilidade de dependências no código do projeto.

Ficamos à disposição para reexecutar a pipeline assim que ajustado.

Atenciosamente,
Jessé Batista
CTIS/CESTI — Esteira DevOps DES TQS NPRD
