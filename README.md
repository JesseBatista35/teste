Pessoal, atualização do SICCR-HUB-FRONTEND (hub-web) no JBoss 7.4, server-group sifec-intranet:

Às 14:55, a versão 1.4.0-b378 foi substituída pela 1.10.0.1-b418, que é a versão da planilha.
O deploy foi concluído sem erros e a configuração de segurança (Keycloak) foi aplicada.
A URL https://migracaosifec.des.caixa/hub-web/ está respondendo e redireciona para o login, como esperado.

Ponto de atenção: as telas do hub-web que consomem o hub-api ainda vão apresentar falha. O backend (hub-api-2.2.0-b809) não subiu por ajuste pendente no código: queries com parâmetro ? sem número, como em ProcessoEnvioContrato.buscar. Assim que a fábrica gerar o build novo do hub-api, fazemos o deploy e o front passa a funcionar por completo.

@Paulo, pode pedir para alguém do HUB validar o acesso ao front?
