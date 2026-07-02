
[p585600@caddeapllx2577 ~]$ find / -iname "siarg.war*" -newermt "2026-07-02 00:00" 2>/dev/null
[p585600@caddeapllx2577 ~]$
[p585600@caddeapllx2577 ~]$
[p585600@caddeapllx2577 ~]$
[p585600@caddeapllx2577 ~]$
[p585600@caddeapllx2577 ~]$ find /opt/jboss-eap -newermt "2026-07-02 00:00" 2>/dev/null
/opt/jboss-eap/standalone/configuration/standalone_xml_history
/opt/jboss-eap/standalone/tmp
/opt/jboss-eap/standalone/tmp/vfs
/opt/jboss-eap/standalone/tmp/vfs/temp
/opt/jboss-eap/modules/system/layers/base/com/microsoft
/opt/jboss-eap/modules/system/layers/base/com/microsoft/sqlserver
/opt/jboss-eap/modules/system/layers/base/com/microsoft/sqlserver/main
/opt/jboss-eap/modules/system/layers/base/com/microsoft/sqlserver/main/mssql-jdbc-7.4.1.jre8.jar
/opt/jboss-eap/modules/system/layers/base/com/microsoft/sqlserver/main/module.xml
/opt/jboss-eap/modules/system/layers/base/org
/opt/jboss-eap/modules/system/layers/base/org/postgresql
/opt/jboss-eap/modules/system/layers/base/org/postgresql/main
/opt/jboss-eap/modules/system/layers/base/org/postgresql/main/postgresql-42.2.25.jar
/opt/jboss-eap/modules/system/layers/base/org/postgresql/main/module.xml
[p585600@caddeapllx2577 ~]$
[p585600@caddeapllx2577 ~]$
[p585600@caddeapllx2577 ~]$
[p585600@caddeapllx2577 ~]$
[p585600@caddeapllx2577 ~]$
[p585600@caddeapllx2577 ~]$
[p585600@caddeapllx2577 ~]$ find /tmp /home -iname "siarg" 2>/dev/null
[p585600@caddeapllx2577 ~]$ hostname hostname -I
Usage: hostname [-b] {hostname|-F file}         set host name (from file)
       hostname [-a|-A|-d|-f|-i|-I|-s|-y]       display formatted name
       hostname                                 display host name

       {yp,nis,}domainname {nisdomain|-F file}  set NIS domain name (from file)
       {yp,nis,}domainname                      display NIS domain name

       dnsdomainname                            display dns domain name

       hostname -V|--version|-h|--help          print info and exit

Program name:
       {yp,nis,}domainname=hostname -y
       dnsdomainname=hostname -d

Program options:
    -a, --alias            alias names
    -A, --all-fqdns        all long host names (FQDNs)
    -b, --boot             set default hostname if none available
    -d, --domain           DNS domain name
    -f, --fqdn, --long     long host name (FQDN)
    -F, --file             read host name or NIS domain name from given file
    -i, --ip-address       addresses for the host name
    -I, --all-ip-addresses all addresses for the host
    -s, --short            short host name
    -y, --yp, --nis        NIS/YP domain name

Description:
   This command can get or set the host name or the NIS domain name. You can
   also get the DNS domain or the FQDN (fully qualified domain name).
   Unless you are using bind or NIS for host lookups you can change the
   FQDN (Fully Qualified Domain Name) and the DNS domain name (which is
   part of the FQDN) in the /etc/hosts file.
[p585600@caddeapllx2577 ~]$ hostname -I
10.116.201.44 192.168.242.114
[p585600@caddeapllx2577 ~]$



O DEPLOY E NESSA MAQUINA MESMO



2026-07-02T17:22:18.8094432Z ##[section]Starting: Deploy Pacote no JBOSS
2026-07-02T17:22:18.8097674Z ==============================================================================
2026-07-02T17:22:18.8097754Z Task         : Bash
2026-07-02T17:22:18.8097795Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-07-02T17:22:18.8097868Z Version      : 3.227.0
2026-07-02T17:22:18.8097910Z Author       : Microsoft Corporation
2026-07-02T17:22:18.8097959Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-07-02T17:22:18.8098041Z ==============================================================================
2026-07-02T17:22:19.7577000Z Generating script.
2026-07-02T17:22:19.7584670Z Script contents:
2026-07-02T17:22:19.7585937Z ansible-playbook /opt/ads-agent/_work/r14466/a/esteira-jboss-vm-v2/site.yml --tags deploy -e sistema_ambiente=des -e quantidade_vm=$(quantidade_vm) -e url_deploy="`echo "http://binario.caixa:8081/repository/releases/br/gov/caixa/gitecsa/siarg/2.0.0.5/siarg-2.0.0.5.war" | tr -d "\'"`" -e package_path=/opt/ads-agent/_work/r14466/a/binario/`basename http://binario.caixa:8081/repository/releases/br/gov/caixa/gitecsa/siarg/2.0.0.5/siarg-2.0.0.5.war` -e package_hash=$(HASH_BUILD) -e http_context_default=siarg -e site=ctc_nprd
2026-07-02T17:22:19.7588815Z ========================== Starting Command Output ===========================
2026-07-02T17:22:19.7595467Z [command]/bin/bash /opt/ads-agent/_work/_temp/6e442ff1-1fd2-4ef2-be98-d1958d3e0e25.sh
2026-07-02T17:22:19.7654071Z /opt/ads-agent/_work/_temp/6e442ff1-1fd2-4ef2-be98-d1958d3e0e25.sh: line 1: quantidade_vm: comando não encontrado
2026-07-02T17:22:19.7689444Z /opt/ads-agent/_work/_temp/6e442ff1-1fd2-4ef2-be98-d1958d3e0e25.sh: line 1: HASH_BUILD: comando não encontrado
2026-07-02T17:22:21.9132407Z 
2026-07-02T17:22:21.9133108Z PLAY [local] *******************************************************************
2026-07-02T17:22:21.9429035Z 
2026-07-02T17:22:21.9429582Z PLAY [Configurando o DNS] ******************************************************
2026-07-02T17:22:22.1377988Z 
2026-07-02T17:22:22.1378658Z PLAY [local] *******************************************************************
2026-07-02T17:22:22.1416355Z 
2026-07-02T17:22:22.1417130Z PLAY [Verificando serviços] ****************************************************
2026-07-02T17:22:22.1509491Z 
2026-07-02T17:22:22.1511036Z PLAY [Configuração LDAP] *******************************************************
2026-07-02T17:22:22.1542701Z [WARNING]: Found variable using reserved name: when
2026-07-02T17:22:22.1547472Z 
2026-07-02T17:22:22.1548015Z PLAY [jboss] *******************************************************************
2026-07-02T17:22:22.1637500Z 
2026-07-02T17:22:22.1638276Z PLAY [Stack Jboss] *************************************************************
2026-07-02T17:22:22.1893579Z Thursday 02 July 2026  14:22:22 -0300 (0:00:00.337)       0:00:00.337 ********* 
2026-07-02T17:22:22.7428001Z 
2026-07-02T17:22:22.7429300Z TASK [Verifica ser o Jboss já foi instalado] ***********************************
2026-07-02T17:22:22.7429921Z [DEPRECATION WARNING]: Distribution rhel 9.3 on host 
2026-07-02T17:22:22.7430167Z caddeapllx2577.agil.nprd.caixa.gov.br should use /usr/libexec/platform-python, 
2026-07-02T17:22:22.7430342Z but is using /usr/bin/python for backward compatibility with prior Ansible 
2026-07-02T17:22:22.7430504Z releases. A future Ansible release will default to using the discovered 
2026-07-02T17:22:22.7432988Z platform python for this host. See https://docs.ansible.com/ansible/2.9/referen
2026-07-02T17:22:22.7433292Z ce_appendices/interpreter_discovery.html for more information. This feature 
2026-07-02T17:22:22.7433683Z will be removed in version 2.12. Deprecation warnings can be disabled by 
2026-07-02T17:22:22.7434300Z setting deprecation_warnings=False in ansible.cfg.
2026-07-02T17:22:22.7434449Z ok: [caddeapllx2577.agil.nprd.caixa.gov.br]
2026-07-02T17:22:22.7456992Z 
2026-07-02T17:22:22.7457436Z PLAY [jboss] *******************************************************************
2026-07-02T17:22:22.7500266Z 
2026-07-02T17:22:22.7500943Z PLAY [jboss] *******************************************************************
2026-07-02T17:22:22.7542154Z 
2026-07-02T17:22:22.7542504Z PLAY [jboss] *******************************************************************
2026-07-02T17:22:22.7567577Z 
2026-07-02T17:22:22.7568230Z PLAY [Copiando deployments adicionais] *****************************************
2026-07-02T17:22:22.7597644Z 
2026-07-02T17:22:22.7598142Z PLAY [Copiando modules adicionais] *********************************************
2026-07-02T17:22:22.7625277Z 
2026-07-02T17:22:22.7625607Z PLAY [jboss] *******************************************************************
2026-07-02T17:22:22.7661756Z 
2026-07-02T17:22:22.7662097Z PLAY [jboss] *******************************************************************
2026-07-02T17:22:22.7699435Z Thursday 02 July 2026  14:22:22 -0300 (0:00:00.580)       0:00:00.917 ********* 
2026-07-02T17:22:23.6946753Z 
2026-07-02T17:22:23.6947679Z TASK [Gathering Facts] *********************************************************
2026-07-02T17:22:23.6947910Z ok: [caddeapllx2577.agil.nprd.caixa.gov.br]
2026-07-02T17:22:23.7140601Z Thursday 02 July 2026  14:22:23 -0300 (0:00:00.943)       0:00:01.861 ********* 
2026-07-02T17:22:24.1052487Z 
2026-07-02T17:22:24.1052966Z TASK [Get path of deploy] ******************************************************
2026-07-02T17:22:24.1053530Z changed: [caddeapllx2577.agil.nprd.caixa.gov.br] => (item=http://binario.caixa:8081/repository/releases/br/gov/caixa/gitecsa/siarg/2.0.0.5/siarg-2.0.0.5.war)
2026-07-02T17:22:24.1213495Z Thursday 02 July 2026  14:22:24 -0300 (0:00:00.407)       0:00:02.268 ********* 
2026-07-02T17:22:24.1801949Z 
2026-07-02T17:22:24.1802737Z TASK [set package_urls] ********************************************************
2026-07-02T17:22:24.1803417Z ok: [caddeapllx2577.agil.nprd.caixa.gov.br]
2026-07-02T17:22:24.1975465Z Thursday 02 July 2026  14:22:24 -0300 (0:00:00.076)       0:00:02.345 ********* 
2026-07-02T17:22:24.6291714Z 
2026-07-02T17:22:24.6292255Z TASK [reload systemctl] ********************************************************
2026-07-02T17:22:24.6293660Z changed: [caddeapllx2577.agil.nprd.caixa.gov.br]
2026-07-02T17:22:24.6496522Z Thursday 02 July 2026  14:22:24 -0300 (0:00:00.452)       0:00:02.797 ********* 
2026-07-02T17:22:25.0901248Z 
2026-07-02T17:22:25.0901809Z TASK [Verifica o se package existe] ********************************************
2026-07-02T17:22:25.0902239Z ok: [caddeapllx2577.agil.nprd.caixa.gov.br] => (item=/opt/ads-agent/_work/r14466/a/binario/siarg-2.0.0.5.war)
2026-07-02T17:22:25.1053047Z Thursday 02 July 2026  14:22:25 -0300 (0:00:00.455)       0:00:03.253 ********* 
2026-07-02T17:22:26.0822085Z 
2026-07-02T17:22:26.0822612Z TASK [Deploy do pacote Local] **************************************************
2026-07-02T17:22:26.0823035Z ok: [caddeapllx2577.agil.nprd.caixa.gov.br] => (item=/opt/ads-agent/_work/r14466/a/binario/siarg-2.0.0.5.war)
2026-07-02T17:22:26.1012069Z Thursday 02 July 2026  14:22:26 -0300 (0:00:00.995)       0:00:04.248 ********* 
2026-07-02T17:22:26.3779698Z 
2026-07-02T17:22:26.3780437Z TASK [Verifica se o arquivo /opt/jboss-eap/standalone/configuration/custom-deploy.sh existe] ***
2026-07-02T17:22:26.3780625Z ok: [caddeapllx2577.agil.nprd.caixa.gov.br]
2026-07-02T17:22:26.3935195Z Thursday 02 July 2026  14:22:26 -0300 (0:00:00.292)       0:00:04.541 ********* 
2026-07-02T17:22:26.4494161Z Thursday 02 July 2026  14:22:26 -0300 (0:00:00.055)       0:00:04.597 ********* 
2026-07-02T17:22:27.1530792Z 
2026-07-02T17:22:27.1531778Z TASK [Garante que o Jboss esteja startado] *************************************
2026-07-02T17:22:27.1531987Z ok: [caddeapllx2577.agil.nprd.caixa.gov.br]
2026-07-02T17:22:27.1569407Z 
2026-07-02T17:22:27.1569760Z PLAY [jboss] *******************************************************************
2026-07-02T17:22:27.1603272Z 
2026-07-02T17:22:27.1603551Z PLAY [jboss] *******************************************************************
2026-07-02T17:22:27.1630416Z 
2026-07-02T17:22:27.1658726Z PLAY [jboss] *******************************************************************
2026-07-02T17:22:27.1658811Z 
2026-07-02T17:22:27.1658943Z PLAY [local] *******************************************************************
2026-07-02T17:22:27.1683509Z [WARNING]: Could not match supplied host pattern, ignoring: instance_restart
2026-07-02T17:22:27.1686409Z 
2026-07-02T17:22:27.1686604Z PLAY [instance_restart] ********************************************************
2026-07-02T17:22:27.1686848Z skipping: no hosts matched
2026-07-02T17:22:27.1690237Z [WARNING]: Could not match supplied host pattern, ignoring: machine_reboot
2026-07-02T17:22:27.1692735Z 
2026-07-02T17:22:27.1693208Z PLAY [machine_reboot] **********************************************************
2026-07-02T17:22:27.1693507Z skipping: no hosts matched
2026-07-02T17:22:27.1699679Z 
2026-07-02T17:22:27.1699945Z PLAY [local] *******************************************************************
2026-07-02T17:22:27.1726970Z [WARNING]: Could not match supplied host pattern, ignoring: instance_stop
2026-07-02T17:22:27.1730188Z 
2026-07-02T17:22:27.1730553Z PLAY [instance_stop] ***********************************************************
2026-07-02T17:22:27.1731002Z skipping: no hosts matched
2026-07-02T17:22:27.1732643Z 
2026-07-02T17:22:27.1733061Z PLAY [machine_reboot] **********************************************************
2026-07-02T17:22:27.1733278Z skipping: no hosts matched
2026-07-02T17:22:27.1741275Z 
2026-07-02T17:22:27.1741541Z PLAY [Configura TSM] ***********************************************************
2026-07-02T17:22:27.1775596Z 
2026-07-02T17:22:27.1775919Z PLAY [jboss] *******************************************************************
2026-07-02T17:22:27.1800075Z 
2026-07-02T17:22:27.1807991Z PLAY [Configura Control-M] *****************************************************
2026-07-02T17:22:27.1850284Z 
2026-07-02T17:22:27.1850815Z PLAY [jboss] *******************************************************************
2026-07-02T17:22:27.1889938Z 
2026-07-02T17:22:27.1890415Z PLAY [jboss] *******************************************************************
2026-07-02T17:22:27.1934531Z 
2026-07-02T17:22:27.1934758Z PLAY [jboss] *******************************************************************
2026-07-02T17:22:27.1961656Z 
2026-07-02T17:22:27.1962215Z PLAY [jboss] *******************************************************************
2026-07-02T17:22:27.1993544Z 
2026-07-02T17:22:27.1994121Z PLAY [localhost] ***************************************************************
2026-07-02T17:22:27.2022516Z 
2026-07-02T17:22:27.2022837Z PLAY [jboss] *******************************************************************
2026-07-02T17:22:27.2067713Z 
2026-07-02T17:22:27.2068492Z PLAY [jboss] *******************************************************************
2026-07-02T17:22:27.2109138Z 
2026-07-02T17:22:27.2109619Z PLAY [jboss] *******************************************************************
2026-07-02T17:22:27.2140547Z 
2026-07-02T17:22:27.2141077Z PLAY RECAP *********************************************************************
2026-07-02T17:22:27.2141707Z caddeapllx2577.agil.nprd.caixa.gov.br : ok=9    changed=2    unreachable=0    failed=0    skipped=1    rescued=0    ignored=0   
2026-07-02T17:22:27.2142986Z 
2026-07-02T17:22:27.2145270Z Thursday 02 July 2026  14:22:27 -0300 (0:00:00.764)       0:00:05.361 ********* 
2026-07-02T17:22:27.2145514Z =============================================================================== 
2026-07-02T17:22:27.2146209Z Deploy do pacote Local -------------------------------------------------- 1.00s
2026-07-02T17:22:27.2147342Z Gathering Facts --------------------------------------------------------- 0.94s
2026-07-02T17:22:27.2148058Z Garante que o Jboss esteja startado ------------------------------------- 0.76s
2026-07-02T17:22:27.2148977Z Verifica ser o Jboss já foi instalado ----------------------------------- 0.58s
2026-07-02T17:22:27.2149199Z Verifica o se package existe -------------------------------------------- 0.46s
2026-07-02T17:22:27.2149676Z reload systemctl -------------------------------------------------------- 0.45s
2026-07-02T17:22:27.2149906Z Get path of deploy ------------------------------------------------------ 0.41s
2026-07-02T17:22:27.2150149Z Verifica se o arquivo /opt/jboss-eap/standalone/configuration/custom-deploy.sh existe --- 0.29s
2026-07-02T17:22:27.2150381Z set package_urls -------------------------------------------------------- 0.08s
2026-07-02T17:22:27.2150606Z Executa shell customizada do deploy ------------------------------------- 0.06s
2026-07-02T17:22:27.2150752Z Playbook run took 0 days, 0 hours, 0 minutes, 5 seconds
2026-07-02T17:22:27.2809683Z ##[section]Finishing: Deploy Pacote no JBOSS


