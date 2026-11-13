<img width="1569" height="572" alt="image" src="https://github.com/user-attachments/assets/4bf544a4-a66d-41f8-ba89-d5231faf61b5" />


<img width="1641" height="871" alt="image" src="https://github.com/user-attachments/assets/7271aa39-0ddd-47be-adda-0646b5d33f63" />


if [[ "$BUILD_REPOSITORY_URI" == *"github.com"* ]]; then
echo "É um repositório do GitHub"
REPO_FINAL_NAME=`basename "$BUILD_REPOSITORY_URI" .git`
echo "##vso[task.setvariable variable=fortify_disable;]gecmi"
echo "##vso[task.setvariable variable=sonar_disable;]true"
else
echo "É um repositório do Devops.Caixa"
REPO_FINAL_NAME=`echo $(Build.Repository.Name)`
fi
echo "Nome do repositório: $REPO_FINAL_NAME"
echo "##vso[task.setvariable variable=REPO_FINAL_NAME;]$REPO_FINAL_NAME"



echo "##[section]branch/tag: $BUILD_SOURCEBRANCHNAME"

echo "##[warning] -------------------- ATENÇÃO --------------------
##[warning] Foi definido conforme CE GEQTI 011/2024 que a partir de 03/2025 apenas compilações oriundas de tag dentro do padrão estabelecido no PPDS poderão ser implantadas em TQS/HMP/PRD.
##[warning] Para mais informações acesse as urls:
##[warning] https://devops.caixa/projetos/Caixa/_wiki/wikis/Caixa.wiki/1689/Valida%C3%A7%C3%A3o-da-VEC
##[warning] https://caixa.sharepoint.com/sites/PPDS/SitePages/GCM_Diretrizes_Padrao_Baseline.aspx ou consulte a GEQTI04
-------------------------------------------------"
echo $BUILD_SOURCEBRANCH
if [[ `echo $BUILD_SOURCEBRANCH | grep -c tags` -gt 0 ]];then
pontos=`echo ${BUILD_SOURCEBRANCHNAME//[^\.]} | sed 's/\./\.\n/g' | wc -w`
number=`echo $BUILD_SOURCEBRANCHNAME | sed 's/\\.//g'`

if [[ ${pontos} = 3 ]];then
if [[ ${number} =~ ^([0-9]+)$ ]];then
echo "VEC $BUILD_SOURCEBRANCHNAME dentro do padrão estabelecido pelo PPDS.
Pacote apto a ser implantado em TQS/HMP/PRD."
vec='true'
echo "##vso[build.updatebuildnumber]"$BUILD_SOURCEBRANCHNAME""
else
echo "A TAG $BUILD_SOURCEBRANCHNAME não se encontra dentro do padrão estabelecido pelo PPDS e este pacote não poderá ser implantado nos ambientes TQS/HMP/PRD."
vec='false'
fi
else
echo "A TAG $BUILD_SOURCEBRANCHNAME não se encontra dentro do padrão estabelecido pelo PPDS e este pacote não poderá ser implantado nos ambientes TQS/HMP/PRD."
vec='false'
fi
elif [[ `echo $BUILD_SOURCEBRANCH | grep -c heads` -gt 0 ]];then
echo "##[warning]Foi selecionada para compilação uma branch. Esteja ciente de que este pacote poderá ser implantado somente em ambiente DES."
vec='false'
else
echo "##[warning]Foi selecionada para compilação uma branch. Esteja ciente de que este pacote poderá ser implantado somente em ambiente DES."
vec='false'
fi

echo "##[section]Valida VEC: $vec"
echo "##vso[task.setvariable variable=valida.vec;]$vec"

echo "------------------------------------------------- 
ps: Essa regra se aplica somente a projetos que possuem infra criada na esteira devops."



#!/usr/bin/env bash
set -euo pipefail

if [[ `echo $BUILD_SOURCEBRANCH | grep -c tags` -gt 0 ]];then

echo "Build originada de uma TAG."

# ====== CONFIGURAÇÃO ======
TAG=$BUILD_SOURCEBRANCH
REMOTE="origin"

# ====== RESOLVER COMMIT FINAL DA TAG ======
if ! COMMIT=`git rev-parse "$TAG^{commit}" 2>/dev/null`; then
  echo "Erro: a tag '$TAG' não existe ou não é válida."
  exit 1
fi

echo "Tag        : $TAG"
echo "Commit     : $COMMIT"
echo "Remote     : $REMOTE"
echo
echo "Analisando branches que contêm o commit..."
echo "------------------------------------------------------------"
printf "%-8s %s\n" "DISTÂNCIA" "BRANCH"
echo "------------------------------------------------------------"

FOUND=0

while read -r BRANCH; do
  if git merge-base --is-ancestor "$COMMIT" "$BRANCH"; then
    DIST=`git rev-list --count "$COMMIT..$BRANCH"`
    
    # Remove origin/
    BRANCH_DISPLAY="${BRANCH#origin/}"    

    printf "%-8s %s\n" "$DIST" "$BRANCH_DISPLAY"
    FOUND=1
  fi
done < <(
  git for-each-ref \
    --format='%(refname:short)' \
    "refs/remotes/$REMOTE"
)

if [[ "$FOUND" -eq 0 ]]; then
  echo "Nenhuma branch remota contém esse commit."
  exit 1
fi

echo "------------------------------------------------------------"

# ====== BRANCH MAIS PROVÁVEL ======
BEST_BRANCH=$(
  while read -r BRANCH; do
    if git merge-base --is-ancestor "$COMMIT" "$BRANCH"; then
      # Remove origin/
      BRANCH_DISPLAY="${BRANCH#origin/}"    
      echo "`git rev-list --count "$COMMIT..$BRANCH"` $BRANCH_DISPLAY"
    fi
  done < <(
    git for-each-ref \
      --format='%(refname:short)' \
      "refs/remotes/$REMOTE"
  ) | sort -n | head -n1
)

BEST_DISTANCE=`echo "$BEST_BRANCH" | awk '{print $1}'`
BEST_NAME=`echo "$BEST_BRANCH" | awk '{print $2}'`

echo "Branch mais provável de origem:"
echo "$BEST_NAME (distância: $BEST_DISTANCE commits)"

else

echo "Build originada de uma BRANCH."
BEST_NAME=$BUILD_SOURCEBRANCHNAME

fi

echo "Branch que será informada para o SONAR: $BEST_NAME "

echo "##vso[task.setvariable variable=sonar_branch;]$BEST_NAME"
