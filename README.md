Informamos que Foi identificada vulnerabilidade de segurança do tipo Clickjacking no sistema SIMIL, especificamente no endpoint:
 
https://www.simil.caixa.gov.br/simil/login.xhtml
 
Segundo avaliação da arquitetura, a correção não demanda alteração de código da aplicação, devendo ser implementada no proxy reverso Nginx responsável pela publicação do sistema.
 
Solicitamos avaliação da equipe responsável pelo ambiente DES quanto à inclusão dos seguintes cabeçalhos de segurança no proxy reverso:
 
add_header Strict-Transport-Security "max-age=31536000; includeSubDomains; preload" always;
add_header Content-Security-Policy "default-src 'self';";
add_header X-Frame-Options SAMEORIGIN always;
add_header X-Content-Type-Options nosniff always;
add_header Referrer-Policy "strict-origin-when-cross-origin" always;
add_header Permissions-Policy "geolocation=(), midi=(), sync-xhr=(), microphone=(), camera=(), magnetometer=(), gyroscope=(), fullscreen=(self), payment=()";
