@Segurança @Infra @DevOps

PROBLEMA IDENTIFICADO: ARQUIVOS DE VAULT CORROMPIDOS - DES

🔴 SERVIDOR: caddeapllx1945.agil.nprd.caixa.gov.br (SIMPG-Monolito-DES)

🔴 ARQUIVOS CORROMPIDOS: /opt/jboss-eap/standalone/configuration/vault-des/vaultcaixa.keystore (500 bytes) e /opt/jboss-eap/standalone/configuration/vault-des/vault.keystore (506 bytes)

📋 EVIDÊNCIA: Validação retornou "java.io.IOException: Invalid keystore format" e logs do JBoss mostram "PBOX00140: Unable to get keystore" + "Password verification failed"

🔧 SOLICITAÇÃO: Equipe de SEGURANÇA precisa regenerar os arquivos de vault com: VAULT_KEYSTORE_ALIAS: SecurityKey | VAULT_SALT: 87654321 | VAULT_ITERATION_COUNT: 44 | VAULT_KEYSTORE_PASSWORD: MASK-lHQotGsUSmQ5YQRzdtNLD361rwn0c0oJ

📌 IMPACTO: Deploy de SIMPG-Monolito-DES (REQ000144464042-WO0000080696536) está bloqueado. JBoss EAP não consegue inicializar.

⏰ PRÓXIMOS PASSOS: 1) Segurança regenera vaults | 2) Infra/DevOps coloca arquivos no servidor | 3) Executa nova release SIMPG-monolito-199

Obrigado!
