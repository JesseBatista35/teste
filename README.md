Oi Jonathan, tudo certo!

Só pra alinhar: são duas questões diferentes que acabaram na mesma W.O.

A demanda original é sobre a comunicação SIGAQ (origem Azure DES, no AKS/ArgoCD) → SIECM (destino on-premises DES, no OpenShift/OKD). É esse o problema de fundo — a conexão abre e é cortada logo em seguida, como você descreveu.
A nota sobre DNS/VPN não é sobre essa comunicação SIGAQ↔SIECM. É um bloqueio que encontrei enquanto eu mesmo tentava investigar o cluster AKS DES via kubectl, da minha estação, conectado na VPN corporativa — pra poder olhar os pods/logs do SIGAQ e ajudar a diagnosticar o corte de conexão. Minha própria conexão de VPN não está resolvendo o DNS privado do cluster (aks-sipdd-des.privatelink...), então nem consigo acessar o cluster pra investigar de dentro.

Ou seja: o pedido de liberação de DNS (10.244.37.197/198, porta 53) é pra viabilizar meu acesso de investigação, não é a causa do corte de conexão entre SIGAQ e SIECM.

Sobre o corte em si (conexão abre e é derrubada pouco depois) — isso tem cara de algo cortando a conexão no meio do caminho (firewall com timeout curto, reset de sessão, ou regra que permite handshake mas bloqueia o restante do fluxo). Você já tem visibilidade de logs de firewall nesse trajeto Azure DES → on-prem DES pra esse horário, ou consegue me indicar o que já foi checado até agora do lado de rede?
