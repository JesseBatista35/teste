Foi realizado novo teste de deploy no ambiente DES, sem aplicação de nenhum ajuste de código (nem a correção do .s2i/bin/assemble/run proposta na PR #162, nem o merge das PRs #138/#139/#142 que corrigem o gate de QA). O problema persiste, com erro de timeout na inicialização do pod — consistente com a causa raiz já identificada: o container aborta antes de subir o Nginx (set -e interrompendo o .s2i/bin/run na falha do sed), o que pode se manifestar como timeout de readiness/liveness em vez do erro explícito de sed nos logs de deploy.

Reforçando para quem for dar continuidade: um novo deploy, isoladamente, não resolve o problema, pois a imagem continua sendo gerada com o mesmo .s2i/bin/assemble/run desalinhados (ver Problema 1 da nota). É necessário:

Mesclar a correção de código (PR #162, ou equivalente) no .s2i/bin/assemble/run;
Garantir que o gate de QA não bloqueie esse merge (acompanhar #138/#139/#142);
Só então gerar uma nova imagem e testar o deploy.
