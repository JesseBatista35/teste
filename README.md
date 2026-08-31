Subject: Solicitação de regra de firewall - egress login.microsoftonline.com - SIPGC DES/NPRD

Prezados, equipe CETEL / Rede Data Center,

Solicito a criação de regra de firewall para liberar o tráfego de saída (egress) do ambiente OKD DES/NPRD do sistema SIPGC em direção ao serviço de autenticação Azure AD (login.microsoftonline.com), na porta 443/TCP.

Contexto do problema:
O front-end SIPGC (https://sipgc-front-des.apps.nprd.caixa) está retornando erro 504 ao chamar o microserviço sipgc-api-agrupamento-des, hospedado em pod OKD. A chamada direta pelo navegador funciona normalmente, mas a chamada feita pelo pod falha. Diagnóstico realizado dentro do próprio pod (via oc rsh) confirmou que a conexão de saída para o Azure AD trava sem resposta (TCP sem retorno) para o IP 20.190.173.2, indicando bloqueio no firewall, e que não há proxy HTTP/HTTPS configurado nesse ambiente para contornar a restrição.

Destino a ser liberado:
- Hostname: login.microsoftonline.com
- IP observado: 20.190.173.2 (observação: este é apenas um dos IPs do pool dinâmico do serviço Azure AD; se possível, solicito avaliar liberação por FQDN ou pelos ranges oficiais do serviço "AzureActiveDirectory" publicados pela Microsoft, para evitar recorrência do problema quando o DNS resolver para outro IP)
- Porta/Protocolo: 443/TCP

Origem: [informar IP/hostname/máscara da rede do pod/node OKD do namespace DES/NPRD]

Sistema/Serviço: SIPGC NPRD
Ambiente: DES
Chamado relacionado: REQ000095661629

Fico à disposição para qualquer esclarecimento adicional.

Atenciosamente,
Jessé Mouta Pereira Batista
Matrícula P585600 - CESTI
Contatos: F540797 / F556565 (Teams)
