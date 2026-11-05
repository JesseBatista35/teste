sed -i 's#https://sifec[12]\.des\.caixa/#https://migracaosifec.des.caixa/#' /tmp/props_cdt.cli
grep -E "SICDT_URL" /tmp/props_cdt.cli
