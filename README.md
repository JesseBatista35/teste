Gisele, faz total sentido o que você e o arquiteto falaram — e bate com o que eu vi nos bytes da resposta do SIROT.

Os nomes do menu chegam do SIROT já com o acento torto (o "ç" vem como byte 0xC8, o "í" como 0xD5), com o resto do texto em ASCII normal. Ou seja, o dado já vem assim da origem — não é a aplicação nem o JBoss que embaralha, a tela só mostra o que recebeu. Por isso aparece igual no legado: os dois leem a mesma fonte.

Então confirmo contigo: o problema está na origem do dado (banco/mainframe), é pré-existente (não é regressão da migração) e a correção certa é no encoding da fonte, como o arquiteto apontou — assim corrige pra todo mundo que consome o dado, não só pra essa tela.

Pela parte do JBoss/esteira a frente de encoding está ok: o parser foi resolvido (a GJ4D parou de quebrar) e a tela ficou idêntica ao legado. O acento a gente registra como item separado, a tratar na origem com o time de banco/arquitetura.
