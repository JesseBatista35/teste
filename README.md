**Descrição do atendimento:**

Acionamento referente a falhas no pipeline de release do sistema SICMU-intranet-update no ambiente TQS.

**Problema 1 — Terraform apply falhando por agente sem SSH:**

A task Terraform apply falhou com o erro:
```
fatal: [localhost]: UNREACHABLE!
ssh: connect to host localhost port 22: Connection refused
```
O agente de CI alocado para a release não possuía o serviço SSH habilitado no localhost, impedindo o Ansible de executar as tasks locais. A solução foi criar uma nova release, que alocou um agente diferente com SSH disponível, e o Terraform apply passou com sucesso.

**Problema 2 — Replace Tokens falhando por variáveis com nomes incorretos:**

Após o Terraform apply, a task "Alterando Valores placeholders nos arquivos de config" falhou com os erros:
```
variable not found: SGR_INTRA_URL
variable not found: DB2_CMU_URL
variable not found: DB2_CMU_USR
variable not found: DB2_RJP4_URL
```
O grupo de variáveis `SICMU-INTRANET-UPDATE-TQS` possui nomes divergentes em relação aos placeholders do `standalone-full-ha.xml`. As variáveis `DB2_URL`, `DB2_USR` e `SGR_URL` precisam ser renomeadas para `DB2_CMU_URL`, `DB2_CMU_USR` e `SGR_INTRA_URL` respectivamente, e a variável `DB2_RJP4_URL` precisa ser criada.

**Status:** Pendente de correção das variáveis pelo time responsável pelo grupo `SICMU-INTRANET-UPDATE-TQS` no Azure DevOps. Após a correção, a release deve ser reexecutada.
