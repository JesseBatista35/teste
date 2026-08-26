Após análise, identificamos que o SonarQube está processando a análise normalmente — o projeto SIMOV-imoveiscaixa-batch aparece no servidor com issues detectados, incluindo Bugs, itens Critical e até Blocker. Esse resultado deveria ter reprovado o Quality Gate e quebrado a pipeline, mas isso não está acontecendo: a pipeline segue passando normalmente mesmo com esse cenário. O mesmo comportamento se repete nas demais branches testadas.

Ou seja, a análise é feita, porém o retorno do resultado do Quality Gate não está sendo aplicado corretamente na pipeline para bloqueá-la quando reprovada.

Como isso está relacionado ao funcionamento interno da ferramenta SonarQube (comportamento do Quality Gate/Publish), o suporte não é conosco — esse tipo de chamado deve ser direcionado à equipe GEQTI, responsável pelo suporte à ferramenta.

Suporte a problemas com o SONAR ou dúvidas referentes a essa ferramenta devem ser enviados diretamente à GEQTI, via RTC (serviços de qualidade) — eles não atendem via GSC. Utilizar o link abaixo para abertura:
https://gid.caixa:9443/ccm/web/projects/Qualidade%20de%20TI#action=com.ibm.team.dashboard.viewDashboard

Ficamos à disposição para o que for preciso.
