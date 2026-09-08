Servidor APACHE - Configuração/Inclusão de Proxy/Reverse

Servidores:
des.barramento.caixa
tqs.barramento.caixa

contexto1: /sibar/investimentos/aplicacoes/renda-fixa

destino 1: (broker) 
https://ibmspdes.caixa:7081/sibar/investimentos/aplicacoes/renda-fixa
https://ibmsptqs.caixa:7081/sibar/investimentos/aplicacoes/renda-fixa


contexto2: /sibar/investimentos/posicoes/renda-fixa

destino 2: (broker) 
https://ibmspdes.caixa:7081/sibar/investimentos/posicoes/renda-fixa
https://ibmsptqs.caixa:7081/sibar/investimentos/posicoes/renda-fixa


contexto3: /sibar/investimentos/produtos/renda-fixa

destino 3: (broker) 
https://ibmspdes.caixa:7081/sibar/investimentos/produtos/renda-fixa
https://ibmsptqs.caixa:7081/sibar/investimentos/produtos/renda-fixa


contexto4: /sibar/investimentos/resgates/renda-fixa

destino 4: (broker) 
https://ibmspdes.caixa:7081/sibar/investimentos/resgates/renda-fixa
https://ibmsptqs.caixa:7081/sibar/investimentos/resgates/renda-fixa


contexto5: /sibar/investimentos/saldos/renda-fixa

destino 5: (broker) 
https://ibmspdes.caixa:7081/sibar/investimentos/saldos/renda-fixa
https://ibmsptqs.caixa:7081/sibar/investimentos/saldos/renda-fixa


Check-list atualizado anexo.



Check-List Webservice Apache – v.1

CEDES Responsável	Coord. Projetos Responsável	Tel. de Contato/Ramal
Comunidade Estruturantes - Barramento	Ítalo Marinho Cippiciani	(11) 3581-8107
Analista(s) para C
ontato	Tel. de Contato/Ramal	Data da alteração
Fernando Pereira Rosa
Ítalo Marinho Cippiciani
Rogério de Franca Pimentel
	(15)3333-2875
(11)3581-8107
(11)3581-8375
	08/09/2026

Aplicação/Serviço	Ambiente: Intra, Inter ou Extranet 
IIB10	Intra
URLs
DES	TQS
https://des.barramento.caixa	https://tqs.barramento.caixa

Nº	REQ/CRQ	SERVIÇO	Contexto	Conexão Broker
				Ambiente	Https? (S ou N )	URL	IP	Porta
1		CONSULTA_CONTA_SID09	/sibar/ConsultaContaSID09	DES	S	https://ibmspdes.caixa:7081/sibar/ConsultaContaSID09		7081
				TQS	S	https://ibmsptqs.caixa:7081/sibar/ConsultaContaSID09		7081
2		CONSULTA_COBRANCA_BANCARIA	/sibar/ConsultaCobrancaBancaria/Boleto	DES	S	https://ibmspdes.caixa:7081/sibar/ConsultaCobrancaBancaria/Boleto		7081
				TQS	S	https://ibmsptqs.caixa:7081/sibar/ConsultaCobrancaBancaria/Boleto		7081
3		TOKEN_TRANSACAO	/sibar/TokenTransacao	DES	S	https://ibmspdes.caixa:7081/sibar/TokenTransacao		7081
				TQS	S	https://ibmsptqs.caixa:7081/sibar/TokenTransacao		7081
4		ARRECADACAO	/sibar/ManutencaoArrecadacaoTributaria	DES	S	https://ibmspdes.caixa:7081/sibar/ManutencaoArrecadacaoTributaria		7081
								
5		CPF	/sibar/ConsultaCPF	DES	N	https://ibmspdes.caixa:7081/sibar/ConsultaCPF		7080
				DES	S	https://ibmspdes.caixa:7081/sibar/ConsultaCPF		7081
6		EXTRATO	/sibar/Extrato	DES	S	https://ibmspdes.caixa:7081/sibar/Extrato		7081
								
7		MANUTENCAO_COBRANCA_BANCARIA	/sibar/ManutencaoCobrancaBancaria/Boleto/Externo	DES	S	https://ibmspdes.caixa:7081/sibar/ManutencaoCobrancaBancaria/Boleto/Externo		7081
				TQS	S	https://ibmsptqs.caixa:7081/sibar/ManutencaoCobrancaBancaria/Boleto/Externo		7081
8		MANUTENCAO_COBRANCA_BANCARIA	/sibar/ManutencaoCobrancaBancaria/Boleto	DES	S	https://ibmspdes.caixa:7081/sibar/ManutencaoCobrancaBancaria/Boleto		7081
				TQS	S	https://ibmsptqs.caixa:7081/sibar/ManutencaoCobrancaBancaria/Boleto		7081
9		MANUTENCAO_CONTRIBUICAO_SINDICAL_APP	/sibar/ManutencaoContribuicaoSindical	DES	S	https://ibmspdes.caixa:7081/sibar/ManutencaoContribuicaoSindical		7081
								
10		VALIDA_SENHA	/sibar/ValidaSenha	DES	S	https://ibmspdes.caixa:7081/sibar/ValidaSenha		7081
								
11		CONSULTA_SALDO	/sibar/ConsultaSaldo	DES	S	https://ibmspdes.caixa:7081/sibar/ConsultaSaldo		7081
				TQS	S	https://ibmspcd1.caixa:7081		7081
12		CONSULTA_TRANSACOES_CON TA	/sibar/ConsultaTransacoesConta	DES	S	https://ibmspdes.caixa:7081/sibar/ConsultaTransacoesConta		7081
								
13		CONSULTA_SERVICOS_SOCIAIS_API	/sibar/ConsultaServicosSociais	DES	S	https://ibmspdes.caixa:7081/sibar/ConsultaServicosSociais		7081
								
14		
REC_PEC_FORNECEDOR_SOAP	/sibar/pecrec_soap	DES	S	https://ibmspdes.caixa:7081/sibar/pecrec_soap		7081
								
15		MANUTENCAO_BENEFICIARIO_INSS	/sibar/Manutencao_Beneficiario_INSS	DES	S	https://ibmspdes.caixa:7081/sibar/Manutencao_Beneficiario_INSS		7081
								
16		CONSULTA_BENEFICIARIO_INSS	/sibar/Consulta_Beneficiario_INSS	DES	S	https://ibmspdes.caixa:7081/sibar/Consulta_Beneficiario_INSS		7081
								
17		CONSULTA_LOG_MONITORACAO	/sibar/ConsultaLogMonitoracao	DES	S	https://ibmspdes.caixa:7081/sibar/ConsultaLogMonitoracao		7081
								
18		CONSULTA_MONITORACAO	/sibar/ConsultaMonitoracao	DES	S	https://ibmspdes.caixa:7081/sibar/ConsultaMonitoracao		7081
								
19		MANUTENCAO_MONITORACAO	/sibar/ManutencaoMonitoracao	DES	S	https://ibmspdes.caixa:7081/sibar/ManutencaoMonitoracao		7081
								
20		CONSULTA_SERVICOS_SOCIAIS_API	/sibar/servicos_sociais	DES	S	https://ibmspdes.caixa:7081/sibar/servicos_sociais		7081
								
21		CONSULTA_COTACOES	/sibar/ConsultaCotacoes	DES	S	https://ibmspdes.caixa:7081/sibar/ConsultaCotacoes		7081
								
22		CONSULTA_CPF	/sibar/consulta_cpf	DES	S	https://ibmspdes.caixa:7081/sibar/consulta_cpf		7081
								
23		CONSULTA_FUNDOS_INVESTIMENTO	/sibar/ConsultaFundosInvestimento	DES	S	https://ibmspdes.caixa:7081/sibar/ConsultaFundosInvestimento		7081
								
24		CONSULTA_FUNDOS_INVESTIMENTO	/sibar/consulta-fundos-investimento	DES	S	https://ibmspdes.caixa:7081/sibar/consulta-fundos-investimento		7081
								
25		PAINEL_CONTAS	/sibar/PainelContas	DES	S	https://ibmspdes.caixa:7081/sibar/PainelContas		7081
								
26		DEBITO_AUTOMATICO	/sibar/DebitoAutomatico	DES	S	https://ibmspdes.caixa:7081/sibar/DebitoAutomatico		7081
								
27		DEBITO_AUTOMATICO	/sibar/debito-automatico	DES	S	https://ibmspdes.caixa:7081/sibar/debito-automatico		7081
								
28		FUNDOS_INVESTIMENTO	/sibar/FundosInvestimento	DES	S	https://ibmspdes.caixa:7081/sibar/FundosInvestimento		7081
								
29		FUNDOS_INVESTIMENTO	/sibar/fundos-investimento	DES	S	https://ibmspdes.caixa:7081/sibar/fundos-investimento		7081
								
30		SALDO_API	/sibar/conta-movimentacoes	DES	S	https://ibmspdes.caixa:7081/sibar/conta-movimentacoes		7081
								
31		CONSULTA_COMPENSACAO_CHEQUE	/sibar/ConsultaCompensacaoCheque	DES	S	https://ibmspdes.caixa:7081/sibar/ConsultaCompensacaoCheque		7081
								
32	REQ000033010239
	ASSINATURA_ELETRONICA	/sibar/contas/assinaturas-eletronicas	DES	S	https://ibmspdes.caixa:7081/sibar/contas/assinaturas-eletronicas		7081
								
33		MANUTENCAO_CESTA_SERVICOS	/sibar/ManutencaoCestaServicos	DES	S	https://ibmspdes.caixa:7081/sibar/ManutencaoCestaServicos		7081
								
34		CONSULTA_CESTA_SERVICOS	/sibar/ConsultaCestaServicos	DES	S	https://ibmspdes.caixa:7081/sibar/ConsultaCestaServicos		7081
								
35		REC_PEC_RESOLVE_PENDENCIA	/sibar/recpec/soap	DES	S	https://ibmspdes.caixa:7081/sibar/recpec/soap		7081
								
36		CONS_CONTRIB_SINDICAL	/sibar/ConsultaContribuicaoSindical	DES	S	https://ibmspdes.caixa:7081/sibar/ConsultaContribuicaoSindical		7081
								
37		AVALIACAO_PERFIL_INVESTIDOR_API	/sibar/avaliacoes-perfis-investidores	DES	S	https://ibmspdes.caixa:7081/sibar/avaliacoes-perfis-investidores		7081
								
38		DOC_API	/sibar/contas/transferencias/doc/v1	DES	S	https://ibmspdes.caixa:7081/sibar/contas/transferencias/doc/v1		7081
								
39		TED_API	/sibar/contas/transferencias/ted/v1	DES	S	https://ibmspdes.caixa:7081/sibar/contas/transferencias/ted/v1		7081
								
40		TEV_API	/sibar/contas/transferencias/tev/v1	DES	S	https://ibmspdes.caixa:7081/sibar/contas/transferencias/tev/v1		7081
								
41		VALIDA_TITULAR_API	/sibar/contas/valida/v1/titular	DES	S	https://ibmspdes.caixa:7081/sibar/contas/valida/v1/titular		7081
								
42		DISPOSITIVO_API	/sibar/dispositivos/v1	DES	S	https://ibmspdes.caixa:7081/sibar/dispositivos/v1		7081
								
43		GERENCIAMENTO_PERFIL_BANKING_API	/sibar/banking/perfis/v1/assinatura	DES	S	https://ibmspdes.caixa:7081/sibar/banking/perfis/v1/assinatura		7081
								
44		GERENCIAMENTO_PERFIL_BANKING_API	/sibar/banking/perfis/v1/recurso	DES	S	https://ibmspdes.caixa:7081/sibar/banking/perfis/v1/recurso		7081
								
45		GERENCIAMENTO_PERFIL_BANKING_API	/sibar/banking/perfis/v1/senha	DES	S	https://ibmspdes.caixa:7081/sibar/banking/perfis/v1/senha			7081
								
46		GERENCIAMENTO_PERFIL_BANKING_API	/sibar/banking/perfis/v1/usuario	DES	S	https://ibmspdes.caixa:7081/sibar/banking/perfis/v1/usuario		7081
								
47		PROPAGACAO_ENVELOPE_API	/sibar/propagacao/envelope/v1	DES	S	https://ibmspdes.caixa:7081/sibar/propagacao/envelope/v1		7081
								
48		D01_LANCAMENTO_NSGD	/sid01/lancamento_nsgd_bloqueio	DES	S	https://ibmspdes.caixa:7081/sid01/lancamento_nsgd_bloqueio		7081
								
49		D01_LANCAMENTO_NSGD	/sid01/lancamento_nsgd	DES	S	https://ibmspdes.caixa:7081/sid01/lancamento_nsgd		7081
								
50		IDENTIFICACAO_POSITIVA	/sibar/Identificacao_Positiva	DES	S	https://ibmspdes.caixa:7081/sibar/Identificacao_Positiva		7081
								
51		MANUTENCAO_SENHA	/sibar/ManutencaoSenha	DES	S	https://ibmspdes.caixa:7081/sibar/ManutencaoSenha		7081
								
52		SMS_ADESAO_API	/sibar/sms-adesao	DES	S	https://ibmspdes.caixa:7081/sibar/sms-adesao		7081
								
53		SOLICITACAO_DEBITO	/sibar/SolicitacaoDebito	DES	S	https://ibmspdes.caixa:7081/sibar/SolicitacaoDebito		7081
								
54		SOLICITACAO_DEBITO_API	/sibar/debito	DES	S	https://ibmspdes.caixa:7081/sibar/debito		7081
								
55		CONSULTA_CONTA_API	/sibar/consulta-conta	DES	S	https://ibmspdes.caixa:7081/sibar/consulta-conta		7081
				TQS	S	https://ibmsptqs.caixa:7081/sibar/consulta-conta		7081
56		BLOQUEIO_CONTA_API	/sibar/bloqueio-conta	DES	S	https://ibmspdes.caixa:7081/sibar/bloqueio-conta		7081
								
57		MANUTENCAO_CONTA_API	/sibar/manutencao-conta	DES	S	https://ibmspdes.caixa:7081/sibar/manutencao-conta		7081
								
58		MANUTENCAO_CONTA_API	/sibar/contas/manutencao	DES	S	https://ibmspdes.caixa:7081/sibar/manutencao-conta		7081
								
59		SMS_CODIGO_ATIVACAO_API	/sibar/sms-codigo-ativacao	DES	S	https://ibmspdes.caixa:7081/sibar/sms-codigo-ativacao/		7081
60		INFORMACAO_CORPORATIVA_UNIDADE_API
	/sibar/corporativo/unidades	DES	S	https://ibmspdes.caixa:7081/sibar/corporativo/unidades		7081
61	REQ000031146247	FIX_BEM_GARANTIDOR_API	/sibar/bemgarantidor	DES	S	https://ibmspdes2.caixa:7962/sibar/bemgarantidor		7962
62		INFORMACAO_CORPORATIVA_ADMINISTRATIVA_API	/sibar/corporativo/administrativo	DES	S	https://ibmspdes.caixa:7081		7081
63	REQ000031468869	TELESSERVICOS	/sibar/Telesservicos	DES	N	http://ibmspdes.caixa:7080/sibar/Telesservicos
	7080
64	REQ000031490559	SMS_SEGURANCA_API	/sibar/sms-seguranca	DES	N	http://ibmspdes.caixa:7081/sibar/sms-seguranca		7081
65	REQ000036094991	CONSULTA_CONTA	/sibar/ConsultaConta	DES	N	https://ibmspdes.caixa:7081/sibar/ConsultaConta		7081
66	REQ000032909706	IBC_MEGASENA	/siibc/ibc_megasena	DES	S	https://ibmspdes.caixa:7081/siibc/ibc_megasena		7081
67	REQ000033010239
	FUNDOS_INVESTIMENTOS_APLICACAO_API	/sibar/investimentos	DES	S	https://ibmspdes.caixa:7081/sibar/investimentos/aplicação/fundos		7081
68	REQ000033019892
	FUNDOS_INVESTIMENTOS_RESGATE_API	/sibar/investimentos	DES	S	https://ibmspdes.caixa:7081/sibar/investimentos/resgate/fundos		7081
69		TEV	/transacoes-financeiras/transferencias/tev	DES	S	https://ibmspdes.caixa:7081/sibar/Contas/Transferencias/Tev		
7081
70		TED	/transacoes-financeiras/transferencias/ted	DES	S	https://ibmspdes.caixa:7081/sibar/Contas/Transferencias/Ted		7081
71	REQ000033441391	IDENTIFICADORES_FINANCEIROS_NSGD	sibar/identificadores-financeiros-nsgd	DES	S	https://ibmspdes.caixa:7081/sibar/identificadores-financeiros-nsgd		7081
72	REQ000034496099	PAGAMENTO_ARRECADACAO	/sibar/PagamentoArrecadacao	DES	S	https://ibmspdes.caixa:7081/sibar/PagamentoArrecadacao		7081
				TQS	S	https://ibmspcd1.caixa:7081/sibar/PagamentoArrecadacao		7081
73	REQ000035789919
	ROTINAS_USO_COMUM_API	/sibar/rotinas-comuns	DES	S	https://ibmspdes.caixa:7081 /sibar/rotinas-comuns		7081
74		GSJ_CONSULTA_LEVANTAMENTOS	/judiciais/ConsultaLevantamentos	DES	S	https://ibmspdes.caixa:8000/judiciais/ConsultaLevantamentos		8000
75		CONSULTA_AVALIACAO_RISCO	/sibar/ConsultaAvaliacaoRisco	DES	N	https://10.192.224.102:7847/sibar/ConsultaAvaliacaoRisco		7847
				DES	S	https://10.192.224.102:7847/sibar/ConsultaAvaliacaoRisco  		7847
76		IBC_LOGIN_SSO	/siibc/login-sso	DES	S	https://ibmspdes.caixa:7081/siibc/login-sso		7081
77		BAR _CONTA_MANUTENCAO_API	/sibar/conta-manutencao	DES	S	https://ibmspdes.caixa:7081/sibar/conta-manutencao		7081
78	REQ000034975764	VALIDA_PERMISSAO_API	/sibar/valida-permissao	DES	S	https://ibmspdes.caixa:7081/sibar/valida-permissao		7081
				TQS	S	https://ibmsptqs.caixa:7081/sibar/valida-permissao		
79		REDE_CREDENCIADA_API	/sibar/rede-credenciada	DES	S	https://ibmspdes.caixa:7081/sibar/rede-credenciada		7081
80		SENHA_API	/sibar/senha	DES	S	https://ibmspdes.caixa:7081/sibar/senha		7081
81		GERENCIAMENTO_PERFIL_BANKING_API	/sibar/banking/perfis	DES	S	https://ibmspdes.caixa:7081/sibar/banking/perfis		7081
82		CADASTRO_UNICO_API	/sibar/cadastro-único	DES	S	https://ibmspdes.caixa:7081/sibar/cadastro-unico		7081
83		CHEQUE_API	/sibar/cheque	DES	S	https://ibmspdes.caixa:7081/sibar/cheque		7081
84		ANTIFRAUDE_API	/sibar/antifraude	DES	S	https://ibmspdes.caixa:7081/sibar/antifraude		7081
85		CONSIGNACAO	/sibar/Consignacao	DES	S	https://10.192.224.102:7844/sibar/Consignacao		7844
86		TESOURO_DIRETO_API	/sibar/tesouro-direto	DES	S	https://10.192.224.102:7083/sibar/tesouro-direto		7083
87		VALIDA_MARCAS_API	/sibar/marcas	DES	S	https://ibmspdes.caixa:7081/sibar/marcas		7081
88		LIMITES_DEBITO_API	/sibar/limites-debito	DES	S	https://ibmspdes.caixa:7081/sibar/limites-debito		7081
89		CONTA_LANCAMENTOS_API	/sibar/conta-lancamentos	DES	S	https://ibmspdes.caixa:7081/sibar/conta-lancamentos		7081
90		ORDEM_PAGAMENTO_API	/sibar/transferencias/ordem-pagamento	DES	S	https://ibmspdes.caixa:7081/sibar/transferencias/ordem-pagamento		7081
91		CONTA_LANCAMENTOS_API	/sibar/conta-lancamentos	DES	S	https://ibmspdes.caixa:7081/sibar/conta-lancamentos		7081
				TQS	S	https://ibmsptqs.caixa:7081/sibar/conta-lancamentos		7081
92		BAR_EXTRATO_ELETRONICO_API	/sibar/extrato-eletronico	DES	S	https://ibmspdes.caixa:7081 /sibar/extrato-eletronico		7081
93		BAR_MANUTENCAO_COBRANCA_BANCARIA	/sibar/ManutencaoCobrancaBancaria/Qrcode	DES	S	https://ibmspdes.caixa:7081/sibar/ManutencaoCobrancaBancaria/Qrcode		7081
				TQS	S	https://ibmsptqs.caixa:7081/sibar/ManutencaoCobrancaBancaria/Qrcode		7081
94		BAR_CONSULTA_COBRANCA_BANCARIA	/sibar/ConsultaCobrancaBancaria/Qrcode	DES	S	https://ibmspdes.caixa:7081/sibar/ConsultaCobrancaBancaria/Qrcode		7081
				TQS	S	https://ibmsptqs.caixa:7081/sibar/ConsultaCobrancaBancaria/Qrcode		7081
95		BAR_COBRANCA_BANCARIA_API	/sibar/cobranca-bancaria	DES	S	https://ibmspdes.caixa:7081/sibar/cobranca-bancaria
	7081
				TQS	S	https://ibmsptqs.caixa:7081/sibar/cobranca-bancaria
	7081
96		BAR_ECOBRANCA_API	/sibar/e-cobranca	DES	S	https://ibmspdes.caixa:7081/sibar/e-cobranca
	7081
				TQS	S	https://ibmsptqs.caixa:7081/sibar/e-cobranca
	7081
96		BAR_CREDITO_PENHOR	/crerdito/penhor	DES	S	https://10.192.224.102:7083/credito/penhor
	7083
								
98		BAR_CONSULTA_SITUACAO_AGENDAMENTO	/sibar/ConsultaSituacaoAgendamento	DES	S	https://ibmspdes.caixa:7081/sibar/ConsultaSituacaoAgendamento		7081
				TQS	S	https://ibmsptqs.caixa:7081/sibar/ConsultaSituacaoAgendamento		7081
99		E_COBRANCA	/sibar/eCobranca	DES	S	https://ibmspdes.caixa:7081/sibar/eCobranca		7081
				TQS	S	https://ibmsptqs.caixa:7081/sibar/eCobranca		7081
100		BBR_PEN_PENHOR_API	/credito/penhor 	DES	S	https://ibmspdes2.caixa:7085/credito/penhor
	7085
				TQS				
101		SFG_SAQUE_EMERGENCIAL_API	/sibrj/saque-emergencial
DES	S	https://ibmspdes2.caixa:7083/sibrj/saque-emergencial
	7083
				TQS				
102		BAR_CONTA_SOCIAL_API	/sibar/conta-social-consulta	DES	S	http://ibmspdes.caixa:7080/sibar/conta-social-consulta
	7080
								
103		BAR_CONTA_SOCIAL_MOVIMENTACOES_API	/sibar/conta-social-movimentacoes	DES	S	http://ibmspdes.caixa:7080/sibar/conta-social-movimentacoes
	7080
						
		
104		BAR_OPEN_FINANCE_RENDA_FIXA_BANCARIA	/sibar/investimentos/open-finance/renda-fixa-bancaria	DES	S	https://ibmspdes.caixa:7081/sibar/open-finance-renda-fixa-bancaria		7081
				TQS	S	https://ibmsptqs.caixa:7081/sibar/open-finance-renda-fixa-bancaria		7081
105		BAR_OPEN_FINANCE_FUNDOS_INVESTIMENTO	/sibar/investimentos/open-finance/fundos-investimento	DES	S	https://ibmspdes.caixa:7081/sibar/open-finance-fundos-investimento		7081
				TQS	S	https://ibmsptqs.caixa:7081/sibar/open-finance-fundos-investimento		7081
106		BAR_OPEN_FINANCE_TESOURO_DIRETO	/sibar/investimentos/open-finance/tesouro-direto	DES	S	https://ibmspdes.caixa:7081/sibar/open-finance-tesouro-direto		7081
				TQS	S	https://ibmsptqs.caixa:7081/sibar/open-finance-tesouro-direto		7081
107		BAR_CARTAO_DEBITO_API	/sibar/cartao-debito	DES	S	https://ibmspdes.caixa:7081/sibar/cartao-debito		7081
				TQS	S	https://ibmsptqs.caixa:7081/sibar/cartao-debito		7081
108		BAR_RENDA_FIXA_APLICACAO_API	/sibar/investimentos/aplicacoes/renda-fixa	DES	S	https://ibmspdes.caixa:7081/sibar/investimentos/aplicacoes/renda-fixa		7081
				TQS	S	https://ibmsptqs.caixa:7081/sibar/investimentos/aplicacoes/renda-fixa		7081
109		BAR_RENDA_FIXA_POSICAO_API	/sibar/investimentos/posicoes/renda-fixa	DES	S	https://ibmspdes.caixa:7081/sibar/investimentos/posicoes/renda-fixa		7081
				TQS	S	https://ibmsptqs.caixa:7081/sibar/investimentos/posicoes/renda-fixa		7081
110		BAR_RENDA_FIXA_PRODUTO_API	/sibar/investimentos/produtos/renda-fixa	DES	S	https://ibmspdes.caixa:7081/sibar/investimentos/produtos/renda-fixa		7081
				TQS	S	https://ibmsptqs.caixa:7081/sibar/investimentos/produtos/renda-fixa		7081
111		BAR_RENDA_FIXA_RESGATE_API	/sibar/investimentos/resgates/renda-fixa	DES	S	https://ibmspdes.caixa:7081/sibar/investimentos/resgates/renda-fixa		7081
				TQS	S	https://ibmsptqs.caixa:7081/sibar/investimentos/resgates/renda-fixa		7081
112		BAR_RENDA_FIXA_SALDO_API	/sibar/investimentos/saldos/renda-fixa	DES	S	https://ibmspdes.caixa:7081/sibar/investimentos/saldos/renda-fixa		7081
				TQS	S	https://ibmsptqs.caixa:7081/sibar/investimentos/saldos/renda-fixa		7081
113								
								
114								
								
115								
								
116								
								
117								
								
118								
								
119								
								
120								
								
121								
								
122								
								
123								
								
124								
								
125								
								
Observações 

	
