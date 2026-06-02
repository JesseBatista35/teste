O teste decisivo é comparar as versões dentro da imagem. Sobe o debug:
bashoc debug dc/sifug-siofg-api-des -n sifug-des -it -- /bin/sh
E dentro dele:
bash# o jar do file-system source está lá? em qual versão?
ls /deployments/lib/main/ | grep -i 'config-source-file-system'

# qual a versão do smallrye-config CORE que o Quarkus empacotou?
ls /deployments/lib/main/ | grep -i 'smallrye-config' | grep -iv 'source-file'
O que você quer ver:

Se o primeiro comando não retornar nada → o jar não foi pro build. A imagem está desatualizada ou o build não empacotou a dependência. Solução: rebuild + redeploy garantindo que o 2.4.2 entre no quarkus-app/lib.
Se retornar ...source-file-system-2.4.2.jar mas o core for, por exemplo, smallrye-config-2.5.x.jar (minor diferente) → é incompatibilidade de versão. A factory não registra. Solução: alinhar a versão do smallrye-config-source-file-system com a do core. O ideal é remover o <version>2.4.2</version> e ver se o BOM do Quarkus gerencia; se não gerenciar, fixar exatamente na mesma versão do core que apareceu no ls.

Vale também olhar o log de boot completo. Você tem LEVEL_LOG_APP=DEBUG ligado no deployment, então o SmallRye costuma logar o carregamento dos config sources — e uma factory que falha geralmente emite um WARN nomeando o problema. No log do pod que você colou, há um salto do "ApplicationInsights Java Agent started" direto pro "Running main method" e a exception. Pega o trecho entre essas duas partes (e qualquer linha com WARN, ConfigSource, FileSystem ou SRCFG):
bashoc logs sifug-siofg-api-des-271-6b9x6 -n sifug-des --previous | grep -iE 'warn|configsource|filesystem|srcfg|file.system'
Manda o retorno do ls dos dois jars — com a versão do core na mão eu te digo na hora se é só ajustar o número da versão ou se é rebuild que está faltando.
