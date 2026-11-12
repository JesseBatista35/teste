Prezado(a), conforme solicitado em demanda, o atendimento foi realizado.

Segue o resumo das ações executadas:

Verificação da publicação em DES
Foi confirmado que a build da develop com a PR 169604 (commit 03b7f284) foi gerada com sucesso e publicada em DES pela release SIEPR-curso-bec3-frontend-1.0.0-SNAPSHOT(23), em 12/11/2026 às 09:20. A aplicação está no namespace siepr-des (OKD4 NPRD), DeploymentConfig siepr-curso-bec3-frontend-des.
Validação do SSO
Após a publicação, o arquivo /assets/config/sso-config.json passou a retornar o JSON com as configurações do ambiente (ssoUrl, ambiente e clientId). O acesso ao frontend em DES redireciona para o Login CAIXA (DES) com o client cli-web-epr, sem exibir a tela de acesso local de demonstração. As variáveis SSO_BASE_PATH, REALM e SSO_CLIENT_ID foram confirmadas no ambiente da aplicação.
Diagnóstico dos endereços de API
Foi identificado que os marcadores API_DADOS_FAMILIA_PATH, API_PARAMETRIZACAO_PATH, API_ARQUIVOS_PATH, API_RELATORIOS_PATH, API_MANUTENCAO_PATH, API_GESTAO_PATH, HORARIO_ACESSO_INTERNET_INICIO e HORARIO_ACESSO_INTERNET_FINAL permaneciam sem substituição no bundle publicado. A causa era a ausência dessas variáveis no grupo SIEPR-CURSO-BEC3-FRONTEND-DES da Library. Apenas _ENV.API_BASE_PATH era entregue à aplicação, e com o endereço do próprio frontend. Foi confirmado também que a publicação utiliza a configuração de build “production”, na qual os marcadores são substituídos na inicialização a partir das variáveis _ENV.*.
Ajuste da Library
Com base nos valores do arquivo src/environments/environment.des.ts do projeto, informados pela equipe de desenvolvimento, e após confirmar que as rotas correspondentes existem em DES (namespace sibec-des), foram realizados no grupo SIEPR-CURSO-BEC3-FRONTEND-DES:
inclusão de _ENV.API_PARAMETRIZACAO_PATH, _ENV.API_DADOS_FAMILIA_PATH, _ENV.API_ARQUIVOS_PATH, _ENV.API_RELATORIOS_PATH, _ENV.API_MANUTENCAO_PATH e _ENV.API_GESTAO_PATH;
inclusão de _ENV.HORARIO_ACESSO_INTERNET_INICIO (07:00) e _ENV.HORARIO_ACESSO_INTERNET_FINAL (21:00);
ajuste de _ENV.API_BASE_PATH para https://sibec-micro-des.apps.nprd.caixa/api.

A variável HTTP_SERVICE_API foi mantida sem alteração, pois não possui o prefixo _ENV. e não é referenciada no código do frontend.

Publicação
Após alinhamento com a equipe, foi realizada uma primeira execução de release com a imagem 1.0.0.4. Ela não concluiu por falha temporária do registry de imagens (504 Gateway Time-out ao baixar a imagem), sem impacto ao ambiente, pois a versão anterior permaneceu em execução. Como a tag 1.0.0.4 é destinada a TQS, a publicação em DES foi refeita com a build da develop pela release SIEPR-curso-bec3-frontend-1.0.0-SNAPSHOT(25), concluída com sucesso.
Validação final
As nove variáveis de API e horário estão disponíveis no ambiente da aplicação, com os valores cadastrados.
Todos os arquivos JavaScript publicados foram verificados e nenhum marcador _API permanece sem substituição.
O SSO continua redirecionando corretamente para o Login CAIXA (DES).

Solicitamos que a equipe valide o login completo com usuário autorizado, o perfil de acesso e as consultas às APIs.
