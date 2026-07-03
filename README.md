Boa lembrança — vamos incluir esse terceiro teste (SISME-369, 2.90.8.0) como evidência extra na resposta, reforçando ainda mais antes da call:

Boa tarde,
Certo, sem problema. Podemos agendar a chamada de vídeo para acompanhar o deploy junto com o desenvolvedor.
Complementando a análise anterior, realizamos um terceiro teste controlado, desta vez com a release SISME-369 (branch branch-from-2.90.8.0), disparada pelo próprio desenvolvedor. O artefato deployado às 03/07, 14:03 apresentou exatamente os módulos sisme-web-2.90.8.0.war, sisme-api-2.90.8.0.jar e sisme-ejb-2.90.8.0.jar, correspondendo perfeitamente à versão da branch de origem.
Com este resultado, já são três testes consecutivos, com três branches e versões distintas (2.93.3.0, 2.93.2.0 e 2.90.8.0), todos confirmando que a esteira entrega e o JBoss processa corretamente cada deploy, sem qualquer inconsistência de ambiente, rede ou infraestrutura.
Da nossa parte, na chamada iremos acompanhar em tempo real: horário exato do redeploy na release, timestamp de atualização do artefato no servidor JBoss, e o conteúdo do pacote (.ear) deployado, comparando com a versão exibida na tela após o deploy.
Fico à disposição para alinhar data e horário.
