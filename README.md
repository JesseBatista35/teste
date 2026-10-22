gestão de resposta para a Gisele:

Oi Gisele, tudo bem sim! Entendi, obrigado.

No boleto, para destravar o deploy, ajustamos o jboss-deployment-structure.xml para deployment.sirotcon-ejb.jar e o EJB está sendo implantado pela esteira. Já está OK em DES.

Se preferirem padronizar o boleto como no intranet (EJB empacotado via Maven, sem a dependência externa), sem problema: é só nos avisar quando a build for para a release, que no mesmo deploy retiramos do config o sirotcon-ejb do jboss-deployments e o alias JNDI do standalone, para não ficar EJB duplicado no servidor.

E sobre o intranet: a versão em DES hoje é a build de 14/10, que ainda usa o EJB externo. Quando a build nova com essa mudança for para a release, fazemos a mesma limpeza no config do intranet.
