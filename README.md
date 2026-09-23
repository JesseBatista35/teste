Skip to content
GitHub Enterprise
Users managed by Caixa Economica Federal
caixagithub
sisph-api-painel-ddd
Repository navigation
Code
Issues
Pull requests
Actions
Projects
Wiki
Security and quality
2
 (2)
Insights
Settings
CI/CD Workflow Generic
caixagithub/sisph-api-painel-ddd_main_35903539919.3 #3
All jobs
Run details
CI_DES / BUILD / BUILD
succeeded 5 minutes ago in 2m 48s
Search logs
7s
1s
1s
1s
14s
0s
12s
1m 7s
0s
49s
0s
7s
1s
Post job cleanup.
Parse config map to vars
0s
Local repository checkout
0s
  Post job cleanup.
  /usr/bin/git version
  git version 2.55.0
  Temporarily overriding HOME='/home/runner/_work/_temp/7d89918a-e2ca-4e0d-99b6-a60c9d09311b' before making global git config changes
  Adding repository directory to the temporary git global config as a safe directory
  /usr/bin/git config --global --add safe.directory /home/runner/_work/sisph-api-painel-ddd/sisph-api-painel-ddd/sisph-api-painel-ddd-infranprd
  Removing SSH command configuration
  /usr/bin/git config --local --name-only --get-regexp core\.sshCommand
  /usr/bin/git submodule foreach --recursive sh -c "git config --local --name-only --get-regexp 'core\.sshCommand' && git config --local --unset-all 'core.sshCommand' || :"
  Removing HTTP extra header
  /usr/bin/git config --local --name-only --get-regexp http\.https\:\/\/github\.com\/\.extraheader
  /usr/bin/git submodule foreach --recursive sh -c "git config --local --name-only --get-regexp 'http\.https\:\/\/github\.com\/\.extraheader' && git config --local --unset-all 'http.https://github.com/.extraheader' || :"
  Removing includeIf entries pointing to credentials config files
  /usr/bin/git config --local --name-only --get-regexp ^includeIf\.gitdir:
  includeif.gitdir:/home/runner/_work/sisph-api-painel-ddd/sisph-api-painel-ddd/sisph-api-painel-ddd-infranprd/.git.path
  includeif.gitdir:/home/runner/_work/sisph-api-painel-ddd/sisph-api-painel-ddd/sisph-api-painel-ddd-infranprd/.git/worktrees/*.path
  includeif.gitdir:/github/workspace/sisph-api-painel-ddd-infranprd/.git.path
  includeif.gitdir:/github/workspace/sisph-api-painel-ddd-infranprd/.git/worktrees/*.path
  /usr/bin/git config --local --get-all includeif.gitdir:/home/runner/_work/sisph-api-painel-ddd/sisph-api-painel-ddd/sisph-api-painel-ddd-infranprd/.git.path
  /home/runner/_work/_temp/git-credentials-4b6b47f2-3b28-45ea-8667-d53b09c84b72.config
  /usr/bin/git config --local --unset includeif.gitdir:/home/runner/_work/sisph-api-painel-ddd/sisph-api-painel-ddd/sisph-api-painel-ddd-infranprd/.git.path /home/runner/_work/_temp/git-credentials-4b6b47f2-3b28-45ea-8667-d53b09c84b72.config
  /usr/bin/git config --local --get-all includeif.gitdir:/home/runner/_work/sisph-api-painel-ddd/sisph-api-painel-ddd/sisph-api-painel-ddd-infranprd/.git/worktrees/*.path
  /home/runner/_work/_temp/git-credentials-4b6b47f2-3b28-45ea-8667-d53b09c84b72.config
  /usr/bin/git config --local --unset includeif.gitdir:/home/runner/_work/sisph-api-painel-ddd/sisph-api-painel-ddd/sisph-api-painel-ddd-infranprd/.git/worktrees/*.path /home/runner/_work/_temp/git-credentials-4b6b47f2-3b28-45ea-8667-d53b09c84b72.config
  /usr/bin/git config --local --get-all includeif.gitdir:/github/workspace/sisph-api-painel-ddd-infranprd/.git.path
  /github/runner_temp/git-credentials-4b6b47f2-3b28-45ea-8667-d53b09c84b72.config
  /usr/bin/git config --local --unset includeif.gitdir:/github/workspace/sisph-api-painel-ddd-infranprd/.git.path /github/runner_temp/git-credentials-4b6b47f2-3b28-45ea-8667-d53b09c84b72.config
  /usr/bin/git config --local --get-all includeif.gitdir:/github/workspace/sisph-api-painel-ddd-infranprd/.git/worktrees/*.path
  /github/runner_temp/git-credentials-4b6b47f2-3b28-45ea-8667-d53b09c84b72.config
  /usr/bin/git config --local --unset includeif.gitdir:/github/workspace/sisph-api-painel-ddd-infranprd/.git/worktrees/*.path /github/runner_temp/git-credentials-4b6b47f2-3b28-45ea-8667-d53b09c84b72.config
  /usr/bin/git submodule foreach --recursive git config --local --show-origin --name-only --get-regexp remote.origin.url
  Removing credentials config '/home/runner/_work/_temp/git-credentials-4b6b47f2-3b28-45ea-8667-d53b09c84b72.config'
0s
Post job cleanup.
/usr/bin/git version
git version 2.55.0
Temporarily overriding HOME='/home/runner/_work/_temp/607d50e6-c73d-4c33-a653-dbd86ab04e96' before making global git config changes
Adding repository directory to the temporary git global config as a safe directory
/usr/bin/git config --global --add safe.directory /home/runner/_work/sisph-api-painel-ddd/sisph-api-painel-ddd
/usr/bin/git config --local --name-only --get-regexp core\.sshCommand
/usr/bin/git submodule foreach --recursive sh -c "git config --local --name-only --get-regexp 'core\.sshCommand' && git config --local --unset-all 'core.sshCommand' || :"
/usr/bin/git config --local --name-only --get-regexp http\.https\:\/\/github\.com\/\.extraheader
http.https://github.com/.extraheader
/usr/bin/git config --local --unset-all http.https://github.com/.extraheader
/usr/bin/git submodule foreach --recursive sh -c "git config --local --name-only --get-regexp 'http\.https\:\/\/github\.com\/\.extraheader' && git config --local --unset-all 'http.https://github.com/.extraheader' || :"
/usr/bin/git config --local --name-only --get-regexp ^includeIf\.gitdir:
/usr/bin/git submodule foreach --recursive git config --local --show-origin --name-only --get-regexp remote.origin.url
1s
0s
0s


Jesse Mouta Pereira Batista
23/09/2026 15:36
Thales Davi de Souza Com os dados informados, ajustamos o GitOps para o cluster aks-hab-des e configuramos o Istio para o host sisph-api-painel-ddd.des.caixa, com o certificado lido do Key Vault kv…
Jesse, nesse primeiro momento não é necessário realizar a configuração de variáveis de ambiente ou de secrets. Sobre o health check a aplicação ainda não tem ele configurado, vou tentar fazer essa configuração o quanto antes, pode manter o health check no endpoint /healthz e na porta 8080.
 
Muito obrigado!

