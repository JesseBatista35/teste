Resumo:
Atualização dos arquivos standalone.xml e set_config.properties no servidor CRJTQAPLLX036 (10.116.26.227), ambiente TQS - loginX (SISET/SSO 7.3.0).

Situação encontrada:
Ao acessar o servidor, não havia nenhum processo JBoss/Java em execução (ps -ef | grep java sem retorno) - ou seja, o serviço já estava parado antes de qualquer ação nossa. O standalone.xml já presente no servidor também estava com os endereços de bind (inet-address) apontando para o IP 10.116.88.148 (servidor de origem/antigo), e não para o IP atual do host (10.116.26.227) - mesmo problema presente no arquivo enviado pela equipe.

Ações realizadas:
1. Backup dos arquivos originais em /opt/open/sso/7.3.0/standalone/configuration/ (standalone.xml.bkp_202609100952 e set_config.properties.bkp_202609100952).
2. Arquivos enviados pela equipe transferidos via bastion (cadsvitrlx100) e aplicados via scp em /tmp no servidor de destino.
3. Arquivos copiados para /opt/open/sso/7.3.0/standalone/configuration/, com ajuste de proprietário (chown spssodr1:singlesignon).
4. Teste de subida do serviço via ./standalone.sh -c standalone.xml, para validar a configuração aplicada.

Resultado do teste:
O boot do JBoss falhou (WFLYSRV0056: Server boot has failed in an unrecoverable manner). Causa raiz: os endereços de bind (management, public, private) apontam para o IP 10.116.88.148, que não existe nas interfaces de rede do CRJTQAPLLX036, gerando as falhas WFLYSRV0082 (failed to resolve interface management / public). Importante registrar que essa falha é pré-existente à nossa atuação - o serviço já estava indisponível antes da atualização, e o mesmo problema de IP já constava no arquivo anterior do servidor, não foi introduzido pela nossa ação.

Observação importante:
Não temos autorização para alterar esse parâmetro por conta própria. Os arquivos foram mantidos exatamente como enviados pela equipe (com o IP antigo), e o ambiente permanece com o serviço parado até que a correção do IP nas interfaces seja autorizada e um novo arquivo (ou aprovação para ajuste local) seja enviado.

Status: Aguardando retorno da equipe responsável pelo standalone.xml sobre a correção do IP de bind antes de nova tentativa de subida.

Servidor: CRJTQAPLLX036 (10.116.26.227)
Analista: Jessé Batista - P585600
