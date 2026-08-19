Diagnóstico e Resolução — Falha de Build SISAM-frontend (Pipeline SISAM-frontend)

Resumo: A pipeline de build do SISAM-frontend apresentava falha recorrente na etapa Build Application, com o erro genérico do compilador Angular/TypeScript Cannot destructure property 'pos' of 'file.referencedFiles[index]' as it is undefined. Após investigação, foram identificadas duas causas raiz distintas, corrigidas na branch de teste Cesti_test001, com validação de build bem-sucedida.

Causa raiz nº 1 — Arquivo duplicado por conflito de case-sensitivity

Identificados dois arquivos com conteúdo idêntico (mesmo MD5) na pasta src/app/model/endomarketing/:

categoria.model.ts (minúsculo)
Categoria.model.ts (maiúsculo)

Nenhum dos dois é referenciado por import em qualquer ponto do código-fonte — ambos são incluídos apenas pelo padrão include: ["src/**/*.ts"] do tsconfig.app.json. Esse tipo de duplicidade passa despercebido em ambientes de desenvolvimento Windows/Mac (sistemas de arquivo case-insensitive, onde os dois nomes colapsam), mas quebra o build em agentes Linux (case-sensitive, como o agente da esteira), pois o TypeScript trata como dois arquivos reais em conflito de nome (erro TS1149).

Correção aplicada: remoção do arquivo duplicado Categoria.model.ts, mantendo categoria.model.ts (padrão de nomenclatura já usado no restante do projeto).

Causa raiz nº 2 — Pasta .s2i/bin ausente

Após a correção acima, o build avançou até a etapa Corrigindo Codificação Arquivos dos2unix, que falhou por ausência da pasta .s2i/bin no repositório (scripts assemble e run, obrigatórios para o build de imagem Docker/S2I).

Observação: essa pasta provavelmente foi perdida no commit 58584223 ("Recriado projeto baseado na cópia do projeto presente na branch do projeto do..."), que reestruturou partes do repositório.

Contorno aplicado (branch de teste): cópia da pasta .s2i/bin do repositório irmão sisam-frontend-patrocinio, que utiliza a mesma imagem base (nginx) e possui scripts equivalentes.

Resultado: build completo executado com sucesso na branch Cesti_test001 (run 1.0.0.0-SNAPSHOT), passando por todas as etapas incluindo Build Application, Zip dist e demais tasks subsequentes.

Ação necessária — Time de Desenvolvimento

As correções acima foram aplicadas apenas na branch de teste Cesti_test001, usada para diagnóstico da esteira. É necessário que o time de desenvolvimento aplique as mesmas alterações na branch de trabalho atual do projeto:

Remover o arquivo duplicado src/app/model/endomarketing/Categoria.model.ts.
Restaurar/recriar a pasta .s2i/bin (scripts assemble e run) no repositório principal, validando o conteúdo copiado do sisam-frontend-patrocinio ou recriando conforme padrão documentado na wiki de pipelines Angular.
Validar, após aplicar, se a variável version.app da pipeline segue padrão semver de 3 números (ex.: 1.0.0-snapshot) — foi identificado durante a investigação que ela estava configurada como 1.0.0.0-snapshot (4 números), o que não é a causa raiz do problema, mas pode gerar inconsistências futuras.
