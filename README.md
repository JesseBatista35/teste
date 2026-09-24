Sobre a primeira pergunta, foi o login gerado pela própria sessão no ambiente de TQS
 
A segunda preciso verificar
 
TQS e DES compartilham do mesmo cliente, pelo que entendi vendo as libraries do front no Devops. Tanto que o login está funcional em ambos os ambientes usando o mesmo Client_ID. 
 
Eu não tenho acesso ao Entra ID para ser 100% assertivo em relação a isso. Você tem alguma orientação em relação a isso?
 
Esse erro é como se ele tivesse validando no ambiente errado. 
Jesse Mouta Pereira Batista
estou em outra sala aqui. mais dei uma olhada no 401 do papel em TQS: encontrei no log o erro IDX10214: Audience validation failed, ou seja, o token que está sendo enviado tem uma audience que não b…
 
