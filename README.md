<img width="1890" height="895" alt="image" src="https://github.com/user-attachments/assets/58fadbcf-2106-4f59-938e-f8e233e809de" />


estava sem o secure filie coloquei a mesma que nstava em des agora due esse erro:

2026-07-08T17:48:40.7829139Z ##[section]Starting: Alterando Valores placeholders nos arquivos de config
2026-07-08T17:48:40.7833735Z ==============================================================================
2026-07-08T17:48:40.7833833Z Task         : Replace Tokens
2026-07-08T17:48:40.7833899Z Description  : Replace tokens in files
2026-07-08T17:48:40.7833961Z Version      : 3.3.1
2026-07-08T17:48:40.7834011Z Author       : Guillaume Rouchon
2026-07-08T17:48:40.7834086Z Help         : v3.3.1 - [More Information](https://github.com/qetza/vsts-replacetokens-task#readme)
2026-07-08T17:48:40.7834178Z ==============================================================================
2026-07-08T17:48:41.6735959Z replacing tokens in: /opt/ads-agent/_work/r16835/a/_SIPBS-revendedor-batch-config/scripts/base.sh
2026-07-08T17:48:41.6854737Z replacing tokens in: /opt/ads-agent/_work/r16835/a/_SIPBS-revendedor-batch-config/scripts/sipbs-revendedor-atualiza-agrupamento-vale.sh
2026-07-08T17:48:41.6855734Z replacing tokens in: /opt/ads-agent/_work/r16835/a/_SIPBS-revendedor-batch-config/scripts/sipbs-revendedor-avaliar-pos-carencia.sh
2026-07-08T17:48:41.6857730Z replacing tokens in: /opt/ads-agent/_work/r16835/a/_SIPBS-revendedor-batch-config/scripts/sipbs-revendedor-batimento-pendencias-fiserv.sh
2026-07-08T17:48:41.6966362Z ##[error]  variable not found: PRODUTOS
2026-07-08T17:48:41.6968613Z replacing tokens in: /opt/ads-agent/_work/r16835/a/_SIPBS-revendedor-batch-config/scripts/sipbs-revendedor-carga-arquivo.sh
2026-07-08T17:48:41.6970585Z ##[error]  variable not found: REDIS_PROXY_DURATION_DAYS
2026-07-08T17:48:41.6973243Z replacing tokens in: /opt/ads-agent/_work/r16835/a/_SIPBS-revendedor-batch-config/scripts/sipbs-revendedor-efetivacao-cancelamento.sh
2026-07-08T17:48:41.6975407Z replacing tokens in: /opt/ads-agent/_work/r16835/a/_SIPBS-revendedor-batch-config/scripts/sipbs-revendedor-resolve-pendencias-fiserv.sh
2026-07-08T17:48:41.6978866Z replacing tokens in: /opt/ads-agent/_work/r16835/a/_SIPBS-revendedor-batch-config/scripts/sipbs-revendedor-verifica-abertura-contas-pj.sh
2026-07-08T17:48:41.6981228Z replacing tokens in: /opt/ads-agent/_work/r16835/a/_SIPBS-revendedor-batch-config/scripts_ctm/configuration/custom.sh
2026-07-08T17:48:41.6983147Z replacing tokens in: /opt/ads-agent/_work/r16835/a/_SIPBS-revendedor-batch-config/scripts_ctm/sample.sh
2026-07-08T17:48:41.7171601Z ##[section]Finishing: Alterando Valores placeholders nos arquivos de config
