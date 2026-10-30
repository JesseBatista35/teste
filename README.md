Solicitação de regra de firewall: SIALI (DES)

Origem	Destino	Porta/Protocolo
10.116.220.212 (egress IP OKD4 NPRD, namespace siali-des)	10.116.18.152	TCP 51317

Justificativa: inclusão do novo datasource siali-jpa-ds do SIALI em DES, que passa a apontar para o banco PostgreSQL alidb001 (10.116.18.152:51317). O teste de conectividade a partir do pod resulta em timeout. A comunicação com o mesmo host na porta 5432 já está liberada e funcional.
