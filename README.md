1. Qual EgressIP o sispi-des usa, e se o sispx-des mudou de IP recentemente.
O pod 391 subiu há 2 dias, então algo mudou. Um IP trocado explica isso.

bash
oc get netnamespace sispi-des -o jsonpath='{.egressIPs}{"\n"}'
oc get netnamespace sispx-des -o yaml | grep -E 'time:|operation:|manager:'
oc get hostsubnet | grep -E 'NAME|10.116.223'

2. O 10.116.223.11 sai para outros destinos?
Se sair, o problema é só a regra até o cofre. Se não sair para nada, o IP está com problema no nó ou na rede.

bash
oc run teste-egress -n sispx-des --rm -it --restart=Never --image=$IMG \
  --overrides='{"metadata":{"annotations":{"sidecar.istio.io/inject":"false"}}}' \
  --command -- python3 -c '
import socket
for h,p in [("api.des.caixa",8443),("cnpexdadvm01-scan4.extra.caixa.gov.br",1521),("sicsn.caixa",443)]:
    try: socket.create_connection((h,p),8); print(h,p,"OK")
    except Exception as e: print(h,p,"FALHA",e)'
Pedido de regra
Origem: 10.116.223.11 (EgressIP do namespace sispx-des, cluster pixnprd4)
Destino: sicsn.caixa / 10.221.142.2, TCP 443
Referência: o mesmo acesso já funciona a partir do EgressIP do sispi-des (preencha com o IP do teste 1)

Na solicitação que já existe, o destino está escrito "sicns.caixa". Se a regra foi aberta assim, provavelmente não foi aplicada no IP certo. Vale corrigir o nome ou abrir de novo informando o IP.

Se no teste 2 o banco também falhar a partir do sispx-des, coloque a regra 10.116.223.11 → cnpexdadvm01-scan4.extra.caixa.gov.br:1521 no mesmo pedido. Isso explicaria o ORA-17002 do pod 391.

Como o Claude está se saindo nesta sessão?
