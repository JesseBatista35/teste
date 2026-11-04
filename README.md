Pessoal, com a captura de drop do Adriano o diagnóstico está fechado:

O tráfego do sipdm-api-estudante para o banco (10.116.100.127:1433) sai do cluster pelo nó ceadecldlx084 com origem 10.116.208.104 (IP do nó), e não com o egress IP 10.116.221.183 configurado para o namespace. O firewall descarta por não haver regra para essa origem (acl-drop).
A regra 98529 para 10.116.221.183 está correta, mas não está sendo usada, porque o tráfego não sai com esse IP.

Ações:

Paliativo (destrava o Super App): abrir regra para 10.116.208.104 → 10.116.100.127:1433/TCP. Abro agora e peço a aprovação do Gagliardi/Reinaldo. Observação: esse paliativo depende de o egress continuar no nó 084. Se o egress migrar de nó, a origem muda.
Definitivo: acionar o time de OpenShift para corrigir o egress do namespace sipdm-des, para que o tráfego saia com 10.116.221.183, como configurado.

Obrigado, Adriano, pelas capturas!
