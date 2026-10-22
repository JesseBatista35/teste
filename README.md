Gisele, uma sugestão, caso vocês ainda não tenham olhado isso:

Quando o SIROT era externo, colocamos duas configurações no repositório de config para atender o EJB no servidor:

jboss-deployments, na raiz do SIGSJ-boleto-config, com a linha do sirotcon-ejb. É o que faz a esteira implantar o jar externo no JBoss.
Alias JNDI no jboss/standalone-full-ha.xml, dentro do subsystem naming:
xml
<bindings>
    <lookup name="java:global/sirotcon-ejb-2.3.0.1-farm/SIROTConBean!br.gov.caixa.sirot.ejb.SIROTCon" lookup="java:global/sirotcon-ejb/SIROTConBean!br.gov.caixa.sirot.ejb.SIROTCon"/>
</bindings>

Agora que o sirotcon-ejb vai empacotado na aplicação, essas duas configurações deixam de ser necessárias. Se ficarem, o servidor passa a ter duas cópias do SIROTConBean (a do EAR e a externa), o que pode gerar conflito de duplicidade no deploy. Inclusive já vimos um DuplicateServiceException do SIROTConBean no log do boleto.

Se vocês já não tiverem feito, a sugestão é remover as duas no mesmo momento em que subirem a build nova. Se forem removidas antes, a versão atual, que ainda depende do EJB externo, volta a falhar no deploy. O mesmo vale para o intranet e, depois, para o internet.

Se preferir, me avisa quando a build estiver pronta que eu faço esse ajuste no config e acompanho a release com você.
