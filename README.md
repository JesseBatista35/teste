F=/infra_app/logs/sigaf/srjtqapllx0056_sigaf_intra_8083.log; grep "APFAP327" $F | tail -5 | cut -c1-500; grep -c -i "indisponibilidade" $F
