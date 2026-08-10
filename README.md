# Manual Operacional — Ambiente Legado SIGEC
**Repasse de:** Murilo Silva Andrade Souza | **Recebido por:** Jesse Mouta Pereira Batista e Patricia Vourakis Barbosa Braga
**Data do repasse:** 07/08/2026
**Motivo deste documento:** Murilo está afastado para cirurgia — este manual consolida os comandos e o passo a passo para sustentação do SIGEC durante o período.

---

## ⚠️ REGRA DE OURO — Leia antes de qualquer alteração

Antes de editar o `domain.xml` no Domain Controller, **sempre avisar previamente**:
- **Cledson** — referência principal (Domain Controller, ambientes legados, problemas de deploy)
- **Cláudio** — apoio (aplicações legadas, diagnóstico operacional, Domain XML)

**Motivo:** enquanto um admin edita o `domain.xml`, desenvolvedores podem estar fazendo deploy ao mesmo tempo → conflito de hashes/deployments → aplicações podem não subir, deploys falham, múltiplos sistemas ficam indisponíveis.

---

## 1. Acesso e navegação de logs

```bash
# Elevar privilégios
sudo su -

# Buscar comando no histórico
Ctrl + R
# depois digitar:
tail
# ou
log
```

**Log principal:** componente **Batch** — é o que mais quebra, mais é solicitado por usuários, normalmente exige reciclagem/restart.

---

## 2. Estrutura de arquivos compartilhados

| Item | Caminho |
|---|---|
| Diretório principal (certificados, config, integrações, Azure) | `/upload` |
| Certificados das aplicações | `/upload/sigec` |
| Config de integração Azure Service Bus / Filas MQ / métricas | `/upload/AzureSB.properties` |

**Atenção:** `/upload` **não é local** — está montado via **NFS** em `10.116.95.13`. Qualquer alteração ali pode impactar vários sistemas ao mesmo tempo.

---

## 3. JBoss Domain Controller

**Host Domain Controller:** `10.116.89.0` (eap70-nprd.des.caixa / sbrdeapllx069) — responsável por profiles, datasources, configs de servidor, deploys e gerenciamento das instâncias.

**Host principal do SIGEC:** servidor `104`

**Servidores importantes:**
- `sigec-portabilidade-batch` (Batch)
- `sigec-portabilidade-2` (Online)

### Conectar no CLI
```bash
connect
# usar TAB para autocompletar e listar hosts/servidores
```

### Reiniciar instância (procedimento recomendado do Murilo)
```bash
stop
kill
start
```
**Por quê nessa ordem:** às vezes o `stop` não finaliza o processo completamente. O `kill` garante encerramento definitivo do PID antes de subir limpo com `start`.

Outros comandos disponíveis no CLI: `resume`, `suspend`, `restart`.

---

## 4. Editar o domain.xml

```bash
cd /jboss/eap/dc/configuration
vim domain.xml
```

**Comandos úteis no vim:**
| Ação | Comando |
|---|---|
| Mostrar número da linha | `:set number` |
| Ir para o início | `gg` ou `:1` |
| Ir para o final | `Shift + G` |
| Buscar texto | `/profile` ou `/sigec` |
| Entrar em edição | `i` |
| Salvar | `:wq` |
| Sair sem salvar | `:q!` |

Dentro do profile SIGEC: URLs de conexão, configs DB2, pools de conexão. **Banco predominante: DB2.**

⚠️ Não esqueça o aviso prévio ao Cledson/Cláudio (seção acima) antes de editar.

---

## 5. Console JBoss

```
https://<servidor>:9443
```
Permite visualizar deploys, controlar servidores, ver profiles, gerenciar grupos e fazer deploy manual.

---

## 6. Camada Apache (Apresentação)

```bash
# Locais comuns de config
/etc/httpd
# ou
/opt

# Ver virtual hosts / sites publicados
cd sites-enabled
```

### Recarregar configuração (comando seguro)
```bash
reload
```
**Nunca usar `stop`** no Apache — pode derrubar dezenas de aplicações simultaneamente.

---

## 7. Diagnóstico de fluxo (nslookup)

```bash
nslookup <url>
```
Permite identificar: VIP → Apache responsável → caminho da aplicação.

**Fluxo da arquitetura:**
```
Internet → Balanceador (VIP/Citrix) → Apache (Apresentação) → JBoss (Aplicação) → Banco DB2
```
- **VIP/Balanceador Citrix:** sem acesso administrativo da equipe.
- **Apache:** equipe tem acesso (virtual hosts, redirects, proxy, publicação de sites).
- **JBoss:** equipe tem acesso (deploy, datasource, logs, configuração).

---

## 8. Problemas recorrentes do SIGEC e possíveis ações

| Sintoma | Ação sugerida |
|---|---|
| Metaspace / memória | Ajustar parâmetros de memória, checar comportamento da JVM, revisar parâmetros de inicialização |
| Alertas de Garbage Collector | Revisar config de monitoramento do GC do JBoss; avaliar se desativar elimina falso-positivo |
| Certificado expirado/inválido | Atualizar/renovar em `/upload/sigec` |
| Instância travada/não responde | `stop` → `kill` → `start` via CLI no host correto |

---

## 9. Tabela de servidores/consoles JBoss (Domain Controllers)

| URL | IP | Hostname | Versão JBoss |
|---|---|---|---|
| dc001.nprd.console.caixa | 10.116.95.3 | cspdeapllx001 | 7.1 |
| dc002.console.des.caixa | 10.116.95.197 | cspdeapllx052 | 7.3 |
| dc003.console.des.caixa | 10.116.88.97 | sspdeapllx0040 | 7.0 |
| dc004.console.des.caixa | 10.116.88.73 | sspdeapllx0016 | 6.4 |
| dc005.console.des.caixa | 10.116.88.114 | sspdeapllx0042 | 6.4 |
| dc006.console.des.caixa | 10.116.97.21 | cspdeapllx074 | 7.4 |
| dc007.console.des.caixa | 10.116.94.224 | sspdeapllx191 | 7.0 |
| dc008.console.des.caixa (keystore) | 10.116.24.124 | cadtqapllx032 | 7.4 |
| jboss.sinbcpj.des.caixa | 10.116.88.120 | sspdeapllx0051 | 6.4 |
| eap64-nprd.des.caixa | 10.116.88.20 | sbrdeapllx0001 | 6.4 |
| **eap70-nprd.des.caixa (Domain Controller)** | **10.116.89.0** | **sbrdeapllx069** | **7.1** |
| jbloteriasdc.caixa (DES/TQS) | 10.116.89.238 | sbrdeapllx059 | 7.0 |

### SIFEC Legado
- **DES:** SIFEC1 → sbrdeapllx0009 (10.116.88.28) | SIFEC2–5 → sbrdeapllx067 (10.116.94.187)
- **TQS:** SIFEC1–4 → sbrtqapllx0009 (10.116.24.101)

### Servidores web compartilhados Esteiras (DES/TQS)
- DES: caddeapllx135 (10.116.223.231), caddeapllx136 (10.116.223.232)
- TQS: caddeapllx137 (10.116.223.233), caddeapllx138 (10.116.223.234)
- VIP: 10.116.80.21

### Apaches legados
- Mais antigo: sbrdeaprlx0001 (10.116.84.136:6666), sbrdeaprlx0002 (10.116.84.137:6666)
- TQS BSB: 10.116.18.72 / 10.116.18.73
- Para configurar `siecmhealthcheck.des.caixa`: sbrdeaprlx052 (10.116.98.52), sbrdeaprlx053 (10.116.98.53)

### Logins DES/TQS
| Sistema | URL | Ambiente | Rede | Apache | IP Apache | JBoss | IP JBoss | Versão |
|---|---|---|---|---|---|---|---|---|
| siset | login.tqs.caixa | TQS | intra | srjtqaprlx037 | 10.116.18.235 | srjtqapllx0008 | 10.116.24.132 | jb73 |
| siset | logintqs.caixa.gov.br | TQS | inter | srjtqaprlx037 | 10.116.18.236 | srjtqapllx0009 | 10.116.24.133 | jb73 |
| siset | login.des.caixa | DES | intra | srjtqaprlx015 | 10.116.84.243 | srjdeapllx074 | 10.116.89.236 | jb73 |
| siset | logindes.caixa.gov.br | DES | inter | crjdeaprlx062 | 10.116.84.244 | srjdeapllx075 | 10.116.89.237 | jb73 |

REQ de referência: REQ000145164854

---

## 10. Contatos de apoio

| Nome | Área de apoio |
|---|---|
| **Cledson** | Domain Controller, ambientes legados, problemas de deploy |
| **Cláudio** | Aplicações legadas, diagnóstico operacional, Domain XML |
| Jorge | Citado como contato de apoio adicional no repasse |

---

## 11. Template — Registro de Atendimento / Acionamento SIGEC

> Copie o bloco abaixo a cada novo acionamento e preencha.

```
REGISTRO DE ATENDIMENTO — AMBIENTE LEGADO SIGEC
Data/Hora do acionamento: 
Aberto por (usuário/equipe): 
REC/Chamado nº: 

SISTEMA AFETADO: 
AMBIENTE (DES/TQS/NPRD): 
SERVIDOR(ES) ENVOLVIDO(S): 
INSTÂNCIA (Batch/Online): 

SINTOMA RELATADO:


DIAGNÓSTICO:
[ ] Metaspace/memória
[ ] Garbage Collector
[ ] Certificado (verificar /upload/sigec)
[ ] Instância travada
[ ] Falha de deploy (verificar concorrência com Domain Controller)
[ ] Outro: 

AÇÕES REALIZADAS:
1. 
2. 
3. 

CONTATOS ACIONADOS (se alteração em domain.xml):
[ ] Cledson avisado — Hora: 
[ ] Cláudio avisado — Hora: 

RESULTADO:
[ ] Resolvido
[ ] Escalado para: 
[ ] Pendente

OBSERVAÇÕES / RECOMENDAÇÃO PARA PRÓXIMO ATENDIMENTO:


Responsável pelo atendimento: Jesse Mouta Pereira Batista, CTIS/CESTI — Esteira DevOps DES TQS NPRD
```

---

*Documento consolidado a partir do repasse técnico de 07/08/2026 (Murilo Silva Andrade Souza). Use este manual como referência rápida; para qualquer dúvida na hora do incidente, me envie o sintoma que te ajudo a montar o diagnóstico e o registro.*
