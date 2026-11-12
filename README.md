Próximos comandos:

bash
# o que realmente tem dentro do diretório do cofre (com subpastas)
oc exec siinp-nucleo-tqs-647-krllq -n siinp-tqs -- ls -laR /usr/src/app/secrets_files/siinp_tqs/

# qual imagem a 647 usa (a 651 é 1.90.8.1)
oc get rc siinp-nucleo-tqs-647 -n siinp-tqs -o jsonpath='{.spec.template.spec.containers[*].image}{"\n"}'

# o que o init container está pedindo ao cofre
oc get dc siinp-nucleo-tqs -n siinp-tqs -o yaml | grep -iA2 -E "BT_SECRETS"

E o mesmo ls -laR num pod do DES, para comparar:

bash
oc get pods -n siinp-des | grep siinp-nucleo-des
oc exec <pod-nucleo-des> -n siinp-des -- ls -laR /usr/src/app/secrets_files/

O que procurar:

Arquivos direto no diretório em DES e numa subpasta em TQS: é diferença de path no cofre ou no BT_SECRETS_PATH/BT_SECRETS_LIST da library SIINP-BT-VAULT-TQS, a de 1 variável só.
Nenhum arquivo SECURITY_CRYPTO_KEY em TQS: a chave não está na lista que o init pede, ou não existe no path de TQS do cofre.
647 com tag mais antiga que 1.90.8.1: confirma que a 647 sobe só porque o código antigo não pede a SECURITY_CRYPTO_KEY.
