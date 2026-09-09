Diagnóstico – Comunicação SIGAQ (AKS DES) → SIGDA (apps.nprd.caixa)

Sintoma original reportado: comunicação entre SIGAQ (AKS DES, Azure) e ambiente on-premises DES apresentando corte de conexão.

Etapa 1 – Acesso ao cluster AKS DES
Identificado bloqueio de acesso próprio ao cluster via kubectl, tanto por VPN corporativa quanto por Cloud Shell, por falha de resolução da zona DNS privada (fora da VNet correta em ambos os casos). Acesso obtido com apoio da equipe de Nuvem/COE (Silas Pereira da Costa Neto), via VM jumper integrada à VNet. Logs também acessíveis via portal FusionX.

Etapa 2 – Teste de conectividade de rede
De dentro de um pod do SIGAQ, testada resolução de nome e conectividade contra sigda-api-quarkus-des.apps.nprd.caixa (10.116.180.64:443): DNS resolveu corretamente, conexão TCP estabelecida e handshake TLS concluído com sucesso.

Etapa 3 – Captura de pacotes (equipe de Redes Extranet e Nuvem, Jonathan)
Captura realizada em CNPRDFW001-1, com duas conexões amostradas (origem 10.245.153.18, destino 10.116.180.64:443). Em ambas: handshake TCP/TLS limpo, seguido de ~10 segundos sem tráfego, e encerramento gracioso via FIN,ACK partindo do servidor de destino. Sem RST e sem indício de bloqueio de rede.

Conclusão desta etapa: rede funcional entre AKS DES e o destino; descartado problema de firewall/rede.

Etapa 4 – Logs da aplicação SIGAQ
Confirmado, em chamada real de negócio (não apenas teste manual), que a requisição ao SIGDA (.../imagens/v1/dossies/) retorna HTTP 408, reproduzindo o mesmo padrão observado nos testes de rede.

Etapa 5 – Logs do SIGDA (OKD, namespace sigda-des)
Ao investigar logs históricos do SIGDA, identificado um padrão recorrente de instabilidade na conexão com o banco Oracle (oracle-nprd-1000.caixa, serviço prim_D01NGSRV), documentado em pelo menos duas ocasiões (02/09 e 04/09/2026): erros ORA-03113, ORA-12514 e ORA-17868, com o health check da aplicação reportando status DOWN durante esses períodos. Não foi possível confirmar se essa instabilidade estava ocorrendo no momento exato dos testes de hoje (o pod ativo durante os testes foi substituído por um rollout antes da consulta ao log específico desse intervalo).

Conclusão geral: Descartado problema de rede/firewall entre AKS DES e on-premises. O 408 é gerado pelo próprio serviço SIGDA. Não temos evidência direta do que causou o 408 especificamente nos testes de hoje, mas identificamos um histórico relevante de instabilidade na conexão do SIGDA com seu banco Oracle, que pode ou não estar relacionado.

Encaminhamento: Solicitamos ao time responsável pelo SIGDA uma investigação sobre a causa do HTTP 408, com atenção especial ao padrão de instabilidade Oracle já identificado. Como próximo passo, vamos pedir ao Mateus para reproduzir uma chamada real na aplicação agora, enquanto acompanhamos o log do SIGDA em tempo real, buscando capturar o erro no momento exato da falha.
