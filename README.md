Pessoal, quando chegarem solicitações de exclusão ou recriação de branch develop no GitHub desse tipo abaixo:

Prezado(a),
Precisamos reiniciar a nossa branch develop, pois a mesma está muito desatualizada em relação a main.
Solicito que a recriação da branch develop nos seguintes projetos:
[lista de repositórios]

Responder com a nota abaixo:

À CAIXA

Prezados,

Após verificação, constatamos que as branches develop dos repositórios abaixo são protegidas por 3 rulesets de organização (politicas_develop, protecao_push, quality_assurance), geridas pelo GitHub caixagithub, que impedem exclusão e push forçado direto na branch.

Recomendação: Não excluir/recriar as branches develop, tendo em vista a proteção vigente.

Ação recomendada ao time de desenvolvimento: Sincronizar integralmente o histórico da develop com o da main, sem excluir a branch, através dos comandos abaixo, em cada repositório:

git checkout develop
git reset --hard main
git push --force origin develop

Atenciosamente,
CTIS / CESTI — Esteira DEVOPS DES TQS NPRD
