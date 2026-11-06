Boa tarde! Tudo bem sim 🙂

Dei uma olhada e, na verdade, não precisa abrir REQ para a esteira. A esteira já executa o Sonar; o que está faltando é a cobertura ser gerada e informada pelo próprio projeto. Reprovação de Quality Gate por cobertura é ajuste do lado da aplicação.

O que vocês precisam ajustar no repositório do SIAVO-ms-spa:

1. Garantir que o script de teste gere a cobertura em LCOV. Ex.: no package.json, "test": "jest --coverage", e no jest.config deixar coverageReporters com "lcov" (o padrão do Jest já inclui) e coverageDirectory "coverage".
2. Rodar localmente e conferir se o arquivo coverage/lcov.info está sendo criado.
3. Informar o caminho para o Sonar no sonar-project.properties (ou nas propriedades do scanner):
   sonar.javascript.lcov.reportPaths=coverage/lcov.info
4. Conferir também se sonar.sources / sonar.tests / sonar.exclusions não estão tirando os arquivos da análise.
5. Subir o ajuste e rodar a esteira de novo. No log do Sonar deve aparecer o sensor JavaScript/TypeScript Coverage processando o lcov.info, sem a mensagem de "ignorado".

Se mesmo com isso a cobertura gerada não atingir o mínimo do Quality Gate, aí é aumentar os testes mesmo.

Se depois desses passos o log mostrar que a esteira não está executando o npm test antes do Sonar ou não está repassando a propriedade, me chama que eu verifico a parte da pipeline com vocês.Boa tarde! Tudo bem sim 🙂

Dei uma olhada e, na verdade, não precisa abrir REQ para a esteira. A esteira já executa o Sonar; o que está faltando é a cobertura ser gerada e informada pelo próprio projeto. Reprovação de Quality Gate por cobertura é ajuste do lado da aplicação.

O que vocês precisam ajustar no repositório do SIAVO-ms-spa:

1. Garantir que o script de teste gere a cobertura em LCOV. Ex.: no package.json, "test": "jest --coverage", e no jest.config deixar coverageReporters com "lcov" (o padrão do Jest já inclui) e coverageDirectory "coverage".
2. Rodar localmente e conferir se o arquivo coverage/lcov.info está sendo criado.
3. Informar o caminho para o Sonar no sonar-project.properties (ou nas propriedades do scanner):
   sonar.javascript.lcov.reportPaths=coverage/lcov.info
4. Conferir também se sonar.sources / sonar.tests / sonar.exclusions não estão tirando os arquivos da análise.
5. Subir o ajuste e rodar a esteira de novo. No log do Sonar deve aparecer o sensor JavaScript/TypeScript Coverage processando o lcov.info, sem a mensagem de "ignorado".

Se mesmo com isso a cobertura gerada não atingir o mínimo do Quality Gate, aí é aumentar os testes mesmo.

Se depois desses passos o log mostrar que a esteira não está executando o npm test antes do Sonar ou não está repassando a propriedade, me chama que eu verifico a parte da pipeline com vocês.
