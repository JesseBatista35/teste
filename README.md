1. No 6.4, mostre o arquivo e copie as 21 linhas:

cat /tmp/props_pj.cli

2. No 471 (7.4), dentro do jboss-cli ([domain@localhost:9999 /]), cole as 21 linhas. Cada uma deve voltar "outcome" => "success".

3. Confira (ainda no CLI do 471):

/server-group=sifec-intranet/system-property=SICCR_PJ_IS_SICLI_REST_MOCK:read-attribute(name=value)

O resultado deve ser "true".

4. Apague o arquivo no 6.4:

rm -f /tmp/props_pj.cli

5. Reinicie (CLI do 471):

/server-group=sifec-intranet:restart-servers(blocking=true)
/host=hc_cbrdeapllx473/server=sifec-intranet_node1_lx473:read-attribute(name=server-state)

6. Com o estado running, peça o teste do PJ: logout, login e consultar o CNPJ. A mensagem para o Pablo só vai depois disso.
