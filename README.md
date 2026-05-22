curl -sk http://10.116.194.61:8080/sigpf_internet/index.html -o /dev/null -w "%{http_code}" && \
echo "" && \
curl -sk http://sigpf-cca-internet.esteiras.des.caixa/sigpf_internet/ -o /dev/null -w "%{http_code}" && \
echo "" && \
curl -sk http://sigpf-internet.esteiras.des.caixa/sigpf_internet/ -o /dev/null -w "%{http_code}"
