Após verificação, constatamos que as branches develop dos repositórios abaixo são protegidas por 3 rulesets de organização (politicas_develop, protecao_push, quality_assurance), geridas pelo GitHub caixagithub, que impedem exclusão e push forçado direto na branch.

Repositórios:

siopi-frontend-melhorias
siopi-batch-hab-melhorias
siopi-backend-hab-melhorias

Recomendação: Não excluir/recriar as branches develop, tendo em vista a proteção vigente.

Ação recomendada ao time de desenvolvimento: Sincronizar a develop com a main via Pull Request, respeitando as regras de proteção já configuradas, executando os seguintes passos em cada repositório:

git checkout main
git pull origin main
git checkout develop
git pull origin develop
git checkout -b sync/develop-com-main
git merge main
git push origin sync/develop-com-main

Em seguida, abrir Pull Request de sync/develop-com-main para develop pela interface do GitHub, permitindo que o merge passe pelas revisões e checks exigidos pelas rulesets vigentes.
