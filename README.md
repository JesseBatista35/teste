grep -n "^	at \|^        at " /infra_app/logs/sifpp/server-crjtqapllx003_sifpp_intra_8080.log | wc -l


grep -n "WFLYSRV0010\|WFLYSRV0025" /infra_app/logs/sifpp/server-crjtqapllx003_sifpp_intra_8080.log


sed -n '1,50p' /infra_app/logs/sifpp/server-crjtqapllx003_sifpp_intra_8080.log | grep -n "SingletonComponent\|EJBException\|CreateException\|WARN"


grep -n -B 80 "AbstractEJBRequestScopeActivationInterceptor" /infra_app/logs/sifpp/server-crjtqapllx003_sifpp_intra_8080.log | head -40
