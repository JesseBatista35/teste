Bom dia,

Solicito a criação de VIPs exclusivos para o sistema `SICMU-intranet-update` nos ambientes DES e TQS, conforme detalhes abaixo:

**Sistema:** SICMU-intranet-update

---

**Ambiente DES:**
- URL: `sicmu-intranet-update.esteiras.des.caixa`
- Protocolo HTTPS porta 443 com certificado `*.esteiras.des.caixa`
- Backend: `10.116.200.228:443`
- Protocolo HTTP porta 80 redirecionando para HTTPS

**Ambiente TQS:**
- URL: `sicmu-intranet-update.esteiras.tqs.caixa`
- Protocolo HTTPS porta 443 com certificado `*.esteiras.tqs.caixa`
- Backend: `10.116.201.150:443`
- Protocolo HTTP porta 80 redirecionando para HTTPS

---

**Contexto:**
O VIP compartilhado atual `10.116.180.22` entrega apenas para os backends `10.116.223.231` e `10.116.223.232`, não sendo possível incluir os servidores acima. Conforme orientação do analista Magnus (TELEDATA/CETEL/REDES), é necessária a criação de VIPs exclusivos para atender esses backends.

Agradecemos o atendimento!

