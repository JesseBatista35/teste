Confirmar comparando com o 6.4

No CLI do 471, a configuração atual no 7.4:

/profile=full-ha-sifec-intranet/subsystem=datasources/data-source="jdbc/IdmsSiapxDS":read-resource

No 6.4 (10.116.88.20), a configuração do mesmo datasource:

bash
ls /opt/jboss*/*/domain/configuration/domain.xml /opt/jboss*/domain/configuration/domain.xml 2>/dev/null

Com o caminho que aparecer:

bash
grep -n -A25 'jdbc/IdmsSiapxDS' <caminho que apareceu> | head -40

O que vou procurar nas duas saídas:

check-valid-connection-sql ou valid-connection-checker;
validate-on-match ou background-validation;
idle-timeout-minutes.

Se o 6.4 tiver validação e o 7.4 não, a correção é só incluir no 7.4. Te passo o comando pronto.

Na sala, por enquanto, pode mandar a mensagem anterior, para o Alessandro indicar quem testa. Já dá para incluir que o erro no IDMS é de conexão do pool e está em ajuste do nosso lado.

Como o Claude está se saindo nesta sessão?
