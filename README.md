A release falhava na task “Verificando Status do Deployment” por timeout. O pod novo encerrava na inicialização com exit code 1 e o erro Failed to load config value of type class java.lang.String for: ministerio.farmacia.api-key.

Causa:
As variáveis da integração com o Ministério (Farmácia Popular) foram cadastradas no grupo de variáveis SIFAP-CENTRALIZADORA-BACKEND-INTRANET-DES sem o prefixo usado pela esteira (_ENV. / _SECRET.). Por isso não eram injetadas no container, e a aplicação não encontrava a propriedade obrigatória.

Correção aplicada:

Criada a variável secreta SECRET_MINISTERIO_FARMACIA_API_KEY e o vínculo _SECRET.MINISTERIO_FARMACIA_API_KEY = #{SECRET_MINISTERIO_FARMACIA_API_KEY}#.
Removida a variável antiga sem prefixo, que estava em texto aberto.
Ajustado o prefixo _ENV. nas demais variáveis da integração: API_MANAGER_SIFAP_MINISTERIO_URL, MINISTERIO_FARMACIA_API_KEY_HEADER, MINISTERIO_FARMACIA_AWAIT_TIMEOUT_SEGUNDOS, MINISTERIO_FARMACIA_CONNECT_TIMEOUT_MS, MINISTERIO_FARMACIA_READ_TIMEOUT_MS e MINISTERIO_FARMACIA_USE_TOKEN_SERVICE_FALLBACK.

Resultado:
Nova release executada com sucesso. A aplicação subiu normalmente (Quarkus 3.15.7, porta 8080), conectou ao banco FAPDB001 e responde ao health check com HTTP 200.

Recomendações à equipe de desenvolvimento:

Cadastrar as variáveis MINISTERIO_* também no grupo TQS, seguindo o mesmo padrão de prefixos, antes de promover a versão. Hoje elas não existem lá.
Avaliar a troca da API key, já que ela ficou exposta em texto aberto na Library.
Retornar _ENV.QUARKUS_LOG_LEVEL de DEBUG para INFO.
Revisar a propriedade quarkus.rest-client.ministerio-farmacia-api.disable-default-mapper, que está sendo ignorada (chave não reconhecida).
