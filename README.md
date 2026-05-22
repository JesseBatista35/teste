echo "==ERRO LOG SIGPF==" && \
tail -50 /logs/apache2/sigpf-internet/sigpf-internet.esteiras.des.caixa-error.log && \
echo "==BALANCER MANAGER==" && \
curl -sk http://localhost/balancer-manager | grep -i sigpf
