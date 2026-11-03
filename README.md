curl -skv https://sigec.des.caixa/gec-web/por/ 2>&1 | head -15

for /L %i in (1,1,15) do @(curl.exe -sk -o NUL -D - https://sigec.des.caixa/gec-web/por/ | findstr /i "HTTP/1.1 JSESSIONID" & curl.exe -sk -o NUL -D - https://sigecpor2.des.caixa/gec-web/por/ | findstr /i "HTTP/1.1 JSESSIONID")

