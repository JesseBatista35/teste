# Comandos OKD/OpenShift — Referência de Diagnóstico
**Escopo:** DES/TQS NPRD | Ambientes: OKD4/OCP
**Uso:** Consulta rápida durante troubleshooting de pods, deployments e pipelines

---

## 1. Acesso ao Pod

```bash
oc rsh <nome-do-pod> -n <namespace>
```
Abre shell interativo dentro do container principal do pod.

```bash
oc rsh -c <nome-do-container> <nome-do-pod> -n <namespace>
```
Especifica o container quando o pod tem mais de um (ex: app + exporter + sidecar).

```bash
oc exec -it <nome-do-pod> -n <namespace> -- /bin/bash
```
Alternativa ao `rsh` forçando bash (se disponível na imagem).

```bash
oc exec <nome-do-pod> -n <namespace> -- <comando>
```
Executa um comando pontual sem abrir shell interativo.

```bash
oc exec -it <nome-do-pod> -c <container> -n <namespace> -- sh
```
Entra em container específico via `sh` (útil em imagens minimalistas sem bash).

---

## 2. Status e Informações do Pod

```bash
oc get pods -n <namespace>
```
Lista todos os pods do namespace.

```bash
oc get pods -n <namespace> -l name=<label-do-app>
```
Filtra pods por label (ex: nome da aplicação).

```bash
oc get pods -n <namespace> --sort-by=.metadata.creationTimestamp
```
Lista pods ordenados por data de criação (útil pra achar o pod mais recente).

```bash
oc get pod <nome-do-pod> -n <namespace> -o wide
```
Mostra informações estendidas: node onde está rodando, IP, etc.

```bash
oc describe pod <nome-do-pod> -n <namespace>
```
Mostra detalhes completos do pod, incluindo a seção **Events** — essencial pra diagnosticar `FailedScheduling`, `FailedCreate`, `ImagePullBackOff`, etc.

```bash
oc get pod <nome-do-pod> -n <namespace> -o yaml
```
Exporta o manifesto completo do pod em YAML (útil pra comparar configuração esperada vs aplicada).

---

## 3. Logs

```bash
oc logs <nome-do-pod> -n <namespace>
```
Logs do container principal do pod.

```bash
oc logs <nome-do-pod> -c <nome-do-container> -n <namespace>
```
Logs de um container específico (quando há múltiplos containers).

```bash
oc logs <nome-do-pod> -n <namespace> --previous
```
Logs do container anterior (útil quando o pod reiniciou/crashou — CrashLoopBackOff).

```bash
oc logs <nome-do-pod> -n <namespace> -f
```
Segue os logs em tempo real (follow).

```bash
oc logs <nome-do-pod> -n <namespace> --since=10m
```
Mostra apenas logs dos últimos 10 minutos.

```bash
oc logs -l name=<label-do-app> -n <namespace> --all-containers
```
Logs de todos os pods que casam com o label, todos os containers.

---

## 4. Eventos

```bash
oc get events -n <namespace>
```
Lista eventos do namespace (schedulling, criação, falhas de quota, etc.).

```bash
oc get events -n <namespace> --sort-by='.metadata.creationTimestamp'
```
Ordena eventos por data de criação (⚠️ usar este campo, não `.lastTimestamp`, que gera erro de sort em alguns clients).

```bash
oc get events -n <namespace> --field-selector type=Warning
```
Filtra apenas eventos do tipo Warning (erros e alertas).

```bash
oc get events -n <namespace> --watch
```
Acompanha eventos em tempo real.

---

## 5. Quota e Recursos

```bash
oc get resourcequota -n <namespace>
```
Visão resumida da quota do namespace (uso vs limite).

```bash
oc describe resourcequota -n <namespace>
```
Detalhe completo da quota, incluindo escopos (ex: NotBestEffort).

```bash
oc describe resourcequota <nome-da-quota> -n <namespace>
```
Detalhe de uma quota específica, quando há mais de uma no namespace.

```bash
oc adm top pods -n <namespace>
```
Mostra consumo real de CPU/memória por pod (requer metrics-server habilitado).

```bash
oc get limitrange -n <namespace>
```
Lista LimitRange do namespace (limites default por container, se houver).

---

## 6. Dentro do Pod — Rede e Conectividade

```bash
curl -v http://localhost:<porta>/health
```
Testa se a aplicação responde localmente na porta esperada.

```bash
curl -v telnet://<host>:<porta>
```
Alternativa ao `nc` quando `netcat` não está disponível na imagem.

```bash
nslookup <nome-do-service>
```
Testa resolução DNS interna do cluster.

```bash
nc -zv <host> <porta>
```
Testa se uma porta específica está acessível (banco, NFS, Vault, etc.).

```bash
cat /etc/resolv.conf
```
Mostra os DNS servers configurados no pod.

```bash
cat /etc/hosts
```
Mostra resolução de hosts estática configurada no pod.

---

## 7. Dentro do Pod — Configuração, Secrets e Volumes

```bash
env
```
Lista todas as variáveis de ambiente injetadas (ConfigMap/Secret via envFrom ou env).

```bash
env | grep -i <nome-da-variavel>
```
Filtra uma variável específica.

```bash
ls -la /caminho/do/mount
```
Verifica se um volume (ConfigMap, Secret, NFS) está montado e quais arquivos existem.

```bash
cat /caminho/do/arquivo/montado
```
Lê o conteúdo real de um arquivo montado via ConfigMap/Secret.

```bash
mount | grep <caminho>
```
Confirma se um mount (ex: NFS) está montado e com que opções.

```bash
find / -name "<nome-do-arquivo>" 2>/dev/null
```
Procura um arquivo específico dentro do filesystem do container (útil quando path está incerto).

---

## 8. Dentro do Pod — Processo e Saúde da Aplicação

```bash
ps aux
```
Lista os processos rodando dentro do container.

```bash
ps -ef
```
Alternativa ao `ps aux`, mais comum em imagens baseadas em RHEL/UBI.

```bash
df -h
```
Uso de disco dentro do container (disco cheio pode travar escrita de logs/temp).

```bash
free -h
```
Uso de memória dentro do container.

```bash
cat /proc/1/status | grep -i state
```
Verifica o estado do processo PID 1 (útil em imagens sem `ps`).

```bash
top
```
Monitor de processos em tempo real (se disponível na imagem).

```bash
kill -0 <pid>
```
Verifica se um processo específico ainda está vivo (não mata, só testa).

---

## 9. Java / JBoss EAP (contexto específico)

```bash
jcmd 1 VM.system_properties | grep java.version
```
Confirma a versão de Java realmente em execução no processo PID 1.

```bash
java -version
```
Versão do Java instalado na imagem (pode diferir da versão de runtime efetiva).

```bash
$JBOSS_HOME/bin/jboss-cli.sh -c --command="/subsystem=datasources:read-resource"
```
Lista datasources configurados no JBoss (confirma JNDI datasource ausente).

```bash
$JBOSS_HOME/bin/jboss-cli.sh -c --command="ls /deployment"
```
Lista deployments ativos na instância JBoss.

```bash
cat $JBOSS_HOME/standalone/log/server.log | tail -100
```
Últimas linhas do log do servidor JBoss (quando não passa pelo stdout do container).

```bash
$JBOSS_HOME/bin/jboss-cli.sh -c --command="/subsystem=elytron:read-resource"
```
Verifica configuração do Elytron (útil pro histórico de incompatibilidade Keycloak adapter/Elytron OIDC vs WildFly legado).

---

## 10. Copiar Arquivos (sem abrir shell)

```bash
oc cp <namespace>/<nome-do-pod>:/caminho/arquivo ./arquivo-local
```
Copia um arquivo de dentro do pod pro ambiente local.

```bash
oc cp ./arquivo-local <namespace>/<nome-do-pod>:/caminho/destino
```
Copia um arquivo local para dentro do pod (útil para testes pontuais, não para produção).

```bash
oc cp <namespace>/<nome-do-pod>:/caminho/pasta ./pasta-local -c <container>
```
Copia uma pasta inteira, especificando container quando há mais de um.

---

## 11. Deployment / Rollout

```bash
oc rollout status dc/<nome-da-dc> -n <namespace>
```
Acompanha o status do rollout de uma DeploymentConfig.

```bash
oc rollout retry dc/<nome-da-dc> -n <namespace>
```
Força nova tentativa de rollout após falha.

```bash
oc rollout history dc/<nome-da-dc> -n <namespace>
```
Histórico de revisões do rollout.

```bash
oc rollout undo dc/<nome-da-dc> -n <namespace>
```
Reverte para a revisão anterior.

```bash
oc scale rc <nome-da-rc> --replicas=<numero> -n <namespace>
```
Escala manualmente uma ReplicationController (usado para liberar quota, forçar shutdown de versão antiga).

```bash
oc get rc -n <namespace> -l name=<label-do-app>
```
Lista ReplicationControllers de uma aplicação.

---

## Notas de Segurança e Boas Práticas

- Sempre confirmar o **namespace correto** antes de rodar `scale`/`rollout undo` — comandos destrutivos em NPRD já causam impacto real nas aplicações em DES/TQS.
- `oc rsh`/`oc exec` alteram nada por padrão, mas qualquer escrita feita manualmente dentro do pod (`cat >`, `vi`, etc.) é temporária e se perde no próximo redeploy — não usar como correção definitiva.
- Ao escalar réplicas antigas para 0 (contorno de quota), avisar o time/squad responsável pela aplicação, já que gera indisponibilidade breve.
- Para diagnósticos recorrentes de quota, preferir `oc describe resourcequota` antes de qualquer ação manual — confirma se o problema é realmente CPU/memória/pods antes de intervir.
