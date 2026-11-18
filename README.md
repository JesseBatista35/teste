Jesse,
 
Conforme evidenciado nos testes realizados, o fluxo informado já possui regra de firewall e está sendo permitido pelo equipamento.
 
Foi executado o comando abaixo diretamente no firewall:
- packet-tracer input AUTO_DES_APRES TCP 10.116.180.64 65001 10.116.26.110 443
 
Resultado:
- Action: allow
 
O resultado "Action: allow" demonstra que o firewall processa o tráfego entre a origem 10.116.180.64 e o destino 10.116.26.110 na porta TCP/443 sem qualquer bloqueio.
 
Adicionalmente, foi realizado teste de conectividade TCP a partir do próprio firewall utilizando a mesma origem, destino e porta informados:
- CNPRDFW001-1# ping tcp 10.116.26.110 443 source 10.116.180.64 65001 Sending 5 TCP SYN requests to 10.116.26.110 port 443 from 10.116.180.64 starting port 65001: !!!!! Success rate is 100 percent (5/5)
 
O retorno 100% de sucesso indica que o host 10.116.26.110 respondeu às tentativas de conexão TCP na porta 443, demonstrando que existe comunicação entre origem e destino pelos parâmetros informados.
 
Dessa forma, não foi identificado qualquer bloqueio ou impedimento sob responsabilidade da equipe de Redes Datacenter, tampouco existe ação pendente de firewall para este fluxo.
 
Caso a indisponibilidade persista, recomendamos que sejam validados os componentes da aplicação e do servidor envolvidos na comunicação, uma vez que as evidências apresentadas demonstram que o firewall permite o tráfego e que o destino responde na porta solicitada.
