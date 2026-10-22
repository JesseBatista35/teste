Oi Jesse tudo bem?
 
O Vitor me passou essa mensagem 
 
No Intranet removemos a dependência do deployment externo do SIROT. O sirotcon-ejb agora vem via Maven e é empacotado na aplicação, então não precisamos mais da referência:
 
oi Gisele, tudo bem e com voce?
 
também to bem 
 
Gisele Cristina Dias
No Intranet removemos a dependência do deployment externo do SIROT. O sirotcon-ejb agora vem via Maven e é empacotado na aplicação, então não precisamos mais da referência:
Essa configuração só fazia sentido quando o EJB era disponibilizado pelo servidor. Agora o SIROTConBean é carregado pelo próprio EAR/WAR


 <img width="1364" height="486" alt="image" src="https://github.com/user-attachments/assets/73dd8b79-ce40-4578-9f58-c7b9aca26225" />
