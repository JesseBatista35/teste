Pessoal, achamos a causa raiz. Não é problema de SSL/handshake - o log real da aplicação mostra:

java.io.IOException: keystore password was incorrect
ConsignadoIntegracaoDataprevResource - erro ao carregar repositorio de certificado

A senha configurada na property api.dataprev.consignado.keystore.if104.password (sifug_sifgd.properties) está incorreta para o novo certificado eco.dataprev.des.caixa.gov.br.p12. Isso explica tudo que vimos até agora: por isso não aparecia log de SSL (o KeyStore.load() falha antes de chegar no handshake) e por isso o NullPointerException aparecia depois, na sequência do código.

Carlos Augusto, precisamos da senha correta desse .p12 (a mesma usada na sessão do CESET) para atualizar a property. Podemos agendar uma nova sessão na sala de inserção de senhas para que alguém edite diretamente o arquivo sifug_sifgd.properties no servidor, assim ninguém precisa revelar a senha em texto - só digitar direto no lugar certo.
