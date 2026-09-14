Segue o texto para enviar à Redes (CETEL/Thiago Marques), pedindo só a verificação de conectividade, sem entrar ainda na parte do template central — isso fica para depois, dependendo do que eles encontrarem:

Prezados,

Estamos com falha recorrente de build via pipeline (GitHub Actions), há quase duas semanas, afetando o desenvolvimento e entrega de sistemas. O erro ocorre na etapa de build do container, ao resolver dependências Maven/Quarkus no Nexus Caixa:

[ERROR] Unresolveable build extension: Plugin io.quarkus.platform:quarkus-maven-plugin:3.27.2 or one of its dependencies could not be resolved: Failed to read artifact descriptor for io.quarkus.platform:quarkus-maven-plugin:jar:3.27.2
Non-resolvable import POM: The following artifacts could not be resolved: io.quarkus.platform:quarkus-bom:pom:3.27.2 (absent): Could not transfer artifact io.quarkus.platform:quarkus-bom:pom:3.27.2 from/to Nexus Caixa (https://binario.caixa/repository/caixa-group-br): Connect to binario.caixa:443 [binario.caixa/10.122.155.40] failed: Connect timed out

Execução de referência: https://github.com/caixagithub/sisfm-backend-painelconta/actions/runs/34846602950/job/104011298622

Confirmado até o momento:

O DNS resolve binario.caixa corretamente (10.122.155.40); a falha é de conexão TCP na porta 443, não de autenticação ou artefato ausente.
O problema persiste há aproximadamente duas semanas, sem correção até então.
O runner do GitHub Actions assume role em conta AWS PAAS antes do build, o que sugere execução fora da rede corporativa Caixa.

Solicito verificação da conectividade entre a rede onde os runners do GitHub Actions executam (conta AWS PAAS) e o Nexus Caixa (binario.caixa), incluindo rota/VPN/firewall/ACL envolvidos, para identificar se houve alguma alteração recente que possa ter bloqueado esse caminho.

Aguardo retorno para definirmos os próximos passos.
