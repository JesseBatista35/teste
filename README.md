As URLs afetadas pelo problema do Apache novo (caddeapllx2794) são estas:

URL	Aplicação	Server-group / balancer	Situação
https://sigec.des.caixa/gec-web/por/	SIGEC Portabilidade Batch	sigec-portabilidade-batch / mycluster_sigec	Caía no Online. Hoje dá 404 no novo porque o Batch está em STARTING
https://sigecpor2.des.caixa/gec-web/por/	SIGEC Portabilidade Online	sigec-portabilidade2 / mycluster_sigec2	Funcionava, mas misturado com o Batch. Hoje dá 503 no novo (balancer sem membros)
