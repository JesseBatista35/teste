Prezados,

Seguem as variáveis de ambiente solicitadas do SICIA, extraídas dos processos em execução (PM2, serviço sicia-ldap):

DES – https://des.sicia.pedes.caixa/ (10.116.83.94 / sctdeapllx0094.df.caixa)

STRATEGY=user
LDAP_URL=ldap://ldapcluster.corecaixa:489
LDAP_USER_BASE=ou=People,o=caixa
LDAP_GROUP_BASE=ou=Groups, o=caixa

TQS – https://tqs.sicia.pedes.caixa/ (10.116.18.118 / scttqapllx0013.df.caixa)

STRATEGY=user
LDAP_URL=ldap://ldapcluster.corecaixa:489
LDAP_USER_BASE=ou=People,o=caixa
LDAP_GROUP_BASE=ou=Groups, o=caixa

Obs.: o valor de LDAP_GROUP_BASE contém um espaço após a vírgula (ou=Groups, o=caixa), conforme configurado na aplicação.

Os ambientes HMP, PILOTO e PRD estão fora do escopo de acesso da equipe DES/TQS NPRD. A solicitação desses valores deve ser direcionada ao time de Infraestrutura.

Você registrou bem: três tentativas, três bloqueios diferentes, e isso comprova falta de acesso, não falta de vontade. Pode anexar ao chamado assim:

Foi realizada tentativa de acesso aos demais ambientes a partir do jump server cadsvitrlx100, sem sucesso:

HMP (10.116.114.124 / scthmdadlx0002.df.caixa): Permission denied (publickey,password). O usuário p585600 não possui credencial neste servidor.
PILOTO (10.123.6.86): Connection refused na porta 22. Não há acesso SSH a partir da rede NPRD.
PRD (10.123.6.10): Connection refused na porta 22. Não há acesso SSH a partir da rede NPRD.

Esses ambientes não fazem parte do escopo de atendimento da equipe DES/TQS NPRD. Solicito o redirecionamento ao time de Infraestrutura para a coleta das variáveis STRATEGY, LDAP_URL, LDAP_USER_BASE e LDAP_GROUP_BASE em HMP, PILOTO e PRD.



Atenciosamente,
Jessé Batista
