Jonathan, consegui o teste através da equipe de Nuvem/COE (Silas Pereira da Costa Neto), que tem acesso via VM jumper na VNet.

Resultado: DNS resolveu corretamente para 10.116.180.64. A conexão TCP na porta 443 abriu e o handshake TLS foi concluído com sucesso (cipher negociado, certificado do servidor recebido). Isso indica que não há bloqueio de rede entre o AKS DES e o ambiente on-premises DES para esse destino/porta.

O único erro observado foi de validação de certificado (verify return code 21), esperado nesse teste manual porque o openssl não tinha a cadeia de CA da Caixa carregada localmente — não indica problema de rede. O "HTTP 408" também é só porque o teste com openssl s_client não envia uma requisição HTTP real, então não representa um corte de conexão da aplicação.

Ou seja, pelo que dá pra ver por aqui, a rede está passando normalmente. Você já tem visibilidade da captura do firewall pra esse horário, pra confirmar do seu lado também? E o corte relatado originalmente pode estar mais para o lado da aplicação (timeout do cliente real, truststore) do que da rede — vale considerar essa hipótese.


Silas, muito obrigado pela ajuda! O teste que você rodou foi essencial — resolveu a questão de acesso que estava travada desde ontem e trouxe um resultado bem claro: DNS resolvendo certo, TCP conectando e handshake TLS completo, o que indica que não há bloqueio de rede entre o AKS DES e o ambiente on-premises nesse destino.

Já repassei o resultado pro Jonathan (Redes Extranet e Nuvem), que estava com uma captura de firewall armada aguardando esse teste. Se precisar de mais alguma validação nesse cluster, sabendo que você tem acesso via VM jumper, posso te acionar de novo?
