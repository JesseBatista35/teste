Jesse Mouta Pereira Batista
Michael Lourant de Oliveira Ferreira     Incluir a propriedade abaixo no persistence.xml do sirur-ejb.jar, dentro do bloco <properties> das duas unidades, fec.pu e fec.rur.pu:   xml <property name="h…
Caros,
 
Foi gerada a versão 3.55.51.01 com o ajuste sugerido no persistence.xml
 
Verifiquem se é o bastante... vamos estimar o esforço demandado pela solução de ajuste em cada uma das entidades.
 


o denislosn disse isso, mais ainta ta sendo antedida a req da solicitação de DNS - É SO ELE ACOMPANAHR A SALA 


bom dia ! Acredito que tenha algo para ser ajustado no ambiente do SIEMP.

<img width="607" height="119" alt="image" src="https://github.com/user-attachments/assets/a4491894-ba50-4bd6-a2ad-c0af2090c66a" />



REQ000147022058 - Solicitação DNS SIEMP Esteira devops

[PROJETO ADDR] Favor criar/alterar o FQDN siemp.des.caixa para atender a nova infra do siemp na esteira devops caixa, para cumprir os prazos do projeto ADDR.

Informe a solicitação*:	Inclusão
Endpoint de internet?*:	Não
Ambiente*:	On premise
Tipo de registro*:	Host (A)
Nota:	Essa opção é exclusiva para inclusão de um registro do tipo “Host A”, onde deve ser informado o nome DNS e o endereço IP para qual este será vinculado.
Nome DNS*:	siemp.des.caixa
Endereço IP*:	10.116.180.9
Unidade/Coordenação Demandante*:	Comunidade de credito comercial e agronegocio
Descrição/Observação*:	[PROJETO ADDR] Favor criar/alterar o FQDN siemp.des.caixa para atender a nova infra do siemp na esteira devops caixa, para cumprir os prazos do projeto ADDR.


Histórico de Informações de Trabalho da Ordem de Trabalho
ID da Ordem de Trabalho	 WO0000082275737
Criado em	 11/11/2026 21:58:54
Criado por	 P754719
Origem de Comunicação	 
Exibir Acesso	 Público
Notas	 Sr(a) usuário(a),

1. Realizada a inclusão do(s) registro(s) no DNS, conforme solicitado.

2. À disposição para esclarecimentos.

Atenciosamente.

CETELO8/CETEL960-CTIS

Para análise técnica:

Name:    siemp.des.caixa
Address: 10.116.180.9

Name:    siemp.des.caixa
Address: 10.116.180.9

PS C:\Users\p754719>
ID da Ordem de Trabalho	 WO0000082275737
Criado em	 11/11/2026 14:10:41
Criado por	 P655225
Origem de Comunicação	 
Exibir Acesso	 Público
Notas	 Prezado(a),

1. Informamos que sua solicitação foi recebida em nossa fila e seguirá o fluxo de atendimento.
2. Trata-se de uma atividade de complexidade baixa e será atendida o mais breve
possível.
3. Esta demanda será apresentada para deliberação na reunião de Overview?
( X ) SIM  (  ) NÃO
4. Informações futuras serão adicionadas a esta WO.

Atenciosamente,

Anderson Campelo Serpa Gama
Preposto
CTIS / CETEL / DHCP, DNS e Proxy de Serviços
ID da Ordem de Trabalho	 WO0000082275737
Criado em	 11/11/2026 13:53:01
Criado por	 Remedy Application Service
Origem de Comunicação	 E-mail
Exibir Acesso	 Interno
Notas	 Este ticket foi criado a partir do sistema de solicitação de serviço.
Impresso por P585600 em Quinta-feira, 12/11/2026 09:58:44


==========================================================
 
Bom dia, Jesse Mouta
 
Gerei mais um artefato do SICDT. Segue o link abaixo para fazer o redeploy:
 
http://binario.caixa:8081/repository/releases/br/gov/caixa/sicdt/sifec-cdt/3.24.3.004/sifec-cdt-3.24.3.004.ear
 
Fiz ajustes no Arqref e na lib do framework (br.gov.caixa.bsb.sisgd) para evitar o warning. O SICDT agora usa no próprio sifec-cdt.ear, e o EAR contém arqref-core 3.7.2.2 (antes 3.7.2) e sisgd-framework 1.0 no deploy do SICDT, e não houve warning de ConectorException. Fiz testes de download de relatórios (PDF e CSV) e funcionaram perfeitamente.
 
Segue a minha configuração para o arqref:
 
arqref-core-version:     3.7.2

arqref-services-version: 3.11.10

arqref-web-version:      3.1.0.1
 
Continuo utilizando o sifec-2.160.4.0.ear - não sei se houve novas versões disponíveis dele.
 
Acredito que não há mais pendências e essa build 004 podemos declarar como estável. 
Desde já, agradeço.


TENHO ESSESE ESCLARECIMENTOS A GFAZER..

SOBRE O DNS FOI ATENDIDNO O QUE TEMOS QUE FAZER AGORA NA ESTEIRA PARA PODER FUINCIONAR
 
