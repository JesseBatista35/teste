Jesse Mouta Pereira Batista
Todos Resolvi o problema de memória aumentamos o limite do pod, e agora a aplicação não está mais reiniciando.   A requisição está chegando corretamente até o CICS agora, passamos da etapa de rede/…
Vou verificar no log aqui ver se apareceu algum erro de segurança para o usuário.
 
Jesse Mouta Pereira Batista adicionou Thiago Jeferson de Sousa Silva ao chat e compartilhou todo o histórico de chats.

 
Saberiam informar se a transação N1Q1 é chamada neste processo?
Pois para o usuário SNSGSQ01 somente essa transação tem erros de racf, se puder gostaria de fazer um CEDX para ver se está chegando no CICS. 
08.55.04 S0150625  ICH408I USER(SNSGSQ01) GROUP(USUSERVQ) NAME(NSGD CICS WEB  

   179               CICTQSSP.N1Q5 CL(TCICSTRN)                               

   179               INSUFFICIENT ACCESS AUTHORITY                            

   179               FROM CICTQSSP.N1%% (G)                                   

   179               ACCESS INTENT(READ   )  ACCESS ALLOWED(NONE   )          

 
