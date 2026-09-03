Pablo Messias Rodrigues dos Santos
Eu tentei indicar pelas rotas que se tratavam de serviços diferentes.  No caso, só essa solicitação do tipo proxy vai ser o suficiente para os outros serviços também ou apenas para sipgc-api-agrupam…
Pablo Messias Rodrigues dos Santos, boa tarde, Sim, é o mesmo namespace sipgc-des para os três serviços — todos saem pelo mesmo EgressIP (10.116.222.85). 
A liberação de proxy (REQ000145689716) foi feita por origem/destino (IP do namespace -> login.microsoftonline.com), não por aplicação específica, então essa única solicitação deve cobrir sipgc-api-agrupamento-des, sipgc-api-papel-des e sipgc-api-membros-des. 
 
Certo! Obrigado pelo esclarecimento, Jesse 🤝 E perdão pelas requisições repetidas. Acreditava que deveria abrir uma por serviço e quis adiantar para ganharmos tempo 
 
Pablo Messias Rodrigues dos Santos
Certo! Obrigado pelo esclarecimento, Jesse 🤝 E perdão pelas requisições repetidas. Acreditava que deveria abrir uma por serviço e quis adiantar para ganharmos tempo
tudo bem, sem problemas. estamos a disposição. 
 
Senhores, para continuidade amanhã.
 
 
Atualizações:

As regras de firewall foram avaliadas e negadas.
Acredito que o acesso direto a URL está impedido, dai usaríamos o proxy que foi o pedido feito na REQ000145689716, seria isso?

Em tempo a REQ000145689716 está com a seguinte resposta:
Prezados,
Em consulta a URL, foi encontrada em uma blocklist no virustotal. Dessa forma, solicito averiguação a fim de liberação da mesma.
Segue em anexo evidências.
 
Peço auxilio para verificarmos se há necessidade de interagirmos com a CEPRO para alguma avaliação adicional ou liberação de acessos. Obrigado.
 
Bom dia,
Wladimir Vieira de Souza; Pablo Messias Rodrigues dos Santos; Jesse Mouta Pereira Batista
 
Resposta do técnico que atendeu o chamado REQ000145689716:
"...foi encaminhado para a gerência analisar sobre possível liberação "
 
 
Bom dia!
 
Pablo Messias Rodrigues dos Santos adicionou Aaron de Melo Ostroski ao chat e compartilhou todo o histórico de chats.

 
Wladimir Vieira de Souza
Atualizações: As regras de firewall foram avaliadas e negadas. Acredito que o acesso direto a URL está impedido, dai usaríamos o proxy que foi o pedido feito na REQ000145689716, seria isso? Em tempo…
So para deixar claro, acho que nao coloquei na req:
API só valida tokens. Isso significa saída para login.microsoftonline.com:443, em duas URLs:
 
https://login.microsoftonline.com/<tenant-id>/v2.0/.well-known/openid-configuration
https://login.microsoftonline.com/<tenant-id>/discovery/v2.0/keys
 
Na doc da Microsoft, os possiveis ip do AD sao estes:
 
https://learn.microsoft.com/en-us/microsoft-365/enterprise/urls-and-ip-address-ranges 
set ID 56 
20.20.32.0/19
20.190.128.0/18
20.231.128.0/19
40.126.0.0/18
 
Conversei com o colega da CEPRO30 (Marcelo) que pedirá reavaliação. 
 
#Oremos!
 
Show
 
Livia Pereira Oliveira Santos Jesse Mouta Pereira Batista se surgir novidade pela manhã avise-nos, please. Devo chegar depois das 11:00 amanhã. 
 
Bom dia,
Jesse Mouta Pereira Batista, tivemos resposta do chamado:
Sr(a). Usuário(a),

1. Realizada a liberação do acesso conforme solicitado.

2. Favor realizar os testes de validação do acesso considerando as observações abaixo:

a) Se o servidor de origem possuir SO WINDOWS favor configurar o proxy no navegador apontando para PROXYDES.CAIXA na PORTA 80.

b) Se o servidor de origem possuir SO LINUX, configurar as variáveis de ambiente conforme exemplo abaixo:

export http_proxy="http://proxydes.caixa:80"


export https_proxy="http://proxydes.caixa:80"


export ftp_proxy="http://proxydes.caixa:80"


export no_proxy="Inserir as URL/IP que não quer enviar para o proxy. Ex: "*localhost,127.0.0.1,*.caixa"


Atenciosamente.


CETEL08/CETEL960

Para análise técnica:


Wednesday, September 02, 2026 8:45:22 PM CORPCAIXA\a566266 Computer Set [PND - SISDE - IN] modified

WO0000081550859 CAIXA

Computer Set [PND - SISDE - IN] Computers added item [Name {10.116.222.85}, Description {}, IP Address {10.116.222.85}]

Essa configuração temos que abrir chamado ou nós temos liberdade para fazer?
 
no meu caso aqui, uso Windows. Mas, aparentemente, não tenho permissão para configurar o proxy
 
Fica readonly
 
Ou estou tentando configurar de forma errada, o que também é bem possível kkk
 
Livia Pereira Oliveira Santos
Bom dia, Jesse Mouta Pereira Batista, tivemos resposta do chamado:  Sr(a). Usuário(a),  1. Realizada a liberação do acesso conforme solicitado.  2. Favor realizar os testes de validação do acesso con…
Se tiver que alterar parâmetros do projeto na esteira TQS temos perfil pra fazer. Se tive que mexer em parâmetro da esteira do ambiente terá que ser por chamado. 
Tenta mexer Livia , chama o Welington pra ver com o perfil dele.
 
Livia Pereira Oliveira Santos
Bom dia, Jesse Mouta Pereira Batista, tivemos resposta do chamado:  Sr(a). Usuário(a),  1. Realizada a liberação do acesso conforme solicitado.  2. Favor realizar os testes de validação do acesso con…
Pablo , 
Pelo que entendi da demanda a falta de regra era do servidor que hospeda modulo do PGC na esteira comunicar com o Azure EntraID.  
 
No caso, a regra aberta se aplica tanto ao ambiente IDE local do DEV  e aos módulos na stage DES da esteira ?  
  
 
não, Wilson. foi problema de entendimento meu mesmo  Também tive essa interpretação de que é no server olhando com mais calma
 
Livia Pereira Oliveira Santos, bom dia! vou verificar, um momento por favor.




 <img width="483" height="436" alt="image" src="https://github.com/user-attachments/assets/375b8c14-a148-4b9c-bb2b-6a4b01fb46a8" />


 <img width="962" height="769" alt="image" src="https://github.com/user-attachments/assets/6b9d10d2-e723-4f41-bb62-8037f16d5419" />



