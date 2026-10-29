Obrigado pelo retorno, pessoal. Só complementando para o registro técnico:

A causa raiz do 401 no passo “Obter credencial” é que o plugin do Application Integrator não captura nem reenvia o cookie de sessão ASP.NET_SessionId, que o BeyondTrust retorna na chamada de token. Isso foi confirmado pelo teste do Pedro no Postman e por testes com curl direto no agente caddeapllx2695. Por isso a solução foi tirar a autenticação dos passos REST do AI e fazê-la via script (curl com cookie jar), que é a versão que ficou em /producao.

Sobre os pontos de segurança, concordo e sugiro:

Certificado: substituir o -k do curl por --cacert apontando para a cadeia AC Interna da Caixa (a AC Interna APL já está disponível no agente), mantendo a validação TLS.
Secret: retirar o client_secret em texto puro da configuração do AI e usar o mecanismo de credencial protegida do Control-M/AI (campo de senha do Connection Profile ou parâmetro criptografado), passando o valor ao script sem expô-lo em log.

Como o script está versionado no repositório do projeto e a credencial fica na configuração do job type, os ajustes devem ser feitos pelo time responsável pela aplicação/job. Fico à disposição para apoiar, principalmente na parte de certificado no agente.
