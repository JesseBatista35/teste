A build falhou porque o comando passa --build-optimizer, opção que não existe no builder @angular-devkit/build-angular:application (esbuild), usado no Angular 17+ e configurado neste projeto (Angular 19.2). O CLI valida os argumentos antes de compilar e aborta com Unknown argument: build-optimizer. Nesse builder, a otimização equivalente já é aplicada automaticamente na configuração production, então a flag é obsoleta.

Correção: remover --build-optimizer da variável NG_GOAL. O --aot também pode sair, porque já é o padrão.

ng build --configuration production --output-path=dist

Com esse builder, o artefato é gerado em dist/browser/. Os passos seguintes da esteira precisam considerar esse caminho.
