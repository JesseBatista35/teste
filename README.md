Mensagem para mandar à Patricia e ao Rodrigo (ou para falar na sala):

Rodrigo, Patricia, boa tarde! Estou atuando, sim. Segue o status:

Hibernate/HQL (SICCR-PJ 8.40.0.3-b5719): o deploy no JBoss 7.4 é revertido porque duas named queries do workflow-credito-pj-ejb.jar têm sintaxe que o Hibernate 5.3 do EAP 7.4 rejeita: aparentemente um parêntese ) sobrando no final de cada uma. As queries são SolicitacaoAnalise.listarAnaliseConformidadeAtacadoAbertas e DocumentoSolicitacao.localizarRecebidoPorIdSolicitacao. Precisa de correção no código e de um novo build do sifec-ccr-pj. O apoio necessário é de um dev do PJ para ajustar as queries.

Ambiente: o security-domain jaas-sifec já está criado. Falta a mail session FECMail, e para isso preciso do host e da porta SMTP do ambiente antigo.

SIFEC (Jackson): é outro ponto. Ficou com o Vinicius e o Prokot ontem, para ajustar o jboss-deployment-structure do .ear.

Assim que os novos pacotes estiverem no Nexus, eu faço o deploy.

