À equipe de suporte da esteira – A/C Jailson Martins Alves

Prezados,

Encaminhamos esta demanda para a fila de vocês, conforme alinhado em reunião em 07/10/2026 com Flávio Gagliardi, Mário Marinho, Jailson Martins Alves, Jorge Milis e equipe CESTI.

Retificação: desconsiderar o encaminhamento anterior à CEPRO20. O problema não é de credencial expirada nem de gestão de acesso.

Contexto:
Desde 05/10/2026, as releases do modelo antigo Ansible (esteira-jboss-vm) falham no passo "Configurando Stack de Monitoração", na task zabbix : Consultar os dados do sistema, com o erro:
FATAL: password authentication failed for user "monitdbadm"

Causa identificada em reunião:
O ambiente de monitoração no Azure passou a usar FQDN em vez de IP fixo. O modelo Terraform já foi ajustado. O modelo Ansible ainda precisa de adequação, que inclui o usuário monitdbadm, inexistente no Terraform, e deve ser aplicada manualmente em cada agente ADS.

Paliativo aplicado (autorizado por Flávio Gagliardi e Mário Marinho):
Foi habilitado o "Continue on error" na task "Configurando Stack de Monitoração" do task group global. As releases concluem como Partially succeeded, sem impacto no deploy das aplicações.

Sistemas confirmados com o erro: SIRTA (releaseId 537141), SIGPD-backend e SIPQV.

Solicitação:

Correção definitiva da etapa de monitoração no modelo Ansible (esteira-jboss-vm) em todos os agentes.
Após a correção, avisar a CESTI para remover o "Continue on error" do task group.

Conforme orientação do Flávio Gagliardi, a demanda permanece pendente até a correção definitiva.

Atenciosamente,
Jessé Batista – CTIS/CESTI Esteira DevOps DES/TQS NPRD
