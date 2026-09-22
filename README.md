api.dataprev.consignado.keystore.if104.path=/infra_app/config/sifug/IF104.p12

O caminho é explícito e direto pro arquivo IF104.p12 na raiz de /infra_app/config/sifug/. O código (visto no print do Marco) só faz new FileInputStream(properties.getProperty(KEYSTORE_DATAPREV_PATH)) — ele lê exatamente o que estiver nessa property, seja qual for a pasta. A pasta dataprev/ que achamos antes é só um repositório histórico de arquivos de geração do certificado (.key, .pem, .cnf), não é
