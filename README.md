Prezados,

Informamos que a publicação dos pacotes do SICTD (versão 3.13.49.133.51) no ambiente EAP 6.4 de DESENVOLVIMENTO foi concluída no servidor LX0004 (10.116.88.23).

Atividades realizadas:
- Parada das instâncias SICTD-SERVER e SICTD-DIGITALIZAR-INTRANET
- Backup dos pacotes .ear anteriormente instalados
- Parada do Host Controller do JBoss EAP
- Limpeza dos arquivos de cache (tmp/vfs e tmp/work) das duas instâncias
- Publicação dos novos pacotes:
  sictd-server-intranet_3.13.49.133.51.ear
  sictd-digitalizar-intranet_3.13.49.133.51.ear
- Reinicialização das instâncias apos o deploy

Ambas as instâncias foram validadas em execucao (processos ativos) apos a reinicializacao. As demais instancias do servidor (sictd-internet, apdctd-sictd-intranet, jklnctd-sictd-digitalizar-intranet) nao foram impactadas.

Solicitamos a validacao funcional da aplicacao pelo time solicitante.

Atenciosamente,
Jesse Batista
