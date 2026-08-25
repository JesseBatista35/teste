Reabri a REQ, agora como REQ000145534547  com o texto:
 
 
À CESTI, solicitamos analisar o ambiente DevOps (esteira pipeline) associada ao sistema sicmu-intranet-update em DES, pois, ao se tentar acionar qualquer funcionalidade do menu do SICMU, aparece a seguinte msg (ou a tela fica em branco e cai por time-out):
https://sicmu-intranet-update.esteiras.des.caixa/sicmu/
 
** OBS: Esclarecemos que vêm sendo realizados muitos testes, onde não houve duplo clique. 
Em adendo, não concordamos que o fato de o mesmo sintoma (time-out) acontecer em DES e TQS aponte para a aplicação, ao contrário, acreditamos que seja algum detalhe de configuração da pipeline que afeta tanto o ambiente DES quanto o de TQS.
 
Considerando que é necessário descartar a hipótese do duplo clique (porque nossos testes não fazem isso, e o sistema não apresentava esse erro de lock antes da migração para o Terraform... é o mesmo código nas classes da aplicação), solicitamos à CESTI aprofundar as verificações no ambiente DevOps do sicmu-intranet-update a fim de localizar o que poderia estar causando O erro ISPN000299 - contenção de lock no cache de sessões.
Ou esse erro advém do problema apontado no SISGR ou seria de configuração da esteira, ao nosso ver...
 
Grato.
