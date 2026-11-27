E se a release ainda estiver com 2 réplicas, fica pior.

Para confirmar, me manda o log do task que falhou (ou o erro em vermelho da release) e a saída de:

bash
oc get events -n sidsc-des --sort-by=.lastTimestamp | tail -10
Como resolver
Definitivo: aumentar a cota do sidsc-des (8Gi de limits.memory). Sem isso, nenhuma app do namespace consegue fazer rolling deploy com folga.
Contorno para o v20: estratégia Recreate. O pod antigo sai antes do novo subir, então cabe: 3072 + 256 + 768 = 4096Mi. O custo é ficar alguns segundos fora do ar a cada deploy, o que é aceitável em DES.
bash
oc patch dc/sidsc-storybook-v20-des -n sidsc-des -p '{"spec":{"strategy":{"type":"Recreate"}}}'

Se a release reaplicar o template do DC a cada execução, esse patch se perde. Nesse caso, o ajuste de estratégia (e de réplicas = 1) precisa ir no template ou nas variáveis da release.

Reduzir o limite para 256Mi sozinho não resolve: o pod novo ficaria com 512Mi, e o total do rollout (4608Mi) ainda passa da cota.
