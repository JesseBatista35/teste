Pessoal, atualização do SICCR-PARAMETROS no JBoss 7.4 (sifec-intranet):

Implantado com sucesso às 11:56. O pacote da console é o sifec-ccr-parametros.ear, que identificamos como a versão 3.3.1.1. No 6.4 DES está a 3.2.0.1.
/ccr-parametros-api/ respondendo 200.
/ccr-parametros-web/ retorna 404 na raiz do contexto, inclusive direto no servidor. Não é bloqueio de ambiente: o módulo não tem página na raiz.

@João Pedro, pode confirmar se a 3.3.1.1 é a versão correta e passar a rota do parametros-web para validarmos o front?

Ponto de atenção no código: as classes ConcessaoResourceV2, ConcessaoResourceV3 e ConcessaoResourceV3Simulacao não foram registradas como bean CDI (WELD-000167: @RequestScoped sem construtor adequado). Se os endpoints de concessão falharem, o ajuste é incluir um construtor sem argumentos nessas classes.
