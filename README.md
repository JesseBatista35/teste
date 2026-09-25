Pessoal, boa tarde!

Sobre a solicitação de credencial LDAP do SICIA (HMP/PILOTO/PRD), segue o status:

O que levantamos:
Hoje o SICIA não usa usuário técnico no LDAP. A conexão com o ldapcluster.corecaixa:489 é anônima, e o login é validado com a matrícula e a senha do próprio usuário. Por isso não existe uma credencial atual para repassar.

O que já foi feito:
Encaminhei a demanda para a Segurança / Gestão de Identidades, que é quem cria contas de serviço no LDAP corporativo, com todo o contexto e os servidores corretos de cada ambiente:

HMP: scthmapllx0110.df.caixa (10.116.117.168)
PILOTO: cctcoitrlx008.df.caixa (10.123.38.230)
PRD: cctdcapllx0632.df.caixa (10.123.40.149)

O que vocês já podem adiantar com a fábrica:
Mesmo com a conta criada, a aplicação só vai usá-la depois de um ajuste no código, porque hoje não há onde configurar usuário e senha de bind. Sugestão:

Criar as variáveis LDAP_BIND_DN e LDAP_BIND_PASSWORD no ecosystem de cada ambiente (ecosystem/deploy/env/).
No services/ldap/libs/ldap.lib.js, fazer o bind com essa conta logo após abrir a conexão, antes das buscas (getPerfil e buscas de grupo), no lugar da consulta anônima atual.
Não deixar a senha fixa no código nem no repositório. O ideal é injetar a senha de forma segura no servidor.
Aproveitar a mudança para avaliar migrar para ldaps://. Hoje a conexão é ldap:// com validatecert: false, então a senha trafega sem criptografia.

Assim, quando a Segurança liberar a conta, é só preencher as variáveis e publicar. Qualquer dúvida, estou à disposição!
