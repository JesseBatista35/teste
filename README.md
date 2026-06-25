@Backend @Segurança

Pessoal, REQ000144658129/WO0000080824869.

Obrigado pela informação. Faz sentido — e-Cobrança é app nativa, sobe direto na loja, não tem servidor backend próprio. Isso significa que toda a camada de autenticação passa pelo servidor de OAuth de vocês em `dessp-pmf.mobilidade.caixa.gov.br`.

Analisando os logs que temos:
- App chega até o servidor de OAuth
- Servidor retorna 302 com código de autorização ✅
- App recebe o redirect, mas falha ao processar ❌

Como toda a lógica está do lado de vocês, a falha provavelmente está em um desses pontos:

1. Servidor rejeitando o código de autorização que foi gerado
2. Algo no header ou corpo do redirect não está correto
3. Alguma validação de segurança bloqueando o processamento

O que poderíamos fazer para avançar:

Qual é o log **exato** que vocês veem no lado do servidor quando a app tenta usar o código de autorização gerado? Ou seja, quando o 302 é retornado e a app tenta processar, o que o servidor registra naquele momento?

Isso ajuda a gente identificar se é rejeição do código, validação de segurança ou outro ponto.

Atenciosamente,
Jessé
