Dessa forma, peço atuação de Todos para podermos encontrar, conjuntamente, a solução. Eu e o Rodrigo Portela estamos à disposição parra o que precisarem.
 
Everton Heleno de Almeida adicionou Claudia Regina Alves de Sousa ao chat e compartilhou todo o histórico de chats.

 
O Suporte mainframe NPRD acionou a equipe de desenvolvimento do sistema SID01(Karen) para realizar a configuração dos parâmetros necessários ao funcionamento do web service no mainframe.
Adicionalmente, estamos encaminhando o documento Tutorial-CICSWebService-Dev-Mainframe-CriarWebServiceSoapProvider_v5.1, que poderá ser utilizado como referência para futuras configurações e implantações relacionadas ao ambiente.
 
Tutorial-CICSWebService-Dev-Mainframe-CriarWebServiceSoapProvider_v5 1.doc
 
Claudia Regina Alves de Sousa
O Suporte mainframe NPRD acionou a equipe de desenvolvimento do sistema SID01(Karen) para realizar a configuração dos parâmetros necessários ao funcionamento do web service no mainframe. Adicionalmen…
Bom dia! Tudo bem?
Qual matricula da Karen para colocarmos no grupo?
 
Rodrigo Portela das Chagas
Bom dia! Tudo bem? Qual matricula da Karen para colocarmos no grupo?
Boa tarde, Rodrigo!
Karen da Silva Paiva.
 
Rodrigo Portela das Chagas adicionou Karen da Silva Paiva ao chat e compartilhou todo o histórico de chats.

 
Bom dia Karen da Silva Paiva! Bem?
Estamos tratando a demanda do ambiente TQS do SID01 por aqui. Caso a gente consiga ajudar em algo, nos avise por favor.
O acesso a esse ambiente é bem importante aqui para a GESAT 
 
nenhum webservice, de nenhum sistema, está aparecendo hoje nos CICS de TQS, a equipe de suporte está verificando sobre isso.
 
 
Karen da Silva Paiva
nenhum webservice, de nenhum sistema, está aparecendo hoje nos CICS de TQS, a equipe de suporte está verificando sobre isso.
Se precisar eu posso disparar uma chamada do SIINP para SID01 TQS para olharem o log, só pedir 
 
Rodrigo Portela das Chagas
Se precisar eu posso disparar uma chamada do SIINP para SID01 TQS para olharem o log, só pedir
Verificamos que os acessos aos diretórios em /u haviam sido removidos. Realizamos o restabelecimento dos acessos necessários. Quando for conveniente, fico à disposição para darmos continuidade à configuração do webservice em TQS.
 
tentativa de agora
 
 
Rodrigo Portela das Chagas
tentativa de agora   📷
É necessário configurar e executar o job conforme descrito no manual enviado pela Claudia para que possamos prosseguir com os testes.
 
acabei de executar, e parece que agora deu certo no cics QAWB1:
 
vou fazer nos outros CICS
 
fiz o scan, só aparecem os serviços webservice no QAWB1.
Sabe por que não aparece nenhum serviço web service nos outros, QAWB2, QTWB1, QTWB2?
 
A execução do job refletiu em todos os CICS WEB de TQS, poderiam por favor fazer um teste.
 
 
Realizamos testes da transação N1W1 e identificamos que ela não está chegando ao CICS. Jesse, poderia nos apoiar na segunda-feira para analisarmos conjuntamente o problema e tentarmos identificar a causa na baixa plataforma?
 
Bom dia pessoal!
Karen da Silva Paiva e Jesse Mouta Pereira Batista
Conseguem apoiar o Everton na regularização do ambiente, por favor?
 
Ainda estamos tomando erro 500
 
 
o wsdl está abrindo direitinho:
A transação aparece em 4 CICS de TQS, não aparece no CICQTWB3, não sei se o erro é por conta desse CICS.
O serviço aparece em todos os CICS, conforme abaixo:


 
Identifiquei na sexta-feira à noite que a porta 2587 não estava ativa no CICQTWB3. Hoje verifiquei que ela já está disponível. No momento em que você realizou a chamada, a requisição chegou ao CICS, porém ocorreu um abend ASRA no programa.
Com isso, o próximo passo é envolver a equipe de mainframe responsável pelo sistema para que possamos depurar o programa ou realizar um CEDX na transação e identificar a causa do erro.
Evidência:
 
CICQTWB3 - A transaction dump was taken for dumpcode: ASRA,


Dumpid: 1/0002
 
Isso confirma que a requisição está chegando ao CICS e que, neste momento, a análise deve ser direcionada ao programa que está sofrendo o abend.


Tutorial – CICS WebService – Desenvolvedor Mainframe
Como criar WebService CICS SOAP Provider (v5)

O objetivo deste tutorial é demonstrar a implementação da arquitetura de referência de integração plataforma alta com platafoma baixa, por meio de CICS WebService.

O escopo do CICS WebService foi destacado na cor amarela, no diagrama que foi extraído da página da Arquitetura TI da SUART. Link: http://arquiteturati.caixa/arquitetura_referencia/22.10/integracoes/integracoes/

 

Sistema de Negócio na plataforma alta – programa e book Cobol/CICS
CICS WebService – disponibiliza WebService soap (xml)
Sistema na plataforma baixa – consome o WebService 


CONFIGURAR CICS WEB AMBIENTE DES PARA O SISTEMA
A configuração do sistema é feita apenas uma vez. Caso já esteja configurado, pule para o passo DESENVOLVER CICS WEBSERVICE.
1) Configurar CICS WebService do sistema:
1.1) Solicitar criação da pasta do sistema no z/Os Unix
1.2) Criar as subpastas do sistema no z/Os Unix 
1.3) Solicitar criação do pipeline do sistema no CICS
1.4) Solicitar criação de usuário de serviço do sistema para acessar CICS WebService.



DESENVOLVER CICS WEBSERVICE
SISTEMA ALTA PLATAFORMA - PROVEDOR
2) Criar WebService:
Solicitar criação da transação CICS associada ao DFHPIDSH
Solicitar acesso do usuário de serviço e desenvolvedores na transação 
Obter o nome do programa Cobol e books
Criar books request e response (a partir dos books do item anterior)
Criar o CICS WebService (JCL DFHLS2WS)
Instalar o CICS WebService criado (aguardar reciclagem do CICS no dia seguinte, ou instalar manualmente entrando em cada CICS e executando comando:
CEMT PERFORM PIPE(XXXSPIPE) SCAN)

3) Testar CICS WebService:
Acessar o wsdl no browser (http://CICSweb.des.caixa:2584/sixxx/xxxxxxx?wsdl)
Testar wsdl em alguma ferramenta (exemplo SOAPUI)

 
SISTEMA BAIXA PLATAFORMA - CONSUMIDOR
5) Consumir CICS WebService
Obter o endpoint do CICS WebService com o wsdl
Importar wsdl por meio de qualquer ferramenta (exemplo para Java, apache cxf)
Solicitar acesso do usuário de serviço do sistema na transação CICS WebService
Acessar WebService utilizando autenticação basic (usuário de serviço e senha)



CONFIGURAR CICS WEB AMBIENTE DES PARA O SISTEMA
1) Configurar CICS WebService do sistema:
1.1)	Solicitar criação da pasta do sistema no z/Os Unix
Abrir solicitação no serviço.caixa / Tecnologia da Informação e Comunicação/ Centralizadoras de Tecnologia da Informação/ CETAD Suporte Não Produção 
O que você deseja ? Descrever as tecnologias e necessidade para o Sistema na camada de aplicação e apresentação na plataforma alta
Descrição do ambiente a ser criado*: Criação da pasta do sistema /u/webservices/sixxx no z/Os Unix , para CICS WebService em DES. 


1.2)	Criar as subpastas do sistema no z/Os Unix 
As seguintes pastas devem ser criadas no z/OS Unix:
/u/webservices/<sistema>/<pipeline>/config 
/u/webservices/<sistema>/<pipeline>/shelf/
/u/webservices/<sistema>/<pipeline>/wsbind/
/u/webservices/<sistema>/<pipeline>/wslog/
/u/webservices/<sistema>/<pipeline>/tmp/

No ambiente RJ, verificar se o desenvolvedor pode criar as pastas ou é necessário solicitar a criação para o suporte.
No ambiente SP, as pastas podem ser criadas manualmente pelo desenvolvedor no TSO ou podem ser criadas por script (JCL modelo).

O script já libera os acessos, mas se criar as pastas manualmente, lembrar de conceder permissão de acesso aos demais usuários e grupos (chmod 777), pois ainda não há estrutura de grupos de acesso no z/Os Unix de SP.

Utilizando o seguinte modelo de JCL, que está em ES.SUD.V00.LIB.SAMPLE(WSCMKDIR), alterar o parâmetro e submeter o job. 

Informar o sistema e o nome do pipeline nos parâmetros, em letras minúsculas:
SISTEMA=’sixxx’       => sistema xxx
PIPELINE= ‘xxxspipe’ => nome sugerido para o pipeline soap do sistema xxx

JCL template => DES.SUD.V00.LIB.SAMPLE(WSCMKDIR)

//DESMKDIR JOB (DES,SP,72664,09,30),'XXXWSC',REGION=0M,
//    TIME=1440,MSGLEVEL=(1,1),MSGCLASS=T,CLASS=N,NOTIFY=&SYSUID
//*********************************************************************
//*      SCRIPT PARA CRIAR AS PASTAS NO Z/OS UNIX PARA USO
//*                     WEBSERVICE CICS
//*********************************************************************
//PROCLIB  JCLLIB  ORDER=DES.V01.PROC
//JOBLIB   DD DSN=DES.TESTEB.LINKLIB,DISP=SHR
//         DD DSN=END.SPD.TQS00.LOAD,DISP=SHR
//         DD DSN=END.SPD.HOMOL.LOAD,DISP=SHR
//         DD DSN=END.V01.LOAD,DISP=SHR
//*********************************************************************
//*                        PARAMETROS
//* INFORMAR OS PARAMETROS EM LETRAS MINUSCULAS
//*    SISTEMA  EM SET SISTEMA='sixxx'
//*    PIPELINE EM SET PIPELINE='xxxspipe'
//*********************************************************************
//PARM     EXPORT SYMLIST=(SISTEMA,PIPELINE)
//     SET SISTEMA='sixxx'
//     SET PIPELINE='xxxspipe'
//*********************************************************************
//*  EXECUTA SHELL SCRIPT Z/OS UNIX - CRIACAO DA PASTA DO SISTEMA
//*  no path /u/webservices/
//*  VISUALIZE AS MENSAGENS DO SCRIPT NA SYSOUT DO JOB - STDOUT MKDIR
//*********************************************************************
//MKDIR   EXEC PGM=BPXBATCH,
//    PARM='SH /u/webservices/scripts/scmkdir.sh &SISTEMA &PIPELINE'
//STDIN   DD DUMMY
//STDOUT  DD SYSOUT=*
//STDERR  DD SYSOUT=*
//*

Submeta o job. As mensagens geradas pelo script das pastas geradas, pode ser visualizada na SYSOUT: DD STDOUT step MKDIR

Exemplo: JCL exemplo do sistema SISUD => DES.SUD.V00.LIB.SAMPLE(SUDMKDIR)


1.3)	Solicitar criação do pipeline do sistema no CICS - Suporte NPRD


1.4)	Solicitar criação de usuário de serviço do sistema para acessar CICS WebService - Suporte NPRD.
 


5) CRIAR PIPELINE- Suporte NPRD.

Caso ainda não exista, a criação do Pipeline deve ser solicitada em: https://servicos.caixa - GSC
Tecnologia da Informação e Comunicação
Centralizadoras de Tecnologia da Informação
CETAD - Suporte Não-Produção
Suporte à Ferramentas\Infraestrutura
Informar o Produto*: MQ (obs.: não existe a opção CICS, por isso foi escolhida a opção MQ que é atendida pela mesma equipe)
Informar o Ambiente*: Plataforma Alta
Informar Descrição Detalhada da Solicitação*: 
Criar e instalar pipeline para CICS WebService no ambiente de desenvolvimento
Name: XXXSPIPE
Description: PIPELINE SOAP SIXXX – DES
Configuration file name on zFS for this pipeline: /u/webservices/sidxxx/xxxspipe/config/basicsoap11provider.xml
Name of a directory (shelf) for WSBind files: /u/webservices/sixxx/xxxspipe/shelf
Name of the WSBind (pickup) directory on zFS: /u/webservices/sixxx/xxxspipe/wsbind


Informar:
Nome do pipeline, path e arquivo do config, path do shelf, path do wsbind que foram gerados no item 1

Será incluído e instalado no grupo CICS WEB DESENVOLVIMENTO: 
DES – GROUP GRCODWB
TQS – GROUP GRCQWAOR

Exemplo de criação e instalação de PIPELINE, através da ferramenta CMAS (somente equipe suporte tem acesso):
 

 



3) CRIAR BOOK REQUEST E RESPONSE

3.1) Obter as seguintes informações do programa ou rotina COBOL, que será disponibilizado com o WebService CICS:

•	PGMNAME: Nome do programa
•	Funcionalidade do programa
•	PGMINT: Tipo COMMAREA ou CHANNEL
•	Book(s)

Exemplo:
PGMNAME: SUDPOT01 => DES.SUD.V00.LIB.SAMPLE(SUDPOT01)
Funcionalidade do programa: testesudpot01
PGMINT: CommonArea
Book: SUDWIT01 => DES.SUD.V00.LIB.SAMPLE(SUDWIT01)


3.2) CRIAR BOOKS

Atenção: Os books criados não podem conter: 
•	Caracteres especiais,  exceto  - (hífen/traço)
•	REDEFINES 
•	VALUE é ignorado

Programa novo: os books de entrada e saída devem conter apenas os campos necessários. 

Programa legado: que utiliza book único, devem ser criados books de entrada e saída com o mesmo tamanho do original. No book de entrada, substituir os campos de saída por FILLER. No book de saída, substituir os campos de entrada por FILLER. Veja exemplo a seguir*.

Programa que usa vários containeres: 
Deve ser gerado um book para cada container. Isto não será abordado neste tutorial. Acesse o documento Tutorial-CICSweb-Dev-Mainframe-GerarWebService-MultiplosContaineres.doc


Mais informações podem ser obtidas em COBOL to XML schema mapping
https://www.ibm.com/support/knowledgecenter/SSGMCP_5.4.0/applications/developing/web-services/dfhws_cobol2wsdl.html

 
*Exemplo book legado:
Neste exemplo, os books serão gerados a partir do book legado.
Criar book para cada chamada (entrada e saída).
Retirar os caracteres “:”, não pode ter REDEFINES, VALUE é ignorado.
Desmembrar este book. 
Book original do legado:
      *----------------------------------------------------------------*
      * SUDWSYYY - BOOK                                                *
      *----------------------------------------------------------------*
        02 :SUDWSYYY:-AREA.
         03 :SUDWSYYY:-ENTRADA.
           05  :SUDWSYYY:-NU-CONTA                PIC  9(012).
           05  :SUDWSYYY:-DT-MOVIMENTO            PIC  9(008).

         03  :SUDWSYYY:-SAIDA.
           05  :SUDWSYYY:-NU-CPF-TITULAR          PIC  9(011).
           05  :SUDWSYYY:-NU-TIPO-PESSOA          PIC  9(001).
           05  :SUDWSYYY:-IC-TIPO-CONTA           PIC  9(002).

Neste exemplo, foram criados dois books:

Book de entrada (REQMEM):
Os campos da saída foram substituídos por FILLER
Sugestão: renomear o item principal do book como REQUEST e retirar o prefixo do book no nome dos campos

      *----------------------------------------------------------------*
      * SUDWIYYY - BOOK ENTRADA DESMEMBRADO PARA WEBSERVICE CICS      *
      *----------------------------------------------------------------*
        02 REQUEST.
         03 ENTRADA.
           05  NU-CONTA                PIC  9(012).
           05  DT-MOVIMENTO            PIC  9(008).

         03  FILLER                    PIC  X(014).

BOOK SAÍDA (RESPMEM):
Os campos da entrada foram substituídos por FILLER
Sugestão: renomear o item principal do book como RESPONSE e retirar o prefixo do book no nome dos campos

      *----------------------------------------------------------------*
      * SUDWIYYY - BOOK ENTRADA DESMEMBRADO PARA WEBSERVICE CICS      *
      *----------------------------------------------------------------*
        02 RESPONSE.
         03 FILLER                     PIC  X(020).

         03  SAIDA.
           05  NU-CPF-TITULAR          PIC  9(011).
           05  NU-TIPO-PESSOA          PIC  9(001).
           05  IC-TIPO-CONTA           PIC  9(002).

Dica: Para facilitar a contagem das posições, existe a seguinte opção no TSO: 
TSOSPDES
G – Produtos
FE - Tool Kit Desenvolvimento
13 - BE     Converte BOOK COBOL

 
4. CRIAR TRANSAÇÃO CICS ASSOCIADA AO DFHPIDSH

Solicite a criação da transação em: https://servicos.caixa
Tecnologia da Informação e Comunicação
Centralizadoras de Tecnologia da Informação
CETAD - Suporte Não-Produção
Suporte à Ferramentas\Infraestrutura
Informar o Produto*: MQ (obs.: não existe a opção CICS, por isso foi escolhida a opção MQ que é atendida pela mesma equipe)
Informar o Ambiente*: Plataforma Alta
Informar Descrição Detalhada da Solicitação*: 
A)	Criar e instalar transação para CICS WebService nos AORs de desenvolvimento
Name: TTTT
Description: Webservice XXXXXX - XXXPOYYY – AOR
First Program Name: DFHPIDSH
Remote attributes	
Dynamic routing option: No	
Dynamic routing status: No

B)	Criar e instalar transação para CICS WebService nos TORs de desenvolvimento
Name: TTTT
Description: Webservice XXXXX - XXXPOYYY – TOR
First Program Name: DFHPIDSH
Remote attributes	
Dynamic routing option:	Yes	
Dynamic routing status:	Yes	
Remote transaction name:	TTTT


Exemplo Preenchimento:
A)	Criar e instalar transação para CICS WebService nos AORs de desenvolvimento
Name: N3W1
Description: Webservice Manutencao Conta - D03POSCT - AOR
First Program Name: DFHPIDSH
Remote attributes	
Dynamic routing option: No	
Dynamic routing status: No

B)	Criar e instalar transação para CICS WebService nos TORs de desenvolvimento
Name: N3W1
Description: Webservice Manutencao Conta - D03POSCT - TOR	 	
First Program Name: DFHPIDSH
Remote attributes	
Dynamic routing option:	Yes	
Dynamic routing status:	Yes	
Remote transaction name:	N3W1Criar uma nova transação CICS para o webservice, no AOR e outra transação no TOR   
Exemplo do cadastramento na ferramenta CMAS pelo suporte:                    
Transaction definitions	AOR	TOR
Name	SUDW	SUDW
Version	1	2
Description	TESTE SISUD WEBSERVICE -AOR-DES-TQS- DFHPIDSH	TESTE SISUD WEBSERVICE -TOR-DES-TQS- DFHPIDSH
 		
First program name	DFHPIDSH	DFHPIDSH
Size in bytes of transaction work area (TWA)	' 0'	' 0'
Transaction profile	DFHCICST	DFHCICST
Default application partition set		
Enabled status	Enabled	Enabled
Primed storage allocation	' 0'	' 0'
Task data location	Any	Any
Task data key	User	User
Storage clearance status	No	No
Runaway timeout value	SYSTEM	SYSTEM
Shutdown run status	Disabled	Disabled
Transaction isolation option	No	No
Bridge exit name		
 		
Remote attributes	
Dynamic routing option	No	Yes
Dynamic routing status	No	Yes
Remote system name		
Remote transaction name		SUDW
Transaction routing profile	DFHCICSS	DFHCICSS
Queueing on local system	N_a	N_a
 		
Scheduling	
Transaction priority	' 1'	' 1'
Transaction class number	NO	NO
Transaction class name	DFHCLASS	DFHCLASS
 		
Aliases	
Alias name for transaction		
Transaction initiation		
Alternate name (in hex) for initiating transaction		
APPC partner transaction name		
Alternate partner transaction name (in hex)		
 		
Recovery	
Deadlock timeout value	NO	NO
Transaction restart facility	No	No
System purgeable option	No	No
Purgeable for terminal error option	No	No
Transaction dump option	Yes	Yes
Trace transaction activity option	Yes	Yes
Suppress user data in trace entries	No	No
Object transaction service (OTS) timeout (HHMMSS)	NO	NO
 		
Indoubt attributes	
CICS failure action	Backout	Backout
In-doubt wait option	Yes	Yes
In-doubt wait time (days)	' 0'	' 0'
In-doubt wait time (hours)	' 0'	' 0'
In-doubt wait time (minutes)	' 0'	' 0'
In-doubt failure processing action	Backout	Backout
 		
Security	
Resource security checking	No	No
Command level security option	No	No
External security manager option	N_a	N_a
Transaction security value	' 1'	' 1'
Resource security value	' 0'	' 0'
 		
 		
INSTALAR 		
Resource group	GRADES
GRATQS	GRTDES
GRTQS


RM para produção – aba 
2. Definir transação para CICS WEBSERVICE:
A transação N9W1, associada ao programa DFHPIDSH, foi incluída no SMT através do TSO PCT00
Deve ser configurada nos CICSTWBs como ROUTABLE e DYNAMIC e LOCAL nos CICSAWBs. 
Foi definida no CICSABE, para utilização como interface para movimentação das definições para a infraestrutura de CICSPLEX.


REQ000049365670
WO0000054032968


RM – aba Mainframe Online

1.Executar o package D09004H (books: D09WRVPE, D09RQVPE, D09RSVPE e programas COBOL: D09BBVPE, D09POVPE)    

2. Executar a SMT.JOBS.C141990.SID09.XXXX.B7600535
O programa D09POVPE deve ser instalado nos CICSAWB*

3. Definir transação para CICS WEBSERVICE:
A transação N9W1, associada ao programa DFHPIDSH, foi incluída no SMT através do TSO PCT00
Deve ser configurada nos CICSTWBs como ROUTABLE e DYNAMIC e LOCAL nos CICSAWBs. 
Foi definida no CICSABE, para utilização como interface para movimentação das definições para a infraestrutura de CICSPLEX.

3. Gerar artefatos e recursos para CICS WEBSERVICE:
Executar SMT.L2WS.C141990.SID09.XXXX.TUE2802


6) CRIAR E EXECUTAR JCL DFHLS2WS

DFHLS2WS é um programa utilitário do CICS que gera os recursos URIMAP, WEBSERVICE (wsbind, wsdl), conforme parâmetros informados.

DFHWS2LS: LS = Language Structure (Cobol), 2 = To, WS = WSDL


6.1) Criar o JCL DFHLS2WS

Copiar o JCL que está em DES.SUD.V00.LIB.SAMPLE(WSCLS2WS) e alterar os parâmetros. job.

Exemplo: DES.SUD.V00.LIB.SAMPLE(SUDLST01)

//DESLST01 JOB (DES,SP,72664,09,30),'SUDWSC',REGION=0M,
//    TIME=1440,MSGLEVEL=(1,1),MSGCLASS=T,CLASS=N,NOTIFY=&SYSUID
//PROCLIB  JCLLIB  ORDER=DES.V01.PROC
//LS2WS    EXEC DFHLS2WS,TMPDIR='/u/webservices/sisud/sudspipe/tmp',
//         TMPFILE='LS2WS'
//INPUT.SYSUT1 DD *
#---------------------------------------------------------------------#
#                                ENTRADA                              #
#---------------------------------------------------------------------#
#
MAPPING-LEVEL=4.3
MINIMUM-RUNTIME-LEVEL=CURRENT
# --> biblioteca de books
PDSLIB=//END.SPD.TESTE.BOOK
# --> books de entrada e saida
REQMEM=SUDWIT01
RESPMEM=SUDWOT01
# --> tipo de interface
PGMINT=COMMAREA
# --> programa
LANG=COBOL
PGMNAME=SUDPOT01
# --> transacao
TRANSACTION=SUDW
# --> atributos do WebService SOAP
REQUEST-NAMESPACE=*
https://caixa.gov.br/sisud/testesudpot01/req
RESPONSE-NAMESPACE=*
https://caixa.gov.br/sisud/testesudpot01/resp
URI=/sisud/testesudpot01
OPERATION-NAME=testesudpot01
WSDL-NAMESPACE=https://caixa.gov.br/sisud/testesudpot01
SOAPVER=1.1
# --> encoding do WSDL
WSDLCP=UTF-8
# --> omitir espacos em branco nas strings de saida do XML de resposta
CHAR-VARYING=COLLAPSE
# --> executar syncpoint
SYNCONRETURN=YES
#---------------------------------------------------------------------#
#                           SAIDA (WSDL E BIND)                       #
#---------------------------------------------------------------------#
#
WSBIND=/u/webservices/sisud/sudspipe/wsbind/testesudpot01.wsbind
WSDL=/u/webservices/sisud/sudspipe/wsbind/testesudpot01.wsdl
LOGFILE=/u/webservices/sisud/sudspipe/wslog/testesudpot01.log
#---------------------------------------------------------------------#
# DICAS:                                                              #
# - INSTALACAO DO WEBSERVICE:                                         #
# O PIPELINE deve estar criado                                        #
# O WEBSERVICE sera instalado qdo o CICS inicializar no dia seguinte  #
# Se desejar instalar antes disso, sera preciso entrar nos CICS       #
#  (CICDAWB1, CICDTWB1, CICDAWB2, CICDTWB2) e executar o comando      #
#  CEMT PERFORM PIPE (sudspipe) SCAN                                   #
#                                                                     #
# - CONSULTAR WEBSERVICE NO CICS:                                     #
# executar o comando CEMT I WEBS PIPE (sudspipe)                       #
#                                                                     #
# - CONSULTAR O WSDL NO BROWSER (CHROME ou FIREFOX), digitando        #
# https://CICSweb.des.caixa:32587/sisud/testesudpot01/?wsdl           #
# informe usuário e senha                                             #
#                                                                     #
# - TESTAR ACESSANDO SERVICO NA FERRAMENTA SOAPUI:                    #
# Em Initial WSDL, informar                                           #
# https://CICSweb.des.caixa:32587/sisud/testesudpot01?wsdl            #
# depois alterar my-server:my-port por CICSweb.des.caixa:32587        #
# usar Basic authentication, informando usuário e senha               #
#---------------------------------------------------------------------#

Não existe padrão de nome para WebService SOAP, mas utilize letras minúsculas sem caracteres especiais.


6.2) Executar o JCL DFHLS2WS
Submeter o job

O resultado é exibido na sysout do job e também é gravado no arquivo .log na pasta u/webservices/sixxx/xxxspipe/wslog/


Obs.: Se ocorrer o seguinte erro  
FSUM1004 Cannot change to directory </U/C112233>.
Onde C112233 é sua matrícula, significa que o usuário ainda não tem pasta criada no z/OS Unix
Executar o script de criação da pasta do usuário através do seguinte JCL:

//DESLS2WS JOB (DES,SP,72664,09,30),'D02WSC',REGION=0M,
//    TIME=1440,MSGLEVEL=(1,1),MSGCLASS=T,CLASS=N,NOTIFY=&SYSUID
//PROCLIB  JCLLIB  ORDER=DES.V01.PROC
//*
//*-------------------------------------------------------------------*
//*                         WEBSERVICE CICS                          *
//*-------------------------------------------------------------------*
//*
//*********************************************************************
//*              CRIAR PASTA DO USUARIO NO Z/OS UNIX                  *
//*-------------------------------------------------------------------*
//* O seguinte erro acontece quando não existir a pasta do usuário    *
//* FSUM1004 Cannot change to directory </U/C123456>.                 *
//* No step PARMUSER, substituir o usuario 'c123456'                  *
//*-------------------------------------------------------------------*
//PARMUSER EXPORT SYMLIST=(USUARIO)
//     SET USUARIO='c123456'
//*-------------------------------------------------------------------*
//MKUSER   EXEC PGM=BPXBATCH,
//    PARM='SH /u/webservices/scripts/scmkuser.sh &USUARIO'
//STDIN   DD DUMMY
//STDOUT  DD SYSOUT=*
//STDERR  DD SYSOUT=*
//*

7) INSTALAR WEBSERVICE
A instalação do WEBSERVICE é feita automaticamente na reciclagem do CICS, que ocorre uma vez ao dia. Neste caso é necessário aguardar até o dia seguinte.
Caso deseje instalar antes disso, então acesse o CICS e execute o seguinte comando:
CEMT PERFORM PIPE(<pipeline>) SCAN

Exemplo:
Entrar nos CICS de desenvolvimento CICDAWB1, CICDTWB1, CICDAWB2, CICDTWB2 e executar CEMT PERFORM PIPE(SUDSPIPE) SCAN

Resultando em:
  PERFORM PIPE(SUDSPIPE) SCAN                                                   
  STATUS:  RESULTS                                                              
   Pip(SUDSPIPE) Sca                                                            
                                                                                
                                                      SYSID=AWB1 APPLID=CICDAWB1
   RESPONSE: NORMAL                              TIME: 23.55.12  DATE: 20/11/20 
 PF 1 HELP       3 END       5 VAR        7 SBH 8 SFH 9 MSG 10 SB 11 SF         SF         


Obs.: Para verificar se o WEBSERVICE foi instalado, execute o seguinte commando:
CEMT I WEBS PIPE(SUDSPIPE)

Resultando em:
I WEBS PIPE(SUDSPIPE)                                            
STATUS:  RESULTS - OVERTYPE TO MODIFY                            
  Webs(testesudpot01                   ) Pip(SUDSPIPE)            
    Ins Ccs(00000) Uri($353550 ) Pro(SUDPOT01) Com Xopsup Xopdir
                                                                                
  I WEBS PIPE(SUDSPIPE)                                                         
  RESULT - OVERTYPE TO MODIFY                                                   
    Webservice(testesudpot01)                                                   
    Pipeline(SUDSPIPE)                                                          
    Validationst( Novalidation )                                                
    State(Inservice)                                                            
    Ccsid(00000)                                                                
    Urimap($353550)                                                             
    Program(SUDPOT01)                                                           
    Pgminterface(Commarea)                                                      
    Xopsupportst(Xopsupport)                                                    
    Xopdirectst(Xopdirect)                                                      
    Mappinglevel(4.3)                                                           
    Minrunlevel(4.3)                                                            
    Datestamp(20201120)                                                         
    Timestamp(23:53:55)                                                         
    Container()                                                                 
    Wsdlfile(/u/webservices/sisud/sudspipe/wsbind/testesudpot01.wsdl)           
    Archivefile()                                                               
 +  Wsbind(/u/webservices/sisud/sudspipe/wsbind/testesudpot01.wsbind)           
                                                                                
                                                      SYSID=AWB1 APPLID=CICDAWB1
                                                 TIME: 23.56.57  DATE: 20/11/20
 
8) TESTAR WSDL 
No navegador web (Mozilla Firefox ou Chrome), digite a url do serviço criado, seguida de ?wsdl 

https://CICSweb.des.caixa:32587/sisud/testesudpot01?wsdl
informe seu usuário e senha da rede

 

 

 
8) TESTAR WEBSERVICE NO SOAPUI
Na ferramenta SOAPUI 

Clique em SOAP

Na janela New SOAP Project: 
Project Name: informe o nome do projeto
Initial WSDL: informe a url do wsdl serviço criado 
https://CICSweb.des.caixa:32587/sisud/testesudpot01?wsdl

 

Se aparecer a janela Basic Authentication, informe seu usuário e senha da rede
 

Na pasta do projeto, clicar em Request 1
 

Na janela Request, 
alterar http://my-server:my-port por https://CICSweb.des.caixa:32587

 


 


Inserir os dados de entrada (em >?<)
Clicar no botão de Submeter (triangulo verde)
 

Após submeter, os dados de response (dados de saída), serão apresentados 
mas…
 

Caso a resposta seja 401 Basic Authentication Basic, clicar em Auth …
Em Authorization, escolher Add New Authorization … Na janela Add Authorization, em Type escolher Basic ...
 

Informe seu usuário e senha da rede e depois clique no triangulo verde para executar
 
Atenção: Lembre-se de alterar a senha no SOAPUI quando a senha de rede for alterada.

Finalmente, a resposta do WebService é mostrada!
 


10) PLATAFORMA DISTRIBUÍDA JAVA
Não será abordado neste tutorial.
Para gerar código Java a partir do WSDL:
Java8 – utilize wsimport
Java10- utilize wsdltojava do cxf-codegen-plugin no Maven

Necessário instalar certificado do CICSweb e abertura de rota e firewall

Se necessitar expor como API RESTFUL, gerar WebService REST e expor no API Manager.

11) USUÁRIO DE SERVIÇO
O usuário de serviço do sistema deve ser configurado no servidor Jboss ou na esteira devops.
Para testes unitários na máquina do desenvolvedor Java, pode ser utilizado Basic Authentication, usuário e senha da rede.
O usuário de serviço deve ter acesso na transação CICS do WebService. Se não tiver acesso retorna erro 403 - forbidden

12) INFRA
Mainframe: CICS 5.4
Plataforma Distribuída: Java8 com Jboss ou Java10-Quarkus no ambiente ADS

13) MATERIAL DE REFERÊNCIA

Creating a SOAP WebService
https://www.ibm.com/support/knowledgecenter/SSGMCP_5.4.0/applications/developing/web-services/dfhws_create_app.html

DFHLS2WS: high-level language to WSDL conversion
https://www.ibm.com/support/knowledgecenter/SSGMCP_5.4.0/applications/developing/web-services/dfhws_ls2ws.html

Arquitetura de referência de integrações:
http://arquiteturati.caixa/arquitetura_referencia/integracoes/

Criação de usuário de serviço: 
TE191 - USUÁRIO DE SERVIÇO -PADRÕES PARA CRIAÇÃO, GERENCIAMENTO E USO
Serviços.caixa


12) HISTÓRICO DE ALTERAÇÕES DO TUTORIAL

data	versão	autor	alteração
23/11/2020	V1	Denise Sakai	Criação do tutorial
05/03/2021	V2	Denise Sakai	Substituir DES.SUD.V00.LIB.SAMPLE por DES.SUD.V00.LIB.SAMPLE, acerto books e soapui, inclusão itens 10,11,12
07/05/2021	V3	Denise Sakai	Alteração nome arquivo, alteração itens 10,11,12
06/01/2022	V4	Denise	Alteração solicitação criação transação e pipeline, reorganização do documento



<img width="800" height="425" alt="image" src="https://github.com/user-attachments/assets/c429a01f-f08b-41de-a91b-097e8d9da9f9" />

 

<img width="1920" height="1020" alt="image" src="https://github.com/user-attachments/assets/86c4e2f4-271f-4ee3-8307-78baa01cc885" />


<img width="1413" height="853" alt="image" src="https://github.com/user-attachments/assets/77dbdf73-f3fb-46db-8adc-bdf053104745" />


**<img width="1920" height="1020" alt="image" src="https://github.com/user-attachments/assets/42d860dc-21bf-45a9-b32c-990ca0dc1bc9" />
**

<img width="1920" height="1020" alt="image" src="https://github.com/user-attachments/assets/8dfbdc71-b4f3-4306-8a92-550ffa410835" />





