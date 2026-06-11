**Descrição do atendimento:**

Acionamento referente a falhas no pipeline de release do sistema SICMU-intranet-update no ambiente TQS.

**Problemas identificados e correções realizadas:**

**1. Terraform apply falhando por agente sem SSH:**
A task Terraform apply falhou pois o agente de CI alocado não possuía o serviço SSH habilitado no localhost. Solução: criada nova release que alocou um agente diferente, e o Terraform apply passou com sucesso.

**2. Replace Tokens falhando por variáveis com nomes incorretos:**
O grupo de variáveis `SICMU-INTRANET-UPDATE-TQS` possuía nomes divergentes em relação aos placeholders do `standalone-full-ha.xml`. Correções realizadas no grupo de variáveis:
- `DB2_URL` renomeado para `DB2_CMU_URL`
- `DB2_USR` renomeado para `DB2_CMU_USR`
- `SGR_URL` renomeado para `SGR_INTRA_URL`
- Variável `DB2_RJP4_URL` criada

**3. Erro no playbook Ansible — Jinja2 unsafe em RHEL 9.3:**
A task "Deploy Config no JBOSS" falhava com `Conditional is marked as unsafe` no arquivo `stack_modules_custom_block.yml` devido à versão mais restritiva do Ansible no RHEL 9.3. Corrigido via branch na esteira `esteira-jboss-vm-v2`.

**4. Permissão de diretório no servidor:**
O diretório `/opt/jboss-eap/standalone/data/content` estava com owner `root`, impedindo o JBoss (usuário `jboss`) de escrever os artefatos. Corrigido com `chown -R jboss:jboss` e `chmod -R 775`.

**5. URL do datasource DB2 incorreta:**
A variável `DB2_CMU_URL` no grupo TQS estava com o valor `jdbcdb2://` (faltando `:`) em vez de `jdbc:db2://`, impedindo a conexão com o banco. Corrigido diretamente no `standalone-full-ha.xml` e a variável foi corrigida no grupo para as próximas releases.

**Resultado:** JBoss iniciou com todos os deployments implantados com sucesso no ambiente TQS.

**Pendência:** A URL `https://sicmu-intranet-update.esteiras.tqs.caixa` ainda não está acessível, pois o VIP/balanceador do ambiente TQS (`10.116.180.x`) precisa ser configurado pelo time de redes CETEL. Chamado encaminhado separadamente.

**Status:** Atendimento encerrado. ✅
