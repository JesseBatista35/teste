Prezados,

Atendendo à solicitação, as pipelines de TQS e TQS2 do SISOU-sac-okd foram ajustadas para utilizar o novo arquivo de segurança caixa-truststore-acteste-nprd-sisou-20261126.jks, a mesma versão já aplicada em DES no atendimento do chamado REQ000147179322.

Ajustes realizados na release SISOU-sac-okd:
- Task "Download secure file" dos stages EC TQS e EC TQS2 atualizada para o arquivo caixa-truststore-acteste-nprd-sisou-20261126.jks;
- Variável JVM_TRUSTSTORE do grupo de variáveis SISOU-SAC-OKD-TQS atualizada para o novo arquivo.

O novo truststore contém a autoridade certificadora raiz "Amazon Root CA 1", necessária para validar a cadeia atual do certificado de https://indecx.com.

Os novos deploys em TQS e TQS2 passarão a utilizar o arquivo atualizado. Diante do exposto, a demanda será encerrada.

Atenciosamente,

Jessé Batista
Analista
CTIS / CESTI Esteira DEVOPS DES TQS NPRD
