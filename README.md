sed -n '1250,1428p' /infra_app/logs/sifpp/server-crjtqapllx003_sifpp_intra_8080.log | grep -n -i "exception\|error\|caused by\|singleton"

sed -n '1100,1428p' /infra_app/logs/sifpp/server-crjtqapllx003_sifpp_intra_8080.log | grep -n -i "exception\|caused by"

grep -n "AbstractEJBRequestScopeActivationInterceptor" /infra_app/logs/sifpp/server-crjtqapllx003_sifpp_intra_8080.log
