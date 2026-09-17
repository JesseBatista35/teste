Assunto: 403 Forbidden ao acessar https://sigfi2.desenvolvimento.extracaixa/ecr-web/ — bloqueio na camada Apache

Descrição: Ao acessar https://sigfi2.desenvolvimento.extracaixa/ecr-web/ (VIP 10.116.80.21), o Apache retorna 403 Forbidden ("You don't have permission to access this resource"), servido pelo próprio httpd (Server: Apache/2.4.37 (Red Hat)), antes de chegar à aplicação.

Validado do lado JBoss (node sigfi-ecr_node1_lx0093, host 10.116.89.252) via jboss-cli, subsystem=modcluster: o contexto /ecr-web está registrado e ENABLED em ambos os proxies mod_cluster (10.116.84.136:6666 e 10.116.84.137:6666), descartando problema de contexto desabilitado ou node fora do balanceador.

Solicito: verificação de regra de acesso (Deny/Allow, ACL de IP, <Location>) no vhost sigfi2.desenvolvimento.extracaixa nos servidores Apache 10.116.84.136/10.116.84.137 (ou no VIP 10.116.80.21) que possa estar bloqueando o path /ecr-web para a origem [seu IP/rede].
