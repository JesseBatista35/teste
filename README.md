Resumo do dia 18/11: Migração JBoss 7.4 (SIFEC/SICCR), DES

✅ Ajustes de ambiente

Datasource IDMS (jdbc/IdmsSiapxDS, SIAPX): no 7.4, o datasource estava sem validação de conexão e sem idle-timeout, diferente do 6.4. Por isso o pool entregava conexões já derrubadas pelo IDMS (Invalid connection state), o que causava erro na simulação do consignado do CCR. Configuração igualada ao 6.4 (SQL de validação, validate-on-match, idle-timeout de 1 minuto e retry de alocação).
Reload do sifec-intranet às 16:31: concluído sem erros, com as 15 aplicações ativas no ar (SIFEC, CCR, APX, GARANTIAS, ORIGINAÇÃO, MINUTA GARANTIAS, BAN, SICDT, PJ, MCM, BDCAIXA, FBN, HUB-WEB, MINUTAS-FRONT e PARÂMETROS).

✅ CCR (ccr-api, 401)

Pelo log, às 16:16 houve uma chamada à simulação do consignado que passou pela autenticação, sem 401, o que confirma o ajuste de ontem. Ela falhou apenas pela conexão IDMS, que já foi corrigida.
Pendente: reteste do /v8/contratos/simular com token intranet e internet. @Alessandro Ricardo Lima, pode indicar alguém do CCR para o teste?

❌ Tentativas de deploy que dependem de correção da fábrica

SIRUR 3.55.51.05: MANIFEST.MF com formatação inválida (invalid header field). Corrigir a geração do manifesto no build (em andamento com o Emerson).
SIARC (siarc_EAP6.ear): incompatibilidade nas dependências JSF. Precisa de build compatível com o 7.4.
MANTER DOCUMENTO 2.2.7-b94: incompatibilidade com o Hibernate do 7.4. Revisar as consultas JPA/Hibernate.
BNDES 1.1.0-b8: erro de CDI (WELD-001408). Os EJBs FbnServicosBean e BndesServicosBean precisam expor as interfaces IFbnServicosBean e IBndesServicosBean (implements ou @Local).

⏳ Pendências: builds da fábrica (já reportadas)

LCR 1.117.1: CDI em 9 DAOs e SecurityInterceptor.
CONSTRUCARD 1.23.1.2: 5 EJBs precisam expor as interfaces.
CCR: ORA-25156, dialeto Oracle na consulta de contrato.
HUB-API 2.2.0: named queries com parâmetro legado ?.
EMP, EMPRESAS e RURAL: CDI e dependências.

⏳ Pendências: validação funcional dos devs

APX, GARANTIAS, ORIGINAÇÃO, MINUTA GARANTIAS, BAN, SIEMP, MCM, BDCAIXA, FBN, HUB-WEB, MINUTAS-FRONT e PARÂMETROS.

Situação geral: todos os pacotes da aba sifec-intra já foram tentados no 7.4. Os que não subiram dependem de nova build. Assim que as builds corrigidas chegarem (prioridade LCR → SIRUR), implantamos na sequência. Depois seguimos para os grupos inter, inter-sso e ccr_api.

@Gustavo Duarte Lepesteur da Costa @Paulo Henrique Barros Santos, contamos com vocês para direcionar as correções e os testes aos devs de cada sistema.
