Segue o resumo do caso, que serve para você se situar ou para colar para quem chegar agora:

Caso: SIPDM – sipdm-api-estudante (DES) com erro 500 por falha de conexão ao banco

Sintoma: a aplicação sipdm-api-estudante (namespace sipdm-des, cluster OpenShift NPRD) retorna HTTP 500 em todas as operações. O log mostra SQLServerException: Connect timed out ao conectar no SQL Server do PDM: CRJDEDADNT009 – 10.116.100.127:1433 (banco PDMDB001). Isso impacta o Super App.

Como funciona a saída do cluster: cada namespace do OpenShift tem um egress IP próprio, o IP de origem com que seu tráfego sai para a rede. O do sipdm-des é o 10.116.221.183, hospedado no nó ceadecldlx084 (10.116.208.104). Por isso, as regras de firewall foram pedidas com essa origem.

Histórico:

09/10: identificada a falta de regra de firewall. Aberta a regra 98173 (10.116.221.183 → 10.116.100.127:1433).
22/10: regra aplicada no CNPRDFW001-1, mas o acesso continuou falhando. A CETEL indicou a necessidade de regra também no trecho CTC ↔ Rio.
27–28/10: aberta e aplicada a regra 98502/98529 (CHG00017497). A CETEL validou com ping tcp a partir do firewall, com sucesso.
03–04/11: o pod continuou com timeout. As capturas do Adriano (CETEL) mostraram a causa real.

Causa encontrada:

O tráfego do pod para o banco não sai com o egress IP 10.116.221.183. Sai com o IP do nó, 10.116.208.104.
Como não há regra para esse IP, o firewall descarta (acl-drop – Flow is denied by configured rule).
Movi o pod para outro nó (ceadecldlx052) e o comportamento foi o mesmo: o tráfego continua saindo pelo nó 084 com o IP do nó.
A configuração no OpenShift está correta (netnamespace e hostsubnet mostram o egress 10.116.221.183 no 084). Na prática, porém, o nó não está aplicando o SNAT do egress IP.
Outros namespaces saem normalmente com seus egress IPs. Na mesma captura aparecem conexões funcionando para o banco a partir de outros egress IPs.

Conclusão: as regras de firewall estão corretas. O problema está no egress IP do OpenShift para o namespace sipdm-des.

Próximo passo: acionar o time de infraestrutura OpenShift (Fabio) para mover o egress IP 10.116.221.183 para outro nó. Foi a mesma ação que resolveu um caso idêntico no SIHDG-JBOSS8-TQS (WO0000081857473). Depois, validar de dentro do pod com o teste TCP para 10.116.100.127:1433.

Alternativa descartada: abrir regra para o IP do nó (10.116.208.104). Só funcionaria enquanto o egress estivesse no 084: em manutenção ou falha do nó, ele migra e o problema volta.
