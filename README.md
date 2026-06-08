⚠️ **SICMU-intranet-update — Ação necessária: Correção de variáveis no grupo TQS**

Durante a execução da release no ambiente TQS, a task **"Alterando Valores placeholders nos arquivos de config"** falhou com os seguintes erros:

```
variable not found: SGR_INTRA_URL
variable not found: DB2_CMU_URL
variable not found: DB2_CMU_USR
variable not found: DB2_RJP4_URL
```

A causa é que o grupo de variáveis `SICMU-INTRANET-UPDATE-TQS` possui nomes divergentes em relação ao que o `standalone-full-ha.xml` espera nos placeholders.

**Correções necessárias no grupo `SICMU-INTRANET-UPDATE-TQS`:**

**1. Renomear as seguintes variáveis:**
| Nome atual | Nome correto |
|---|---|
| `DB2_URL` | `DB2_CMU_URL` |
| `DB2_USR` | `DB2_CMU_USR` |
| `SGR_URL` | `SGR_INTRA_URL` |
| `KEY-PASSWORD` | `KEY_PASSWORD` |
| `KEYSTORE-PASSWORD` | `KEYSTORE_PASSWORD` |

**2. Criar a variável faltante:**
| Variável | Descrição |
|---|---|
| `DB2_RJP4_URL` | URL do datasource DB2 RJP4 do ambiente TQS |

**3. Corrigir valor incorreto:**
| Variável | Valor atual | Valor correto |
|---|---|---|
| `PASSWORD_TRUSTSTORE` | `change_it` | `changeit` |

Após as correções, basta rodar novamente a release. 🙏



**Descrição do atendimento:**

Acionamento referente à falha no pipeline de release do sistema SICMU-intranet-update no ambiente DES (e posteriormente TQS), onde todos os deployments do JBoss EAP 7.4 iniciavam com status FAILED, impedindo a aplicação de ficar online.

**Diagnóstico:**

Após análise dos logs do servidor (`/logs/jboss/jboss-eap/standalone/sicmu-intranet-update/server.log`), foram identificados dois problemas no arquivo de configuração `standalone-full-ha.xml`:

1. **JGroups/TCPPING mal configurado** — o protocolo de cluster TCP referenciava a variável `${jboss.cluster.tcp.initial_hosts}` que nunca foi fornecida ao servidor, causando falha em cascata de 648 serviços dependentes.

2. **Infinispan em modo cluster** — os cache containers `web`, `ejb` e `hibernate` estavam configurados com `distributed-cache` e `invalidation-cache` (modo distribuído), dependentes do JGroups que não subia.

**Solução aplicada:**

- Corrigido o TCPPING para host local fixo `127.0.0.1[7600]` (modo standalone)
- Convertidos todos os cache containers do Infinispan para `local-cache`
- Alterado o cache de sessão EJB stateful de `distributable` para `simple`
- Arquivo `standalone-full-ha.xml` atualizado no repositório `SICMU-intranet-update-config` para persistir a correção nas próximas releases

**Resultado em DES:** JBoss iniciou com todos os deployments implantados com sucesso. Release SICMU-intranet-update-78 executada com status Succeeded.

**Pendência identificada para TQS:** Grupo de variáveis `SICMU-INTRANET-UPDATE-TQS` com nomes divergentes (`DB2_URL`, `DB2_USR`, `SGR_URL`) em relação aos placeholders do `standalone-full-ha.xml`. Encaminhado ao time responsável para correção antes da próxima release no ambiente TQS.

**Status:** Atendimento encerrado. ✅
