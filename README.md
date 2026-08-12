Identificamos e corrigimos a causa raiz do problema: a variável CONNECTOR no Variable Group do Azure DevOps (SICMU-INTRANET-UPDATE-DES) estava configurada com um caminho incorreto:

/opt/jboss/jboss-eap/standalone/configuration/sicmu_jconnector.properties

O diretório /opt/jboss/ não existe nesse servidor - a instalação real do JBoss está em /opt/jboss-eap/, sem essa pasta intermediária.

Corrigimos a variável para o caminho correto e realizamos um novo deploy. Confirmamos diretamente no servidor que o standalone-full-ha.xml (arquivo de configuração efetivamente em uso pelo processo do JBoss) já reflete o caminho corrigido:

/opt/jboss-eap/standalone/configuration/sicmu_jconnector.properties

Com isso, o apontamento de caminho está resolvido.

Ponto pendente: o arquivo sicmu_jconnector.properties ainda não existe fisicamente nesse caminho. Como esse arquivo contém os parâmetros de configuração de negócio do conector (conexão com CICS/mainframe), solicitamos ao time de desenvolvimento que nos envie o conteúdo esperado desse arquivo para que possamos criá-lo no ambiente, ou nos informe se há um processo específico para geração desse arquivo.
