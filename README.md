-sh-4.2$ -sh-4.2$ cd ~/verificacao_sicmu -sh-4.2$ unzip -p SICMU-web.war paginas/operacaoHabitacional/.xhtml 2>/dev/null | grep -i "vendor.js" -sh-4.2$ -sh-4.2$ -sh-4.2$ -sh-4.2$ cd ~/verificacao_sicmu unzip -p SICMU-web.war paginas/operacaoHabitacional/.xhtml 2>/dev/null | grep -i "vendor.js" -sh-4.2$ -sh-4.2$ -sh-4.2$ unzip -l SICMU-web.war | grep -iE "template|layout|master" 0 06-24-2026 15:55 template/ 2464 06-24-2026 15:55 template/cabecalho.xhtml 10012 06-24-2026 15:55 template/menu.xhtml 2476 06-24-2026 15:55 template/rodape.xhtml 1138 06-24-2026 15:55 template/rodape2.xhtml 2875 06-24-2026 15:55 template/template.xhtml 1633 06-24-2026 15:55 template/template2.xhtml -sh-4.2$Identified corrupted glob pattern and recommended checking template filesIdentified corrupted glob pattern and recommended checking template filesO grep nos xhtml não achou nada porque o * da wildcard não foi interpretado (aparece como .xhtml sem o asterisco — provavelmente o terminal/paste comeu o caractere). Vamos direto nos templates, que é onde scripts globais costumam ser referenciados:
cd ~/verificacao_sicmu
unzip -p SICMU-web.war template/template.xhtml | grep -i "vendor\|modernizr\|plugins.js"
unzip -p SICMU-web.war template/template2.xhtml | grep -i "vendor\|modernizr\|plugins.js"
unzip -p SICMU-web.war template/cabecalho.xhtml | grep -i "vendor\|modernizr\|plugins.js"
unzip -p SICMU-web.war template/rodape.xhtml | grep -i "vendor\|modernizr\|plugins.js"
unzip -p SICMU-web.war template/rodape2.xhtml | grep -i "vendor\|modernizr\|plugins.js"
Roda esses cinco (um por vez, ou todos seguidos já que são leves) e me manda o que aparecer. Um desses templates deve ter o <script src=".../scripts/vendor.js"> que está gerando a referência quebrada.nenhu mretorno rodei um por vezPensou por 2sPensou por 2sOk, então a referência não está em nenhum desses arquivos. Vamos abrir o escopo de busca pra achar em qualquer lugar do WAR:
cd ~/verificacao_sicmu
mkdir -p extraido
cd extraido
unzip -q ../SICMU-web.war
Isso extrai tudo numa pasta separada (não mexe no deploy do JBoss, é só uma cópia local sua). Depois:
grep -r "vendor.js" . 2>/dev/null
grep -r "modernizr" . 2>/dev/null
grep -r "plugins.js" . 2>/dev/null
Isso varre todos os arquivos (xhtml, js, xml, properties etc.) procurando onde esse caminho é referenciado. Me manda o resultado.nada, ach oque ja ta bom né temo o diagnostico ja neConsolidou diagnóstico e delineou próximos passosConsolidou diagnóstico e delineou próximos passosConcordo, já temos o suficiente pra fechar esse ponto. Resumo do diagnóstico:
vendor.js / modernizr.js / plugins.js

Não existem em lugar nenhum do WAR atual (SICMU-web.war, versão 01.05.05.004, mesma publicada nos releases 93 e 94)
Nenhum arquivo do próprio pacote (templates, xhtml) referencia esses scripts
Isso descarta de vez causa no seu escopo (deploy/pipeline está correto, pacote é o esperado)

Como a referência não está nem no HTML/JS do próprio pacote, ela só pode estar vindo de:

Cache de navegador de uma versão antiga da aplicação (o Marcos pode ter carregado uma versão anterior em cache antes do último deploy)
Alguma referência dinâmica gerada em runtime (algo montado via _ENV_/config, fora do WAR estático)
Ou simplesmente resquício de uma versão anterior do sistema que já não existe mais no código atual

De qualquer forma, isso é 100% código/frontend da aplicação — não tem mais nada a investigar do lado de infra/deploy/pipeline.
Diagnóstico consolidado pra passar pro time responsável:

WAR do SICMU (v01.05.05.004) deployado corretamente, confirmado hash/tamanho e conteúdo
Arquivos vendor.js, modernizr.js e plugins.js não fazem parte do pacote atual nem são referenciados em nenhum template/xhtml do próprio WAR — descarta falha de empacotamento/deploy
Erro de conexão (timeout) do ServicoEnc em DES — bloqueio de rede confirmado (DNS ok, TCP falha) — infra/rede
ServicoDct em TQS responde 200 com corpo vazio — falha de lógica no backend do serviço — dev
Acesso via VPN_CAIXA ao sicmu-intranet-update.esteiras.des.caixa negado pelo Telecom — já em tratativa via CEPRO

Quer que eu monte isso em texto pra WO/Teams agora?sim porfavor pode montarCalibrated formal tone and plain text formatting preferencesCalibrated formal tone and plain text formatting preferencesDiagnóstico técnico - SICMU DevOps - erro de acesso e recursos
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
