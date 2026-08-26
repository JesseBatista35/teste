Bom dia, Matheus,

Após análise, identificamos que a análise do SonarQube está sendo realizada normalmente pelo Sonar (o projeto SIMOV-imoveiscaixa-batch aparece no servidor com a análise processada), porém o retorno desse resultado não está chegando na pipeline — o esperado era que a pipeline quebrasse ao publicar o resultado, o que não está ocorrendo. O mesmo comportamento de falha se repete nas demais branches testadas.

Como isso está relacionado ao funcionamento interno da ferramenta SonarQube (comunicação entre o servidor e o retorno do Quality Gate para a pipeline), o suporte não é conosco — esse tipo de chamado deve ser direcionado à equipe GEQTI, responsável pelo suporte à ferramenta.

Suporte a problemas com o SONAR ou dúvidas referentes a essa ferramenta devem ser enviados diretamente à GEQTI, via RTC (serviços de qualidade) — eles não atendem via GSC. Utilizar o link abaixo para abertura:
https://gid.caixa:9443/ccm/web/projects/Qualidade%20de%20TI#action=com.ibm.team.dashboard.viewDashboard

Ficamos à disposição para o que for preciso.
