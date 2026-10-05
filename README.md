Boa tarde.

Verificamos a configuração. A library não armazena a senha: a variável KEY_STORE_KAFKA_CLIENT_PASSWORD referencia o secret SIMPI_USER_KEYSTORE no cofre BeyondTrust, resolvido em runtime. O valor está sendo entregue corretamente ao pod.

Testes realizados no ambiente DES (namespace simpi-des):

A senha do cofre SIMPI_USER_KEYSTORE não abre o arquivo /deployments/sispi_user_keystore_kafka_des.p12. O teste foi feito com keytool no pod em execução (revisão 135, de 01/10) e repetido com as demais senhas do cofre do sistema, sem sucesso.
O .p12 é idêntico (mesmo hash SHA-256) nas imagens de 01/10 e de hoje, então não houve alteração nem corrupção do arquivo no build.
A versão de 01/10 sobe normalmente porque não carregava esse keystore (nenhum erro no log desde o boot). O uso do keystore cliente no canal monitoria foi introduzido na build de hoje, o que expôs a divergência.

Para seguir, é necessário:

Obter a senha correta do sispi_user_keystore_kafka_des.p12 (credencial do usuário mpiclient no Event Streams) e atualizar o secret SIMPI_USER_KEYSTORE no BeyondTrust; ou substituir o .p12 pelo arquivo correspondente à senha cadastrada.
Confirmar qual mecanismo de autenticação o canal monitoria deve usar. A aplicação já possui KAFKA_USER/KAFKA_PASS (SCRAM). Se for esse o mecanismo, a configuração de keystore cliente pode ser desnecessária.

Após o ajuste no cofre, basta reexecutar a release.
