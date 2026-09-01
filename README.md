Solicitação atendida.

Identificado que o header Access-Control-Allow-Origin estava retornando com múltiplos valores na resposta (originados tanto do Apache quanto do backend), o que violava a especificação CORS e causava bloqueio da chamada pelo navegador (erro "contains multiple values... but only one is allowed").

Correção aplicada nos 5 arquivos de configuração Apache de intranet DES (siavl.conf, siavl02.conf, siavl03.conf, siavl04.conf, siavl05.conf): incluídas diretivas Header unset e Header always unset para Access-Control-Allow-Origin, Access-Control-Allow-Methods e Access-Control-Allow-Headers, antes das diretivas Header always set, garantindo que apenas um valor de cada header seja retornado na resposta, conforme checklist.

Testado com a chamada real da aplicação (GET .../galeriaImagem/buscaArquivoPorIdMsg) nos 5 sites (agenciadigital, agenciadigital2, agenciadigital3, agenciadigital4, agenciadigital5), confirmando retorno de um único valor de Access-Control-Allow-Origin em todos.

Durante a aplicação, os processos Apache dos sites principal e agenciadigital4 ficaram brevemente indisponíveis (poucos minutos) devido a um processo residual de uma operação anterior; ambos foram identificados e restabelecidos, com configuração validada em seguida.

Backup dos arquivos originais realizado antes de cada alteração.
