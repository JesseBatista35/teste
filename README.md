Assunto: Timeout intermitente na transação CICS BG00 (DES) – SIGCB Intranet

Prezados,

Estamos tratando um erro de “Read timed out” no SIGCB Intranet (DES), na funcionalidade “Manter Cedente”. Ao analisar o ambiente, descartamos web server, application server e rede. A falha ocorre na resposta da transação CICS no mainframe de DES.

Fluxo da chamada:
SIGCB (SJSAS8 dsv08, sspdeaplux0100) → conector SIROT local (127.0.0.1:8111) → sirotcics / ibmdes.caixa (10.192.224.66:9683)

Dados da transação:

Transação CICS: BG00
Aplicação: SINCO (código 640400)
Rota SIROT: rede 9683 (código 0029)
Timeout do conector: 30 s

Comportamento: a sessão TCP com o mainframe está estabelecida e a mensagem é enviada normalmente. Porém, a resposta não retorna em 30 s e o conector encerra a chamada com “Read timed out”.

Ocorrências em 29/10/2026:

Das 11:10 às 11:56: cerca de 40 timeouts. Nesse período a rota 9690 também apresentou timeouts de 120 s.
Após a janela, ainda há ocorrências isoladas da BG00 às 12:44:32, 12:54:13 e 13:10:56.
Exemplo de ID: 1793283639786 (11:20:39)

Solicitamos verificar:

Tempo de resposta e possíveis abends da transação BG00 nos horários citados
Situação da região CICS (MAXTASK, fila de transações)
Possíveis locks ou lentidão em recursos (DB2/VSAM) utilizados pela BG00

Os logs completos estão disponíveis no servidor sspdeaplux0100 (/log_ias/ceflib/ceflib-dsv08.log e /log_ias/sirot2/sirot2-dsv08.log), caso precisem de mais detalhes.
