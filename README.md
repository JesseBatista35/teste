Olá, pessoal!

Durante a criação do repositório siagf-backend-clerk-transaction-raw via template FusionX, o script de criação retornou erro (GithubResponseError). O repositório acabou sendo criado normalmente no GitHub, mas o processo não finalizou corretamente o vínculo do componente no catálogo, deixando o owner incorreto.

Identificamos no catalog-info.yaml (raiz do repositório) que o campo está configurado como:

yaml
spec:
  owner: group:default/g_az_idp_suporte

O correto seria:

yaml
spec:
  owner: group:default/g_az_box_beopf

Poderiam ajustar esse campo e commitar a correção? Isso deve fazer o componente ser reconhecido corretamente pelo catálogo do FusionX dentro do grupo BEOPF.

Aproveitando, também identificamos que spec.type está como service. Caso a intenção seja que esse componente apareça como API no catálogo, esse campo também precisaria ser revisto para type: api — fica a critério de vocês, conforme a natureza real do componente.

Qualquer dúvida, seguimos à disposição.
