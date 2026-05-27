
[p585600@sspdeapllx0041 ~]$ sudo -l
Matching Defaults entries for p585600 on this host:
    passprompt=Senha SUDO:, env_keep+=SSH_AUTH_SOCK, lecture=always, editor=/usr/bin/vim, logfile=/var/log/sudo, log_year, loglinelen=10000, listpw=never, env_keep+=SSH_AUTH_SOCK, log_host, log_year,
    logfile=/var/log/sudo, lecture=always, badpass_message="Senha Incorreta, tente novamente", passwd_tries=3, insults, iolog_dir=/var/log/sudo-io/%{user}

User p585600 may run the following commands on this host:
    (apache, backpost, ccvhmp01, cef, corprd01, cpahmp01, cpaprd01, ctmage63, ctmage70, ecaixap, ecphmp01, ecpprd01, fnsusr01, gdjprd01, ibcprd01, ifehmp01, ifeprd01, ifmprd01, ihsadmin, jboss,
    jboss4, jboss5, jboss6, maven, nexus, orabid, oracle, orapid, orascd, orasol, postgres, s000001, s000002, s000003, s000005, s000006, s000007, s000009, s000011, s000013, s000015, s000017, s000019,
    s000021, s000023, s000025, s000027, s000099, sabmsp01, sagusr02, sagusr03, sawts01, sb2bsp01, sbams01p, sccvs01, sceas02, sceas04, sctmsp01, scucsh01, scucsp01, sddas01, sfbnps02, sfwcsp01,
    sgaps01, sgaps02, sgmssp01, sgovsh01, sgsjsp01, siacp, siban, sifbn, sigdb, sintsh01, sintsp01, sirot, sirot2, sjsas7, sjsas8, sjsha, sltcsp01, smocsp01, snacs01, sncesh01, sncesp01, spansp03,
    spcmocp1, spcsafp2, spcsafp3, spwcs01, sqnadmin, ssafsp01, ssagds05, ssibsp01, sstnsp01, stcssp01, sybase, tmd1, tomcat, tomcat6, tomcat60, tomcat61, tomcat62, wasadmin, webservd, wpsadmin,
    www-data, zabbix, subversion, jenkins, jboss7, sibcsd02, controlm, ctmagent, spaps01, snacsp01, logstash, sdpls01, sdpls03, sndaps01) /bin/kill, /usr/bin/kill
    (ALL) ALL
    (root) NOEXEC: /bin/cat, /bin/cp, /bin/df, /bin/grep, /bin/gunzip, /bin/gzip, /bin/kill, /bin/less, /bin/ln, /bin/ls, /bin/mkdir, /bin/more, /bin/mt, /bin/mv, /bin/netstat, /bin/rm, /bin/rmdir,
    /bin/tar, /bin/unzip, /bin/vi, /usr/bin/du, /usr/bin/find, /usr/bin/gunzip, /usr/bin/gzip, /usr/bin/head, /usr/bin/jar, /usr/bin/less, /usr/bin/lsof, /usr/bin/nc, /usr/bin/pfile, /usr/bin/pg,
    /usr/bin/tail, /usr/bin/tar, /usr/bin/unzip, /usr/bin/vim, /usr/sbin/lsof, /bin/zcat, /usr/bin/zless, /opt/jboss/jdk/bin/jstack, /opt/jboss/jdk/bin/jmap, /opt/jboss/jdk/bin/jstat
    (apache, backpost, ccvhmp01, cef, corprd01, cpahmp01, cpaprd01, ctmage63, ctmage70, ecaixap, ecphmp01, ecpprd01, fnsusr01, gdjprd01, ibcprd01, ifehmp01, ifeprd01, ifmprd01, ihsadmin, jboss,
    jboss4, jboss5, jboss6, maven, nexus, orabid, oracle, orapid, orascd, orasol, postgres, s000001, s000002, s000003, s000005, s000006, s000007, s000009, s000011, s000013, s000015, s000017, s000019,
    s000021, s000023, s000025, s000027, s000099, sabmsp01, sagusr02, sagusr03, sawts01, sb2bsp01, sbams01p, sccvs01, sceas02, sceas04, sctmsp01, scucsh01, scucsp01, sddas01, sfbnps02, sfwcsp01,
    sgaps01, sgaps02, sgmssp01, sgovsh01, sgsjsp01, siacp, siban, sifbn, sigdb, sintsh01, sintsp01, sirot, sirot2, sjsas7, sjsas8, sjsha, sltcsp01, smocsp01, snacs01, sncesh01, sncesp01, spansp03,
    spcmocp1, spcsafp2, spcsafp3, spwcs01, sqnadmin, ssafsp01, ssagds05, ssibsp01, sstnsp01, stcssp01, sybase, tmd1, tomcat, tomcat6, tomcat60, tomcat61, tomcat62, wasadmin, webservd, wpsadmin,
    www-data, zabbix, subversion, jenkins, jboss7, sibcsd02, fntsag01, sappnbmd02, snbcsd02, sagusr98, sigcb, griaule, sdpls03, ssagsd08) NOEXEC: /bin/cat, /bin/cp, /bin/df, /bin/grep, /bin/gunzip,
    /bin/gzip, /bin/kill, /bin/less, /bin/ln, /bin/ls, /bin/mkdir, /bin/more, /bin/mt, /bin/mv, /bin/netstat, /bin/rm, /bin/rmdir, /bin/tar, /bin/unzip, /bin/vi, /usr/bin/du, /usr/bin/find,
    /usr/bin/gunzip, /usr/bin/gzip, /usr/bin/head, /usr/bin/jar, /usr/bin/less, /usr/bin/lsof, /usr/bin/nc, /usr/bin/pfile, /usr/bin/pg, /usr/bin/tail, /usr/bin/tar, /usr/bin/unzip, /usr/bin/vim,
    /usr/sbin/lsof, /bin/zcat, /usr/bin/zless, /etc/init.d/jboss-eap-rhel.sh, /opt/sisag/SisagGeradorArquivoBaseCentralizada/*
    (jboss4, jboss6, jboss, jboss7, tomcat60, tomcat62, root) /usr/bin/pmap, /opt/jboss/jboss-4.2.3.GA-jdk6/jboss.sh, /opt/jboss/jboss-eap-6.1/jboss.sh, /opt/jboss/jboss-eap-6.3/jboss.sh,
    /opt/jboss/jboss-5.1.0.GA/jboss.sh, /opt/jboss/jboss-eap-6.4/jboss.sh, /opt/jboss/jdk1.6.0_45/bin/jar, /prod/scripts/sib/sibbcb01.sh, /prod/scripts/sib/run.sh, /opt/jboss/jboss-4.2.3.GA/jboss.sh,
    /prod/scripts/nbc/nbcsetvar.sh, /prod/scripts/nbc/nbcparamlot.sh, /etc/init.d/jboss, /opt/jboss/jdk/bin/jmap, /opt/jboss/jdk/bin/jstat, /opt/jboss/jdk/bin/jps, /opt/jboss/jdk/bin/jstack,
    /opt/jboss/jdk/bin/jconsole, /opt/jboss/jboss-GA/jboss.sh, /opt/jboss/jboss-eap-7.0/jboss.sh, /etc/rc.d/init.d/jboss4-caixa, /etc/rc.d/init.d/tomcat6, /etc/rc.d/init.d/tomcat62,
    /opt/jboss/jdk1.6.0_45/bin/jstat, /opt/jboss/apache-jmeter-3.3/bin/jmeter.sh, /opt/jboss/jdk1.6.0_45/bin/jvisualvm, /opt/jboss/jdk1.6.0_45/bin/jstack, /opt/jboss/jboss-eap-7.1/jboss.sh,
    /etc/rc.d/init.d/jboss4, /apl/siedd/EDD_GERADOR.jar, /usr/bin/java, /etc/init.d/jboss-eap-rhel.sh, /prod/scripts/gdf/startBatchSigdf.sh, /apl/simtx/recursos/, /bin/cp, /bin/mkdir, /bin/chmod,
    /bin/zip, /bin/rm, /bin/unzip, /bin/touch, /bin/mv, /usr/bin/unzip, /usr/bin/zip, /prod/scripts/caq/caq-consulta-avaliacoes-vencidas-des.sh, /opt/jboss/jboss-eap-7.4/jboss.sh,
    /etc/init.d/connector start, /etc/init.d/connector stop,  /opt/jboss/jboss-eap-7.3/jboss.sh, /opt/jboss/jboss-eap-7.4/jboss.sh,
    (jboss4, backpost, oracle, sagusr02, ssagsd08, jboss7) /opt/sisag/agente_relatoriostransmissao/sisag_gerador_relatorios_transmissao.sh,
    /opt/sisag/agente_relatoriostransmissao/sisag_relatorio_transmissao.sh, /opt/sisag/analisalog_unico/AnalisadorLogUnico.sh, /opt/sisag/Extrator_logunico/sisag_gerador_log_unico.sh,
    /opt/sisag/agente_logcheque/sisag_gerador_log_cheque.sh, /opt/sisag/agente_logunico/sisag_gerador_log_unico.sh, /opt/sisag/analisalog_cheque/AnalisadorLogCheque.sh,
    /opt/sisag/Relatorio_Piloto/sisag_relatorio_transmissao.sh, /opt/sisag/geralog_fechamento/GeradorLogFechamento.sh, /prod/scripts/sag/bkp_log_chq_unc.sh, /opt/sisag/tvin/SisagTVIN.sh,
    /opt/sisag/Relatorio_Nac/sisag_relatorio_transmissao.sh, /opt/sisag/Relatorio_Nac2/sisag_relatorio_transmissao.sh, /opt/sisag/Relatorio_Pre/sisag_relatorio_transmissao.sh,
    /prod/scripts/sag/checkEnvioSIGDB_Linux.sh, /prod/scripts/sag/exp_log_chq_unc.sh, /oracle/app/oracle/product/10.2.0/bin/imp, /oracle/app/oracle/product/10.2.0/bin/exp,
    /prod/scripts/sag/bkp_banco_sisag.sh, /prod/scripts/sag/exp_banco_sisag.sh, /opt/sisag/agente_relatLTGA/sisag_relatorio_transmissao.sh,
    /opt/sisag/Eventual_NAC/LogCheque/sisag_gerador_log_cheque_eventual.sh, /opt/sisag/Eventual_NAC/LogUnico/sisag_gerador_log_unico_eventual.sh,
    /opt/sisag/Eventual_NAC2/LogCheque/sisag_gerador_log_cheque_eventual.sh, /opt/sisag/Eventual_NAC2/LogUnico/sisag_gerador_log_unico_eventual.sh,
    /opt/sisag/SisagColetaTotaisTransacoes/sisag_coleta_totais_transacoes.sh, /opt/sisag/G_SisagExtratorFormatadorPLD/sisag_extrator_tb006.sh,
    /opt/sisag/G_SisagExtratorFormatadorPLD/sisag_gerar_arquivo_pld.sh, /opt/sisag/G_SisagExtratorFormatadorPLD/sisag_importar_cpf_nome.sh, /prod/scripts/sag/restaura_sisag.sh,
    /opt/sisag/Eventual_NAC/sisag_gerador_log_unico_eventual.sh, /prod/scripts/sag/bkp_banco_sisag_SAGDB003.sh, /prod/scripts/sag/exp_banco_sisag_SAGDB003.sh,
    /opt/sisag/Gerador_LogUnico_RME/sisag_gerador_log_unico_rme.sh, /opt/sisag/SisagGeradorLogSIDMF/sisagGeradorLogSIDMF.sh, /prod/scripts/sag/cp_dump_sisag.sh,
    /prod/scripts/sag/relatorios_nao_enviados.sh, /prod/scripts/sag/exp_banco_sisag_SAGDB099.sh, /prod/scripts/sag/bkp_banco_sisag_SAGDB099.sh, /prod/scripts/sag/verifica_tabela_feriados.sh,
    /opt/sisag/agente_logcheque/sisag_gerador_log_cheque_eventual.sh, /prod/scripts/sag/bkp_banco_sisag_SAGDB011.sh, /prod/scripts/sag/exp_banco_sisag_SAGDB011.sh, /opt/jboss/jboss-eap-7.3/jboss.sh
    sisag06-lx053, /prod/scripts/sag/Valida_SISAGMRMPTO.sh, /prod/scripts/sag/Valida_SISAGMRMETO.sh
    (root) /etc/init.d/logstash, /etc/init.d/instancia
    (apache, backpost, ccvhmp01, cef, corprd01, cpahmp01, cpaprd01, ctmage63, ctmage70, ecaixap, ecphmp01, ecpprd01, fnsusr01, gdjprd01, ibcprd01, ifehmp01, ifeprd01, ifmprd01, ihsadmin, jboss,
    jboss4, jboss5, jboss6, maven, nexus, orabid, oracle, orapid, orascd, orasol, postgres, s000001, s000002, s000003, s000005, s000006, s000007, s000009, s000011, s000013, s000015, s000017, s000019,
    s000021, s000023, s000025, s000027, s000099, sabmsp01, sagusr02, sagusr03, sawts01, sb2bsp01, sbams01p, sccvs01, sceas02, sceas04, sctmsp01, scucsh01, scucsp01, sddas01, sfbnps02, sfwcsp01,
    sgaps01, sgaps02, sgmssp01, sgovsh01, sgsjsp01, siacp, siban, sifbn, sigdb, sintsh01, sintsp01, sirot, sirot2, sjsas7, sjsas8, sjsha, sltcsp01, smocsp01, snacs01, sncesh01, sncesp01, spansp03,
    spcmocp1, spcsafp2, spcsafp3, spwcs01, sqnadmin, ssafsp01, ssagds05, ssibsp01, sstnsp01, stcssp01, sybase, tmd1, tomcat, tomcat6, tomcat60, tomcat61, tomcat62, wasadmin, webservd, wpsadmin,
    www-data, zabbix, subversion, jenkins, jboss7, sibcsd02, controlm, ctmagent, spaps01, snacsp01, logstash, sdpls01, sdpls03, acmprd01, snbcsh02, snbcsp02, sappnbmp02, sibcsh02, elasticsearch,
    sndaps01) /bin/cat, /bin/cp, /bin/df, /bin/grep, /bin/gunzip, /bin/gzip, /bin/less, /bin/ln, /bin/ls, /bin/mkdir, /bin/more, /bin/mt, /bin/mv, /bin/netstat, /bin/rm, /bin/rmdir, /bin/tar,
    /bin/unzip, /bin/vi, /usr/bin/du, /usr/bin/find, /usr/bin/gunzip, /usr/bin/gzip, /usr/bin/head, /usr/bin/jar, /usr/bin/less, /usr/bin/lsof, /usr/bin/nc, /usr/bin/pfile, /usr/bin/pg, /usr/bin/tail,
    /usr/bin/tar, /usr/bin/unzip, /usr/bin/vim, /usr/sbin/lsof, /bin/find, /bin/zcat, /usr/bin/zless, /opt/jboss/jdk/bin/jstack, /opt/jboss/jdk/bin/jmap, /opt/jboss/jdk/bin/jstat, /usr/bin/git,
    /usr/bin/rm
    (ALL) ALL
    (root) !/usr/sbin/useradd, !/usr/sbin/userdel, !/usr/sbin/usermod, !/usr/sbin/groupadd, !/usr/sbin/groupdel, !/usr/sbin/groupmod, !/usr/bin/passwd, !/usr/sbin/vipw, !/usr/sbin/visudo, (root)
    !/bin/cp *sudo*, !/usr/bin/head *sudo*, !/bin/mv *sudo*, !/bin/cat *sudo*, !/usr/bin/tail *sudo*, !/usr/bin/pg *sudo*, !/usr/bin/find *sudo*, !/bin/vi *sudo*, !/usr/bin/vim *sudo*, !/usr/bin/less
    *sudo*, !/bin/more *sudo*, !/bin/cp *shadow*, !/usr/bin/head *shadow*, !/bin/mv *shadow*, !/bin/cat *shadow*, !/usr/bin/tail *shadow*, !/usr/bin/pg *shadow*, !/usr/bin/find *shadow*, !/bin/vi
    *shadow*, !/usr/bin/vim *shadow*, !/usr/bin/less *shadow*, !/bin/more *shadow*, !/bin/cp *ldap*, !/usr/bin/head *ldap*, !/bin/mv *ldap*, !/bin/cat *ldap*, !/usr/bin/tail *ldap*, !/usr/bin/pg
    *ldap*, !/usr/bin/find *ldap*, !/bin/vi *ldap*, !/usr/bin/vim *ldap*, !/usr/bin/less *ldap*, !/bin/more *ldap*, !/bin/cp *slapd*, !/usr/bin/head *slapd*, !/bin/mv *slapd*, !/bin/cat *slapd*,
    !/usr/bin/tail *slapd*, !/usr/bin/pg *slapd*, !/usr/bin/find *slapd*, !/bin/vi *slapd*, !/usr/bin/vim *slapd*, !/usr/bin/less *slapd*, !/bin/more *slapd*, !/bin/cp *nslcd*, !/usr/bin/head *nslcd*,
    !/bin/mv *nslcd*, !/bin/cat *nslcd*, !/usr/bin/tail *nslcd*, !/usr/bin/pg *nslcd*, !/usr/bin/find *nslcd*, !/bin/vi *nslcd*, !/usr/bin/vim *nslcd*, !/usr/bin/less *nslcd*, !/bin/more *nslcd*,
    !/bin/cp *sssd*, !/usr/bin/head *sssd*, !/bin/mv *sssd*, !/bin/cat *sssd*, !/usr/bin/tail *sssd*, !/usr/bin/pg *sssd*, !/usr/bin/find *sssd*, !/bin/vi *sssd*, !/usr/bin/vim *sssd*, !/usr/bin/less
    *sssd*, !/bin/more *sssd*, (root) !/bin/su - root, !/bin/su - [a-z][0-9][0-9][0-9][0-9][0-9][0-9]
[p585600@sspdeapllx0041 ~]$ sudo su

We trust you have received the usual lecture from the local System
Administrator. It usually boils down to these three things:

    #1) Respect the privacy of others.
    #2) Think before you type.
    #3) With great power comes great responsibility.

Senha SUDO:
id: cannot find name for group ID 927
Falha de seguranca. Acesso indevido como root por p585600
[p585600@sspdeapllx0041 ~]$
