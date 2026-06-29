SIMPG-jboss - Migração para Java 11
Status: Bloqueado - Aguardando SIMPG-jboss-config
O que foi feito:

Solicitado: Reduzir Java para versão compatível com Vault (máximo 11)
Realizado: Alterada tag de imagem JBoss de 7.4.14-openjdk-17 para 7.4.11-openjdk11
Adicionadas variáveis ao grupo SIMPG-JBOSS-DES:

VAULT_KEYSTORE_FILE: vaultcaixa.keystore
VAULT_KEYSTORE_PATH: /opt/jboss/standalone/configuration/vault-des



Problemas encontrados:

standalone-full-ha.xml não é montado no container durante S2I build
Vault keystore não é copiado para o caminho esperado

Responsabilidade:

Team SIMPG-jboss-config deve garantir que:

standalone-full-ha.xml seja montado no container
vault keystore seja copiado para /opt/jboss/standalone/configuration/vault-des/

Bloqueador: Arquivo de config centralizado (não é esteira)
