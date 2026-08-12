Erik, Marcelo, boa tarde.

Conseguimos resolver o problema do jconnector.properties na SICMU-DES. Resumo da causa raiz e correção:

O caminho da variável CONNECTOR estava errado (sobrava um /jboss/ que não existe no servidor). Corrigido para /opt/jboss-eap/standalone/configuration/sicmu_jconnector.properties.
O arquivo não estava chegando ao servidor porque a estrutura de pastas no repositório de config não batia com o esperado pela pipeline. Ajustamos o local do arquivo no repositório (SICMU-intranet-update-config, em jboss/configuration/) e o nome (sicmu_jconnector.properties).
Rodamos novo deploy e confirmamos:
O arquivo chegou corretamente no servidor
O standalone-full-ha.xml está com o path correto
Validamos o server.log: não há mais nenhuma exception relacionada ao jconnector do SICMU

Podem validar a aplicação quando possível para confirmar que a funcionalidade que dependia dessa integração está normalizada. Qualquer coisa, seguimos à disposição.
