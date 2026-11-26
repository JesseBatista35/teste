Prezados,

Identificada a causa da falha de comunicação com https://indecx.com (SSLHandshakeException: PKIX path building failed).

Causa:
O certificado do endereço indecx.com foi renovado em 24/11/2026 e passou a ser emitido por uma nova cadeia da Amazon (intermediária "Amazon RSA 2048 S24" / raiz "Amazon Root CA 1"). O truststore utilizado pela aplicação SISOU-sac-okd (caixa-truststore-acteste-nprd-sisou-20260827.jks) continha apenas o certificado anterior do site e a intermediária antiga ("Amazon RSA 2048 M04"), sem a autoridade raiz, impossibilitando a validação da nova cadeia. Não se trata de instabilidade momentânea.

Ação realizada:
- Gerado novo truststore caixa-truststore-acteste-nprd-sisou-20261126.jks, com inclusão da autoridade certificadora raiz "Amazon Root CA 1";
- Arquivo publicado em Library > Secure files e release SISOU-sac-okd ajustada (task Download secure file e variável JVM_TRUSTSTORE do grupo SISOU-SAC-OKD-DES);
- Realizado novo deploy em DES (pod sisou-sac-okd-des-253), com o novo truststore carregado e a aplicação no ar sem erros.

A inclusão da autoridade raiz também evita nova ocorrência do problema em futuras renovações de certificado do fornecedor.

Solicitamos que seja realizado o teste da integração com a IndeCX no ambiente DES e que nos informem o resultado. Não havendo retorno, a demanda será encerrada.

Atenciosamente,

Jessé Batista
Analista
CTIS / CESTI Esteira DEVOPS DES TQS NPRD
