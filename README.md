Cleomar, entendo a confusão, vou tentar resumir de forma direta:

A regra não foi criada para o IP errado. O 10.116.221.183 é o IP de saída configurado para o namespace do SIPDM no OpenShift, e a regra para ele está correta e funcionando.

O que a captura do Adriano mostrou é que, na prática, o tráfego do pod não está saindo com esse IP, e sim com o 10.116.208.104, que é o IP do servidor (nó) onde o pod está rodando. Esse IP não tem regra, por isso não funciona.

Ou seja, o problema não é a regra, é o IP com que o tráfego está saindo. Tenho duas formas de resolver:

Mover o pod para outro nó do cluster. Nesse caso, o tráfego deve sair corretamente pelo 10.116.221.183 e usar a regra que já existe. Leva poucos minutos e não precisa de nova CHG. Posso fazer assim que sair do ADDR?
Se não funcionar, abro regra para o 10.116.208.104 como paliativo e aciono o time de OpenShift para a correção definitiva.
