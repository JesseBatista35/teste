/server-group=sifpp/system-property=ENDPOINT_MICRO:add(value="https://sifpp-micro-des.apps.nprd.caixa")

/server-group=sifpp/system-property=ENDPOINT_MICRO:read-resource

/host=srjdeapllx158/server-config=srjdeapllx158_sifpp_intra_8081:reload

ps -ef | grep sifpp_intra_8081 | grep -o "DENDPOINT_MICRO=[^ ]*"
