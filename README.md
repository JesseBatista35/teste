Davi, blz? Tô resolvendo um erro no siopi-backend-construcao-civil-pj (DES) — a aplicação sobe mas crasha porque falta a config 'ApiKey', que deveria vir do Key Vault via akv2k8s.

No values.yaml o secretRefs.env tá comentado, e no akvs-siopi-backend-construcao-civil-pj.yaml o campo vault.name ainda tá com o placeholder <NOME_DO_KEYVAULT>, nunca foi preenchido.

Você sabe qual é o nome real do Key Vault usado pelos apps do squad em DES (tipo o que os outros siopi-* usam)? E se já existe lá dentro um objeto com a ApiKey desse app, ou se precisa criar?

Valeu!
