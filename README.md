Realizada a remoção da System Property siset.properties.vault.keypass.rsa do arquivo standalone.xml no servidor srjdeapllx075 (10.116.89.237), instância JBoss siset_srjdeapllx075_inter_8080, conforme solicitado.

Ações executadas:

Backup do arquivo original gerado antes da alteração (standalone.xml.bak_20260903_163607).
Property removida (linha 56) via edição direta do arquivo de configuração.
Validado, via grep, que a property não consta mais no arquivo.
Realizado restart do serviço JBoss (kill do processo anterior + novo start via standalone.sh).
Confirmado que o processo subiu normalmente (novo PID ativo) e sem erros no server.log.

Serviço restabelecido e operante. Solicitação concluída.
