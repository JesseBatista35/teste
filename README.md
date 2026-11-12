2. O que está hoje em DES (OKD)

O namespace provável é o siepr-des, porque o repositório é SIEPR-curso-bec3-frontend.

oc get deploy -n siepr-des | grep -i bec3
oc get deploy <nome> -n siepr-des -o jsonpath='{..image}{"\n"}'
oc set env deploy/<nome> -n siepr-des --list | grep -E "SSO_BASE_PATH|REALM|SSO_CLIENT_ID|API_DADOS_FAMILIA_PATH"
oc exec deploy/<nome> -n siepr-des -- find / -name "sso-config.json" 2>/dev/null

Compare a tag com a da build 874372 (ou anterior). Isso responde “qual build, imagem e namespace estão em DES”.

3. Library SIEPR-CURSO-BEC3-FRONTEND-DES

Confira se existem:

_ENV.SSO_BASE_PATH
_ENV.REALM
_ENV.SSO_CLIENT_ID
_ENV.API_DADOS_FAMILIA_PATH. Este último o documento do dev não lista. Se faltar, o marcador continua sem substituição mesmo na versão nova.

Um ponto para conferir no SSO_BASE_PATH: o documento cita https://logindes.caixa.gov.br/auth. Em outras releases o padrão do DES internet é https://login.des.caixa.gov.br. Vale comparar com o SIEPR, que já funciona com o cli-web-epr, antes de publicar.

4. Release

Eles pediram para alinhar antes de qualquer publicação. Avise o dev e o Rafael da tag nova e combine o horário. Depois, crie a release com o artifact da build nova e faça o deploy no EC DES.

5. Validar depois do deploy

curl -sk https://siepr-curso-bec3-frontend-des.apps.nprd.caixa/assets/config/sso-config.json

Tem que voltar JSON com ssoUrl, ambiente e clientId. Na tela, não pode mais aparecer “Acesso local de demonstração”, e o acesso deve redirecionar para o Login CAIXA. O login completo com o perfil PARTICIPANTE fica com eles, com usuário autorizado.

Se quiser responder ao dev já, dá para dizer que você identificou que a última build é anterior ao merge e vai gerar a build nova e alinhar a publicação. Mas me manda primeiro o resultado do passo 2 e a tela da Library: se o DES já estiver com uma imagem nova, o problema muda de figura.
