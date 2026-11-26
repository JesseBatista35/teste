No PowerShell ou CMD da sua estação (o Windows 10/11 já tem scp):

powershell
scp p585600@10.122.155.62:caixa-truststore-acteste-nprd-sisou-20261126.jks .

Se a sua estação não chegar direto na 10.122.155.62, passe pelo bastion:

powershell
scp -J p585600@cadsvitrlx100 p585600@10.122.155.62:caixa-truststore-acteste-nprd-sisou-20261126.jks .

Também dá para usar o WinSCP: conecte na 10.122.155.62 e arraste o arquivo do home. Depois confira o hash no Windows; tem que dar 3ce3284e…151d:

powershell
certutil -hashfile caixa-truststore-acteste-nprd-sisou-20261126.jks SHA256
Na release (Azure DevOps)
Library → Secure files → + Secure file: suba o .jks. Em Pipeline permissions, autorize a release SISOU-sac-okd.
Releases → SISOU-sac-okd → Edit: na task Download secure file dos stages NPRD, selecione o ...20261126.jks. Só nos stages NPRD, sem mexer em PRD.
Variables: troque o JVM_TRUSTSTORE para caixa-truststore-acteste-nprd-sisou-20261126.jks nos grupos SISOU-SAC-OKD-DES e SISOU-SAC-OKD-TQS (e no HOTFIX, se ele usar o acteste-nprd).
Save → Redeploy EC DES.
Validar
bash
oc get pod -n sisou-des -l name=sisou-sac-okd-des
oc logs <pod-novo> -c sisou-sac-okd-des -n sisou-des | grep -o "trustStore=[^ ]*"
oc logs -f <pod-novo> -c sisou-sac-okd-des -n sisou-des | grep -i -E "indecx|PKIX"

Peça ao dev para testar a integração. Se não aparecer PKIX, faça o redeploy em TQS e me avisa, que eu escrevo o texto da WO.

Como o Claude está se saindo nesta sessão?
