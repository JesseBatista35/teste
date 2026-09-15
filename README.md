


Histórico de Informações de Trabalho da Ordem de Trabalho
ID da Ordem de Trabalho	 WO0000081656136
Criado em	 15/09/2026 14:31:21
Criado por	 P412767
Origem de Comunicação	 
Exibir Acesso	 Público
Notas	 À Esteiras Devops,

Conforme nota anterior, segue para avaliação.

Atenciosamente,
Martha Rocha
Preposta de Redes Datacenter
ID da Ordem de Trabalho	 WO0000081656136
Criado em	 15/09/2026 14:19:32
Criado por	 P908440
Origem de Comunicação	 
Exibir Acesso	 Público
Notas	 À
HITSS,

- Para a análise de redes, favor informar a origem que tenta se comunicar com o binario.caixa (10.122.155.40).


Att,
Magnus dos Santos Silva
Analista de Datacenter - Redes
TELEDATA/CETEL/REDES
ID da Ordem de Trabalho	 WO0000081656136
Criado em	 15/09/2026 14:18:49
Criado por	 P908440
Origem de Comunicação	 
Exibir Acesso	 Público
Notas	 À
HITSS,

- Favor desconsiderar a nota anterior.

Att,
Magnus dos Santos Silva
Analista de Datacenter - Redes
TELEDATA/CETEL/REDES
ID da Ordem de Trabalho	 WO0000081656136
Criado em	 15/09/2026 10:49:33
Criado por	 P908440
Origem de Comunicação	 
Exibir Acesso	 Público
Notas	 À
HITSS,

- Informo que não há problema de conectividade entre os hosts 10.122.147.55 e 10.219.194.164, bem como o erro apresentado é de aplicação. Demanda não pertinente à equipe de Redes - Datacenter.

- Evidências em anexo.



Att,
Magnus dos Santos Silva
Analista de Datacenter - Redes
TELEDATA/CETEL/REDES
ID da Ordem de Trabalho	 WO0000081656136
Criado em	 14/09/2026 17:29:03
Criado por	 P585600
Origem de Comunicação	 
Exibir Acesso	 Público
Notas	 À REDES/ CETEL

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

Atenciosamente,

Jessé Mouta Pereira Batista
Analista
CTIS / CESTI Esteira DEVOPS DES TQS NPRD
ID da Ordem de Trabalho	 WO0000081656136
Criado em	 14/09/2026 17:23:14
Criado por	 P779123
Origem de Comunicação	 
Exibir Acesso	 Público
Notas	 Demanda inicial com viés de falha, erro, degradação ou esgotamento de infraestrutura, serviço, máquina, armazenamento, rotina ou situação que esteja na iminência de tornar-se incidente. Previsto atendimento no prazo indicado pelo demandante. [CENTRAL-SID]
ID da Ordem de Trabalho	 WO0000081656136
Criado em	 14/09/2026 16:45:44
Criado por	 P507043
Origem de Comunicação	 
Exibir Acesso	 Público
Notas	 Prezado(a),



Informamos que sua solicitação foi recebida.  



Nosso SLA para atendimento é de até 24h úteis, analisaremos a solicitação para nos certificarmos que o atendimento está dentro do escopo de atuação da nossa equipe.



Caso seja identificado que o atendimento não corresponde ao nosso escopo, a solicitação será redirecionada à equipe responsável.



Novas informações e atualizações serão registradas diretamente nesta WO.



Atte.



Esteira Devops DES TQS NPRD

ID da Ordem de Trabalho	 WO0000081656136
Criado em	 14/09/2026 16:38:59
Criado por	 Remedy Application Service
Origem de Comunicação	 E-mail
Exibir Acesso	 Interno
Notas	 Este ticket foi criado a partir do sistema de solicitação de serviço.
Impresso por P585600 em Terça-feira, 15/09/2026 14:50:21



Prezado,

Em contato com o cliente existem vários projetos no GitHub sem conectividade com o binario.caixa

Segue exemplo:
- https://github.com/caixagithub/sisfm-backend-painelconta/actions/runs/34846602950
- https://github.com/caixagithub/sisfm-bff-navbar/actions/runs/33888199751



Atenciosamente


achei essa nota em outra w.o na me ajuda a montar um texto, para envar par aoi time de nuvem
