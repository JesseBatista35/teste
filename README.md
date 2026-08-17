Segue o texto pra fechamento da WO0000081407663:

Prezados,

Em atendimento à solicitação de inclusão de certificado mTLS no ambiente DevOps da aplicação SISGH-LINK, foi realizada a atualização do truststore utilizado pela esteira (caixa-truststore-sisgh.jks), com a inclusão dos seguintes certificados fornecidos pela área solicitante:

Certificado do servidor mTLS do Banco do Brasil (star_mtls_api_hm_bb_com_br)
Cadeia de certificação GeoTrust TLS RSA CA G1

O arquivo atualizado foi publicado na Library do Azure DevOps e vinculado à task de Download Secure File da esteira de release SISGH-link-okd4. Nova release foi executada com sucesso no ambiente DES (SISGH-link-20260817.1558-9.4.0.20-SNAPSHOT), com validação em log de que os certificados foram corretamente carregados pela JVM da aplicação no truststore configurado.

Ressalta-se que a validação completa do handshake mTLS com o parceiro externo depende da confirmação, junto à área solicitante, da existência do certificado digital A1 da CAIXA (emitido via CSR - TE079), necessário para a autenticação da CAIXA perante o Banco do Brasil. Essa confirmação foi solicitada via Teams e está pendente de retorno.

Diante do exposto, a parte de infraestrutura sob responsabilidade desta esteira (DES/TQS) foi concluída. Segue disponível para apoio adicional caso necessário após retorno da confirmação pendente.

Atenciosamente,
Jessé M Pereira Batista
Esteira - Devops DES E TQS
