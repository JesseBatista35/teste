O imagestream não está naquele namespace. Procura no namespace da aplicação:
bashoc get imagestream sisgf-backend -n sisgf-des -o yaml
ou
bashoc describe imagestream sisgf-backend -n sisgf-des
Se não encontrar, lista todos:
bashoc get imagestream -n sisgf-des
Cola o resultado.
