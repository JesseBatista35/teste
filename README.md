Abertura

“Gustavo, bem-vindo de volta! Vou te dar um panorama rápido de como estamos e do que vem pela frente.”

Como estamos

“Hoje o ambiente intranet do SIFEC no 7.4 já está com a maior parte das aplicações no ar: SIFEC, PJ, SICDT, Parâmetros, o front do HUB, MCM, BDCAIXA, CCR, FBN e Minutas. Algumas já foram validadas pelos devs, e o resto está em validação com os times.”

“O SIEMP também está publicado pela esteira nova e já abre pelo siemp.des.caixa. Tinha uma intermitência porque o DNS ficou com o IP antigo junto com o novo. Já abrimos a REQ para tirar o antigo.”

O que a gente resolveu do nosso lado

“Na parte de ambiente, ajustamos tudo o que apareceu: truststore, SSO, cofre de senhas, propriedades das aplicações e alguns bancos que estavam com credencial ou endereço diferente do 6.4. Pelo lado da DevOps, não temos pendência travando nenhum deploy hoje.”

O que depende da fábrica

“O que está parado hoje é código. O LCR e o SIRUR já tiveram builds novos, mas ainda caem por ajustes de CDI e de JPA. Já passamos o diagnóstico detalhado para os devs. O hub-api precisa ajustar umas queries, e RURAL, EMP e EMPRESAS estão com o time do SIEMP.”

O que estamos investigando

“Tem um ponto em aberto no CCR: uma chamada do consignado dá 401 no 7.4 e no 6.4 funciona. A configuração está igual nos dois, então estou olhando a infraestrutura em volta. Devo ter retorno hoje.”

Próximos passos

“A ordem que combinamos com o Paulo e o Rodrigo é: primeiro o LCR, depois o SIRUR, depois fechar o CCR. Assim que os builds chegarem, a gente sobe na hora. Depois disso, seguimos com o restante da planilha do sifec-intra e, em seguida, com os outros ambientes: internet, inter-SSO e API.”

Fechamento

“Basicamente é isso. Do nosso lado o ambiente está pronto, e o ritmo agora depende dos builds da fábrica. Quer que eu detalhe algum ponto?”
