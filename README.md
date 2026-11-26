Use o nome do pod em que você gerou o arquivo. Pelo log da release era o sisou-sac-okd-des-252-56hk7, mas confirme:

bash
oc get pod -n sisou-des -l name=sisou-sac-okd-des

Depois, no host onde você quer o arquivo (bastion ou máquina de salto):

bash
POD=sisou-sac-okd-des-252-56hk7   # ajuste se o get acima mostrar outro
oc cp sisou-des/$POD:/tmp/caixa-truststore-acteste-nprd-sisou-20261126.jks ./caixa-truststore-acteste-nprd-sisou-20261126.jks

Se o oc cp reclamar de tar não encontrado no container, use esta alternativa:

bash
oc exec -n sisou-des $POD -c sisou-sac-okd-des -- cat /tmp/caixa-truststore-acteste-nprd-sisou-20261126.jks > caixa-truststore-acteste-nprd-sisou-20261126.jks

Para conferir se o arquivo veio íntegro, os dois hashes têm que bater:

bash
oc exec -n sisou-des $POD -c sisou-sac-okd-des -- sha256sum /tmp/caixa-truststore-acteste-nprd-sisou-20261126.jks
sha256sum caixa-truststore-acteste-nprd-sisou-20261126.jks

No bastion cadsvitrlx100 você abriu uma sessão nova, então antes pode ser preciso rodar o oc login --token=... --server=https://api.nprd.caixa:6443 de novo.

O arquivo está no /tmp do pod, então se o pod reiniciar ele some e é preciso gerar de novo. Copie antes de fazer qualquer redeploy.
