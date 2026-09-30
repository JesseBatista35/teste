O deploy do SIAVL-atddigital-backend em TQS (release 534515) falhava por timeout na task "Verificando Status do Deployment". Nos logs do pod, a aplicação Spring Boot não inicializava por falta da propriedade SSO_INTER_SIPER_URL ("Could not resolve placeholder 'SSO_INTER_SIPER_URL'" ao criar o bean issuerProperties). O pod não ficava disponível e o rollout excedia o TIMEOUT_DEPLOY.

Causa:
A variável _ENV.SSO_INTER_SIPER_URL existia no grupo SIAVL-ATDDIGITAL-BACKEND-DES, mas não havia sido criada no grupo SIAVL-ATDDIGITAL-BACKEND-TQS.

Solução:
Incluída a variável _ENV.SSO_INTER_SIPER_URL no grupo SIAVL-ATDDIGITAL-BACKEND-TQS, com o mesmo valor utilizado em DES. Isso é consistente com as demais configurações de SSO do grupo TQS, que já apontam para o ambiente DES. Após a inclusão, o release foi reexecutado e o deploy concluído com sucesso.

Recomendações ao time da aplicação:

Confirmar se existe realm/URL específica de TQS para SSO_INTER_SIPER_URL. Se houver, solicitar o ajuste do valor.
Ao incluir novas variáveis no código, replicá-las em todos os grupos de ambiente (DES/TQS/HMP/PRD) para evitar falhas nos próximos deploys.
A variável SIAVL_SIECM_SSO_CLIENT_SECRET está em texto aberto no grupo de TQS. Recomenda-se marcá-la como secret (ou migrá-la para o cofre BeyondTrust, como em DES) e avaliar a rotação da credencial.
