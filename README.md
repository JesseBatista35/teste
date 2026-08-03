Segue a mensagem formal, prontinha pra colar no Teams/OS:

Assunto: SIPNC-transfcontas-microfront – Falha na esteira DES/TQS por arquivo de configuração ausente

Prezados,

Identificamos falha na esteira de release do projeto SIPNC-transfcontas-microfront, na task "Criando o ConfigMap nginx-conf.d", com o erro:

error reading /opt/ads-agent/.../_SIPNC-transfcontas-microfront-config/sipnc-nginx.conf: no such file or directory

Após análise, verificamos que o repositório SIPNC-transfcontas-microfront-config (branch master) não possui o arquivo sipnc-nginx.conf, que é o nome esperado pela esteira. O que existe atualmente é um arquivo chamado sample-nginx.conf, que aparenta ser um template genérico não finalizado, inclusive com valores que parecem pertencer a outro sistema (referências a "sinov-api" e placeholder "HTTP_SERVICE_API" no proxy_pass).

Solicitamos que o time de desenvolvimento:

Renomeie/crie o arquivo com o nome correto: sipnc-nginx.conf, na raiz do repositório SIPNC-transfcontas-microfront-config (branch master);
Ajuste o conteúdo do proxy_pass e demais parâmetros para refletir o backend correto do SIPNC-transfcontas-microfront (validar se a referência a "sinov-api" está correta ou se é resquício de cópia de outro projeto);
Realize o commit na branch master para que a esteira consiga localizar o arquivo no próximo deploy.

