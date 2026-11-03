Adriano, o 10.116.208.104 é o nó ceadecldlx084.nprd.caixa do cluster OpenShift NPRD (IP do host). É nesse nó que o pod do sipdm-api-estudante está rodando, e também é ele que hospeda o egress IP 10.116.221.183.

Então, pela captura, o tráfego do pod está saindo com o IP do nó (10.116.208.104) e não com o egress IP (10.116.221.183), por isso a regra não está sendo usada. Só para confirmar: durante o teste das 15:10, os SYNs para 10.116.100.127:1433 apareceram apenas com origem 10.116.208.104 e sem SYN-ACK de retorno, certo?

Vou fazer um teste movendo o pod para outro nó do cluster, para confirmar se o comportamento acontece só quando o pod roda no mesmo nó do egress IP.


   oc delete pod sipdm-api-estudante-des-266-qlttf -n sipdm-des
   oc get pod -n sipdm-des -o wide | grep estudante


   
