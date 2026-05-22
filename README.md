echo "==TESTE AJP JBOSS==" && \
curl -sk http://10.116.194.61:8009/ && \
echo "==TESTE HTTP JBOSS==" && \
curl -sk http://10.116.194.61:8080/sigpf_internet/ -o /dev/null -w "%{http_code}" && \
echo "==BALANCER MEMBERS==" && \
curl -sk http://localhost/balancer-manager?b=sigpf-internet
