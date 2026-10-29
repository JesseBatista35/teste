# Para onde o nome aponta hoje
nslookup sigsj-intranet.esteiras.des.caixa

# A aplicação responde pelo Apache da 955 com o nome certo?
curl -s -o /dev/null -w "%{http_code}\n" -H "Host: sigsj-intranet.esteiras.des.caixa" http://10.116.194.179/sigsj_intranet/

