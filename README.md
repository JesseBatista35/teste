Prezado(a),

Identificamos a causa do erro 404 relatado: o link de acesso divulgado no resumo da release apontava apenas para a raiz do domínio (https://simil-precificacao-internet-api-des.apps.nprd.caixa), sem incluir o context path da aplicação (/habitacao/precificacao), configurado via a variável _ENV.SERVER_SERVLET_CONTEXT_PATH.

Constatamos que a task de Resumo da Release não estava concatenando o context path na URL final por ausência da variável CONTEXTO_JBOSS no grupo de variáveis SIMIL-PRECIFICACAO-INTERNET-API-DES, o que fazia o script cair no fluxo sem path. A variável foi criada com o valor /habitacao/precificacao e o resumo da release já está gerando o link correto.

URL de acesso correta e validada:
https://simil-precificacao-internet-api-des.apps.nprd.caixa/habitacao/precificacao/swagger-ui/index.html

Validamos o acesso à aplicação através dessa URL, confirmando que a API está saudável e todos os endpoints documentados estão respondendo normalmente.

Recomendamos que o time de desenvolvimento utilize a URL acima (com o context path) em toda documentação e divulgação de acesso à aplicação.

Atenciosamente,
Esteira DevOps DES TQS NPRD
