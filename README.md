1. Na 473: testar a conexão para todos de uma vez
for d in cxextrux047.desenvolvimento.extracaixa:55000 bdbr12.caixa:55000 10.116.92.132:4101 10.116.92.132:4102 10.116.92.132:4407 10.192.230.120:4101; do h=${d%:*}; p=${d#*:}; if timeout 5 bash -c "</dev/tcp/$h/$p" 2>/dev/null; then echo "OK      $d"; else echo "FALHOU  $d"; fi; done

Pode copiar como está: todos os hosts e portas já estão no comando.

2. Na 471: o nome de cada datasource e o profile
for n in 747 871 879 969 1000 1031 1047 1060 1094; do awk -v n=$n 'NR<=n && /<profile name=/ {p=$0} NR<=n && /<(xa-)?data-source / {d=$0} NR==n {print n": "p" | "d; exit}' /opt/jboss/jboss-eap/dc/configuration/domain.xml; done

Isso mostra, para cada linha, o profile e o jndi-name/pool-name do datasource.

Com as duas saídas, a gente sabe qual banco o MCM usa e se o problema é firewall. Se algum der FALHOU, preparo o texto da regra (origem 10.116.97.79, que é a 473, para o host e porta que falharam). Lembre que o 472 (10.116.97.78) também é HC do sifec-intranet, então a regra deve incluir as duas máquinas.
