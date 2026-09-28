# Copiar log do JBoss de um servidor para o cadsvitrlx100

Ajuste as variáveis no início de acordo com o caso.

```bash
# ===== VARIÁVEIS (ajustar) =====
IP=10.116.18.153                                  # servidor da aplicação
USUARIO=p585600                                   # sempre o SEU usuário
LOGDIR=/opt/SIALI/jboss-eap-6.4/standalone/log    # pasta de log do JBoss
SISTEMA=SIALI
DATA=$(date +%Y-%m-%d)
```

## 1. No cadsvitrlx100: entrar no servidor

```bash
ssh $USUARIO@$IP
```

## 2. No servidor: localizar e copiar o log

```bash
ls -l /opt/SIALI/jboss-eap-6.4/standalone/log/

# Log de HOJE = server.log (sem data no nome)
# server.log.AAAA-MM-DD = dias anteriores (rotacionado à meia-noite)
sudo cp /opt/SIALI/jboss-eap-6.4/standalone/log/server.log /tmp/SIALI_server.log.$(date +%Y-%m-%d)

# (opcional) log da aplicação, costuma ter stack trace mais detalhado
sudo cp /opt/SIALI/jboss-eap-6.4/standalone/log/siali.log /tmp/SIALI_siali.log.$(date +%Y-%m-%d)

sudo chown p585600 /tmp/SIALI_*
gzip /tmp/SIALI_*.log.*
ls -lh /tmp/SIALI_*

exit    # VOLTAR para o cadsvitrlx100 antes do scp
```

## 3. No cadsvitrlx100: puxar o arquivo

```bash
# conferir que o prompt é [p585600@cadsvitrlx100 ~]$
scp $USUARIO@$IP:/tmp/${SISTEMA}_*.gz .
ls -lh ${SISTEMA}_*.gz
```

## 4. Limpar as cópias no servidor

```bash
ssh $USUARIO@$IP "rm -f /tmp/${SISTEMA}_*.gz"
```

## Dicas

- Sempre use o SEU usuário (p585600) no scp/ssh; outro usuário dá "Permission denied".
- O scp que busca o arquivo roda no cadsvitrlx100, nunca dentro do servidor de destino.
- Ver o log compactado sem descompactar: `zless arquivo.gz` ou `zgrep -i "ERROR" arquivo.gz`
- Pegar só um trecho (ex.: erros de hoje): `sudo grep -i -A20 "ERROR" $LOGDIR/server.log > /tmp/${SISTEMA}_erros.log`
