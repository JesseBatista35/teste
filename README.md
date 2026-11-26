Passo a passo (no oc)

1. Cancelar o rollout travado. Isso libera os 256Mi do deployer.

bash
oc rollout cancel dc/sidsc-storybook-v20-des -n sidsc-des

2. Ver o nome e os limites dos containers do v20.

bash
oc get dc sidsc-storybook-v20-des -n sidsc-des -o jsonpath='{range .spec.template.spec.containers[*]}{.name}{" -> "}{.resources}{"\n"}{end}'

3. Deixar o v20 com 1 réplica e baixar a memória do container do nginx (o de 512Mi; o de 256Mi deve ser um sidecar, não mexa nele).

bash
oc scale dc/sidsc-storybook-v20-des --replicas=1 -n sidsc-des
oc set resources dc/sidsc-storybook-v20-des -c <container-nginx> --limits=memory=256Mi --requests=memory=128Mi -n sidsc-des

4. Abrir espaço temporariamente: tirar o v19 do ar. É o mesmo time e é um Storybook antigo, mas combine antes com o pessoal do SIDSC.

bash
oc scale dc/sidsc-storybook-v19-des --replicas=0 -n sidsc-des

5. Subir o v20.

bash
oc rollout latest dc/sidsc-storybook-v20-des -n sidsc-des
oc rollout status dc/sidsc-storybook-v20-des -n sidsc-des
Por que esses números
Situação	Uso de memória
Agora, sem o deployer do v20	5 × 768Mi = 3840Mi
Com o v19 em 0	4 × 768Mi = 3072Mi
Durante o deploy do v20 (+512Mi do pod, +256Mi do deployer)	3840Mi → cabe nos 4096Mi
Depois do deploy, com o deployer finalizado	3584Mi

O v19 não consegue voltar com a cota atual: ele precisaria de 768Mi, e sobram só 512Mi.

Para não perder o ajuste
Release do v20: o oc set resources e o oc scale são manuais, e a próxima release sobrescreve. Ajuste também na release (variáveis de réplicas e memória, ou o template que ela aplica): 1 réplica e 256Mi no container do nginx.
Cota do sidsc-des: abra a solicitação para 8Gi de limits.memory. São 4 versões de Storybook (v19 a v22) mais portal, portal-v16 e react, além da folga para os rollouts. Com 4Gi não cabe.

Se o passo 2 mostrar algo diferente (por exemplo, o container do nginx sendo o de 256Mi), me manda a saída que eu ajusto os comandos.
