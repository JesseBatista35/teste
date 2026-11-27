Próximo comando: o bloco security (senha mascarada)
bash
sed -n '160,176p;192,208p' /opt/jboss-eap/standalone/configuration/standalone-full-ha.xml \
  | sed -E 's#(<password>)[^<]*#\1*****#'

Na saída, observe:

<user-name>: qual usuário é, e se é de TQS.
<password>: se vem como texto mascarado, como ${...} (system property), como ${VAULT::...} ou como placeholder vazio. Se vier <security-domain> em vez de user/password, mande o nome do domain que eu digo onde procurar.
Comparação com DES (é o que fecha o diagnóstico)

Na VM de DES do sicmu-intranet-update, rode o mesmo grep:

bash
grep -n -A30 -E 'java:/(db2cmu|db2cdm)' /opt/jboss-eap/standalone/configuration/standalone-full-ha.xml \
  | grep -E 'jndi-name|connection-url|currentSchema|TQS|DES|user-name|security-domain'

Como ler o resultado:

DES usa a mesma URL/location e outro usuário: o usuário de TQS está errado, expirado ou revogado no RACF. Corrija na Library de TQS ou peça reset ao time de banco.
DES usa outra URL/location: a variável de URL da Library de TQS está apontando para o DB2 errado.
DES usa a mesma URL e o mesmo usuário e funciona: a senha na Library de TQS está diferente.

Uma observação: o jboss-cli deu timeout no primeiro comando e respondeu no segundo. É só a porta de management lenta, não muda nada no diagnóstico.
