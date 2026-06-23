Starting: Checkout infradevops-novoportal-backend@develop to s
==============================================================================
Task         : Get sources
Description  : Get sources from a repository. Supports Git, TfsVC, and SVN repositories.
Version      : 1.0.0
Author       : Microsoft
Help         : [More Information](https://go.microsoft.com/fwlink/?LinkId=798199)
==============================================================================
Syncing repository: infradevops-novoportal-backend (Git)
git version
git version 2.22.1
git config --get remote.origin.url
git config gc.auto 0
git config --get-all http.https://devops.caixa/projetos/Caixa/_git/infradevops-novoportal-backend.extraheader
git config --get-all http.extraheader
git config --get-regexp .*extraheader
git config --get-all http.proxy
git config http.version HTTP/1.1
git -c http.extraheader="AUTHORIZATION: bearer ***" -c http.sslVerify=false fetch --force --tags --prune --prune-tags --progress --no-recurse-submodules origin
fatal: unable to connect to devops.caixa:
devops.caixa[0: 10.122.142.80]: errno=Conexão recusada

##[warning]Git fetch failed with exit code 128, back off 7.09 seconds before retry.
git -c http.extraheader="AUTHORIZATION: bearer ***" -c http.sslVerify=false fetch --force --tags --prune --prune-tags --progress --no-recurse-submodules origin
fatal: unable to connect to devops.caixa:
devops.caixa[0: 10.122.142.80]: errno=Conexão recusada

##[warning]Git fetch failed with exit code 128, back off 4.518 seconds before retry.
git -c http.extraheader="AUTHORIZATION: bearer ***" -c http.sslVerify=false fetch --force --tags --prune --prune-tags --progress --no-recurse-submodules origin
fatal: unable to connect to devops.caixa:
devops.caixa[0: 10.122.142.80]: errno=Conexão recusada

##[error]Git fetch failed with exit code: 128
Finishing: Checkout infradevops-novoportal-backend@develop to s
