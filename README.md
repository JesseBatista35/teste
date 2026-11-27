 
 
 
 
[SIGSJ Intranet - JBoss EAP 7.4] Diagnóstico Técnico de Codificação de Caracteres (ISO-8859-1 vs. UTF-8)
 
1. Contexto e Comportamento Observado
Após a estabilização da comunicação com o Mainframe (SIROT) no ambiente de desenvolvimento (caddeapllx955), identificou-se que a aplicação apresenta falha de renderização de caracteres acentuados (ex.: ConvÔnios, DepÓsitos, PrecatÓrio, NegÓcio, ContÁbil) nos rótulos dinâmicos do menu lateral e em telas específicas, enquanto textos estáticos do cabeçalho da página (ex.: Função, Versão) são exibidos corretamente.
 
 
2. Auditoria da Camada de Infraestrutura e Configuração
Foi realizada a auditoria completa de codificação em todas as camadas do servidor (caddeapllx955) e nos descritores da aplicação, confirmando que o ambiente está integralmente padronizado em ISO-8859-1 (padrão exigido para integração com o Mainframe/COBOL):
 
Camada / Componente	Parâmetro / Configuração	Valor Verificado
JVM (JBoss EAP 7.4)	-Dfile.encoding	ISO-8859-1
Subsistema de reboque	default-encoding( servlet-container=default)	ISO-8859-1
Descritor Web (web.xml)	facelets.encoding	ISO-8859-1
Construir Maven ( pom.xml)	project.build.sourceEncoding	ISO-8859-1
SIROT Retornar ( GJ4D)	Payload bruto da descida (Mainframe)	Bytes emISO-8859-1
 
3. Causa Raiz (Evidências Extraídas do Artefato Implantado)
A divergência ocorre na camada de apresentação/código-fonte da aplicação por dois fatores comprovados no pacote sigsj_intranet.war:
 
Arquivos .xhtml salvos fisicamente em UTF-8 no repositório:
Apesar de o pom.xml e o web.xml declararem ISO-8859-1, a inspeção via file -i nos arquivos empacotados dentro do WAR comprovou que 19 arquivos .xhtml foram salvos em charset=utf-8. Quando o Facelets realiza a leitura desses arquivos utilizando facelets.encoding=ISO-8859-1, os bytes multibyte UTF-8 são interpretados incorretamente como caracteres Latin-1.
Dupla conversão / dessincronia no fluxo de renderização do Menu (MenuDAOSirot / transação GJ4D):
Nos logs de execução da transação GJ4D ([SIROT-DIAG]), o Mainframe envia os bytes originais em ISO-8859-1 (ex.: byte 0xEA para ê em Convênio e 0xE1 para á em Análise). Contudo, durante o ciclo de renderização JSF/RichFaces (default.jsp / template do menu), ocorre dessincronia entre o encoding lido da String Java e o charset declarado no cabeçalho HTTP/HTML entregue ao navegador.
 
 
4. Ações Recomendadas para o Time de Desenvolvimento
Padronizar a codificação dos templates para ISO-8859-1 no Git:
Converter os 19 arquivos .xhtml abaixo de UTF-8 para ISO-8859-1 (e configurar o editor/IDE do projeto para forçar ISO-8859-1 em arquivos .xhtml e .properties):
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
Revisar a conversão de encoding no parser SIROT / template principal (default.jsp):
Verificar no parser de resposta da transação GJ4D (SirotProcessar / MenuDAOSirot) e nas tags <meta http-equiv="Content-Type"> / <f:view> do layout principal se não há conversão explícita de UTF-8 sobre uma String já decodificada em ISO-8859-1 pela JVM.
 
 
 
 
 
 
 
