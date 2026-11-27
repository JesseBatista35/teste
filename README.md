# status do agente no servidor
ctm_agstat -LIST caddeapllx2501.agil.nprd.caixa.gov.br

# o servidor resolve o nome do agente?
nslookup caddeapllx2501.agil.nprd.caixa.gov.br

# força o servidor a testar e registrar o agente
ctmping -HOSTID caddeapllx2501.agil.nprd.caixa.gov.br -DISCOVER Y
