Pablo, aprofundando no 401 do papel em TQS: encontrei no log o erro IDX10214: Audience validation failed, ou seja, o token que está sendo enviado tem uma audience que não bate com o que a API espera.

Uma dúvida pra fechar isso: o token Bearer que você usou pra testar no TQS foi gerado direto ali, pelo Swagger/login do próprio ambiente TQS, ou foi o mesmo token que você já tinha usado antes pra testar no DES?

Também ajudaria saber: existe um App Registration separado no Azure AD específico pra TQS, ou é o mesmo Client ID/App usado em DES e PRD?
