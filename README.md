. Gerar o .jks (no pod, em /tmp)
bash
cd /tmp
keytool -importcert -noprompt -alias amazonrootca1 -file cert-02 \
  -keystore caixa-truststore-acteste-nprd-sisou-20261126.jks -storepass changeit
keytool -list -storepass changeit -keystore caixa-truststore-acteste-nprd-sisou-20261126.jks | grep contains   # esperado: 40
exit

Você já tinha feito a cópia do original com esse nome; o loop que falhou não alterou o arquivo. Se ficar em dúvida, refaça o cp antes do keytool.

2. Trazer o arquivo para a sua máquina

Na máquina de salto:

bash
oc cp sisou-des/<pod>:/tmp/caixa-truststore-acteste-nprd-sisou-20261126.jks ./caixa-truststore-acteste-nprd-sisou-20261126.jks

Depois copie da máquina de salto (10.122.155.62) para a sua estação com WinSCP ou scp, porque o upload no Azure DevOps é pelo navegador.

3. Ajustar a release
Library → Secure files → + Secure file: suba o caixa-truststore-acteste-nprd-sisou-20261126.jks. Em Pipeline permissions, autorize a release SISOU-sac-okd.
Releases → SISOU-sac-okd → Edit: na task Download secure file dos stages NPRD (EC DES, EC TQS, EC TQS2, e HOTFIX se usar o mesmo arquivo), selecione o arquivo novo. Se a task estiver dentro de um task group compartilhado com o stage PRD, avise antes de mexer, porque aí a troca afeta PRD também.
Variables: troque o JVM_TRUSTSTORE para caixa-truststore-acteste-nprd-sisou-20261126.jks nos grupos SISOU-SAC-OKD-DES, SISOU-SAC-OKD-TQS e SISOU-SAC-OKD-HOTFIX (este último se ele também usar o acteste-nprd). A senha (JVM_PASSWORD_TRUSTSTORE) continua a mesma.
Save e Redeploy no EC DES.

Recomendo usar o nome novo em vez de substituir o arquivo antigo. Assim o rollback é só voltar a variável e a task para o 20260827.

4. Validar
bash
oc get pod -n sisou-des -l name=sisou-sac-okd-des          # pegar o pod novo
oc logs <pod-novo> -c sisou-sac-okd-des -n sisou-des | grep -o "trustStore=[^ ]*"   # deve mostrar ...20261126.jks
oc logs -f <pod-novo> -c sisou-sac-okd-des -n sisou-des | grep -i -E "indecx|PKIX"

Peça ao dev para disparar a integração com a IndeCX. Se não aparecer PKIX, faça o redeploy em TQS.

Uma coisa à parte: o grupo DES tem valores sensíveis em texto aberto, como SISOU-INT_SEN_BACEN, SISOU-RECLAME_AQUI_SECRET e SISOU-INT_API_KEY. Vale sugerir ao time que marque essas variáveis como secret.
