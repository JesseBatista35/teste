Prezados, boa tarde.

Diagnóstico e correção concluídos para o problema de certificado expirado na integração SIFUG-Dataprev (TQS).

Resumo:
- Certificado expirado (IF104.p12) substituído pelo novo certificado ECO.DATAPREV.DES.CAIXA.GOV.BR, emitido pela Autoridade Certificadora do SERPRO Final SSL, fornecido por Carlos Augusto de Sousa Ferreira.
- Após a instalação, identificamos que a senha configurada na property api.dataprev.consignado.keystore.if104.password (sifug_sifgd.properties) estava desatualizada para o novo certificado, causando falha no carregamento do keystore (java.io.IOException: keystore password was incorrect).
- Carlos Augusto atualizou a senha diretamente no servidor srjtqapllx0021.
- Server srjtqapllx0021_sifug_inter_8080 reiniciado. Log de debug SSL confirmou handshake TLS completo e bem-sucedido com o Dataprev.
- Teste de integração validado pelo time de desenvolvimento.

Diante do exposto, solicitamos o encerramento da REQ000145872659.

Agradecemos o suporte de todos os envolvidos (Claudio Constantino Monteiro, Leonardo Nacacio Ricardo Simao, Carlos Augusto de Sousa Ferreira, Marco Antonio Paranhos Silva, Rafael Ferreira Sampaio).

Att.
