eles devolveram a demadna
Esta solicitação não se refere a DNS, conforme foi respondido anteriormente.

Se trata de uma configuração de Proxy/Reverse nos servidores Apache que atendem ao sistema SIBAR.

O atendimento desta solicitação deve ser o mesmo que foi dado à REQ000145144426 - WO0000081295147.

Pedimos, por favor, encaminhar para a equipe Multiplataforma - Apache.

quem atendue a ultima foi um ananlsia do meu time segue atendimento dele



Histórico de Informações de Trabalho da Ordem de Trabalho
ID da Ordem de Trabalho	 WO0000081295147
Criado em	 05/08/2026 21:55:29
Criado por	 P744064
Origem de Comunicação	 
Exibir Acesso	 Público
Notas	 Boa noite!

Informamos que os ajustes foram feitos conforme segue:

- bkp:

[root@cx0000lx128 sibar]# md5sum /opt/apache/conf.d/sibar/sibar/proxy.conf /opt/apache/conf.d/sibar/sibar/backup/proxy.conf.20260805
09fb8f73f867da4e45279d7a532b0c1b  /opt/apache/conf.d/sibar/sibar/proxy.conf
09fb8f73f867da4e45279d7a532b0c1b  /opt/apache/conf.d/sibar/sibar/backup/proxy.conf.20260805
[root@cx0000lx128 sibar]#

[root@ssptqaprlx0025 conf.d]# md5sum /opt/apache/2.2/etc/conf.d/sibar.conf /opt/apache/2.2/etc/conf.d/backup/sibar.conf.20260805
912c86bd698ab7b0fdd2d91e40a22214  /opt/apache/2.2/etc/conf.d/sibar.conf
912c86bd698ab7b0fdd2d91e40a22214  /opt/apache/2.2/etc/conf.d/backup/sibar.conf.20260805
[root@ssptqaprlx0025 conf.d]#

- Ajuste efetuado:

[root@cx0000lx128 sibar]# diff /opt/apache/conf.d/sibar/sibar/proxy.conf /opt/apache/conf.d/sibar/sibar/backup/proxy.conf.20260805
382,384d381
<     ProxyPass /sibar/cartao-debito https://ibmspdes.caixa:7081/sibar/cartao-debito
<     ProxyPassReverse /sibar/cartao-debito https://ibmspdes.caixa:7081/sibar/cartao-debito
[root@cx0000lx128 sibar]#

[root@ssptqaprlx0025 conf.d]# diff /opt/apache/2.2/etc/conf.d/sibar.conf /opt/apache/2.2/etc/conf.d/backup/sibar.conf.20260805
90,92d89
<     ProxyPass /sibar/cartao-debito https://ibmsptqs.caixa:7081/sibar/cartao-debito
<     ProxyPassReverse /sibar/cartao-debito https://ibmsptqs.caixa:7081/sibar/cartao-debito
199,201d195
<     ProxyPass /sibar/cartao-debito https://ibmsptqs.caixa:7081/sibar/cartao-debito
<     ProxyPassReverse /sibar/cartao-debito https://ibmsptqs.caixa:7081/sibar/cartao-debito
[root@ssptqaprlx0025 conf.d]#

Obs. Apaches no ar.

At.te,

Wellington Silva
ID da Ordem de Trabalho	 WO0000081295147
Criado em	 05/08/2026 17:52:41
Criado por	 P779123
Origem de Comunicação	 
Exibir Acesso	 Público
Notas	 Demanda inicial sem viés de falha, erro, degradação ou esgotamento de infraestrutura, serviço, máquina, armazenamento, rotina ou situação que não esteja na iminência de tornar-se incidente. Previsto atendimento em até 24 horas.[CENTRAL-SID]
OBS: Saneamento realizado considerando a nota anterior da equipe técnica que informa atendimento em até 24 horas
ID da Ordem de Trabalho	 WO0000081295147
Criado em	 05/08/2026 15:28:48
Criado por	 P558217
Origem de Comunicação	 
Exibir Acesso	 Público
Notas	 Prezado(a),



Informamos que sua solicitação foi recebida.  



Nosso SLA para atendimento é de até 24h úteis, analisaremos a solicitação para nos certificarmos que o atendimento está dentro do escopo de atuação da nossa equipe.



Caso seja identificado que o atendimento não corresponde ao nosso escopo, a solicitação será redirecionada à equipe responsável.



Novas informações e atualizações serão registradas diretamente nesta WO.



Atte.



Esteira Devops DES TQS NPRD
ID da Ordem de Trabalho	 WO0000081295147
Criado em	 05/08/2026 14:54:42
Criado por	 C077162
Origem de Comunicação	 
Exibir Acesso	 Público
Notas	 Anexo do Registro de Solicitação.
ID da Ordem de Trabalho	 WO0000081295147
Criado em	 05/08/2026 14:54:40
Criado por	 Remedy Application Service
Origem de Comunicação	 E-mail
Exibir Acesso	 Interno
Notas	 Este ticket foi criado a partir do sistema de solicitação de serviço.
Impresso por P585600 em Terça-feira, 08/09/2026 15:13:14
