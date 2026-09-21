Pessoal, analisei o pipeline do SIIFX-caixinhas-batch.

A configuração dos 3 reactors já está correta e na ordem pedida: 1) batch-platform, 2) mod-caixinhas, 3) batch-launcher. O Maven não apresenta erro.

O motivo de o log mostrar apenas o batch-platform: cada Java-Build executa o Maven e, logo em seguida, a análise do Sonar e o Quality Gate. No primeiro Java-Build (batch-platform) o Quality Gate reprova (TE102) e o job é interrompido, então o mod-caixinhas e o batch-launcher não chegam a executar.

Para confirmar, fizemos um teste: adiamos a análise do Sonar para depois do último reactor (dois steps Bash no pipeline, "Adiando análise até o último reactor" e "Habilitando análise (reactor final)"). Com isso os 3 reactors executaram normalmente e o Quality Gate foi avaliado ao final, considerando o projeto todo. Ele reprovou por uma única condição: cobertura em código novo de 12,9% (mínimo 80%), sobre 778 linhas.

Pendências do time de desenvolvimento:
- elevar a cobertura de testes em código novo para 80%;
- corrigir os 2 bugs em Movimento.java (linhas 17 e 21): comparação com equals entre tipos não relacionados.

Com o Quality Gate aprovado, o pipeline segue para as demais etapas.
