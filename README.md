Prezados,

Analisando os logs do pod sid01-lancamentos-financeiros-okd4-tqs-45-wj5fm (ambiente TQS, correspondente ao erro reportado), identificamos os seguintes pontos que podem ajudar na investigação:

1. Início do problema: O pod subiu às 04/09 11:54:49 sem erros. A primeira ocorrência de Resource https://cicsweb.tqs.caixa:2587/sid01/lancamentoV4 not found só aparece às 04/09 13:54:55, quase 2h depois. Isso sugere que algo mudou do lado do CICS/roteamento nessa janela, e não um problema presente desde a subida da aplicação.

2. Padrão intermitente: O erro não é constante — ocorre de forma intercalada com execuções aparentemente normais, atingindo tanto o método creditar (CreditoResource) quanto debitar/DebitoResource. Continua ocorrendo até o momento mais recente do log (09/09).

3. Hipótese: Como a equipe de Mainframe já confirmou que a transação/programa está executando normalmente no CICS (mais de 2.000 execuções no dia), e o erro é intermitente (não 100% das chamadas falham), a causa provavelmente não é ausência total de configuração, mas sim uma inconsistência entre regiões/instâncias CICS que atendem essa transação — por exemplo, nem todas as regiões tendo o mesmo URIMAP ativo para o path /sid01/lancamentoV4 na porta 2587. Dependendo de qual região atende a requisição (balanceamento), a chamada teria sucesso ou retornaria 404.

Solicitamos à equipe de Multiplataformas/Mainframe:

Confirmar se todas as regiões CICS que atendem essa transação em TQS possuem o mesmo URIMAP ativo para /sid01/lancamentoV4:2587;
Verificar se houve alguma alteração de definição de URIMAP/PROGRAM por volta de 04/09, entre 11:54 e 13:54, que possa ter sido aplicada parcialmente ao ambiente.
