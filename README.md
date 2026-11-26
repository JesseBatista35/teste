ntão deixe o rollout seguir. Não rode o set resources agora, porque ele dispararia outro rollout no meio deste. Acompanhe com:

bash
oc get pods -n sidsc-des | grep v20
oc get events -n sidsc-des --sort-by=.lastTimestamp | tail -5
Pod v20 em Running e 1/1, ou 2/2 com o exporter: subiu. Quando o deployer terminar, o uso cai para 3840Mi.
Ainda aparece exceeded quota: cancele o rollout e rode o comando com o nome certo do container (o app se chama sidsc-storybook-v20-des):
bash
oc set resources dc/sidsc-storybook-v20-des -c sidsc-storybook-v20-des --limits=memory=256Mi --requests=memory=128Mi -n sidsc-des
oc rollout latest dc/sidsc-storybook-v20-des -n sidsc-des

Depois que o v20 estiver no ar, faltam três coisas:

Avisar o time do SIDSC que o v19 está fora do ar (réplica 0) em DES. Ele não volta com a cota atual.
Ajustar a release do v20 para 1 réplica. O DESIRED 2 vem de lá, e a próxima release desfaz o scale manual.
Abrir a solicitação de aumento da cota do sidsc-des (sugestão: 8Gi de limits.memory), para o v19 voltar e a v21 caber.
