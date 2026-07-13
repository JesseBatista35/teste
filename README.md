Prezados,

Durante a análise de uma falha recorrente de deployment no repositório SIMPI-med (ambiente DES), identificamos, ao inspecionar os artefatos do projeto (pom.xml e application.properties), indícios de inconsistências no código-fonte que fogem ao escopo desta equipe de esteiras/pipeline e requerem avaliação do time de desenvolvimento responsável pela aplicação.

Pontos identificados para verificação:

1. Divergência de nomenclatura entre propriedades: uso simultâneo de "CERT_ASSINATURA_ISSUER_NAME"/"CERT_ASSINATURA_SERIAL_NUMBER" e "CER_ASSINATURA_ISSUER_NAME"/"CER_ASSINATURA_SERIAL_NUMBER" em blocos distintos do mesmo arquivo, o que pode resultar em propriedades não resolvidas em tempo de execução.

2. Múltiplas variáveis com nomes similares referentes à URL de integração com o BACEN ("BACEN_MED_URL", "BACEN_MED_V2_URL" e "BACEN_V2_URL"), sendo que apenas a última é efetivamente referenciada pelo rest-client "bacen-v2". Solicitamos avaliação quanto à real necessidade das demais.

3. Valor da propriedade "MED_KEYSTORE_PASSWORD" definido com aspas simples literais (`'${SIMPI_KSPIX_01}'`), o que pode gerar inclusão indevida dos caracteres de aspas na senha efetiva utilizada no keystore, a depender do tratamento realizado pela aplicação.

4. Coexistência de duas convenções de nomenclatura para configuração do HSM (formato com ponto, ex.: "HSM.HOSTNAME", e formato utilizado de fato pela aplicação via "dict.hsm.hostname"), sugerindo possível resíduo de configuração não utilizada.

5. Estrutura do arquivo application.properties aparentemente contendo blocos duplicados (CORS, OpenAPI, logging, entre outros) com valores distintos, o que pode indicar concatenação indevida de arquivos de configuração de ambientes diferentes.

Solicitamos que o time de desenvolvimento realize uma análise no código-fonte e nos arquivos de configuração do repositório SIMPI-med, a fim de validar se os pontos acima são intencionais ou representam inconsistências a serem corrigidas, evitando impactos em futuras implantações.

Permanecemos à disposição para mais detalhes ou para reprodução do cenário observado.

Atenciosamente,
Jessé Batista
DevOps/Esteiras - CTIS/CESTI
