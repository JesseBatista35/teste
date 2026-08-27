Davi, boa!

Sobre o erro: são dois problemas diferentes, já resolvi o primeiro. O "erro de sincronismo" que aparecia no log do pipeline era só uma mensagem genérica do script — o problema real era o toleration do values.yaml apontando pro pool errado (value: "node" em vez de "appsisph"), por isso o pod nem conseguia ser agendado. Isso já corrigi.

Depois dessa correção, o pod passou a subir, mas crasha em CrashLoopBackOff com 'A configuração ApiKey é obrigatória' — esse é o segundo problema, e sim, resolvendo esse a aplicação deve ficar de pé (assumindo que não tem mais nada faltando depois).

Como você confirmou secret: apikey-siopi, vault: kv-hab-des — preciso só que exista um AzureKeyVaultSecret apontando pra esse objeto no namespace do app (o akvs-siopi-backend-construcao-civil-pj.yaml atual é só do certificado TLS do istio-ingress, não serve pra isso). Depois de criado, referencio no values.yaml em secretRefs.env com name: ApiKey e value: <nome-do-akvs>@azurekeyvault.

Sobre o config.yaml (apps/siopi-backend-construcao-civil-pj/des/config.yaml) e aquele outro erro de REQ de outros projetos: não tenho essa informação de acesso do dev nem contexto dessa outra REQ — pode me passar mais detalhes ou o número da REQ pra eu conseguir te ajudar com isso?
