# A versão farm (no war) referencia br/gov/caixa/log; a EAP (backup) não deveria
unzip -p /tmp/earchk/sigsj_intranet.war WEB-INF/lib/sirotcon-ejb-2.3.0.1-farm.jar > /tmp/earchk/farm.jar
unzip -p /tmp/earchk/farm.jar br/gov/caixa/sirot/ejb/SIROTConImpl.class | strings | grep -c "br/gov/caixa/log"
unzip -p /tmp/bkp_sirotcon/sirotcon-ejb.jar br/gov/caixa/sirot/ejb/SIROTConImpl.class | strings | grep -c "br/gov/caixa/log"

# A versão EAP já traz o conteúdo do sirotcon-ejb-lib embutido?
unzip -l /tmp/bkp_sirotcon/sirotcon-ejb.jar | grep -ciE "\.class$"
unzip -l /tmp/bkp_sirotcon/sirotcon-ejb.jar | grep -iE "lib|\.jar$" | head
