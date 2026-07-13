O build usa `ng build --configuration production`, e o `angular.json` faz um fileReplacement que troca o environment.ts pelo environment.prod.ts em tempo de build — esse arquivo tem a URL de SSO de PRD fixa (DnsSSO.PRD). Como é padrão da Caixa usar sempre `--configuration production`, não dá pra simplesmente criar uma configuration separada pra DES/TQS.

A solução é resolver a URL de SSO via variável/token no pipeline (pós-build), não em tempo de build — assim o mesmo bundle production serve DES, TQS e PRD, cada um pegando a URL certa pela Variable Group do ambiente. 


Pessoal, sobre a branch principal: vamos precisar abrir uma REQ pra restringir commits diretos e passar a exigir Pull Request obrigatório, com aprovação do Matheus (tech lead) antes do merge.
Assim que a REQ for aprovada e a policy configurada, o fluxo de vocês continua o mesmo (criar branch de feature, dar push, abrir PR) — só deixa de ser possível commitar direto na branch protegida. Vou abrir a REQ e aviso quando estiver valendo.
