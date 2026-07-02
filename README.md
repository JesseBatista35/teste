Diagnóstico técnico - SICMU DevOps - erro de acesso e recursos
Ambiente: DES e TQS (servicossociais.des.corerj.caixa / servicossociais.tqs.corerj.caixa)
Aplicação: SICMU-intranet-update
Versão do pacote em produção nos ambientes: SICMU-ear 01.05.05.004 (releases 93 e 94 no Azure DevOps)
Pontos identificados:

Recursos estáticos vendor.js, modernizr.js e plugins.js retornando 404
Confirmado via curl direto no JBoss-EAP que o erro é 404 legítimo do servidor de aplicação, não falha de rota ou proxy. Inspeção completa do WAR SICMU-web.war (extraído do EAR publicado no Nexus e presente no deployment do servidor) mostra que esses arquivos não existem no pacote atual. Também não há nenhuma referência a esses arquivos nos templates ou páginas xhtml do próprio WAR (template.xhtml, template2.xhtml, cabecalho.xhtml, rodape.xhtml, rodape2.xhtml, e busca completa no conteúdo extraído). O deploy do EAR foi validado como correto e correspondente à versão publicada no Azure DevOps. Encaminhar para o time de desenvolvimento do SICMU para levantar a origem dessa referência (possível resquício de versão anterior ou cache de navegador do usuário).
Timeout de conexão no serviço ServicoEnc em DES
curl para https://servicossociais.des.corerj.caixa/ServicoEnc resulta em falha de conexão (connection timed out), mesmo com DNS resolvendo corretamente para 10.116.98.168. Indica bloqueio de rede ou firewall entre o ponto de origem e o destino, não falha de aplicação. Encaminhar para infraestrutura/rede.
ServicoDct em TQS retorna 200 com corpo vazio
curl para https://servicossociais.tqs.corerj.caixa/ServicoDct responde HTTP 200 mas com Content-Length 0, o que gera o erro de parse XML no console do navegador (nenhum conteúdo XML para ser interpretado). Serviço está no ar e responde rápido, portanto não é problema de rede ou infraestrutura. Encaminhar para o time de desenvolvimento revisar a lógica de resposta do serviço.
Acesso via VPN_CAIXA bloqueado para sicmu-intranet-update.esteiras.des.caixa
Usuário Marcelo, conectado via VPN_CAIXA (diferente de VPN_CAIXA_TI), não consegue acessar a aplicação. Confirmado pelo time de Telecom (Magnus) que não existe regra de firewall específica para esse destino a partir desse túnel de VPN. Solicitação de regra (Origem VPN_CAIXA, Destino 10.116.181.177, Porta 443) foi negada pelo portal Regras Telecom, com orientação de formalizar a demanda diretamente junto à CEPRO/CAIXA para avaliação conjunta. Já em tratativa entre Marcelo e Telecom/CEPRO, fora do escopo desta equipe.
