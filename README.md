Prezados,

Durante execução da esteira de build do siasc-novo, o npm install falhou com erro ERESOLVE por conflito de dependencias entre pacotes @angular. O log aponta @angular/common resolvido na versao 20.1.8, enquanto @angular/forms exige exatamente a versao 20.3.27 como peer dependency, e o ngx-bootstrap@20.0.2 exige @angular/common e @angular/animations na faixa ^20.0.2. Ou seja, as versoes dos pacotes @angular no package.json do projeto estao dessincronizadas entre si, o que impede a resolucao da arvore de dependencias pelo npm.

Solicitamos que o time de desenvolvimento alinhe todas as bibliotecas @angular (core, common, compiler, forms, animations, cdk, material, router, platform-browser, platform-browser-dynamic, service-worker, etc) para uma mesma versao compativel no package.json, de preferencia a 20.3.27, e valide a compatibilidade com o ngx-bootstrap instalado. Apos o ajuste, recomendamos apagar o package-lock.json e a pasta node_modules e rodar o npm install novamente para regerar a arvore de dependencias de forma limpa.

Este ajuste esta fora do escopo da esteira DevOps DES TQS NPRD, pois trata de definicao de versoes de dependencias no codigo da aplicacao, cabendo ao time de desenvolvimento a correcao e validacao.

Ficamos a disposicao para novos testes de pipeline apos o ajuste.

Jessé Batista / CTIS/CESTI — Esteira DevOps DES TQS NPRD
