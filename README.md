Problema relatado:
Falha no deploy do SIGEC-com-frontend no ambiente DES (release SIGEC-com-frontend-1.0.0-SNAPSHOT(12)). A task "Verificando Status do Deployment" excedia o tempo limite com o rollout parado em 3 de 5 réplicas. Os pods antigos não eram encerrados e os novos não ficavam prontos.

Análise:
Os logs do pod mostraram que o nginx retornava HTTP 403 ("directory index of /opt/app-root/src/ is forbidden") nas requisições do readiness probe. A imagem gerada a partir da tag 1.0.0-SNAPSHOT não continha o arquivo index.html na raiz do diretório servido pelo nginx. Sem o probe responder com sucesso, os novos pods nunca ficavam prontos e o rolling update não avançava. A falha estava no artefato da aplicação, não na esteira.

Solução:
O time responsável disponibilizou nova tag (0.1.1.6). Foi executado novo deploy em DES pela release SIGEC-com-frontend-0.1.1.6(1), concluído com sucesso. O conteúdo da aplicação está disponível na raiz do nginx, o probe retorna HTTP 200 e o rollout foi finalizado normalmente.

Ponto de atenção:
A aplicação sobe sem as variáveis URL_API e URL_SSO, conforme aviso no log do pod. No grupo de variáveis SIGEC-COM-FRONTEND-DES, _ENV.URL_API e _ENV.URL_SSO estão sem valor e HTTP_SERVICE_API aponta para valor provisório (https://google.com). Recomenda-se que o time informe os valores corretos de DES para preenchimento, sob risco de a aplicação não se comunicar com o backend e o SSO.

Status: Deploy concluído com sucesso. WO encerrada.
