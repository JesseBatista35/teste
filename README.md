# Configuração do Application Insights no JBoss EAP — VM

> Documentação baseada na experiência prática de configuração em ambientes com JBoss EAP 7.x em VM Linux.
> Complementa a wiki oficial, cobrindo especificamente o **JBoss Domain Mode**, que possui diferenças importantes em relação ao Standalone.

---

## Índice

1. [Pré-requisitos](#1-pré-requisitos)
2. [Modos de operação do JBoss](#2-modos-de-operação-do-jboss)
3. [Configuração — JBoss Standalone Mode](#3-configuração--jboss-standalone-mode)
4. [Configuração — JBoss Domain Mode](#4-configuração--jboss-domain-mode)
5. [Configuração — Container (OKD/OpenShift)](#5-configuração--container-okdopenshift)
6. [Arquivo applicationinsights.json](#6-arquivo-applicationinsightsjson)
7. [Alterando o nome da aplicação no Azure (role.name)](#7-alterando-o-nome-da-aplicação-no-azure-rolename)
8. [Validando se o agente está ativo](#8-validando-se-o-agente-está-ativo)
9. [Erros comuns](#9-erros-comuns)

---

## 1. Pré-requisitos

Antes de iniciar a configuração, verifique:

- O arquivo `applicationinsights-agent.jar` está presente no servidor (geralmente em `/opt/azure/config/appinsights/`)
- O proxy está liberado (`proxydes.caixa` em DES/TQS, `proxynuvem.caixa` em PRD)
- A `connectionString` do Application Insights está disponível no portal Azure
- As variáveis de ambiente estão configuradas no Variable Group do Azure DevOps:

| Variável | Descrição |
|---|---|
| `APPLICATIONINSIGHTS_CONNECTION_STRING` | Connection string obtida no portal Azure |
| `APPLICATIONINSIGHTS_ROLE_NAME` | Nome de identificação do sistema no Azure |
| `APPLICATIONINSIGHTS_SAMPLING_PERCENTAGE` | Percentual de amostragem (padrão: 100) |
| `APPLICATIONINSIGHTS_SELF_DIAGNOSTICS_LEVEL` | Nível de diagnóstico do agente (padrão: INFO) |
| `URL_PROXY` | Host do proxy (`proxydes.caixa` ou `proxynuvem.caixa`) |

---

## 2. Modos de operação do JBoss

Para saber em qual modo o JBoss está rodando, execute:

```bash
ps -ef | grep java | grep "Process Controller"
```

| Resultado | Modo |
|---|---|
| Processo com `-D[Process Controller]` presente | **Domain Mode** |
| Processo com `-D[Standalone]` ou ausência do Process Controller | **Standalone Mode** |

No **Domain Mode**, existem dois arquivos de configuração principais:

- `domain.xml` — no servidor **master** — define JVM options por server-group
- `host.xml` — no servidor **slave** — define variáveis de ambiente por servidor

---

## 3. Configuração — JBoss Standalone Mode

No modo standalone, a configuração do agente é feita no arquivo `standalone.conf`.

**Localização típica:**
```
$JBOSS_HOME/bin/standalone.conf
```

**Adicionar na seção `# Specify options to pass to the Java VM`:**

```bash
JAVA_OPTS="$JAVA_OPTS -javaagent:/opt/azure/config/appinsights/applicationinsights-agent.jar"
JAVA_OPTS="$JAVA_OPTS -Dapplicationinsights.configuration.file=/opt/azure/config/appinsights/applicationinsights.json"
```

**Configuração de proxy (adicionar logo abaixo):**

```bash
# CONFIGURACAO DE PROXY PARA O APPLICATION INSIGHTS
JAVA_OPTS="$JAVA_OPTS -Djava.net.useSystemProxies=false"
JAVA_OPTS="$JAVA_OPTS -Dhttp.proxyHost=proxydes.caixa"
JAVA_OPTS="$JAVA_OPTS -Dhttp.proxyPort=80"
JAVA_OPTS="$JAVA_OPTS -Dhttps.proxyHost=proxydes.caixa"
JAVA_OPTS="$JAVA_OPTS -Dhttps.proxyPort=80"
JAVA_OPTS="$JAVA_OPTS -Dhttp.nonProxyHosts=localhost\|127.0.0.1\|*.caixa\|*.caixa.gov.br"
```

Após editar, reinicie o JBoss para aplicar.

---

## 4. Configuração — JBoss Domain Mode

> ⚠️ **Atenção:** No Domain Mode, **não existe `standalone.conf`**. As JVM options são controladas pelo `domain.xml` (no master) e as variáveis de ambiente por servidor ficam no `host.xml` (no slave). Editar apenas um dos arquivos **não é suficiente**.

### 4.1 Identificando os servidores

Confirme qual instância JBoss corresponde à sua aplicação:

```bash
ps -ef | grep java | grep "Server:"
```

Exemplo de saída esperada **sem** o agente (problema):
```
-D[Server:sisag-lx0041] ... (sem -javaagent)
```

Exemplo de saída esperada **com** o agente (correto):
```
-D[Server:sisag-lx0041] ... -javaagent:/opt/azure/config/appinsights/applicationinsights-agent.jar
```

### 4.2 Editando o domain.xml (servidor master)

O `domain.xml` fica no servidor **master** e define as JVM options por `server-group`.

**Localização:**
```
$JBOSS_HOME/domain/configuration/domain.xml
```

Localize o `server-group` da sua aplicação e adicione o bloco `<jvm-options>` com o javaagent:

```xml
<server-group name="sisag" profile="cef-full-ha" >
    <jvm name="default">
        <heap size="256m" max-size="256m"/>
        <jvm-options>
            <option value="-javaagent:/opt/azure/config/appinsights/applicationinsights-agent.jar"/>
            <option value="-Dapplicationinsights.configuration.file=/opt/azure/config/appinsights/applicationinsights.json"/>
            <option value="-Dhttps.proxyHost=proxydes.caixa"/>
            <option value="-Dhttps.proxyPort=80"/>
            <option value="-Dhttp.proxyHost=proxydes.caixa"/>
            <option value="-Dhttp.proxyPort=80"/>
            <option value="-Dhttp.nonProxyHosts=localhost|127.0.0.1|*.caixa|*.caixa.gov.br"/>
        </jvm-options>
    </jvm>
    <socket-binding-group ref="cef-full-ha-sockets"/>
</server-group>
```

### 4.3 Editando o host.xml (servidor slave)

O `host.xml` fica no servidor **slave** e define variáveis de ambiente por instância de servidor.

**Localização:**
```
$JBOSS_HOME/domain/configuration/host.xml
```

Localize o bloco `<server>` da sua aplicação e adicione o bloco `<jvm>` com a variável `APPLICATIONINSIGHTS_ROLE_INSTANCE`:

**Antes:**
```xml
<server name="sisag-lx0041" group="sisag" auto-start="true">
    <socket-bindings socket-binding-group="cef-full-ha-sockets" port-offset="6"/>
</server>
```

**Depois:**
```xml
<server name="sisag-lx0041" group="sisag" auto-start="true">
    <jvm name="default" debug-enabled="false" env-classpath-ignored="false">
        <environment-variables>
            <variable name="APPLICATIONINSIGHTS_ROLE_INSTANCE" value="${env.HOSTNAME}_sisag-lx0041"/>
        </environment-variables>
    </jvm>
    <socket-bindings socket-binding-group="cef-full-ha-sockets" port-offset="6"/>
</server>
```

> **Observação:** O arquivo `host.xml` pertence ao usuário `jboss7`. Para editá-lo, utilize:
> ```bash
> sudo -u jboss7 -s
> ```

### 4.4 Reiniciando após as alterações

Após editar ambos os arquivos, é necessário reiniciar o host-controller para que as JVM options do `domain.xml` sejam aplicadas:

```bash
# Como usuário jboss7
sudo -u jboss7 -s
$JBOSS_HOME/bin/jboss-cli.sh --connect --controller=localhost:9999 --command=":shutdown(restart=true)"
```

### 4.5 Validando

```bash
ps -ef | grep java | grep "Server:sisag"
```

Confirme que o parâmetro `-javaagent:...applicationinsights-agent.jar` aparece na linha do processo.

---

## 5. Configuração — Container (OKD/OpenShift)

Em ambientes de container, o agente é adicionado via **JBoss Deployments** durante o processo de build.

**Passo 1 — Adicionar o agente no `Deployments`:**

No repositório de configuração, adicione o seguinte no arquivo de deployments:

```
com.microsoft.azure:applicationinsights-agent:3.3.1:jar
```

**Passo 2 — Incluir o `applicationinsights.json` no repositório de config:**

Crie a pasta `configuration/` no repositório de config e adicione o arquivo `applicationinsights.json` (ver seção 6).

**Passo 3 — Configurar variáveis no Variable Group do Azure DevOps** (ver seção 1).

**Passo 4 — Gerar nova release** para que o agente e o JSON sejam incluídos na imagem.

---

## 6. Arquivo applicationinsights.json

Modelo completo do arquivo de configuração:

```json
{
    "connectionString": "__APPLICATIONINSIGHTS_CONNECTION_STRING__",
    "role": {
        "name": "__APPLICATIONINSIGHTS_ROLE_NAME__"
    },
    "proxy": {
        "host": "__URL_PROXY__",
        "port": 80
    },
    "sampling": {
        "percentage": 100
    },
    "instrumentation": {
        "logging": {
            "level": "INFO"
        }
    },
    "selfDiagnostics": {
        "destination": "file+console",
        "level": "INFO",
        "file": {
            "path": "applicationinsights.log",
            "maxSizeMb": 5,
            "maxHistory": 1
        }
    }
}
```

**Em VM (Domain ou Standalone):** o arquivo fica em `/opt/azure/config/appinsights/applicationinsights.json`

**Em container:** o arquivo fica na pasta `configuration/` do repositório de config e é copiado para `$JBOSS_HOME/standalone/configuration/` durante o deploy.

---

## 7. Alterando o nome da aplicação no Azure (role.name)

O nome que aparece no portal Azure é controlado pelo campo `role.name` no `applicationinsights.json`.

Para alterar em VM, acesse o servidor e execute como `jboss7`:

```bash
sudo -u jboss7 -s
sed -i 's/"name": "NOME_ATUAL"/"name": "NOVO_NOME"/' /opt/azure/config/appinsights/applicationinsights.json
cat /opt/azure/config/appinsights/applicationinsights.json
```

> ✅ **Não é necessário reiniciar o JBoss** — o agente lê o JSON periodicamente e aplica a mudança em alguns minutos.

> ⚠️ **Atenção:** O `applicationinsights.json` em `/opt/azure/config/appinsights/` é **compartilhado entre todos os módulos do host**. Alterações nesse arquivo impactam todos os servidores que utilizam o mesmo agente. Para diferenciar instâncias, utilize a variável `APPLICATIONINSIGHTS_ROLE_INSTANCE` no `host.xml`.

---

## 8. Validando se o agente está ativo

**Verificar via processo:**
```bash
ps -ef | grep java | grep "Server:nome-do-servidor"
```
Confirme a presença de `-javaagent:...applicationinsights-agent.jar` na linha.

**Verificar via log do agente:**
```bash
cat /opt/azure/config/appinsights/applicationinsights.log
```
Mensagem de sucesso esperada:
```
ApplicationInsights Java Agent 3.3.1 started successfully (PID XXXX)
```

---

## 9. Erros comuns

| Erro | Causa | Solução |
|---|---|---|
| Agente não aparece no `ps -ef` | `-javaagent` não foi adicionado no `domain.xml` ou `standalone.conf` | Adicionar a JVM option e reiniciar |
| `Permission denied` ao editar arquivos | Arquivos pertencem ao usuário `jboss7` | Usar `sudo -u jboss7 -s` antes de editar |
| `ApplicationInsights Java Agent` não aparece no log | Caminho do jar incorreto | Verificar se o jar existe em `/opt/azure/config/appinsights/` |
| Dados não chegam no Azure | Problema de proxy ou certificado | Testar: `curl -v -x proxydes.caixa:80 https://southcentralus-3.in.applicationinsights.azure.com` |
| `WARN: Connection string not set` | Variável `APPLICATIONINSIGHTS_CONNECTION_STRING` ausente ou vazia | Verificar o `applicationinsights.json` e as variáveis de ambiente |

---

## Equipes envolvidas

| Ambiente | Responsável |
|---|---|
| DES/TQS — configuração JBoss e proxy | CEDES / Comunidade |
| HMP/PRD — configuração JBoss | CEPTI |
| HMP/PRD — proxy e firewall | CETAD |

---

*Documentação elaborada com base na configuração prática realizada em `sspdeapllx0041` — JBoss EAP 7.0 Domain Mode.*
