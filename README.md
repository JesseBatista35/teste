curl -vk "https://sigaq.des.caixa/conteudo/v1/dossies?cpfCnpj=14725836982"

wget -O- --no-check-certificate "https://sigaq.des.caixa/conteudo/v1/dossies?cpfCnpj=14725836982"

timeout 5 bash -c "cat < /dev/null > /dev/tcp/10.245.153.7/443" && echo "PORTA ABERTA" || echo "PORTA FECHADA/TIMEOUT"


getent hosts sigaq.des.caixa
