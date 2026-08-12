Criação solicitada por:REQ000095661629 Qual o tipo de serviço?: Ajustar ambiente ou parametrização de software

Qual o tipo de serviço?*:	Ajustar ambiente ou parametrização de software
Informar o Ambiente:*:	DES
Nome do serviço ou sistema:*:	sicmu-intranet-update
Janela de atendimento:*:	12/8/2026 11:18:00
Prazo final da janela de atendimento:*:	12/8/2026 17:00:00
Haverá previsão de indisponibilidade durante a execução do serviço:*:	Não
Contato do responsável pela validação do ambiente após alteração:*:	f664854 ou c048546 ou c093704 no Teams
Descrição da solicitação:*:	Ao suporte,
Solicito apontar o caminho exato onde se encontra o arquivo jconnector.properties dentro do ambiente de desenvolvimento (DevOps - pipeline sicmu-intranet-update) para que esse caminho seja referenciado pela aplicação SICMU.

Atenciosamente,

Marcelo Lucindo de Souza
Consultor de TI - CESOA
Informar formas de contato:*:	f664854 ou c048546 ou c093704 no Teams




Jorge Milis de Almeida Junior bom dia tudo bom?
 
Poderia nos explicar por onde/como você obtém esse log?
 
Patricia Vourakis Barbosa Braga adicionou Jesse Mouta Pereira Batista ao chat e compartilhou todo o histórico de chats.

 
Importante!
Raphael dos Santos Pinto
Jorge Milis de Almeida Junior bom dia tudo bom?   Poderia nos explicar por onde/como você obtém esse log?
Raphael dos Santos Pinto bom dia o turno do Jorge começa apenas as 15:00. Adicionei o Jesse ao chat para que possa auxiliá-lo . 
 
Raphael dos Santos Pinto
Jorge Milis de Almeida Junior bom dia tudo bom?   Poderia nos explicar por onde/como você obtém esse log?
Raphael dos Santos Pinto Bom dia! O log é obtido via bastion, acessando o servidor da aplicação e lendo diretamente o arquivo de log do JBoss.
 
ex:  /logs/jboss/jboss-eap/standalone/sicmu-intranet-update/server.log
 
bom dia, foi feita a alteração sugerida pelo Leandro, porém, continuamos com o mesmo erro
 
 
Erik Ferreira Nunes
bom dia, foi feita a alteração sugerida pelo Leandro, porém, continuamos com o mesmo erro 📷   📷
Bom dia, Leandro Paranhos Carvalho de Souza
******
Pode por gentileza verificar para nós  assim que possível?
 
Erik Ferreira Nunes
bom dia, foi feita a alteração sugerida pelo Leandro, porém, continuamos com o mesmo erro 📷   📷
esse caminho aí não existe no ambiente , vc provavelmente colocou seu path de ambiente local ^^
 
Leandro Paranhos Carvalho de Souza
 
Fala Leandro, conforme apontamento do Mario acima,  está correta a URL que vc passou  "C:/Caixa/infra_app/config/sit/jconnector.properties ??
 
Te agradeço a atenção aqui 
 
Oi Marcelo, boa note, essa URL é local na minha máquina, a configuração de onde fica o arquivo no ambiente de desenvolvimento e com a equipe de multiplataforma.
 
Weverton de Oliveira Silva saiu do chat.

 
Leandro Paranhos Carvalho de Souza
Oi Marcelo, boa note, essa URL é local na minha máquina, a configuração de onde fica o arquivo no ambiente de desenvolvimento e com a equipe de multiplataforma.
Claro, Leandro Paranhos Carvalho de Souza, obrigado pelo retorno, bom dia!
 
Bom dia Marcelo. De nada. Qualquer ajuda so me chamar.
 
Erik Ferreira Nunes
Leandro Paranhos Carvalho de Souza
 
Qual a pergunta exata que precisamos fazer ao suporte multiplataforma?
 
Algo como "favor apontar o caminho exato onde se encontra o arquivo jconnector.properties dentro do ambiente de desenvolvimento (DevOps) para que ese caminho seja referenciado pela aplicação sicmu-intranet-update?".... seria isso?
 
Erik Ferreira Nunes
 
O caminho "
 
/opt/jboss/jboss-eap/standalone/configuration/sicmu_jconnector.properties
 
"
 
está dando erro?.......  ou isso é outra coisa?......
 
bom dia esse caminho esta dando errado
 
Bom  dia
 
Jorge Milis de Almeida Junior
Roger Costa Machado
 
Se alguém aí da CESTI nos puder adiantar o atendimento (por aqui mesmo pode ser) da REQ000145253252:
 
Ao suporte,

Solicito apontar o caminho exato onde se encontra o arquivo jconnector.properties dentro do ambiente de desenvolvimento (DevOps - pipeline sicmu-intranet-update) para que esse caminho seja referenciado pela aplicação SICMU.
 
Grato!
 
