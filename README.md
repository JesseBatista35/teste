Encaminho a demanda do sistema SIGFI FGC (DES), que requer acesso ao servidor da aplicação, ao qual nossa equipe não tem acesso.

Solicitações:

Disponibilizar o arquivo de configuração do JBoss (standalone.xml ou profile do domain.xml, conforme o modo do ambiente) da aplicação SIGFI FGC, com as senhas mascaradas.
URL: https://sigfi-fgc.des.caixa/fgc-web/
Alterar a autenticação da aplicação: o SIGFI FGC deixará de usar o OpenLDAP e passará a usar o LDAP/SSO corporativo de desenvolvimento.
LDAP DES: cxextrux071.desenvolvimento.extracaixa:1489
ClientID SSO: cli-web-gfi

Verificações já realizadas:

O nome sigfi-fgc.des.caixa resolve para 10.116.80.1 (VIP). Não temos acesso ao balanceador para identificar os servidores do pool.
O LDAP cxextrux071.desenvolvimento.extracaixa (10.192.230.64) está ativo e a porta 1489 aceita conexão. O teste foi feito a partir do próprio servidor LDAP.

Pendências para execução:

Identificar os servidores do pool do VIP 10.116.80.1 e o modo do JBoss (standalone/domain).
Validar a conectividade dos servidores da aplicação com 10.192.230.64:1489. Caso a porta esteja bloqueada, será necessária a liberação de firewall junto à CETEL/Redes.
Confirmar se o adapter Keycloak/SSO está instalado no EAP.
O secret do client cli-web-gfi (se for confidential) e a conta de serviço do LDAP (bind DN) devem ser fornecidos pelo cofre, não por texto.
