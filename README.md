Prezados,

Confirmo que a conectividade entre o pod sispl-consulta-apostas-api-tqs (TQS) e o host cics.des.coredf.caixa:8080 (IP 10.192.224.76) foi restabelecida.

Testes realizados diretamente de dentro do pod, via oc rsh:

Resolução de DNS:
getent hosts cics.des.coredf.caixa
10.192.224.76 ibmapribm.des.extranet.caixa cics.des.coredf.caixa

nslookup cics.des.coredf.caixa
Nome: ibmapribm.des.extranet.caixa
Endereço: 10.192.224.76

Teste de conectividade TCP na porta 8080, executado dentro do pod:
timeout 5 bash -c "</dev/tcp/cics.des.coredf.caixa/8080" && echo "CONECTOU" || echo "TIMEOUT/BLOQUEADO"
Resultado: CONECTOU

Ambos os testes confirmam que a rota está liberada e a resolução de nome está correta, sem qualquer timeout na tentativa de conexão.

Diante disso, considero a liberação de rota validada. Solicito validação funcional do componente para confirmar a normalização completa do fluxo.

Atenciosamente,
Jessé Batista
