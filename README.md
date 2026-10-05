Prezados,

Em atendimento à WO0000081761102, segue a análise da indisponibilidade da aplicação SIREP Frontend Intranet Novo no ambiente DES2 (namespace sirep-des).

1. Causa da indisponibilidade ("Application is not available")

O DeploymentConfig sirep-frontend-intranet-novo-des2-des estava configurado com 0 réplicas. Por isso o rollout foi concluído com sucesso, mas nenhum pod era criado. A esteira não localizava pods na etapa de logs e a rota não tinha endpoints ativos para atender as requisições.

A aplicação foi escalada para 1 réplica. O pod subiu normalmente, com o Nginx em execução e as probes de readiness/liveness respondendo 200.

2. Loop de redirecionamento ("414 Request-URI Too Large")

Com o pod em execução, a aplicação entrava em loop de redirecionamento até retornar 414. Na análise, identificamos que:

As variáveis SSO_AUTH_URL, SSO_REALM, SSO_CLIENT_ID e SSO_REDIRECT_URL estão corretamente definidas no pod.
O script de inicialização da imagem substitui os placeholders apenas no arquivo main-*.js.
Com a atualização para Angular 19, a configuração de SSO passou a ser gerada em um chunk separado (chunk-SUPBJXFF.js). Esse arquivo permanecia com os placeholders __SSO_AUTH_URL__, __SSO_REALM__, __SSO_CLIENT_ID__ e __SSO_REDIRECT_URL__ sem substituição.

Para validar a causa, a substituição foi feita manualmente no pod, em caráter apenas temporário. Após isso, a aplicação passou a redirecionar corretamente para o SSO (login.des.caixa). Esse ajuste manual será perdido no próximo restart ou deploy.

3. Erro no SSO ("Parâmetro inválido: redirect_uri")

Ao chegar ao login, o SSO recusa o retorno com a mensagem "Parâmetro inválido: redirect_uri". Isso indica que a URL do ambiente DES2 não está cadastrada nas Valid Redirect URIs do client cli-web-rep (realm intranet).

Ações necessárias (equipe de desenvolvimento/responsável pelo sistema):

Ajustar o script de entrypoint/Dockerfile da imagem para aplicar a substituição dos placeholders em todos os arquivos .js de /opt/app-root/src, e não apenas no main-*.js. Depois, gerar nova build.
Solicitar à equipe de SSO a inclusão de https://sirep-frontend-intranet-novo-des2-des.apps.nprd.caixa/* nas Valid Redirect URIs do client cli-web-rep (realm intranet).
Verificar na release do DES2 a configuração de réplicas, para que o DeploymentConfig não seja aplicado novamente com 0 réplicas.
Após os itens acima, executar nova release no DES2.

Os ajustes apontados são de código da aplicação e de cadastro no SSO, fora do escopo de atuação da esteira. Encerramos este atendimento e permanecemos à disposição para apoiar na nova execução da release.

Atenciosamente,

Jessé Mouta Pereira Batista
Analista
CTIS / CESTI Esteira DEVOPS DES TQS NPRD
