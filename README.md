

Após análise dos logs do deployment do frontend, identificamos que a falha não está na etapa de verificação da esteira em si. A esteira expira porque o pod do frontend não fica saudável e entra em CrashLoopBackOff.

O container principal sitop-frontend-des falha ao iniciar com o erro:

sed: não foi possível ler /opt/app-root/src/main*.js: Arquivo ou diretório inexistente

Durante a inspeção da imagem via oc debug, foi identificado que o arquivo JavaScript gerado pelo build está localizado em:

/opt/app-root/src/dist/browser/main-UHIWBFY6.js

Porém o script de inicialização da imagem está tentando aplicar sed no caminho:

/opt/app-root/src/main*.js

Dessa forma, há divergência entre o caminho esperado pelo script de startup e o caminho real gerado pelo build do frontend.

Como o DeploymentConfig não possui command/args sobrescrevendo a inicialização, e o ConfigMap montado trata apenas de configuração do NGINX, a correção deve ser realizada no repositório/imagem do frontend, Dockerfile, entrypoint, script de startup ou template base utilizado pela aplicação Angular.

Solicito retorno para o time de desenvolvimento/containerização para ajustar o caminho do sed para /opt/app-root/src/dist/browser/main*.js ou adequar o build para gerar os arquivos no caminho esperado.
