Análise:

O erro reportado no Deploy Config no JBOSS (02/09, 17:45) ocorreu na etapa "Copiando artefatos para o(s) servidor(es) Jboss", com falha de sudo nos dois servidores (caddeapllx756 e caddeapllx763):

sudo: ldap_sasl_bind_s(): Can't contact LDAP server

O erro indica uma falha pontual de conectividade entre os servidores e o serviço de autenticação LDAP no momento da execução do deploy, impedindo a autenticação do sudo necessária para gravar os artefatos no diretório de deployments do JBoss. Não foi identificado problema na esteira, no playbook ou nos artefatos gerados — o restante da execução (parada/reinício do serviço, cópia de configurações, download dos artefatos Maven) ocorreu normalmente em ambos os servidores.

Resolução:

Novo deploy executado em 03/09 às 12:13 concluiu com sucesso em ambos os servidores (failed=0), confirmando que se tratou de uma intermitência momentânea de conectividade com o LDAP, já normalizada.

Status: Resolvido — sem necessidade de intervenção adicional.
