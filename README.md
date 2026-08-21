sed -n '1100,1428p' /infra_app/logs/sifpp/server-crjtqapllx003_sifpp_intra_8080.log | grep -inE "exception|error|caused by|singleton"

sed -n '1340,1400p' /infra_app/logs/sifpp/server-crjtqapllx003_sifpp_intra_8080.log
