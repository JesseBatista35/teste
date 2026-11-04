oc get hostsubnet | grep 10.116.221.183

oc rsh -n sipdm-des sipdm-api-estudante-des-266-5n6s8

timeout 5 bash -c '</dev/tcp/10.116.100.127/1433' && echo OK || echo FALHOU

Fabio, boa tarde! Tudo bem?

Preciso da sua ajuda num caso parecido com o do SIHDG-JBOSS8-TQS (WO0000081857473), em que você trocou o nó responsável pelo egress IP e resolveu.

Namespace: sipdm-des (cluster NPRD)
• Egress IP: 10.116.221.183, hospedado no nó ceadecldlx084.nprd.caixa (10.116.208.104). O netnamespace e o hostsubnet estão corretos.
• A regra de firewall 10.116.221.183 → 10.116.100.127:1433 (SQL Server do PDM) está aplicada e validada pela CETEL.
• A captura da CETEL mostra que o tráfego do pod sai do cluster com origem 10.116.208.104 (IP do nó), e não com o egress IP, e é descartado no firewall (acl-drop).
• Já movi o pod para outro nó (agora no ceadecldlx052) e o comportamento é o mesmo: o tráfego continua saindo pelo 084 com o IP do nó.

Consegue mover o egress IP 10.116.221.183 para outro nó, como no SIHDG? O caso está impactando o Super App e está sendo cobrado diariamente.

Assim que você mover, eu valido o teste a partir do pod e retorno. Obrigado!
