# timeouts por faixa de 10 min (início, fim e se ainda ocorrem)
/usr/gnu/bin/grep -a "Read timed out" /log_ias/ceflib/ceflib-dsv08.log | cut -c1-4 | uniq -c

# o que o conector registrou na rota 9683 durante a janela
/usr/gnu/bin/grep -a -n -E "^11:(1[0-9]|[2-5][0-9])" /log_ias/connector/connector.log | /usr/gnu/bin/grep -a -i -E "9683|erro|timeout|exce|reconect|desconect" | head -60

# confirmar o mapeamento da rede 9683 para o host/porta CICS
/usr/gnu/bin/grep -n -E "9683|9690" /connector/config/map.properties /connector/config/connector.properties
