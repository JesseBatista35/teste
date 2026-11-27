IGSJ Intranet — Análise consolidada: encoding / acentuação (DES, caddeapllx955)

Resumo: o ambiente (infra/esteira) está correto e padronizado em ISO-8859-1. O embaralhamento de acentos no menu tem causa no artefato da aplicação, não na infra — correção no lado do desenvolvimento.

1. Infra / esteira — OK (auditado)
Todas as camadas estão padronizadas em ISO-8859-1, como exige a integração com o Mainframe:

JVM (-Dfile.encoding) = ISO-8859-1
Undertow (default-encoding na servlet-container) = ISO-8859-1
web.xml (facelets.encoding) = ISO-8859-1
pom.xml (sourceEncoding) = ISO-8859-1
Payload do SIROT (GJ4D) = bytes em ISO-8859-1

O parser do SIROT (erro StringIndexOutOfBounds na GJ4D) foi resolvido com esse padrão — a aplicação sobe, loga e responde. Essa parte está concluída e commitada na esteira.

2. Causa do acento embaralhado — artefato da aplicação (lado dev)
A auditoria do Jeferson (via file -i nos arquivos dentro do sigsj_intranet.war) comprovou 2 fatores:

a) 19 arquivos .xhtml salvos fisicamente em UTF-8 no repositório, apesar de pom/web.xml declararem ISO-8859-1. Quando o Facelets lê esses arquivos como ISO-8859-1, os bytes UTF-8 são interpretados errado → é o que embaralha os rótulos do menu.

b) Dessincronia no fluxo de renderização do menu (MenuDAOSirot / GJ4D): possível conversão dupla entre o encoding da String Java e o charset declarado no cabeçalho HTTP/HTML.

3. Ações recomendadas (desenvolvimento)

Converter os 19 .xhtml de UTF-8 → ISO-8859-1 no Git e forçar ISO-8859-1 no editor/IDE para .xhtml e .properties.
Revisar no parser da GJ4D (SirotProcessar / MenuDAOSirot) e no template principal (default.jsp / <f:view> / <meta>) se não há conversão explícita de UTF-8 sobre uma String já decodificada em ISO-8859-1.

4. Observação
O mesmo comportamento aparece no legado, então não é regressão da migração — é encoding de artefato/código, pré-existente, que a migração para o EAP 7.4 (leitura mais estrita do Facelets) deixou visível. Não é pendência da esteira.

Lista dos 19 .xhtml a converter:

WEB-INF/facelet/guia/guiaFederalINSS.xhtml
WEB-INF/facelet/guia/guiaFederalSRF.xhtml
consulta-gerencial/manutencao-forme-reinf/filtro.xhtml
contas-depositos-levantamentos/consulta-precatorio-rpv/destinacaoRecurso.xhtml
contas-depositos-levantamentos/consulta-precatorio-rpv/lista.xhtml
contas-depositos-levantamentos/consulta-precatorio-rpv/mensagemSelecaoContaFalecimento.xhtml
contas-depositos-levantamentos/consulta-precatorio-rpv/mensagemSelecaoSacadorCessionario.xhtml
contas-depositos-levantamentos/contas/abertura-de-contas/formularioNovoProcessoLegado.xhtml
contas-depositos-levantamentos/contas/consulta-retirada-restricao/breadcrumb.xhtml
contas-depositos-levantamentos/contas/consulta-retirada-restricao/consulta.xhtml
contas-depositos-levantamentos/contas/consulta-retirada-restricao/filtro.xhtml
parametros-de-negocio/relacionamento-tribunal-conta-passagem/listaHistorico.xhtml
parametros-de-negocio/relacionamento-tribunal-unidade/mensagemCadastrarFaixaContas.xhtml
precatorio-e-rpv/cancelamento-precatorio/lista.xhtml
precatorio-e-rpv/consulta-contas-vinculadas/filtro.xhtml
precatorio-e-rpv/consulta-contas-vinculadas/lista.xhtml
tabela-de-apoio/orgaos-lei1209909/breadcrumb.xhtml
tabela-de-apoio/parametros/faixa-de-contas/listaFaixa.xhtml
tabela-de-apoio/parametros/log-de-erros/relatorio.xhtml

Quer que eu deixe uma versão mais curta (só o resumo + as 3 ações), pra mandar primeiro, e esse completo como detalhamento?
