Resumo:
Atualização dos arquivos standalone.xml e set_config.properties no servidor CRJTQAPLLX036 (10.116.26.227), ambiente TQS - loginX (SISET/SSO 7.3.0).

Causa raiz do problema original (IP de bind):
Conforme confirmado por Jaqueline Pereira da Silva, o servidor de aplicação original do ambiente TQS foi perdido, e o novo servidor (CRJTQAPLLX036) foi criado como clone do ambiente DES - por isso herdou o IP do DES (10.116.88.148) em vez do IP real do TQS (10.116.26.227).

Ações realizadas:
1. Backup dos arquivos originais em /opt/open/sso/7.3.0/standalone/configuration/.
2. Arquivos standalone.xml e set_config.properties enviados pela equipe aplicados no servidor.
3. Corrigidos os endereços de bind (interfaces management, public e private) no standalone.xml, de 10.116.88.148 para 10.116.26.227 (IP correto do CRJTQAPLLX036).
4. Serviço reiniciado para validar a subida (./standalone.sh -c standalone.xml).

Resultado:
O erro de bind (WFLYSRV0082 / interfaces management e public) foi resolvido com sucesso após o ajuste de IP.

Novo problema identificado durante a subida:
O boot falhou ao conectar nos datasources Oracle (oraset e KeycloakDS), com o erro:
ORA-12514, TNS:listener does not currently know of service requested in connect descriptor

Teste de conectividade de rede (porta 1521) para o listener cnpexdadvm01-scan2.extra.caixa.gov.br confirmou que a porta está aberta e a conexão TCP é estabelecida - ou seja, não é bloqueio de rede/firewall. O listener respondeu, porém informou que não conhece o serviço orat02sc a partir dessa origem, o que indica possível restrição de acesso por IP no lado do banco (valid node checking) para o novo servidor (10.116.26.227), ou divergência no nome do service name configurado para esse ambiente.

Status: Serviço JBoss ainda não sobe por completo devido a esse novo bloqueio. Encaminhando para verificação do time de banco de dados/DBA quanto à liberação do IP 10.116.26.227 para o serviço orat02sc no listener SCAN cnpexdadvm01-scan2.extra.caixa.gov.br:1521.

Servidor: CRJTQAPLLX036 (10.116.26.227)
Analista: Jessé Batista - P585600
