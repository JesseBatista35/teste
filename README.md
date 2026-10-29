Boa tarde!

Respondendo às dúvidas:

Redes acessíveis: sim, o storage possui interfaces na rede corporativa de dados, que é por onde normalmente os compartilhamentos SMB são acessados pelas estações. A rede de backup NPRD (10.188.0.0/16) é usada para a comunicação entre servidores, como os nós do OKD e o storage. Qual interface o share fs_sisib_smb deve usar é definido pela equipe de Armazenamento. Para confirmarmos se a sua estação alcança o servidor, você pode executar no PowerShell:
nslookup nprdsmb01.ad.caixa
Test-NetConnection nprdsmb01.ad.caixa -Port 445
e nos enviar o resultado.
IPs da DSP1: a inclusão dos IPs do mainframe não interfere no acesso pela estação. Ela é necessária apenas para que o mainframe acesse o compartilhamento NFS. O acesso pela estação depende de a rede estar acessível e de o share SMB estar com permissão para as matrículas responsáveis.

Sugerimos abrir uma requisição para a equipe de Armazenamento, referenciando a REQ000146870898, solicitando:

a liberação do acesso SMB ao \\nprdsmb01.ad.caixa\fs_sisib_smb a partir das estações, com permissão para as matrículas c161778 e c131457;
se a integração com o mainframe for necessária, a inclusão dos IPs da partição DSP1 na nova rede de backup NPRD.

Atenciosamente,


