Pessoal, atualização da migração do sifec-intranet para o JBoss 7.4 (DES), posição de hoje (11/11) às 17h:

✅ Implantados hoje

SICCR-PARAMETROS: versão 3.3.1.1, confirmada pelo João Pedro. A API está respondendo. O front deve ser validado pelo sifec-web, no menu Serviços > Tributos.
SICCR-HUB-FRONTEND (hub-web): atualizado de 1.4.0 para 1.10.0.1-b418, a versão da planilha. A URL /hub-web/ está respondendo (redireciona para o login).
SIBAN-MCM: 1.0.1.23-b47, versão da planilha, pronto para validação.

🔧 Ajustes de ambiente feitos pela DevOps

Incluídas as propriedades de integração do HUB (SICCR_HUB_WS_*), iguais às do 6.4.
Corrigido o datasource jdbc/SybaseSibanDS, usado pelo SIBAN/MCM. No 7.4 ele apontava para outro banco Sybase (FBNEM1, inacessível) e gerava timeout. Agora aponta para o mesmo banco do 6.4 (EMDB04), com a credencial vigente, e o teste de conexão está OK.
Foram feitos dois restarts do sifec-intranet (16:46 e 16:54) para aplicar os ajustes. Todas as aplicações do grupo voltaram ativas.

⏳ Pendente da fábrica (código)

hub-api 2.2.0: o deploy foi revertido porque a named query ProcessoEnvioContrato.buscar usa parâmetro ? sem número, que o Hibernate do 7.4 não aceita mais. É preciso trocar por ?1 ou por parâmetro nomeado e gerar um build novo. Enquanto isso, as telas do hub-web que dependem da API não funcionam.
SIRUR 3.54.51.28: ajuste no persistence.xml (gerador “gen” duplicado nas unidades fec.pu e fec.rur.pu).
LCR: aguardando o pacote sifec_lcr_1.117.1, que é o da planilha.

📋 Validação
Peço aos responsáveis que validem as aplicações em https://migracaosifec.des.caixa:

PARAMETROS: @João Pedro, pelo menu Serviços > Tributos do sifec-web.
HUB-FRONTEND: quem do HUB pode validar? A validação é pela URL /hub-web/ direto ou por algum menu do sifec-web?
MCM: quem do MCM/SIBAN pode validar?

Próximos da lista: sifec-apx e sifec-arc.

Também solicitei o DNS do siemp.des.caixa apontando para o VIP do SIEMP.
