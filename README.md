Aqui está um texto para fechamento do chamado:

Resolução:

O problema relatado na abertura deste chamado — falha na geração de release do pipeline SISPI-med-orquestrador na etapa "Atualizando Variáveis de Ambiente", com o erro error: the server doesn't have a resource type "dev" — foi identificado e corrigido.

Causa raiz: a variável _ENV.KAFKA_USER, cadastrada no grupo de variáveis SISPI-MED-ORQUESTRADOR-DES, continha um espaço em branco antes do valor (" dev" em vez de "dev"). Esse espaço extra corrompia a montagem do comando oc set env executado pela task de atualização de variáveis de ambiente, fazendo com que o valor dev fosse interpretado incorretamente como um argumento posicional (tipo de recurso) em vez de parte do par CHAVE=VALOR, resultando na falha do release.

Ação realizada: o espaço em branco foi removido do valor da variável _ENV.KAFKA_USER no grupo de variáveis. Após a correção, o release foi executado novamente e a etapa "Atualizando Variáveis de Ambiente" foi concluída com sucesso.

Observação: durante a validação pós-correção, foi identificado um novo problema, de causa distinta, relacionado à inicialização da aplicação no pod: o consumer Kafka do canal relato-infracao está configurado para carregar o certificado SSL a partir de um caminho relativo de desenvolvimento (src/main/resources/es-cert.p12), inexistente dentro do container em execução, causando falha (NoSuchFileException) na subida da aplicação. Esse problema é de responsabilidade do time de desenvolvimento (configuração da aplicação) e não está relacionado ao escopo original deste chamado (esteira/pipeline DevOps). Um novo chamado deverá ser aberto para tratamento desse problema.
