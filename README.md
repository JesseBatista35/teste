Vi que já criaram os grupos SICQL-MAPSFEEDER-* e trocaram o vínculo da release. Isso resolve a parte do enquadramento. Porém:

DES, HMP e PRD estão só com INIT. Uma release nova em DES vai subir sem variável nenhuma (nem banco).
TQS está com valores provisórios ou incompletos:
ACTIVEMQ_URL=tcp://localhost:4000 e ACTIVEMQ_USERNAME=usertest são placeholders;
MQ_TYPE=ibmmq contradiz o ActiveMQ. Qual mensageria o feeder usa?
as filas (FEEDER_TO_PRECIFICADOR_QUEUE, PEGASUS_DIGESTER_QUEUE) e todo o bloco LDAP_* estão vazios;
REVERSE_PROXY_URL aponta para apps.apl4.caixa (PRD). Para TQS deveria ser apps.nprd.caixa.
A release também tem vinculados grupos ADAPTER_VARIABLES de SIECO, SIFGM e SIACM, que não são do SICQL. Sugiro desvincular.

Os valores de ActiveMQ/MQ, filas e LDAP precisam vir do fornecedor. Assim que tiver, ajusto DES/TQS e gero a release.
