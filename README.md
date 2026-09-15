Entendido — sem acesso ao console nem SSH nesse host, o caminho agora é abrir chamado pro time responsável pelo Apache/balanceador do ambiente SITEC em DES. Segue o texto pronto:

Assunto: Node do cluster SITEC (DES) fora de roteamento no balanceador — contexto tec_tel retornando 503 só nesse nó

Ambiente: DES — sitec.desenvolvimento.extracaixa

Descrição do problema:
A aplicação tec_tel (instância sitec-tellus-tqs, JBoss, servidor 10.192.228.217:8380) está retornando "Service Unavailable" (503 padrão do Apache) ao ser acessada via https://sitec.desenvolvimento.extracaixa/tec_tel. A tela apresentada é o erro genérico do Apache httpd, diferente da tela de erro da aplicação (tela "CAIXA") que normalmente aparece quando o JBoss está fora ou com erro de subida.

Evidências já coletadas:

Processo JBoss da instância sitec-tellus-tqs está ativo no servidor 10.192.228.217, sem erros relevantes no log de subida.
Teste local na própria VM confirma a aplicação saudável:
  curl -v http://localhost:8380/tec_tel/

Retorno: HTTP/1.1 200 OK, conteúdo normal (redirect para main/home).

No mesmo servidor, outra aplicação do sistema (tellus-tqs) responde normalmente via balanceador.
No outro nó do cluster (10.192.228.85), as aplicações do mesmo sistema respondem normalmente, incluindo o equivalente ao tec_tel.
Acesso direto ao IP:porta (10.192.228.217:8380) é bloqueado para a rede do usuário (esperado, por política).
Front-end/balanceador identificado via DNS: sitec.desenvolvimento.extracaixa → 10.192.220.98. Não há acesso disponível a esse host (console de status via navegador não abre; SSH retorna connection refused) para validar diretamente o estado do worker/contexto.

Hipótese:
O contexto tec_tel para o nó 10.192.228.217 está desabilitado/em erro no balanceador (mod_cluster ou mod_jk), enquanto o restante da aplicação e o outro nó do cluster seguem normais. A aplicação em si está saudável (confirmado via teste local).

Solicitação:
Verificar no Apache/balanceador (10.192.220.98) o estado do worker/contexto associado a 10.192.228.217:8380 (tec_tel) e reabilitar/reativar, ou informar se é necessário algum ajuste de configuração adicional.
