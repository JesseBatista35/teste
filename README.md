A imagem base (BuildImage) pode ser diferente entre SAC e vivavoz.
Me mostra esse comando:
bashoc get bc sisou-sac-okd-des -n sisou-des -o yaml | grep -A 5 "from:"
E:
bashoc get bc sisou-vivavoz-okd-des -n sisou-des -o yaml | grep -A 5 "from:"
Qual é a imagem base que cada um usa? Se forem diferentes, achamos o culpado.Haiku 4.5 Estendido
