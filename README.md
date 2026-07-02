Diagnóstico técnico - SICMU DevOps - erro de acesso e recursos
Ambiente: DES e TQS (servicossociais.des.corerj.caixa / servicossociais.tqs.corerj.caixa)
Aplicação: SICMU-intranet-update
Versão do pacote validada nos ambientes: SICMU-ear 01.05.05.004 (releases 93 e 94 no Azure DevOps)
Resumo e encaminhamentos sugeridos

Recursos estáticos vendor.js, modernizr.js e plugins.js retornando 404
Já verificamos o deploy e o pacote publicado, e por ora não encontramos indício de falha na pipeline ou no artefato gerado. Fica a sugestão de o time de desenvolvimento avaliar com calma se pode ser referência de uma versão anterior da aplicação ou algo relacionado a cache do navegador do usuário, quando possível.
Timeout de conexão no serviço ServicoEnc em DES
Encontramos uma falha de conexão que parece estar relacionada a rede/firewall. Sugerimos que o time de infraestrutura de rede dê uma olhada quando possível, para confirmar se está tudo certo na regra de acesso a esse destino.
ServicoDct em TQS retornando resposta vazia
O serviço está no ar e respondendo rápido, mas sem conteúdo. Fica como sugestão para o time de desenvolvimento revisar, se possível, a lógica de resposta desse serviço.
Acesso via VPN_CAIXA bloqueado
Esse ponto já está sendo tratado diretamente pelo Marcelo com o time de Telecom e CEPRO, então seguimos apenas acompanhando.

Detalhamento técnico (para referência)
Item 1: curl direto no JBoss-EAP confirmou 404 no próprio servidor de aplicação. Inspecionamos o WAR SICMU-web.war extraído do EAR publicado no Nexus e presente no servidor, e não encontramos os arquivos vendor.js, modernizr.js e plugins.js no pacote, nem referência a eles nos templates e páginas xhtml (template.xhtml, template2.xhtml, cabecalho.xhtml, rodape.xhtml, rodape2.xhtml) ou em busca ampla no conteúdo extraído do WAR. O deploy foi conferido como correspondente à versão publicada no Azure DevOps.
Item 2: curl para https://servicossociais.des.corerj.caixa/ServicoEnc resultou em timeout de conexão, mesmo com o DNS resolvendo corretamente para 10.116.98.168.
Item 3: curl para https://servicossociais.tqs.corerj.caixa/ServicoDct retornou HTTP 200 com Content-Length 0, o que gera o erro de parse XML observado no console do navegador.
Item 4: confirmado pelo time de Telecom que não existe regra de firewall para esse destino a partir do túnel VPN_CAIXA utilizado pelo Marcelo. Solicitação de regra foi negada pelo portal Regras Telecom, com orientação para formalizar junto à CEPRO/CAIXA.
Ficamos à disposição para qualquer esclarecimento adicional sobre o que foi levantado até aqui.
