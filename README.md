Assunto: RESOLVIDO - Pipeline sispl-consulta-transacao-ocp4-tqs - Erro de Certificado SSL

Prezados,
Informo que a demanda referente ao erro de certificado SSL no pipeline SISPL-consulta-transacao-ocp4-tqs foi resolvida com sucesso.
PROBLEMA IDENTIFICADO:

O pipeline apresentava erro de autenticação SSL ao conectar no servidor OIDC https://logintqs.caixa.gov.br/auth/realms/internet. O erro "PKIX path building failed" ocorria porque a aplicação estava apontando para um truststore inexistente.
SOLUÇÃO IMPLEMENTADA:

Foi corrigida a variável de ambiente JAVA_OPTIONS_APPEND no grupo de variáveis SISPL-CONSULTA-TRANSACAO-TQS, apontando para o truststore corporativo correto:
-Djavax.net.ssl.trustStore=/deployments/caixa-truststore-cedesbr_azurepush_atualizado2024.jks
Este truststore contém todos os certificados corporativos necessários, incluindo o certificado de logintqs.caixa.gov.br, e é padrão em diversos projetos da organização.
VALIDACAO E RESULTADO:

Após executar novo deploy/release, o pod sispl-consulta-transacao-ocp4-tqs-17-27b2v foi iniciado com sucesso. Os logs de startup confirmam ausência total de erros de certificado SSL, e a aplicação está funcionando normalmente com o OIDC resolvido corretamente.
A demanda está encerrada e pronta para produção.
Atenciosamente
