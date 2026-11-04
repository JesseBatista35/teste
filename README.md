Pessoal, resolvido! ✅

A causa raiz estava no egress do OpenShift: o nó ceadecldlx084 não aplicava o egress IP 10.116.221.183 do namespace sipdm-des, e o tráfego saía com o IP do próprio nó (10.116.208.104), que era descartado no firewall. O Fabio moveu o egress IP para o nó ceadecldlx085 e a conexão com o banco (10.116.100.127:1433) passou a funcionar. O Bruno validou no Postman com retorno 200.

As regras de firewall (98173 e 98529) estavam corretas e seguem válidas.

Obrigado, Adriano, pelas capturas que permitiram identificar a causa, e ao Fabio pela correção!
