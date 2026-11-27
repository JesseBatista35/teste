
[root@cxextrlx038 p585600]#
[root@cxextrlx038 p585600]#
[root@cxextrlx038 p585600]#
[root@cxextrlx038 p585600]#
[root@cxextrlx038 p585600]# cp -p /etc/hosts /etc/hosts.bkp_20261127
[root@cxextrlx038 p585600]#
[root@cxextrlx038 p585600]#
[root@cxextrlx038 p585600]# echo "10.116.200.250  caddeapllx2501  caddeapllx2501.agil.nprd.caixa.gov.br" >> /etc/hosts
[root@cxextrlx038 p585600]#
[root@cxextrlx038 p585600]#
[root@cxextrlx038 p585600]#
[root@cxextrlx038 p585600]# getent hosts caddeapllx2501.agil.nprd.caixa.gov.br
10.116.200.250  caddeapllx2501 caddeapllx2501.agil.nprd.caixa.gov.br
[root@cxextrlx038 p585600]#
[root@cxextrlx038 p585600]# getent hosts caddeapllx2501
10.116.200.250  caddeapllx2501 caddeapllx2501.agil.nprd.caixa.gov.br
[root@cxextrlx038 p585600]#
[root@cxextrlx038 p585600]#
[root@cxextrlx038 p585600]# su - controlm
Last login: Thu Nov 26 12:55:01 -03 2026
cxextrlx038.desenvolvimento.extracaixa%
cxextrlx038.desenvolvimento.extracaixa%
cxextrlx038.desenvolvimento.extracaixa% ctm_agstat -LIST caddeapllx2501.agil.nprd.caixa.gov.br

Time Stamp :
-------------
11/27/2026 11:18:09

Agent caddeapllx2501.agil.nprd.caixa.gov.br is Discovering
cxextrlx038.desenvolvimento.extracaixa% ctmping -HOSTID caddeapllx2501.agil.nprd.caixa.gov.br -DISCOVER Y

The host type for host ID caddeapllx2501.agil.nprd.caixa.gov.br is unknown. Please wait for the host discovery to complete.
cxextrlx038.desenvolvimento.extracaixa% ctm_agstat -LIST caddeapllx2501.agil.nprd.caixa.gov.br

Time Stamp :
-------------
11/27/2026 11:18:10

Agent caddeapllx2501.agil.nprd.caixa.gov.br is Discovering
cxextrlx038.desenvolvimento.extracaixa%
cxextrlx038.desenvolvimento.extracaixa%
