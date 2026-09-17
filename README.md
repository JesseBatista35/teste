Assunto: 403 Forbidden intermitente em recursos estáticos de https://sigfi2.desenvolvimento.extracaixa/ecr-web/

Descrição: A aplicação SIGFI-ECR (/ecr-web/) carrega normalmente (200 OK), mas aproximadamente metade das requisições de recursos estáticos (CSS/JS) retornam 403 Forbidden de forma intermitente, todas com corpo idêntico de 218 bytes (página Forbidden padrão do Apache). O padrão é consistente com round-robin entre os dois nodes Apache do VIP 10.116.80.21 (10.116.84.136 e 10.116.84.137), sugerindo que um dos dois está com config/ACL/cache divergente para esses paths estáticos.

Já validado (descartando causa aplicativa):

Contexto /ecr-web está ENABLED em ambos os proxies mod_cluster (10.116.84.136:6666 e 10.116.84.137:6666), verificado via jboss-cli no node sigfi-ecr_node1_lx0093 (10.116.89.252).
GET /ecr-web/ direto no VIP retorna 200 com HTML completo.
Os dois Apaches físicos recusam conexão direta (só aceitam via VIP), não sendo possível isolar qual dos dois está com o problema a partir do meu acesso.
Solicito: verificação de configuração/cache nos dois Apaches (10.116.84.136 e 10.116.84.137) atrás do VIP sigfi2.desenvolvimento.extracaixa (10.116.80.21), especialmente regras de ACL/Deny/cache aplicadas de forma divergente entre os dois nodes para os paths estáticos de /ecr-web/resources/*.
