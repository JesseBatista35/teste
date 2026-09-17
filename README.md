Boa tarde! Tudo bem sim.

Desabilitei o Puppet nesse servidor (sspdeaprlx0027) no dia 31/08, durante o atendimento da WO0000081522583 (ajuste de CORS no Apache DES do SIAVL). Estava fazendo edições manuais ao vivo nos arquivos de configuração junto com outro time, e por precaução desabilitei o agente para evitar que ele revertesse as alterações no meio da sessão de testes.

Depois investigamos melhor e confirmamos (via puppet resource e puppet agent --test --noop) que o Puppet não tinha nada catalogado para aquele arquivo específico — ou seja, não era ele que estava causando o comportamento que estávamos vendo. Foi desabilitado por precaução mesmo, não por uma causa confirmada.

A WO já foi concluída e acabei esquecendo de reabilitar depois. Pode reativar sem problema — posso fazer isso agora mesmo (puppet agent --enable) ou prefere que vocês reativem aí?
