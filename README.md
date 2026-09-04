Prezados,

Em análise à solicitação de ajuste no parâmetro de publicação no Nexus do pipeline SIACM-api-audit (troca de -DgeneratePom=true por -DpomFile=pom.xml), identificamos que a tarefa "Publica no Nexus" está localizada dentro do Task Group compartilhado "Build Default - jar".

Esse Task Group não é exclusivo do SIACM-api-audit: ele também é utilizado pelo pipeline SINAC-sicli-api. Ou seja, qualquer alteração feita nele impacta diretamente os dois projetos.

Como não temos autorização para alterar esse Task Group compartilhado sem validação/ciência do time responsável pelo outro pipeline (SINAC-sicli-api), não é possível realizar o ajuste solicitado neste momento sem esse alinhamento prévio.

Para prosseguir, solicitamos uma das seguintes definições:
1) Autorização formal para alterar o Task Group compartilhado, com ciência de que o pipeline SINAC-sicli-api também será impactado; ou
2) Autorização para criar uma cópia ("clone") do Task Group exclusiva para o SIACM-api-audit, aplicando a alteração apenas nessa cópia, sem afetar o SINAC-sicli-api.

Ficamos no aguardo do retorno para darmos continuidade.

Atenciosamente,
Jessé Batista
