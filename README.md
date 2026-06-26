Olá
Jesse Mouta Pereira Batista  tudo bem ? 
 
Foi identificado que o problema de acesso atualmente, não está ocorrendo em todas as massas utilizadas, ou seja, existe uma massa que o login tem um retorno com sucesso do SSO, mesmo com esse positivo, os serviços de chamadas internos estão com retorno 500 pós login.
 
Então só pra contextualizar:
 - Login do SSO está temporariamente retornando positivo apenas para uma credencial
 - Demais massas utilizadas procedem de erro na autenticação(sem mudanças de desenvolvimento ou implementação realizadas recentemente)
 - Status dos erros durante tentativa de acesso no login procedem de 401 e 302 durante o authorization (o que é estranho porque outro login positivo com uma única massa não recai essa negativa para 401) e que possivelmente impede o redirect corretamente no acesso
 - As massas utilizadas estavam com fluxo ativo até semanas atrás inclusive é de foco das demandas atuantes do desenvolvedores
 
Com isso, minha duvida que fica é, qual time responsável pode nos auxiliar para esse problema ? o sso está impedindo mesmo ou há um problema atual neste serviço para os casos citados ? qual relação poderia orientar-nos para entender a tratativa que está ocorrendo ?
