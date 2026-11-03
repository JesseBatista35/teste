for i in $(seq 1 15); do
  for h in sigec.des.caixa sigecpor2.des.caixa; do
    printf "%s %s: " "$i" "$h"
    curl -sk -o /dev/null -D - https://$h/gec-web/por/ | grep -oE 'HTTP/1.1 [0-9]+|sigec-portabilidade[^"]*_lx104' | tr '\n' ' '
    echo
  done
done
