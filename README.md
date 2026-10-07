ps -ef | grep [j]boss-modules | tr ' ' '\n' | grep -E '^(-c|--server-config)' -A1
