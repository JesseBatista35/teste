Prezados,

Concluída a análise do log encaminhado. Diagnóstico:

O erro "SSLHandshakeException: Received fatal alert: certificate_expired" ocorre porque o certificado cliente utilizado na integração com a API do Dataprev (ConsignadoIntegracaoDataprevResource) está expirado.

Certificado identificado:
- Servidor: srjtqapllx0021, aplicacao SIFUG
- Arquivo: /infra_app/config/sifug/IF104.p12
- Referenciado em: sifug_sifgd.properties (api.dataprev.consignado.keystore.if104.path)
- Alias: 1
- Validade: 25/08/2025 a 25/08/2026 (expirado ha aproximadamente 15 dias)

Nao se trata de problema de truststore/cadeia de confianca (como inicialmente cogitado), e sim do certificado cliente usado no mTLS com o Dataprev.

Como o mesmo cenario ja ocorreu recentemente em PRD e foi resolvido pelo suporte daquele ambiente, solicitamos orientacao sobre o processo de renovacao: se o novo certificado foi obtido diretamente junto ao Dataprev ou reemitido pela mesma AC utilizada originalmente, para que possamos providenciar o mesmo em TQS.

Apos a obtencao do novo certificado, a substituicao do arquivo /infra_app/config/sifug/IF104.p12 e o reinicio do server srjtqapllx0021_sifug_inter_8080 ficam a cargo desta equipe.

Ficamos no aguardo.

Att.
