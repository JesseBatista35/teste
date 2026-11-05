1. Confirmar se o token está sendo enviado. No console do 7.4, expanda o headers: {...} de uma linha get .../perfil-acesso-usuario. Ou, na aba Rede, abra a chamada e veja os cabeçalhos da requisição. Deve haver Authorization: Bearer eyJ....

Se não houver: o Angular do PJ não pegou o token do SIFEC.
Se houver: o token chega, mas o Keycloak do PJ não o aceita. Vá para o passo 2.

2. Ligar o DEBUG do Keycloak para ver por que o token é recusado (no jboss-cli do 471, servidor running):

/profile=full-ha-sifec-intranet/subsystem=logging/logger=org.keycloak:add(level=DEBUG)

Se o handler FILE estiver em INFO, ajuste como falamos antes. Peça para abrirem o PJ de novo e veja no 473:

bash
sudo tail -f /opt/jboss/jboss-eap/hc/servers/sifec-intranet_node1_lx473/log/server.log | grep -iE --line-buffered "keycloak|bearer|token|signature|expired|audience|issuer|realm|workflow-credito"

Mensagens como Failed to verify token, Invalid token issuer, Signature validation failed, Token is not active, No bearer token ou falha ao buscar a chave pública do login.des.caixa mostram a causa exata.

Depois do teste, remova o DEBUG:

/profile=full-ha-sifec-intranet/subsystem=logging/logger=org.keycloak:remove

Frase para a sala:

“No 6.4, o perfil-acesso-usuario devolve as roles do token (FEC0126, FEC0155...). No 7.4 devolve null, então as chamadas da API do PJ não estão sendo autenticadas pelo Keycloak. Pablo, nos headers do perfil-acesso-usuario vai o Authorization: Bearer? Enquanto isso, vou ligar o DEBUG do Keycloak no servidor para ver se o token está sendo recusado.”
