Prezados,

Estamos com erro na pipeline do projeto_SIGCB_Backend

##[warning]Git fetch failed with exit code 128, back off 1.845 seconds before retry.
git -c http.extraheader="AUTHORIZATION: bearer ***" -c http.sslVerify=false fetch --force --tags --prune --prune-tags --progress --no-recurse-submodules origin
fatal: unable to connect to devops.caixa:
devops.caixa[0: 10.122.142.80]: errno=Conexão recusada

##[error]Git fetch failed with exit code: 128

Att.



Starting: Checkout SIGCB-backend@develop to s
==============================================================================
Task         : Get sources
Description  : Get sources from a repository. Supports Git, TfsVC, and SVN repositories.
Version      : 1.0.0
Author       : Microsoft
Help         : [More Information](https://go.microsoft.com/fwlink/?LinkId=798199)
==============================================================================
Syncing repository: SIGCB-backend (Git)
git version
git version 2.22.1
git config --get remote.origin.url
git config gc.auto 0
git config --get-all http.https://devops.caixa/projetos/Caixa/_git/SIGCB-backend.extraheader
git config --get-all http.extraheader
git config --get-regexp .*extraheader
git config --get-all http.proxy
git config http.version HTTP/1.1
git -c http.extraheader="AUTHORIZATION: bearer ***" -c http.sslVerify=false fetch --force --tags --prune --prune-tags --progress --no-recurse-submodules origin
fatal: unable to connect to devops.caixa:
devops.caixa[0: 10.122.142.80]: errno=Conexão recusada

##[warning]Git fetch failed with exit code 128, back off 1.622 seconds before retry.
git -c http.extraheader="AUTHORIZATION: bearer ***" -c http.sslVerify=false fetch --force --tags --prune --prune-tags --progress --no-recurse-submodules origin
fatal: unable to connect to devops.caixa:
devops.caixa[0: 10.122.142.80]: errno=Conexão recusada

##[warning]Git fetch failed with exit code 128, back off 9.99 seconds before retry.
git -c http.extraheader="AUTHORIZATION: bearer ***" -c http.sslVerify=false fetch --force --tags --prune --prune-tags --progress --no-recurse-submodules origin
fatal: unable to connect to devops.caixa:
devops.caixa[0: 10.122.142.80]: errno=Conexão recusada

##[error]Git fetch failed with exit code: 128
Finishing: Checkout SIGCB-backend@develop to s
