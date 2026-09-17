scp eco.dataprev.des.caixa.gov.br.p12 p585600@10.116.24.145:/tmp/


ssh p585600@10.116.24.145

cp /infra_app/config/sifug/IF104.p12 /infra_app/config/sifug/IF104.p12.bak_$(date +%Y%m%d)

sudo mv /tmp/eco.dataprev.des.caixa.gov.br.p12 /infra_app/config/sifug/IF104.p12
