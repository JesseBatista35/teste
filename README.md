Resumo do dia 17/11: Migração JBoss 7.4 (SIFEC/SICCR), DES

✅ Avanços de hoje

CCR (ccr-api, 401): causa identificada e ajuste aplicado, conforme alinhado com Alessandro, Paulo e Gustavo. Removemos a validação de token pelo container no ccr-api, igualando ao 6.4, com backup do domain e rollback documentado. O redeploy foi concluído às 15:22 sem erros.
Novos pacotes implantados no 7.4:
APX 1.7.9.4: https://migracaosifec.des.caixa/apx-web/ (após criar a sessão de e-mail APXMail)
GARANTIAS 1.8.0.3: https://migracaosifec.des.caixa/garantias-web/
ORIGINAÇÃO 3.11.1: https://migracaosifec.des.caixa/ori-web/
MINUTA GARANTIAS 1.0.0-b36: https://migracaosifec.des.caixa/minutaGarantias-web/
BAN 1.7.0-b117: https://migracaosifec.des.caixa/siban-api/
Kit para as fábricas: o domain.xml atualizado do 7.4 e o instalador do EAP 7.4.23 (pasta do Murilo) foram disponibilizados ao Gustavo, para as fábricas montarem o ambiente local.
SIEMP (Sonar): ajustes na esteira (testes habilitados, JaCoCo e fontes do Jasper). A cobertura do código novo chegou a 95%. Aguardando o ajuste do Denilson no teste que ainda falha.

⏳ Pendências: aguardando teste dos devs

CCR: teste do /v8/contratos/simular com token intranet e com token internet (Matheus).
Implantados hoje: APX, GARANTIAS, ORIGINAÇÃO, MINUTA GARANTIAS e BAN.
Implantados anteriormente, ainda sem validação: MCM, BDCAIXA, FBN, Minutas Front, HUB-WEB e PARÂMETROS (spr3).

⏳ Pendências: aguardando nova build da fábrica (correção de código)

LCR 1.117.1: CDI em 9 DAOs e SecurityInterceptor incompatível com o RESTEasy do 7.4.
SIRUR 3.55.51.03: SiricXMLIntegracaoNegocioImpl precisa expor a interface (@Local/implements).
CONSTRUCARD 1.23.1.2: 5 EJBs precisam expor a interface (@Local/implements). Detalhes na mensagem anterior.
CCR: ORA-25156 na consulta de contrato. Ajustar o dialeto Oracle no persistence.xml (Oracle10g/12c) ou a query. Independente do 401.
HUB-API 2.2.0: named queries com parâmetro legado ?.
EMP, EMPRESAS e RURAL: CDI e dependências (Jackson/RESTEasy).

⏳ Pendências: definição de pacote

MANTER DOCUMENTO 2.2.7: qual build subir (b88, b91 ou b94)?
BNDES 1.0.4.2: link do pacote (no domain só tem a 1.1.0).
ARC: existe build para o 7.4? No domain só tem siarc_EAP6.ear.

⏳ Pendências: arquitetura e próximos ambientes

Prever a segregação de token intranet/internet nos ambientes seguintes e em produção. Vale para o CCR e para os demais pacotes SIFEC que atendem internet.

Próximos passos: assim que chegarem as builds corrigidas (prioridade LCR → SIRUR), implantamos na sequência. Depois de fechar a sifec-intra, seguimos para os grupos inter, inter-sso e ccr_api.
