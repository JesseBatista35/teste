curl -s -o /dev/null -w "%{http_code}\n" --max-time 5 https://github.com
curl -s -o /dev/null -w "%{http_code}\n" --max-time 5 https://api.adoptium.net
