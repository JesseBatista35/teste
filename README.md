SIEMP-java-web — Quality Gate reprovado (build branch develop, 12/11/2026)

O build falhou na etapa Publish Quality Gate Result (ocorrência TE102: não atendimento aos critérios de qualidade). Não é problema da esteira: o Quality Gate do Sonar reprovou por causa do código novo.

Condições que falharam

Condição	Resultado	Limite
Coverage on New Code	0,0% (7 linhas novas)	≥ 80%
New Critical Issues	1	0
Critical Issues (overall)	16.702	≤ 16.701

Causa 1: uma issue crítica nova
As duas últimas condições vêm da mesma issue. O gate do projeto está fixado no passivo existente (16.701 críticas), então qualquer crítica nova reprova as duas. O código novo introduziu 1 code smell de severidade crítica (esforço estimado de 2 minutos).

Como localizar: no Sonar (sonar-esteira.apps.produtos4.caixa), projeto SIEMP-java-web, branch develop, vá em Overview → New Code → New Code Smells (1). Outra opção é Issues com os filtros New code + Severity: Critical.

Causa 2: falta de cobertura no código alterado
As 7 linhas novas cobríveis estão sem nenhum teste, e o gate exige 80% de cobertura no código novo.

Ações necessárias

Corrigir o code smell crítico apontado no código novo.
Criar testes unitários que cubram o trecho alterado.
Se o projeto já tem testes e mesmo assim a cobertura aparece zerada, verificar se o relatório do JaCoCo está sendo gerado no build (jacoco-maven-plugin e sonar.coverage.jacoco.xmlReportPaths).
Se o projeto não tem testes e não for viável cobrir agora, o tratamento de exceção deve seguir o processo da TE102.
Gerar um novo build após os ajustes.

Observação: as demais issues listadas no Sonar (blockers em JSP, try-with-resources etc.) são passivo legado e não estão causando a reprovação. O foco é só no código novo.
