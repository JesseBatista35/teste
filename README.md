Boa tarde.

Conclusão: não há ajuste a ser feito na esteira, na library ou na imagem. A senha cadastrada no cofre BeyondTrust para o secret SIMPI_USER_KEYSTORE não corresponde ao arquivo sispi_user_keystore_kafka_des.p12. A correção depende do time responsável pelo sistema, conforme os próximos passos abaixo. Estamos devolvendo a WO para tratativa.

Análise realizada (DES, namespace simpi-des):

A library SIMPI-DICT-API-DES não armazena a senha. A variável KEY_STORE_KAFKA_CLIENT_PASSWORD referencia o secret SIMPI_USER_KEYSTORE do cofre, que é resolvido em runtime e está sendo entregue corretamente ao pod.
Testamos com keytool, no pod em execução (revisão 135, de 01/10), a abertura do .p12 com a senha do cofre. Resultado: keystore password was incorrect. Repetimos o teste com as demais senhas do cofre do sistema (SIMPI_KAFKA, SIMPI_KAFKA_TRUSTSTORE, SIMPI_KSPIX_01) e nenhuma abre o arquivo.
O .p12 é idêntico (mesmo hash SHA-256) nas imagens de 01/10 (20261001.0951) e de hoje (20261005.1328). Ou seja, não houve alteração nem corrupção do arquivo no build.
A versão de 01/10 sobe normalmente porque não carregava esse keystore: não há nenhum erro relacionado no log desde o boot. O uso do keystore cliente no canal monitoria foi introduzido na build de hoje, o que expôs a divergência, que já existia no cofre.

Próximos passos (time responsável pelo SIMPI):

Identificar a senha correta do sispi_user_keystore_kafka_des.p12 (credencial do usuário mpiclient no Event Streams). Se não for possível, solicitar ao time do Event Streams a reemissão da credencial, para que .p12 e senha venham correspondentes.
Com a senha correta em mãos, solicitar a atualização do secret SIMPI_USER_KEYSTORE no cofre pelo procedimento do CESET (equipe "O365GRP-CESET - Inserção de senhas"). Caso o .p12 seja substituído, atualizar também o arquivo no repositório e gerar nova build.
Avaliar se o canal monitoria realmente precisa de keystore cliente (mTLS). A aplicação já usa KAFKA_USER/KAFKA_PASS (SCRAM). Se esse for o mecanismo de autenticação, a configuração de keystore pode ser removida do código.
Após o ajuste, reexecutar a release.

Observação: a revisão 135 continua em execução. Como ela não usa esse keystore, não será afetada por um restart.

Permanecemos à disposição.
