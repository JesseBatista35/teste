ssh p585600@10.116.97.59
/opt/jboss/jboss-eap/bin/jboss-cli.sh --connect --controller=localhost:9990 --command="deployment-info --server-group=sifec-intranet" | grep -E "^(SIFEC |SIFEC-CCR |SICCR-PJ|SIAPX|SIFEC-EMP|SIEMP|SIFEC-RURAL|SIFES|SIARC|SIFEC-CONSTRUCARD|SIEMP-EMPRESAS|SIFEC-BNDES|SICDT)"

/opt/jboss/jboss-eap/bin/jboss-cli.sh --connect --controller=localhost:9990 --command="deployment-info --server-group=siemp" | grep enabled

deployment-info --server-group=sifec-intranet
