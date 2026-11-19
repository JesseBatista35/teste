Módulo / pacote do inventário	Semáforo	Situação
SIFEC 2.161.2.0	🟢	Implantado e no ar. Núcleo SIFEC operacional no JBoss EAP 7.4.
SICDT-FEC 3.24.3.004	🟢	Implantado e testado com sucesso. Download de PDF e CSV validado. Build considerada estável.
SICCR-PJ 8.40.1	🟢	Implantado e funcionando. Perfil e lista de clientes validados.
SIFEC-CCR 6.3.0-b4587	🟡	401 do ccr-api corrigido em 17/11: removida a validação de token pelo container, igualando ao 6.4, conforme alinhado com Alessandro, Paulo e Gustavo. Em 18/11, uma chamada à simulação do consignado passou pela autenticação sem 401. Também corrigido o datasource IDMS (IdmsSiapxDS), que estava sem validação de conexão, com reload às 16:31. Aguardando reteste do /v8/contratos/simular por alguém do CCR, a ser indicado pelo Alessandro. O erro ORA-25156 (dialeto Oracle/Hibernate) segue com a fábrica.
SICCR-PARÂMETROS (spr3)	🟡	A 3.3.1.1 foi validada e depois atualizada para a build spr3, a pedido do Rodrigo. Aguardando confirmação dos testes nessa versão.
HUB-WEB 1.10.0.1-b418	🟡	Responde em /hub-web/ e redireciona para o login. As funcionalidades que dependem do HUB-API continuam indisponíveis enquanto a API não sobe.
SIBAN-MCM 1.0.1.23-b47	🟡	Implantado, com datasource Sybase corrigido e conexão OK. Aguardando validação funcional.
SICCR-BDCAIXA 2.0.1-b39	🟡	Implantado. Aguardando teste funcional.
SIFEC-FBN 1.0.1.0-b84	🟡	Implantado. Aguardando teste funcional.
SIFEC-MINUTAS-FRONT 1.0.0-b14	🟡	Implantado. Aguardando teste funcional.
SIFEC-APX 1.7.9.4-b40	🟡	Implantado em 17/11 (/apx-web), depois da criação da sessão de e-mail APXMail. Aguardando teste funcional.
SIFEC-GARANTIAS 1.8.0.3-b183	🟡	Implantado em 17/11 (/garantias-web). Aguardando teste funcional. Atenção às integrações SIACG, SISGD e SIFBN/SIBAN: o JBoss avisou que faltam bibliotecas no pacote.
SIFEC-ORIGINAÇÃO 3.11.1-b344	🟡	Implantado em 17/11 (/ori-web). Aguardando teste funcional. Atenção às consultas SIFBN/SIBAN.
MINUTA GARANTIAS 1.0.0-b36	🟡	Implantado em 17/11 (/minutaGarantias-web). Aguardando teste funcional.
SIFEC-BAN 1.7.0-b117	🟡	Implantado em 17/11 (/siban-api). Aguardando teste funcional.
SIRUR 3.55.51.05	🔴	A build nova (18/11) falhou: o MANIFEST.MF está com formatação inválida (invalid header field). Correção da geração do manifesto em andamento com o Emerson.
LCR 1.117.1	🔴	Erros de CDI em múltiplos DAOs e SecurityInterceptor incompatível com o RESTEasy do 7.4. Aguardando nova build.
SIFEC-CONSTRUCARD 1.23.1.2-b64	🔴	Tentado em 17/11. CDI (WELD-001408): 5 EJBs não expõem a interface injetada. Ajuste: implements ou @Local. Aguardando nova build.
SIFEC-BNDES 1.1.0-b8	🔴	Tentado em 18/11 (versão disponível, conforme o Gustavo). CDI (WELD-001408): FbnServicosBean e BndesServicosBean não expõem IFbnServicosBean e IBndesServicosBean. Aguardando nova build.
MANTER DOCUMENTO 2.2.7-b94	🔴	Tentado em 18/11. Incompatibilidade com o Hibernate do 7.4. Revisar as consultas JPA. Aguardando nova build.
SIARC (siarc_EAP6)	🔴	Tentado em 18/11. Incompatibilidade nas dependências JSF. Precisa de build compatível com o 7.4.
HUB-API 2.2.0	🔴	Named query com parâmetro legado ?, incompatível com o Hibernate do 7.4. Aguardando nova build.
SIFEC-EMP 3.96.2.0	🔴	CDI (WELD-001408). Aguardando nova build.
SIFEC-EMPRESAS	🔴	CDI (WELD-001408). Aguardando nova build.
SIFEC-RURAL 2.115.1.0	🔴	Precisa de build compatível com o 7.4 (Jackson e RESTEasy como provided). Aguardando nova build.
🟢 3: SIFEC, SICDT e PJ.
🟡 12: implantados e aguardando teste dos devs, entre eles os 5 que subiram em 17/11. Inclui o CCR, com o 401 já corrigido e aguardando reteste.
🔴 10: todos aguardando build corrigida da fábrica. Do lado do ambiente não há pendência nossa.
⚪ 0: todos os pacotes da aba sifec-intra já foram tentados no 7.4.
