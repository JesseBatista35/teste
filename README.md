ajuste adicional no ambiente DES para viabilizar a subida da aplicação com mTLS habilitado.

Assunto: Ação complementar de ambiente DES para mTLS da aplicação SISPX-notificacao-webhook

Prezados,

Como complemento à demanda já atendida do certificado mTLS do Kafka, solicitamos ajuste adicional no ambiente DES para viabilizar a subida da aplicação com mTLS habilitado.

Contexto:

1 - O certificado mTLS do Kafka (secure file sispx_user_keystore_kafka_des.p12) já foi disponibilizado na release do módulo.

2 - O deploy ainda falha no startup da aplicação por ausência do keystore mTLS esperado no container.

* Solicitações para o módulo: SISPX-notificacao-webhook

1 -Montagem de keystore mTLS da aplicação no pod (OpenShift DES)

* Disponibilizar o arquivo:
webhook-mtls-keystore.p12

*Caminho obrigatório no container:
/certs/webhook-mtls-keystore.p12


2 - Injeção do segredo de senha do keystore mTLS da aplicação

* Garantir que a senha do keystore seja injetada no runtime do container.
* Validar mapeamento da variável para consumo da aplicação (sem expor valor em claro).

3 - Permissões de acesso ao arquivo
* Garantir permissão de leitura do arquivo por usuário não-root no container.

4 - Evidências de conclusão no retorno do chamado
* Evidência de presença do arquivo no pod no caminho /certs.

* - Evidência de que a variável de senha foi injetada (valor mascarado).
* - Evidência de startup da aplicação sem erro de leitura de keystore.

Referência de ambiente:

DES / OpenShift
URL IBM Stream (Kafka) DES:
https://development-ibm-es-ui-cp4i.apps.pixnprd4.caixa/gettingstarted
Observação:

Esta solicitação é complementar ao atendimento anterior do mTLS Kafka. - REQ000144169469


Objetivo: manter mTLS conforme requisito da entrega e eliminar falha de startup no DES.

Contato de referência (Kafka mTLS):
Joao Paulo Camargo dos Santos - c15909
