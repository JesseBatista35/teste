Consegue atualizar essa tabela com o que botou no resumo?


 
Módulo / pacote do inventário	Semáforo	Situação
SIFEC 2.161.2.0	🟢	Implantado e no ar (WFLYSRV0010). Núcleo SIFEC operacional no JBoss EAP 7.4.
SICCR-PARÂMETROS 3.3.1.1 (spr3)	🟡	Versão validada anteriormente e posteriormente atualizada para a build spr3 a pedido do Rodrigo. Aguardando confirmação dos testes nessa versão.
SICDT-FEC 3.24.3.004	🟢	Implantado e testado com sucesso. Download de PDF e CSV validado. Build considerada estável.
SICCR-PJ 8.40.1	🟢	Implantado e funcionando. Perfil e lista de clientes validados.
HUB-WEB 1.10.0.1-b418	🟡	Aplicação responde em /hub-web/ e redireciona para login. Funcionalidades dependentes do HUB-API permanecem indisponíveis enquanto a API não sobe.
SIBAN-MCM 1.0.1.23-b47	🟡	Implantado. Datasource Sybase corrigido e teste de conexão realizado com sucesso. Aguardando validação funcional.
SICCR-BDCAIXA 2.0.1-b39	🟡	Implantado. Aguardando teste funcional.
SIFEC-FBN 1.0.1.0-b84	🟡	Implantado no ambiente. Situação atualizada em relação ao levantamento anterior. Aguardando teste funcional.
MINUTA GARANTIAS (SIFEC-MINUTAS-FRONT 1.0.0-b14)	🟡	Implantado. Aguardando teste funcional.
SIFEC-CCR 6.3.0-b4587	🟡	Implantado. Identificada a causa do erro 401 do ccr-api: no EAP 7.4 o token é validado apenas no realm internet. Correção é de ambiente, sem necessidade de novo pacote, aguardando aprovação para aplicação no DES. Identificado também erro independente de
 banco (ORA-25156/Hibernate) que depende de ajuste da fábrica.
SIRUR 3.55.51.03	🔴	Evoluiu após correções de datasource e persistência, porém a implantação parou em novo erro CDI. A classe
SiricXMLIntegracaoNegocioImpl precisa expor a interface (@Local /
implements). Aguardando nova build da fábrica.
LCR 1.117.1	🔴	Deploy revertido. Encontrados erros CDI em múltiplos DAOs e incompatibilidade do
SecurityInterceptor com o RESTEasy do EAP 7.4. Aguardando nova build.
HUB-API 2.2.0	🔴	Não sobe devido a named query utilizando parâmetro legado ?, incompatível com Hibernate do EAP 7.4. Aguardando nova build.
SIFEC-EMP 3.96.2.0	🔴	Falha de CDI (WELD-001408). Aguardando nova build.
SIFEC-EMPRESAS	🔴	Falha de CDI (WELD-001408). Aguardando nova build.
SIFEC-RURAL 2.115.1.0	🔴	Necessita build compatível com EAP 7.4, principalmente com Jackson e RESTEasy configurados como
provided. Aguardando nova build.
APX, ARC, BAN, BNDES, CONSTRUCARD, GARANTIAS, MANTER DOCUMENTO e ORIGINAÇÃO	⚪	Ainda não iniciados. Permanecem na fila de tratamento após LCR → SIRUR → CCR, conforme alinhamento com Paulo e Rodrigo.
 
 
 
🟢 3: SIFEC, SICDT e PJ.

🟡 7: implantados aguardando teste dos devs, mais o CCR esperando o de acordo.

🔴 6: todos aguardando build corrigida da fábrica; do lado do ambiente não há pendência nossa neles.

⚪ 8: ainda na fila.
 
