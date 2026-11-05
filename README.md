
-sh-4.1$ sed -i 's#https://sifec[12]\.des\.caixa/#https://migracaosifec.des.caixa/#' /tmp/props_cdt.cli
-sh-4.1$ grep -E "SICDT_URL" /tmp/props_cdt.cli
/server-group=sifec-intranet/system-property=SICDT_URLBASE:add(value="https://migracaosifec.des.caixa/sicdt-orig-api-rest/sicdt")
/server-group=sifec-intranet/system-property=SICDT_URL_BASE_API:add(value="https://migracaosifec.des.caixa/sicdt-orig-api-rest/sicdt")
-sh-4.1$
-sh-4.1$
-sh-4.1$
