Jesse Mouta Pereira Batista  Boa tarde
 
referente a resposta: 
 
2/7/2026 19:57:55 ;  (P585600)
À CAIXA,

Prezados,

Realizamos a análise técnica do ambiente sisme-vm (DES) referente à divergência de versão relatada.

Verificação realizada diretamente no servidor JBoss (/opt/jboss-eap/standalone/deployments/), inspecionando o conteúdo do artefato sisme-ear.ear efetivamente deployado.

Constatou-se que o ambiente processa corretamente cada deploy recebido, sem qualquer falha de infraestrutura, DNS, VIP ou proxy Nginx.

A divergência de versão ocorreu porque a release SISME-363 (branch branch-from-2.93.2.0, versão 2.93.2.0-SNAPSHOT) foi executada após a release SISME-362 (versão 2.93.3.0), sobrescrevendo no ambiente DES o artefato mais recente pelo artefato de uma branch anterior.

Para confirmação, foi realizado teste controlado: após deploy da versão 2.93.3.0, o artefato no servidor apresentou os módulos sisme-web-2.93.3.0.war, sisme-api-2.93.3.0.jar e sisme-ejb-2.93.3.0.jar. 

Em seguida, redeploy da release SISME-363 (2.93.2.0) foi executado, e o artefato no servidor passou a apresentar sisme-web-2.93.2.0.war, sisme-api-2.93.2.0.jar e sisme-ejb-2.93.2.0.jar, replicando exatamente o comportamento relatado.

Conclusão: não há problema de ambiente, rede ou infraestrutura. A causa foi a execução de releases em ordem não esperada, com uma branch anterior sendo deployada por cima de uma versão mais recente.


Recomendação: antes de validar uma entrega em DES, confirmar qual release está ativa no momento (aba Releases do pipeline SISME no Azure DevOps) e evitar redeploy de branches antigas sobre versões já validadas, para não gerar inconsistência de versão durante
 a sprint.

Segue evidencia em anexo do log no jboss

Encaminhamos como concluída, sem ação pendente por parte da equipe de esteiras DevOps.

Atenciosamente,

Jessé Mouta Pereira Batista

Analista

CTIS / CESTI Esteira DEVOPS DES TQS NPRD


sisme 1.png


sisme2.png
 
 
 
Status da Solicitação	Concluído (Bem-sucedido) 
ID: 	REQ000144756066
 
 
estou reabrindo
 
 
Jesse Mouta, a intenção é abrir uma chamada de video aqui, e junto com o desenvolvedor acompanhar o deploy de uma versão junto com o dev. E ai saber o erro, problema que acontece, seja no momento do deploy ou no ambiente.
 
