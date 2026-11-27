Fala, Matheus!

Atualização dos Storybooks do SIDSC em DES:

v20: no ar. A build e a release passaram e o pod está rodando normal. O deploy estava falhando por falta de cota de memória no namespace sidsc-des (4Gi, já todo ocupado pelos outros pods). Para resolver:
- aumentei a cota do sidsc-des para 8Gi de memória (e 8 de CPU);
- deixei o v20 com 1 réplica e estratégia Recreate.

Com a cota maior, o v19 voltou ao ar (tinha ficado parado enquanto liberávamos espaço) e o v22 também está rodando.

v21: do lado da esteira está tudo pronto: NG_GOAL ajustado, pasta .s2i/bin na branch, sidsc-nginx.conf no repo de config e libraries da release configuradas. A build gerou o Storybook, mas parou nos testes com:
MISSING DEPENDENCY  Cannot find dependency '@vitest/coverage-v8'

O que precisa ser feito na branch develop-v21:
1. Adicionar o pacote de cobertura: npm i -D @vitest/coverage-v8@^4, e subir o package.json e o package-lock.json.
2. Conferir no vitest.config.ts se a cobertura gera lcov (ex.: coverage: { provider: 'v8', reporter: ['lcov', 'text-summary'] }), que é o formato que o Sonar lê.
3. Fica a atenção: quando os testes rodarem, o spec do loading-animation pode dar o mesmo erro da v20 com a lottie-web ("Cannot set properties of null (setting 'fillStyle')"). Se acontecer, a correção é a mesma: vitest-canvas-mock no setup dos testes.

Assim que subir, me avisa que eu rodo a pipeline da v21.
