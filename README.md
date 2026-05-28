erifica o Secret OKD:
bashoc describe secret sisgf-backend-des -n sisgf-des
ou
bashoc get secret sisgf-backend-des -n sisgf-des -o yaml
O que você vai ver:

Todas as chaves que estão no Secret (tipo API_KEY, DB2_PASSWORD, etc)

O que procurar:

Existe uma chave chamada SISGF_APIKEY?
Ou está como API_KEY?

Cola o resultado. Vou ver qual é a chave real e ajustamos o application.properties para usar a chave correta.
