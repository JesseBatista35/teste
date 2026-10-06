Boa tarde, apanhei bastante, mas descobri o problema
 
Na validação via linha de comando precisamos a mexer nos parâmetros do curlm pois estávamos recebendo HTTP 400:
DE: -d "grant_type=client_credentials&client_id=$clientid&client_secret=$clientsecret"
PARA: --data-urlencode "grant_type=client_credentials" --data-urlencode "client_id=${clientid}" --data-urlencode "client_secret=${clientsecret}"
 
Adotei a ação de atualizar e depois instalar do zero baseado em experiência anterior, onde update/upgrade trás lixo de versões anteriores, e parti para a instalação do zero por conta desse artigo: https://community.bmc.com/s/article/Control-M-Application-Integrator-REST-job-performing-POST-incorrectly-sends-empty-body-causing-the-job-to-fail-with-an-HTTP-400-response (CTM-3795 has been created to address this issue and is implemented in Control-M Application Integrator 9.0.20.100.  Install the latest available version to address this issue.)
 
Como eu já tinha feito e refeito diversas vezes vários procedimentos, leitura de logs com debug e etc, questionei a IA sobre a diferença entre -d "..." e --data-urlencode "..." no curl.
 
A resposta foi voltada a explicar a conversão de caracretes em códigos hexadecimais, pedi a tabela completa e ajustei o clientid e secret, ficou assim:
ClientID ANTES: 098c4f49-efa5-4042-b19f-8a8b5afc79d2
ClientID DEPOIS: 098c4f49%2Defa5%2D4042%2Db19f%2D8a8b5afc79d2
 
Fiz o mesmo com o Secret, que tinha o caractere "+" e "=" e converti para "%2B" e "%3D" 


anteriomente ja tinahda dando desse problema e o lucas claver serovel assim na osei se vale se esta no mesmo contexto
