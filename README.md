A chave é a mesma para TQS, HMP, PILOTO e PRD, ou muda por ambiente? Na Unico a chave costuma ser vinculada ao pacote do app (applicationId). Se o build Dev usar um applicationIdSuffix diferente do de produção, pode precisar de outra chave.
Qual nome de propriedade o dev quer usar? Abaixo uso unicoSdkKey. Combine o nome com ele.
