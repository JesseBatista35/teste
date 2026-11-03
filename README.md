curl -sv -o /dev/null -H "Host: sigec-comercial.des.caixa" http://10.116.78.14/gec-web/ 2>&1 | grep -iE 'HTTP/1.1 |Server:|JSESSIONID'
curl -sv -o /dev/null -H "Host: sigec-csc.des.caixa"       http://10.116.78.14/csc-web/ 2>&1 | grep -iE 'HTTP/1.1 |Server:|JSESSIONID'
tail -3 /logs/apache2/sigec-portabilidade2/sigecpor2.des.caixa-error.log
