Boa cautela — vamos deixar isso mais preciso tecnicamente. Segue a nota revisada:

Prezados,

Em atendimento à solicitação de criação de nova instância JBoss EAP 7.4 nos servidores 10.192.222.70 e 10.192.222.72 (sistema SIPCS, ambiente DES), realizei levantamento técnico prévio nos servidores e identifiquei pontos que precisam de esclarecimento antes de prosseguir com a instalação.

Levantamento realizado:

Confirmado o JDK 1.8.0_66 utilizado pela instância 7.0, localizado em /usr/jdk/instances/jdk1.8.0_66/bin/java. No servidor .70 esse mesmo JDK também é referenciado via symlink em /usr/jdk/jdk1.8.0_66, usado pelas instâncias 6.4.
Mapeada a topologia atual dos servidores via inspeção de processos em execução no momento da análise:
No servidor 10.192.222.70, as instâncias 6.4 e 7.0 estão organizadas por sub-ambiente (domínio), cada uma com seu próprio Domain Controller (DC): tqs, pre, des, rel e cod, todos com Host Controller (HC) local correspondente.
No servidor 10.192.222.72, foram localizados, no momento da inspeção, Host Controllers ativos apenas para os domínios tqs, pre e rel, todos da versão 6.4, apontando para os respectivos DCs hospedados na .70. Não foram localizados processos ativos dos domínios des e cod na .72, nem nenhuma instância da versão 7.0 neste servidor. Como a verificação foi feita via ps -ef (processos em execução), não é possível afirmar que esses HCs não existam configurados — apenas que não estavam ativos no momento da checagem.

Pendências para prosseguir:

A solicitação original não especifica qual domínio/sub-ambiente (des, tqs, pre, rel ou cod) a nova instância 7.4 deve seguir. Solicito confirmação de qual(is) domínio(s) devem ser contemplados na instalação, tanto no servidor .70 quanto no .72.
Solicito confirmação sobre o padrão de referência: a topologia "DC na .70 + HC na .72" identificada corresponde ao padrão da versão 6.4 (domínios tqs, pre e rel). A versão 7.0, por sua vez, está hospedada integralmente no servidor .70, sem HC correspondente localizado na .72. Peço orientação sobre qual desses padrões deve ser seguido para a nova instância 7.4.
Caso os domínios des e/ou cod sejam de interesse para a nova instância na .72, solicito confirmação se há Host Controller já configurado (porém inativo) para esses domínios nesse servidor, ou se a criação seria greenfield.

Aguardo retorno com essas informações para dar continuidade à instalação.
