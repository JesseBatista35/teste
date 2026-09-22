Pessoal, causa raiz corrigida: era a senha do keystore mesmo, desatualizada na property após a troca do certificado. Carlos Augusto ajudou a corrigir direto no servidor, reiniciamos o server e o log de debug SSL agora mostra handshake TLS completo com sucesso (Finished dos dois lados, sessão cacheada, troca de Application Data).

Alguém consegue disparar o teste de integração com o Dataprev pra confirmarmos de ponta a ponta?
