
Contextualização

O time Caixa evidenciou a necessidade da inclusão de uma funcionalidade para os testes de regra de Firewall.


Especificação da tarefa

A demanda visa adicionar ao InfraFácil, uma funcionalidade que permita os usuários realizarem testes de regra de Firewall. O menu dessa funcionalidade ficará no Restrito > Regras de Firewall > Teste para Regra de FW.

Ao clicar na funcionalidade, deverá abrir uma tela com o card de dicas e o seguinte campo:

Opções de teste: esse campo deve permitir a seleção do tipo de teste que será executado. Esse do tipo dropdown que exiba as opções de testes, para essa primeira entrega, as opções devem se resumir a Container, VM (Em breve) e Mainframe (Em breve). Porém as opções VM (Em breve) e Mainframe (Em breve) devem ser exibidas de forma inabilitada.

Após o usuário escolher o tipo de teste, deverá ser apresentado a tela com os cards “Informações do ambiente” e “Dados para teste”.

No card “Informações do ambiente” deverá conter os seguintes campos:
Cluster
Projeto
IP de saída

 
No card “Dados para teste” deverá conter os seguintes campos:
Protocolo de teste
IP de destino ou domain
Porta
Botão “+” *Definir com o desenvolvedor o máximo de IPs que o usuário pode utilizar para testes: 6 ou 8.
IPs e portas adicionadas

Quando o usuário preencher todos os campos, o botão “TESTAR” deve ser habilitado para o usuário utilizar.

O botão “TESTAR” irá executar o serviço de testes de regra de Firewall
Após o usuário clicar no botão, deverá ser apresentado em tela um modal com a frase “Teste finalizado! Por favor, acesse a página de histórico para verificar os detalhes.”, indicando ao usuário que a solicitação foi atendida.
Nesse modal a palavra “Histórico” será um hiperlink clicável para que o usuário seja encaminhado para a tela de histórico com todas as solicitações de regra de Firewall.
A tela de histórico apresentará todos os registros de testes de Firewall que foram solicitados. Nesta tela as seguintes colunas serão apresentadas:

Projeto
IP de origem
IP destino
Porta
Status
Ações

Após acessar a tela de histórico o usuário poderá clicar no botão “VER MAIS” analisar o resultado e todas as informações relacionadas ao teste em questão.


Fluxo

O card “Informações de Ambiente” deverá se comportar da seguinte forma dependendo se o usuário entrou com sistema ou sem sistema:

Login com sistema:
Por padrão, será autopreenchido os seguintes campos: “Cluster”, “Projeto” e “IP de saída”
Login sem sistema:
Por padrão o usuário deverá fornecer as informações dos seguintes campos: “Cluster” e “Projeto”, de forma que com as informações desses dois campos, o campo “IP de saída” será autopreenchido.
Os campos “Cluster” e “Projeto” serão autopreenchidos quando o campo “IP de saída” for preenchido pelo usuário.

Comportamento dos campos

Tela 1

A primeira tela será composta da seguinte forma:

Opções de teste
Campo do tipo dropdown com as seguintes opções: Container, VM (Em breve) e Mainframe (Em breve)

A tela após a seleção do tipo de teste apresentará os seguintes campos:

No card “Informações do ambiente” deverá conter os seguintes campos:
Cluster (Campo do tipo dropdown que deve listar todos os Clusters considerados para a funcionalidade)
Projeto (Campo do tipo texto livre, com autopreenchimento, que deve permitir o usuário informar o nome do projeto)
IP de saída (Campo do tipo alfanumérico deve permitir o usuário informar o IP de saída)
Este campo de IP de saída terá um validador, para ver se o usuário colocou um IP correto em relação ao range de IPs dos Clusters disponíveis. Caso o usuário coloque um IP incorreto, deverá aparecer uma frase de warning: *stakeholder irá mandar o range de IPs
AUX 1 3791.JPG
No card “Dados para teste” deverá conter os seguintes campos:
Protocolo de teste (Campo do tipo dropdown que deve listar todos os protocolos de teste “TCP”, “UDP” e “ICMP". Porém, os protocolos “UDP” e “ICMP" deverão aparecer inabilitados)
IP de destino ou domain (Campo do tipo texto livre que deve permitir o usuário informar o “IP de destino” ou “domain”)
Porta (Campo do tipo alfanumérico deve permitir o usuário informar a Porta de saída)
Botão “+” (Botão, quando acionado, deve permitir a inclusão de mais “IPs” e “Portas”)

Modal Tela 1

Ao finalizar o passo da tela anterior, será aberto um modal da seguinte forma:

Terá o botão “TESTAR” que irá executar o serviço de testes de regra de Firewall
Ao clicar no botão será apresentado um modal com a frase “Teste finalizado! Por favor, acesse a página de histórico para verificar os detalhes.” Indicando ao usuário que a solicitação foi atendida.
Nesse modal a palavra “Histórico” será um hiperlink clicável que irá direcionar o usuário para a tela de histórico com todas as solicitações de regra de Firewall.

Tela 2

A segunda tela será composta da seguinte forma:

O Menu de Histórico terá as colunas da seguinte forma:
                      
Projeto 
IP de origem
IP destino
Porta
Status
Ações
 

Os filtros das colunas funcionarão da seguinte maneira:

Projeto (Campo de texto livre, através do preenchimento deste campo, o sistema deverá filtrar e listar o histórico de testes que correspondam ao texto preenchido)
IP de origem (Campo do tipo alfanumérico, através do preenchimento deste campo, o sistema deverá filtrar e listar o histórico de testes que correspondam ao texto preenchido)
IP destino (Campo do tipo alfanumérico, através do preenchimento deste campo, o sistema deverá filtrar e listar o histórico de testes que correspondam ao texto preenchido)
Porta (Campo do tipo alfanumérico, através do preenchimento deste campo, o sistema deverá filtrar e listar o histórico de testes que correspondam à porta preenchida)
Status (Campo de texto do tipo texto livre, através do preenchimento das opções de Status: “Sucesso” ou “Erro". O sistema deverá filtrar e listar o histórico de testes que correspondam a opção preenchida)
 

A linhas de histórico de testes, devem ser exibidas, de acordo com a combinação de filtros, preenchida. Os seguintes campos devem ser listados na pré-visualização dos testes:

Projeto (Campo de texto que deve exibir o projeto preenchido pelo usuário para o teste em questão.)
IP de Origem (Campo de texto alfanumérico que deve exibir o IP de origem (1.1.1.1), preenchido pelo usuário para o teste em questão.)
IP de destino (Campo de texto alfanumérico que deve exibir o IP de destino (1.1.1.1), preenchido pelo usuário para o teste em questão.)
Porta (Campo de texto alfanumérico que deve exibir a porta preenchida pelo usuário para o teste em questão.)
Status (Campo de texto que deve exibir o status retornado a partir da execução do teste em questão: “Sucesso” ou “Erro".)
Data do teste (Campo de texto que deve exibir a data (DD/MM/AAAA) da execução do teste em questão.)
Ações (Campo de texto que deve exibir o botão “VER MAIS”)
Ver Mais Botão, que quando acionado deve direcionar ao modal com a visão de todas as informações relacionadas ao teste em questão.

Observação: Cada IP e Porta adicionada deve gerar um registro de teste na tela de Histórico. Não deverá ser agrupado mais de um IP e Porta por teste, por exemplo: o usuário colocou 4 IPs e 4 Portas, então gerará 4 registros de testes.

Modal Tela 2

Ao acessar a funcionalidade do botão “VER MAIS”, será aberto um modal contendo as seguintes informações que foram preenchidas pelo usuário e o resulta do teste:

Data de criação (Apresentar o dado preenchido pelo usuário)
Solicitante (Apresentar a matrícula do usuário solicitante)
Opções de teste (Apresentar o dado preenchido pelo usuário)
Cluster (Apresentar o dado selecionado pelo usuário)
Projeto (Apresentar o dado preenchido pelo usuário)
IP saída (Apresentar o dado preenchido pelo usuário)
Protocolo de teste (Apresentar o dado selecionado pelo usuário)
IP de destino ou domain (Apresentar o dado preenchido pelo usuário)
Porta (Apresentar o dado preenchido pelo usuário)
Resultado do teste (Apresentar os dados/log do teste de forma completa)

Observação: Em nenhum campo desta funcionalidade será permitido o input de caracteres especiais (;, %, $, &, |, \ e etc), sendo assim, as strings passadas pelo usuário deverão ser validadas.

Implementação da funcionalidade

Utilizar o Token para se autenticar nos Clusters (OKD4 PRD e OKD4 NPRD) dentro do Kubernets.

Será necessário o arquivo do tipo yaml para a criação do POD de teste. *stakeholder irá definir a estrutura do yaml e a imagem do debug

Para realizar todo o processo da funcionalidade, é necessário um componente no servidor/imagem que roda o PHP, o componente utilizado será o OC. Portanto, é necessário adicionar o OC na imagem usada pelo back-end no InfraFácil (image-registry.openshift-image-registry.svc:5000/openshift/php-portaldevops). *necessário abrirmos uma REQ no GSC para a 36 agilizar essa questão? O stakeholder irá conversar com o time Caixa

Quando o usuário ativar o botão “TESTAR”:

Criar um POD (conforme definido no yaml) de debug no projeto selecionado pelo usuário, a imagem deve ter netcat ou curl;
Esperar o POD ficar no status de pronto (status running), depois disso será possível seguir com o teste;
Selecionar o POD criado e rodar script (netcat ou curl) e retornar o código de status do curl;
Ao finalizar, deletar o POD recém-criado.

Os seguintes retornos serão resumidos da seguinte forma:

Status número 48 representará a seguinte resposta: Sucesso
Status número 28 representará a seguinte resposta: Timeout
Status número 6 representará a seguinte resposta: DNS não encontrado
Status número 7 representará a seguinte resposta: Erro de Proxy

Os demais retornos serão apresentados da seguinte maneira: *estes resultados deverão ser traduzidos e resumidos?

Status número 1 representará a seguinte resposta: Unsupported protocol. This build of curl has no support for this protocol. Usually this happens because the URL was misspelled to use a scheme part that either has a space in front of it or spells http like htpt or similar. Another common mistake is that you use a libcurl installation that was built with one or more protocols disabled and you now ask libcurl to use one of those protocols that were disabled in the build.
Status número 2 representará a seguinte resposta: Failed to initialize. This is mostly an internal error or a problem with the libcurl installation or system libcurl runs in.
Status número 3 representará a seguinte resposta: URL malformed. The syntax was not correct. This happens when you mistype a URL so that it ends up wrong, or in rare situations you are using a URL that is accepted by another tool that curl does not support only because there is no universal URL standard that everyone adheres to.
Status número 4 representará a seguinte resposta: A feature or option that was needed to perform the desired request was not enabled or was explicitly disabled at build-time. To make curl able to do this, you probably need another build of libcurl.
Status número 5 representará a seguinte resposta: Could not resolve proxy. The address of the given proxy host could not be resolved. Either the given proxy name is just wrong, or the DNS server is misbehaving and does not know about this name when it should or perhaps even the system you run curl on is misconfigured so that it does not find/use the correct DNS server.
Status número 8 representará a seguinte resposta: Unknown FTP server response. The server sent data curl could not parse. This is either because of a bug in curl, a bug in the server or because the server is using an FTP protocol extension that curl does not support. The only real work-around for this is to tweak curl options to try to get it to use other FTP commands that perhaps do not get this unknown server response back.
Status número 9 representará a seguinte resposta: FTP access denied. The server denied login or denied access to the particular resource or directory you wanted to reach. Most often you tried to change to a directory that does not exist on the server. The directory of course is what you specify in the URL.
Status número 10 representará a seguinte resposta: FTP accept failed. While waiting for the server to connect back when an active FTP session is used, an error code was sent over the control connection or similar.
Status número 11 representará a seguinte resposta: FTP weird PASS reply. Curl could not parse the reply sent to the PASS request. PASS in the command curl sends the password to the server with, and even anonymous connections to FTP server actually sends a password - a fixed anonymous string. Getting a response back from this command that curl does not understand is a strong indication that this is not an FTP server at all or that the server is badly broken.
Status número 12 representará a seguinte resposta: During an active FTP session (PORT is used) while waiting for the server to connect, the timeout expired. It took too long for the server to get back. This is usually a sign that something is preventing the server from reaching curl successfully, such as a firewall or other network arrangements.
Status número 13 representará a seguinte resposta: Unknown response to FTP PASV command. Curl could not parse the reply sent to the PASV request. This is a strange server. PASV is used to set up the second data transfer connection in passive mode, see the FTP uses two connections section for more on that. You might be able to work-around this problem by using PORT instead, with the --ftp-port option.
Status número 14 representará a seguinte resposta: Unknown FTP 227 format. Curl could not parse the 227-line the server sent. This is most certainly a broken server. A 227 is the FTP server's response when sending back information on how curl should connect back to it in passive mode. You might be able to work-around this problem by using PORT instead, with the --ftp-port option.
Status número 15 representará a seguinte resposta: FTP cannot get host. Could not use the host IP address we got in the 227-line. This is most likely an internal error.
Status número 16 representará a seguinte resposta: HTTP/2 error. A problem was detected in the HTTP2 framing layer. This is somewhat generic and can be one out of several problems, see the error message for details.
Status número 17 representará a seguinte resposta: FTP could not set binary. Could not change transfer method to binary. This server is broken. curl needs to set the transfer to the correct mode before it is started as otherwise the transfer cannot work.
Status número 18 representará a seguinte resposta: Partial file. Only a part of the file was transferred. When the transfer is considered complete, curl verifies that it actually received the same amount of data that it was told before-hand that it was going to get. If the two numbers do not match, this is the error code. It could mean that curl got fewer bytes than advertised or that it got more. curl itself cannot know which number is wrong or which is correct, if any.
Status número 19 representará a seguinte resposta: FTP could not download/access the given file. The RETR (or similar) command failed. curl got an error from the server when trying to download the file.
Status número 20 representará a seguinte resposta: Not used
Status número 21 representará a seguinte resposta: Quote error. A quote command returned an error from the server. curl allows several different ways to send custom commands to an IMAP, POP3, SMTP or FTP server and features a generic check that the commands work. When any of the individually issued commands fails, this is the exit status returned. The advice is generally to watch the headers in the FTP communication to better understand exactly what failed and how.
Status número 22 representará a seguinte resposta: HTTP page not retrieved. The requested URL was not found or returned another error with the HTTP error code being 400 or above. This return code only appears if -f, --fail is used.
Status número 23 representará a seguinte resposta: Write error. Curl could not write data to a local filesystem or similar. curl receives data chunk by chunk from the network and it stores it like at (or writes it to stdout), one piece at a time. If that write action gets an error, this is the exit status.
Status número 24 representará a seguinte resposta: Not used
Status número 25 representará a seguinte resposta: Upload failed. The server refused to accept or store the file that curl tried to send to it. This is usually due to wrong access rights on the server but can also happen due to out of disk space or other resource constraints. This error can happen for many protocols.
Status número 26 representará a seguinte resposta: Read error. Various reading problems. The inverse to exit status 23. When curl sends data to a server, it reads data chunk by chunk from a local file or stdin or similar, and if that reading fails in some way this is the exit status curl returns.
Status número 27 representará a seguinte resposta: Out of memory. A memory allocation request failed. curl needed to allocate more memory than what the system was willing to give it and curl had to exit. Try using smaller files or make sure that curl gets more memory to work with.
Status número 29 representará a seguinte resposta: Not used
Status número 30 representará a seguinte resposta: FTP PORT failed. The PORT command failed. Not all FTP servers support the PORT command; try doing a transfer using PASV instead. The PORT command is used to ask the server to create the data connection by connecting back to curl. See also the FTP uses two connections section.
Status número 31 representará a seguinte resposta: FTP could not use REST. The REST command failed. This command is used for resumed FTP transfers. curl needs to issue the REST command to do range or resumed transfers. The server is broken, try the same operation without range/resume as a crude work-around.
Status número 32 representará a seguinte resposta: Not used
Status número 33 representará a seguinte resposta: HTTP range error. The range request did not work. Resumed HTTP requests are not necessarily acknowledged or supported, so this exit code signals that for this resource on this server, there can be no range or resumed transfers.
Status número 34 representará a seguinte resposta: HTTP post error. Internal post-request generation error. If you get this error, please report the exact circumstances to the curl project.
Status número 35 representará a seguinte resposta: A TLS/SSL connect error. The SSL handshake failed. The SSL handshake can fail due to numerous different reasons so the error message may offer some additional clues. Maybe the parties could not agree to a SSL/TLS version, an agreeable cipher suite or similar.
Status número 36 representará a seguinte resposta: Bad download resume. Could not continue an earlier aborted download. When asking to resume a transfer that then ends up not possible to do, this error can get returned. For FILE, FTP or SFTP.
Status número 37 representará a seguinte resposta: Could not read the given file when using the FILE:// scheme. Failed to open the file. The file could be non-existing or is it a permission problem perhaps?
Status número 38 representará a seguinte resposta: LDAP cannot bind. LDAP "bind" operation failed, which is a necessary step in the LDAP operation and thus this means the LDAP query could not be performed. This might happen because of a wrong username or password, or for other reasons.
Status número 39 representará a seguinte resposta: LDAP search failed. The given search terms caused the LDAP search to return an error.
Status número 40 representará a seguinte resposta: Not used
Status número 41 representará a seguinte resposta: Not used
Status número 42 representará a seguinte resposta: Aborted by callback. An application told libcurl to abort the operation. This error code is not generally made visible to users and not to users of the curl tool.
Status número 43 representará a seguinte resposta: Bad function argument. A function was called with a bad parameter - this return code is present to help application authors to understand why libcurl cannot perform certain actions and should never be returned by the curl tool. Please file a bug report to the curl project if this happens to you.
Status número 44 representará a seguinte resposta: Not used
Status número 45 representará a seguinte resposta: Interface error. A specified outgoing network interface could not be used. curl typically decides outgoing network and IP addresses by itself but when explicitly asked to use a specific one that curl cannot use, this error can occur.
Status número 46 representará a seguinte resposta: Not used
Status número 47 representará a seguinte resposta: Too many redirects. When following HTTP redirects, libcurl hit the maximum number set by the application. The maximum number of redirects is unlimited by libcurl but is set to 50 by default by the curl tool. The limit is present to stop endless redirect loops. Change the limit with --max-redirs.
Status número 49 representará a seguinte resposta: Malformed telnet option. The telnet option you provided to curl did not use the correct syntax.
Status número 50 representará a seguinte resposta: Not used
Status número 51 representará a seguinte resposta: The server's SSL/TLS certificate or SSH fingerprint failed verification. curl can then not be sure of the server being who it claims to be. See the using TLS with curl and using SCP and SFTP with curl sections for more details.
Status número 52 representará a seguinte resposta: The server did not reply anything, which in this context is considered an error. When an HTTP(S) server responds to an HTTP(S) request, it always returns something as long as it is alive and sound. All valid HTTP responses have a status line and responses header. Not getting anything at all back is an indication the server is faulty or perhaps that something prevented curl from reaching the right server or that you are trying to connect to the wrong port number etc.
Status número 53 representará a seguinte resposta: SSL crypto engine not found.
Status número 54 representará a seguinte resposta: Cannot set SSL crypto engine as default.
Status número 55 representará a seguinte resposta: Failed sending network data. Sending data over the network is a crucial part of most curl operations and when curl gets an error from the lowest networking layers that the sending failed, this exit status gets returned. To pinpoint why this happens, some serious digging is usually required. Start with enabling verbose mode, do tracing and if possible check the network traffic with a tool like Wireshark or similar.
Status número 56 representará a seguinte resposta: Failure in receiving network data. Receiving data over the network is a crucial part of most curl operations and when curl gets an error from the lowest networking layers that the receiving of data failed, this exit status gets returned. To pinpoint why this happens, some serious digging is usually required. Start with enabling verbose mode, do tracing and if possible check the network traffic with a tool like Wireshark or similar.
Status número 57 representará a seguinte resposta: Not used
Status número 58 representará a seguinte resposta: Problem with the local certificate. The client certificate had a problem so it could not be used. Permissions? The wrong passphrase?
Status número 59 representará a seguinte resposta: Could not use the specified SSL cipher. The cipher names need to be specified exactly and they are also unfortunately specific to the particular TLS backend curl has been built to use. For the current list of support ciphers and how to write them, see the online docs at https://curl.se/docs/ssl-ciphers.html.
Status número 60 representará a seguinte resposta: Peer certificate cannot be authenticated with known CA certificates. This usually means that the certificate is either self-signed or signed by a CA (Certificate Authority) that is not present in the CA store curl uses.
Status número 61 representará a seguinte resposta: Unrecognized transfer encoding. Content received from the server could not be parsed by curl.
Status número 62 representará a seguinte resposta: Not used
Status número 63 representará a seguinte resposta: Maximum file size exceeded. When curl has been told to restrict downloads to not do it if the file is too big, this is the exit code for that condition.
Status número 64 representará a seguinte resposta: Requested SSL (TLS) level failed. In most cases this means that curl failed to upgrade the connection to TLS when asked to.
Status número 65 representará a seguinte resposta: Sending the data requires a rewind that failed. In some situations curl needs to rewind in order to send the data again and if this cannot be done, the operation fails.
Status número 66 representará a seguinte resposta: Failed to initialize the OpenSSL SSL Engine. This can only happen when OpenSSL is used and would signify a serious internal problem.
Status número 67 representará a seguinte resposta: The username, password, or similar was not accepted and curl failed to log in. Verify that the credentials are provided correctly and that they are encoded the right way.
Status número 68 representará a seguinte resposta: File not found on TFTP server.
Status número 69 representará a seguinte resposta: Permission problem on TFTP server.
Status número 70 representará a seguinte resposta: Out of disk space on TFTP server.
Status número 71 representará a seguinte resposta: Illegal TFTP operation.
Status número 72 representará a seguinte resposta: Unknown TFTP transfer ID.
Status número 73 representará a seguinte resposta: File already exists (TFTP).
Status número 74 representará a seguinte resposta: No such user (TFTP).
Status número 75 representará a seguinte resposta: Not used
Status número 76 representará a seguinte resposta: Not used
Status número 77 representará a seguinte resposta: Problem with reading the SSL CA cert. The default or specified CA cert bundle could not be read/used to verify the server certificate.
Status número 78 representará a seguinte resposta: The resource (file) referenced in the URL does not exist.
Status número 79 representará a seguinte resposta: An unspecified error occurred during the SSH session. This sometimes indicates an incompatibility problem between the SSH libcurl curl uses and the SSH version used by the server curl speaks to.
Status número 80 representará a seguinte resposta: Failed to shut down the SSL connection.
Status número 81 representará a seguinte resposta: Not used
Status número 82 representará a seguinte resposta: Could not load CRL file, missing or wrong format
Status número 83 representará a seguinte resposta: TLS certificate issuer check failed. The most common reason for this is that the server did not send the proper intermediate certificate in the TLS handshake.
Status número 84 representará a seguinte resposta: The FTP PRET command failed. This is a non-standard command and far from all servers support it.
Status número 85 representará a seguinte resposta: RTSP: mismatch of CSeq numbers
Status número 86 representará a seguinte resposta: RTSP: mismatch of Session Identifiers
Status número 87 representará a seguinte resposta: Unable to parse FTP file list. The FTP directory listing format used by the server could not be parsed by curl. FTP wildcards can not be used on this server.
Status número 88 representará a seguinte resposta: FTP chunk callback reported error
Status número 89 representará a seguinte resposta: No connection available, the session is queued
Status número 90 representará a seguinte resposta: SSL public key does not match pinned public key. Either you provided a bad public key, or the server has changed.
Status número 91 representará a seguinte resposta: Invalid SSL certificate status. The server did not provide a proper valid certificate in the TLS handshake.
Status número 92 representará a seguinte resposta: Stream error in HTTP/2 framing layer. This is usually an unrecoverable error, but trying to force curl to speak HTTP/1 instead might circumvent it.
Status número 93 representará a seguinte resposta: An API function was called from inside a callback. If the curl tool returns this, something has gone wrong internally
Status número 94 representará a seguinte resposta: Authentication error.
Status número 95 representará a seguinte resposta: HTTP/3 layer error. This is somewhat generic and can be one out of several problems, see the error message for details.
Status número 96 representará a seguinte resposta: QUIC connection error. This error may be caused by an TLS library error. QUIC is the transport protocol used for HTTP/3.
Status número 97 representará a seguinte resposta: Proxy handshake error. Usually that means that a SOCKS proxy did not play along.
Status número 98 representará a seguinte resposta: A TLS client certificate is required but was not provided.
Status número 99 representará a seguinte resposta: An internal call to poll() or select() returned error that is not recoverable.

Exemplo de uma chamada com sucesso (status 48):

{

                .\oc.exe exec -n infradevops-des -c infradevops-wikifacil-des infradevops-wikifacil-des-3-8rgjj -- /bin/sh -c 'curl -t "DUMMY=1" -s --connect-timeout 2 telnet://regras.telecom.caixa:443 </dev/null >/dev/null 2>&1; echo $?'

}


Exemplo da estrutura do código com as posições dos parâmetros informados:

.\oc.exe exec -n {{projeto}} {{pod criado}} -- /bin/sh -c 'curl -t "DUMMY=1" -s --connect-timeout 2 telnet://{{destino}}:{{porta}} </dev/null >/dev/null 2>&1; echo $?'


Deverá ser implementado um comportamento de hold para que quando um usuário solicite um teste não afete a solicitação de outro usuário que está com o teste em andamento. Então deverá ser criada uma rotina, com fila, para que as solicitações não sejam impactadas.


Comandos no OKD

Abaixo seguem os comandos para serem utilizados no OKD: * o stakeholder irá encaminhar os comandos

Login:
Criar POD:
Executar função:
Deletar POD:
Listar projeto:

Esboço da implementação

