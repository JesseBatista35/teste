Boa tarde, pessoal! Segue a atualização do ADDR SIGSJ de hoje.

✅ Log4j das aplicações – DES
Com os XMLs enviados pela Gisele, configuramos o log4j nos três sistemas em DES. As aplicações foram reimplantadas e estão gravando normalmente:
• SIGSJ-intranet: /log_jboss/sigsj_intranet/sigsj_intranet.log ("SIGSJ INTRANET SUBIU COM SUCESSO!")
• SIGSJ-internet: /log_jboss/sigsj_internet/sigsj_internet.log ("SIGSJ INTERNET SUBIU COM SUCESSO!")
• SIGSJ-boleto: /log_jboss/sigsj_internet/caddeapllx2557.log (mantendo o padrão do legado)

🔎 Sobre o custom.sh
Analisamos a esteira (esteira-jboss-vm-v2) e verificamos que ela executa o custom.sh apenas se ele já existir na VM; não há cópia desse arquivo a partir do repositório de config. Por isso, nesta etapa, a configuração do log4j foi aplicada diretamente nas VMs (ela permanece entre as releases, sendo perdida apenas se a VM for recriada). Estamos alinhando com o time da esteira a forma definitiva de entrega. Na sequência aplicamos também em TQS.

🌐 URLs customizadas – VIPs de DES
Os três VIPs já foram criados pela Rede, apontando para as VMs na porta 80:
• sigsj-intranet.des.caixa → VIP 10.116.180.8 (WO0000082200842)
• sigsj-internet.des.caixa → VIP 10.116.181.214 (WO0000082201229)
• sigsj-boleto.des.caixa → VIP 10.116.181.215 (WO0000082200691)

Porém, os VIPs estão sem certificado: a instalação ainda não foi realizada, e os VIPs do internet e do boleto ficam DOWN até essa etapa.

📌 O que precisa ser feito agora pelo time
1. Cobrar nas WOs acima a importação dos certificados no balanceador (CADDEAPRLB003-1) pela CEPRO/Segurança e a vinculação aos VIPs pela Rede.
2. No VIP do intranet (10.116.180.8), solicitar a correção do comentário, que ficou como "siccp-intra.esteiras.hmp.caixa" (o correto é sigsj-intranet.des.caixa).
3. Após os certificados instalados, abrir as REQs de DNS para as três URLs apontarem para os respectivos VIPs.

➡️ Próximos passos da esteira
• Com o DNS pronto, ajustamos as variáveis de URL nas releases e validamos o acesso pelas novas URLs.
• Aplicar a configuração do log4j em TQS.
• Seguir com o mesmo fluxo de URLs (certificado, VIP e DNS) para TQS.

Qualquer dúvida, fico à disposição!



Oi Rafael, tudo bem?

Estou com o SIGSJ (intranet, internet e boleto) na esteira-jboss-vm-v2 e fiquei com uma dúvida sobre o custom.sh.

As aplicações precisam de um XML de log4j externo em /log_jboss/config-log4j/ (igual ao legado). A ideia era entregar isso via custom.sh no repositório de config, mas olhando a esteira vi que:
• o stack_custom.yml só executa o {{ jboss_home }}/standalone/configuration/custom.sh se ele já existir na VM;
• na task "Deploy Config no JBOSS" são copiados do repo de config o standalone-full-ha.xml, o standalone.conf, o jboss-custom.cli, o jboss-deployments e o jboss-modules-custom, mas não encontrei cópia do custom.sh.

Coloquei o custom.sh na pasta jboss/ do repo de config e, na release, a task "Verifica se o arquivo .../custom.sh existe" passa, mas a execução é pulada porque o arquivo não chega na VM.

Dúvidas:
1. Existe uma forma suportada de entregar o custom.sh pelo repo de config para VMs com JBoss? Se sim, em qual pasta ele deve ficar?
2. Se hoje ele for só manual na VM, faz sentido a esteira copiar o jboss/custom.sh do repo de config (como faz com o standalone.conf), com permissão de execução, antes de executar?

Por enquanto apliquei a configuração manualmente nas VMs de DES para destravar. Valeu!
