rezados,

Em relação a esta demanda, o problema original — ausência de URIMAP para /sid01/lancamentoV4 em TQS — foi resolvido: o URIMAP foi criado em todos os CICS de TQS pela equipe de Mainframe, conforme confirmado pelo Everton.

Entretanto, ao testarmos novamente, identificamos um comportamento distinto do problema original, que caracteriza uma nova ocorrência:

Antes: a requisição chegava ao CICS e retornava rapidamente um fault SOAP estruturado (Resource not found) — evidenciando que a chamada trafegava normalmente até a camada de roteamento do CICS.
Agora: a requisição não chega mais aos logs do CICS (AOR e TOR WEB, conforme confirmado pelo Everton), e o pod da aplicação trava e é finalizado (Killed /deployments/run-java.sh), retornando 502/503 ao cliente.

Essa mudança de padrão indica uma causa diferente — não mais de definição/mapeamento no CICS, e sim de conectividade/rede entre o ambiente OKD4 (TQS) e o CICS Web na porta 2587, possivelmente bloqueio de proxy, conforme já observado pelo Pedro Barrella.

Como se trata de uma nova causa raiz, fora do escopo da investigação original desta demanda, solicitamos o encerramento desta WO e a abertura de uma nova demanda
