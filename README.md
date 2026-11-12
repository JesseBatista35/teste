Grupo SIINP-nucleo-tqs (escopo EC TQS)

Variável	De	Para
VAULT_LOCATION	/usr/src/app/secrets_files/siinp_tqs/	/usr/src/app/secrets_files/SIINP_TQS/

O resto do grupo e a SIINP-BT-VAULT-TQS já estão corretos.

Depois:

Crie a release no stage EC TQS com a tag 1.91.0.4.
Valide no pod novo:
bash
   oc get pods -n siinp-tqs | grep siinp-nucleo-tqs
   oc exec <pod-novo> -n siinp-tqs -- ls -la /usr/src/app/secrets_files/SIINP_TQS/
   oc logs <pod-novo> -n siinp-tqs | grep -i "Failed to load config"

Os arquivos devem estar em maiúsculo e o grep não pode retornar nada.

O TQS2 usa a mesma library do BT, que hoje está em maiúsculo, então ele vai precisar do mesmo tipo de ajuste quando for deployado de novo. Nada muda agora para ele.

Como o Claude está se saindo nesta sessão?
