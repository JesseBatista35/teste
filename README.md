tail -n 300 /infra_app/logs/sisgr/server-srjdeapllx130_acessoseguro_intra_5500.log

grep -i -B3 -A20 "siset" /infra_app/logs/sisgr/server-srjdeapllx130_acessoseguro_intra_5500.log | tail -n 200

grep -i -E "exception|timeout|connect|refused|failed" /infra_app/logs/sisgr/server-srjdeapllx130_acessoseguro_intra_5500.log | tail -n 100

grep -i -B3 -A20 "siset" /infra_app/logs/sisgr/server-srjdeapllx130_webservice_intra_5502.log | tail -n 200
