Skip to content
GitHub Enterprise
Users managed by Caixa Economica Federal
caixagithub
SIMPF-frontend
Repository navigation
Code
Issues
Pull requests
36
 (36)
Actions
Projects
Wiki
Security and quality
251
 (251)
Insights
Settings
Update run- #162
#162
Open
Jesse Mouta Pereira Batista (p585600_caixa)
wants to merge 59 commits into
develop
from
p585600_caixa-patch-1
+16.304
-41.349
Lines changed: 16304 additions & 41349 deletions
Conversation1 (1)
Commits59 (59)
Checks5 (5)
Files changed2239 (2239)
Conversation
@p585600_caixa
Jesse Mouta Pereira Batista (p585600_caixa)
commented
yesterday
WO0000081575607

Diego Marques Soares (c159754_caixa) and others added 30 commits last month
@c159754_caixa
Merge pull request #122 from caixagithub/hotfix/IB-24912654-estado-e-… 
11ac4df
Luiz Gustavo Santos Amarante
Update package.json
d904569
Luiz Gustavo Santos Amarante
Update notas-versao.component.html
33ae3a0
@c160737_caixa
Add files via upload
ce1c101
@c160737_caixa
Merge pull request #130 from caixagithub/c160737_caixa-patch-3 
f80ff78
Luiz Gustavo Santos Amarante
Merge pull request #131 from caixagithub/develop 
64f0faa
c159754
correcao bloqueio de contrato desatualizado, bloquear algumas acoes
3e94197
@c159754_caixa
Merge pull request #133 from caixagithub/hotfix/IB-24912654-estado-e-… 
86908d3
Luiz Gustavo Santos Amarante
Merge branch 'develop' into bugfix/STRY00067615-editar-link-item-trab… 
840937a
Luiz Gustavo Santos Amarante
Merge branch 'release/3.12.0-ajustes-e-melhorias-b' into bugfix/STRY0… 
7da2032
Luiz Gustavo Santos Amarante
docs: atualizar notas de versão
dbc057e
Luiz Gustavo Santos Amarante
Merge pull request #135 from caixagithub/bugfix/STRY00067615-editar-l… 
4b68bbc
c159754
correcao testes LU
e4c0b39
@c159754_caixa
Merge pull request #137 from caixagithub/feature/IB_24777119_Tipo_Con… 
e6e8a3d
Luiz Gustavo Santos Amarante
Removido a pasta web
a98bdb8
Luiz Gustavo Santos Amarante
Fix testes unitarios
5659be2
@f541242_caixa
test(frontend): amplia cobertura de testes para validação Sonar 
af47cd8
c159754
aumento cobertura testes
25e443b
@c159754_caixa
Merge pull request #146 from caixagithub/feature/aumento-cobertura-312 
8707f39
@f541318_caixa
testes a partir da branch 3.12.
abe72c9
@f541318_caixa
Merge pull request #147 from caixagithub/test/STSK00060728-cobertura-… 
6e0fddd
c159754
correcao apontamentos de sonar
79a3bfd
c159754
aumento cobertura
fef73c0
@f541242_caixa
test(frontend): amplia cobertura de testes para validação Sonar 
205d912
@f541242_caixa
test(frontend): amplia cobertura de testes para validação Sonar 
16a1dfd
@f541242_caixa
Merge pull request #150 from caixagithub/test/STSK00060592-cobertura-… 
2ef7042
@f541242_caixa
Merge remote-tracking branch 'origin/release/3.12.0-ajustes-e-melhori… 
f8ab87c
@f541242_caixa
Merge pull request #148 from caixagithub/feature/aumento-cobertura-312 
511415f
@f541242_caixa
test(frontend): amplia cobertura de testes para validação Sonar 
ac1c588
@f541242_caixa
Merge pull request #151 from caixagithub/test/STSK00060592-cobertura-… 
886aa90
5 hidden items
Load more…
Jose Cleiton da Silva Santos (f541318_caixa) and others added 22 commits 4 days ago
@f541318_caixa
teste(TESTES - SONAR): aumento de cobertura dos testes. 
7c207e3
@f541318_caixa
Merge pull request #154 from caixagithub/test/STSK00060728-cobertura-… 
d8e0bfa
@f541242_caixa
test(frontend): amplia cobertura de testes e corrije apontamento Sonar 
c508794
@f541242_caixa
Merge pull request #155 from caixagithub/test/STSK00060592-correcao-a… 
5ae6e44
@f541242_caixa
Atualizando versão package.json
49b7064
@f541242_caixa
fix: aguarda getConciliacoes em changeSistema para evitar promise rej… 
17ac48f
@f541242_caixa
test(frontend): amplia cobertura de testes para validação Sonar 
3312a5f
@f541242_caixa
Merge pull request #156 from caixagithub/fix/STSK00060592-corrige-err… 
5f8111c
@f541242_caixa
Atualização versão package.json
7378dbd
@f541242_caixa
fix(frontend): corrige promise nao aguardada em ngOnInit do BaselineC… 
4d66d9f
@f541242_caixa
Merge pull request #157 from caixagithub/fix/STSK00060592-corrige-err… 
fbedb85
@f541242_caixa
Atualização versão package.json
8ed4438
@f541242_caixa
fix(frontend): corrige promise nao aguardada em incluirContagemDados … 
a12ff80
@f541242_caixa
Merge pull request #158 from caixagithub/fix/STSK00060592-corrige-err… 
cb42b2a
@f541242_caixa
Atualização versão package.json
1876a96
@f541242_caixa
fix(frontend): corrige promise nao aguardada em preencherDadosUltimaC… 
7d9b9d2
@f541242_caixa
Merge pull request #159 from caixagithub/fix/STSK00060592-corrige-err… 
0839933
@f541242_caixa
fix(frontend): corrige mock incompleto no teste de changeSubCategoria… 
94e7f37
@f541242_caixa
Merge pull request #160 from caixagithub/fix/STSK00060592-corrige-err… 
4b4d208
@f541242_caixa
fix(frontend): adiciona afterEach para drenar microtasks pendentes no… 
94191aa
@f541242_caixa
Atualização versão package.json
911efe9
@p585600_caixa
Update run 
442b62d
@p585600_caixa
Jesse Mouta Pereira Batista (p585600_caixa) requested a review from Thiago Jeferson de Sousa Silva (p981778_caixa) 4 hours ago
p981778_caixa
Thiago Jeferson de Sousa Silva (p981778_caixa) reviewed 4 hours ago
Thiago Jeferson de Sousa Silva (p981778_caixa)
left a comment
cesti_teste

@p585600_caixa
Jesse Mouta Pereira Batista (p585600_caixa) enabled auto-merge 4 hours ago
@p585600_caixa
Jesse Mouta Pereira Batista (p585600_caixa) disabled auto-merge 4 hours ago
@p981778_caixa
Thiago Jeferson de Sousa Silva (p981778_caixa) self-requested a review 4 hours ago
p981778_caixa
Thiago Jeferson de Sousa Silva (p981778_caixa) approved these changes 4 hours ago
New changes since you last viewed
@f541242_caixa
Merge branch 'release/3.12.0-ajustes-e-melhorias-b' into p585600_caix… 
de7bbe5
Merge info
Review required
At least 1 approving review is required by reviewers with write access.


All checks have passed
4 successful checks


Merging is blocked
Waiting on 1 reapproval from someone other than the last pusher. Review from p981778_caixa is stale because it was submitted before the most recent code changes.
You can also merge this with the command line. 
Still in progress?
@p585600_caixa


Add a comment
Comment
 

Add your comment here...
Remember, contributions to this repository should follow our GitHub Community Guidelines.
 ProTip! Add .patch or .diff to the end of URLs for Git’s plaintext views.
Reviewers
@p981778_caixa
Thiago Jeferson de Sousa Silva (p981778_caixa)
At least 1 approving review is required to merge this pull request.

Still in progress?
Assignees
No one—
Labels
None yet
Projects
None yet
Milestone
No milestone
Development
Successfully merging this pull request may close these issues.

None yet


Notifications
Customize
You’re receiving notifications because you authored the thread.
6 participants
@p585600_caixa
@p981778_caixa
@c159754_caixa
@c160737_caixa
@f541242_caixa
@f541318_caixa
 Archive pull request
Footer
© 2026 GitHub, Inc.
Footer navigation
Terms
Privacy
Security
Status
Community
Docs
Contact
Manage cookies
Do not share my personal information




#!/bin/bash

#PHP Home
NGINX_HOME=/opt/app-root

# Source code provided to STI is at /tmp/src/
LOCAL_SOURCE_DIR=/tmp/src

# Resulting ZIP files will be deployed to /opt/app-root/src
DEPLOY_DIR=$NGINX_HOME/src

#/opt/app-root/src

function copy_artifacts() {
  if [ -d $LOCAL_SOURCE_DIR ]; then
    echo "Copying all WAR, EAR, JAR and ZIP artifacts from $LOCAL_SOURCE_DIR directory into $DEPLOY_DIR for later deployment..."
    cp -v $LOCAL_SOURCE_DIR/*.zip $LOCAL_SOURCE_DIR/*.jar $LOCAL_SOURCE_DIR/*.war $LOCAL_SOURCE_DIR/*.ear $DEPLOY_DIR 2> /dev/null
   	unzip $DEPLOY_DIR/*.zip -d $DEPLOY_DIR 2> /dev/null
    mv $DEPLOY_DIR/dist/*  $DEPLOY_DIR/.
	  rm -rf $DEPLOY_DIR/*.zip
  fi
}

# Copy (probably binary) artifacts from the /tmp/src/
# directory to the $NGINX_HOME/src
# directory for later deployment
copy_artifacts "deployments"

exit 0


#!/bin/bash
source /opt/app-root/etc/generate_container_user
set -e
source ${NGINX_CONTAINER_SCRIPTS_PATH}/common.sh
process_extending_files ${NGINX_APP_ROOT}/src/nginx-start ${NGINX_CONTAINER_SCRIPTS_PATH}/nginx-start

MAIN_JS=$(find /opt/app-root/src -maxdepth 5 -name "main*.js" | head -n1)

if [ -n "$SIMPF_API_URI" ] && [ -n "$MAIN_JS" ]; then
    sed -i "s#__SIMPF_API_URI__#$SIMPF_API_URI#g" "$MAIN_JS"
fi
if [ -n "$SIMPF_SSO_URI" ] && [ -n "$MAIN_JS" ]; then
    sed -i "s#__SIMPF_SSO_URI__#$SIMPF_SSO_URI#g" "$MAIN_JS"
fi

exec nginx -g "daemon off;"




<img width="1878" height="884" alt="image" src="https://github.com/user-attachments/assets/2d71213a-46cb-4710-aa2a-87fd9e4eccbc" />
