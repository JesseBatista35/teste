Segue uma análise mais completa, cobrindo tanto os Code Smells quanto a condition que reprovou o Gate:

Análise técnica (Esteira DevOps):

Build barrado pelo "Publish Quality Gate Result". Análise no SONAR (versão 1.0.0.9, análise de 12/08/2026) identificou o seguinte:

1. Quality Gate — Failed
Único condition reprovado: Coverage on New Code is less than 80.0% (0.0% de cobertura nas 16 linhas novas / 5k novas linhas com 0.0% de duplicação avaliada). Não há New Bugs, New Vulnerabilities nem Security Hotspots pendentes de revisão — todos os ratings (Reliability, Security, Security Review) estão em A. É essa condition de cobertura, isoladamente, que barra a publicação.

2. Code Smells identificados (7 novos, ~10min de esforço total)
Não impactam o Quality Gate diretamente, mas estão registrados na branch develop:

selecao-municipios.component.scss: 5 ocorrências de seletor CSS duplicado (.form-group, .modal-backdrop, .form-row-responsive, .input-box) e 1 ponto-e-vírgula extra (linhas 57, 168, 190, 196, 201, 281)
cabecalho-pagina.component.scss: source vazio (linha 1)
styles.scss: 2 ocorrências de seletor duplicado (.mg-t-28, body — linhas 231 e 278)

Conclusão: o bloqueio de build é causado exclusivamente pela ausência de testes cobrindo o código novo, não por erros funcionais, bugs ou vulnerabilidades. Os Code Smells de SCSS são de baixo risco e não bloqueiam o gate, mas recomenda-se limpeza pelo time de dev por boa prática.

Ação necessária (fora do escopo da esteira): time de desenvolvimento deve incluir testes unitários cobrindo as 16 linhas novas para atingir os 80% exigidos, e opcionalmente resolver os seletores CSS duplicados listados acima.

Encaminhado ao time de desenvolvimento. Fechando WO por não se tratar de falha de pipeline/esteira.
