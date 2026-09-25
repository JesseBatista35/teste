Prezados,

Transferimos esta demanda para análise e atendimento pela Segurança / Gestão de Identidades, responsável pelo LDAP corporativo (ldapcluster.corecaixa).

Contexto levantado pela equipe DES/TQS NPRD (evidências na WO [Nº DA WO ANTERIOR]):

Atualmente a aplicação SICIA não possui usuário técnico (conta de serviço) no LDAP. A conexão é aberta sem credenciais (consulta anônima em ou=People,o=caixa) e a autenticação é feita com o DN e a senha do próprio usuário no login.
Configuração atual nos ambientes solicitados:
LDAP_URL=ldap://ldapcluster.corecaixa:489
LDAP_USER_BASE=ou=People,o=caixa
LDAP_GROUP_BASE=ou=Groups, o=caixa
STRATEGY=ldap-search
Servidores da aplicação (os dados da abertura estavam incorretos):
HMP: scthmapllx0110.df.caixa (10.116.117.168)
PILOTO: cctcoitrlx008.df.caixa (10.123.38.230)
PRD: cctdcapllx0632.df.caixa (10.123.40.149)

Ponto de atenção: caso seja criada uma conta de serviço, a aplicação só passará a utilizá-la após ajuste no código pela equipe de desenvolvimento do SICIA. Hoje não existe parâmetro para usuário e senha de bind. Sugerimos alinhar com o solicitante o objetivo da credencial antes da criação.

Atenciosamente,
Jessé Batista – DES/TQS NPRD
