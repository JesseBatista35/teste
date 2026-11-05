2. No Apache (476, 10.116.78.12): as chamadas do PJ com o status

bash
sudo grep "workflow-credito-pj" /logs/apache2/SIFEC-INTRANET/sifec1.des.caixa-access.log | tail -30

O número logo depois de HTTP/1.1" é o status.

3. No 473: o log completo do momento do teste (sem filtrar só ERROR)

bash
sudo grep -n "10:1[5-9]" /opt/jboss/jboss-eap/hc/servers/sifec-intranet_node1_lx473/log/server.log | grep -iE "workflow|wpj|status=|Exception|WARN" | tail -40

Troque 10:1[5-9] pelo minuto do teste.

Ponto de atenção no seu log:

SQL Warning Code: 4223 ... Ocorreram exceções de segurança ao carregar o driver. ERRORCODE=4223

É um aviso do driver DB2 (JCC 4.16.53) ao conectar. Normalmente aparece quando o driver tenta usar um recurso de segurança ou criptografia que não está disponível e cai para outro modo. Se a lista do PJ consulta o DB2, esse pode ser o motivo da resposta vazia. O passo 3 deve mostrar se ele aparece exatamente na hora da consulta.

Me manda o print da aba Rede ou a saída dos passos 2 e 3.
