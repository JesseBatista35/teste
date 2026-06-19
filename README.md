📘 MANUAL DE ERROS COMUNS EM CONFIGMAP
Kubernetes/ArgoCD - Esteiras NPRD (DES/TQS)
---
⚠️ ERRO 1: Booleanos sem aspas (MAIS COMUM)
Sintoma:
```
Sync operation failed: ConfigMap in version "v1" cannot be handled as a ConfigMap: 
json: cannot unmarshal bool into Go struct field ConfigMap.data of type string
```
Causa:
Valores true/false sem aspas são interpretados como BOOLEANOS, não como STRINGS.
❌ ERRADO:
```yaml
data:
  QUARKUS_ENABLED: true
  DEBUG_MODE: false
  CACHE_ACTIVE: true
```
✅ CORRETO:
```yaml
data:
  QUARKUS_ENABLED: "true"
  DEBUG_MODE: "false"
  CACHE_ACTIVE: "true"
```
Como Corrigir:
Abra o arquivo ConfigMap (.yaml)
Procure por: `true` ou `false` (sem aspas)
Adicione aspas em volta: `"true"` ou `"false"`
Commit e aguarde sync no ArgoCD
---
⚠️ ERRO 2: Números sem aspas
Sintoma:
```
ConfigMap data fields must be strings, not numbers
```
Causa:
Números sem aspas são interpretados como INT ou FLOAT, não como STRING.
❌ ERRADO:
```yaml
data:
  PORT: 8080
  TIMEOUT: 3000
  RETRY_COUNT: 5
```
✅ CORRETO:
```yaml
data:
  PORT: "8080"
  TIMEOUT: "3000"
  RETRY_COUNT: "5"
```
---
⚠️ ERRO 3: Valores nulos (null)
Sintoma:
```
ConfigMap data value cannot be null
```
Causa:
Deixar um campo vazio ou com `null` explícito.
❌ ERRADO:
```yaml
data:
  API_KEY: null
  DATABASE_URL:
  SECRET:
```
✅ CORRETO:
Se não tem valor, remova a linha OU use string vazia:
```yaml
data:
  API_KEY: ""
  # DATABASE_URL: (remova esta linha)
  SECRET: ""
```
---
⚠️ ERRO 4: Indentação incorreta
Sintoma:
```
YAML parsing error: mapping values are not allowed in this context
```
Causa:
Espaçamento errado no YAML (2 espaços é o padrão).
❌ ERRADO:
```yaml
data:
QUARKUS_ENABLED: "true"        # Falta indentação!
   DATABASE_URL: "localhost"   # Indentação errada (3 espaços)
```
✅ CORRETO:
```yaml
data:
  QUARKUS_ENABLED: "true"      # 2 espaços
  DATABASE_URL: "localhost"    # 2 espaços
  CACHE_TIMEOUT: "5000"        # 2 espaços
```
---
⚠️ ERRO 5: Caracteres especiais sem aspas
Sintoma:
```
YAML parsing error: unrecognized escape sequence
```
Causa:
Caracteres especiais como `:`, `#`, `@`, `&` sem aspas quebram o YAML.
❌ ERRADO:
```yaml
data:
  DATABASE_URL: jdbc:mysql://localhost:3306/db
  EMAIL: usuario@empresa.com
  PASSWORD: senha#123@45
```
✅ CORRETO:
```yaml
data:
  DATABASE_URL: "jdbc:mysql://localhost:3306/db"
  EMAIL: "usuario@empresa.com"
  PASSWORD: "senha#123@45"
```
---
🔍 COMO DEBUGAR
Passo 1: Verificar ArgoCD
Acesse ArgoCD
Clique na aplicação
Procure por "APP CONDITIONS" - lá tem o erro exato
Passo 2: Validar YAML
Use uma ferramenta online:
```
https://www.yamllint.com/
```
Cole o conteúdo do seu ConfigMap e veja os erros.
Passo 3: Comparar com versão anterior
Vá no GitHub
Clique no arquivo problemático
Clique em "History"
Compare com a versão anterior que funcionava
Passo 4: Verificar logs do pod
```bash
kubectl logs -n <namespace> <pod-name>
```
---
✅ CHECKLIST ANTES DE FAZER COMMIT
[ ] Todos os valores booleanos têm aspas? ("true", "false")
[ ] Todos os números têm aspas? ("8080", "3000")
[ ] Não tem campos com `null` ou vazios?
[ ] Indentação correta? (2 espaços)
[ ] Caracteres especiais estão entre aspas?
[ ] Validou no yamllint.com?
[ ] Comparou com versão anterior que funcionava?
[ ] Fez o commit com uma mensagem clara?
---
📝 EXEMPLO CORRETO COMPLETO
```yaml
apiVersion: v1
kind: ConfigMap
metadata:
  name: cm-minha-aplicacao-des
  labels:
    app: minha-app
    environment: des
data:
  # Configurações booleanas - COM ASPAS!
  QUARKUS_ENABLED: "true"
  DEBUG_MODE: "false"
  
  # Configurações numéricas - COM ASPAS!
  PORT: "8080"
  TIMEOUT: "5000"
  MAX_CONNECTIONS: "100"
  
  # URLs e strings especiais - COM ASPAS!
  DATABASE_URL: "jdbc:mysql://localhost:3306/db"
  API_ENDPOINT: "https://api.exemplo.com:8443"
  
  # Variáveis normais - COM ASPAS POR SEGURANÇA!
  ENVIRONMENT: "des"
  LOG_LEVEL: "INFO"
  CACHE_TTL: "3600"
```
---
🚀 FLUXO DE CORREÇÃO RÁPIDO
Identifique o erro no ArgoCD (ler a mensagem)
Encontre o arquivo ConfigMap no repositório de infra
Valide o YAML no yamllint.com
Corrija os valores (aspas em tudo que não é número ou booleano VÁLIDO)
Faça o commit com mensagem clara: "Fix: corrige tipos de dados em ConfigMap"
Aguarde o sync no ArgoCD (máximo 2-3 minutos)
Verifique o status - deve ficar "Healthy" e "Synced"
---
📞 QUANDO PEDIR AJUDA
Se mesmo após seguir este manual o erro persistir:
Tire screenshot do erro no ArgoCD
Compartilhe o arquivo ConfigMap completo
Informe qual foi a última alteração
Contate o time de DevOps
---
Última atualização: 19/06/2026
Autor: Analista de Esteiras NPRD
Versão: 1.0
