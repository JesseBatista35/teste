Resumo:
Atualização dos arquivos standalone.xml e set_config.properties no servidor CRJTQAPLLX036 (10.116.26.227), ambiente TQS - loginX (SISET/SSO 7.3.0).

Ações realizadas:
1. Backup dos arquivos originais em /opt/open/sso/7.3.0/standalone/configuration/ (standalone.xml.bkp_202609100952 e set_config.properties.bkp_202609100952).
2. Arquivos enviados pela equipe transferidos via bastion (cadsvitrlx100) e aplicados via scp em /tmp no servidor de destino.
3. Arquivos copiados para /opt/open/sso/7.3.0/standalone/configuration/, com ajuste de proprietário (chown spssodr1:singlesignon).
4. Teste de subida do serviço via ./standalone.sh -c standalone.xml.

Resultado:
O boot do JBoss falhou (WFLYSRV0056: Server boot has failed in an unrecoverable manner). Causa raiz identificada: os endereços de bind (inet-address) das interfaces management, public e private no standalone.xml apontam para o IP 10.116.88.148, que corresponde ao servidor de origem/antigo, e não ao IP atual do host CRJTQAPLLX036 (10.116.26.227). Isso gerou as falhas WFLYSRV0082 (failed to resolve interface management / public), impedindo o boot completo do serviço.

Observação importante:
Não temos autorização para alterar esse parâmetro por conta própria. Os arquivos foram mantidos exatamente como enviados pela equipe (com o IP antigo), e o ambiente permanece com o serviço parado até que a correção do IP nas interfaces seja autorizada e um novo arquivo (ou aprovação para ajuste local) seja enviado.

Status: Aguardando retorno da equipe responsável pelo standalone.xml sobre a correção do IP de bind antes de nova tentativa de subida.

Servidor: CRJTQAPLLX036 (10.116.26.227)
Analista: Jessé Batista - P585600
