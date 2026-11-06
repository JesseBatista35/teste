Prezados,

Segue análise referente à indisponibilidade de https://sibdo-web.esteiras.des.caixa (VIP 10.116.181.213 → backend caddeapllx2835 / 10.116.202.37).

1. Servidor backend (caddeapllx2835) – OK
- JBoss EAP em execução, escutando em 8080/8443; aplicação responde HTTP 200 em /sibdo/ (teste local).
- Apache em execução, escutando em 80 e 443.
- Firewall local (iptables) com policy ACCEPT e portas 80/443 liberadas. Não há bloqueio no host.

2. Conectividade de rede até o backend – BLOQUEADA
- A partir de outro servidor NPRD (cbrdeapllx473 / 10.116.97.79), o próprio backend 10.116.202.37 apresenta TIMEOUT nas portas 80, 443 e 8080, mesmo com os serviços ativos no host.
- Isso indica bloqueio de firewall de rede ou rota até o 10.116.202.37. O timeout no VIP 10.116.181.213:443 é consistente com esse cenário, pois o problema ocorre antes de alcançar o servidor.

3. Configuração esperada do balanceamento
- Padrão da esteira Terraform: SSL terminado no VIP e balanceamento para o backend na porta 80 (HTTP).
- A porta 443 do servidor não possui SSL configurado (responde em HTTP puro). O pool/serviço do VIP deve apontar para 10.116.202.37:80 HTTP, e não para 443 SSL.

4. Ponto de atenção na aplicação (Apache)
- No vhost (/opt/httpd/conf.d/vhost.conf) existe a regra "RewriteRule ^/$ / [R]", que gera loop de redirecionamento 302 em "/". Caso o monitor do balanceador seja HTTP em "/" esperando 200, o membro não ficará UP.
- Recomenda-se ajustar a regra (ex.: redirecionar "/" para "/sibdo/") via repositório SIBDO-web-config e nova execução da esteira.

Encaminhamentos:
- Redes/CETEL: validar regra de firewall/rota até 10.116.202.37 (portas 80/443); confirmar que o VIP 10.116.181.213:443 está ativo, com serviço/pool apontando para 10.116.202.37:80 HTTP, e informar o monitor configurado (tipo, porta e path).
- Equipe da aplicação: corrigir o RewriteRule no SIBDO-web-config.

Encerrando esta demanda com a análise acima.
