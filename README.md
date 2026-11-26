Atualização – SISPX-pix-gestao (DES / cluster pixnprd4 / namespace sispx-des)

Sintoma
O deploy do sispx-pix-gestao-des não conclui. O pod fica em Init:CrashLoopBackOff porque o init container secrets-agent-sidecar não consegue conectar ao BeyondTrust (sicsn.caixa:443): ConnectTimeout. Sem os segredos, o secrets-check falha e a aplicação não sobe. O pod anterior (versão 391), que ainda está em execução, também está com o container da aplicação não pronto (ORA-17002 ao conectar no banco). É o mesmo problema de saída de rede.

Verificações realizadas

Teste a partir de pod sem sidecar Istio no namespace sispx-des: timeout para sicsn.caixa:443, api.des.caixa:8443 e cnpexdadvm01-scan4.extra.caixa.gov.br:1521. O namespace não tem saída para nenhum destino externo ao cluster.
O mesmo teste a partir de outros namespaces do cluster (sispi-des, sigel-tqs) conectou normalmente. Com isso ficam descartados problemas no BeyondTrust, no banco e na rede corporativa.
Istio descartado: o teste sem sidecar apresenta a mesma falha.
Não existem EgressNetworkPolicy nem NetworkPolicy de egress no namespace sispx-des.
O EgressIP do namespace (10.116.223.11) está atribuído e configurado no nó, e a regra de SNAT existe. A captura de pacotes no nó mostra o SYN saindo do pod, mas ele nunca é traduzido para o EgressIP nem sai pela interface física.
Foram identificadas nos nós do cluster as regras do agente Illumio (VEN – cadeias ILO-FILTER-*). Essas regras classificam os pacotes pelos bits da mark (máscara 0x70), e a classe 0x40 corresponde a descarte (ILO-FILTER-ND-DROP).
O openshift-sdn usa uma mark derivada do VNID do namespace para o tráfego de EgressIP. Para o sispx-des essa mark é 0x15e5f48, que resulta em classe 0x40 no Illumio.
Teste de saída por classe de mark:
Classe 0x40: sispx-des (EgressIP .11) e sispl-tqs (EgressIP .16) – FALHA
Classe 0x30: pix-des, sispi-hmp, silce-hmp – OK
Classe 0x10: sigel-tqs – OK
Classe 0x70: sispi-des – OK

Somente os namespaces cuja mark cai na classe 0x40 estão sem saída, independentemente do nó. O EgressIP .11 foi realocado de nó durante a análise e continuou falhando.

Conclusão
O tráfego de saída do namespace sispx-des está sendo descartado nos nós do cluster pixnprd4 pelo agente Illumio, por conflito entre a mark usada pelo openshift-sdn para o EgressIP e os bits de mark usados pelo Illumio para decisão de bloqueio. Não se trata de problema da aplicação, da esteira, do BeyondTrust nem de regra de firewall de rede. A troca de EgressIP não resolve, porque a mark deriva do VNID do namespace e não do IP.

Impacto

sispx-des (SISPX-pix-gestao e demais aplicações do namespace) sem acesso a banco, cofre e APIs em DES desde aproximadamente 24/11.
sispl-tqs também afetado pelo mesmo problema.

Encaminhamento

Segurança (responsáveis pelo Illumio), com cópia ao time de administração do cluster pixnprd4:
Informar se houve instalação, atualização ou mudança de política/modo de enforcement do Illumio no pixnprd4 nos últimos dias.
Ajustar o VEN/política para não conflitar com as marks do openshift-sdn, ou aplicar exceção/modo visibilidade aos namespaces afetados até a correção definitiva.
Após a correção, a esteira refaz o deploy do sispx-pix-gestao-des e valida a subida da aplicação.
