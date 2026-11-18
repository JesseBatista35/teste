grep -m1 -A25 "indisponibilidade" $F | cut -c1-300; echo "-----"; grep -i "caused by" $F | cut -c1-200 | sort | uniq -c | sort -rn | head -15
