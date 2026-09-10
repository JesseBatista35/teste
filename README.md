Perfeito, isso explica tudo. O Citrix ADC está com SNAT via IPSET configurado no Service Group do VIP — ou seja, quando a conexão passa do VIP (10.116.180.64) para um dos 4 backends reais do Router (10.116.208.26-29), o IP de origem é reescrito: o IP real da AKS (10.245.153.x) é trocado por um IP do pool IPSET_SNAT (10.116.4.145-158) antes de chegar no backend.

Isso explica por que nossas capturas nos nós do Router nunca mostraram nada da sub-rede 10.245.153.0/24 — não porque a conexão não chegava, mas porque ela chega com outro IP de origem. Não foi falha de rede nem bloqueio: nossa metodologia de captura estava filtrando pelo IP errado.

Vamos refazer o teste agora filtrando pelo pool SNAT correto (10.116.4.144/28), já com a captura rodando. Mateus, pode disparar a chamada de novo quando eu confirmar que estou pronto?
