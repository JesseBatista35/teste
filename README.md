Complementando com as verificações que fiz hoje no cluster pixnprd4:

O que foi verificado

O namespace sispx-des não tem saída para nenhum destino externo ao cluster (cofre BeyondTrust, banco e APIs), mesmo em pod sem sidecar Istio.
Outros namespaces do mesmo cluster, inclusive no mesmo nó, saem normalmente. Ficam descartados problemas no cofre, no banco e na rede corporativa.
Não há EgressNetworkPolicy nem NetworkPolicy de egress no namespace. O EgressIP (10.116.223.11) e a regra de SNAT estão corretos no nó.
Os nós do cluster têm o agente Illumio (cadeias ILO-FILTER-*), que decide o bloqueio pelos bits da mark do pacote (máscara 0x70). A classe 0x40 corresponde à regra ILO-FILTER-ND-DROP.
O openshift-sdn aplica ao tráfego de EgressIP uma mark derivada do VNID do namespace. A do sispx-des (0x15e5f48) cai na classe 0x40.
Teste comparativo entre namespaces:
Classe 0x40: sispx-des e sispl-tqs – sem saída
Demais classes: pix-des, sispi-des, sispi-hmp, silce-hmp, sigel-tqs – saída normal
No nó pixnprd4-x44wk-worker-0-lbxr9, onde o EgressIP do sispx-des está atualmente, o contador da regra ILO-FILTER-ND-DROP passou de 2.730.888 para 2.731.224 pacotes durante um único teste de conexão do sispx-des. São pacotes de 60 bytes (SYN TCP), e o total acumulado de descartes nessa regra é de ~2,7 milhões.

Conclusão
O tráfego do sispx-des está sendo descartado pelo agente Illumio, por conflito entre a mark de EgressIP do openshift-sdn e os bits de mark usados pelo Illumio. Concordo que não há erro de configuração no namespace.

Sobre as sugestões

Restart do cluster: não deve resolver. A mark do namespace e a regra do Illumio continuariam as mesmas.
Recriar o namespace / criar um sispx2-des: pode funcionar de forma circunstancial, porque o novo VNID gera outra mark, mas não corrige a causa, não resolve o sispl-tqs (também afetado) e não impede que outros namespaces caiam na mesma condição.
Chamado com o fornecedor: concordo. A sugestão é que seja com o Illumio, com cópia à Red Hat.

Proposta de encaminhamento

Segurança (responsáveis pelo Illumio) verificar o que mudou no agente/política do pixnprd4 por volta de 24/11.
Ajustar o Illumio para não conflitar com as marks do openshift-sdn, ou aplicar exceção/modo visibilidade aos namespaces afetados até a correção.
Após a correção, a esteira refaz o deploy das aplicações do sispx-des e valida a subida.
