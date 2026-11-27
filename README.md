Gisele, resumindo o que fechamos sobre o acento:

Infra está OK — tudo padronizado em ISO-8859-1 (JVM, Undertow, web.xml, pom.xml). O parser do SIROT já foi resolvido, a aplicação sobe e responde. Não é problema de servidor/esteira.

O que embaralha os acentos: o Jeferson comprovou (rodando file -i dentro do WAR) que 19 arquivos .xhtml estão salvos em UTF-8, mas o resto do projeto espera ISO-8859-1. Aí o Facelets lê errado e embaralha.

A correção é no código: converter esses 19 .xhtml de UTF-8 → ISO-8859-1 no Git (e configurar a IDE pra forçar ISO em .xhtml/.properties). Depois, só revisar no parser da GJ4D / template principal se não tem conversão dupla de charset.
