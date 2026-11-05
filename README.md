Bom dia!

Nesta fase de testes da migração, o deploy no JBoss 7.4 (DES) está sendo manual: não há Jenkins/RTC nem pipeline configurada para esse ambiente ainda.

O fluxo que estamos usando:

Vocês geram o .ear e publicam no Nexus (binario.caixa).
Me mandam o link do Nexus no chat da ADDR.
Eu faço o deploy no server-group sifec-intranet e acompanho o log. Se der erro, retorno com a análise (ambiente ou código).

Foi assim com o SIFEC 2.160.3.0 e com o SICCR-PJ 8.40.1.

Sobre uma esteira automatizada (build + deploy) para o 7.4, vou confirmar internamente qual é o modelo previsto para a fase pós-migração e retorno para vocês.
