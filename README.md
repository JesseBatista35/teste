pessoal quando cehgarem solicitaços de exclusão ou recriaçao de branch develop no github desse tipo abaixo:
Prezado(a),
Precisamos reiniciar a nossa branch develop, pois a mesma está muito desatualizada em relação a main. 
Solicito que a recriação da branch develop nos seguintes projetos: 



reponder com a nota abaixo
À CAIXA
 
Prezados
 
Após verificação, constatamos que as branches develop dos repositórios abaixo são protegidas por 3 rulesets de organização (politicas_develop, protecao_push, quality_assurance), geridas pelo GitHub caixagithub, que impedem exclusão e push forçado direto na branch.
 
 
Recomendação: Não excluir/recriar as branches develop, tendo em vista a proteção vigente.
 
Ação recomendada ao time de desenvolvimento: Sincronizar a develop com a main via Pull Request, respeitando as regras de proteção já configuradas, executando os seguintes passos em cada repositório:
 
git checkout develop
git reset --hard main
git push --force origin develop
 
Em seguida, abrir Pull Request de sync/develop-com-main para develop pela interface do GitHub, permitindo que o merge passe pelas revisões e checks exigidos pelas rulesets vigentes.
 
 
Atenciosamente,

CTIS / CESTI Esteira DEVOPS DES TQS NPRD
