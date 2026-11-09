Opa, tudo bem? Fiz o ajuste na esteira do SIAVO-ms-spa e agora ela está funcionando corretamente: executa os testes do Jest antes do build e envia a cobertura pro Sonar.

Antes o Sonar mostrava 0% porque a esteira não rodava os testes. Agora ele já está lendo a cobertura real do projeto, que está em 4,4%.

O Quality Gate ainda reprova, mas agora o motivo é a quantidade de testes. A regra exige 80% de cobertura no código novo, e hoje o Sonar está considerando cerca de 4,2 mil linhas como código novo (o período configurado pega os últimos 421 dias).

Para passar no Quality Gate, vocês precisam:
1. Corrigir os 4 testes que estão falhando no arquivo pdf-mime-fix-sw.spec.ts
2. Criar testes para o código novo até chegar nos 80% de cobertura

Se quiserem que conte só as alterações mais recentes, dá pra pedir ao administrador do Sonar pra ajustar o período de código novo.

Qualquer dúvida me chama!
