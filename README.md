conversa em sala teamns

Prezados, boa tarde.
Permanecemos com o problema no ambiente de TQS q está impedindo o avanço dos testes integrados com a Dataprev.
 
 
Claudio Constantino Monteiro
Abrimos a REQ000145872659 para o suporte multiplataformas e foi criada a seguinte pendência:      09/09/2026 14:25:56 ; (P585600)   À CAIXA  Prezados,  Concluída a análise do log encaminhado. Diagnós…
A quem devemos direcionar a REQ para prosseguimento na geração e instalação de novo certificado válido?
Patricia do Prado Albuquerque
Lionel Francisco Ribeiro Sousa
Leonardo Nacacio Ricardo Simao
 
 
O serviço para a geração de um novo certificado é esse aqui: Criptografia e Proteção de Dados - Serviços - Solicitar CSR - Certificado Digital - TE079.
Criptografia-e-Proteção-de-Dados---Serviços---Solicitar CSR - Certificado Digital - TE079.aspx
 
No entanto, desconhecemos como gerar um certificado diretamente com o Dataprev. Os que geramos são criados pelo SERPRO.
Tentei identificar a história de como esse certificado foi gerado e instalado, mas não consegui encontrar.
Alguém tem essa informação?
Creio que para gerar um certificado direto com a Dataprev, deve existir algum contato lá que tenha o processo.
 
Leonardo Nacacio Ricardo Simao
O serviço para a geração de um novo certificado é esse aqui: Criptografia e Proteção de Dados - Serviços - Solicitar CSR - Certificado Digital - TE079. 📄
Boa tarde, Leonardo! 
 
No início dos trabalhos, recebemos este documento em PDF que traz informações sobre o certificado.
 
Nele consta, na página 13, o seguinte trecho:
 
Para o processo de autenticação (handshake), a depender da arquitetura
do sistema parceiro, pode ser necessário que a Instituição Financeira
instale na sua truststore a cadeia de certificados para validação do
certificado do e-Consignado. Para obtenção do certificado de servidores da Dataprev:
▪ Na própria negociação dos protocolos (handshake SSL);
▪ Acessando os endpoints da URLs, através de um navegador, e baixando-os.
▪ Utilizando o comando s_client / OpenSSL para testar a conectividade SSL:
◦ Ex: openssl s_client -servername hapi-bancos.dataprev.gov.br -connect
hapi-bancos.dataprev.gov.br:443 | openssl x509 –text
Manual-de-Comunicacao-Anexos-dos-servicos-online-v194 2.pdf
 
Não atuo nesta área (plataforma baixa), mas recordei disto. 
 
Não sei se ajuda ou se é o que precisamos, mas compartilho para avaliação. 
 
Então, pelo que entendi, o certificado que precisamos é o do item "3.2. Certificados digitais tipo A1 - ICP Brasi".
Mas note que são os certificados emitidos pelo Sepro (ICP BRASIL), não seria o certificado emitido pela Dataprev, que nem é citado.
Isso me faz crer que houve alguma exceção e alguém gerou esse certificado por algum outro caminho, que acabou sem a devida formalização. 
 
Nos meus controles, existe o certificado "ECO.DATAPREV.DES.CAIXA.GOV.BR", que poderia ser utilizado em ambiente de NPRD e aparentemente cumpre os requisitos indicados no manual, mas estou incerto se é realmente a utilização esperada para esse certificado.
 
Jesse Mouta Pereira Batista
Boa observação! Mas acho que são dois certificados diferentes no mesmo handshake, com papéis opostos:   O CN=ECO.DATAPREV.PRD.CAIXA.GOV.BR que você citou deve ser o certificado de SERVIDOR do endpoin…
Aí, se me o colega Jesse me permite uma pequena correção, se a Caixa se conecta aos servidores do SERPRO, pelo que está aqui descrito, o CN=ECO.DATAPREV.PRD.CAIXA.GOV.BR seria utilizado como certificado de cliente na conexão MTLS para que a Caixa faça sua autenticação perante a Dataprev.
Isso então seria compatível com o uso do CN=Eco Caixa como um certificado cliente MTLS para consumo dos serviços da Dataprev. O uso de um PKCS#12 na conexão indica que potencialmente a chave privada desse certificado está de posse da Caixa, e isso indicaria o uso como cliente.
 
Se a minha hipótese estiver correta, basta instalar o certificado "ECO.DATAPREV.DES.CAIXA.GOV.BR" no lugar do IF104.p12 para que seja possível realizar a conexão.
 
Para esse fim, a requisição muda, e deve ser preenchida essa aqui: Criptografia e Proteção de Dados - Serviços - Instalar Certificado Digital Existente - TE079
Criptografia-e-Proteção-de-Dados---Serviços---Instalar Certificado Digital NPRD - TE079.aspx
 
Leonardo Nacacio Ricardo Simao
O certificado instalado em 25/08/25 foi fornecido pela Dataprev, mas eles já haviam avisado que deveria ser gerado pela Caixa, conforme abaixo:
 
"Os serviços disponibilizados pela Dataprev exigem a utilização de certificado digital A1, emitido pelos clientes.
Temos um passo a passo disponível sobre esse procedimento em: https://docs.dataprev.gov.br/docs/e-consignado/guia-completo-integracao-apis-wso2-4-1/"
 
Leonardo Nacacio Ricardo Simao
O serviço para a geração de um novo certificado é esse aqui: Criptografia e Proteção de Dados - Serviços - Solicitar CSR - Certificado Digital - TE079. 📄
Leonardo Nacacio Ricardo Simao
Esse serviço deve ser aberto pelo desenvolvimento?
 
Claudio Constantino Monteiro
Leonardo Nacacio Ricardo Simao Esse serviço deve ser aberto pelo desenvolvimento?
Esse, não, pois já temos certificado ECO para comunicação com a Dataprev.
 
Leonardo Nacacio Ricardo Simao
Para esse fim, a requisição muda, e deve ser preenchida essa aqui: Criptografia e Proteção de Dados - Serviços - Instalar Certificado Digital Existente - TE079 📄
É esse aqui
 
E sim, pode ser aberto pelo Desenvolvimento.
 
Leonardo Nacacio Ricardo Simao
Esse, não, pois já temos certificado ECO para comunicação com a Dataprev.
Leonardo Nacacio Ricardo Simao, bom dia.
o Jesse Mouta Pereira Batista já comentou que esse certificado é de PRD, e estamos falando do ambiente de TQS.
 
Leonardo Nacacio Ricardo Simao
E sim, pode ser aberto pelo Desenvolvimento.
Vamos abrir aqui pq o problema está se estendendo e precisamos usar o ambiente para testes, mas algumas informações q são solicitadas nós desconhecemos..
 
Claudio Constantino Monteiro, "ECO.DATAPREV.DES.CAIXA.GOV.BR" não é de produção.
 
"ECO.DATAPREV.PRD.CAIXA.GOV.BR" é de produção.
 
Leonardo Nacacio Ricardo Simao
Claudio Constantino Monteiro, "ECO.DATAPREV.DES.CAIXA.GOV.BR" não é de produção.
E esse certificado está válido? Se sim, não pode substituir o expirado?
 
Sim, está válido. Em tese, sim, pode substituir. Foi exatamente o que eu descrevi na minha mensagem de ontem, 15:16.
 
Leonardo Nacacio Ricardo Simao
Se a minha hipótese estiver correta, basta instalar o certificado "ECO.DATAPREV.DES.CAIXA.GOV.BR" no lugar do IF104.p12 para que seja possível realizar a conexão.
Aqui
 
Leonardo Nacacio Ricardo Simao
Aqui
Jesse Mouta Pereira Batista, poderia prosseguir com essa instalação, por favor?
 
Leonardo Nacacio Ricardo Simao
Para esse fim, a requisição muda, e deve ser preenchida essa aqui: Criptografia e Proteção de Dados - Serviços - Instalar Certificado Digital Existente - TE079 📄
.
 
Leonardo Nacacio Ricardo Simao
.
Não temos as informações do certificado pra abrir essa requisição..



conversa com claudio


Ir para conteúdo principal

Caixa Economica Federal
SharePoint
Pesquisar este site



Jesse Mouta Pereira Batista
JB

Descubra

Publicar

Compilar

OneDrive
CEPRO - PROTEÇÕES EM SEGURANÇA DIGITAL
Página InicialA Centralizadora NacionalTrilha de FormaçãoGlossário de TermosReestruturaçãoGlossário de Termos de TIGlossário de Termos de TI V2


Criptografia e Proteção de Dados - Serviços - Solicitar CSR - Certificado Digital - TE079
Solicitar CSR - Certificado Digital - TE079
Descrição
CSR - Certificado Digital - TE079 é utilizado por centralizadoras vinculadas à VITEC para registrar solicitações de criação de certificados digitais corporativos.

 

Caminho para solicitação
Acessar https://servicos.caixa;
Navegar pelo caminho a seguir na console de requisições:
Tecnologia da Informação e Comunicação
Segurança Tecnológica
Infraestrutura (HW / SW)
Solicitar CSR - Certificado Digital - TE079
Somente os campos marcados com “*” tem preenchimento obrigatório.

Nota:
Todos os campos “Nota” já vem preenchidos com orientações.
CN (Commom Name / URL)*:
Informar a URL para aplicação do certificado.
Para certificados não relacionados necessariamente a uma url, indicar o CN negociado entre as partes da comunicação.
Atenção para o preenchimento. Certificados para nomes de equipamentos ou endereços IP não podem ser gerados.

Autoridade Certificadora*:
Selecionar a opção desejada:
 
AC interna para URLs internas;
AC Internacional para URLs ou ativos a serem validados por navegadores de mercado;
 
ICP Brasil para certificados específicos a serem utilizados com parceiros nacionais.
 
Auto Assinado para casos específicos autorizados pela GECMI antecipadamente.
 
Outra para os casos que não se enquadrem acima (sob avaliação da CESET).
 
Ambiente*:
Selecionar o ambiente em que o certificado será utilizado.
Para departamentais, indicar Outros e especificar “Departamental”.

Sistema ou serviço vinculado ao certificado*:
Informar aqui o nome de um ou mais sistemas vinculados ao certificado;

Caso não haja um sistema específico vinculado, informar o serviço suportado pelo certificado.

Informe o CSR*:
Alguns certificados são emitidos pela Caixa com base em requisições criadas por outros parceiros, que hospedam sites da Caixa em ambiente próprio (não Caixa). Se for esse o caso, marcar “Não” e anexar o arquivo CSR recebido.

Informe o local de instalação*:

Indicar em quais componentes da arquitetura será o certificado instalado.

Caso não esteja listado, indicar no campo “Existe outro local de instalação?”

Previsão de Início da Janela de Instalação*:

Indicar a data referente ao período de início da janela esperada para instalação do certificado.
Previsão de Final da Janela de Instalação*:
Indicar a data referente ao período de final da janela esperada para instalação do certificado.
Informar se o certificado será instalado na Caixa*:
Indicar se o certificado será instalado em infra da Caixa (sim) ou de algum parceiro (não);
Nota sobre equipe de instalação:
Especifique a Empresa*:
Assinalar a empresa que fará a instalação do certificado, que depende do ativo envolvido.
Especifique a Organização*:
Assinalar a área/equipe que fará a instalação certificado. As opções variam de acordo com o nome da empresa que foi informado no campo anterior.
Especifique o Grupo de Suporte*:
Assinalar o grupo de suporte que fará a instalação do certificado. As opções variam de acordo com o nome da organização que foi informado no campo anterior.
Há indisponibilidade de ativos para o processo de instalação do certificado?
Ativos são os computadores onde o certificado será instalado.

Preencher se houver alguma indicação de indisponibilidade, como reciclagem de ambiente com indisponibilidade, quando da instalação do certificado.

Dados Complementares:
Destinado a observações ou informações complementares, como por exemplo, necessidades específicas do certificado que não couberam nos campos anteriores.
FAQ

Como devo preencher para obter meu certificado departamental?

Meu certificado foi gerado. Como obter uma cópia ou a senha?

Qual empresa faz a instalação de cada certificado?

Não visualizo o serviço. Qual o motivo?
Tente atualizar a página

Algo deu errado e não foi possível exibir a página.
Access is denied. (Exception from HRESULT: 0x80070005 (E_ACCESSDENIED))
ID de Correlação: ebce3ba2-b0b2-f000-1e87-897b2444a5e5
Ver biblioteca completo
Navegação

CECMI

Criptografia e Proteção de Dados

Serviços
Nenhuma visualização disponível para este link.



__________________________________________________________Página 1 de 62
 Consignado API 
Manual de comunicação – anexos 
dos serviços on-line
Versão 1.94
__________________________________________________________Página 2 de 62
Este documento foi desenvolvido pela Empresa 
de Tecnologia e Informações da Previdência 
Social – DATAPREV.
__________________________________________________________Página 3 de 62
Histórico de revisões 
Data Versão 
do 
Manual
Versão 
da API 
Descrição 
22/04/2020 1.0 Criação do documento. 
08/06/2020 1.1 • Item 2 – inclusão dos tipos: “competência” e 
“listaContratosExcluidos” e 
“listaContratosQuitados”. Alteração do tipo 
“competência”. Detalhamento do tipo “Numérico 
NN.nn”.
• Item 3.3 - Domínio I – inclusão dos motivos de 
exclusão de empréstimos: “outros”, “exclusão por 
fraude” 
• Item 3.3 – inclusão dos domínios K, L, M e N 
• Item 3.3 – detalhamento e inclusão de novos 
retornos no domínio A 
• Item 3.3 – Alteração do domínio M (renegociação) 
• Item 3.1 – Inclusão dos endereços do gateway de 
API, para a portabilidade, o refinanciamento e a 
renegociação
29/06/2020 1.2 • Item 3.3 – Domínio A – Inclusão dos erros: H3, IR, 
OL, OU, OV. Alteração dos erros: AM, AN, CI, CJ, 
HN, HP, HX, HY, IA, IB, IE, OF, ON, OP, PA, PC, PF, 
PI PL, RB, HP, PA, IE, HQ. 
• Item 3.3 - 
• Domínio I – inclusão do motivo de exclusão de 
empréstimos: “cancelamento fora do prazo de 
reversão do refinanciamento” 
• Domínio O - Inclusão dos retornos http das 
solicitações 
• Item 2 – Alteração do tipo: Lista de Contratos 
Quitados. Detalhamento dos tipos: Lista contratos 
excluídos e lista erros dos contratos. Inclusão do 
campo Lista de contratos reativados 
• Geral – alteração de renegociação para alteração 
de empréstimo. 
• Item 3.5 – Inclusão da matriz de operações x 
retornos 
10/07/2020 1.3 • Item 3.6 – Inclusão da Matriz de Campos API x 
Campo CNAB. 
• Item 3.7 – Inclusão da Matriz de Retornos CNAB x 
API 
29/07/2020 1.4 • Item 2 – Alteração da Lista de erros dos contratos
• Item 3.2 – Detalhamento dos exemplos de 
certificados
• Item 3.3 – Domínio A – Detalhamento dos erros: 
AP, BL, BM, IE, RA, SF, SR
17/08/2020 1.5 • Item 3.4 – Foi retirada da regra de inegibilidade o 
item de benefício bloqueado 
• Item 3.3 – Domínio A – Detalhamento dos erros: 
H3, CJ, OF, AP
26/08/2020 1.6 • Item 3.1 – correção do endpoint de br-consignado 
para e-consignado 
__________________________________________________________Página 4 de 62
• Item 3.3 – Domínio A – Detalhamento dos erros: 
BL, CA, IE, PP, SF, PH
• Item 3.3 – Domínio A – Inclusão do erro IF
• Item 3.5 – Incluído o relacionamento - Regra PA x 
Exclusão
• Item 3.8 – Inclusão deste item que detalha a regra 
AP
11/11/2020 1.7 • Item 3.3 – Domínio A – Detalhamento dos erros: 
HW, OT, PL, RM. Inclusão dos erros: AU, AV, OK, 
CT, OJ e OX 
• Item 3.8 – Ajustes na regra AP: foi retirada a 
carência na operação de alteração de empréstimos.
• Item 3.1 - Inclusão do serviço de consulta de datas 
e competências 
• Alteração do tipo Binário para PDF/A – Base64 
03/12/2020 1.8 • Item 3.3 – Domínio A – Inclusão do erro: DK, OZ 
19/01/2021 1.9 • Item 2 – Detalhamento do tipos 
• Item 3.3 – Domínio A: 
◦ Inclusão do erro: AX 
◦ Exclusão dos erros: AR, CH, MN, RD
◦ Alteração do erro OI 
• Item 3.3 – Alteração do domínio O. Inclusão do 
domínio P, inclusão de observação no domínio H. 
Ajustes nas regras OB e OE. 
• Item 3.1 – Inclusão do endpoint de consulta de 
empréstimo. Correção do endpoint de consulta 
datas e competências. 
• Item 3.5 – Atualização da matriz. 
27/01/2021 1.10 • Item 3.5 – Atualização da matriz (regras IE e IF) 
• Item 3.3 – Domínio A - correções nas regras IE e 
IF 
10/02/2021 1.11 • Item 3.1 – Inclusão do endpoint de consulta de 
portabilidade.
• Item 3.3 – Domínio Q – inclusão
• Item 3.3 – Domínio A – regras BI, CV, CX, CY, DA
• Item 3.5 – Atualização da matriz (Consulta de 
Portabilidade)
17/02/2021 1.12 • Item 3.3 – Domínio A – alteração das regras IE, IF, 
PB, PH e PM.
• Item 3.5 – Atualização da matriz (regras IE e IF) 
17/02/2021 1.13 • Item 3.3 – Domínio A – alteração das regras IF 
03/03/2021 1.14 • Item 3.3 – Domínio A - Alteração da regra RH, 
inclusão da regra AZ
• Item 3.9 – Inclusão do item
• Item 3.5 – Atualização da matriz (regra AZ)
04/03/2021 1.15 • Item 3.3 – Domínio A - Alteração das regras AB, 
IF, ON, PH. Exclusão da regra OP 
• Item 3.5 – Atualização da matriz (exclusão da 
regra OP) 
08/03/2021 1.16 • Item 3.8 – Inclusão de exemplo da regra AP 
12/03/2021 1.17 • Item 3.3 – Domínio A – regras PP e PM (excluídas) 
__________________________________________________________Página 5 de 62
24/03/2021 1.18 • Item 3.9 e 3.10 – Inclusão do detalhamento das 
regas RH e IR. 
24/03/2021 1.19 • Item 3.1 – alteração no certificado da Autoridade 
Certificadora Raiz Brasileira 
• Item 3.8 – Exclusão da regra AU
06/04/2021 1.20 • Item 3.3 – Domínio A - Alteração CJ e PC
16/04/2021 1.21 • Item 3.3 – Domínio A - Alteração IB 
23/04/2021 1.22 • Item 3.3 – Domínio A - Alteração CJ 
04/05/2021 1.23 • Item 3.3 – Domínio A - Alteração CV
06/05/2021 1.24 • Item 2 – Alteração do tipo “lista de erros”, incluindo 
o campo dataPrevistaFimSuspensao, quando ocorre 
o erro OZ.
07/05/2021 1.25 • Item 3.3 – Domínio A - Alteração da regra RA
25/05/2021 1.26 • Item 2 – Ajuste na descrição do tipo numérico com 
casas decimais 
• Item 3.5 - Atualização da regra IB 
14/06/2021 1.27 • Item 3.3 – Domínio A, Item 3.5 e item 3.6 - 
Inclusão das regras OG e OM.
• Item 3.9 – alteração da regra e exemplo da regra 
RH 
25/06/2021 1.28 • Item 3.5 – Foram retiradas o mapeamento entras 
as regras HQ, HR e HS na exclusão de empréstimo 
consignado 
28/06/2021 1.29 • Item 3.3 – Domínio A – Detalhamento da regra OG 
01/07/2021 1.30 • Item 3.3 – Domínio A – Inclusão da regra GE
06/07/2021 1.31 • Item 3.11 – Sequência de erros
22/07/2021 1.32 12/08/21 • Item 3.3 – Domínio A – Inclusão das regras GA, GS 
e CV. Alteração das regras PF 
30/07/2021 1.33 Não se 
aplica 
• Item 3.6 – Detalhamento dos campos 26.3 a 28.3 
30/07/2021 1.34 09/09/21 • Item 3.3 – Domínio A e 3.5 – Inclusão das regras 
OH 
• Item 3.3 – Domínio A – alteração da regra OB 
30/07/2021 1.35 23/09/21 • Item 3.3 – Domínio A e 3.5 – Inclusão das regras 
PG, PK, PX. Alteração da regra PH 
17/08/2021 1.36 Já 
disponibil
izada 
• Item 3.3 – Domínio A e 3.5 Detalhamento da regra 
OZ 
19/08/2021 1.37 23/08/21 • Item 3.3 – Domínio A - Alteração da regra GA
29/09/2021 1.38 07/10/21 • Item 3.3 – Domínio A - Inclusão das regras D1, D2, 
D3, D4, D5, D6, D7, P1, P2, P4, P5, P6, H10
29/09/2021 1.39 13/10/21 • Item 3.3 – Domínio A: Alteração das regras CY, GA, 
GE (Consulta empréstimos suspensos)
25/10/2021 1.40 04/11/21 • Item 3.1, Item 3.5 – Inclusão do serviço incluir 
informações do contrato 
__________________________________________________________Página 6 de 62
• Domínio A: inclusão da regra PZ 
27/10/2021 1.41 25/11/21 • Item 3.3 – Domínio A e 3.5 – alteração das regras 
PG, PK, PX, PH, PB. Inclusão das regras PU e PE
16/11/2021 1.42 16/11/21 • Item 2 – detalhamento do tipo PDF/A – Base64 
25/11/2021 1.43 25/11/21 • Item 3.3 – Domínio A e 3.5 – Inclusão da regra LE
29/11/2021 1.44 19/01/21 • Item 3.3 – Domínio A alteração da regra HZ
10/01/2021 1.45 10/01/21 • Item 3.1 – Nova versão da store de homologação e 
de produção 
11/01/2021 1.46 10/01/21 • Item 3.3 – Domínio A - Inclusão das regras: GT, 
GX, GU, GV, BP. Alteração das regras: PA, PG e PS, 
HZ e IF 
22/02/2022 1.47 08/03/22 • Item 3.3 – Domínio A - Alteração das regras IF e 
inclusão da regra P7 
28/03/2022 1.48 28/03/22 • Item 3.3 – Domínio C - As espécies 87 e 88 
passaram a ser elegível. Correção da descrição das 
espécies 88 e 89. 
29/03/22 1.49 14/04/22 • Item 3.3 – Domínio C – Exclusão da regra AY 
04/04/22 1.50 04/04/22 • Item 3.1 – Alteração dos endpoints de 
homologação e produção 
08/04/22 1.51 14/04/22 • Item 3.3 – Domínio C – Inclusão da regra AY e da 
regra D9 
14/04/22 1.52 15/05/22 • Item 3.3 – Domínio C –Alteração da regra HW 
17/06/22 1.53 17/06/22 • Item 3.3. - Domínio A – correção da descrição 
regra IE 
22/06/22 1.54 28/06/22 • Item 3.3. - Domínio A –inclusão da regra H4 e 
alteração da regra OG
30/06/22 1.55 21/07/22 • Item 3.3. Domínio A e item 3.5– alteração da regra 
IF, inclusão da regra IT
21/07/22 1.56 21/07/22 • Item 3.8 – Foi retirada a explicação do cronograma 
de operações 
• Item 3.12 – Foi incluído seção sobre o cronograma 
atual das operações e a explicação do mesmo 
27/07/22 1.57 27/07/22 • Item 3.3. Domínio A – Alteração da regra OU (taxa 
anual máxima)
27/07/22 1.57 13/09/22 • Alterações devido a inclusão das modalidades 44 e 
99 e a operação de averbação de RCC 
◦ Item 3.3. Domínio A – Inclusão da regra TC e 
alteração das regras: IQ, IB, IE, OU, HR, IF, 
OH, PF, AV, OD, OC, AB, AM e AN 
◦ Item 3.3 – Domínio H, M, R 
◦ Item 3.1 
11/08/22 1.58 13/09/22 • Item 3.3 I – alteração dos motivos 4 e 5 
15/09/22 1.59 13/09/22 • Item 3.3. Domínio A – Detalhamento da regra OD e 
CI. Correção da regra BL 
__________________________________________________________Página 7 de 62
22/09/22 1.60 13/09/22 • Item 3.3 – Domínio C – Inclusão das espécies 
como espécies elegíveis: 11, 12, 18, 30, 40
05/12/22 1.61 05/12/22 • Item 3.3 – Domínio A – Detalhamento da regra AN
20/01/23 1.62 20/01/23 • Item 3.3. Domínio A – Inclusão das regras BT, T1, 
T2, T3, T4, T5, Domnínio M e N
• Item 3.5 e 3.7 – Inclusão da operação de troca de 
titularidade
27/01/23 1.63 27/01/23 • Item 3.3. Domínio A – Alteração da regra HR 
30/01/23 1.64 09/02/23 • Item 3.3. Domínio A e Item 3.10 – Alteração da 
regra IR, que passou a ser avaliada também na 
averbação de RMC e RCC 
31/01/23 1.65 09/02/23 • Item 3.3. Domínio A – Alteração da regra HR 
14/02/2023 1.66 14/02/23 • Item 3.3. Domínio A – Alteração da regra IR 
16/02/2023 1.67 16/02/23 • Item 3.10. Domínio A – Alteração dos exemplos da 
regra IR de averbação de RMC e RCC
27/03/2023 1.68 07/03/23 • Item 3.3 – Domínio C – As espécies 87 e 88 
deixaram de ser elegíveis 
• Item 3.10 – Alteração do texto para informar que a 
"Data de Extinção de Cota” está disponibilizada nas 
APIs. 
30/03/2023 1.69 11/04/23 • Item 3.1 – inclusão do endpoint de consulta 
informações do contrato 
• Item 3.3 Domínio A – inclusão das regras: AF, BK, 
NS, PV e PY 
• Item 3.3 Domínio S e T – inclusão 
31/03/2023 1.70 31/03/23
 Item 3.3 – Domínio A - Alteração da regra OU 
(taxa de juros máxima anual) 
06/04/2023 1.71 06/04/23
 Item 3.5 – A regra IR foi mapeada também às 
operações de averbação RMC e RCC 
31/03/2023 1.72 31/03/23
 Item 3.3 – Domínio A – Inclusão da regra GR 
31/04/2023 1.73 31/03/23
 Item 3.3 Domínio S – inclusão do IDRC e exclusão 
do DENATRAN 
21/06/2023 1.74 10/08/23  Item 2 – inclusão do tipo Lista de atendimentos 
 Item 3.1 – inclusão dos endpoints: incluir-taxasjuros e consultar-taxas-juros 
 Item 3.3.A – Alteração das regras OU, OV, PI e PJ 
 Item 3.3.A - inclusão das regras: GB, TI, TM, TN, 
TP, TV 
 Item 3.5 - Atualização da matriz abaixo com os 
novos retornos 
 Item 3.12 - Inclusão do Item 
__________________________________________________________Página 8 de 62
23/06/2023 1.75 10/08/23  Item 3.3.A – Alteração das regras IO, OV, TI, TM. 
Inclusão da regra TZ 
 Item 3.5 - Atualização da matriz 
03/07/2023 1.76 10/08/23  Item 3.3.A – 
o Alteração das regras OU e PI 
o Inclusão da regra AW 
 Item 3.5 – Atualização da matriz 
19/07/2023 1.77 25/08/23  Item 3.3.A – 
o Alteração das regras OB, IO, HW, 
o Inclusão da regra LR 
 Item 3.5 – Atualização da matriz 
25/07/2023 1.78  Item 3.3. - Domínio A –inclusão das regras: H4, 
H10, P10, P11, P12, P13 e P15 
04/08/2023 1.79 25/08/23  Item 3.3. - Domínio A –inclusão regra SA, alteração 
da regra OU 
08/08/2023 1.80 25/08/23  Item 3.3. - Domínio A – alteração da regra AY 
11/08/2023 1.81 -  Item 3.2 – Inclusão do endpoint 
/homologacao/massa-de-dados 
30/082023 1.82 30/08/23  Item 3.3. - Domínio A – 
o ajustes nas regras de OU e OV, para deixar 
claro que elas são usadas na portabilidade. 
Também foram atualizados os valores 
máximos das taxas. 
o Inclusão das regras D1 e D2. Exclusão das 
regras D3 e D7. 
o Ajustes na regra OB 
 Item 3.3– Inclusão do tipo de arquivo enviado 
 Item 2 – inclusão do tipo: lista de arquivos enviado
31/08/2023 1.83 05/09/23  Item 3.3 – Domínio A - Alteração na regra IO, para 
permitir valor zero, no refinanciamento e na 
averbação de empréstimos. Detalhamento da regra 
NA 
18/09/2023 1.84 18/09/23  Item 3.3 – Domínio C – As espécies 87 e 88 
passaram a ser elegíveis 
24/10/2023 1.85 -  Geral – Exclusão da regra HS. O tipo de 
consignação retenção só participará das operações 
de consulta. O tipo de consignação viaja mais foi 
excluído. 
 Item 3.3 – Domínio A - Alteração na regra AN e 
inclusão de exemplos 
07/12/2023 1.86 -  Item 3.3 – Domínio A - Alteração na regra BL e 
inclusão da regra BQ 
__________________________________________________________Página 9 de 62
19/12/2023 1.87 -  Item 3.12 – Atualização do cronograma das 
operações de 2024 
18/01/2024 1.88 -  Item 3.1 – Correção do endpoint da operação de 
alteração de empréstimo 
06/02/2024 1.89 -  Item 2 – inclusão do tipo “Lista de contatos” 
 Item 3.2 – Inclusão do endpoints relacionados às 
solicitações de propostas dos beneficiários 
 Item 3.3 – Domínio A - Alteração na regra LE e 
inclusão das regras HA, SB, SC, SD e SE 
 Item 3.3 – Domínio V – inclusão dos tipos de 
contatos da proposta 
01/04/2024 1.90  Item 3.3 – Domínio V – nível de exposição política. 
Domínio X – Tipo de bloqueio do benefício 
 Item 3.3 – Domínio A – inclusão das regras TO, SO 
e SN. Detalhamento da regra SB 
04/04/2024 1.91  Item 3.3 – Domínio V – alteração dos níveis de 
exposição política. 
 Item 3.3 – Domínio A – inclusão da regra ST 
23/04/2024 1.92  Item 3.1 e 3.2 - Atualização de instruções para 
emissão de certificado digital 
07/05/2024 1.93  Item 3.3 – Domínio A – inclusão das regras TQ 
08/05/2024 1.94  Item 3.3 – Domínio A: alteração das regras: CV, GR 
e Inclusão das regras: LF e PN 
__________________________________________________________Página 10 de 62
1. Introdução ................................................................................................................................ 11 
2. Legendas ................................................................................................................................... 11 
3. Anexos ........................................................................................................................................ 13 
3.1. Autenticação e conectividade no gateway de API ................................................. 13 
3.2. Certificados digitais tipo A1 - ICP Brasil ................................................................... 14 
3.3. Domínios e erros ................................................................................................................ 15 
A. Retorno da solicitação com erro .................................................................................. 15 
B. Situações dos benefícios elegíveis e não elegíveis ............................................... 37 
C. Espécies de benefícios elegíveis e não elegíveis ................................................... 37 
D. Tipo do documento de identificação .......................................................................... 41 
E. Tipo de canal de atendimento ....................................................................................... 41 
F. Tipo de crédito ..................................................................................................................... 42 
G. Tipos de movimento ......................................................................................................... 42 
H. Classificador da modalidade .......................................................................................... 42 
I. Motivo de exclusão de empréstimo ............................................................................. 42 
J. Classificador de pensão alimentícia ............................................................................. 42 
K. Motivos de reversão do refinanciamento ................................................................. 42 
L. Tipos de registro ................................................................................................................. 43 
M. Classificador da modalidade x Operações on-line ................................................ 43 
N. Retornos de solicitação de serviço com sucesso ................................................... 44 
O. Retornos http das solicitações (erros técnicos) ..................................................... 44 
P. Classificador da situação do empréstimo .................................................................. 44 
Q. Classificador da situação da operação de portabilidade .................................... 45 
R. Classificador da modalidade no desconto de cartão ............................................ 45 
S. Base Biométrica .................................................................................................................. 45 
T. Tipo de Autenticação ......................................................................................................... 45 
U. Tipo Arquivo Enviado ....................................................................................................... 45 
V. Tipo Contatos da Proposta .............................................................................................. 46 
V. Nível de exposição política .............................................................................................. 46 
X. Tipo de bloqueio de empréstimo ................................................................................. 46 
3.4. Regras de inelegibilidade de um benefício ............................................................... 46 
3.5. Matriz de Operações x Principais Retornos (Domínios: O – Técnicos, A – 
Erros, N - Sucesso) ..................................................................................................................... 47 
3.6. Matriz de Campos API x Campo CNAB ...................................................................... 49 
3.7. Matriz de Retornos CNAB x API .................................................................................... 50 
3.8. Regra AP – detalhamento e exemplos nas operações on-line ......................... 53 
__________________________________________________________Página 11 de 62
3.9. Regra RH – detalhamento e exemplos nas operações on-line ......................... 57 
3.10. Regra IR – detalhamento e exemplos nas operações on-line ....................... 58 
3.11. Sequência de erros ......................................................................................................... 59 
3.12. Cronograma atual das operações ............................................................................. 60 
3.13. Regra PI – Cálculo do valor de referência e exemplo ....................................... 61 
1. Introdução
Este documento tem por objetivo apresentar as legendas e os anexos que são 
comuns aos serviços on-line do e-Consignado. 
2. Legendas 
Tipo Descrição 
Data ddMMyyyy – Exemplo: 21022019
DataHora ddMMyyyyhh24mmss – Exemplo: 21022019223310
Competência Formado de 6 dígitos, numérico, yyyyMM - Exemplo: 201902
Obs.: Qualquer valor informado diferente de dígitos, será considerado 
como nulo
Numérico Numéricos 
Obs.: Qualquer valor informado diferente de dígitos, será considerado 
como nulo
Numérico NN.nn NN parte inteira, nn parte decimal
Exemplo: Numérico 12.02→ é possível um número com 10 dígitos na 
parte inteira e 02 dígitos na parte decimal.
Obs.:
1. O separador de casas decimais é o ponto.
2. Qualquer valor informado diferente de dígitos, será considerado como 
nulo
Alfanumérico/Texto Alfanumérico/Texto 
Booleano Valor alfanumérico: false ou true. 
Obs.: Qualquer valor informado diferente de true (independente de 
maiúsculas e minúsculas) será considerado como false. 
PDF/A - Base64 O documento PDF/A deve ser codificado em Base64* para a transmissão 
de forma textual.
* Base64 é um método para codificação de dados para transferência na 
Internet
Obs.:
• Para validação é utilizado o padrão Vera PDF. Consultar o 
site https://verapdf.org/ para mais informações.
• É importante efetuar a validação do documento antes do envio a 
Dataprev.
Lista de Erro Um JSON contendo os campos "codigo" e "mensagem".
Obs.: quando for gerado o erro OZ, também é apresentado o 
campo dataPrevistaFimSuspensao
Exemplo:
"erros":
__________________________________________________________Página 12 de 62
[{"codigo":"FH", "mensagem":"Operação fora do horário permitido."}, 
{"codigo":"CA", "mensagem":"Código do banco inválido."}]
"erros":
[{"codigo":"OZ", 
"mensagem":"Estamos fazendo verificações no serviço. Tão logo tenham 
sido concluídas, o serviço será restabelecido.",
"dataPrevistaFimSuspensao":"28-04-2021 22:00:00"
}]
Lista de Contratos 
Quitados 
(Refinanciamento)
Um JSON contendo o "numeroContrato".
{"listaContratos":
[{"numeroContrato":"CONTRATO_ABC"},{"numeroContrato":"CONTRA
TO_DEF"}]}
Lista de Contratos 
Reativados (Reversão 
do Refinanciamento)
Um JSON contendo o "numeroContrato" e "valorParcela"
{"listaContratosReativados":
[{"numeroContrato":"CONTRATO_ABC", "valorParcela":"80"},
{"numeroContrato":"CONTRATO_DEF"", "valorParcela":"73.34"}]}
Lista de Contratos 
Excluídos (Exclusão 
por Portabilidade) 
Um JSON contendo os campos "numeroContrato","ultimaParcelaPaga: 
{"listaContratosExcluidos": 
[{"numeroContrato":"CONTRATO_ABC", "ultimaParcelaPaga":"2"}, 
{"numeroContrato":"CONTRATO_DEF"", "ultimaParcelaPaga":"2"}]} 
Obs: a "ultimaParcelaPaga" da listaContratosExcluidos, refere-se ao 
número da última parcela pago ao banco origem, sendo este um campo 
opcional, numérico com tamanho 3 
Lista de erros dos 
contratos (Exclusão 
por portabilidade e 
refinanciamento)
Um JSON contendo os campos "numeroContrato"e uma lista de erros: 
{"listaErrosContratos": 
{"numeroContrato":"CONTRATO_DEF",, "erros":[{"codigo":"HZ", 
"mensagem":"Empréstimo já encerrado"}]]} 
Ob: o campo erros é opcional, sendo retornado apenas quando o 
respectivo contrato possui erros. 
Código e Descricão Um JSON contendo os campos "codigo" e "descricao". Exemplo: 
{ "codigo": 0, "descricao": "ATIVO" }
Json Representação dos dados de retorno e solicitação 
Lista de 
atendimentos 
Um JSON contendo os campos "nome"e "descricao" das informações 
sobre o atendimento: 
 [{"nome": "Fone Fácil", "descricao": "0987654321"}, 
 {"nome": "E-mail SAC", "descricao": "testes@teste.com"}, 
 {"nome": "SAC Capitais", "descricao": "0800-0000000"}]
Lista de Arquivos 
enviados 
Um JSON contendo os campos "tipoArquivo"e "descricao" dos arquivos 
enviados de um contrato: 
[{ tipoArquivo": 2, "descricao": "Contrato"},{ tipoArquivo": 3, 
"descricao": "Documento Oficial Frente"}, { tipoArquivo": 4, 
"descricao": "Documento Oficial Verso"}, { tipoArquivo": 5, "Registro 
Biométrico Facial"}] 
Lista de contatos Um JSON contendo os campos "tipo"e "contato" dos contatos de uma 
proposta. Exemplo: 
[{ "tipo": 1, "contato": "031 3299-0000" }, { "tipo": 2, "contato": "0800-
7788" }]
__________________________________________________________Página 13 de 62
3. Anexos
3.1. Autenticação e conectividade no gateway de API
 
Para a efetiva execução das operações disponibilizadas é necessário que a 
instituição financeira faça a autenticação e conectividade no gateway de API: 
• Para o processo de autenticação (handshake) é necessário que, junto à 
requisição, seja enviado um certificado A1 em nome da instituição 
financeira (vinculado ao seu CNPJ). Do contrário, a conexão não será 
estabelecida. Ressalta-se que o certificado deve ser emitido em alguma 
das cadeias aceitas pelos servidores da Dataprev.
• A Instituição Financeira solicitará um token (com validade de 1 hora) e 
usará esse token no cabeçalho de suas requisições para fazer a 
autenticação.
• O período de expiração de um token é de 1 hora. Portanto, não é 
recomendada (e não é necessária) a obtenção de novo token a cada 
chamada.
◦ Exemplo para obtenção de token: 
curl –cert [certificadoDaInstituicao.pem:senha] -d 
"grant_type=client_credentials" -H "Content- Type: application/x-www-formurlencoded" -H "Authorization: Basic Base64(consumer-key:consumer-secret)" 
https://hapi-bancos.dataprev.gov.br/token
• O formato dos serviços é REST/JSON, padrão OpenAPI 3.0 
• O protocolo para comunicação com o gateway de API é o HTTP com 
SSL/TLS (HTTPS), sendo que os protocolos de segurança devem ser a 
partir do TLS 1.2.
• Para o processo de autenticação (handshake), a depender da arquitetura 
do sistema parceiro, pode ser necessário que a Instituição Financeira 
instale na sua truststore a cadeia de certificados para validação do 
certificado do e-Consignado. Para obtenção do certificado de servidores da 
Dataprev: 
▪ Na própria negociação dos protocolos (handshake SSL);
▪ Acessando os endpoints da URLs, através de um navegador, e baixando-os.
▪ Utilizando o comando s_client / OpenSSL para testar a conectividade SSL:
◦ Ex: openssl s_client -servername hapi-bancos.dataprev.gov.br -connect 
hapi-bancos.dataprev.gov.br:443 | openssl x509 –text
• As APIs do e-Consignado estão disponibilizadas através de nossa 
Marketplace. Essa loja fornece uma interface colaborativa contendo todas 
as informações necessárias para integração técnica com os serviços, desde 
documentação, até o processo de subscrição, autenticação e utilização 
destes. Seguem abaixo os endereços de nossas lojas: 
▪ Market Place – Homologação - https://hdevportal.dataprev.gov.br
▪ Market Place – Produção - https://devportal.dataprev.gov.br
__________________________________________________________Página 14 de 62
3.2. Certificados digitais tipo A1 - ICP Brasil
Para a segurança das informações, foi definida a utilização de autenticação com 
SSL e certificação digital. As informações para a aquisição dos certificados 
digitais encontram-se a seguir: 
1) Deve ser gerado um certificado A1 padrão da ICP-Brasil para pessoa jurídica. 
Deve constar o nome da instituição financeira, vinculado ao seu CNPJ
2) A recomendação para emissão desses certificados é que os seguintes campos 
constem na extensão Subject: 
• CN = O common name é composto pelo host+domínio internet registrado 
pela IF. 
• OU = (Organization Unit) Nome da Instituição 
• OU = nnnnnnnn (onde nnnnnnnn é o número base do CNPJ) 
• OU = YYY (Onde YYY é o código do CBC) 
• O = ICP-Brasil (campo preenchido automaticamente pela AC emissora do 
certificado) 
• C = BR (campo preenchido automaticamente pela AC emissora do 
certificado) 
Obs.: 
• Em que pese existam as recomendações acima, a única restrição de fato 
é que o certificado esteja vinculado ao CNPJ da instituição financeira. Nos 
certificados do padrão ICP Brasil pessoa jurídica, a informação do CNPJ 
deve aparecer na extensão Subject Alternative Name, no campo 
OtherName com OID=2.16.76.1.3.3, como especificado na INSTRUCAO 
NORMATIVA ITI Nº 15, DE 18 DE NOVEMBRO DE 2020.
• Seguem exemplos de preenchimento de CSRs: 
• Banco XPTZ, CBC 999: 
▪ CN = srv01.if.com.br (srv01.if.com.br deve ser substituído pelo 
host+domínio internet registrado pela IF)
▪ OU = Banco XPTZ 
▪ OU = 12345678 (12345678 deve ser substituído pelo CNPJ Raiz 
da IF) 
▪ OU = 999 
▪ O = ICP-Brasil 
▪ C = BR 
3) Poderão ser utilizados opcionalmente os campos "L" (localidade) e/ou "S" 
(estado). 
4) Fica a critério da instituição financeira a utilização de certificados específicos 
ou não para cada um dos ambientes (homologação e produção). 
__________________________________________________________Página 15 de 62
3.3. Domínios e erros 
A. Retorno da solicitação com erro
Código Descrição Onde é usado Regra 
AB Tipo de Operação 
Inválido 
manter 
empréstimos 
As modalidades possíveis para cada 
operação estão descritas no domínio M 
AD 
O documento de 
identificação enviado 
não corresponde a um 
arquivo PDF/A válido 
autorização, 
desbloqueio - 
AF 
Assinatura Digital 
Inválida. CPFs não 
identificados na 
assinatura 
manter 
empréstimos - 
AM 
Agência da Conta 
Corrente do segurado 
divergente 
manter 
empréstimos 
Na averbação, na averbação de RMC, 
averbação de RCC e no refinanciamento, 
cujo meio de pagamento é igual a contacorrente, a agência informada 
(agenciaPagadora) deve ser igual à 
agência do benefício e estar preenchida 
com um número inteiro maior que zero. 
AN Conta corrente/DV do 
favorecido inválidos 
manter 
empréstimos 
Na averbação, na averbação de RMC, 
averbação de RCC e no refinanciamento, 
cujo meio de pagamento é igual a conta 
corrente, a conta corrente 
(contaCorrente) da requisição deve ser 
informada exatamente como está 
cadastrada no benefício, ou seja, como é 
exibida na operação "Consulta dados do 
benefício" ou no "Extrato de 
empréstimos do portal MeuINSS", 
podendo conter caracteres não 
numéricos como o hífen. 
Também é possível informar este campo 
somente com dígitos suprimindo da requisição qualquer caractere não numérico.
Para um benefício com informação da 
conta corrente na base de dados: 123 5-
5:  Exemplo 1
o contaCorrente: 123 5-5 
o DVContaCorrente (não informar o campo)  Exemplo 2
o contaCorrente: 12355 
o DVContaCorrente: null (colocar sem aspas)  Exemplo 3
o contaCorrente: 12355 
o DVContaCorrente (não informar o campo)  Exemplo 4
o contaCorrente: 1235 
o DVContaCorrente: 5  Exemplo 5
o contaCorrente: 123 5- 
__________________________________________________________Página 16 de 62
o DVContaCorrente: 5
AO Nome inválido manter 
empréstimos O nome está em branco. 
AP 
Competência de início 
de desconto ou data 
de início ou fim de 
contrato inválida
manter 
empréstimos Ver item 3.8 
AS 
O(s) benefício(s) 
relacionado(s) ao CPF 
do titular não 
possui(em) 
representante legal 
autorização - 
AT 
O termo de 
autorização enviado 
não corresponde a um 
arquivo PDF/A válido. 
autorização, 
desbloqueio - 
AV 
Não é possível realizar 
a operação até que 
seja concluído o 
processamento da 
folha de pagamento 
do INSS. 
Na data de hoje está ocorrendo o 
processamento da folha de pagamento 
do INSS, tendo iniciado na data 
imediatamente seguinte à data limite 
das operações. Durante este período: 
São represados os processamentos dos 
arquivos CNAB enviados 
Não são aceitos operações on-line (API 
ou portal de operações) que façam 
manutenção nos empréstimos 
consignados. 
AW 
Não é possível alterar 
contrato com a 
situação igual à 
averbação 
programada 
manter 
empréstimos - 
AX 
O empréstimo tem 
uma alteração em 
aberto
manter 
empréstimos 
Um empréstimo que tem uma alteração 
em aberto (quando a alteração ainda 
não foi efetivada) não pode ser 
suspenso pelo banco, excluído por 
portabilidade, estar presente em um 
refinanciamento nem ser alterado.
AY Sigla do Estado do 
favorecido inválida 
manter 
empréstimos 
A sigla do estado não foi preenchida ou 
não é uma UF existente. 
AZ 
Os valores informados 
para os campos 
numeroParcelas e 
valorParcela são iguais 
aos valores atuais do 
empréstimo 
manter 
empréstimos - 
BC Requisição sem CBC 
manter 
empréstimos, 
autorização, 
desbloqueio 
O CBC da solicitação (codigoSolicitante) 
do serviço deve ser informado. 
BI Benefício inexistente 
Desbloqueio, 
consulta de 
portabilidade 
O benefício possui DV inválido ou não 
existe na base de dados 
BJ O benefício já estava 
desbloqueado desbloqueio O desbloqueio não foi aceito, pois o 
benefício estava desbloqueado 
BK 
Base Biométrica 
informada não 
cadastrada 
Obs: As bases biométricas estão 
definidas no domínio S. 
__________________________________________________________Página 17 de 62
BL Valor da parcela 
inválido 
manter 
empréstimos 
Todas as condições abaixo devem ser 
atendidas: 
• O valorLiberado – deve ser um 
menor que valor da parcela 
(valorParcela) x número de 
parcelas (numeroParcelas) 
• O valorEmprestimo – deve ser 
um número 
• O valorParcela - deve ser maior 
que zero na inclusão 
BM Identificação do 
contrato inválida 
manter 
empréstimos 
O número do contrato deve ser 
informado. 
BN Desbloqueio 
Indeferido desbloqueio O desbloqueio não foi aceito. 
BP 
<Alteração de NU ou 
Alteração de CBC> 
realizada com sucesso
Alterar CBC da IF 
proponente, 
Alterar NU na 
portabilidade 
- 
BQ Valor liberado inválido manter 
empréstimos 
O valorLiberado – deve ser um maior 
que zero e menor que o valor do 
empréstimo (valorEmprestimo). 
CA Código do banco 
inválido 
manter 
empréstimos, 
autorização, 
debloqueio 
O codigoSolicitante da requisição deve: 
• Ser igual ao CBC da instituição 
financeira que foi autenticada 
através do usuário pessoa física; 
• Possuir um convênio ativo para 
operar consignações
CD 
CPF não encontrado 
na base ou CPF de 
benefício inelegível 
autorização 
Não foi encontrado um benefício com o 
CPF pesquisado ou o benefício é 
inelegível para empréstimo consignado. 
CI Canal de atendimento 
inválido 
manter 
empréstimos, 
autorização, 
desbloqueio 
• Na autorização, no desbloqueio, 
deve ser informado um canal de 
atendimento válido. 
• Na averbação de empréstimo, 
averbação de RMC, averbação de 
RCC, averbação portabilidade e 
no refinanciamento, quando for 
informado um canal de 
atendimento, deve ser informado 
um válido
Obs: Os canais de atendimento estão 
definidos no domínio E. 
CJ 
Dados do 
correspondente ou da 
agência inválidos 
manter 
empréstimos 
Na averbação de empréstimo, averbação 
de RMC , averbação por portabilidade, e 
no refinanciamento: 
• Quando o canal de atendimento 
(canalAtendimento) não estiver 
preenchido, uma das condições 
abaixo deve ser atendidas
◦ O CNPJ da agência bancária 
(CNPJAgenciaBancaria) - deve 
__________________________________________________________Página 18 de 62
conter um valor de CNPJ 
válido e os dados do 
correspondente não devem 
estar preenchidos: 
▪ O CNPJ do correspondente 
(CNPJCorrespondente) 
▪ O CPF do correspondente 
(CPFCorrespondente) 
◦ O CNPJ da agência bancária 
(CNPJAgenciaBancaria) - não 
deve estar preenchido e os 
dados do correspondente 
devem estar preenchidos 
conforme regras abaixo:
▪ O CNPJ do correspondente 
(CNPJCorrespondente) 
- deve conter um valor de 
CNPJ válido e 
▪ O CPF do correspondente 
(CPFCorrespondente) 
- deve conter um valor de 
CPF válido.
• Quando o canal de atendimento 
(canalAtendimento) for igual a 4 
(Web Correspondente), todas as 
condições abaixo deve ser 
atendidas
◦ O CNPJ da agência bancária 
(CNPJAgenciaBancaria) - não 
deve estar preenchido e 
◦ O CNPJ do correspondente 
(CNPJCorrespondente) - deve 
conter um valor de CNPJ 
válido e 
◦ O CPF do correspondente 
(CPFCorrespondente) - deve 
conter um valor de CPF 
válido. 
• Nos demais casos, todas as 
condições abaixo devem ser 
atendidas: 
◦ O CNPJ da agência bancária 
(CNPJAgenciaBancaria) - 
deve conter um valor de CNPJ 
válido e 
__________________________________________________________Página 19 de 62
◦ O CNPJ do correspondente 
(CNPJCorrespondente) - não 
deve estar preenchido e 
◦ O CPF do correspondente 
(CPFCorrespondente) - não 
deve estar preenchido 
CR 
A requisição está sem 
o número do CPF do 
representante legal 
autorização 
A requisição precisa conter um 
representante legal, pois o(s) 
benefício(s) do CPF possui(em) 
representante legal. 
CT 
A competência de 
consulta está inválida
 
consulta datas e 
competências 
A competência de consulta deve ser um 
número maior ou igual a zero no 
formato AAAAMM 
CV Período <campo> 
inválido 
consulta de 
portabilidade, 
consulta paginada 
de solicitações 
propostas 
Consulta de Portabilidade: 
 A data de início e a data de fim 
da consulta quando estiverem 
preenchidas e com uma data 
válida no calendário e 
• A data de início da consulta deve 
ser menor ou igual à data de fim 
de consulta e
• O período de consulta dever ser 
no máximo de 20 dias
Consulta paginada de solicitações de 
propostas: 
 A data de início e a data de fim 
da consulta quando estiverem 
preenchidas, a data fim deve ser 
posterior a data de início 
CX 
O classificador da 
situação de 
portabilidade é 
inválido 
consulta de 
portabilidade 
O Classificador de situação de 
portabilidade deve um valor válido (ver 
domínio Q) 
CY 
A instituição 
Financeira origem não 
existe 
consulta de 
portabilidade, 
consulta extrato 
do benefício, 
consulta 
empréstimos 
suspenso 
- 
D1 
Dados do benefício 
estão incompletos, 
inconsistentes ou 
nulos: Valor Base 
Margem. Entrar em 
contato com a 
DATAPREV
Manter 
empréstimos 
- 
D2 
Dados do benefício 
estão incompletos, 
inconsistentes ou 
nulos: Valor Margem 
Disponível na 
Competência Atual. 
Entrar em contato 
com a DATAPREV
Manter 
empréstimos 
- 
D4 Dados do benefício 
estão incompletos, 
Manter 
empréstimos 
- 
__________________________________________________________Página 20 de 62
inconsistentes ou 
nulos: Valor Margem 
Disponível Cartão. 
Entrar em contato 
com a DATAPREV
D5 
Dados do benefício 
estão incompletos, 
inconsistentes ou 
nulos: Agência 
Bancária. Entrar em 
contato com a 
DATAPREV
Manter 
empréstimos 
- 
D6 
Dados do benefício 
estão incompletos, 
inconsistentes ou 
nulos: Conta 
Corrente. Entrar em 
contato com a 
DATAPREV
Manter 
empréstimos 
- 
D9 
Dados do benefício 
estão incompletos, 
inconsistentes ou 
nulos: Sigla da UF. 
Entrar em contato 
com a DATAPREV
Manter 
empréstimos 
- 
DA 
A data e hora da 
autorização digital do 
beneficiário é uma 
data inválida. Utilize o 
formato 
DdMMyyyyhh24mmss 
autorização, 
desbloqueio 
Na Autorização de consulta dados dos 
benefícios sem termo de autorização e 
no desbloqueio sem termo de 
autorização, a data e hora da 
autorização digital do beneficiário deve 
ser: 
• uma data válida no formato 
DdMMyyyyhh24mmss. 
• Uma data menor ou igual à data 
atual (DDMMYYYY) 
DH 
A data hora de criação 
do termo é uma data 
inválida ou uma data 
futura 
autorização, 
desbloqueio 
A data hora de criação do termo deve 
ser uma data válida menor ou igual a 
data atual, no formato 
ddMMyyyyhh24mmss, quando for 
informada. 
DI Tipo de documento 
inválido 
autorização, 
desbloqueio 
Os tipos de documento estão definidos 
no domínio D. 
DJ 
A quantidade de 
solicitações na 
inclusão de desconto 
de cartão ou na 
exclusão de desconto 
de cartão está 
inválida! 
manter 
empréstimos 
Na inclusão de desconto de cartão e na 
exclusão de desconto de cartão, a 
quantidade de solicitações deve ser: 
• Maior ou igual a 1 e 
• Menor ou igual à quantidade 
máxima definida no manual 
DK 
Não é possível mais de 
um contrato de 
desconto cartão para 
um mesmo beneficio 
manter 
empréstimos - 
DR 
Não foi encontrado na 
base o CPF com o CPF 
do representante legal 
cuja data fim do 
representante legal é 
autorização - 
__________________________________________________________Página 21 de 62
maior ou igual à data 
atual 
EP Erro no 
processamento. 
Todos 
Erro no processamento (Erro no 
processamento da transação. Pode ser 
um problema sistêmico ou problema em 
algum servidor (nó) dos balanceamentos 
dos ambientes do sistema). 
EX 
Token de autorização 
expirado autorização 
A data de validade do token de 
autorização de consulta deve ser maior 
ou igual que a data atual. 
FH 
Operação fora do 
horário permitido. 
manter 
empréstimos, 
autorização, 
desbloqueio 
Operação fora do horário permitido 
(Cada operação tem seu horário de 
funcionamento, sendo este o mesmo 
para todas IF´s. IF deverá verificar na 
documentação do sistema o horário da 
operação). 
GA 
Na consulta de 
portabilidade 
• O(s) campo(s) 
obrigatório(s) 
não 
foram informad
os 
Nas demais 
operações: 
• O(s) campo(s) 
obrigatório(s) 
não 
informados: 
<campo1, 
campo2> 
Consulta de 
portabilidade, 
Consulta de 
empréstimos 
suspensos , 
Incluir 
informações do 
contrato, 
Outras consultas 
e operações 
Na consulta de portabilidade 
• Além do codigoProponente 
é necessário informar pelo menos 
um dos campos abaixo: 
• numeroBeneficio 
• numerioUnico 
• numeroCPFTitular 
• Período da operação 
(dataInicioOperacao e da
taFimOperacao) 
Na consulta de empréstimos suspensos 
• Todos os campos obrigatórios da 
requisição devem ser informados 
• codigoSolicitante 
• classificadorSituacaoSuspe
nsao 
• dataInicialSuspensao 
• dataFinalSuspensao 
Nas demais operações 
• Todos os campos obrigatórios da 
requisição devem ser informados
GB 
O(s) campo(s) não 
foram formatados 
corretamente: 
<campo1, campo2> 
Todos - 
GE 
Na Consulta de 
Portabilidade, na Cons
ulta Extrato do 
Benefício, na Consulta 
Consulta de 
portabilidade, 
Consulta extrato 
do benefício, 
Consulta 
empréstimos 
suspensos 
- 
__________________________________________________________Página 22 de 62
empréstimos 
suspensos 
• Não foram 
localizados 
registros 
Nas demais operações
• <campo1, 
campo2, 
campo 3> não 
existe(m) 
Manter 
Empréstimos 
GR 
O período está 
inválido: <nome do 
período> 
Ou 
As datas início e fim 
de pesquisa devem 
ser preenchidas para 
consulta por período 
Consultas 
Consulta paginada de solicitações de 
propostas  Quando um dos campos 
dataHoraInicio ou a dataHoraFim 
estiver preenchido, os dois 
campos devem estar preenchidos
Nas demais consultas as condições 
abaixo devem ser atendidas: 
 Ambos os campos do período 
(início e fim) devem estar 
preenchidos com uma data válida 
do calendário 
 O campo de fim do período deve 
ser maior que o campo de início 
do período 
 O campo de fim do período deve 
ser menor ou igual à data atual. 
GS 
Não existe registro de 
portabilidade com o 
número único 
informado. 
Consulta de 
portabilidade - 
GT 
O NU foi encontrado 
na base para uma 
portabilidade, mas 
para uma IF origem 
diferente 
Alterar o CBC da 
IF proponente na 
portabilidade 
GU 
O NU foi encontrado 
na base para uma 
portabilidade e a IF 
proponente é igual a 
IF sendo informada 
Alterar o CBC da 
IF proponente na 
portabilidade 
GV 
O NU foi encontrado 
na base para uma 
portabilidade, mas já 
foi realizada a 
averbação por 
portabilidade 
 Alterar CBC da IF 
proponente, 
Alterar NU na 
portabilidade 
GX O NU novo já 
encontrado na base 
Alterar NU na 
portabilidade 
H3 
 É possível que tenha 
ocorrido uma 
mudança emergencial 
de sistema, por 
motivo legal ou outro, 
ou mesma alguma 
manter 
empréstimos 
- 
__________________________________________________________Página 23 de 62
falha de sistema. 
Entrar em contato 
com a DATAPREV. 
H4 
Falha de sistema de 
arquivos. Entrar em 
contato com a 
DATAPREV
Geral • - 
H10 
Dados de Serviços 
Suspensos estão 
incompletos, 
inconsistentes ou nulos
Geral •
HA 
 Quantidade excedida: 
Solicitação já atingiu o 
máximo de propostas 
ativas para esta 
Instituição Financeira 
Propostas •
HM Mutuário não 
identificado 
manter 
empréstimos 
• O DV do número do benefício 
deve ser correto e 
• O benefício deve estar presente 
na base de empréstimo 
consignado 
HN Tipo de benefício não 
permite empréstimo 
manter 
empréstimos 
• Na inclusão diferente do desconto 
de cartão, no refinanciamento e 
na exclusão por portabilidade, 
todas as condições abaixo devem 
ser atendidas: 
◦ O benefício deve ser de uma 
espécie elegível para 
empréstimo (Domínio C) e 
◦ O benefício não é pago pelos 
correios, empresa conveniada 
ou por acordo internacional e 
◦ O benefício está 
desbloqueado. 
• Na inclusão de desconto de 
cartão e na averbação por 
portabilidade: 
◦ O benefício deve ser de uma 
espécie elegível para 
empréstimo (Domínio C).
HP Benefício recebido por 
procurador 
manter 
empréstimos 
Na averbação (diferente de desconto de 
cartão), no refinanciamento, na 
alteração de empréstimo, na exclusão 
portabilidade e na averbação por 
portabilidade, o benefício 
correspondente ao número do benefício 
da requisição não pode ter procurador. 
HQ Benefício é do tipo PA manter 
empréstimos 
Na inclusão/averbação, na exclusão por 
portabilidade, na averbação por 
portabilidade, no refinanciamento e na 
alteração de empréstimo, o benefício 
__________________________________________________________Página 24 de 62
informado é de uma espécie (pensão 
alimentícia) que não permite a 
consignação de empréstimo bancário. 
HR 
Quantidade de 
contratos permitida 
excedida 
manter 
empréstimos 
A quantidade de contratos depende da 
consignação e do tipo de movimento. 
Para empréstimo consignado é permitido 
a inclusão de até 13 contratos para o 
mesmo benefício, independente da 
Instituição Financeira, desde que haja 
margem disponível. 
Para a RMC, o limite é de um único 
contrato. Para a RCC o limite é de um 
único contrato. 
Para Desconto de Cartão, o limite é de 
um único contrato por competência. 
HT 
Início do desconto 
informado já 
ultrapassado 
manter 
empréstimos 
A competência de início do desconto (ou 
competência do vencimento) deve ser 
maior ou igual à competência atual, na 
averbação (inclusão), averbação por 
portabilidade, no refinanciamento e na 
alteração de empréstimo. 
HV Quantidade de 
parcelas inválida 
manter 
empréstimos 
O Número de parcelas (numeroParcelas) 
deve ser menor ou igual a: 
• 84, na averbação (inclusão) e na 
averbação por portabilidade e 
refinanciamento de empréstimo 
consignado 
HW 
Quando é necessário 
retornar o Valor de 
reserva do cartão de 
crédito: 
• O valor do 
desconto de 
cartão < Valor 
da parcela> é 
maior que o 
valor de 
reserva de 
cartão de 
crédito <Valor 
de reserva do 
cartão de 
RMC ou RCC>
Nos demais casos: 
• Margem 
consignável 
excedida 
manter 
empréstimos 
O valor de parcela (mensal) informado, 
se consignado no momento: 
• Faria exceder os limites legais da 
margem disponível empréstimo 
ou margem disponível RMC ou 
margem disponível RCC ou 
• Faria exceder o valor de reserva 
de RMC ou 
• Faria exceder o valor de reserva 
de RCC ou 
• Faria exceder a soma das margens cartão (disponível RMC e 
disponível RCC) 
• Faria exceder o valor máximo de 
comprometimento permitido para 
o benefício. 
Obs.: o valor máximo de comprometimento permitido para um benefício é 
dependente da espécie de benefício: 
• Espécie LOAS - 18, 87 e 88: 
máximo de comprometimento é 
de 35% do valor base (30% para 
empréstimos e 5% para cartões, 
sendo possível apenas um deles: 
RMC ou RCC) 
• Demais espécies: máximo de 
comprometimento é de 45% do 
valor base (35% para empréstimos e 10% para cartões, sendo 
5% para RMC e 5% para RCC) 
__________________________________________________________Página 25 de 62
HX Empréstimo já 
cadastrado 
manter 
empréstimos 
Na averbação (inclusão), averbação por 
portabilidade e no refinanciamento, o 
contrato informado já foi usado 
anteriormente. Mesmo que o contrato 
tenha sido excluído o seu código não 
poderá ser utilizado em um novo 
contrato. 
HY Empréstimo 
inexistente 
manter 
empréstimos 
Só é possível suspender, reativar, excluir, 
excluir por portabilidade, refinanciar e 
alterar um contrato que tenha sido 
previamente averbado.
HZ 
Não é possível fazer a 
operação com o 
empréstimo nesta 
situação 
manter 
empréstimos 
• Só é possível reativar um 
contrato que esteja suspenso 
(pelo banco). 
• Só é possível suspender um 
contrato que esteja ativo ou 
suspenso pela APS. 
• Só é possível excluir um contrato 
que não esteja excluído. 
• Só é possível excluir por 
portabilidade ou refinanciar um 
contrato que esteja ativo 
• Só é possível refinanciar ou 
alterar um contrato que esteja 
ativo (ou averbação programada) 
ou suspenso INSS (devido a 
supermargem). 
IA Nome divergente manter 
empréstimos 
• Nas operações batch: 
◦ O primeiro nome difere do 
primeiro nome do titular do 
benefício na base da 
Previdência ou 
• Nas demais operações: 
◦ O primeiro nome difere do 
primeiro nome:
▪ Do titular do benefício na 
base da Previdência ou
▪ Do representante legal, 
quando este possui um 
representante legal ativo.
IB 
Benefício 
suspenso/cessado pela 
APS ou pelo Sisob 
manter 
empréstimos 
 A averbação de empréstimo, averbação 
de RMC, averbação de RCC, inclusão de 
desconto de cartão (RMC ou RCC), 
exclusão por portabilidade, averbação 
por portabilidade, refinanciamento, 
alteração de empréstimo, na reativação 
e na reversão do refinanciamento não 
podem ser realizadas em um benefício 
que está suspenso/cessado pelo INSS ou 
Sisobi. 
IE 
Benefício bloqueado para 
empréstimo pelo 
beneficiário 
manter 
empréstimos 
Na averbação de empréstimo, averbação 
de RMC, , averbação de RCC, averbação 
por portabilidade (que não tem exclusão 
por portabilidade correspondente) e 
refinanciamento, o benefício não pode 
ter sido bloqueado pelo beneficiário 
__________________________________________________________Página 26 de 62
IF 
Beneficio bloqueado 
na concessão 
manter 
empréstimos 
Na averbação de empréstimo, averbação 
de RMC, averbação de RCC, averbação 
por portabilidade (que não tem exclusão 
por portabilidade correspondente), 
refinanciamento, o benefício não pode 
estar bloqueado na concessão. 
IN Serviço/Sistema 
Indisponível. todos 
Serviço/Sistema Indisponível (Camada 
de aplicação EJB indisponível ou camada 
de banco de dados indisponível). 
IO O valor do IOF é 
Inválido 
manter 
empréstimos 
O valor do IOF (valorIOF) deve ser um 
número, maior ou igual a zero, na 
inclusão de desconto de cartão, na 
inclusão de empréstimo e no 
refinanciamento. 
IQ Contrato já suspenso 
pelo banco 
manter 
empréstimos 
Só é possível suspender um empréstimo 
consignado, uma RMC ou uma RCC que 
esteja com situação ativo ou suspenso 
(pelo INSS).
IR 
Prazo da operação é 
maior que a data de 
extinção de cota do 
benefício 
manter 
empréstimos 
Na averbação de empréstimo 
consignado, na averbação por 
portabilidade, no refinanciamento e na 
alteração de empréstimo:
• A competência final de desconto 
deve ser menor ou igual à 
competência da data de extinção 
da cota do benefício, nos 
benefícios de pensão por morte 
Ver item 3.10. 
 
Na averbação de RMC ou RCC: 
• A Competência atual somada ao 
limite atual de parcelas (84) - 1, 
deve ser menor ou igual ao 
mês/ano da data de extinção da 
cota do benefício, de forma a 
compreender, no mínimo, 84 
meses entre a competência em 
vigor (inclusive) e o mês/ano da 
Data de extinção de cota.
Ver exemplos no item 3.10 
IT 
Benefício bloqueado 
por TBM 
manter 
empréstimos 
Na averbação de empréstimo, averbação 
de RMC, averbação por portabilidade 
(que não tem exclusão por portabilidade 
correspondente), refinanciamento, o 
benefício não pode estar bloqueado por 
TBM 
__________________________________________________________Página 27 de 62
IV Token de autorização 
de consulta inválido autorização 
O token de autorização deve estar 
preenchido e ter sido previamente 
gerado para o CPF e código solicitante. 
LE 
Limite de registros 
retornados excedido 
Consulta de 
portabilidade 
Na consulta de portabilidade, foi 
excedido o limite o máximo de 
ocorrências a serem retornadas 
LF Consulta não 
encontrou registros Consultas 
LR 
Esta espécie de 
benefício só permite 
averbação de um 
cartão: ou RMC ou 
RCC 
Manter 
empréstimos 
As espécies 18, 87 e 88, só permitem 
averbação de um cartão: ou RMC ou 
RCC
ME 
o motivo de exclusão 
do empréstimo é 
inválido 
manter 
empréstimos 
Os motivos de exclusão de empréstimo 
estão definidos no domínio I. 
NB Requisição sem 
número do benefício 
manter 
empréstimos, 
autorização, 
desbloqueio 
O número do benefício deve ser 
informado. 
NC A requisição está sem 
número de contrato. 
manter 
empréstimos 
A requisição está sem número de 
contrato. 
NS 
Quando o NSU é 
informado, o tipo de 
autenticação também 
deve ser informado 
manter 
empréstimos 
Obs: Os tipos de autenticação estão 
definidos no domínio T 
OA O valor do saldo limite 
do cartão está inválido
manter 
empréstimos 
Na inclusão de Desconto de cartão de 
crédito on-line, o valor do saldo limite 
do cartão (valorSaldoLimiteCartao) deve 
estar preenchido com um número maior 
que zero. 
OB 
O valor utilizado no 
mês pelo cartão está 
inválido 
manter 
empréstimos 
Na inclusão de Desconto de cartão de 
crédito on-line, o valor utilizado no mês 
pelo cartão (valorUtilizadoMesCartao) 
deve estar preenchido com um número 
maior ou igual a zero.
OC O percentual está 
inválido 
manter 
empréstimos 
Na inclusão de RMC ou RCC, o 
percentual deve estar preenchido com 
um número maior que zero e menor ou 
igual a 5%.
OD O valor Limite de 
cartão está inválido 
manter 
empréstimos 
• Na inclusão de uma RMC , o valor 
Limite de cartão 
(valorLimiteCartao) deve estar 
preenchido, com um número 
menor ou igual ao: 1.6 x Valor da 
mensalidade reajustada. 
• Na inclusão de uma RCC , o valor 
Limite de cartão (valorLimiteRcc) 
deve estar preenchido, com um 
número menor ou igual ao: 1.6 x 
Valor da mensalidade reajustada 
(*) A Mensalidade Reajustada (MR) 
vem do cadastro de benefícios; 
(**) O valorLimiteCartao e o 
valorLimiteRcc são informativos, limites 
que o banco poderia conceder no cartão 
para o beneficiário usufruir; 
(***) INSS estipulou que 1.6 é a taxa 
considerada na multiplicação.
__________________________________________________________Página 28 de 62
OE O valor do desconto 
está inválido 
manter 
empréstimos 
Na inclusão de um desconto de cartão 
de crédito on-line, o valor do desconto 
do cartão (valorDesconto) deve estar 
preenchido com um número maior q ue 
zero 
OF O CBC da IF pagadora 
está inválido 
manter 
empréstimos 
O CBC da IF pagadora (cbcIfPagadora) 
deve ser igual ao banco pagador do 
benefício, quando: 
• O cbcIfPagadora estiver 
preenchido e 
• O meio de pagamento do 
benefício correspondente é igual 
a 02 (Conta-Corrente) 
OG 
Benefício sendo 
atualizado por outra 
operação 
manter 
empréstimos 
Nas operações abaixo, o benefício não 
pode estar sendo atualizado por outra 
operação no mesmo momento: 
• Averbação empréstimo 
consignado (empréstimo 
consignado e viaja mais),
• Averbação de RMC
• Exclusão de empréstimo 
(empréstimo consignado, viaja 
mais e RMC)
• Averbação por portabilidade, 
Exclusão por portabilidade, 
refinanciamento e alteração 
OH 
O número do contrato 
está inválido 
(caracteres não 
permitidos e/ou com 
espaço à direita) 
manter 
empréstimos 
Na averbação (RMC, RCC, empréstimo 
consignado), inclusão de desconto de 
cartão (RMC ou RCC) , na averbação de 
portabilidade e no refinanciamento, o 
número do contrato (numeroContrato) 
informado deve conter somente 
caracteres permitidos e não deve possuir 
um ou mais espaços à direita. 
Os caracteres permitido são estes: 
"!\"#$%&'()*+,-./0123456789:;<=>?@
ABCDEFGHIJKLMNOPQRSTUVWXYZ[\\]^
_`abcdefghijklmnopqrstuvwxyz{|}~ " 
OI 
É obrigatório o envio 
das informações da 
autorização digital ou 
das informações da 
autorização através do 
envio de PDF/A 
autorização, 
desbloqueio 
É obrigatório o envio das informações da 
autorização digital ou das informações 
da autorização através do envio de 
PDF/A . Seguem abaixo os campos 
obrigatórios de acordo com o tipo de 
autorização: 
• Autorização Digital: 
◦ nsuAutorizacaoDigital 
◦ dataHoraAutorizacaoDigital 
◦ canalAutorizacaoDigital 
• Autorização através do envio de 
PDF/A 
◦ tipoDocumentoIdentificacao
◦ documentoIdentificacao
◦ chaveIdentificadora
◦ termoAutorizacaoBeneficiari
◦ possuiAssinaturaRogo
◦ tituloTermo
__________________________________________________________Página 29 de 62
◦ autorTermo
◦ cidadeAssinaturaTermo
◦ dataHoraCriacaoTermo
OJ 
A requisição não está 
de acordo com o 
contrato da API 
A requisição não está de acordo com o 
contrato da API. Foi enviado um JSON 
inválido ou com algum campo com nome 
errado. Observe que há distinção entre 
letras maiúsculas e minúsculas. 
OK 
Campo(s) não 
codificado(s) em 
Base64: <documento 
e/ou termo> 
autorização, 
desbloqueio - 
OL 
A lista enviada na 
solicitação está 
inválida 
manter 
empréstimos 
Nas operações on-line de inclusão e 
exclusão de desconto de cartão, a lista 
de desconto de cartão deve estar 
preenchida e deve ser possível lê-la. 
OM 
O benefício não possui 
o valor da margem 
cadastrado 
manter 
empréstimos - 
ON Operação não 
permitida. 
manter 
empréstimos, 
autorização, 
desbloqueio 
Operação não permitida para a IF. Verificar 
com o INSS para efetuar a associação da 
operação nesta IF. 
OS 
O CPF não 
corresponde ao CPF do 
representante legal 
ativo 
manter 
empréstimos 
O CPF não corresponde ao CPF do 
representante legal ativo. 
OT 
O tamanho do(s) 
campo(s) está 
incorreto: <campo 
1>, <campo 2> 
manter 
empréstimos 
Um ou mais campos da solicitação teve 
o tamanho máximo excedido, ou o 
tamanho mínimo não foi atendido. 
Consulte o respectivo manual, para 
obter as informações sobre o tamanho 
do mesmo. 
OU O valor da taxa anual 
está inválido 
manter 
empréstimos 
Na averbação de empréstimo, no 
refinanciamento e na portabilidade, o 
valor da taxa anual (valorTaxaAnual) 
deve ser um número maior ou igual a 
Taxa mensal (valorTaxaMensal) e menor 
ou igual a taxa anual máxima 
(atualmente 25.49%). 
Na inclusão de desconto de cartão RMC 
e RCC, o valor da taxa anual 
(valorTaxaAnual) deve ser um número 
maior ou igual a Taxa mensal 
(valorTaxaMensal) e menor ou igual a 
taxa anual máxima de RMC e RCC 
respectivamente (atualmente 39.78%). 
OV 
O valor do custo 
efetivo está inválido: 
<mensal e/ou anual> 
manter 
empréstimos 
Na averbação de empréstimo, na 
portabilidade e no refinanciamento, 
o valor do custo efetivo 
anual (valorCETAnual) deve ser maior ou 
igual ao custo efetivo mensal 
(valorCETMensal), e este último deve 
ser um número maior que zero.
OX 
A data Limite das 
Operações não está 
cadastrada 
consulta datas e 
competências 
Na consulta de datas e competências, 
deve existir uma ocorrência 
correspondente à data limite das 
operações para a competenciaConsulta 
(ou competência atual, quando a 
__________________________________________________________Página 30 de 62
competenciaConsulta não for 
preenchida). 
OZ 
O serviço está 
suspenso. Motivo: 
<Motivo>.Término da 
suspensão:<data> 
manter 
empréstimos 
- 
P1 
Dados de parâmetros 
internos não 
cadastrados 
corretamente: 
Competência Atual. 
Entrar em contato 
com a DATAPREV
manter 
empréstimos 
- 
P2 
Dados de parâmetros 
internos não 
cadastrados 
corretamente: Última 
Competência 
Fechada. Entrar em 
contato com a 
DATAPREV
manter 
empréstimos 
- 
P4 
Dados de parâmetros 
internos não 
cadastrados 
corretamente: Data 
Limite da Operação. 
Entrar em contato 
com a DATAPREV
manter 
empréstimos 
- 
P5 
Dados de parâmetros 
internos não 
cadastrados 
corretamente: Data 
Limite de 
Averbação. Entrar 
em contato com a 
DATAPREV
manter 
empréstimos 
- 
P6 
Dados de parâmetros 
internos não 
cadastrados 
corretamente: 
Carência. Entrar em 
contato com a 
DATAPREV
manter 
empréstimos 
- 
P7 
Dados de parâmetros 
internos não cadastrados 
corretamente: Data de 
Implantação Margem. 
Entrar em contato com a 
DATAPREV
manter 
empréstimos 
P10 
Dados de parâmetros 
internos não cadastrados 
corretamente: Operação 
não cadastrada. Entrar 
em contato com a 
DATAPREV
Geral - 
P11 
Dados de parâmetros 
internos não cadastrados 
corretamente: Limite de 
registros para Consulta. 
Geral - 
__________________________________________________________Página 31 de 62
Entrar em contato com a 
DATAPREV
P12 
Dados de parâmetros 
internos não 
cadastrados 
corretamente: Tipos 
de Benefícios de 
Auxílio Brasil 
considerados para 
cálculo da margem. 
Entrar em contato 
com a DATAPREV 
Geral - 
P13 
Dados de parâmetros 
internos não 
cadastrados 
corretamente: Bases 
Biométricas. Entrar 
em contato com a 
DATAPREV 
Geral - 
P15 
Dados de parâmetros 
internos não 
cadastrados 
corretamente. Entrar 
em contato com a 
DATAPREV 
Geral - 
PA 
O código do 
proponente está 
inválido 
manter 
empréstimos, Alt
erar CBC da IF 
proponente na 
portabilidade 
Na exclusão por portabilidade, o código 
do proponente (codigoProponente) deve 
ser: 
• Um número maior que zero 
diferente do codigoOrigem e
• O codigoProponente deve ter um 
convênio ativo para operar os 
consignados. 
• O codigoProponente não deve ter 
sido incorporado pelo 
codigoSolicitante e 
• O codigoSolicitante não deve ter 
sido incorporado pelo 
codigoProponente 
PB 
O NU foi encontrado 
na base para um CBC 
proponente diferente 
manter 
empréstimos 
Na exclusão por portabilidade, o NU foi 
encontrado na base para um CBC 
proponente diferente 
PC 
A última parcela paga 
ao banco origem está 
inválida 
manter 
empréstimos 
Na exclusão por portabilidade, a última 
parcela paga ao banco origem, quando 
estiver preenchida deve: 
• Ser um número maior que zero e 
menor ou igual ao número 
máximo permitido de parcelas 
(84 no empréstimo consignado e 
12 no viaja mais). 
PD 
A requisição está com 
o número do CPF do 
representante legal, e 
este benefício não 
possui um 
representante legal 
ativo. 
desbloqueio 
Na autorização do desbloqueio do 
benefício, o campo 
cpfRepresentanteLegal foi informado e o 
benefício não possui um representante 
legal ativo na base do e-Consignado. 
__________________________________________________________Página 32 de 62
PE 
O NU foi encontrado 
na base para um 
benefício diferente 
 
PF 
O CPF da requisição 
não correspondente ao 
CPF do benefício 
Desbloqueio, 
online 
• Na consulta de Portabilidade: 
◦ Quando o Benefício e o CPF 
forem informados:
▪ O CPF da requisição deve 
corresponder ao CPF do 
benefício. 
• No desbloqueio 
◦ O CPF da requisição deve 
corresponder ao CPF do 
benefício.
• Na averbação de empréstimo, 
RMC e RCC, na averbação por 
portabilidade, no 
refinanciamento e na alteração 
de empréstimo: 
◦ O CPF da requisição deve 
corresponder ao CPF do 
benefício, quando o benefício 
não tem um representante 
legal ativo.
PG Código do NU inválido 
manter 
empréstimos, 
alterar o NU da 
portabilidade 
Na averbação por portabilidade e na 
exclusão por portabilidade, o 
numeroUnico informado deve ser um 
número maior que zero. 
Na operação “alterar NU 
da portabilidade”, o numeroUnico e o 
numeroUnicoNovo informados devem ser 
um número maior que zero. 
PH 
O NU foi encontrado 
na base para uma 
portabilidade, mas 
para um NB diferente 
manter 
empréstimos 
Na averbação por portabilidade, o NU foi 
encontrado na base para uma 
portabilidade, mas para um NB diferente
PI 
O valor do empréstimo 
está inválido. É 
necessário que o valor 
seja maior que o valor 
de referência <valor>.
manter 
empréstimos 
Na averbação de empréstimo e na 
averbação por portabilidade e no 
refinanciamento, o valor do empréstimo 
deve ser um número maior que o valor 
de referência para fim de validação. Ver 
exemplo em 3.13 
PJ O valor pago está 
inválido 
manter 
empréstimos 
Na averbação por portabilidade e no 
refinanciamento, o valorPago deve ser 
maior que zero. 
PK 
O NU foi encontrado 
na base para uma 
portabilidade, mas 
para um CBC 
proponente diferente 
manter 
empréstimos 
Na averbação por portabilidade, o NU foi 
encontrado na base para uma 
portabilidade, mas para um CBC 
proponente diferente. 
PL 
O empréstimo está em 
processo de 
refinanciamento 
manter 
empréstimos 
Um empréstimo está em processo de 
refinanciamento, quando o prazo de 
reversão de refinanciamento ainda não 
terminou. 
Um empréstimo que está em processo 
de refinanciamento não pode ser 
suspenso pelo banco, excluído por 
__________________________________________________________Página 33 de 62
portabilidade, estar presente em um 
novo refinanciamento nem ser alterado. 
PN Paginação inicia-se em 
1 Consultas 
PQ A lista de contratos 
excluídos está inválida
manter 
empréstimos 
Na exclusão por portabilidade, a lista de 
contratos quitados deve atender a todas 
as regras abaixo: 
• A lista deve possuir um número 
de contratos maior ou igual a um 
e menor ou igual ao número 
máximo de contratos por 
benefício e 
• Os contratos quitados devem ser 
diferentes entre si e 
• Todos os contratos excluídos 
devem estar relacionados ao 
mesmo benefício 
(numeroBeneficio) 
PS 
A instituição 
Financeira proponente 
não possui convênio 
para realizar a 
operação de 
averbação por 
portabilidade 
manter 
empréstimos, 
alterar o CBC da 
IF proponente na 
portabilidade, 
Na exclusão por portabilidade, a 
instituição Financeira proponente não 
possui convênio para realizar a operação 
de averbação por portabilidade 
PU 
O NU foi encontrado 
na base para uma 
portabilidade com 
mesmo NB e IF 
proponente, mas para 
um contrato diferente 
manter 
empréstimos 
Na averbação por portabilidade, o NU foi 
encontrado na base para uma 
portabilidade com mesmo NB e IF 
proponente, mas para um contrato 
diferente 
PV 
A imagem enviada não 
corresponde a um 
arquivo no formato 
indicado. <campo>: 
Formato identificado = 
<mimeType> 
Obs.: um erro para 
cada campo avaliado 
manter 
empréstimos - 
PX 
O NU foi encontrado 
na base para uma 
portabilidade com 
mesmo NB, IF 
proponente e contrato
manter 
empréstimos 
Na averbação por portabilidade, O NU foi 
encontrado na base para uma 
portabilidade com mesmo NB, IF 
proponente e contrato 
PY 
A imagem enviada não 
contém o tamanho 
mínimo indicado. < 
Descrição>
Onde < Descrição> 
será:
A - Quando apenas a 
regra da altura mínima não é atendida
manter 
empréstimos 
A imagem enviada deve atender as 
regras abaixo: 
 A largura (width) deve ser maior 
ou igual a 250px e 
 A altura (height) deve ser maior 
ou igual a 250px 
__________________________________________________________Página 34 de 62
< Objeto>: Mínimo: 
250 px, altura identificada = " <altura da 
imagem)
B - Quando apenas regra da largura mínima 
não é atendida
< Objeto>: Mínimo: 
250 px, largura identificada = " <largura da 
imagem)
C- Quando as regras 
da largura e da altura 
mínima não são atendidas
< objeto>: Mínimo: 
250 px, altura identificada = " <altura da 
imagem). < objeto>: 
Mínimo: 250 px, largura identificada = " 
<largura da imagem)
Obs.: um erro para 
cada campo avaliado 
PZ 
O documento enviado 
não corresponde a um 
arquivo PDF/A válido 
on-line - 
RA A lista de contratos 
quitados está inválida 
manter 
empréstimos 
No refinanciamento, a lista de contratos 
quitados deve atender a todas as regras 
abaixo: 
• A lista deve possuir um número 
de contratos maior ou igual a um 
e menor ou igual ao número 
máximo de contratos por 
benefício e 
• Os contratos quitados devem ser 
diferentes entre si e diferente do 
contrato novo (codigoSolicitante 
e numeroContrato) e 
• Todos os contratos quitados 
devem estar relacionados ao 
mesmo benefício do contrato 
novo (numeroBeneficio) 
• Todos os contratos quitados devem 
estar livres de outros erros (ex.: HZ, 
HY, PL, AX).
RB O valor do troco está 
inválido 
manter 
empréstimos 
No refinanciamento, o valor do troco 
(valorTroco), deve ser um número maior 
ou igual a zero. 
RG 
O código do motivo da 
reversão do 
refinanciamento está 
inválido 
manter 
empréstimos 
Os motivos de reversão do 
refinanciamento estão definidos no 
domínio K. 
__________________________________________________________Página 35 de 62
RH 
O período de reversão 
do refinanciamento já 
foi encerrado para o 
contrato 
manter 
empréstimos 
Ver item 3.9
RI 
Não foi encontrado na 
base o CPF com o CPF 
do representante legal
autorização, 
desbloqueio 
Na autorização e no desbloqueio, não foi 
encontrado na base o CPF com o CPF do 
representante legal. 
RL 
A requisição está sem 
o número do CPF do 
representante legal, e 
este benefício possui 
um representante 
legal ativo. 
desbloqueio 
No desbloqueio, o campo 
cpfRepresentanteLegal não foi 
informado, e o benefício possui um 
representante legal ativo. 
RM 
O contrato informado 
não foi um contrato 
criado em um 
refinanciamento 
manter 
empréstimos 
Deve ser informado na reversão do 
refinanciamento o contrato que nasceu 
na operação de refinanciamento. Não 
deve ser informado os contratos que 
foram quitados no refinanciamento. 
SA 
Lista de Canais de 
Atendimento possui 
itens com tipos 
repetidos 
Incluir Taxas - 
SB 
<Identificador da 
proposta deve ser 
informado> 
ou 
<Proposta não 
existente> 
Propostas, 
Manter 
Empréstimos 
Na inclusão de proposta, o identificador 
da proposta deve estar preenchido 
Na averbação de empréstimos, o 
número da proposta informada deve 
existir na base de dados para a 
respectiva IF 
SC 
 <Sem solicitações de 
propostas com 
parâmetros 
indicados> ou 
<Solicitação de 
Proposta não 
existente> 
Propostas - 
SD 
Identificador da 
Solicitação de 
Proposta deve ser 
informado 
Propostas - 
SE Número de Proposta 
já existente Propostas - 
SN 
Proposta já usada na 
averbação de 
empréstimos 
Manter 
empréstimos 
- A proposta só pode estar relacionada a 
um empréstimo 
SO 
A solicitação de 
proposta já possui um 
empréstimo averbado 
Propostas 
SF 
A requisição está sem 
o CPF ou o CPF 
informado está com o 
DV inválido 
autorização, 
desbloqueio, 
manter 
empréstimos 
- 
ST 
A simulação de 
empréstimo não pode 
ser realizada pois o 
benefício não cumpriu 
o prazo para 
desbloqueio 
Meu INSS - 
__________________________________________________________Página 36 de 62
TC Tipo desconto do 
cartão inválido 
Manter 
empréstimos 
O tipo de desconto do cartão deve ser 
um valor definido no domínio R. Quando 
não informado será considerado na API 
como valor default 77 - Desconto de 
cartão (RMC) 
TI 
O valor da taxa 
mensal mínima esta 
invalido: <Empréstimo 
consignado, ou RMC 
ou RCC> 
Incluir Taxas 
Todas as condições abaixo devem ser 
atendidas: 
 O valor da taxa mensal mínima 
de empréstimo consignado deve 
ser maior que zero, quando esta 
for informada ou quando o valor 
da taxa mensal máxima de 
empréstimo consignado for 
informada e 
 O valor da taxa mensal mínima 
de desconto de RMC deve ser 
maior que zero, quando esta for 
informada ou quando o valor da 
taxa mensal máxima de desconto 
de RMC for informada e 
 O valor da taxa mensal mínima 
de desconto de RCC deve ser 
maior que zero, quando esta for 
informada ou quando o valor da 
taxa mensal máxima de desconto 
de RCC for informada. 
TM 
O valor da taxa 
mensal máxima da IF 
esta 
invalido: <Emprestimo 
consignado, RMC ou 
RCC> 
Incluir Taxas 
O valor da taxa mensal máxima de empréstimo deve ser maior ou igual a taxa 
mínima e menor ou igual a taxa máxima 
parametrizada. 
As demais taxas máximas (desconto de 
cartão de RMC ou RCC), quando informadas, devem ser maiores ou iguais à 
taxa mínima e menor ou igual a taxa 
máxima parametrizada, respectivamente. 
TN 
O valor da taxa de 
juros mensal está 
invalido 
Manter 
empréstimos 
O valor da taxa mensal de juros 
informado deve ser um número menor 
ou igual à taxa mensal máxima vigente 
TO 
O valor da taxa de 
juros mensal não pode 
ser maior do que o 
informado na proposta
Manter 
empréstimos 
TP A data do primeiro 
desconto está invalida
Manter 
empréstimos 
A data do primeiro desconto deve ser 
uma data maior que a data do início do 
contrato. 
TQ 
Valor da taxa deve ser 
menor que propostas 
vigentes 
Manter 
empréstimos 
Na averbação de empréstimo em que 
não é informado uma proposta: 
 O Valor da taxa mensal deve ser 
menor ou igual ao valor das 
propostas vigentes relacionadas à 
IF e ao benefício do empréstimo 
a ser averbado 
TV 
A taxa de juros 
mensal máxima da 
respectiva modalidade 
não foi informada 
Manter 
empréstimos - 
TZ Os campos de taxas 
de pelo menos um tipo Incluir Taxas - 
__________________________________________________________Página 37 de 62
de consignação deve 
ser informado 
T1 O contrato do banco 
vendedor não existe 
Troca de 
Titularidade - 
T2 
Modalidade do 
contrato não é 
permitida para esta 
operação 
Troca de 
Titularidade 
A operação de troca de titularidade online só permite os tipos: 98 (empréstimo 
consignado) 
T3 O contrato do banco 
comprador já existe 
Troca de 
Titularidade - 
T4 
Esta operação não é 
permitida para o 
banco comprador 
Troca de 
Titularidade 
O banco comprador (destino) não existe 
ou não está habilitado para executar a 
troca de titularidade 
T5 
Esta operação deve 
ser realizada até 2º 
dia útil da 
competência atual 
Troca de 
Titularidade - 
*Onde é usado: 
• Manter empréstimos – averbação, exclusão, reativação, suspensão, desconto de cartão, 
portabilidade, refinanciamento e alteração de empréstimo consignado. 
• Autorização – autorização de consulta dados, consulta dados do benefício, consulta lista 
de benefício. 
• Desbloqueio – desbloqueio de benefício. 
• Consultas datas – consulta de datas e competências 
• Consulta de empréstimos 
• Consulta de portabilidade 
• Propostas – consultas de solicitações de propostas de empréstimo, inclusão de 
propostas de empréstimos 
• Troca de Titularidade 
• Meu INSS 
B. Situações dos benefícios elegíveis e não elegíveis
SITUAÇÃO ELEGÍVEL PARA 
EMPRÉSTIMO 
00 - ATIVO Sim 
01 - EXCLUIDO Não 
02 - CESSADO Não 
03 - SUSPENSO Não 
04 - SUSPENSO POR MARCA DE ERRO Não 
05 - CESSADO POR CESS DO ORIGEM Não 
06 - SUSPENSO P/ SUSP DO ORIGEM Não 
07 - SUSPENSO PELO CONPAG Não 
08 - CESSADO PELO SISOBI Não 
09 - ESTAT TRANSF. ORGAO ORIGEM Não 
10 - RECEBENDO MENSALID DE RECUPER 6 MESES Sim 
11 - RECEBENDO MENSALID DE RECUPER 18 MESES Sim 
12 - SUSPENSO REVISAO RUR/URB Não 
13 - SUSPENSO POR ERRO DE NOME (POVOAMENTO) Não 
14 - SUSPENSO - ORGAO PAGADOR DESCREDENCIADO Não 
15 - SUSPENSO PELA INSPETORIA Não 
16 - SUSPENSO PELA AUDITORIA Não 
17 - CESSADO PELA INSPETORIA Não 
18 - CESSADO PELA AUDITORIA Não 
__________________________________________________________Página 38 de 62
19 - RECEB MENSALID RECUP 6 MESES-INSPETORIA Sim 
20 - RECEB MENSALID RECUP 18 MESES-INSPETORIA Sim 
21 - SUSPENSO REVISAO RURAL/95 Não 
22 - CESSADO REVISAO RURAL/95 Não 
23 - SUSPENSO PELO SISOBI Não 
24 - CANCELADO PELA AUDITORIA Não 
C. Espécies de benefícios elegíveis e não elegíveis
Código Descrição Elegível para 
empréstimo 
1 PENSAO POR MORTE - TRABALHADOR RURAL Sim 
2 PENSAO POR MORTE ACIDENTARIA -
TRABALHADOR RURAL Sim 
3 PENSAO POR MORTE - EMPREGADOR RURAL Sim 
4 APOSENTADORIA POR INVALIDEZ -
TRABALHADOR RURAL Sim 
5 APOSENTADORIA POR INVALIDEZ ACIDENTARIA 
- TRABALHADOR RURAL Sim 
6 APOSENTADORIA INVALIDEZ - EMPREGADOR 
RURAL, Sim 
7 APOSENTADORIA POR VELHICE - TRABALHADOR 
RURAL, Sim 
8 APOSENTADORIA POR IDADE - EMPREGADOR 
RURAL Sim 
9 COMPLEMENTACAO POR ACIDENTE DE 
TRABALHO - TRABALHADOR RURAL Não 
10 AUXILIO DOENCA POR ACIDENTE DE TRABALHO 
- TRABALHADOR RURAL Não 
11 AMPARO PREVIDENCIARIO POR INVALIDEZ -
TRABALHADOR RURAL Sim 
12 AMPARO PREVIDENCIARIO POR IDADE 
(MAIORES DE 70 ANOS) - TRABALHADOR RURAL Sim 
13 AUXILIO DOENCA - TRABALHADOR RURAL Não 
15 AUXILIO RECLUSAO - TRABALHADOR RURAL Não 
16 AUXILIO DA UNIAO Não 
17 ACORDO INTERNACIONAL Não 
18 AUXÍLIO INCLUSÃO Sim 
19 PENSAO DE ESTUDANTE - LEI N.7004/82 Sim 
20 PENSAO POR MORTE DE EX-DIPLOMATA -
LEGISLACAO EX-IPASE Sim 
21 PENSAO POR MORTE PREVIDENCIARIA Sim 
22 PENSAO POR MORTE ESTATUTARIA Sim 
23 PENSAO POR MORTE DE EX-COMBATENTE Sim 
24 PENSAO ESPECIAL - ATO INSTITUCIONAL Sim 
25 AUXILIO-RECLUSAO Não 
26 PENSAO POR MORTE ESPECIAL - LEI 593/48 Sim 
__________________________________________________________Página 39 de 62
Código Descrição Elegível para 
empréstimo 
27 PENSAO MORTE DE SERVIDOR PUBLICO 
FEDERAL Sim 
28 PENSAO POR MORTE - REGIME GERAL (DECRETO 
N. 20465/31 Sim 
29 PENSAO POR MORTE DE EX-COMBATENTE 
MARITIMO (LEI 1756/52) Sim 
30 RENDA MENSAL VITALICIA POR INCAPACIDADE Sim 
31 AUXILIO-DOENCA PREVIDENCIARIO Não 
32 APOSENTADORIA POR INVALIDEZ 
PREVIDENCIARIA Sim 
33 APOSENTADORIA POR INVALIDEZ DE 
AERONAUTA Sim 
34 APOSENTADORIA POR INVALIDEZ DE EXCOMBATENTE MARITIMO - LEI 1756/52 Sim 
35 AUXILIO-DOENCA - EX-COMBATENTE Não 
36 AUXILIO ACIDENTE PREVIDENCIARIO Não 
37 APOSENTADORIA DE EXTRANUMERARIO DA 
CAPIN Sim 
38 APOSENTADORIA DE EXTRANUMERARIO -
FUNCIONARIOS PUBLICOS FEDERAIS Sim 
39 AUXILIO INVALIDEZ DE ESTUDANTE - LEI N. 
7004/82 Não 
40 RENDA MENSAL VITALICIA POR IDADE 
(MAIORES DE 70 ANOS) - LEI 6179/74 Sim 
41 APOSENTADORIA POR IDADE Sim 
42 APOSENTADORIA POR TEMPO DE 
CONTRIBUICAO Sim 
43 APOSENTADORIA TEMPO SERVICO - EXCOMBATENTE Sim 
44 APOSENTADORIA ESPECIAL DE AERONAUTA Sim 
45 APOSENTADORIA TEMPO SERVICO -
JORNALISTA PROFISSIONAL Sim 
46 APOSENTADORIA ESPECIAL Sim 
47 ABONO DE PERMANENCIA EM SERVICO - 25% 
(35 ANOS DE SERVICO) Não 
48 ABONO DE PERMANENCIA EM SERVICO - 20% 
(30 ANOS DE SERVICO) Não 
49 APOSENTADORIA ORDINARIA Sim 
50 AUXILIO-DOENCA - EXTINTO PLANO BASICO Não 
51 APOSENTADORIA POR INVALIDEZ - EXTINTO 
PLANO BASICO Sim 
52 APOSENTADORIA POR IDADE - EXTINTO PLANO 
BASICO Sim 
__________________________________________________________Página 40 de 62
Código Descrição Elegível para 
empréstimo 
53 AUXILIO RECLUSAO - EXTINTO PLANO BASICO Não 
54 PENSAO INDENIZATORIA A CARGO DA UNIAO Sim 
55 PENSAO POR MORTE - EXTINTO PLANO BASICO Sim 
56 PENSAO MENSAL VITALICIA - SINDROME DA 
TALIDOMIDA - LEI 7070/82 Sim 
57 APOSENTADORIA POR TEMPO DE SERVICO DE 
PROFESSORES Sim 
58 APOSENTADORIA DE ANISTIADOS - LEI N. 
6683/79 Sim 
59 PENSAO POR MORTE DE ANISTIADOS - LEI 
N.6683779 Sim 
60 BENEFICIO INDENIZATORIO A CARGO DA UNIAO Sim 
61 AUXILIO-NATALIDADE Não 
62 AUXILIO_FUNERAL Não 
63 AUXILIO FUNERAL DE TRABALHADOR RURAL Não 
64 AUXILIO-FUNERAL - EMPREGADOR RURAL Não 
65 PECULIO ESPECIAL - SERVIDOR AUTARQUICO Não 
66 PECULIO ESPECIAL - SERVIDOR AUTARQUICO Não 
67 PECULIO OBRIGATORIO EX-IPASE (DECRETO 
5128/26) Não 
68 PECULIO ESPECIAL DE APOSENTADOS E 
FILIADOS A PS COM MAIS DE 60 ANOS Não 
69 PECULIO DE ESTUDANTE - LEI 7004/82 Não 
70 RESTITUICAO DE CONTRIBUICOES PARA 
SEGURADO, SEM CARENCIA Não 
71 SALARIO FAMILIA PREVIDENCIARIO Não 
72 APOSENTADORIA TEMPO SERVICO - LEI DE 
GUERRA (1756/52) Sim 
73 SALARIO-FAMILIA A ESTATUTARIO Não 
74 COMPLEMENTO DE PENSAO A CONTA DA UNIAO Não 
75 COMPLEMENTO DE APOSENTADORIA A CONTA 
DA UNIAO Não 
76 SALARIO FAMILIA ESTATUTARIO" Não 
77 SALARIO-FAMILIA ESTATUTARIO SERVIDOR 
SINPAS Não 
78 APOSENTADORIA POR IDADE - LEI DE GUERRA 
(1756/52) Sim 
79 VANTAGENS DE SERVIDOR APOSENTADO Não 
80 SALARIO MATERNIDADE Não 
81 APOSENTADORIA COMPULSORIA - EX-SASSE Sim 
82 APOSENTADORIA TEMPO SERVICO - EX-SASSE Sim 
83 APOSENTADORIA POR INVALIDEZ - EX-SASSE Sim 
84 PENSAO POR MORTE EX-SASSE Sim 
__________________________________________________________Página 41 de 62
Código Descrição Elegível para 
empréstimo 
85 PENSAO MENSAL VITALICIA A SERINGUEIROS -
LEI 7986/89 Não 
86 PENSAO MENSAL VITALICIA A DEPENDENTES DE 
SERINGUEIROS - LEI 7986/89 Não 
87 BENEFÍCIO DE PRESTAÇÃO CONTINUADA A 
PESSOA COM DEFICIÊNCIA Sim 
88 BENEFÍCIO DE PRESTAÇÃO CONTINUADA A 
PESSOA IDOSA Sim 
89 PENSAO ESPECIAL VITIMAS HEMODIALISE -
CARUARU Sim 
90 SIMPLES ASSISTENCIA MEDICA PARA ACIDENTE 
DE TRABALHO Não 
91 AUXILIO-DOENCA POR ACIDENTE DE TRABALHO Não 
92 APOSENTADORIA INVALIDEZ - ACIDENTE DO 
TRABALHO Sim 
93 PENSAO POR MORTE POR ACIDENTE DE 
TRABALHO Sim 
94 AUXILIO-ACIDENTE - ACIDENTE DO TRABALHO Não 
95 AUXILIO-SUPLEMENTAR - ACIDENTE DO 
TRABALHO Não 
96 PENSAO ESPECIAL HANSENIASE LEI 11520/07 Sim 
97 PECULIO POR MORTE - ACIDENTE DO TRABALHO Não 
98 AUX ASSIST - TRABALHADOR PORTUÁRIO 
AVULSO Não 
99 AFASTAMENTO ATE 15 DIAS POR ACIDENTE DE 
TRABALHO Não 
D. Tipo do documento de identificação
Código Documento
01 Carteira de Marítimo
02 Certidão de Reservista
03 CNH
04 CTPS
05 Passaporte
06 RG
07 Carteira de Identificação Profissional
08 Registro Administrativo de Nascimento do Indígena (RANI) 
09 Carteira Nacional de Habilitação Eletrônica (CNH-e)
10 Documento Nacional de Identidade (DNI) 
11 Documento Provisório de Registro Nacional Migratório (DPRNM) 
__________________________________________________________Página 42 de 62
Código Documento
12 Carteira ou Cédula de Identificação Militar (CIM) 
13 Registro Nacional Estrangeiro ou Carteira/Cédula de Identidade de 
Estrangeiro (RNE ou CIE) 
E. Tipo de canal de atendimento
Código Descrição 
1 ATM (TAA) 
2 Agência 
3 Web cliente 
4 Web correspondente 
5 Mobile 
F. Tipo de crédito
Código Descrição 
1 Cartão magnético
2 Conta corrente 
G. Tipos de movimento
Código Descrição 
0 Inclusão 
2 Suspensão 
4 Reativação 
9 Exclusão 
H. Classificador da modalidade 
Código Descrição 
44 RCC 
75 Retenção 
76 RMC 
77 Desconto de cartão (RMC) 
98 Empréstimo 
99 Desconto de cartão (RCC) 
Obs.: no serviço de refinanciamento só é possível a utilização dos classificadores 75 e 
98. No serviço averbação de empréstimo consignado, só é possível a utilização dos 
classificadores 71, 75 e 98.
I. Motivo de exclusão de empréstimo
Código Descrição 
1 
Desistência do empréstimo (prazo menor que 15 dias corridos da 
data de assinatura do contrato) 
2 Falecimento 
3 Liquidação antecipada 
__________________________________________________________Página 43 de 62
4 Cancelamento do Cartão a pedido do cliente (RMC ou RCC) 
5 Cancelamento do Cartão a pedido do Banco (RMC ou RCC) 
7 Ação judicial 
8 Exclusão por fraude 
9 Outros 
10 Cancelamento fora do prazo de reversão do refinanciamento 
J. Classificador de pensão alimentícia 
Código Descrição 
0 Sem pensão alimentícia 
1 É pagador de pensão alimentícia 
3 É uma pensão alimentícia 
K. Motivos de reversão do refinanciamento 
Código Descrição 
1 Desistência 
2 Óbito 
3 Fraude 
L. Tipos de registro 
Código Descrição 
0 Header 
1 Lote do Header 
3 Detalhe 
5 Trailer do Lote 
9 Trailer do Arquivo 
M. Classificador da modalidade x Operações on-line 
Operações 44 - RCC 76 - RMC 
77 -
Desconto de 
Cartão 
(RMC) 
98 - 
Empréstimo 
consignado
99 -
Desconto de 
Cartão 
(RCC) 
Averbação 
de 
empréstimo 
consignado X
Averbação 
de RMC X
Averbação 
por 
portabilidade X
Exclusão de 
desconto de 
cartão online X X
Exclusão de 
empréstimo 
consignado X X X
Exclusão por 
portabilidade X
__________________________________________________________Página 44 de 62
Inclusão de 
desconto de 
cartão X X
Reativação 
de 
empréstimo 
consignado X X X
Refinanciame
nto X 
Alteração de 
empréstimo X 
Reversão do 
Refinanciame
nto X
Suspensão 
de 
empréstimo 
consignado X X X 
Incluir 
informações 
do contrato X X X
Averbação 
de RCC X
Troca de 
Titularidade X 
N. Retornos de solicitação de serviço com sucesso 
Código Descrição Onde é usado 
BD 
Inclusão efetuada com 
sucesso 
Na averbação de empréstimo, averbação de 
RMC, inclusão de desconto de cartão, 
averbação por portabilidade, 
refinanciamento, reversão de 
refinanciamento e alteração de empréstimo.
BF 
Exclusão (ou baixa) 
efetuada com sucesso 
Na exclusão, exclusão de desconto de cartão 
e na exclusão por portabilidade 
BR 
Reativação efetuada 
com sucesso Na reativação 
BS 
Suspensão efetuada 
com sucesso Na suspensão 
BT 
Troca realizada com 
sucesso Na troca de titularidade 
O. Retornos http das solicitações (erros técnicos) 
Código Descrição 
1XX 
Informativo. O pedido de acesso a uma página foi aceito e o 
desenvolvimento do processo continua em andamento.
__________________________________________________________Página 45 de 62
2XX 
Confirmação. Uma ação, como o pedido de acesso a uma página, foi 
entendida ou terminada. Os retornos de sucesso estão definidos no 
domínio N.
3XX 
Redirecionamento. Indica que uma ação extra, que precisa ser 
executada para que o pedido de acesso possa ser concluído.
4XX 
Erro no Cliente. A solicitação do cliente para acessar uma página na 
internet pelo servidor não pode ser realizada. Dentro destes retornos 
estão os erros de negócios (412), que estão definidos no domínio A.
5XX 
Erro no Servidor. O servidor que contém os dados não foi capaz de 
atender ao pedido de acesso a uma página, causando uma falha 
momentânea. Dentro destes retornos está o erro OZ (503) que está 
definidos no domínio A
P. Classificador da situação do empréstimo 
Código Descrição 
0 Ativo 
2 Excluído 
3 Encerrado 
5 Programado para iniciar na próxima competência 
6 Programado para excluir na próxima competência 
7 Contrato suspenso por ACP via APS 
8 Contrato suspenso por ação judicial via banco 
14 Suspenso pelo banco e pela APS 
Q. Classificador da situação da operação de portabilidade
Código Descrição 
0 Aberta 
1 Encerrada 
R. Classificador da modalidade no desconto de cartão
Código Descrição 
77 Desconto de cartão (RMC) 
99 Desconto de cartão (RCC) 
S. Base Biométrica
Descrição 
SERPRO 
TSE 
IDRC 
__________________________________________________________Página 46 de 62
T. Tipo de Autenticação
Código Descrição 
01 Dispositivos móveis via APP 
02 Centrais de atendimento (Call center) 
03 Internet Banking 
04 Correspondentes 
05 Agências ou rede conveniada 
06 ATM 
U. Tipo Arquivo Enviado
Código Descrição 
01 
Documento comprobatório (para contratos a partir de 17/04/2023 
esse tipo não existe mais) 
02 Contrato 
03 Documento Oficial Frente 
04 Documento Oficial Verso 
05 Registro Biométrico Facial 
V. Tipo Contatos da Proposta
Código Descrição 
0 URL 
1 Whatsapp 
2 Telefone 
3 E-mail 
4 Outros 
V. Nível de exposição política
Código Descrição 
0 Pessoa não exposta politicamente 
1 Pessoa exposta politicamente - Nível 1 
2 Pessoa exposta politicamente - Nível 2 
X. Tipo de bloqueio de empréstimo
Código Descrição 
0 Sem bloqueio 
1 Bloqueado pelo segurado 
__________________________________________________________Página 47 de 62
2 Bloqueado por TBM 
3 Bloqueado na concessão 
3.4. Regras de inelegibilidade de um benefício
Os benefícios são considerados inelegíveis quando atendem a uma das condições 
abaixo:
a) Pagos a título de pensão alimentícia (PA) (ver domínio J)(retorno 
HQ); 
b) Assistenciais, conforme a legislação da Previdência (retorno HN); 
c) Recebidos por procurador (retorno HP); 
d) Que estejam suspensos ou cessados por qualquer razão (ver domínio 
B) (retorno IB); 
e) Quando pagos nos Correios, empresa conveniada: por acordo 
internacional (retorno HN);
f) Não possui uma espécie elegível para empréstimo (ver domínio C) 
(retorno HN);
3.5. Matriz de Operações x Principais Retornos (Domínios: O – 
Técnicos, A – Erros, N - Sucesso) 
Códig
o 
Averbaç
ão de 
Emprésti
mo 
Aver
baçã
o de 
RM
C 
Susp
ensã
o 
Reat
ivaçã
o 
Excl
usão
Inclu
são 
de 
desc
onto 
de 
cartã
o 
Excl
usão 
de 
Desc
onto 
de 
cartã
o 
Excl
usão 
por 
port
abili
dade
Aver
baçã
o por 
port
abili
dade
Refi
nanc
iame
nto 
Reve
rsão 
do 
Refi
nanc
iame
nto 
Alter
ação 
de 
emp
résti
mo 
Cons
ulta 
emp
résti
mos
Cons
ulta 
Port
abili
dade
Inclu
ir 
Infor
maç
ões 
do 
cont
rato
Aver
baçã
o de 
RCC
Troc
a 
1XX X X X X X X X X X X X X X X X
2XX X X X X X X X X X X X X X X X
3XX X X X X X X X X X X X X X X X
4XX X X X X X X X X X X X X X X X
5XX X X X X X X X X X X X X X X X
AB X X X X X X X X X X X X X X X
AM X X X X
AN X X X X
AO X X X X X X
AP X X X X X X X X X X X
AU X
AV X X X X X X X X X X X X X
AW X
AX X X X X
AY X X X X X
AZ X
BI X
BC X X X X X X X X X X X X X X X X X
BD X X X X X X X X
BF X X X
BL X X X X
__________________________________________________________Página 48 de 62
Códig
o 
Averbaç
ão de 
Emprésti
mo 
Aver
baçã
o de 
RM
C 
Susp
ensã
o 
Reat
ivaçã
o 
Excl
usão
Inclu
são 
de 
desc
onto 
de 
cartã
o 
Excl
usão 
de 
Desc
onto 
de 
cartã
o 
Excl
usão 
por 
port
abili
dade
Aver
baçã
o por 
port
abili
dade
Refi
nanc
iame
nto 
Reve
rsão 
do 
Refi
nanc
iame
nto 
Alter
ação 
de 
emp
résti
mo 
Cons
ulta 
emp
résti
mos
Cons
ulta 
Port
abili
dade
Inclu
ir 
Infor
maç
ões 
do 
cont
rato
Aver
baçã
o de 
RCC
Troc
a 
BR X
BS X
BT X
CA X X X X X X X X X X X X X X X X X
CI X X X X X
CJ X X X X X
CX X
CY X
CV X
DK X X
FH X X X X X X X X X X X X X X X X
GA X X
H3 X X X X X X X X
HM X X X X X X X X X X X X X X X
HN X X X X X X X
HP X X X X X X X
HQ X X X X X X X X X
HR X X X X X X X
HT X X X X
HV X X X X
HW X X X X X X
HX X X X X X X
HY X X X X X X X X X
HZ X X X X X X X X
IA X X X X X X
IB X X X X X X X X X X X
IE X X X X X
IF X X X X X
IT X X X X X
IN
IO X X X
IQ X
IR X X X X X X
LE X
LR X X
ME X X
NB X X X X X X X X X X X X X X X
NC X X X X X X X X X X X X X X X
OA X
OB X
OC X X
OD X X
OE X
OF X X X
OG X X X X
OH X X X X X X X
OJ X X X X X X X X X X X X X X
OM X X X
__________________________________________________________Página 49 de 62
Códig
o 
Averbaç
ão de 
Emprésti
mo 
Aver
baçã
o de 
RM
C 
Susp
ensã
o 
Reat
ivaçã
o 
Excl
usão
Inclu
são 
de 
desc
onto 
de 
cartã
o 
Excl
usão 
de 
Desc
onto 
de 
cartã
o 
Excl
usão 
por 
port
abili
dade
Aver
baçã
o por 
port
abili
dade
Refi
nanc
iame
nto 
Reve
rsão 
do 
Refi
nanc
iame
nto 
Alter
ação 
de 
emp
résti
mo 
Cons
ulta 
emp
résti
mos
Cons
ulta 
Port
abili
dade
Inclu
ir 
Infor
maç
ões 
do 
cont
rato
Aver
baçã
o de 
RCC
Troc
a 
ON X X X X X X X X X X X X X X X X X
OP
OS X X X X X X
OT
OU X X X X
OV X X X X
OZ X X X X X X X X X X X X X
PA X
PB X
PC X
PE X
PF X X X X X
PG X X
PH X
PI X X
PJ X X
PK X
PL X X X X X
PP X
PQ X
PS X
PU X
PX X
PZ X
RA X
RB X
RG X
RH X 
RM X 
SF X X X X X X 
TC X 
TI 
TM 
TN X X X X 
TP X X X 
TV X X X X 
TZ 
T1 X 
T2 X 
T3 X 
T4 X 
3.6. Matriz de Campos API x Campo CNAB
A matriz abaixo estabelece a correspondência entre:
• Campos das solicitações API – (ver as solicitações das operações do 
Manual de Comunicação Manter empréstimos consignados – online e do 
__________________________________________________________Página 50 de 62
Manual de Comunicação - Portabilidade, Renegociação e Alteração de 
empréstimo)
• Campos CNAB – ver Manual_2019_EmprestimoConsig_v6 (Registro 
detalhe, páginas 65 e 66)
Somente os campos que possuem correspondência estão presentes na tabela. 
Campos das Solicitações API Campos CNAB
codigoSolicitante/codigoOrigem 01.3 
nomeMutuario 07.3 
UFAPS 08.3 
cpfMutuario 09.3 
numeroBeneficio 10.3 
classificadorModalidade 18.3 
competenciaInicioDesconto 
20.3 
21.3 
numeroParcelas 23.3 
dataInicioContrato 24.3 
dataFimContrato 25.3 
Quando consignação é igual a: empréstimo e desconto de 
cartão: 
• valorLiberado 
Quando a consignação é igual a RMC: 
• valorLimiteCartao
Quando a consignação é desconto de cartão:
• valorSaldoLimiteCartao 26.3 
Quando consignação é igual a: empréstimo e desconto de 
cartão: 
• valorEmprestimo 
Quando a consignação é desconto de cartão:
• valorUtilizadoMesCartao 27.3 
Quando consignação é igual a: empréstimo edesconto de 
cartão: 
• ValorParcela 
Quando a consignação é igual a RMC: 
• PercentualRMC 
Quando a consignação é desconto de cartão:
• valorDesconto 28.3 
numeroContrato 30.3 
genciaPagadora 33.3 
contaCorrente 35.3 
DVContaCorrente 36.3 
3.7. Matriz de Retornos CNAB x API
A matriz abaixo estabelece a correspondência entre:
• Retorno das operações que utilizam o protocolo CNAB – ver 
Manual_2019_EmprestimoConsig_v6 (Registro detalhe, páginas 68)
• Retornos das solicitações API – (ver as solicitações das operações do 
Manual de Comunicação Manter empréstimos consignados – online e do 
__________________________________________________________Página 51 de 62
Manual de Comunicação - Portabilidade, Renegociação e Alteração de 
empréstimo)
Retornos 
CNAB Retornos API Observação 
AB AB 
AE SF/PF/OS 
AH - 
AI - Validação de arquivo batch 
AJ - 
AM AM 
AN AN 
AO AO 
AP AP 
AY AY 
BL 
BL/OA/OB/OC
/OD/OE 
Foram criadas novas regras na API, para 
tratar campos que são específicos de cada 
operação 
BM NC 
CA CA/BC/ON 
H1 - Validação de arquivo batch 
H3 H3 
HA - 
Validação de arquivo batch 
HB - 
HC - 
HE - 
HH - 
HI - 
HJ - 
HK - 
HM NB/HM 
HN HN 
HO - 
No CNAB assim como no on-line esta regra foi 
descontinuada, sendo substituída pela regra IB
HP HP 
HQ HQ 
HR HR 
HT HT 
HV HV 
HW HW 
HX HX 
HY HY 
HZ HZ 
IA IA 
IB IB 
IC - 
No on-line esta regra foi descontinuada, sendo 
substituída pela regra IB 
__________________________________________________________Página 52 de 62
Retornos 
CNAB Retornos API Observação 
ID - 
No on-line esta regra foi descontinuada, sendo 
substituída pela regra IB 
IE IE 
IF IF 
- IT 
IG IG No on-line esta regra foi descontinuada 
IK - 
No on-line esta regra foi descontinuada, sendo 
substituída pela regra IB 
IQ IQ 
IR IR 
TA - Validação de arquivo batch 
- CI Validação de campo novo - canal de atendimento
- CJ 
Validação de campo novo - dados do 
correspondente
- DJ 
Validação de campo novo - lista de desconto de 
cartão 
- FH Validação de arquivo batch 
- ME Validação de campo novo - motivo de exclusão
- OF Validação de campo novo - CPF da IF pagadora 
 OG 
Validação de operações concomitantes no mesmo 
benefício 
- OL 
Validação de campo novo - lista de desconto de 
cartão 
- OP Validação da situação da IF 
- OT 
Validação de tamanho de campo, no CANB tem 
posição definida 
- OU Validação de campo novo - valor da taxa anual
- OV Validação de campo novo – custo efetivo total 
- PA Operação nova – portabilidade 
- PB Operação nova – portabilidade 
- PC Operação nova – portabilidade 
- PD Operação nova – desbloqueio
- PH Operação nova – portabilidade 
- PI Operação nova – portabilidade 
- PJ Operação nova – portabilidade 
- PL Operação nova – refinanciamento
- PP Operação nova – portabilidade 
- PQ Operação nova – portabilidade 
- PS Operação nova – portabilidade 
- RA Operação nova – refinanciamento 
- RB Operação nova – refinanciamento 
- RD Operação nova – desbloqueio/autorização
- RG Operação nova – reversão do refinanciamento 
- RH Operação nova – desbloqueio/autorização 
- RM Operação nova – reversão do refinanciamento 
- TN Operação nova – autorização 
00 BT 
__________________________________________________________Página 53 de 62
Retornos 
CNAB Retornos API Observação 
01 - No on-line esta regra foi descontinuada 
02 - No on-line esta regra foi descontinuada 
03 - No on-line esta regra foi descontinuada 
04 ON - 
05 T4 - 
06 T5 - 
07 T1 - 
08 T3 - 
09 CA - 
10 T2 - 
 
3.8. Regra AP – detalhamento e exemplos nas operações on-line
Regra AP – Detalhamento nas operações on-line
Todas as condições abaixo devem ser atendidas para não ser gerado o erro AP: 
• Na Averbação de RMC (76): 
◦ A data de início do contrato deve ser uma data válida, preenchida, 
devendo a competência desta ser compreendida no período abaixo
• Do mês e ano atual subtraída de (X +1) competências
• Até a data atual
• Nas operações de Averbação (98, 75, 71) Averbação por portabilidade e 
Refinanciamento: 
◦ A data de início do contrato deve ser uma data válida, preenchida, 
devendo a competência desta ser compreendida no período abaixo
• Da competência de início de desconto subtraída de (X +1) 
competências
• Até a competência de início de desconto acrescentada de (X +1) 
competências
▪ A data de fim de contrato deve ser uma data válida, preenchida, 
com uma data maior que a data de início de contrato
• Nas operações de Suspensão (98, 75, 71), Reativação (98, 75, 71) e 
Inclusão de desconto de cartão e Exclusão de desconto de cartão: 
◦ A data de realização da operação deve ser menor ou igual à data 
limite das operações da competência em aberto.
__________________________________________________________Página 54 de 62
◦ A competência de início do desconto é calculada, como sendo a 
competência em aberto.
• Na operação de Exclusão (98, 75, 71), a competência de início do 
desconto é calculada, como sendo:
▪ A competência em aberto, quando a data da realização da 
operação é menor ou igual à data limite das operações.
▪ A competência seguinte à competência em aberto, quando a data 
da realização da operação é maior que a data limite de averbação.
• Na operação de Alteração de empréstimo, quando não é informada a 
competência de início do desconto, ela é calculada, da seguinte 
forma:
▪ Igual à competência em aberto, quando a data da realização da 
operação é menor ou igual à data limite de averbação
• Na operação Alteração de empréstimo, quando é informada a 
competência de início do desconto:
▪ Quando a data da realização da operação é menor ou igual à data 
limite de averbação, a competência deve ser igual à competência 
em aberto
▪ Quando a data da realização da operação é maior que a data limite 
de averbação, a competência deve ser igual à competência 
seguinte da competência em aberto
• Na operação de Averbação (98, 75, 71), averbação por portabilidade, 
refinanciamento, quando não é informada a competência de início do 
desconto, ela é calculada, da seguinte forma:
▪ Igual à competência em aberto, quando a data da realização da 
operação é menor ou igual à data limite de averbação
▪ Igual à competência seguinte da competência em aberto, quando a 
data da realização da operação é maior que a data limite de 
averbação.
• Na operação de Averbação (98, 75, 71), averbação por portabilidade, 
refinanciamento, quando é informada a competência de início do 
desconto:
▪ Quando a data da realização da operação é menor ou igual à data 
limite de averbação, a competência deve ser compreendida entre:
• De: competência em aberto
• Até: competência em aberto acrescida de X competências
▪ Quando a data da realização da operação é maior que a data limite 
de averbação, a competência deve ser compreendida entre:
• De: competência seguinte da competência em aberto
• Até: competência seguinte da competência em aberto de X 
competências
Onde: 
• 98 (Empréstimo consignado), 
• 75 (Retenção) 
• 76 (RMC – Reserva de Margem de Cartão) 
• X: 
__________________________________________________________Página 55 de 62
◦ É igual a 3, quando a data da realização da operação é uma data 
contida neste período (inclusive): 27/07/2020 - 31/12/2020 (IN 107)
◦ É igual 0, nos demais casos
Regra AP – Exemplo 1 
A data limite para as operações de averbação e a data limite para as operações 
podem ser vistas no cronograma das operações que é enviado anualmente 
para as IFs, conforme quadro cronograma exemplo abaixo:
Exemplosa) Solicitar uma averbação (98) após a data limite de averbação (sem 
informar a competência de início de desconto), entre os dias 5 de 
agosto e 01 de setembro (ver linhas 1, meses de agosto e 
setembro), o sistema aceita a solicitação, considerando o início do 
desconto a competência 09/2020.
b) Solicitar a inclusão de desconto de cartão entre os dias 11 de 
agosto (ver linha 3 do mês de agosto) e 15 de agosto (ver linha 4 
do mês de agosto), o sistema dará o erro AP, pois a operação foi 
realizada em uma data superior a data limite da competência em 
aberto.
c) Solicitar a exclusão (98) entre os dias 11 de agosto (ver linha 3 do 
mês de agosto) e 15 de agosto (ver linha 4 do mês de agosto), o 
sistema aceita a solicitação, considerando o início do desconto para 
a competência 09/2020.
d) Inclusão de RMC e Desconto de cartão antes da data limite 
(10/08/2020 - competência 08/2020):
◦ RMC entra em vigor imediatamente
◦ Desconto de cartão é incluído e descontado na competência 
atual (08/2020)
e) Inclusão de RMC e Desconto de cartão após a data limite:
◦ RMC entra em vigor imediatamente (embora talvez não apareça 
a rubrica na competência atual)
◦ Desconto de cartão é rejeitado com erro AP
__________________________________________________________Página 56 de 62
 Obs.: Todas as datas, exceto as datas da linha 1, são datas possíveis de alteração
Regra AP – Exemplo 2 
No quadro abaixo é apresentado o período de aceitação dos comandos, e 
também o período de processamento da folha para a competência 03/2021. 
Cronograma de 2021 
Janeiro Fevereiro Março Abril 
Aceitação das operações abaixo na 
competência 03/2021 para os comandos 
de:
• Averbação, 
• Averbação por portabilidade, 
• Refinanciamento, 
• Alteração de empréstimo 
 
◦ Início do período 15 
◦ Fim do período 2 
Aceitação das operações abaixo na 
competência 03/2021 para os comandos 
de:
• Inclusão de Desconto de Cartão, 
• Exclusão de Desconto de Cartão, 
• Suspensão, Reativação, Exclusão,
• Exclusão por portabilidade 
 
◦ Início do período 15 
◦ Fim do período 13 
Sistema bloqueado para processamento 
da folha na competência 03/2021 14 
 
__________________________________________________________Página 57 de 62
O exemplo acima é ilustrado na imagem abaixo:
3.9. Regra RH – detalhamento e exemplos nas operações on-line
A reversão do refinanciamento pode ser realizada dentro de 7 dias úteis da 
data de realização do refinanciamento. Neste cálculo, os dias de 
processamento da folha, não são considerados dias úteis.
Data da 
realização do 
refinanciamento
Dias envolvidos 
Último dia de 
refinanciament
o
sex 30/abr 21 
sex 30/abr 21 Dia útil 
seg 10/mai 21 
sáb 01/mai 21 Sábado 
dom 02/mai 21 Domingo 
seg 03/mai 21 Dia útil 
ter 04/mai 21 Dia útil 
qua 05/mai 21 Dia útil 
qui 06/mai 21 Dia útil 
sex 07/mai 21 Dia útil 
sáb 08/mai 21 Sábado 
dom 09/mai 21 Domingo 
seg 10/mai 21 Dia útil 
Data da 
realização do 
refinanciamento
Dias envolvidos 
Último dia de 
refinanciament
o 
sáb 08/mai 21 
sáb 08/mai 21 Sábado 
seg 24/mai 21 
dom 09/mai 21 Domingo 
seg 10/mai 21 Dia útil 
ter 11/mai 21 
Processamento 
da folha 
__________________________________________________________Página 58 de 62
qua 12/mai 21 
Processamento 
da folha 
qui 13/mai 21 
Processamento 
da folha 
sex 14/mai 21 
Processamento 
da folha 
sáb 15/mai 21 
Processamento 
da folha 
dom 16/mai 21 
Processamento 
da folha 
seg 17/mai 21 Dia útil 
ter 18/mai 21 Dia útil 
qua 19/mai 21 Dia útil 
qui 20/mai 21 Dia útil 
sex 21/mai 21 Dia útil 
sáb 22/mai 21 Sábado 
dom 23/mai 21 Domingo 
seg 24/mai 21 Dia útil 
3.10. Regra IR – detalhamento e exemplos nas operações on-line
O Retorno IR refere-se à validação feita quando o prazo da operação é maior 
que a Data de Extinção de Cota do benefício, ocorrendo quando a quantidade 
de parcelas ultrapassa a extinção de cota
Os benefícios de pensão por morte, não necessariamente possuem a 
informação da "Data de Cessação do Benefício" (DCB). Nestas espécies, o 
que pode ocorrer, ocasionalmente, é a extinção da cota de dependente titular 
(por exemplo, a companheira) e, nessa situação, a pessoa perde o direito e o 
benefício é transferido para outro titular. Assim, não há DCB preenchida, pois o 
benefício não foi, necessariamente, cessado. Para esses casos, a data 
relevante é a "Data de Extinção de Cota”. Esta informação está 
disponibilizada nas APIs.
A DCB é uma informação de benefícios cessados, mas também pode existir em 
benefícios ativos de incapacidade (Ex: Aposentadoria por Invalidez), os quais, 
devido à necessidade de passarem por perícia médica, podem receber uma 
DCB futura, dependendo da avaliação do médico perito.
A "Data de Despacho do Benefício" é a data do reconhecimento do direito 
ao benefício e, geralmente, é a mesma data da concessão. Porém, não há 
nenhuma referência de validação em relação a essa data e o erro IR.
Exemplos na averbação de RMC ou RCC:
1) A soma (Competência Atual + limite atual de parcelas - 1) é menor que a 
data de extinção de cota (averbação com sucesso - retorno BD): 
• Competência atual: 02/2023
• Limite atual de parcelas: 84
__________________________________________________________Página 59 de 62
• Soma (Competência Atual + limite atual de parcelas – 1): 01/2030
• Data de extinção de cota: 04/03/2030 (86 meses)
2) A soma (Competência Atual + limite atual de parcelas - 1) é maior que a 
data de extinção de cota (averbação rejeitada - retorno IR): 
• Competência atual: 02/2023
• Limite atual de parcelas: 84
• Soma (Competência Atual + limite atual de parcelas – 1): 01/2030
• Data de extinção de cota: 04/03/2029 (74 meses)
Segue abaixo relação de espécies de pensão por morte:
Espécie Descrição 
01 PENSAO POR MORTE DE TRABALHADOR RURAL 
02 PENSAO POR MORTE ACIDENTARIA-TRAB. RURAL 
03 PENSAO POR MORTE DE EMPREGADOR RURAL 
21 PENSAO POR MORTE PREVIDENCIARIA 
93 PENSAO POR MORTE ACIDENTE DO TRABALHO 
3.11. Sequência de erros
Segue abaixo uma tabela contendo cenários, uma relação de regras não 
atendidas em cada cenário e o respectivo erro retornado.
Cenário Operação Regras não 
atendidas 
Erro 
retornado 
1. /emprestimos/averbar-consignado HX, HR, HW HX 
2. /emprestimos/averbar-consignado HR, HW HR 
3. /emprestimos/averbar-consignado HW HW 
4. /emprestimos/averbar-rmc HX, HR, HW HX 
5. /emprestimos/averbar-rmc HR, HW HR 
6. /emprestimos/averbar-rmc HW HW 
7. /emprestimos/incluir-descontocartao 
HX, HR e HW HX 
8. /emprestimos/incluir-descontocartao 
HR e HW HR 
9. /emprestimos/incluir-descontocartao 
HW HW 
10. /emprestimos/realizarrefinanciamento 
HX, HW HX 
__________________________________________________________Página 60 de 62
11. /emprestimos/realizarrefinanciamento 
HW HW 
12. /emprestimos/averbar-portabilidade HX HR HW HX HW HR 
13. /emprestimos/averbar-portabilidade HX PH HR HW HX 
14. /emprestimos/averbar-portabilidade PH HR HW PH 
15. /emprestimos/averbar-portabilidade HR HW HW e HR 
3.12. Cronograma atual das operações
Segue abaixo quadro contendo o cronograma atual das datas limites das 
operações do crédito consignado.
Explicação do quadro: 
◦ Linha 1 – Data de início de pagamento ao beneficiário 
◦ Linha 2 – Data limite da operação de averbação (2º dia útil) na 
competência atual (folha do mês), averbação por portabilidade, 
refinanciamento e alteração de empréstimo na competência em 
aberto da folha: 
▪ As operações feitas depois da “data limite de averbação”, são 
programadas para a próxima competência (quando não informada 
a competência de início de desconto). 
▪ Tipos de consignações envolvidas: 
• 98 (Empréstimo consignado), 
◦ Linha 3 – Data limite para aceitação das operações na competência 
em aberto da folha. 
▪ As operações feitas depois da “data limite” são programadas para a 
próxima competência, nas operações e consignações abaixo: 
• Exclusão 
◦ 98 (Empréstimo consignado) 
__________________________________________________________Página 61 de 62
▪ As operações feitas depois “data limite” são rejeitadas com erro AP, 
nas operações e consignações abaixo: 
• Suspensão, Reativação 
◦ 98 (Empréstimo consignado) 
• Inclusão e exclusão de desconto de cartão 
◦ Linha 4 – Data que ocorrerá o processamento da folha, e que gerará o 
retorno AV, para algumas operações realizadas neste período, como 
exemplo: averbação de empréstimo consignado 
◦ Linha 5 – Data inicial para envio de comandos para a próxima 
competência 
Obs.: 
• As operações de RMC não estão relacionadas à data limite e são 
imediatamente efetivadas. 
• O retorno AP em uma operação de RMC está relacionado a data de início 
do contrato. 
3.13. Regra PI – Cálculo do valor de referência e exemplo
Segue exemplo do cálculo de referência utilizado na regra PI 
Cálculo (somente para empréstimos, refinanciamento e portabilidade) 
 Obtenção do valor presente da primeira parcela 
 Valor presente = valor da parcela / ((1 + taxa informada pela instituição) elevado a (carência em dias/30)) 
 Obtenção do valor presente das parcelas subsequentes até o limite de 
parcelas definido no contrato  Iterando, a partir da primeira, até a última parcela  Próximo pagamento = data do primeiro desconto + um mês 
(Ex: 02/05 + 1 mês = 02/06)  Quantidade de dias até o próximo pagamento = Próximo pagamento – Data de início do contrato  Valor presente = valor presente + valor da parcela / ((1 + 
taxa informada pela instituição) elevado a (quantidade de 
dias até o próximo pagamento/30))
 O valor presente obtido deve estar dentro da taxa informada pela instituição, considerando um arredondamento matemático de 2,5 %. 
Exemplo: 
Considerando um contrato sendo averbado com os seguintes dados: 
 Data de início do contrato: 13/06/2023 
 Data do primeiro vencimento: 07/08/2023 
 Taxa de juros mensal (do contrato): 1,95 % 
 Prazo: 84 meses 
__________________________________________________________Página 62 de 62
 Valor da parcela: R$ 38,00 
Chega-se, a partir do algoritmo proposto, no valor do empréstimo de 
R$ 1525,25. A partir do valor obtido, será aceita uma variação de 2,5 %*. 
(*) R$ 1525,25 * 0,975 % = R$ 1487,12 (referência para validação do valor 
do empréstimo) 
Caso o valor do empréstimo informado seja maior ou igual a R$ 1487,12, a 
averbação não gerará o retorno PI 




 
