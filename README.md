Thiago, muito bom, ASRA é bem específico!

ASRA geralmente indica um erro de processamento de dados dentro do programa (divisão por zero, campo numérico inválido, ou incompatibilidade na COMMAREA entre o que enviamos e o que o D01POSOL espera).

Vocês conseguem consultar o dump (Dumpid: 1/0003) para identificar em qual parágrafo/instrução do COBOL ocorreu o erro? Isso ajudaria a apontar se é um problema de formatação/tamanho de algum campo que estamos enviando no payload, ou algo interno ao programa.

Se for útil, também podemos reenviar o payload exato utilizado no teste (JSON da chamada de débito) para conferência com a estrutura esperada pela COMMAREA.
