O pod da versão 651 não existe mais porque o rollout falhou: siinp-nucleo-tqs-651-deploy está em Error. O OpenShift voltou para a versão anterior, e quem está rodando agora é o siinp-nucleo-tqs-647-krllq, de 2 dias atrás, provavelmente sem a mudança que usa a SECURITY_CRYPTO_KEY.

O 647 serve para ver como o diretório do cofre está montado em TQS hoje:

bash
oc exec siinp-nucleo-tqs-647-krllq -n siinp-tqs -- ls -la /usr/src/app/secrets_files/
oc exec siinp-nucleo-tqs-647-krllq -n siinp-tqs -- env | grep -i SMALLRYE

Também vale olhar o que a 651 levou e por que o deploy falhou:

bash
oc logs siinp-nucleo-tqs-651-deploy -n siinp-tqs
oc get dc siinp-nucleo-tqs -n siinp-tqs -o yaml | grep -iA2 -E "SMALLRYE|secrets_files"

Como interpretar:

Se o ls mostrar SIINP_TQS (maiúsculo) e o SMALLRYE_CONFIG_SOURCE_FILE_LOCATIONS apontar para siinp_tqs, a causa é o VAULT_LOCATION. Corrija no grupo SIINP-nucleo-tqs e rode a release de novo.
Se o diretório for siinp_tqs mesmo, mas sem os arquivos (SECURITY_CRYPTO_KEY, SINPSD01_HSM etc.), o problema está na library SIINP-BT-VAULT-TQS, que só tem 1 variável contra 3 em DES.
O RESTARTS 1 (31m ago) no 647 também merece um oc logs siinp-nucleo-tqs-647-krllq --previous -n siinp-tqs, para ver se é o mesmo problema de config.

Manda a saída dos comandos que eu fecho o diagnóstico.
