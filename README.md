Patricia Vourakis Barbosa Braga adicionou Jesse Mouta Pereira Batista ao chat.

 
REQ000146887827
 
https://sigecpor2.des.caixa/ (online)
https://sigec.des.caixa/ (batch)
 
Já volto
 
Ontem 17:20 Reunião encerrada 57min 25s [ADDR] SIGEC APACHEquinta-feira, 5 de novembro de 2026 16:23 - 17:20Exibir recapitulação1ConteúdoTranscrição

 
Eliza Tiburcio Borges Marques
Bom dia! Obrigada! Já evoluímos com as configurações Marcela? Onde estávamos em relação ao ambiente PRD?
Eliza Tiburcio Borges Marques ainda estamos configurando os servidores do SIGEC PRD, como o ambiente é mais complexo, temos enfrentado alguns imprevistos e por isso ainda não terminamos, mas assim que estiverem prontos, partiremos para a configuração das redes. Avisaremos aqui a conclusão da configuração 
 
PSC Elisabeth da Silva
 
Todos, Bom dia Pessoal.
 
Estamos com o SIGEC Portabilidade batch indisponível. Isso ocorreu depois da alteração de ontem.
 
Conseguem verificar, por favor.
 
Jander Ricardo Garcia Marques
Estamos com o SIGEC Portabilidade batch indisponível. Isso ocorreu depois da alteração de ontem.
Bom dia Patricia Vourakis Barbosa Braga
Pode verificar por gentileza? Obrigado
 
Segue o log atual do batch:
 
Iniciado pelo usuário s535501
Construindo no workspace /opt/integracao_continua/jenkins_home/workspace/SIGEC-LOG
[WS-CLEANUP] Deleting project workspace...
[WS-CLEANUP] Deferred wipeout is used...
[WS-CLEANUP] Done
[SIGEC-LOG] $ /bin/sh -xe /tmp/jenkins3780768057342354304.sh
+ /opt/integracao_continua/work/jenkins_script_steps/step_print_log.sh
DES
EAP7
Procurando Logs do sigec-portabilidade-batch...
Log instancia sigec-portabilidade-batch_node1_lx104:
Failed to get the list of the operation properties: "WFLYHC0153: Canal encerrado"
Finished: SUCCESS
 
Fabio Pereira Siqueira
 
Patricia Vourakis Barbosa Braga adicionou Thiago Jeferson de Sousa Silva ao chat e compartilhou todo o histórico de chats.

 
Importante!
Bruno Aparecido Marques
Segue o log atual do batch:     Iniciado pelo usuário s535501 Construindo no workspace /opt/integracao_continua/jenkins_home/workspace/SIGEC-LOG [WS-CLEANUP] Deleting project workspace... [WS-CLEANUP…
Jesse Mouta Pereira Batista e Thiago Jeferson de Sousa Silva bom dia , por favor verificar. Obrigada 
Flavio de Almeida Gagliardi pc
 
Importante!
Jander Ricardo Garcia Marques
Estamos com o SIGEC Portabilidade batch indisponível. Isso ocorreu depois da alteração de ontem.
 
Bom dia.
Não identificamos alterações realizadas no ambiente de aplicação do SIGEC Portabilidade Batch, tampouco nos servidores de apresentação (Apache), que possam ser correlacionadas diretamente com a indisponibilidade reportada.
A atuação realizada ontem ocorreu de forma pontual no servidor caddeapllx2794, com o objetivo exclusivo de validar as configurações de ProxyPass e ProxyPassReverse, visando a reintegração do servidor ao balanceamento de carga. 
Permanecemos acompanhando o caso e à disposição para apoiar na identificação da causa da indisponibilidade.
 
ERRO REPORTADO: " Failed to get the list of the operation properties: "WFLYHC0153: Canal encerrado" "
 
OBS: O erro observado ocorre na camada de gerenciamento do JBoss EAP, não na camada de apresentação.
 
SIGEC restabelecido. Foi identificado que as instâncias não estavam ativas, sendo necessário realizar o restart do Host Controller (HC). Quanto ao reinício das instâncias, o procedimento foi executado após a normalização do HC.
 
Flavio de Almeida Gagliardi Patricia Vourakis Barbosa Braga PC 
 
 
Marcela Gomes da Silva
Eliza Tiburcio Borges Marques ainda estamos configurando os servidores do SIGEC PRD, como o ambiente é mais complexo, temos enfrentado alguns imprevistos e por isso ainda não terminamos, mas assim q…
Obrigada! Se precisar de apoio com as configurações, avisa! Bom trabalho!
 
