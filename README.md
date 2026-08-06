ETAPA 1 — Pedir o certificado (você faz isso primeiro, sozinho)
Abre o link do Teams que o CEPRO passou na WO
Entra no canal certo (o documento do link explica qual)
Manda mensagem informando:
Número da WO: WO0000081277950
URL/CN do certificado: https://api.des.caixa
Que precisa do arquivo .p12

Aí você espera alguém da Sala de Certificados aparecer no canal.

ETAPA 2 — Receber o arquivo
Vai chegar um link de OneDrive no canal
Baixa o .p12 pro seu computador
ETAPA 3 — Levar o arquivo até o servidor
Abre o MobaXterm, conecta na Bastion (com sua matrícula)
Dentro da Bastion, faz upload do .p12 (arrasta o arquivo pra sessão do MobaXterm, ou usa o painel de SFTP dele)
Da Bastion, manda pro servidor final:
bash
scp apim-des-caixa.p12 seu_usuario@10.116.94.221:/tmp/

Vai pedir a senha do seu usuário no servidor 10.116.94.221 — não é a senha do certificado, é a sua senha de acesso mesmo.

ETAPA 4 — Entrar no servidor final
bash
ssh seu_usuario@10.116.94.221
sudo su -
cd /tmp
ETAPA 5 — Extrair o certificado (aqui a pessoa da Sala de Certificados precisa estar junto/online)

Avisa no canal do Teams que você já tá com o arquivo no servidor e pronto pra rodar os comandos. Ela vai te passar a senha do .p12 na hora.

Roda:

bash
openssl pkcs12 -in apim-des-caixa.p12 -out apim-des-caixa.key -nodes -nocerts

→ vai pedir a senha (ela te fala)

Depois:

bash
openssl pkcs12 -in apim-des-caixa.p12 -out apim-des-caixa.cer -nokeys

→ pede a senha de novo, mesma senha.

ETAPA 6 — Confirmar que os arquivos saíram certo
bash
ls -la apim-des-caixa*

Tem que aparecer os 3 arquivos: .p12, .key, .cer

Depois dessa etapa, a Sala de Certificados libera você e é aí que eu te ajudo com a próxima parte (importar no cacerts do JDK e reiniciar só a instância do SINAD, sem derrubar os outros sistemas do mesmo servidor).
