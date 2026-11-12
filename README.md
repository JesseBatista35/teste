
Publish Quality Gate Result

View raw log

Starting: Publish Quality Gate Result
==============================================================================
Task         : Bash
Description  : Run a Bash script on macOS, Linux, or Windows
Version      : 3.227.0
Author       : Microsoft Corporation
Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
==============================================================================
Generating script.
========================== Starting Command Output ===========================
/usr/bin/bash /opt/ads-agent/_work/_temp/00090833-e1ce-4e4a-ad4f-908cee33d27b.sh
QG Script --> Using SonarQube instance http://sonar-esteira.apps.produtos4.caixa
QG Script --> Using SonarQube access login ads-sa
QG Script --> Using task id of AaHQMvC4Pmqzl3Vc69nb
QG Script --> Status of SonarQube task is PENDING
QG Script --> Status of SonarQube task is IN_PROGRESS
QG Script --> Status of SonarQube task is IN_PROGRESS
QG Script --> Status of SonarQube task is IN_PROGRESS
QG Script --> Status of SonarQube task is IN_PROGRESS
QG Script --> Status of SonarQube task is IN_PROGRESS
QG Script --> Status of SonarQube task is IN_PROGRESS
QG Script --> Status of SonarQube task is IN_PROGRESS
QG Script --> Status of SonarQube task is IN_PROGRESS
QG Script --> Status of SonarQube task is IN_PROGRESS
QG Script --> Status of SonarQube task is IN_PROGRESS
QG Script --> Status of SonarQube task is IN_PROGRESS
QG Script --> Status of SonarQube task is IN_PROGRESS
QG Script --> Status of SonarQube task is IN_PROGRESS
QG Script --> Status of SonarQube task is IN_PROGRESS
QG Script --> Status of SonarQube task is IN_PROGRESS
QG Script --> Status of SonarQube task is IN_PROGRESS
QG Script --> Status of SonarQube task is IN_PROGRESS
QG Script --> Status of SonarQube task is IN_PROGRESS
QG Script --> Status of SonarQube task is IN_PROGRESS
QG Script --> Status of SonarQube task is SUCCESS
QG Script --> Using analysis id of AaHQMwwXFkwt0Lh6TEyv
QG Script --> Quality Gate status is ERROR
##[error]QG Script --> Ocorrência prevista na TE102 - Não atendimento aos critérios de qualidade
##[error]Bash exited with code '1'.
Finishing: Publish Quality Gate Result



Skip to main content
Logo, link to homepage
Projects
Issues
Rules
Quality Profiles
Quality Gates

Search for projects...
JM
SIEMP-java-web


develop
Last analysis of this Branch had 3 warnings
November 12, 2026 at 11:37 AM
Version 14.37.0.6

Overview
Issues
Security Hotspots
Measures
Code
Activity
Project Information
To benefit from more of SonarQube's features, ask a project administrator to set up DevOps platform integration.

Quality Gate Status
Failed
3 conditions failed
The quality gate used by this project does not comply with Clean as You Code.
Fixing this quality gate will help you achieve a Clean Code state.

Learn why
2 condition(s) failed on new code
0.0%
Coverage on New Codeis less than 80.0%
1
New Critical Issuesis greater than 0
1 condition(s) failed on overall code
16,702
Critical Issuesis greater than 16,701
Fix issues before they fail your Quality Gate with SonarLint in your IDE. Power up with connected mode!
Measures

New Code
From last 424 days

Overall Code
0
New Bugs
Reliability
A
0
New Vulnerabilities
Security
A
0
New Security Hotspots
Reviewed
Security Review
A
2min
Added Debt
1
New Code Smells
Maintainability
A
0.0%
Coverage on 7 New Lines to cover
0.0%
Duplications on 48 New Lines
Activity
Choose graph type
Issues
Bugs
Code Smells
Vulnerabilities
new code
0
20k
40k
60k
80k
Sat 07
Nov 08
Mon 09
Tue 10
Wed 11
Activity
November 12, 2026 at 11:37 AM
14.37.0.6
Quality Gate: Failed
SonarQube™ technology is powered by SonarSource SA
Community Editionv9.9.5 (build 90363)NO LONGER ACTIVELGPL v3CommunityDocumentationPluginsWeb API

Skip to main contentSkip to issue filters
Logo, link to homepage
Projects
Issues
Rules
Quality Profiles
Quality Gates

Search for projects...
JM
SIEMP-java-web


develop
Last analysis of this Branch had 3 warnings
November 12, 2026 at 11:37 AM
Version 14.37.0.6

Overview
Issues
Security Hotspots
Measures
Code
Activity
Project Information
Issues
My Issues
All
Clear All Filters
Filters

Issues in new code
Type
Bug
Clear

Bug
17k

Vulnerability
1

Code Smell
90k
Press Ctrl to add to selection
Severity

Blocker
430

Minor
19

Critical
16k

Info
0

Major
547
Scope
Resolution
Status
Security Category
Creation Date
Language
Rule
Tag
Directory
File
Assignee
Author
Bulk Change
↑
←↓→
1 / 16,780issues
136d effort
List of issues
siemp-web/.../bsb/fsw/jmainframe/connection/Connection.java
Use try-with-resources or close this "BufferedReader" in a "finally" clause.

10 days ago
L250

Bug

Blocker

Open

Not assigned
5min effort

Comment

cert, cwe, denial-of-service, leak
siemp-web/.../politec/bsb/fsw/jmainframe/xml/Group.java
A "NullPointerException" could be thrown; "returnType" is nullable here.

10 days ago
L85

Bug

Major

Open

Not assigned
10min effort

Comment

cert, cwe
Use an "instanceof" comparison instead.

10 days ago
L85

Bug

Major

Open

Not assigned
5min effort

Comment

cert, cwe
Use an "instanceof" comparison instead.

10 days ago
L93

Bug

Major

Open

Not assigned
5min effort

Comment

cert, cwe
Use an "instanceof" comparison instead.

10 days ago
L101

Bug

Major

Open

Not assigned
5min effort

Comment

cert, cwe
Use an "instanceof" comparison instead.

10 days ago
L108

Bug

Major

Open

Not assigned
5min effort

Comment

cert, cwe
Use an "instanceof" comparison instead.

10 days ago
L116

Bug

Major

Open

Not assigned
5min effort

Comment

cert, cwe
Use an "instanceof" comparison instead.

10 days ago
L125

Bug

Major

Open

Not assigned
5min effort

Comment

cert, cwe
Use an "instanceof" comparison instead.

10 days ago
L133

Bug

Major

Open

Not assigned
5min effort

Comment

cert, cwe
Use an "instanceof" comparison instead.

10 days ago
L141

Bug

Major

Open

Not assigned
5min effort

Comment

cert, cwe
Use an "instanceof" comparison instead.

10 days ago
L149

Bug

Major

Open

Not assigned
5min effort

Comment

cert, cwe
Use an "instanceof" comparison instead.

10 days ago
L153

Bug

Major

Open

Not assigned
5min effort

Comment

cert, cwe
A "NullPointerException" could be thrown; "returnType" is nullable here.

10 days ago
L264

Bug

Major

Open

Not assigned
10min effort

Comment

cert, cwe
Use an "instanceof" comparison instead.

10 days ago
L264

Bug

Major

Open

Not assigned
5min effort

Comment

cert, cwe
Use an "instanceof" comparison instead.

10 days ago
L276

Bug

Major

Open

Not assigned
5min effort

Comment

cert, cwe
Use an "instanceof" comparison instead.

10 days ago
L288

Bug

Major

Open

Not assigned
5min effort

Comment

cert, cwe
Use an "instanceof" comparison instead.

10 days ago
L297

Bug

Major

Open

Not assigned
5min effort

Comment

cert, cwe
Use an "instanceof" comparison instead.

10 days ago
L307

Bug

Major

Open

Not assigned
5min effort

Comment

cert, cwe
Use an "instanceof" comparison instead.

10 days ago
L320

Bug

Major

Open

Not assigned
5min effort

Comment

cert, cwe
Use an "instanceof" comparison instead.

10 days ago
L333

Bug

Major

Open

Not assigned
5min effort

Comment

cert, cwe
Use an "instanceof" comparison instead.

10 days ago
L343

Bug

Major

Open

Not assigned
5min effort

Comment

cert, cwe
Use an "instanceof" comparison instead.

10 days ago
L353

Bug

Major

Open

Not assigned
5min effort

Comment

cert, cwe
Use an "instanceof" comparison instead.

10 days ago
L361

Bug

Major

Open

Not assigned
5min effort

Comment

cert, cwe
siemp-web/.../politec/bsb/fsw/jmainframe/xml/XMLProgramAnalyzer.java
A "NullPointerException" could be thrown; "scenarios" is nullable here.

10 days ago
L96

Bug

Major

Open

Not assigned
10min effort

Comment

cert, cwe
siemp-web/.../mantemvinculaemailproduto/VinculaEmailaoProdutoACT.java
Strings and Boxed types should be compared using "equals()".

10 days ago
L62

Bug

Major

Open

Not assigned
5min effort

Comment

cert, cwe
Strings and Boxed types should be compared using "equals()".

10 days ago
L65

Bug

Major

Open

Not assigned
5min effort

Comment

cert, cwe
siemp-web/.../apresentacao/mantertabelas/ManterTabelaForm.java
Strings and Boxed types should be compared using "equals()".

10 days ago
L1686

Bug

Major

Open

Not assigned
5min effort

Comment

cert, cwe
siemp-web/.../mantertabelas/controlartabelas/ControlarTabelasForm.java
A "NullPointerException" could be thrown; "noTabela" is nullable here.

10 days ago
L136

Bug

Major

Open

Not assigned
10min effort

Comment

cert, cwe
siemp-web/.../mantertabelas/controlartabelas/MantemTabelasPGPAFAbstractACT.java
A "NullPointerException" could be thrown; "listaNomeProduto" is nullable here.

10 days ago
L37

Bug

Major

Open

Not assigned
10min effort

Comment

cert, cwe
A "NullPointerException" could be thrown; "listaNoRegiao" is nullable here.

10 days ago
L38

Bug

Major

Open

Not assigned
10min effort

Comment

cert, cwe
A "NullPointerException" could be thrown; "listaNuProduto" is nullable here.

10 days ago
L38

Bug

Major

Open

Not assigned
10min effort

Comment

cert, cwe
A "NullPointerException" could be thrown; "listaVrUnitario" is nullable here.

10 days ago
L39

Bug

Major

Open

Not assigned
10min effort

Comment

cert, cwe
A "NullPointerException" could be thrown; "listaUf" is nullable here.

10 days ago
L39

Bug

Major

Open

Not assigned
10min effort

Comment

cert, cwe
A "NullPointerException" could be thrown; "listaNuRegiao" is nullable here.

10 days ago
L39

Bug

Major

Open

Not assigned
10min effort

Comment

cert, cwe
siemp-web/.../mantertabelas/controlartabelas/ManterParametrosHelper.java
This class overrides "equals()" and should therefore also override "hashCode()".

10 days ago
L645

Bug

Minor

Open

Not assigned
15min effort

Comment

cert, cwe
siemp-web/.../mantertabelas/manterestatuto/ManterEstatutoCRUDAction.java
Correct one of the identical sub-expressions on both sides of operator "<="

10 days ago
L87

Bug

Major

Open

Not assigned
2min effort

Comment

cert
Correct one of the identical sub-expressions on both sides of operator "<="

10 days ago
L88

Bug

Major

Open

Not assigned
2min effort

Comment

cert
siemp-web/.../manterpercentualdetaxasdejuros/ManterPercentualDeTaxasDeJurosForm.java
Cast one of the operands of this division operation to a "double".

10 days ago
L421

Bug

Minor

Open

Not assigned
5min effort

Comment

cert, cwe, overflow, sans-top25-risky
siemp-web/.../tabela/TabelaDeTaxaFaixaDeValor.java
Either override Object.equals(Object), or rename the method to prevent any confusion.

10 days ago
L178

Bug

Major

Open

Not assigned
10min effort

Comment

suspicious
siemp-web/.../mantertabelas/manterproduto/ManterProdutoForm.java
Introduce a new variable instead of reusing the parameter "estilo".

10 days ago
L243

Bug

Minor

Open

Not assigned
5min effort

Comment

No tags
siemp-web/.../mantertabelas/manterprodutosci/ManterProdutoSCICRUDForm.java
This conditional operation returns the same value whether the condition is "true" or "false".

10 days ago
L130

Bug

Major

Open

Not assigned
15min effort

Comment

No tags
siemp-web/.../consultaTabelaDeTACDeConvenio/ConsultaTabelaDeTACDeConvenioBD.java
A "NullPointerException" could be thrown; "faixaValor" is nullable here.

10 days ago
L70

Bug

Major

Open

Not assigned
10min effort

Comment

cert, cwe
siemp-web/.../ConsultaTabelaDeTaxasDeConvenioBD.java
A "NullPointerException" could be thrown; "faixaValor" is nullable here.

10 days ago
L85

Bug

Major

Open

Not assigned
10min effort

Comment

cert, cwe
siemp-web/.../ComandarParcelaEmProcessamentoACT.java
"NullPointerException" will be thrown when invoking method "setHelper()".

10 days ago
L93

Bug

Major

Open

Not assigned
10min effort

Comment

cert, cwe
"NullPointerException" will be thrown when invoking method "setHelper()".

10 days ago
L134

Bug

Major

Open

Not assigned
10min effort

Comment

cert, cwe
siemp-web/.../comandarrecebimentotemporeal/ComandarRecebimentoTempoRealACT.java
"NullPointerException" will be thrown when invoking method "setHelper()".

10 days ago
L97

Bug

Major

Open

Not assigned
10min effort

Comment

cert, cwe
"NullPointerException" will be thrown when invoking method "setHelper()".

10 days ago
L148

Bug

Major

Open

Not assigned
10min effort

Comment

cert, cwe
"NullPointerException" will be thrown when invoking method "setHelper()".

10 days ago
L179

Bug

Major

Open

Not assigned
10min effort

Comment

cert, cwe
"NullPointerException" will be thrown when invoking method "setHelper()".

10 days ago
L352

Bug

Major

Open

Not assigned
10min effort

Comment

cert, cwe
"NullPointerException" will be thrown when invoking method "setHelper()".

10 days ago
L355

Bug

Major

Open

Not assigned
10min effort

Comment

cert, cwe
"NullPointerException" will be thrown when invoking method "setHelper()".

10 days ago
L396

Bug

Major

Open

Not assigned
10min effort

Comment

cert, cwe
Remove this conditional structure or edit its code blocks so that they're not all the same.

10 days ago
L595

Bug

Major

Open

Not assigned
15min effort

Comment

No tags
Remove this conditional structure or edit its code blocks so that they're not all the same.

10 days ago
L601

Bug

Major

Open

Not assigned
15min effort

Comment

No tags
siemp-web/.../comandavaloresrestituir/ComandaValoresRestituirHelper.java
Remove this call to "equals"; comparisons between unrelated types always return false.

10 days ago
L482

Bug

Major

Open

Not assigned
15min effort

Comment

cert, unused
siemp-web/.../ConsultarAgendamentoIndenizacoesHelper.java
Correct one of the identical sub-expressions on both sides of operator "&&"

10 days ago
L188

Bug

Major

Open

Not assigned
2min effort

Comment

cert
siemp-web/.../consultarparcelascontrato/ConsultarParcelasContratoACT.java
Strings and Boxed types should be compared using "equals()".

10 days ago
L98

Bug

Major

Open

Not assigned
5min effort

Comment

cert, cwe
Strings and Boxed types should be compared using "equals()".

10 days ago
L134

Bug

Major

Open

Not assigned
5min effort

Comment

cert, cwe
siemp-web/.../consultarposicaodivida/ConsultarPosicaoDividaACT.java
A "NullPointerException" could be thrown; "parcela" is nullable here.

10 days ago
L760

Bug

Major

Open

Not assigned
10min effort

Comment

cert, cwe
siemp-web/.../estornarconcessaoemprestimo/EstornarConcessaoEmprestimoACT.java
Use try-with-resources or close this "PreparedStatement" in a "finally" clause.

10 days ago
L167

Bug

Blocker

Open

Not assigned
5min effort

Comment

cert, cwe, denial-of-service, leak
siemp-web/.../evolucao/estornarpagamento/EstornarPagamentoACT.java
Use try-with-resources or close this "PreparedStatement" in a "finally" clause.

10 days ago
L569

Bug

Blocker

Open

Not assigned
5min effort

Comment

cert, cwe, denial-of-service, leak
siemp-web/.../gerardocumentodeparcelaonline/GerarDocumentoParcelaOnLineHelper.java
Remove this call to "equals"; comparisons between unrelated types always return false.

10 days ago
L68

Bug

Major

Open

Not assigned
15min effort

Comment

cert, unused
siemp-web/.../gerarparcelaamortizacao/GerarParcelaAmortizacaoACT.java
A "NullPointerException" could be thrown; "parcela" is nullable here.

10 days ago
L275

Bug

Major

Open

Not assigned
10min effort

Comment

cert, cwe
siemp-web/.../manterinformacoesseguradora/ManterInformacoesSeguradoraACT.java
Change this condition so that it does not always evaluate to "false"

10 days ago
L418

Bug

Major

Open

Not assigned
15min effort

Comment

cert, cwe, pitfall, suspicious, unused
siemp-web/.../caixa/siemp/comum/apresentacao/ManterTabelaForm.java
Strings and Boxed types should be compared using "equals()".

10 days ago
L1693

Bug

Major

Open

Not assigned
5min effort

Comment

cert, cwe
siemp-web/.../caixa/siemp/comum/apresentacao/SiempAction.java
Remove this misleading mutable servlet instance field or make it "static" and/or "final"

10 days ago
L57

Bug

Major

Open

Not assigned
30min effort

Comment

cert, multi-threading, struts
Remove this misleading mutable servlet instance field or make it "static" and/or "final"

10 days ago
L59

Bug

Major

Open

Not assigned
30min effort

Comment

cert, multi-threading, struts
Remove this misleading mutable servlet instance field or make it "static" and/or "final"

10 days ago
L61

Bug

Major

Open

Not assigned
30min effort

Comment

cert, multi-threading, struts
Remove this misleading mutable servlet instance field or make it "static" and/or "final"

10 days ago
L63

Bug

Major

Open

Not assigned
30min effort

Comment

cert, multi-threading, struts
Remove this misleading mutable servlet instance field or make it "static" and/or "final"

10 days ago
L65

Bug

Major

Open

Not assigned
30min effort

Comment

cert, multi-threading, struts
Remove this misleading mutable servlet instance field or make it "static" and/or "final"

10 days ago
L67

Bug

Major

Open

Not assigned
30min effort

Comment

cert, multi-threading, struts
Remove this misleading mutable servlet instance field or make it "static" and/or "final"

10 days ago
L69

Bug

Major

Open

Not assigned
30min effort

Comment

cert, multi-threading, struts
Remove this misleading mutable servlet instance field or make it "static" and/or "final"

10 days ago
L71

Bug

Major

Open

Not assigned
30min effort

Comment

cert, multi-threading, struts
Change this condition so that it does not always evaluate to "false"

10 days ago
L596

Bug

Major

Open

Not assigned
15min effort

Comment

cert, cwe, pitfall, suspicious, unused
siemp-web/.../caixa/siemp/comum/apresentacao/SiempActionFormPaginador.java
The size of a collection is always ">=0", so update this test to use isEmpty().

10 days ago
L44

Bug

Major

Open

Not assigned
2min effort

Comment

No tags
siemp-web/.../caixa/siemp/comum/apresentacao/SiempTransfereEntreListasAction.java
Use "Arrays.hashCode(array)" instead.

10 days ago
L723

Bug

Major

Open

Not assigned
5min effort

Comment

No tags
siemp-web/.../apresentacao/analisarcliente/AnalisarClienteAction.java
The return value of "get" must be used.

10 days ago
L355

Bug

Major

Open

Not assigned
10min effort

Comment

cert
siemp-web/.../apresentacao/analisarcliente/AnalisarClienteForm.java
Remove or correct this useless self-assignment.

10 days ago
L784

Bug

Major

Open

Not assigned
3min effort

Comment

cert
siemp-web/.../manterindicadoreseconomicos/ManterCotacaoIndicadorEconomicoAction.java
Strings and Boxed types should be compared using "equals()".

10 days ago
L88

Bug

Major

Open

Not assigned
5min effort

Comment

cert, cwe
Strings and Boxed types should be compared using "equals()".

10 days ago
L91

Bug

Major

Open

Not assigned
5min effort

Comment

cert, cwe
siemp-web/.../siemp/comum/filtros/formatador/FormatadorDeRotulo.java
A "NullPointerException" could be thrown; "retorno" is nullable here.

10 days ago
L61

Bug

Major

Open

Not assigned
10min effort

Comment

cert, cwe
The return value of "hashCode" must be used.

10 days ago
L126

Bug

Major

Open

Not assigned
10min effort

Comment

cert
siemp-web/.../siemp/comum/gerentedeconexao/SiempConnection.java
Use try-with-resources or close this "BufferedReader" in a "finally" clause.

10 days ago
L73

Bug

Blocker

Open

Not assigned
5min effort

Comment

cert, cwe, denial-of-service, leak
siemp-web/.../gov/caixa/siemp/comum/helper/ManterParametrosHelper.java
This class overrides "equals()" and should therefore also override "hashCode()".

10 days ago
L645

Bug

Minor

Open

Not assigned
15min effort

Comment

cert, cwe
siemp-web/.../gov/caixa/siemp/comum/negocio/AtribuirDominiosAoProdutoModel.java
Cast one of the operands of this division operation to a "double".

10 days ago
L135

Bug

Minor

Open

Not assigned
5min effort

Comment

cert, cwe, overflow, sans-top25-risky
siemp-web/.../gov/caixa/siemp/comum/negocio/ManterCotacaoIndicadorEconomico.java
The return value of "substring" must be used.

10 days ago
L40

Bug

Major

Open

Not assigned
10min effort

Comment

cert
Fix the syntax error inside this regex.

10 days ago
L68

Bug

Critical

Open

Not assigned
15min effort

Comment

regex
siemp-web/.../gov/caixa/siemp/comum/negocio/ManterTaxasDeJuros.java
A "NullPointerException" could be thrown; "faixaDeValores" is nullable here.

10 days ago
L95

Bug

Major

Open

Not assigned
10min effort

Comment

cert, cwe
A "NullPointerException" could be thrown; "faixaDePrazos" is nullable here.

10 days ago
L108

Bug

Major

Open

Not assigned
10min effort

Comment

cert, cwe
A "NullPointerException" could be thrown; "faixaDeValores" is nullable here.

10 days ago
L115

Bug

Major

Open

Not assigned
10min effort

Comment

cert, cwe
siemp-web/.../caixa/siemp/comum/persistencia/ListarAgrupadorTabelaDAO.java
A "NullPointerException" could be thrown; "inputParams" is nullable here.

10 days ago
L65

Bug

Major

Open

Not assigned
10min effort

Comment

cert, cwe
siemp-web/.../caixa/siemp/comum/persistencia/ManterTabelaDaoMOCK.java
A "NullPointerException" could be thrown; "retorno" is nullable here.

10 days ago
L82

Bug

Major

Open

Not assigned
10min effort

Comment

cert, cwe
A "NullPointerException" could be thrown; "retorno" is nullable here.

10 days ago
L97

Bug

Major

Open

Not assigned
10min effort

Comment

cert, cwe
A "NullPointerException" could be thrown; "retorno" is nullable here.

10 days ago
L112

Bug

Major

Open

Not assigned
10min effort

Comment

cert, cwe
siemp-web/.../br/gov/caixa/siemp/comum/util/DataUtil.java
Cast one of the operands of this multiplication operation to a "long".

10 days ago
L192

Bug

Minor

Open

Not assigned
5min effort

Comment

cert, cwe, overflow, sans-top25-risky
Cast one of the operands of this multiplication operation to a "long".

10 days ago
L196

Bug

Minor

Open

Not assigned
5min effort

Comment

cert, cwe, overflow, sans-top25-risky
Cast one of the operands of this multiplication operation to a "long".

10 days ago
L200

Bug

Minor

Open

Not assigned
5min effort

Comment

cert, cwe, overflow, sans-top25-risky
Cast one of the operands of this multiplication operation to a "long".

10 days ago
L204

Bug

Minor

Open

Not assigned
5min effort

Comment

cert, cwe, overflow, sans-top25-risky
A "NullPointerException" could be thrown; "dataA" is nullable here.

10 days ago
L250

Bug

Major

Open

Not assigned
10min effort

Comment

cert, cwe
siemp-web/.../br/gov/caixa/siemp/comum/util/Formatacao.java
Remove this "substring" call; it has predictable results.

10 days ago
L76

Bug

Major

Open

Not assigned
5min effort

Comment

clumsy
Only the sign of the result should be examined.

10 days ago
L405

Bug

Minor

Open

Not assigned
5min effort

Comment

unpredictable
100 of 16,780 shownShow More
SonarQube™ technology is powered by SonarSource SA
Community Editionv9.9.5 (build 90363)NO LONGER ACTIVELGPL v3CommunityDocumentationPluginsWeb API


Skip to main contentSkip to issue filters
Logo, link to homepage
Projects
Issues
Rules
Quality Profiles
Quality Gates

Search for projects...
JM
SIEMP-java-web


develop
Last analysis of this Branch had 3 warnings
November 12, 2026 at 11:37 AM
Version 14.37.0.6

Overview
Issues
Security Hotspots
Measures
Code
Activity
Project Information
Issues
My Issues
All
Clear All Filters
Filters

Issues in new code
Type
Bug
Clear

Bug
430

Vulnerability
0

Code Smell
24
Press Ctrl to add to selection
Severity
Blocker
Clear

Blocker
430

Minor
19

Critical
16k

Info
0

Major
547
Press Ctrl to add to selection
Scope
Resolution
Status
Security Category
Creation Date
Language
Rule
Tag
Directory
File
Assignee
Author
Bulk Change
↑
←↓→
1 / 430issues
2d 2h effort
List of issues
siemp-web/.../bsb/fsw/jmainframe/connection/Connection.java
Use try-with-resources or close this "BufferedReader" in a "finally" clause.

10 days ago
L250

Bug

Blocker

Open

Not assigned
5min effort

Comment

cert, cwe, denial-of-service, leak
siemp-web/.../estornarconcessaoemprestimo/EstornarConcessaoEmprestimoACT.java
Use try-with-resources or close this "PreparedStatement" in a "finally" clause.

10 days ago
L167

Bug

Blocker

Open

Not assigned
5min effort

Comment

cert, cwe, denial-of-service, leak
siemp-web/.../evolucao/estornarpagamento/EstornarPagamentoACT.java
Use try-with-resources or close this "PreparedStatement" in a "finally" clause.

10 days ago
L569

Bug

Blocker

Open

Not assigned
5min effort

Comment

cert, cwe, denial-of-service, leak
siemp-web/.../siemp/comum/gerentedeconexao/SiempConnection.java
Use try-with-resources or close this "BufferedReader" in a "finally" clause.

10 days ago
L73

Bug

Blocker

Open

Not assigned
5min effort

Comment

cert, cwe, denial-of-service, leak
siemp-web/.../br/gov/caixa/siemp/comum/util/UtilGerarRelatorio.java
Use try-with-resources or close this "InputStream" in a "finally" clause.

10 days ago
L106

Bug

Blocker

Open

Not assigned
5min effort

Comment

cert, cwe, denial-of-service, leak
Use try-with-resources or close this "BufferedReader" in a "finally" clause.

10 days ago
L107

Bug

Blocker

Open

Not assigned
5min effort

Comment

cert, cwe, denial-of-service, leak
Use try-with-resources or close this "FileOutputStream" in a "finally" clause.

10 days ago
L161

Bug

Blocker

Open

Not assigned
5min effort

Comment

cert, cwe, denial-of-service, leak
Use try-with-resources or close this "OutputStreamWriter" in a "finally" clause.

10 days ago
L162

Bug

Blocker

Open

Not assigned
5min effort

Comment

cert, cwe, denial-of-service, leak
siemp-web/.../br/gov/caixa/siemp/comum/util/UtilString.java
Use try-with-resources or close this "FileWriter" in a "finally" clause.

10 days ago
L396

Bug

Blocker

Open

Not assigned
5min effort

Comment

cert, cwe, denial-of-service, leak
siemp-web/.../siemp/concessao/persistencia/AvaliacaoDeRiscoDAO.java
Use try-with-resources or close this "Statement" in a "finally" clause.

10 days ago
L260

Bug

Blocker

Open

Not assigned
5min effort

Comment

cert, cwe, denial-of-service, leak
Use try-with-resources or close this "PreparedStatement" in a "finally" clause.

10 days ago
L583

Bug

Blocker

Open

Not assigned
5min effort

Comment

cert, cwe, denial-of-service, leak
ResultSet indices start at 1.

10 days ago
L601

Bug

Blocker

Open

Not assigned
2min effort

Comment

sql
siemp-web/.../framework/apresentacao/tag/HelpContextoTag.java
Use try-with-resources or close this "InputStream" in a "finally" clause.

10 days ago
L42

Bug

Blocker

Open

Not assigned
5min effort

Comment

cert, cwe, denial-of-service, leak
siemp-web/src/main/webapp/SessionIntrospection.jsp
Add "lang" and/or "xml:lang" attributes to this "<html>" element

10 days ago
L3

Bug

Blocker

Open

Not assigned
2min effort

Comment

accessibility, wcag2-a
Add a <title> tag to this page.

10 days ago
L3

Bug

Blocker

Open

Not assigned
5min effort

Comment

user-experience
siemp-web/.../main/webapp/WEB-INF/jsp/comum/relatorioCET.jsp
Add "lang" and/or "xml:lang" attributes to this "<html>" element

10 days ago
L11

Bug

Blocker

Open

Not assigned
2min effort

Comment

accessibility, wcag2-a
siemp-web/.../formalizar/creditoRural/popupCODCOA.jsp
Add "lang" and/or "xml:lang" attributes to this "<html>" element

10 days ago
L10

Bug

Blocker

Open

Not assigned
2min effort

Comment

accessibility, wcag2-a
siemp-web/.../formalizar/creditoRural/popupErros.jsp
Add "lang" and/or "xml:lang" attributes to this "<html>" element

10 days ago
L12

Bug

Blocker

Open

Not assigned
2min effort

Comment

accessibility, wcag2-a
siemp-web/.../formalizar/creditoRural/popupErrosSIORM.jsp
Add "lang" and/or "xml:lang" attributes to this "<html>" element

10 days ago
L12

Bug

Blocker

Open

Not assigned
2min effort

Comment

accessibility, wcag2-a
siemp-web/.../consisteParametrizacaoConvenio/EMPPWI18.jsp
Add "lang" and/or "xml:lang" attributes to this "<html>" element

10 days ago
L14

Bug

Blocker

Open

Not assigned
2min effort

Comment

accessibility, wcag2-a
siemp-web/.../consisteParametrizacaoConvenio/impresssao.jsp
Add "lang" and/or "xml:lang" attributes to this "<html>" element

10 days ago
L13

Bug

Blocker

Open

Not assigned
2min effort

Comment

accessibility, wcag2-a
siemp-web/.../consisteParametrizacaoConvenio/impresssaoPopup.jsp
Add "lang" and/or "xml:lang" attributes to this "<html>" element

10 days ago
L15

Bug

Blocker

Open

Not assigned
2min effort

Comment

accessibility, wcag2-a
siemp-web/.../emitirContratoConvenio/representanteCaixa.jsp
Add "lang" and/or "xml:lang" attributes to this "<html>" element

10 days ago
L14

Bug

Blocker

Open

Not assigned
2min effort

Comment

accessibility, wcag2-a
Add a <title> tag to this page.

10 days ago
L14

Bug

Blocker

Open

Not assigned
5min effort

Comment

user-experience
siemp-web/.../emitirContratoConvenio/sindicato.jsp
Add "lang" and/or "xml:lang" attributes to this "<html>" element

10 days ago
L14

Bug

Blocker

Open

Not assigned
2min effort

Comment

accessibility, wcag2-a
Add a <title> tag to this page.

10 days ago
L14

Bug

Blocker

Open

Not assigned
5min effort

Comment

user-experience
siemp-web/.../emitirRelatorioParametrizacaoConvenio1GerarRelatorio.jsp
Add a <title> tag to this page.

10 days ago
L7

Bug

Blocker

Open

Not assigned
5min effort

Comment

user-experience
siemp-web/.../jsp/consultarComprovacao/consultarSituacaoComprovacao.jsp
Add "lang" and/or "xml:lang" attributes to this "<html>" element

10 days ago
L22

Bug

Blocker

Open

Not assigned
2min effort

Comment

accessibility, wcag2-a
siemp-web/.../jsp/creditorural/proposta/informacoesContrato.jsp
Add "lang" and/or "xml:lang" attributes to this "<html>" element

10 days ago
L36

Bug

Blocker

Open

Not assigned
2min effort

Comment

accessibility, wcag2-a
siemp-web/.../evolucao/acertarrecebimento/consultarMovimentoPesquisa.jsp
Add "lang" and/or "xml:lang" attributes to this "<html>" element

10 days ago
L1

Bug

Blocker

Open

Not assigned
2min effort

Comment

accessibility, wcag2-a
siemp-web/.../evolucao/acertarrecebimento/consultarPosicaoMovimento.jsp
Add "lang" and/or "xml:lang" attributes to this "<html>" element

10 days ago
L1

Bug

Blocker

Open

Not assigned
2min effort

Comment

accessibility, wcag2-a
siemp-web/.../evolucao/acertarrecebimento/detalheResultadoConsultaPosicaoMovimento.jsp
Add "lang" and/or "xml:lang" attributes to this "<html>" element

10 days ago
L1

Bug

Blocker

Open

Not assigned
2min effort

Comment

accessibility, wcag2-a
siemp-web/.../acertarrecebimentoNovo/consultarMovimentoPesquisa.jsp
Add "lang" and/or "xml:lang" attributes to this "<html>" element

10 days ago
L1

Bug

Blocker

Open

Not assigned
2min effort

Comment

accessibility, wcag2-a
siemp-web/.../acertarrecebimentoNovo/consultarPosicaoMovimento.jsp
Add "lang" and/or "xml:lang" attributes to this "<html>" element

10 days ago
L1

Bug

Blocker

Open

Not assigned
2min effort

Comment

accessibility, wcag2-a
siemp-web/.../acertarrecebimentoNovo/detalheResultadoConsultaPosicaoMovimento.jsp
Add "lang" and/or "xml:lang" attributes to this "<html>" element

10 days ago
L1

Bug

Blocker

Open

Not assigned
2min effort

Comment

accessibility, wcag2-a
siemp-web/.../evolucao/agendarindenizacao/AgendarIndenizacao.jsp
Add "lang" and/or "xml:lang" attributes to this "<html>" element

10 days ago
L11

Bug

Blocker

Open

Not assigned
2min effort

Comment

accessibility, wcag2-a
siemp-web/.../WEB-INF/jsp/evolucao/comuns/Cabecalho.jsp
Add "lang" and/or "xml:lang" attributes to this "<html>" element

10 days ago
L14

Bug

Blocker

Open

Not assigned
2min effort

Comment

accessibility, wcag2-a
siemp-web/.../consultarhistoricocontrato/alienacaofiduciariaequipamentos.jsp
Add "lang" and/or "xml:lang" attributes to this "<html>" element

10 days ago
L11

Bug

Blocker

Open

Not assigned
2min effort

Comment

accessibility, wcag2-a
Add a <title> tag to this page.

10 days ago
L11

Bug

Blocker

Open

Not assigned
5min effort

Comment

user-experience
siemp-web/.../consultarhistoricocontrato/alienacaofiduciariaimoveis.jsp
Add "lang" and/or "xml:lang" attributes to this "<html>" element

10 days ago
L11

Bug

Blocker

Open

Not assigned
2min effort

Comment

accessibility, wcag2-a
Add a <title> tag to this page.

10 days ago
L11

Bug

Blocker

Open

Not assigned
5min effort

Comment

user-experience
siemp-web/.../consultarhistoricocontrato/alienacaofiduciariaoutros.jsp
Add "lang" and/or "xml:lang" attributes to this "<html>" element

10 days ago
L11

Bug

Blocker

Open

Not assigned
2min effort

Comment

accessibility, wcag2-a
Add a <title> tag to this page.

10 days ago
L11

Bug

Blocker

Open

Not assigned
5min effort

Comment

user-experience
siemp-web/.../consultarhistoricocontrato/alienacaofiduciariaveiculos.jsp
Add "lang" and/or "xml:lang" attributes to this "<html>" element

10 days ago
L11

Bug

Blocker

Open

Not assigned
2min effort

Comment

accessibility, wcag2-a
Add a <title> tag to this page.

10 days ago
L11

Bug

Blocker

Open

Not assigned
5min effort

Comment

user-experience
siemp-web/.../consultarhistoricocontrato/caucaoaplicacoesfinanceirasrendafixa.jsp
Add "lang" and/or "xml:lang" attributes to this "<html>" element

10 days ago
L11

Bug

Blocker

Open

Not assigned
2min effort

Comment

accessibility, wcag2-a
Add a <title> tag to this page.

10 days ago
L11

Bug

Blocker

Open

Not assigned
5min effort

Comment

user-experience
siemp-web/.../consultarhistoricocontrato/caucaocheques.jsp
Add "lang" and/or "xml:lang" attributes to this "<html>" element

10 days ago
L11

Bug

Blocker

Open

Not assigned
2min effort

Comment

accessibility, wcag2-a
Add a <title> tag to this page.

10 days ago
L11

Bug

Blocker

Open

Not assigned
5min effort

Comment

user-experience
siemp-web/.../consultarhistoricocontrato/caucaoduplicatas.jsp
Add "lang" and/or "xml:lang" attributes to this "<html>" element

10 days ago
L11

Bug

Blocker

Open

Not assigned
2min effort

Comment

accessibility, wcag2-a
Add a <title> tag to this page.

10 days ago
L11

Bug

Blocker

Open

Not assigned
5min effort

Comment

user-experience
siemp-web/.../consultarhistoricocontrato/caucaofaturacartaocredito.jsp
Add "lang" and/or "xml:lang" attributes to this "<html>" element

10 days ago
L11

Bug

Blocker

Open

Not assigned
2min effort

Comment

accessibility, wcag2-a
Add a <title> tag to this page.

10 days ago
L11

Bug

Blocker

Open

Not assigned
5min effort

Comment

user-experience
siemp-web/.../consultarhistoricocontrato/caucaonotaspromissoriasoutrosdireitoscredito.jsp
Add "lang" and/or "xml:lang" attributes to this "<html>" element

10 days ago
L11

Bug

Blocker

Open

Not assigned
2min effort

Comment

accessibility, wcag2-a
Add a <title> tag to this page.

10 days ago
L11

Bug

Blocker

Open

Not assigned
5min effort

Comment

user-experience
siemp-web/.../consultarhistoricocontrato/cessaodireitoscreditoriosaplicacoesfinanceirasrendafixa.jsp
Add "lang" and/or "xml:lang" attributes to this "<html>" element

10 days ago
L11

Bug

Blocker

Open

Not assigned
2min effort

Comment

accessibility, wcag2-a
Add a <title> tag to this page.

10 days ago
L11

Bug

Blocker

Open

Not assigned
5min effort

Comment

user-experience
siemp-web/.../consultarhistoricocontrato/cessaodireitoscreditoriosaplicacoesfinanceirasrendavariavel.jsp
Add "lang" and/or "xml:lang" attributes to this "<html>" element

10 days ago
L11

Bug

Blocker

Open

Not assigned
2min effort

Comment

accessibility, wcag2-a
Add a <title> tag to this page.

10 days ago
L11

Bug

Blocker

Open

Not assigned
5min effort

Comment

user-experience
siemp-web/.../consultarhistoricocontrato/cessaodireitoscreditorioscheques.jsp
Add "lang" and/or "xml:lang" attributes to this "<html>" element

10 days ago
L11

Bug

Blocker

Open

Not assigned
2min effort

Comment

accessibility, wcag2-a
Add a <title> tag to this page.

10 days ago
L11

Bug

Blocker

Open

Not assigned
5min effort

Comment

user-experience
siemp-web/.../consultarhistoricocontrato/cessaodireitoscreditoriosdireitossobrealugueis.jsp
Add "lang" and/or "xml:lang" attributes to this "<html>" element

10 days ago
L11

Bug

Blocker

Open

Not assigned
2min effort

Comment

accessibility, wcag2-a
Add a <title> tag to this page.

10 days ago
L11

Bug

Blocker

Open

Not assigned
5min effort

Comment

user-experience
siemp-web/.../consultarhistoricocontrato/cessaodireitoscreditoriosduplicatas.jsp
Add "lang" and/or "xml:lang" attributes to this "<html>" element

10 days ago
L11

Bug

Blocker

Open

Not assigned
2min effort

Comment

accessibility, wcag2-a
Add a <title> tag to this page.

10 days ago
L11

Bug

Blocker

Open

Not assigned
5min effort

Comment

user-experience
siemp-web/.../consultarhistoricocontrato/cessaodireitoscreditoriosfaturacartaocredito.jsp
Add "lang" and/or "xml:lang" attributes to this "<html>" element

10 days ago
L11

Bug

Blocker

Open

Not assigned
2min effort

Comment

accessibility, wcag2-a
Add a <title> tag to this page.

10 days ago
L11

Bug

Blocker

Open

Not assigned
5min effort

Comment

user-experience
siemp-web/.../consultarhistoricocontrato/cessaodireitoscreditoriosnotaspromissoriasoutrosdireitoscredito.jsp
Add "lang" and/or "xml:lang" attributes to this "<html>" element

10 days ago
L11

Bug

Blocker

Open

Not assigned
2min effort

Comment

accessibility, wcag2-a
Add a <title> tag to this page.

10 days ago
L11

Bug

Blocker

Open

Not assigned
5min effort

Comment

user-experience
siemp-web/.../consultarhistoricocontrato/consultardetalheocorrenciacontrato.jsp
Add "lang" and/or "xml:lang" attributes to this "<html>" element

10 days ago
L1

Bug

Blocker

Open

Not assigned
2min effort

Comment

accessibility, wcag2-a
Add a <title> tag to this page.

10 days ago
L1

Bug

Blocker

Open

Not assigned
5min effort

Comment

user-experience
siemp-web/.../consultarhistoricocontrato/consultarhistoricocontrato.jsp
Add "lang" and/or "xml:lang" attributes to this "<html>" element

10 days ago
L1

Bug

Blocker

Open

Not assigned
2min effort

Comment

accessibility, wcag2-a
Add a <title> tag to this page.

10 days ago
L1

Bug

Blocker

Open

Not assigned
5min effort

Comment

user-experience
siemp-web/.../consultarhistoricocontrato/consultarlistaatualizacoes.jsp
Add "lang" and/or "xml:lang" attributes to this "<html>" element

10 days ago
L1

Bug

Blocker

Open

Not assigned
2min effort

Comment

accessibility, wcag2-a
Add a <title> tag to this page.

10 days ago
L1

Bug

Blocker

Open

Not assigned
5min effort

Comment

user-experience
siemp-web/.../consultarhistoricocontrato/fiancabancaria.jsp
Add "lang" and/or "xml:lang" attributes to this "<html>" element

10 days ago
L11

Bug

Blocker

Open

Not assigned
2min effort

Comment

accessibility, wcag2-a
Add a <title> tag to this page.

10 days ago
L11

Bug

Blocker

Open

Not assigned
5min effort

Comment

user-experience
siemp-web/.../consultarhistoricocontrato/fiancasimplesavaloutrasgarantiasfidejussorias.jsp
Add "lang" and/or "xml:lang" attributes to this "<html>" element

10 days ago
L11

Bug

Blocker

Open

Not assigned
2min effort

Comment

accessibility, wcag2-a
Add a <title> tag to this page.

10 days ago
L11

Bug

Blocker

Open

Not assigned
5min effort

Comment

user-experience
siemp-web/.../consultarhistoricocontrato/hipotecaoutrosgraus.jsp
Add "lang" and/or "xml:lang" attributes to this "<html>" element

10 days ago
L11

Bug

Blocker

Open

Not assigned
2min effort

Comment

accessibility, wcag2-a
Add a <title> tag to this page.

10 days ago
L11

Bug

Blocker

Open

Not assigned
5min effort

Comment

user-experience
siemp-web/.../consultarhistoricocontrato/hipotecaprimeirograu.jsp
Add "lang" and/or "xml:lang" attributes to this "<html>" element

10 days ago
L11

Bug

Blocker

Open

Not assigned
2min effort

Comment

accessibility, wcag2-a
Add a <title> tag to this page.

10 days ago
L11

Bug

Blocker

Open

Not assigned
5min effort

Comment

user-experience
siemp-web/.../consultarhistoricocontrato/outrasgarantiasnaofidejussoriasoutras.jsp
Add "lang" and/or "xml:lang" attributes to this "<html>" element

10 days ago
L11

Bug

Blocker

Open

Not assigned
2min effort

Comment

accessibility, wcag2-a
Add a <title> tag to this page.

10 days ago
L11

Bug

Blocker

Open

Not assigned
5min effort

Comment

user-experience
siemp-web/.../consultarhistoricocontrato/segurosassemelhadosfundosgarantidores.jsp
Add "lang" and/or "xml:lang" attributes to this "<html>" element

10 days ago
L11

Bug

Blocker

Open

Not assigned
2min effort

Comment

accessibility, wcag2-a
Add a <title> tag to this page.

10 days ago
L11

Bug

Blocker

Open

Not assigned
5min effort

Comment

user-experience
siemp-web/.../consultarposicaodivida/consultaposicaodivida.jsp
Add "lang" and/or "xml:lang" attributes to this "<html>" element

10 days ago
L11

Bug

Blocker

Open

Not assigned
2min effort

Comment

accessibility, wcag2-a
siemp-web/.../consultarposicaodivida/consultaposicaodividaseguradora.jsp
Add "lang" and/or "xml:lang" attributes to this "<html>" element

10 days ago
L39

Bug

Blocker

Open

Not assigned
2min effort

Comment

accessibility, wcag2-a
Add a <title> tag to this page.

10 days ago
L39

Bug

Blocker

Open

Not assigned
5min effort

Comment

user-experience
siemp-web/.../consultarposicaodivida/relatorioposicaodivida.jsp
Add "lang" and/or "xml:lang" attributes to this "<html>" element

10 days ago
L1

Bug

Blocker

Open

Not assigned
2min effort

Comment

accessibility, wcag2-a
siemp-web/.../consultarposicaodivida/relatorioposicaodividaseguradora.jsp
Add "lang" and/or "xml:lang" attributes to this "<html>" element

10 days ago
L1

Bug

Blocker

Open

Not assigned
2min effort

Comment

accessibility, wcag2-a
siemp-web/.../estornarconcessaoemprestimo/selecionarEstorno.jsp
Add "lang" and/or "xml:lang" attributes to this "<html>" element

10 days ago
L1

Bug

Blocker

Open

Not assigned
2min effort

Comment

accessibility, wcag2-a
siemp-web/.../liberargarantiacontratual/alienacaofiduciariaequipamentos.jsp
Add "lang" and/or "xml:lang" attributes to this "<html>" element

10 days ago
L11

Bug

Blocker

Open

Not assigned
2min effort

Comment

accessibility, wcag2-a
Add a <title> tag to this page.

10 days ago
L11

Bug

Blocker

Open

Not assigned
5min effort

Comment

user-experience
siemp-web/.../liberargarantiacontratual/alienacaofiduciariaimoveis.jsp
Add "lang" and/or "xml:lang" attributes to this "<html>" element

10 days ago
L11

Bug

Blocker

Open

Not assigned
2min effort

Comment

accessibility, wcag2-a
Add a <title> tag to this page.

10 days ago
L11

Bug

Blocker

Open

Not assigned
5min effort

Comment

user-experience
siemp-web/.../liberargarantiacontratual/alienacaofiduciariaoutros.jsp
Add "lang" and/or "xml:lang" attributes to this "<html>" element

10 days ago
L11

Bug

Blocker

Open

Not assigned
2min effort

Comment

accessibility, wcag2-a
Add a <title> tag to this page.

10 days ago
L11

Bug

Blocker

Open

Not assigned
5min effort

Comment

user-experience
siemp-web/.../liberargarantiacontratual/alienacaofiduciariaveiculos.jsp
Add "lang" and/or "xml:lang" attributes to this "<html>" element

10 days ago
L11

Bug

Blocker

Open

Not assigned
2min effort

Comment

accessibility, wcag2-a
100 of 430 shownShow More
SonarQube™ technology is powered by SonarSource SA
Community Editionv9.9.5 (build 90363)NO LONGER ACTIVELGPL v3CommunityDocumentationPluginsWeb API
