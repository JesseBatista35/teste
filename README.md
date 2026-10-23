Commit message:

fix(des): ajusta host do Istio e appName após renomeação do repositório

Extended description:

WO0000082061992 - Após renomeação via FusionX, o Gateway seguia com o host
siplx-api-plataforma-geracao-relatorios.apl.des.private.azure, fazendo o
external-dns criar o registro com o nome antigo e a etapa de publicação no
APIM falhar (DNS não resolvido).

- Adicionado host siplx-plataforma-geracao-relatorios.apl.des.private.azure
  (mantido o host antigo por compatibilidade)
- Ajustado appName no topologySpreadConstraints para o nome atual
