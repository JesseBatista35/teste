Prezados,

Devolvendo a W.O. para ajuste no BeyondTrust.

Contexto: o pod do SINEP-PDQ em TQS não inicializa. O sidecar de secrets falha na autenticação com o BeyondTrust com o erro "Failed to authenticate due to one or more authentication rules", na chamada ao endpoint https://sicsn.caixa/BeyondTrust/api/public/v3.

Importante: em DES está tudo funcionando. A configuração de TQS (grupo SINEP-PDQ-BT-VAULT-TQS) está exatamente igual à de DES — mesmo BT_CLIENT_ID e mesmo BT_SECRETS_LIST (SINEP_DES/...). Por isso entendemos que não é problema de senha, e sim de regra de autenticação que provavelmente só permite a origem de DES.

Pedido:
- Que a equipe valide com a Segurança a regra de autenticação dessa API Registration e libere a origem (rede/IP dos pods de TQS); ou
- Que seja criada uma nova configuração específica para TQS (API Registration + regra de origem + secrets no caminho de TQS), já que hoje está apenas replicando a de DES.

Qualquer informação adicional (logs, IDs, namespace) eu envio na hora.

Obrigado.
