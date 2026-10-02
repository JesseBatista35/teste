Prezado Ronaldo,

Agradecemos o detalhamento e as evidências.

Conforme orientação da CESTI36 e da Wiki de DevOps ("Configuração do Application Insights no JBoss (VM e Container)"), o Application Insights não deve ser configurado no ambiente TQS. A Wiki explica o motivo: como o volume de dados enviados à nuvem impacta diretamente no custo da ferramenta, o procedimento adotado é validar as configurações apenas em DES e, depois que os parâmetros de análise estiverem ajustados, seguir direto para PRD.

Por isso, não daremos andamento à liberação de comunicação do ambiente TQS com os endpoints do Azure (brazilsouth-1.in.applicationinsights.azure.com e brazilsouth.livediagnostics.monitor.azure.com). O bloqueio no proxy (Forefront TMG – 502) é esperado nesse cenário.

Recomendações:

Remover a configuração do agente no TQS: retirar o -javaagent e as variáveis do Application Insights do grupo de variáveis/Release de TQS, e executar uma nova Release.
Concentrar a validação no ambiente DES. Para isso, seguir os requisitos da Wiki: regra de firewall para o proxynuvem.caixa e liberação dos endpoints Azure no proxy.
Depois de validada em DES, a configuração segue para PRD pelo fluxo normal.

Link da Wiki para referência: https://devops.caixa/projetos/Caixa/_wiki/wikis/Caixa.wiki/211/Configuração-do-Application-Insights-no-JBoss-(VM-e-Container)

Diante do exposto, estamos encerrando esta WO. Ficamos à disposição para apoiar na configuração em DES, se necessário.

Atenciosamente,
Jessé Batista – CESTI
