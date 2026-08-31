essa é com os ip's da aplicação que passaram
 
antes tinha feito regra só até o balanceador
 
Adriano Vale de Oliveira adicionou Elza Oliveira Leao ao chat e compartilhou todo o histórico de chats.

 
Bom dia Elza. tudo bem? você pode incluir o analista que está atendendo a REQ000145554756 aqui nesta sala para apoiar a equipe.
 
 
Adriano Vale de Oliveira
📷
estamos com erro 503 agorq
 
agora*
 
Adriano Vale de Oliveira
Bom dia Elza. tudo bem? você pode incluir o analista que está atendendo a REQ000145554756 aqui nesta sala para apoiar a equipe.
Elza Oliveira Leao
 
tem que avaliar então Adriano, consegue o log lá no openshift do porque o 503? é o servidor da aplicação respondendo?
 
Mateus Barreto Nobrega de Lucena
tem que avaliar então Adriano, consegue o log lá no openshift do porque o 503? é o servidor da aplicação respondendo?
Eu vou tentar os log's
 
Mateus Barreto Nobrega de Lucena
tem que avaliar então Adriano, consegue o log lá no openshift do porque o 503? é o servidor da aplicação respondendo?
Mateus não chegou nada no serviços que estão no OKD4
 
 
é esse aqui?
 
se for, tá chegando na aplicação, será que a URL tá incorreta lá no back?
 
pq aí já superou a questão de regra de rede
 
rapaz, corrigindo, quem tá retornando 503 é o backend do sigaq
 
nem sei se ele tentou chamar o backend lá no openshift
 
só acessando os logs
 
https://sigaq.des.caixa/conteudo/consulta-documental-legado
qualquer CPF desse:
11782091807
 
14725836982
 
8745032807
 
22501478258

319577813
Mateus Barreto
 
mas aí é qualquer consulta vai dá errado
 
o backend do sigaq que tá respondendo 503, tem que olhar se tá com algum problema no ambiente
 
ou se tá com alguma versão inválida
 
tipo
 
essa URL tá certa mesmo para chamadas?
 
 
não tinha que ter um /conteúdo n?
 
aqui deu bom quando ajeito a URL de chamada:
 
 
tem que ajeitar a URL lá no front
 
Adriano Vale de Oliveira continua tomando timeout, eu imagino:
 
 
Elza Oliveira Leao teria como ter um analista para ver se solicitamos as regras para os ip's corretos?Precisamos confirmar o IP de saída do SIGAQ que tá no Ambiente da Azure


<img width="800" height="182" alt="image" src="https://github.com/user-attachments/assets/c1e75a0f-caeb-4e2c-93a3-ac531621a3dc" />



<img width="1299" height="846" alt="image" src="https://github.com/user-attachments/assets/ba84015e-5206-450e-b093-cb8d64f3b68f" />


 <img width="603" height="44" alt="image" src="https://github.com/user-attachments/assets/650ec2fb-9c80-4acb-bf9c-910bcf4f464b" />




<img width="1455" height="930" alt="image" src="https://github.com/user-attachments/assets/275aebcf-ebfa-4217-872e-2003e2ed0dca" />


