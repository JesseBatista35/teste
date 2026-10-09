Funcionou porque havia três camadas de problema, e cada correção destravou uma delas.

1. Como a secret chega na aplicação

O fluxo normal tem quatro passos:

O secrets-agent (init container) autentica no BeyondTrust, lê os secrets do BT_SECRETS_LIST e grava cada um como arquivo em /usr/src/app/secrets_files/SIINP_DES/. O nome do arquivo é o nome exato do secret no cofre, ex: SINPBD01_ORACLE.
A variável SMALLRYE_CONFIG_SOURCE_FILE_LOCATIONS diz ao Quarkus para ler esse diretório.
A dependência smallrye-config-source-file-system transforma cada arquivo numa propriedade de config: nome do arquivo vira a chave, conteúdo vira o valor.
As env vars da Library usam placeholders como ${SINPBD01_ORACLE}, e o Quarkus resolve na hora buscando a chave com esse nome.

2. Onde quebrava

Problema	Efeito
_ENV.SECURITY_CRYPTO_KEY = ${SECURITY_CRYPTO_KEY}	O Quarkus consulta as fontes por prioridade: env var (300) antes de arquivo (100). Ao buscar SECURITY_CRYPTO_KEY, achava a env var, que mandava buscar SECURITY_CRYPTO_KEY, que achava a env var de novo. Entrava em loop e o boot morria. Foi isso que derrubou a 314 e a 315.
Placeholders em minúsculo (${sinpbd01_oracle})	Os arquivos estão em maiúsculo e a busca diferencia maiúsculas de minúsculas, então nunca encontrava. Não derrubava o boot porque Oracle e Redis só usam a senha na primeira conexão, mas iria estourar depois.
Override manual na 313	Escondia tudo isso: a chave estava em texto aberto e a variável setada na mão, então a leitura do cofre nem era necessária para o pod subir.

3. O que cada correção fez

Remover _ENV.SECURITY_CRYPTO_KEY: sem a env var, a única fonte dessa chave passou a ser o arquivo do cofre. Acabou o loop. Foi essa a correção que fez o pod subir.
Placeholders em maiúsculo: agora ${SINPBD01_ORACLE}, ${REDIS_PASSWORD} etc. batem com os nomes dos arquivos, e as senhas são resolvidas de verdade.
Leitura do diretório pelo file-system source: o fato de a 316 ter subido sem a env var é a prova de que ela funciona. Se não estivesse funcionando, o SECURITY_CRYPTO_KEY simplesmente não existiria e o erro seria “property not found”.

Regra para levar para os outros sistemas com BeyondTrust em Quarkus

O placeholder deve ser o nome exato do secret no cofre, respeitando maiúsculas.
Se o código lê a chave com o mesmo nome do secret, não crie env var: o arquivo já entrega a propriedade.
Nunca use NOME=${NOME}.

Vale passar isso para o Lucas e o time do SIINP antes de replicarem a migração em DES2, TQS e TQS2.
