📘 MANUAL – Criação e Instalação de Certificado de Rede 
Este manual descreve o processo completo para criação, transferência e extração de certificados .p12 em uma máquina Linux para uso interno.\ O fluxo abaixo é o padrão utilizado quando o Caixa da Sala de Certificados envia o arquivo e acompanha a senha.
✅ 1. Acesso ao Canal de Senhas
Acesse o canal interno de senhas.
Informe:
WO (Work Order)
URL do ambiente onde o certificado será instalado.
Após isso, aguarde o Caixa da Sala de Certificados enviar os arquivos necessários.
✅ 2. Logar na máquina fornecida pela WO
Acesse a máquina indicada pela equipe da WO utilizando MobaXterm, Putty ou terminal SSH.
Rode o comando para visualizar o IP da máquina:
ip a
Confirme a interface que está UP e contendo um IP válido.\ Exemplo registrado:
 
Plain Text
Plain Text
ens192: <BROADCAST,MULTICAST,UP,LOWER_UP> mtu 1500 ...
inet 10.116.196.180/19 brd 10.116.223.255 scope global ...
 
Neste caso, o IP é:
 
Plain Text
Plain Text
10.116.196.180
 
✅ 3. Transferir os arquivos para a máquina-alvo (via Bastian)
Acesse uma máquina Bastian, autenticando-se com sua própria matrícula.
Realize o upload do arquivo .p12 para a Bastian via MobaXterm.
Após o arquivo estar na Bastian, envie-o para a máquina final usando scp:
Exemplo:
scp sisme-internet.esteiras.des.caixa_ACInternaIcptestes.p12 p981778@10.116.196.180:/tmp/
O terminal pedirá a senha da máquina destino:
 
Plain Text
Plain Text
p981778@10.116.196.180's password:
 
✅ 4. Acessar a máquina final (10.116.196.180)
Logue novamente na máquina destino.
Eleve privilégio para sudo:
sudo su -
Vá até a pasta onde o arquivo foi enviado:
cd /tmp
✅ 5. Extrair o certificado – Parte 1 (gerar .key)
O Caixa da Sala de Certificados deve estar presente, pois será solicitado a senha do arquivo.
Execute:
openssl pkcs12 -in <arquivo>.p12 -out <arquivo>.key -nodes -nocerts
📌 IMPORTANTE:\ Sempre substitua <arquivo> pelo nome do sistema correspondente.\ Exemplo baseado no seu cenário:
 
openssl pkcs12 -in sisme-internet.esteiras.des.caixaACInternaIcptestes.p12 \
-out sisme-internet.esteiras.des.caixaACInternaIcptestes.key -nodes -nocerts
``
 
O Caixa digitará a senha quando solicitado.
✅ 6. Extrair o certificado – Parte 2 (gerar .cer / .crt)
Execute o segundo comando para gerar o certificado público:
openssl pkcs12 -in <arquivo>.p12 -out <arquivo>.cer -nokeys
Ou, se preferir extensão .crt, pode usar:
openssl pkcs12 -in <arquivo>.p12 -out <arquivo>.crt -nokeys
Exemplo:
 
openssl pkcs12 -in sisme-internet.esteiras.des.caixaACInternaIcptestes.p12 \
-out sisme-internet.esteiras.des.caixaACInternaIcptestes.cer -nokeys
 
☑️ Após os comandos
Quando ambos arquivos forem gerados (.key + .cer/.crt), o Caixa confirma a senha final e você está liberado da sala de certificados.
A partir daqui, a instalação segue conforme o procedimento da sua equipe (NGINX, Apache, Truststore, Keystore etc.).
