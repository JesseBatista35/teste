
[ctmagelx@caddeapllx2501 ~]$
[ctmagelx@caddeapllx2501 ~]$
[ctmagelx@caddeapllx2501 ~]$
[ctmagelx@caddeapllx2501 ~]$ bash -c 'timeout 5 bash -c "</dev/tcp/10.116.84.154/18007" && echo ABERTA || echo FECHADA'
ABERTA
[ctmagelx@caddeapllx2501 ~]$
[ctmagelx@caddeapllx2501 ~]$
[ctmagelx@caddeapllx2501 ~]$
[ctmagelx@caddeapllx2501 ~]$
[ctmagelx@caddeapllx2501 ~]$ grep -rniE "crjdeaprlx|7015|7016|ctmshost|controlm|control_m" .
./BMCINSTALL/log/BMC_Control-M_AGENT_Install_2021.08.20.12.46.47.log:103:12:46:47.447     1      AutomatedInstallData.setVariable[380] Setting SYSTEM_controlm_env to
./BMCINSTALL/log/BMC_Control-M_AGENT_Install_2021.08.20.12.46.47.log:107:12:46:47.448     1      AutomatedInstallData.setVariable[380] Setting SYSTEM_controlm_without_ctm to .
./BMCINSTALL/log/BMC_Control-M_AGENT_Install_2021.08.20.12.46.47.log:216:12:46:47.488     1      AutomatedInstallData.setVariable[380] Setting CONTROLM_OWNER to
./BMCINSTALL/log/BMC_Control-M_AGENT_Install_2021.08.20.12.46.47.log:353:12:46:47.568     1     InstallerBase.loadPacks[193] Load pack controlm.agent.files.unix.Linux64
./BMCINSTALL/log/BMC_Control-M_AGENT_Install_2021.08.20.12.46.47.log:355:12:46:47.575     1     InstallerBase.loadPacks[193] Load pack configure.controlm.agent.unix
./BMCINSTALL/log/BMC_Control-M_AGENT_Install_2021.08.20.12.46.47.log:357:12:46:47.583     1     InstallerBase.loadPacks[193] Load pack configure.controlm.agent.unix.createsoftlinks
./BMCINSTALL/log/BMC_Control-M_AGENT_Install_2021.08.20.12.46.47.log:359:12:46:47.584     1     InstallerBase.loadPacks[193] Load pack controlm.agent.startup.files.update
./BMCINSTALL/log/BMC_Control-M_AGENT_Install_2021.08.20.12.46.47.log:360:12:46:47.590     1     InstallerBase.loadPacks[193] Load pack controlm.agent.start
./BMCINSTALL/log/BMC_Control-M_AGENT_Install_2021.08.20.12.46.47.log:361:12:46:47.591     1     InstallerBase.loadPacks[193] Load pack controlm.agent.installed.version.update
./BMCINSTALL/log/BMC_Control-M_AGENT_Install_2021.08.20.12.46.47.log:362:12:46:47.592     1     InstallerBase.loadPacks[193] Load pack controlm.agent.display.installation.log
./BMCINSTALL/log/BMC_Control-M_AGENT_Install_2021.08.20.12.46.47.log:366:12:46:47.599     1     InstallerBase.loadPacks[216] Available pack controlm.agent.files.unix.Linux64
./BMCINSTALL/log/BMC_Control-M_AGENT_Install_2021.08.20.12.46.47.log:368:12:46:47.599     1     InstallerBase.loadPacks[216] Available pack configure.controlm.agent.unix
./BMCINSTALL/log/BMC_Control-M_AGENT_Install_2021.08.20.12.46.47.log:370:12:46:47.600     1     InstallerBase.loadPacks[216] Available pack configure.controlm.agent.unix.createsoftlinks
./BMCINSTALL/log/BMC_Control-M_AGENT_Install_2021.08.20.12.46.47.log:372:12:46:47.600     1     InstallerBase.loadPacks[216] Available pack controlm.agent.startup.files.update
./BMCINSTALL/log/BMC_Control-M_AGENT_Install_2021.08.20.12.46.47.log:373:12:46:47.601     1     InstallerBase.loadPacks[216] Available pack controlm.agent.start
./BMCINSTALL/log/BMC_Control-M_AGENT_Install_2021.08.20.12.46.47.log:374:12:46:47.601     1     InstallerBase.loadPacks[216] Available pack controlm.agent.installed.version.update
./BMCINSTALL/log/BMC_Control-M_AGENT_Install_2021.08.20.12.46.47.log:375:12:46:47.601     1     InstallerBase.loadPacks[216] Available pack controlm.agent.display.installation.log
./BMCINSTALL/log/BMC_Control-M_AGENT_Install_2021.08.20.12.46.47.log:379:12:46:47.602     1     InstallerBase.loadPacks[227] Selected pack controlm.agent.files.unix.Linux64
./BMCINSTALL/log/BMC_Control-M_AGENT_Install_2021.08.20.12.46.47.log:380:12:46:47.602     1     InstallerBase.loadPacks[227] Selected pack configure.controlm.agent.unix
./BMCINSTALL/log/BMC_Control-M_AGENT_Install_2021.08.20.12.46.47.log:382:12:46:47.602     1     InstallerBase.loadPacks[227] Selected pack configure.controlm.agent.unix.createsoftlinks
./BMCINSTALL/log/BMC_Control-M_AGENT_Install_2021.08.20.12.46.47.log:384:12:46:47.603     1     InstallerBase.loadPacks[227] Selected pack controlm.agent.startup.files.update
./BMCINSTALL/log/BMC_Control-M_AGENT_Install_2021.08.20.12.46.47.log:385:12:46:47.604     1     InstallerBase.loadPacks[227] Selected pack controlm.agent.start
./BMCINSTALL/log/BMC_Control-M_AGENT_Install_2021.08.20.12.46.47.log:386:12:46:47.604     1     InstallerBase.loadPacks[227] Selected pack controlm.agent.installed.version.update
./BMCINSTALL/log/BMC_Control-M_AGENT_Install_2021.08.20.12.46.47.log:387:12:46:47.604     1     InstallerBase.loadPacks[227] Selected pack controlm.agent.display.installation.log
./BMCINSTALL/log/BMC_Control-M_AGENT_Install_2021.08.20.12.46.47.log:423:12:46:47.710     1      AutomatedInstallData.setVariable[380] Setting field.Authorized.Controlm.Server.Host.Default to cbrngapllx080.intra.caixa.gov.br
./BMCINSTALL/log/BMC_Control-M_AGENT_Install_2021.08.20.12.46.47.log:426:12:46:47.711     1      AutomatedInstallData.setVariable[380] Setting field.Primary.Controlm.Server.Host.Length to 14
./BMCINSTALL/log/BMC_Control-M_AGENT_Install_2021.08.20.12.46.47.log:434:12:46:47.714     1      AutomatedInstallData.setVariable[380] Setting CONTROLM_OWNER to @{active.User.Name}
./BMCINSTALL/log/BMC_Control-M_AGENT_Install_2021.08.20.12.46.47.log:456:12:46:47.726     1      AutomatedInstallData.setVariable[380] Setting button.Primary.Controlm.Server.Host.Length to 70
./BMCINSTALL/log/BMC_Control-M_AGENT_Install_2021.08.20.12.46.47.log:466:12:46:47.730     1      AutomatedInstallData.setVariable[380] Setting field.ControlMEM.Tcpip.Port.Number.Default to 2370
./BMCINSTALL/log/BMC_Control-M_AGENT_Install_2021.08.20.12.46.47.log:469:12:46:47.732     1      AutomatedInstallData.setVariable[380] Setting field.Primary.Controlm.Server.Host.Default to cbrngapllx080.intra.caixa.gov.br
./BMCINSTALL/log/BMC_Control-M_AGENT_Install_2021.08.20.12.46.47.log:601:12:46:47.780     1      AutomatedInstallData.setVariable[380] Setting CONTROLM_OWNER to root
./BMCINSTALL/log/BMC_Control-M_AGENT_Install_2021.08.20.12.46.47.log:718:12:46:47.908     1            Librarian.loadArchSpecificLibrary[341] libUnixHelper-Linux-x86_64.so is known through jar protocol: jar:file:/opt/ctmage/Setup_files/Installer.jar!/com/bmc/controlm/util/UnixHelper.class
./BMCINSTALL/log/BMC_Control-M_AGENT_Install_2021.08.20.12.46.47.log:722:12:46:47.924     1         ExecuteAction.executeCommand[702] Setting environment for run CONTROLM=
./BMCINSTALL/log/BMC_Control-M_AGENT_Install_2021.08.20.12.46.47.log:729:12:46:47.937     1         ExecuteAction.executeCommand[818] Stdout: *** CONTROLM environment variable is not defined . ***
./BMCINSTALL/log/BMC_Control-M_AGENT_Install_2021.08.20.12.46.47.log:908:12:46:48.653     1    UserInputPanelAutomationHelper.runAutomated[129] Setting variable field.Server.To.Agent.Port.Number to 7016
./BMCINSTALL/log/BMC_Control-M_AGENT_Install_2021.08.20.12.46.47.log:909:12:46:48.653     1     AutomatedInstallData.setVariable[380] Setting field.Server.To.Agent.Port.Number to 7016
./BMCINSTALL/log/BMC_Control-M_AGENT_Install_2021.08.20.12.46.47.log:910:12:46:48.653     1    UserInputPanelAutomationHelper.runAutomated[129] Setting variable field.Agent.To.Server.Port.Number to 7015
./BMCINSTALL/log/BMC_Control-M_AGENT_Install_2021.08.20.12.46.47.log:911:12:46:48.654     1     AutomatedInstallData.setVariable[380] Setting field.Agent.To.Server.Port.Number to 7015
./BMCINSTALL/log/BMC_Control-M_AGENT_Install_2021.08.20.12.46.47.log:912:12:46:48.654     1    UserInputPanelAutomationHelper.runAutomated[129] Setting variable field.Primary.Controlm.Server.Host to ctm.caixa
./BMCINSTALL/log/BMC_Control-M_AGENT_Install_2021.08.20.12.46.47.log:913:12:46:48.654     1     AutomatedInstallData.setVariable[380] Setting field.Primary.Controlm.Server.Host to ctm.caixa
./BMCINSTALL/log/BMC_Control-M_AGENT_Install_2021.08.20.12.46.47.log:914:12:46:48.654     1    UserInputPanelAutomationHelper.runAutomated[129] Setting variable field.Authorized.Controlm.Server.Host to ctm.caixa|cxextrlx038|cx0000lx034
./BMCINSTALL/log/BMC_Control-M_AGENT_Install_2021.08.20.12.46.47.log:915:12:46:48.654     1     AutomatedInstallData.setVariable[380] Setting field.Authorized.Controlm.Server.Host to ctm.caixa|cxextrlx038|cx0000lx034
./BMCINSTALL/log/BMC_Control-M_AGENT_Install_2021.08.20.12.46.47.log:962:12:46:48.726     1       AutomatedInstallData.setVariable[380] Setting ctm_agent.Server.To.Agent.Port.Number.By.Condition to 7016
./BMCINSTALL/log/BMC_Control-M_AGENT_Install_2021.08.20.12.46.47.log:972:12:46:48.759     1           IsPortInRange.IsInRangeInteger[54] Checking range: 1025<=7015<=65534
./BMCINSTALL/log/BMC_Control-M_AGENT_Install_2021.08.20.12.46.47.log:978:12:46:48.761     1           IsPortInRange.IsInRangeInteger[54] Checking range: 1025<=7016<=65534
./BMCINSTALL/log/BMC_Control-M_AGENT_Install_2021.08.20.12.46.47.log:982:12:46:48.761     1           IsPortFree.isPortBusy[103] checking if port (7016) is in use.
./BMCINSTALL/log/BMC_Control-M_AGENT_Install_2021.08.20.12.46.47.log:983:12:46:48.762     1            IsPortFree.CheckBindingForAllLocalAdresses[204] CheckBindingForAllLocalAdresses: Testing port 7016 for address 10.192.168.154
./BMCINSTALL/log/BMC_Control-M_AGENT_Install_2021.08.20.12.46.47.log:984:12:46:48.762     1           IsPortFree.isPortBusy[168] Port (7016) is used: false
./BMCINSTALL/log/BMC_Control-M_AGENT_Install_2021.08.20.12.46.47.log:1009:12:46:48.778     1     AutomatedInstallData.setVariable[380] Setting field.Authorized.Controlm.Server.Host.Default to cbrngapllx080
./BMCINSTALL/log/BMC_Control-M_AGENT_Install_2021.08.20.12.46.47.log:1013:12:46:48.784     1     AutomatedInstallData.setVariable[380] Setting field.Primary.Controlm.Server.Host.Default to cbrngapllx080
./BMCINSTALL/log/BMC_Control-M_AGENT_Install_2021.08.20.12.46.47.log:1057:is.ControlMEM.Tcpip.Port.null=false
./BMCINSTALL/log/BMC_Control-M_AGENT_Install_2021.08.20.12.46.47.log:1262:izpack.selected.configure.controlm.agent.unix=true
./BMCINSTALL/log/BMC_Control-M_AGENT_Install_2021.08.20.12.46.47.log:1263:izpack.selected.configure.controlm.agent.unix.createsoftlinks=true
./BMCINSTALL/log/BMC_Control-M_AGENT_Install_2021.08.20.12.46.47.log:1264:izpack.selected.controlm.agent.display.installation.log=true
./BMCINSTALL/log/BMC_Control-M_AGENT_Install_2021.08.20.12.46.47.log:1265:izpack.selected.controlm.agent.files.unix.Linux64=true
./BMCINSTALL/log/BMC_Control-M_AGENT_Install_2021.08.20.12.46.47.log:1266:izpack.selected.controlm.agent.installed.version.update=true
./BMCINSTALL/log/BMC_Control-M_AGENT_Install_2021.08.20.12.46.47.log:1267:izpack.selected.controlm.agent.start=true
./BMCINSTALL/log/BMC_Control-M_AGENT_Install_2021.08.20.12.46.47.log:1268:izpack.selected.controlm.agent.startup.files.update=true
./BMCINSTALL/log/BMC_Control-M_AGENT_Install_2021.08.20.12.46.47.log:1287:CONTROLM_OWNER=root
./BMCINSTALL/log/BMC_Control-M_AGENT_Install_2021.08.20.12.46.47.log:1375:SYSTEM_controlm_env=
./BMCINSTALL/log/BMC_Control-M_AGENT_Install_2021.08.20.12.46.47.log:1376:SYSTEM_controlm_without_ctm=.
./BMCINSTALL/log/BMC_Control-M_AGENT_Install_2021.08.20.12.46.47.log:1477:button.Primary.Controlm.Server.Host.Length=70
./BMCINSTALL/log/BMC_Control-M_AGENT_Install_2021.08.20.12.46.47.log:1588:ctm_agent.Server.To.Agent.Port.Number.By.Condition=7016
./BMCINSTALL/log/BMC_Control-M_AGENT_Install_2021.08.20.12.46.47.log:1676:field.Agent.To.Server.Port.Number=7015
./BMCINSTALL/log/BMC_Control-M_AGENT_Install_2021.08.20.12.46.47.log:1678:field.Authorized.Controlm.Server.Host=ctm.caixa|cxextrlx038|cx0000lx034
./BMCINSTALL/log/BMC_Control-M_AGENT_Install_2021.08.20.12.46.47.log:1679:field.Authorized.Controlm.Server.Host.Default=cbrngapllx080
./BMCINSTALL/log/BMC_Control-M_AGENT_Install_2021.08.20.12.46.47.log:1683:field.ControlMEM.Tcpip.Port.Number.Default=2370
./BMCINSTALL/log/BMC_Control-M_AGENT_Install_2021.08.20.12.46.47.log:1698:field.Primary.Controlm.Server.Host=ctm.caixa
./BMCINSTALL/log/BMC_Control-M_AGENT_Install_2021.08.20.12.46.47.log:1699:field.Primary.Controlm.Server.Host.Default=cbrngapllx080
./BMCINSTALL/log/BMC_Control-M_AGENT_Install_2021.08.20.12.46.47.log:1700:field.Primary.Controlm.Server.Host.Length=14
./BMCINSTALL/log/BMC_Control-M_AGENT_Install_2021.08.20.12.46.47.log:1702:field.Server.To.Agent.Port.Number=7016
./BMCINSTALL/log/BMC_Control-M_AGENT_Install_2021.08.20.12.46.47.log:1849:12:46:49.008     1          Extractor.getPackAsStream[526] Extract pack 'controlm.agent.files.unix.Linux64'
./BMCINSTALL/log/BMC_Control-M_AGENT_Install_2021.08.20.12.46.47.log:1850:12:46:49.009     1          Extractor.runThroughPackFiles[379] Extract 4491 files from pack 'controlm.agent.files.unix.Linux64'
./BMCINSTALL/log/BMC_Control-M_AGENT_Install_2021.08.20.12.46.47.log:11127:12:46:55.699     1          Extractor.getPackAsStream[526] Extract pack 'configure.controlm.agent.unix'
./BMCINSTALL/log/BMC_Control-M_AGENT_Install_2021.08.20.12.46.47.log:11128:12:46:55.700     1          Extractor.runThroughPackFiles[379] Extract 0 files from pack 'configure.controlm.agent.unix'
./BMCINSTALL/log/BMC_Control-M_AGENT_Install_2021.08.20.12.46.47.log:11645:12:47:05.876     1          Extractor.getPackAsStream[526] Extract pack 'configure.controlm.agent.unix.createsoftlinks'
./BMCINSTALL/log/BMC_Control-M_AGENT_Install_2021.08.20.12.46.47.log:11646:12:47:05.877     1          Extractor.runThroughPackFiles[379] Extract 0 files from pack 'configure.controlm.agent.unix.createsoftlinks'
./BMCINSTALL/log/BMC_Control-M_AGENT_Install_2021.08.20.12.46.47.log:15412:12:47:06.318     1          Extractor.getPackAsStream[526] Extract pack 'controlm.agent.start'
./BMCINSTALL/log/BMC_Control-M_AGENT_Install_2021.08.20.12.46.47.log:15413:12:47:06.318     1          Extractor.runThroughPackFiles[379] Extract 0 files from pack 'controlm.agent.start'
./BMCINSTALL/log/BMC_Control-M_AGENT_Install_2021.08.20.12.46.47.log:16884:12:47:10.303     1          Extractor.getPackAsStream[526] Extract pack 'controlm.agent.installed.version.update'
./BMCINSTALL/log/BMC_Control-M_AGENT_Install_2021.08.20.12.46.47.log:16885:12:47:10.303     1          Extractor.runThroughPackFiles[379] Extract 0 files from pack 'controlm.agent.installed.version.update'
./BMCINSTALL/log/BMC_Control-M_AGENT_Install_2021.08.20.12.46.47.log:16908:12:47:10.321     1          Extractor.getPackAsStream[526] Extract pack 'controlm.agent.display.installation.log'
./BMCINSTALL/log/BMC_Control-M_AGENT_Install_2021.08.20.12.46.47.log:16909:12:47:10.321     1          Extractor.runThroughPackFiles[379] Extract 0 files from pack 'controlm.agent.display.installation.log'
./BMCINSTALL/log/BMC_Control-M_AGENT_Install_2021.08.20.12.46.47.log:16930:12:47:11.865     1        InstallerBase.writeUninstallData[1429] Write 0 classes for listener 'com.bmc.controlm.VariableAndConditionLogger'
grep: ./BMCINSTALL/log/TransactionLogger_DRKAI_9.0.19.200.dat: arquivo binário coincide com o padrão
./BMCINSTALL/log/cmone/BMC_ControlM_Application_Pack_Install_2021.10.29.15.44.50.log:103:15:44:51.425     1      AutomatedInstallData.setVariable[346] Setting SYSTEM_CONTROLM to /opt/ctmage/ctm
./BMCINSTALL/log/cmone/BMC_ControlM_Application_Pack_Install_2021.10.29.15.44.50.log:132:15:44:51.431     1      AutomatedInstallData.setVariable[346] Setting product.Visual.Name.For.Filenames to ControlM_Application_Pack
./BMCINSTALL/log/cmone/BMC_ControlM_Application_Pack_Install_2021.10.29.15.44.50.log:154:15:44:51.447     1     InstallerBase.loadPacks[181] Load pack controlm.cm.files.unix
./BMCINSTALL/log/cmone/BMC_ControlM_Application_Pack_Install_2021.10.29.15.44.50.log:155:15:44:51.448     1     InstallerBase.loadPacks[181] Load pack controlm.cm.files.ipp
./BMCINSTALL/log/cmone/BMC_ControlM_Application_Pack_Install_2021.10.29.15.44.50.log:156:15:44:51.449     1     InstallerBase.loadPacks[181] Load pack configure.controlm.cm.unix
./BMCINSTALL/log/cmone/BMC_ControlM_Application_Pack_Install_2021.10.29.15.44.50.log:157:15:44:51.450     1     InstallerBase.loadPacks[181] Load pack controlm.cmone.upgrade.config
./BMCINSTALL/log/cmone/BMC_ControlM_Application_Pack_Install_2021.10.29.15.44.50.log:158:15:44:51.451     1     InstallerBase.loadPacks[181] Load pack controlm.cm.installed.version.update
./BMCINSTALL/log/cmone/BMC_ControlM_Application_Pack_Install_2021.10.29.15.44.50.log:160:15:44:51.458     1     InstallerBase.loadPacks[181] Load pack controlm.cmone.upgrade.files.cleanup
./BMCINSTALL/log/cmone/BMC_ControlM_Application_Pack_Install_2021.10.29.15.44.50.log:165:15:44:51.462     1     InstallerBase.loadPacks[204] Available pack controlm.cm.files.unix
./BMCINSTALL/log/cmone/BMC_ControlM_Application_Pack_Install_2021.10.29.15.44.50.log:166:15:44:51.462     1     InstallerBase.loadPacks[204] Available pack controlm.cm.files.ipp
./BMCINSTALL/log/cmone/BMC_ControlM_Application_Pack_Install_2021.10.29.15.44.50.log:167:15:44:51.462     1     InstallerBase.loadPacks[204] Available pack configure.controlm.cm.unix
./BMCINSTALL/log/cmone/BMC_ControlM_Application_Pack_Install_2021.10.29.15.44.50.log:168:15:44:51.462     1     InstallerBase.loadPacks[204] Available pack controlm.cmone.upgrade.config
./BMCINSTALL/log/cmone/BMC_ControlM_Application_Pack_Install_2021.10.29.15.44.50.log:169:15:44:51.463     1     InstallerBase.loadPacks[204] Available pack controlm.cm.installed.version.update
./BMCINSTALL/log/cmone/BMC_ControlM_Application_Pack_Install_2021.10.29.15.44.50.log:171:15:44:51.463     1     InstallerBase.loadPacks[204] Available pack controlm.cmone.upgrade.files.cleanup
./BMCINSTALL/log/cmone/BMC_ControlM_Application_Pack_Install_2021.10.29.15.44.50.log:176:15:44:51.463     1     InstallerBase.loadPacks[215] Selected pack controlm.cm.files.unix
./BMCINSTALL/log/cmone/BMC_ControlM_Application_Pack_Install_2021.10.29.15.44.50.log:177:15:44:51.463     1     InstallerBase.loadPacks[215] Selected pack controlm.cm.files.ipp
./BMCINSTALL/log/cmone/BMC_ControlM_Application_Pack_Install_2021.10.29.15.44.50.log:178:15:44:51.463     1     InstallerBase.loadPacks[215] Selected pack configure.controlm.cm.unix
./BMCINSTALL/log/cmone/BMC_ControlM_Application_Pack_Install_2021.10.29.15.44.50.log:179:15:44:51.464     1     InstallerBase.loadPacks[215] Selected pack controlm.cmone.upgrade.config
./BMCINSTALL/log/cmone/BMC_ControlM_Application_Pack_Install_2021.10.29.15.44.50.log:180:15:44:51.464     1     InstallerBase.loadPacks[215] Selected pack controlm.cm.installed.version.update
./BMCINSTALL/log/cmone/BMC_ControlM_Application_Pack_Install_2021.10.29.15.44.50.log:182:15:44:51.464     1     InstallerBase.loadPacks[215] Selected pack controlm.cmone.upgrade.files.cleanup
./BMCINSTALL/log/cmone/BMC_ControlM_Application_Pack_Install_2021.10.29.15.44.50.log:202:15:44:51.535     1      AutomatedInstallData.setVariable[346] Setting Tracer.FullPath to /opt/ctmage/BMCINSTALL/log/cmone/BMC_ControlM_Application_Pack_Install_2021.10.29.15.44.50.log
./BMCINSTALL/log/cmone/BMC_ControlM_Application_Pack_Install_2021.10.29.15.45.30.log:103:15:45:31.783     1      AutomatedInstallData.setVariable[346] Setting SYSTEM_CONTROLM to /opt/ctmage/ctm
./BMCINSTALL/log/cmone/BMC_ControlM_Application_Pack_Install_2021.10.29.15.45.30.log:132:15:45:31.799     1      AutomatedInstallData.setVariable[346] Setting product.Visual.Name.For.Filenames to ControlM_Application_Pack
./BMCINSTALL/log/cmone/BMC_ControlM_Application_Pack_Install_2021.10.29.15.45.30.log:154:15:45:31.827     1     InstallerBase.loadPacks[181] Load pack controlm.cm.files.unix
./BMCINSTALL/log/cmone/BMC_ControlM_Application_Pack_Install_2021.10.29.15.45.30.log:155:15:45:31.829     1     InstallerBase.loadPacks[181] Load pack controlm.cm.files.ipp
./BMCINSTALL/log/cmone/BMC_ControlM_Application_Pack_Install_2021.10.29.15.45.30.log:156:15:45:31.830     1     InstallerBase.loadPacks[181] Load pack configure.controlm.cm.unix
./BMCINSTALL/log/cmone/BMC_ControlM_Application_Pack_Install_2021.10.29.15.45.30.log:157:15:45:31.832     1     InstallerBase.loadPacks[181] Load pack controlm.cmone.upgrade.config
./BMCINSTALL/log/cmone/BMC_ControlM_Application_Pack_Install_2021.10.29.15.45.30.log:158:15:45:31.834     1     InstallerBase.loadPacks[181] Load pack controlm.cm.installed.version.update
./BMCINSTALL/log/cmone/BMC_ControlM_Application_Pack_Install_2021.10.29.15.45.30.log:160:15:45:31.844     1     InstallerBase.loadPacks[181] Load pack controlm.cmone.upgrade.files.cleanup
./BMCINSTALL/log/cmone/BMC_ControlM_Application_Pack_Install_2021.10.29.15.45.30.log:165:15:45:31.849     1     InstallerBase.loadPacks[204] Available pack controlm.cm.files.unix
./BMCINSTALL/log/cmone/BMC_ControlM_Application_Pack_Install_2021.10.29.15.45.30.log:166:15:45:31.849     1     InstallerBase.loadPacks[204] Available pack controlm.cm.files.ipp
./BMCINSTALL/log/cmone/BMC_ControlM_Application_Pack_Install_2021.10.29.15.45.30.log:167:15:45:31.849     1     InstallerBase.loadPacks[204] Available pack configure.controlm.cm.unix
./BMCINSTALL/log/cmone/BMC_ControlM_Application_Pack_Install_2021.10.29.15.45.30.log:168:15:45:31.849     1     InstallerBase.loadPacks[204] Available pack controlm.cmone.upgrade.config
./BMCINSTALL/log/cmone/BMC_ControlM_Application_Pack_Install_2021.10.29.15.45.30.log:169:15:45:31.849     1     InstallerBase.loadPacks[204] Available pack controlm.cm.installed.version.update
./BMCINSTALL/log/cmone/BMC_ControlM_Application_Pack_Install_2021.10.29.15.45.30.log:171:15:45:31.850     1     InstallerBase.loadPacks[204] Available pack controlm.cmone.upgrade.files.cleanup
./BMCINSTALL/log/cmone/BMC_ControlM_Application_Pack_Install_2021.10.29.15.45.30.log:176:15:45:31.850     1     InstallerBase.loadPacks[215] Selected pack controlm.cm.files.unix
./BMCINSTALL/log/cmone/BMC_ControlM_Application_Pack_Install_2021.10.29.15.45.30.log:177:15:45:31.850     1     InstallerBase.loadPacks[215] Selected pack controlm.cm.files.ipp
./BMCINSTALL/log/cmone/BMC_ControlM_Application_Pack_Install_2021.10.29.15.45.30.log:178:15:45:31.851     1     InstallerBase.loadPacks[215] Selected pack configure.controlm.cm.unix
./BMCINSTALL/log/cmone/BMC_ControlM_Application_Pack_Install_2021.10.29.15.45.30.log:179:15:45:31.851     1     InstallerBase.loadPacks[215] Selected pack controlm.cmone.upgrade.config
./BMCINSTALL/log/cmone/BMC_ControlM_Application_Pack_Install_2021.10.29.15.45.30.log:180:15:45:31.851     1     InstallerBase.loadPacks[215] Selected pack controlm.cm.installed.version.update
./BMCINSTALL/log/cmone/BMC_ControlM_Application_Pack_Install_2021.10.29.15.45.30.log:182:15:45:31.851     1     InstallerBase.loadPacks[215] Selected pack controlm.cmone.upgrade.files.cleanup
./BMCINSTALL/log/cmone/BMC_ControlM_Application_Pack_Install_2021.10.29.15.45.30.log:202:15:45:31.935     1      AutomatedInstallData.setVariable[346] Setting Tracer.FullPath to /opt/ctmage/BMCINSTALL/log/cmone/BMC_ControlM_Application_Pack_Install_2021.10.29.15.45.30.log
./BMCINSTALL/log/cmone/BMC_ControlM_Application_Pack_Install_2021.10.29.15.45.30.log:371:15:45:36.644     1         Extractor.getPackAsStream[492] Extract pack 'controlm.cm.files.unix'
./BMCINSTALL/log/cmone/BMC_ControlM_Application_Pack_Install_2021.10.29.15.45.30.log:372:15:45:36.644     1         Extractor.runThroughPackFiles[358] Extract 379 files from pack 'controlm.cm.files.unix'
./BMCINSTALL/log/cmone/BMC_ControlM_Application_Pack_Install_2021.10.29.15.45.30.log:1073:15:45:39.147     1         Extractor.getPackAsStream[492] Extract pack 'controlm.cm.files.ipp'
./BMCINSTALL/log/cmone/BMC_ControlM_Application_Pack_Install_2021.10.29.15.45.30.log:1074:15:45:39.148     1         Extractor.runThroughPackFiles[358] Extract 0 files from pack 'controlm.cm.files.ipp'
./BMCINSTALL/log/cmone/BMC_ControlM_Application_Pack_Install_2021.10.29.15.45.30.log:2984:15:45:41.336     1         Extractor.getPackAsStream[492] Extract pack 'configure.controlm.cm.unix'
./BMCINSTALL/log/cmone/BMC_ControlM_Application_Pack_Install_2021.10.29.15.45.30.log:2985:15:45:41.337     1         Extractor.runThroughPackFiles[358] Extract 0 files from pack 'configure.controlm.cm.unix'
./BMCINSTALL/log/cmone/BMC_ControlM_Application_Pack_Install_2021.10.29.15.45.30.log:3059:15:45:41.376     1         Extractor.getPackAsStream[492] Extract pack 'controlm.cmone.upgrade.config'
./BMCINSTALL/log/cmone/BMC_ControlM_Application_Pack_Install_2021.10.29.15.45.30.log:3060:15:45:41.376     1         Extractor.runThroughPackFiles[358] Extract 0 files from pack 'controlm.cmone.upgrade.config'
./BMCINSTALL/log/cmone/BMC_ControlM_Application_Pack_Install_2021.10.29.15.45.30.log:3074:15:45:41.381     1         Extractor.getPackAsStream[492] Extract pack 'controlm.cm.installed.version.update'
./BMCINSTALL/log/cmone/BMC_ControlM_Application_Pack_Install_2021.10.29.15.45.30.log:3075:15:45:41.381     1         Extractor.runThroughPackFiles[358] Extract 0 files from pack 'controlm.cm.installed.version.update'
./BMCINSTALL/log/cmone/BMC_ControlM_Application_Pack_Install_2021.10.29.15.45.30.log:3633:15:45:42.665     1         Extractor.getPackAsStream[492] Extract pack 'controlm.cmone.upgrade.files.cleanup'
./BMCINSTALL/log/cmone/BMC_ControlM_Application_Pack_Install_2021.10.29.15.45.30.log:3634:15:45:42.665     1         Extractor.runThroughPackFiles[358] Extract 0 files from pack 'controlm.cmone.upgrade.files.cleanup'
./BMCINSTALL/log/cmone/BMC_ControlM_Application_Pack_Install_2021.10.29.15.45.30.log:3688:15:45:43.624     1       InstallerBase.writeUninstallData[1279] Write 0 classes for listener 'com.bmc.controlm.DiskSpaceSufficientUnixListener'
grep: ./BMCINSTALL/log/cmone/TransactionLogger_ControlM_Application_Pack.dat: arquivo binário coincide com o padrão
./BMCINSTALL/uninstall/DRKAI.9.0.19.200/uninstall.sh:56:        [ "${active_user_name}" = "root"  ] && controlm_env="`su - ${install_owner} -c env | grep 'CONTROLM=' | awk -F= '{print $2}'`"
./BMCINSTALL/uninstall/DRKAI.9.0.19.200/uninstall.sh:57:        [ "${active_user_name}" != "root" ] && controlm_env="`env | grep 'CONTROLM=' | awk -F= '{print $2}'`"
./BMCINSTALL/uninstall/DRKAI.9.0.19.200/uninstall.sh:60:        if [ "${controlm_env}" = "" ]; then
./BMCINSTALL/uninstall/DRKAI.9.0.19.200/uninstall.sh:61:                echo "*** You must set the environment variable CONTROLM. ***"
./BMCINSTALL/uninstall/DRKAI.9.0.19.200/uninstall.sh:64:        if [ ! -d "${controlm_env}" ]; then
./BMCINSTALL/uninstall/DRKAI.9.0.19.200/uninstall.sh:65:                echo "*** Directory CONTROLM[${CONTROLM}] does not exists. ***"
./BMCINSTALL/uninstall/DRKAI.9.0.19.200/uninstall.sh:68:        if [ -f ${controlm_env}/scripts/handle_jre_downgrade.sh ]; then
./BMCINSTALL/uninstall/DRKAI.9.0.19.200/uninstall.sh:69:                ${controlm_env}/scripts/handle_jre_downgrade.sh downgrade > ${HOME}/BMCINSTALL/log/handle_jre_downgrade.txt
./BMCINSTALL/uninstall/DRKAI.9.0.19.200/uninstall.sh:73:        BMC_JAVA_HOME=`grep BMC_JAVA_HOME ${CONTROLM}/data/CONFIG.dat | awk '{print $2}'`
./BMCINSTALL/uninstall/DRKAI.9.0.19.200/uninstall.sh:78:                jre_path="${controlm_env}/JRE"
./BMCINSTALL/uninstall/DRKAI.9.0.19.200/uninstall.sh:86:                if [ -d "${controlm_env}/JRE_64" ]; then
./BMCINSTALL/uninstall/DRKAI.9.0.19.200/uninstall.sh:88:                        jre_path="${controlm_env}/JRE_64"
./BMCINSTALL/uninstall/DRKAI.9.0.19.200/uninstall.sh:176:               /bin/rm -rf "${controlm_env}" > /dev/null 2>&1
grep: ./BMCINSTALL/uninstall/DRKAI.9.0.19.200/Installer.jar: arquivo binário coincide com o padrão
./BMCINSTALL/uninstall/DR1CM.9.0.19.200/uninstall.sh:55:        if [ "${CONTROLM}" = "" ]; then
./BMCINSTALL/uninstall/DR1CM.9.0.19.200/uninstall.sh:56:                echo "*** You must set the environment variable CONTROLM. ***"
./BMCINSTALL/uninstall/DR1CM.9.0.19.200/uninstall.sh:59:        agent_folder="${CONTROLM}"
./BMCINSTALL/uninstall/DR1CM.9.0.19.200/uninstall.sh:106:       BMC_JAVA_HOME=`grep BMC_JAVA_HOME ${CONTROLM}/data/CONFIG.dat | awk '{print $2}'`
grep: ./BMCINSTALL/uninstall/DR1CM.9.0.19.200/Uninstall.jar: arquivo binário coincide com o padrão
grep: ./BMCINSTALL/uninstall/DR1CM.9.0.19.200/Installer.jar: arquivo binário coincide com o padrão
grep: ./BMCINSTALL/BMC20211029_154451628/libUnixHelper-Linux-x86_64.so: arquivo binário coincide com o padrão
grep: ./ctm/JRE_1.8_222/lib/rt.jar: arquivo binário coincide com o padrão
./ctm/JRE_1.8_222/THIRD_PARTY_README:2465:   set forth in DFARS 202.227-7015 Technical Data, Commercial and Items (Nov
grep: ./ctm/cm/AP/apweb-919200/webapps/cmAI-919200/WEB-INF/lib/platform-3.5.1.jar: arquivo binário coincide com o padrão
grep: ./ctm/cm/AP/apweb-919200/webapps/cmHadoop-919200/WEB-INF/classes/com/bmc/cm/h4d/ExportEmRequestsSender/ExportWorkFlowToEM.class: arquivo binário coincide com o padrão
grep: ./ctm/cm/AP/apweb-919200/webapps/cmInf-919200/WEB-INF/classes/com/bmc/ctm/cminf/domain/informatica/InformaticaHelper.class: arquivo binário coincide com o padrão
grep: ./ctm/cm/AP/exe/lib_AP.so.919200: arquivo binário coincide com o padrão
./ctm/cm/AP/exe/set_ap_java.sh:9:java_dir=`grep BMC_JAVA_HOME $CONTROLM/data/CONFIG.dat | awk '{print $2}'`
./ctm/cm/AP/exe/set_ap_java.sh:13:        java_dir="$CONTROLM/JRE/bin"
./ctm/dailylog/daily_ctmag_20261030.log:1:1030 150029  44             ag_ping      DEBUG DUMP FOR process/thread=1638574. Message is 1030 15:00:29:385 ag_ping:getaddrinfo failed for host crjdeaprlx038, port 7015: Name or service not known
./ctm/dailylog/daily_ctmag_20261030.log:3:1030 150613  44             ag_ping      DEBUG DUMP FOR process/thread=1639024. Message is 1030 15:06:13:613 ag_ping:getaddrinfo failed for host crjdeaprlx038, port 7015: Name or service not known
./ctm/data/cfg_backup/CONFIG.bak:9:CTMSHOST                            cxextrlx038
./ctm/data/cfg_backup/CONFIG.bak:53:ATCMNDATA                           7015
./ctm/data/cfg_backup/CONFIG.bak:55:AGCMNDATA                           7016
./ctm/data/remote_utils/RU_runner.COM:8:$ define/nolog JAVA$GETENV_JOB_LIST AG_UTIL_CONFIG_FILE_NAME, AG_UTIL_LOG_FILE_NAME, RU_COMM_PORT, LOGICAL_AGENT_NAME, UTTIMEOUT, COMMRETCNT, COMMRETSLP, CTMSHOST, DBGLVL, PROTOCOL_VERSION
./ctm/data/CNF_AG.xml:66: <action name="Agent_dependencies" type="command"   source="ldd $CONTROLM/exe/libBMCOS.so" os="UNIX" folder="AG_CNF" />
./ctm/data/PARAMMAP.dat:33:[CTMSHOST]
./ctm/data/WinInstallHelper.pl:22:my $agent_dir = '@product.Agent.Install.Path@' ; # equals to $CONTROLM path
./ctm/data/WinInstallHelper.pl:23:my $agent_dir_controlm = '@product.Agent.Install.Path_contorlm@' ; # equals to real $CONTROLM
./ctm/data/WinInstallHelper.pl:549:     if (substr($agent_dir_controlm, -1, 1) eq $os_slash ) {
./ctm/data/WinInstallHelper.pl:551:              $agent_dir_controlm = substr($agent_dir_controlm, 0, length($agent_dir_controlm) - 1 );
./ctm/data/WinInstallHelper.pl:594:             my $courier_count = `ps -ef | grep -v grep | grep $agent_dir_controlm/exe/sshcourier.jar | awk 'END { print NR }'`;
./ctm/data/WinInstallHelper.pl:597:                     $cmd_out = `ps -ef | grep -v grep | grep $agent_dir_controlm/exe/sshcourier.jar`;
./ctm/data/WinInstallHelper.pl:611:             $courier_count = `ps -ef | grep -v grep | grep $agent_dir_controlm/exe/sshcourier.jar | awk 'END { print NR }'`;
./ctm/data/WinInstallHelper.pl:615:                     $cmd_out = `ps -ef | grep -v grep | grep $agent_dir_controlm/exe/sshcourier.jar`;
./ctm/data/WinInstallHelper.pl:643:             $cmd_out = `ps -ef | grep -v grep | grep $agent_dir_controlm/JRE`;
./ctm/data/WinInstallHelper.pl:649:                     if (index($pargs, "$agent_dir_controlm/exe/sshcourier.jar") > 0 ) {
./ctm/data/WinInstallHelper.pl:673:             $cmd_out = `ps -ef | grep -v grep | grep $agent_dir_controlm/JRE`;
./ctm/data/WinInstallHelper.pl:678:                     if (index($pargs, "$agent_dir_controlm/exe/sshcourier.jar") > 0 ) {
./ctm/data/WinInstallHelper.pl:1131:            # The user which runs the Agent processes: grep AGENT_OWNER [CONTROLM]/data/CONFIG.dat
./ctm/data/WinInstallHelper.pl:1315:    chomp (my $group_owner = `ls -ld [CONTROLM]| awk '{ printf \$4 }'`);
./ctm/data/WinInstallHelper.pl:1324:# in base.xml: AGENT_OWNER <shell>ls -ld [CONTROLM]| awk '{ print $3 }'</shell>
./ctm/data/WinInstallHelper.pl:1325:# in base.xml: AGENT_RUN_BY <shell>grep AGENT_OWNER [CONTROLM]/data/CONFIG.dat | sed 's/ //g' | sed 's/AGENT_OWNER//g'</shell>
./ctm/data/WinInstallHelper.pl:1328:#            <shell>grep AGENT_OWNER [CONTROLM]/data/CONFIG.dat | sed 's/ //g' | sed 's/AGENT_OWNER//g'</shell>
./ctm/data/WinInstallHelper.pl:1704:            # The user which runs the Agent processes: grep AGENT_OWNER [CONTROLM]/data/CONFIG.dat
./ctm/data/WinInstallHelper.pl:2501:            # The user which runs the Agent processes: grep AGENT_OWNER [CONTROLM]/data/CONFIG.dat
./ctm/data/WinInstallHelper.pl:2906:                            $agent_group =  `ls -Xld $agent_dir_controlm | awk '{ printf \$4 }'`;
./ctm/data/WinInstallHelper.pl:2911:                            $agent_group =  `ls -ld $agent_dir_controlm | awk '{ printf \$4 }'`;
./ctm/data/WinInstallHelper.pl:3002:            trace ("checking if ".$agent_dir_controlm."/JRE_For_Restore directory exist in filesystem");
./ctm/data/WinInstallHelper.pl:3004:            if (-d "$agent_dir_controlm/JRE_For_Restore")
./ctm/data/WinInstallHelper.pl:3006:                    trace ($agent_dir_controlm."/JRE_For_Restore directory exist in filesystem  - archiving");
./ctm/data/WinInstallHelper.pl:3007:                    $cmd_output = `cd $agent_dir_controlm;tar -pcvf JRE_For_Restore.tar  JRE_For_Restore;chmod 600 JRE_For_Restore.tar`;
./ctm/data/WinInstallHelper.pl:3009:                    chdir($agent_dir_controlm);
./ctm/data/WinInstallHelper.pl:3016:                                    trace ("user root - change ownership to agent owner: ".$agent_dir_controlm."/JRE_For_Restore.tar");
./ctm/data/WinInstallHelper.pl:3017:                                    $cmd_output = `cd $agent_dir_controlm;chown $agent_owner_perl:$agent_group JRE_For_Restore.tar`;
./ctm/data/WinInstallHelper.pl:3024:                    trace ($agent_dir_controlm."/JRE_For_Restore doesn't exist in filesystem.");
./ctm/data/CONFIG.dat.bck:5:CTMSHOST   ctm.caixa
./ctm/data/CONFIG.dat.bck:27:ATCMNDATA   7015
./ctm/data/CONFIG.dat.bck:28:AGCMNDATA   7016
./ctm/data/CONFIG.dat:9:CTMSHOST                            crjdeaprlx038
./ctm/data/CONFIG.dat:11:CTMPERMHOSTS                        crjdeaprlx038|crjdeaprlx039
./ctm/data/CONFIG.dat:55:ATCMNDATA                           7015
./ctm/data/CONFIG.dat:57:AGCMNDATA                           7016
grep: ./ctm/exe_9.0.19.200/vault/su_bmc: arquivo binário coincide com o padrão
./ctm/exe_9.0.19.200/ag_change_password:26:MACHINE="`$CONTROLM/scripts/sharch`"
./ctm/exe_9.0.19.200/ag_change_password:30:java_dir=`grep BMC_JAVA_HOME $CONTROLM/data/CONFIG.dat | awk '{print $2}'`
./ctm/exe_9.0.19.200/ag_change_password:32:     java_dir="$CONTROLM/JRE/bin"
./ctm/exe_9.0.19.200/ag_change_password:47:jarsPath=$CONTROLM/exe/jars
./ctm/exe_9.0.19.200/ag_report:3:java_dir=`grep BMC_JAVA_HOME $CONTROLM/data/CONFIG.dat | awk '{print $2}'`
./ctm/exe_9.0.19.200/ag_report:5:       java_dir="$CONTROLM/JRE/bin"
./ctm/exe_9.0.19.200/ag_report:15:cd $CONTROLM
./ctm/exe_9.0.19.200/ag_report:17:${java_dir}/java -DAGENT_DIR=$CONTROLM -cp $CONTROLM/exe/jars/classes.jar com/bmc/statistics/JobsRepresenter $*
grep: ./ctm/exe_9.0.19.200/agdbglvl: arquivo binário coincide com o padrão
grep: ./ctm/exe_9.0.19.200/agintercept: arquivo binário coincide com o padrão
grep: ./ctm/exe_9.0.19.200/agkeystore: arquivo binário coincide com o padrão
grep: ./ctm/exe_9.0.19.200/agxalert: arquivo binário coincide com o padrão
./ctm/exe_9.0.19.200/ctma_data_collector:4:CTMUP=`dirname $CONTROLM`
./ctm/exe_9.0.19.200/ctma_data_collector:12:     if [ -z "$CONTROLM_SERVER" ] ; then
./ctm/exe_9.0.19.200/ctma_data_collector:19:if [ "$CONTROLM_SERVER" ] ; then
./ctm/exe_9.0.19.200/ctmag:15:java_dir=`grep BMC_JAVA_HOME $CONTROLM/data/CONFIG.dat | awk '{print $2}'`
./ctm/exe_9.0.19.200/ctmag:17:  java_dir="$CONTROLM/JRE/bin"
./ctm/exe_9.0.19.200/ctmag:27:cd $CONTROLM/exe
./ctm/exe_9.0.19.200/ctmag:42:${java_dir}/java -DAGENT_DIR=$CONTROLM -cp $CONTROLM/exe/jars/classes.jar:$CONTROLM/exe/jars/xerces.jar com/bmc/agent/agcfg/AgentCfgViewer
grep: ./ctm/exe_9.0.19.200/ctmagcfg: arquivo binário coincide com o padrão
grep: ./ctm/exe_9.0.19.200/ctmagcpk: arquivo binário coincide com o padrão
grep: ./ctm/exe_9.0.19.200/ctmagfips: arquivo binário coincide com o padrão
grep: ./ctm/exe_9.0.19.200/ctmcfg: arquivo binário coincide com o padrão
grep: ./ctm/exe_9.0.19.200/ctmdllver: arquivo binário coincide com o padrão
grep: ./ctm/exe_9.0.19.200/ctmextract: arquivo binário coincide com o padrão
grep: ./ctm/exe_9.0.19.200/ctmfw: arquivo binário coincide com o padrão
./ctm/exe_9.0.19.200/ctmkeytool.pl:1102:sub GetControlMServerStatusAccordingToProtocol()
./ctm/exe_9.0.19.200/ctmkeytool.pl:1226:sub DisplayControlMServerData
./ctm/exe_9.0.19.200/ctmkeytool.pl:1305:#Keystore Path: /home/controlm/……                      -  etc/site/resource/ssl/cert/gtw.plc
./ctm/exe_9.0.19.200/ctmkeytool.pl:1330:                        DisplayControlMServerData();
./ctm/exe_9.0.19.200/ctmkeytool.pl:1334:                        my $ctm_status = GetControlMServerStatusAccordingToProtocol();
./ctm/exe_9.0.19.200/ctmkeytool.pl:2568:sub controlmServerEnvironment
./ctm/exe_9.0.19.200/ctmkeytool.pl:2589:      $ctm_server_dir=$ENV{"CONTROLM_SERVER"};
./ctm/exe_9.0.19.200/ctmkeytool.pl:2604:      my $key = "HKEY_LOCAL_MACHINE\\SOFTWARE\\BMC Software\\CONTROL-M/Server\\SYSPRM\\CONTROLM_SERVER";
./ctm/exe_9.0.19.200/ctmkeytool.pl:2805:         $ctm_server_kt ) = controlmServerEnvironment();
grep: ./ctm/exe_9.0.19.200/ctmsetown: arquivo binário coincide com o padrão
grep: ./ctm/exe_9.0.19.200/ctmsubmit: arquivo binário coincide com o padrão
grep: ./ctm/exe_9.0.19.200/ctmunixcfg: arquivo binário coincide com o padrão
grep: ./ctm/exe_9.0.19.200/ctmut: arquivo binário coincide com o padrão
./ctm/exe_9.0.19.200/external_params.xml:5:     <PRODUCT_UNIX_HOME_PATH>$CONTROLM</PRODUCT_UNIX_HOME_PATH>
grep: ./ctm/exe_9.0.19.200/libBMCAGENT.so: arquivo binário coincide com o padrão
grep: ./ctm/exe_9.0.19.200/libBMCDSECT.so: arquivo binário coincide com o padrão
grep: ./ctm/exe_9.0.19.200/libBMCGLOBAL.so: arquivo binário coincide com o padrão
grep: ./ctm/exe_9.0.19.200/libBMCIOA.so: arquivo binário coincide com o padrão
grep: ./ctm/exe_9.0.19.200/libBMCOS.so: arquivo binário coincide com o padrão
grep: ./ctm/exe_9.0.19.200/lib_BEUNIX.so: arquivo binário coincide com o padrão
grep: ./ctm/exe_9.0.19.200/libctmsecure.so: arquivo binário coincide com o padrão
grep: ./ctm/exe_9.0.19.200/openssl: arquivo binário coincide com o padrão
grep: ./ctm/exe_9.0.19.200/p_ctmag: arquivo binário coincide com o padrão
grep: ./ctm/exe_9.0.19.200/p_ctmar: arquivo binário coincide com o padrão
grep: ./ctm/exe_9.0.19.200/p_ctmat: arquivo binário coincide com o padrão
grep: ./ctm/exe_9.0.19.200/p_ctmatw: arquivo binário coincide com o padrão
grep: ./ctm/exe_9.0.19.200/p_ctmru: arquivo binário coincide com o padrão
grep: ./ctm/exe_9.0.19.200/setagstate: arquivo binário coincide com o padrão
./ctm/exe_9.0.19.200/sshcourier.sh:11:INSTALL_TYPE=`grep INSTALL_TYPE $CONTROLM/data/CONFIG.dat | awk '{print $2}' | tr "[a-z]" "[A-Z]"`
./ctm/exe_9.0.19.200/sshcourier.sh:14:   LOCALHOST=`grep LOCALHOST $CONTROLM/data/CONFIG.dat | awk '{print $2}' | awk -F/ '{print $1}'| tr "[A-Z]" "[a-z]"`
./ctm/exe_9.0.19.200/sshcourier.sh:40:  LOG_FILE=$CONTROLM/proclog/sshcourier_${action}_${DATE}_$$.log
./ctm/exe_9.0.19.200/sshcourier.sh:96:MACHINE="`$CONTROLM/scripts/sharch`"
./ctm/exe_9.0.19.200/sshcourier.sh:129:#MACHINE="`$CONTROLM/scripts/sharch`"
./ctm/exe_9.0.19.200/sshcourier.sh:132:java_dir=`grep BMC_JAVA_HOME $CONTROLM/data/CONFIG.dat | awk '{print $2}'`
./ctm/exe_9.0.19.200/sshcourier.sh:134: java_dir="$CONTROLM/JRE/bin"
./ctm/exe_9.0.19.200/sshcourier.sh:146:max_memory=`grep RJX_MAX_MEM_COURIER $CONTROLM/data/OS.dat | awk '{print $2}'`
./ctm/exe_9.0.19.200/sshcourier.sh:152:min_memory=`grep RJX_MIN_MEM_COURIER $CONTROLM/data/OS.dat | awk '{print $2}'`
grep: ./ctm/exe_9.0.19.200/su_bmc: arquivo binário coincide com o padrão
./ctm/hcu/hcu_oap_tnsnames:6:oracle_home=`grep ORACLE_HOME $CONTROLM/data/OAP_11I.dat | awk '{print $2}'`
./ctm/measure/20240904_DS.csv:22:20240904,193917,20240904,193907,20240904,193917,CPU,TOTAL,%,1,"1,00","DS",37015,"DS","9.0.19.200","By ag_main_cpu_monitor()"
./ctm/measure/20260526_DS.csv:10:20260526,070700,20260526,070650,20260526,070700,CPU,TOTAL,%,1,"0,00","DS",701527,"DS","9.0.20.100","By ag_main_cpu_monitor()"
./ctm/measure/20260612_AG.csv:18:20260612,170156,20260612,170156,20260612,170156,FORK,AVERAGE,ms,2,"0,50","AG",1748,"AG","9.0.20.100",""
./ctm/measure/20260612_DS.csv:19:20260612,170206,20260612,170156,20260612,170206,CPU,TOTAL,%,1,"0,00","DS",881202,"DS","9.0.20.100","By ag_main_cpu_monitor()"
./ctm/measure/20260702_DS.csv:19:20260702,170151,20260702,170141,20260702,170151,CPU,TOTAL,%,1,"0,00","DS",28816,"DS","9.0.20.100","By ag_main_cpu_monitor()"
./ctm/measure/20260714_DS.csv:13:20260714,104031,20260714,104021,20260714,104031,CPU,TOTAL,%,1,"0,00","DS",157015,"DS","9.0.20.100","By ag_main_cpu_monitor()"
./ctm/measure/20260910_DS.csv:19:20260910,170206,20260910,170156,20260910,170206,CPU,TOTAL,%,1,"0,00","DS",980959,"DS","9.0.20.100","By ag_main_cpu_monitor()"
./ctm/measure/20260910_AG.csv:18:20260910,170156,20260910,170156,20260910,170156,FORK,AVERAGE,ms,2,"0,50","AG",257259,"AG","9.0.20.100",""
./ctm/measure/20260822_DS.csv:22:20260822,194506,20260822,194456,20260822,194506,CPU,TOTAL,%,1,"0,00","DS",701553,"DS","9.0.20.100","By ag_main_cpu_monitor()"
./ctm/proclog/ag_ping_1638574.log:3:1030 15:00:29:385 ag_ping:getaddrinfo failed for host crjdeaprlx038, port 7015: Name or service not known
./ctm/proclog/ag_ping_1638574.log:85:1030 15:00:29:381 ag_ping:GM_PARAM_get: table:'CONFIG', key:'CTMSHOST'
./ctm/proclog/ag_ping_1638574.log:87:1030 15:00:29:381 ag_ping:GM_PARAM_get: rc = 1, table:'CONFIG', key:'CTMSHOST', value:'crjdeaprlx038'
./ctm/proclog/ag_ping_1638574.log:134:1030 15:00:29:382 ag_ping:CTMHOST: 'crjdeaprlx038
./ctm/proclog/ag_ping_1638574.log:136:1030 15:00:29:382 ag_ping:DSECT HEADER buffer: '0100982026103015002912CMP RT16385740000200000137caddeapllx2501.agil.nprd.caixa.gov.br13crjdeaprlx0380000'
./ctm/proclog/ag_ping_1638574.log:142:1030 15:00:29:382 ag_ping:GM_PARAM_get: table:'CONFIG', key:'CTMSHOST'
./ctm/proclog/ag_ping_1638574.log:144:1030 15:00:29:382 ag_ping:GM_PARAM_get: rc = 1, table:'CONFIG', key:'CTMSHOST', value:'crjdeaprlx038'
./ctm/proclog/ag_ping_1638574.log:145:1030 15:00:29:382 ag_ping:connect to CTMS on host 'crjdeaprlx038'
./ctm/proclog/ag_ping_1638574.log:148:1030 15:00:29:382 ag_ping:GM_PARAM_get: rc = 1, table:'CONFIG', key:'CTMPERMHOSTS', value:'crjdeaprlx038|crjdeaprlx039'
./ctm/proclog/ag_ping_1638574.log:161:1030 15:00:29:382 ag_ping:GM_PARAM_get: rc = 1, table:'CONFIG', key:'ATCMNDATA', value:'7015'
./ctm/proclog/ag_ping_1638574.log:162:1030 15:00:29:382 ag_ping:Port: '7015'
./ctm/proclog/ag_ping_1638574.log:285:1030 15:00:29:384 ag_ping:connecting to primary server 'crjdeaprlx038' attempt #1
./ctm/proclog/ag_ping_1638574.log:287:1030 15:00:29:384 ag_ping:Port set to 7015
./ctm/proclog/ag_ping_1638574.log:299:1030 15:00:29:384 ag_ping:OS_COMM_init: hostname crjdeaprlx038
./ctm/proclog/ag_ping_1638574.log:305:1030 15:00:29:385 ag_ping:getaddrinfo failed for host crjdeaprlx038, port 7015: Name or service not known
./ctm/proclog/ag_ping_1638574.log:311:1030 15:00:30:387 ag_ping:connecting to primary server 'crjdeaprlx038' attempt #2
./ctm/proclog/ag_ping_1638574.log:313:1030 15:00:30:387 ag_ping:Port set to 7015
./ctm/proclog/ag_ping_1638574.log:325:1030 15:00:30:387 ag_ping:OS_COMM_init: hostname crjdeaprlx038
./ctm/proclog/ag_ping_1638574.log:331:1030 15:00:30:389 ag_ping:getaddrinfo failed for host crjdeaprlx038, port 7015: Name or service not known
./ctm/proclog/ag_ping_1638574.log:333:1030 15:00:31:389 ag_ping:connecting to primary server 'crjdeaprlx038' attempt #3
./ctm/proclog/ag_ping_1638574.log:335:1030 15:00:31:389 ag_ping:Port set to 7015
./ctm/proclog/ag_ping_1638574.log:347:1030 15:00:31:389 ag_ping:OS_COMM_init: hostname crjdeaprlx038
./ctm/proclog/ag_ping_1638574.log:353:1030 15:00:31:390 ag_ping:getaddrinfo failed for host crjdeaprlx038, port 7015: Name or service not known
./ctm/proclog/ag_ping_1638574.log:355:1030 15:00:32:391 ag_ping:connecting to primary server 'crjdeaprlx038' attempt #4
./ctm/proclog/ag_ping_1638574.log:357:1030 15:00:32:391 ag_ping:Port set to 7015
./ctm/proclog/ag_ping_1638574.log:369:1030 15:00:32:391 ag_ping:OS_COMM_init: hostname crjdeaprlx038
./ctm/proclog/ag_ping_1638574.log:375:1030 15:00:32:392 ag_ping:getaddrinfo failed for host crjdeaprlx038, port 7015: Name or service not known
./ctm/proclog/ag_ping_1638574.log:377:1030 15:00:33:392 ag_ping:connecting to primary server 'crjdeaprlx038' attempt #5
./ctm/proclog/ag_ping_1638574.log:379:1030 15:00:33:392 ag_ping:Port set to 7015
./ctm/proclog/ag_ping_1638574.log:391:1030 15:00:33:392 ag_ping:OS_COMM_init: hostname crjdeaprlx038
./ctm/proclog/ag_ping_1638574.log:397:1030 15:00:33:394 ag_ping:getaddrinfo failed for host crjdeaprlx038, port 7015: Name or service not known
./ctm/proclog/ag_ping_1638574.log:399:1030 15:00:34:394 ag_ping:connecting to primary server 'crjdeaprlx038' attempt #6
./ctm/proclog/ag_ping_1638574.log:401:1030 15:00:34:394 ag_ping:Port set to 7015
./ctm/proclog/ag_ping_1638574.log:413:1030 15:00:34:394 ag_ping:OS_COMM_init: hostname crjdeaprlx038
./ctm/proclog/ag_ping_1638574.log:419:1030 15:00:34:395 ag_ping:getaddrinfo failed for host crjdeaprlx038, port 7015: Name or service not known
./ctm/proclog/ag_ping_1638574.log:421:1030 15:00:35:395 ag_ping:connecting to primary server 'crjdeaprlx038' attempt #7
./ctm/proclog/ag_ping_1638574.log:423:1030 15:00:35:396 ag_ping:Port set to 7015
./ctm/proclog/ag_ping_1638574.log:435:1030 15:00:35:396 ag_ping:OS_COMM_init: hostname crjdeaprlx038
./ctm/proclog/ag_ping_1638574.log:441:1030 15:00:35:397 ag_ping:getaddrinfo failed for host crjdeaprlx038, port 7015: Name or service not known
./ctm/proclog/ag_ping_1638574.log:443:1030 15:00:36:397 ag_ping:connecting to primary server 'crjdeaprlx038' attempt #8
./ctm/proclog/ag_ping_1638574.log:445:1030 15:00:36:397 ag_ping:Port set to 7015
./ctm/proclog/ag_ping_1638574.log:457:1030 15:00:36:397 ag_ping:OS_COMM_init: hostname crjdeaprlx038
./ctm/proclog/ag_ping_1638574.log:463:1030 15:00:36:398 ag_ping:getaddrinfo failed for host crjdeaprlx038, port 7015: Name or service not known
./ctm/proclog/ag_ping_1638574.log:465:1030 15:00:37:399 ag_ping:connecting to primary server 'crjdeaprlx038' attempt #9
./ctm/proclog/ag_ping_1638574.log:467:1030 15:00:37:399 ag_ping:Port set to 7015
./ctm/proclog/ag_ping_1638574.log:479:1030 15:00:37:399 ag_ping:OS_COMM_init: hostname crjdeaprlx038
./ctm/proclog/ag_ping_1638574.log:485:1030 15:00:37:400 ag_ping:getaddrinfo failed for host crjdeaprlx038, port 7015: Name or service not known
./ctm/proclog/ag_ping_1638574.log:487:1030 15:00:38:400 ag_ping:connecting to primary server 'crjdeaprlx038' attempt #10
./ctm/proclog/ag_ping_1638574.log:489:1030 15:00:38:400 ag_ping:Port set to 7015
./ctm/proclog/ag_ping_1638574.log:501:1030 15:00:38:400 ag_ping:OS_COMM_init: hostname crjdeaprlx038
./ctm/proclog/ag_ping_1638574.log:507:1030 15:00:38:402 ag_ping:getaddrinfo failed for host crjdeaprlx038, port 7015: Name or service not known
./ctm/proclog/ag_ping_1638574.log:509:1030 15:00:39:402 ag_ping:connecting to primary server 'crjdeaprlx038' attempt #11
./ctm/proclog/ag_ping_1638574.log:511:1030 15:00:39:402 ag_ping:Port set to 7015
./ctm/proclog/ag_ping_1638574.log:523:1030 15:00:39:402 ag_ping:OS_COMM_init: hostname crjdeaprlx038
./ctm/proclog/ag_ping_1638574.log:529:1030 15:00:39:404 ag_ping:getaddrinfo failed for host crjdeaprlx038, port 7015: Name or service not known
./ctm/proclog/ag_ping_1638574.log:531:1030 15:00:40:404 ag_ping:connecting to primary server 'crjdeaprlx038' attempt #12
./ctm/proclog/ag_ping_1638574.log:533:1030 15:00:40:404 ag_ping:Port set to 7015
./ctm/proclog/ag_ping_1638574.log:545:1030 15:00:40:404 ag_ping:OS_COMM_init: hostname crjdeaprlx038
./ctm/proclog/ag_ping_1638574.log:551:1030 15:00:40:405 ag_ping:getaddrinfo failed for host crjdeaprlx038, port 7015: Name or service not known
./ctm/proclog/ag_ping_1639024.log:3:1030 15:06:13:613 ag_ping:getaddrinfo failed for host crjdeaprlx038, port 7015: Name or service not known
./ctm/proclog/ag_ping_1639024.log:85:1030 15:06:13:611 ag_ping:GM_PARAM_get: table:'CONFIG', key:'CTMSHOST'
./ctm/proclog/ag_ping_1639024.log:87:1030 15:06:13:611 ag_ping:GM_PARAM_get: rc = 1, table:'CONFIG', key:'CTMSHOST', value:'crjdeaprlx038'
./ctm/proclog/ag_ping_1639024.log:134:1030 15:06:13:611 ag_ping:CTMHOST: 'crjdeaprlx038
./ctm/proclog/ag_ping_1639024.log:136:1030 15:06:13:611 ag_ping:DSECT HEADER buffer: '0100982026103015061312CMP RT16390240000200000137caddeapllx2501.agil.nprd.caixa.gov.br13crjdeaprlx0380000'
./ctm/proclog/ag_ping_1639024.log:142:1030 15:06:13:611 ag_ping:GM_PARAM_get: table:'CONFIG', key:'CTMSHOST'
./ctm/proclog/ag_ping_1639024.log:144:1030 15:06:13:611 ag_ping:GM_PARAM_get: rc = 1, table:'CONFIG', key:'CTMSHOST', value:'crjdeaprlx038'
./ctm/proclog/ag_ping_1639024.log:145:1030 15:06:13:611 ag_ping:connect to CTMS on host 'crjdeaprlx038'
./ctm/proclog/ag_ping_1639024.log:148:1030 15:06:13:611 ag_ping:GM_PARAM_get: rc = 1, table:'CONFIG', key:'CTMPERMHOSTS', value:'crjdeaprlx038|crjdeaprlx039'
./ctm/proclog/ag_ping_1639024.log:161:1030 15:06:13:611 ag_ping:GM_PARAM_get: rc = 1, table:'CONFIG', key:'ATCMNDATA', value:'7015'
./ctm/proclog/ag_ping_1639024.log:162:1030 15:06:13:611 ag_ping:Port: '7015'
./ctm/proclog/ag_ping_1639024.log:285:1030 15:06:13:612 ag_ping:connecting to primary server 'crjdeaprlx038' attempt #1
./ctm/proclog/ag_ping_1639024.log:287:1030 15:06:13:612 ag_ping:Port set to 7015
./ctm/proclog/ag_ping_1639024.log:299:1030 15:06:13:612 ag_ping:OS_COMM_init: hostname crjdeaprlx038
./ctm/proclog/ag_ping_1639024.log:305:1030 15:06:13:613 ag_ping:getaddrinfo failed for host crjdeaprlx038, port 7015: Name or service not known
./ctm/proclog/ag_ping_1639024.log:311:1030 15:06:14:613 ag_ping:connecting to primary server 'crjdeaprlx038' attempt #2
./ctm/proclog/ag_ping_1639024.log:313:1030 15:06:14:614 ag_ping:Port set to 7015
./ctm/proclog/ag_ping_1639024.log:325:1030 15:06:14:614 ag_ping:OS_COMM_init: hostname crjdeaprlx038
./ctm/proclog/ag_ping_1639024.log:331:1030 15:06:14:615 ag_ping:getaddrinfo failed for host crjdeaprlx038, port 7015: Name or service not known
./ctm/proclog/ag_ping_1639024.log:333:1030 15:06:15:615 ag_ping:connecting to primary server 'crjdeaprlx038' attempt #3
./ctm/proclog/ag_ping_1639024.log:335:1030 15:06:15:615 ag_ping:Port set to 7015
./ctm/proclog/ag_ping_1639024.log:347:1030 15:06:15:615 ag_ping:OS_COMM_init: hostname crjdeaprlx038
./ctm/proclog/ag_ping_1639024.log:353:1030 15:06:15:616 ag_ping:getaddrinfo failed for host crjdeaprlx038, port 7015: Name or service not known
./ctm/proclog/ag_ping_1639024.log:355:1030 15:06:16:617 ag_ping:connecting to primary server 'crjdeaprlx038' attempt #4
./ctm/proclog/ag_ping_1639024.log:357:1030 15:06:16:617 ag_ping:Port set to 7015
./ctm/proclog/ag_ping_1639024.log:369:1030 15:06:16:617 ag_ping:OS_COMM_init: hostname crjdeaprlx038
./ctm/proclog/ag_ping_1639024.log:375:1030 15:06:16:618 ag_ping:getaddrinfo failed for host crjdeaprlx038, port 7015: Name or service not known
./ctm/proclog/ag_ping_1639024.log:377:1030 15:06:17:618 ag_ping:connecting to primary server 'crjdeaprlx038' attempt #5
./ctm/proclog/ag_ping_1639024.log:379:1030 15:06:17:618 ag_ping:Port set to 7015
./ctm/proclog/ag_ping_1639024.log:391:1030 15:06:17:618 ag_ping:OS_COMM_init: hostname crjdeaprlx038
./ctm/proclog/ag_ping_1639024.log:397:1030 15:06:17:620 ag_ping:getaddrinfo failed for host crjdeaprlx038, port 7015: Name or service not known
./ctm/proclog/ag_ping_1639024.log:399:1030 15:06:18:620 ag_ping:connecting to primary server 'crjdeaprlx038' attempt #6
./ctm/proclog/ag_ping_1639024.log:401:1030 15:06:18:620 ag_ping:Port set to 7015
./ctm/proclog/ag_ping_1639024.log:413:1030 15:06:18:620 ag_ping:OS_COMM_init: hostname crjdeaprlx038
./ctm/proclog/ag_ping_1639024.log:419:1030 15:06:18:622 ag_ping:getaddrinfo failed for host crjdeaprlx038, port 7015: Name or service not known
./ctm/proclog/ag_ping_1639024.log:421:1030 15:06:19:622 ag_ping:connecting to primary server 'crjdeaprlx038' attempt #7
./ctm/proclog/ag_ping_1639024.log:423:1030 15:06:19:622 ag_ping:Port set to 7015
./ctm/proclog/ag_ping_1639024.log:435:1030 15:06:19:622 ag_ping:OS_COMM_init: hostname crjdeaprlx038
./ctm/proclog/ag_ping_1639024.log:441:1030 15:06:19:624 ag_ping:getaddrinfo failed for host crjdeaprlx038, port 7015: Name or service not known
./ctm/proclog/ag_ping_1639024.log:443:1030 15:06:20:624 ag_ping:connecting to primary server 'crjdeaprlx038' attempt #8
./ctm/proclog/ag_ping_1639024.log:445:1030 15:06:20:624 ag_ping:Port set to 7015
./ctm/proclog/ag_ping_1639024.log:457:1030 15:06:20:624 ag_ping:OS_COMM_init: hostname crjdeaprlx038
./ctm/proclog/ag_ping_1639024.log:463:1030 15:06:20:625 ag_ping:getaddrinfo failed for host crjdeaprlx038, port 7015: Name or service not known
./ctm/proclog/ag_ping_1639024.log:465:1030 15:06:21:626 ag_ping:connecting to primary server 'crjdeaprlx038' attempt #9
./ctm/proclog/ag_ping_1639024.log:467:1030 15:06:21:626 ag_ping:Port set to 7015
./ctm/proclog/ag_ping_1639024.log:479:1030 15:06:21:626 ag_ping:OS_COMM_init: hostname crjdeaprlx038
./ctm/proclog/ag_ping_1639024.log:485:1030 15:06:21:627 ag_ping:getaddrinfo failed for host crjdeaprlx038, port 7015: Name or service not known
./ctm/proclog/ag_ping_1639024.log:487:1030 15:06:22:627 ag_ping:connecting to primary server 'crjdeaprlx038' attempt #10
./ctm/proclog/ag_ping_1639024.log:489:1030 15:06:22:627 ag_ping:Port set to 7015
./ctm/proclog/ag_ping_1639024.log:501:1030 15:06:22:627 ag_ping:OS_COMM_init: hostname crjdeaprlx038
./ctm/proclog/ag_ping_1639024.log:507:1030 15:06:22:629 ag_ping:getaddrinfo failed for host crjdeaprlx038, port 7015: Name or service not known
./ctm/proclog/ag_ping_1639024.log:509:1030 15:06:23:629 ag_ping:connecting to primary server 'crjdeaprlx038' attempt #11
./ctm/proclog/ag_ping_1639024.log:511:1030 15:06:23:629 ag_ping:Port set to 7015
./ctm/proclog/ag_ping_1639024.log:523:1030 15:06:23:629 ag_ping:OS_COMM_init: hostname crjdeaprlx038
./ctm/proclog/ag_ping_1639024.log:529:1030 15:06:23:631 ag_ping:getaddrinfo failed for host crjdeaprlx038, port 7015: Name or service not known
./ctm/proclog/ag_ping_1639024.log:531:1030 15:06:24:631 ag_ping:connecting to primary server 'crjdeaprlx038' attempt #12
./ctm/proclog/ag_ping_1639024.log:533:1030 15:06:24:631 ag_ping:Port set to 7015
./ctm/proclog/ag_ping_1639024.log:545:1030 15:06:24:631 ag_ping:OS_COMM_init: hostname crjdeaprlx038
./ctm/proclog/ag_ping_1639024.log:551:1030 15:06:24:632 ag_ping:getaddrinfo failed for host crjdeaprlx038, port 7015: Name or service not known
./ctm/scripts/ag_check_jobs:4:INSTALL_TYPE=`grep INSTALL_TYPE $CONTROLM/data/CONFIG.dat | awk '{print $2}' | tr "[a-z]" "[A-Z]"`
./ctm/scripts/ag_check_jobs:7:   LOCALHOST=`grep LOCALHOST $CONTROLM/data/CONFIG.dat | awk '{print $2}' | awk -F/ '{print $1}'| tr "[A-Z]" "[a-z]"`
./ctm/scripts/ag_check_jobs:20:stat_files=`ls -1 $CONTROLM/status`
./ctm/scripts/ag_check_jobs:29:   pid=`grep PROCID $CONTROLM/status/$file | awk '{print $2}'`
./ctm/scripts/ag_check_jobs:30:   orderno=`grep ORDERNO $CONTROLM/status/$file | awk '{print $2}'`
./ctm/scripts/ag_check_jobs:31:   runno=`grep RUNNO $CONTROLM/status/$file | awk '{print $2}'`
./ctm/scripts/ag_check_jobs:32:   jobname=`grep JOBNAME $CONTROLM/status/$file | awk '{print $2}'`
./ctm/scripts/ag_check_jobs:41:          mv $CONTROLM/status/$file $CONTROLM/backup/$file
./ctm/scripts/ag_diag_comm:6:  machine=`$CONTROLM/scripts/sharch`
./ctm/scripts/ag_diag_comm:60:  INSTALL_TYPE=`grep INSTALL_TYPE $CONTROLM/data/CONFIG.dat | awk '{print $2}' | tr "[a-z]" "[A-Z]"`
./ctm/scripts/ag_diag_comm:63:     LOCALHOST=`grep LOCALHOST $CONTROLM/data/CONFIG.dat | awk '{print $2}' | awk -F/ '{print $1}'| tr "[A-Z]" "[a-z]"`
./ctm/scripts/ag_diag_comm:75:  config_file=$CONTROLM/data/CONFIG.dat
./ctm/scripts/ag_diag_comm:76:  permit_file=$CONTROLM/data/agpermit.dat
./ctm/scripts/ag_diag_comm:77:  ag_ping_ut=$CONTROLM/exe/ag_ping
./ctm/scripts/ag_diag_comm:322:ctms=`grep "^CTMSHOST" $config_file | awk '{print $2}'`
./ctm/scripts/ag_diag_comm:351:echo " Agent Directory                :" $CONTROLM
./ctm/scripts/check_nfs_can_run.sh:3:# verify the the CONTROLM environment variable is defined in the account
./ctm/scripts/check_nfs_can_run.sh:7:   CONTROLM=`$SU - $user -c "$bash_prefix env" 2>/dev/null | grep 'CONTROLM=' | awk -F= '{print $2}'`
./ctm/scripts/check_nfs_can_run.sh:8:   if [ -z "$CONTROLM" ] ; then
./ctm/scripts/check_nfs_can_run.sh:11:     # look for CONTROLM_SERVER variable to determine if this is a joined server/agent installation
./ctm/scripts/check_nfs_can_run.sh:12:     CONTROLM_SERVER=`$SU - $user -c "$bash_prefix env" 2>/dev/null | grep 'CONTROLM_SERVER=' | awk -F= '{print $2}'`
./ctm/scripts/check_nfs_can_run.sh:15:   # running as non root. verify that $CONTROLM exists
./ctm/scripts/check_nfs_can_run.sh:16:   if [ -z "$CONTROLM" ] ; then
./ctm/scripts/check_nfs_can_run.sh:44:# verify the CONTROLM environment variable and check if the CONTROLM_SERVER
./ctm/scripts/check_nfs_can_run.sh:48:   echo "*** CONTROLM environment variable is not defined . ***"
./ctm/scripts/check_nfs_can_run.sh:52:# now check that the CONTROLM variable is not too long because we need the full path not to be longer than the limit of 'ps -ef'
./ctm/scripts/check_nfs_can_run.sh:56:CONTROLM_LIMIT=65
./ctm/scripts/check_nfs_can_run.sh:57:CONTROLM_LEN=`expr $CONTROLM : '.*'`
./ctm/scripts/check_nfs_can_run.sh:58:if [ $CONTROLM_LEN -gt $CONTROLM_LIMIT ] ; then
./ctm/scripts/check_nfs_can_run.sh:59:   echo "*** CONTROLM environment variable is too long."
./ctm/scripts/check_nfs_can_run.sh:60:   echo "*** It's set to '$CONTROLM'."
./ctm/scripts/check_nfs_can_run.sh:61:   echo "*** Its length is $CONTROLM_LEN while the limit is $CONTROLM_LIMIT."
./ctm/scripts/check_nfs_can_run.sh:68:INSTALL_TYPE=`grep INSTALL_TYPE $CONTROLM/data/CONFIG.dat | awk '{print $2}' | tr "[a-z]" "[A-Z]"`
./ctm/scripts/check_nfs_can_run.sh:71:   LOCALHOST=`grep LOCALHOST $CONTROLM/data/CONFIG.dat | awk '{print $2}' | awk -F/ '{print $1}'| tr "[A-Z]" "[a-z]"`
./ctm/scripts/handle_jre_downgrade.sh:7:        ag_perl_home=`grep AG_PERL_HOME $CONTROLM/data/CONFIG.dat | awk '{print $2}'`
./ctm/scripts/keygen.sh:17:OPENSSL_CONF=${CONTROLM}/data/SSL/cert/openssl.cnf
./ctm/scripts/keygen.sh:32:    ${CONTROLM}/exe/openssl rand -out $keyoutput $aesKey
./ctm/scripts/merge_dailylog.pl:11:my $CONTROLM ="";
./ctm/scripts/merge_dailylog.pl:12:# get CONTROLM
./ctm/scripts/merge_dailylog.pl:13:if(defined($ENV{'CONTROLM'}))
./ctm/scripts/merge_dailylog.pl:15:    $CONTROLM = $ENV{'CONTROLM'};
./ctm/scripts/merge_dailylog.pl:19:    $CONTROLM = abs_path(__FILE__);
./ctm/scripts/merge_dailylog.pl:20:    $CONTROLM = substr($CONTROLM,0,rindex($CONTROLM, '/scripts'));
./ctm/scripts/merge_dailylog.pl:55:my $time_to_del =`grep TIME_TO_DEL $CONTROLM/data/CONFIG.dat | awk '{print \$2}'`;
./ctm/scripts/merge_dailylog.pl:67:print "CONTOLRM is: $CONTROLM\n";
./ctm/scripts/merge_dailylog.pl:69:my $dailylog_dir_path = $CONTROLM ."/dailylog/";
./ctm/scripts/set_agent_mode:19:        strings $CONTROLM/exe/vault/su_bmc | grep SU_BMC_SUPPORT_AES 1>/dev/null 2>&1
./ctm/scripts/set_agent_mode:25:        TEMP_FILE=$CONTROLM/temp/$$.tmp
./ctm/scripts/set_agent_mode:26:        grep -v SU_BMC_SUPPORT_AES $CONTROLM/data/OS.dat > $TEMP_FILE
./ctm/scripts/set_agent_mode:31:                 echo_to_file "Could not set SU_BMC_SUPPORT_AES parameter to ${SU_BMC_SUPPORT_AES} in $CONTROLM/data/OS.dat"
./ctm/scripts/set_agent_mode:38:        mv $TEMP_FILE $CONTROLM/data/OS.dat
./ctm/scripts/set_agent_mode:41:           chown $user $CONTROLM/data/OS.dat
./ctm/scripts/set_agent_mode:42:           chgrp $group $CONTROLM/data/OS.dat
./ctm/scripts/set_agent_mode:50:        grep "SU_BMC_SUPPORT_AES[ ]*Y" $CONTROLM/data/OS.dat 1>/dev/null 2>&1
./ctm/scripts/set_agent_mode:56:                TEMP_FILE=$CONTROLM/temp/$$.tmp
./ctm/scripts/set_agent_mode:57:                grep -v SU_BMC_SUPPORT_AES $CONTROLM/data/OS.dat > $TEMP_FILE
./ctm/scripts/set_agent_mode:60:                        echo_to_file "Could not set SU_BMC_SUPPORT_AES parameter to ${SU_BMC_SUPPORT_AES} in $CONTROLM/data/OS.dat"
./ctm/scripts/set_agent_mode:67:                mv $TEMP_FILE $CONTROLM/data/OS.dat
./ctm/scripts/set_agent_mode:70:                        chown $user $CONTROLM/data/OS.dat
./ctm/scripts/set_agent_mode:71:                        chgrp $group $CONTROLM/data/OS.dat
./ctm/scripts/set_agent_mode:90:                        TEMP_FILE=$CONTROLM/temp/$$.tmp
./ctm/scripts/set_agent_mode:91:                        grep -v SUDO_ENABLED $CONTROLM/data/OS.dat > $TEMP_FILE
./ctm/scripts/set_agent_mode:96:                                 echo_to_file "Could not set SUDO_ENABLED parameter to ${SUDO_ENABLED} in $CONTROLM/data/OS.dat"
./ctm/scripts/set_agent_mode:103:                        mv $TEMP_FILE $CONTROLM/data/OS.dat
./ctm/scripts/set_agent_mode:106:                           chown $user $CONTROLM/data/OS.dat
./ctm/scripts/set_agent_mode:107:                           chgrp $group $CONTROLM/data/OS.dat
./ctm/scripts/set_agent_mode:122:       grep "SUDO_ENABLED[ ]*Y" $CONTROLM/data/OS.dat 1>/dev/null 2>&1
./ctm/scripts/set_agent_mode:128:               TEMP_FILE=$CONTROLM/temp/$$.tmp
./ctm/scripts/set_agent_mode:129:               grep -v SUDO_ENABLED $CONTROLM/data/OS.dat > $TEMP_FILE
./ctm/scripts/set_agent_mode:132:                       echo_to_file "Could not set SUDO_ENABLED parameter to ${SUDO_ENABLED} in $CONTROLM/data/OS.dat"
./ctm/scripts/set_agent_mode:139:               mv $TEMP_FILE $CONTROLM/data/OS.dat
./ctm/scripts/set_agent_mode:142:                       chown $user $CONTROLM/data/OS.dat
./ctm/scripts/set_agent_mode:143:                       chgrp $group $CONTROLM/data/OS.dat
./ctm/scripts/set_agent_mode:153:  machine=`$CONTROLM/scripts/sharch`
./ctm/scripts/set_agent_mode:175:# verify that the agent user as given by the user has $CONTROLM defined
./ctm/scripts/set_agent_mode:179:               CONTROLM=`su - $user -c env 2>/dev/null | grep 'CONTROLM=' | awk -F= '{print $2}'`
./ctm/scripts/set_agent_mode:183:   if [ -z "$CONTROLM" ] ; then
./ctm/scripts/set_agent_mode:188:                       CONTROLM=`su - $user $LOGIN_FLAG -c env 2>/dev/null | grep 'CONTROLM=' | awk -F= '{print $2}'`
./ctm/scripts/set_agent_mode:190:               if [ -z "$CONTROLM" ] ; then
./ctm/scripts/set_agent_mode:263:               shagent_out=`su - $user $LOGIN_FLAG -c "$CONTROLM/scripts/shagent"`
./ctm/scripts/set_agent_mode:269:       grep 'SUDO_ENABLED[ ]*Y' $CONTROLM/data/OS.dat 1>/dev/null 2>&1
./ctm/scripts/set_agent_mode:272:       NON_ROOT_DIR=$CONTROLM/non-root
./ctm/scripts/set_agent_mode:274:               SU_BMC_OWNER=`ls -Xld $CONTROLM/exe/vault/su_bmc| awk '{print $3 }'`
./ctm/scripts/set_agent_mode:276:               SU_BMC_OWNER=`ls -ld $CONTROLM/exe/vault/su_bmc| awk '{print $3 }'`
./ctm/scripts/set_agent_mode:296:    # EXE_PATH_LEN=`expr length $CONTROLM/exe`  ===> This line doesn't work on Solaris 10
./ctm/scripts/set_agent_mode:297:    EXE_PATH_LEN=`echo $CONTROLM/exe | tr -d '\n' | wc -m | tr -d ' '`
./ctm/scripts/set_agent_mode:392:  chmod 0755  $CONTROLM/sysout
./ctm/scripts/set_agent_mode:393:  echo_to_file "$CONTROLM/sysout permissions set to 755 without sticky bit"
./ctm/scripts/set_agent_mode:395:  chmod g-s $CONTROLM/sysout
./ctm/scripts/set_agent_mode:396:  echo_to_file "$CONTROLM/sysout setgid bit was reset"
./ctm/scripts/set_agent_mode:405:       VERSION=`grep FD_NUMBER $CONTROLM/data/CONFIG.dat | cut -f 2- -d.`
./ctm/scripts/set_agent_mode:408:               echo "BMC Software Control-M/Agent $VERSION $user $CONTROLM/exe/p_ctmag" >> $TEMP_FILE
./ctm/scripts/set_agent_mode:411:               echo "BMC Software Control-M/Agent $VERSION $user $CONTROLM/exe/p_ctmag" >> $CTM_CONF
./ctm/scripts/set_agent_mode:432:  INSTALL_TYPE=`grep INSTALL_TYPE $CONTROLM/data/CONFIG.dat | awk '{print $2}' | tr "[a-z]" "[A-Z]"`
./ctm/scripts/set_agent_mode:436:      LOCALHOST=`grep LOCALHOST $CONTROLM/data/CONFIG.dat | awk '{print $2}' | awk -F/ '{print $1}'| tr "[A-Z]" "[a-z]"`
./ctm/scripts/set_agent_mode:456:         FILE_NAME=$CONTROLM/test_start.txt
./ctm/scripts/set_agent_mode:463:         FILE_OWNER=`ls -ltr $CONTROLM | grep "test_start.txt" | awk '{print $3}'`
./ctm/scripts/set_agent_mode:519:# get the CONTROLM environment variable
./ctm/scripts/set_agent_mode:522:   echo "*** CONTROLM environment variable is not defined for user $user. ***"
./ctm/scripts/set_agent_mode:533:LOG_FILE=$CONTROLM/proclog/set_agent_mode_$$.log
./ctm/scripts/set_agent_mode:537:       shagent_out=`su - $user $LOGIN_FLAG -c "$CONTROLM/scripts/shagent"`
./ctm/scripts/set_agent_mode:586:SU_BMC=$CONTROLM/exe/vault/su_bmc
./ctm/scripts/set_agent_mode:587:SU_BMC_NEW=$CONTROLM/exe/su_bmc
./ctm/scripts/set_agent_mode:588:NON_ROOT_DIR=$CONTROLM/non-root
./ctm/scripts/set_agent_mode:596:    EXE_PATH_LEN=`echo $CONTROLM/exe | tr -d '\n' | wc -m | tr -d ' '`
./ctm/scripts/set_agent_mode:611:               mv -f $SU_BMC_NEW $CONTROLM/exe/vault/.
./ctm/scripts/set_agent_mode:616:               SU_BMC_OWNER=`ls -Xld $CONTROLM/exe/vault/su_bmc| awk '{print $3 }'`
./ctm/scripts/set_agent_mode:618:               SU_BMC_OWNER=`ls -ld $CONTROLM/exe/vault/su_bmc| awk '{print $3 }'`
./ctm/scripts/set_agent_mode:635:                 SU_BMC_RPATH_INDEX=`elfedit -e 'dyn:runpath -o num' $CONTROLM/exe/vault/su_bmc`
./ctm/scripts/set_agent_mode:636:                 elfedit -e "str:set -shnam .dynstr -strndx  $SU_BMC_RPATH_INDEX $CONTROLM/exe" $CONTROLM/exe/vault/su_bmc
./ctm/scripts/set_agent_mode:637:                 echo_to_file "$SU_BMC RPATH in ELF set to '$CONTROLM/exe'"
./ctm/scripts/set_agent_mode:641:               chmod 1777  $CONTROLM/sysout
./ctm/scripts/set_agent_mode:642:               echo_to_file "$CONTROLM/sysout permissions set to 777 with sticky bit"
./ctm/scripts/set_agent_mode:644:               chmod g+s $CONTROLM/sysout
./ctm/scripts/set_agent_mode:645:               echo_to_file "$CONTROLM/sysout setgid bit was set"
./ctm/scripts/set_agent_mode:682:               shagent_out=`su - $user $LOGIN_FLAG -c $CONTROLM/scripts/shagent`
./ctm/scripts/set_agent_mode:701:                               $CONTROLM/scripts/shut-ag -u $user -p all
./ctm/scripts/set_agent_mode:703:                               su - $user $LOGIN_FLAG -c "$CONTROLM/scripts/shut-ag -u $user -p all"
./ctm/scripts/set_agent_mode:709:                               su - $user $LOGIN_FLAG -c "$CONTROLM/scripts/start-ag -u $user -p all -s" | egrep "(^Control-M|^Starting)"
./ctm/scripts/set_agent_mode:711:                               $CONTROLM/scripts/start-ag -u $user -p all -s | egrep "(^Control-M|^Starting)"
./ctm/scripts/set_agent_mode:737:               shagent_out=`su - $user $LOGIN_FLAG -c "$CONTROLM/scripts/shagent"`
./ctm/scripts/set_agent_mode:756:                               su - $user $LOGIN_FLAG -c "$CONTROLM/scripts/shut-ag -u $user -p all" | grep Killing
./ctm/scripts/set_agent_mode:758:                               $CONTROLM/scripts/shut-ag -u $user -p all | grep Killing
./ctm/scripts/set_agent_mode:760:                       $CONTROLM/scripts/start-ag -u $user -p all -s
./ctm/scripts/set_agent_mode:791:               chmod 777  $CONTROLM/sysout
./ctm/scripts/set_agent_mode:792:               echo_to_file "$CONTROLM/sysout permissions set to 777 with sticky bit"
./ctm/scripts/set_agent_mode:794:               chmod g+s $CONTROLM/sysout
./ctm/scripts/set_agent_mode:795:               echo_to_file "$CONTROLM/sysout setgid bit was set"
./ctm/scripts/set_agent_mode:822:                       shagent_out=`su - $user $LOGIN_FLAG -c "$CONTROLM/scripts/shagent"`
./ctm/scripts/set_agent_mode:845:                                               $CONTROLM/scripts/shut-ag -u $user -p all       | grep Killing
./ctm/scripts/set_agent_mode:847:                                               su - $user $LOGIN_FLAG -c "$CONTROLM/scripts/shut-ag -u $user -p all" | grep Killing
./ctm/scripts/set_agent_mode:854:                                               $CONTROLM/scripts/start-ag -u $user -p all -s | egrep "(^Control-M|^Starting)"
./ctm/scripts/set_agent_mode:856:                                               su - $user $LOGIN_FLAG -c "$CONTROLM/scripts/start-ag -u $user -p all -s" | egrep "(^Control-M|^Starting)"
./ctm/scripts/shagent:7:# sccsid @(#)shctm      1.3 4D 10/9/93-10:13:30 /disk2/control_m/SCCS/release_1/scripts/s.shctm
./ctm/scripts/shagent:30:  machine=`$CONTROLM/scripts/sharch`
./ctm/scripts/shagent:255:    listen_interface=`grep LISTEN_INTERFACE $CONTROLM/data/CONFIG.dat | awk '{print $2}'`
./ctm/scripts/shagent:264:    persistent_connection=`grep PERSISTENT_CONNECTION $CONTROLM/data/CONFIG.dat | awk '{print $2}' | awk -F/ '{print $1}'`
./ctm/scripts/shagent:271:      ar_pid_file=`ls -rt $CONTROLM/pid/ar_* 2>/dev/null | tail -1`
./ctm/scripts/shagent:273:          port=`grep AGCMNDATA $CONTROLM/data/CONFIG.dat | awk '{print $2}' | awk -F/ '{print $1}'`
./ctm/scripts/shagent:300:    ag_pid_file=`ls -rt $CONTROLM/pid/ag_* 2>/dev/null | tail -1`
./ctm/scripts/shagent:305:          port=`grep AR_AG_COMM_PORT $CONTROLM/data/CONFIG.dat | awk '{print $2}' | awk -F/ '{print $1}'`
./ctm/scripts/shagent:307:          port=`grep AGCMNDATA $CONTROLM/data/CONFIG.dat | awk '{print $2}' | awk -F/ '{print $1}'`
./ctm/scripts/shagent:339:    at_pid_file=`ls -rt $CONTROLM/pid/at_* 2>/dev/null | tail -1`
./ctm/scripts/shagent:341:      port=`grep TRACKER_EVENT_PORT $CONTROLM/data/CONFIG.dat | awk '{print $2}'`
./ctm/scripts/shagent:378:INSTALL_TYPE=`grep INSTALL_TYPE $CONTROLM/data/CONFIG.dat | awk '{print $2}' | tr "[a-z]" "[A-Z]"`
./ctm/scripts/shagent:381:   LOCALHOST=`grep LOCALHOST $CONTROLM/data/CONFIG.dat | awk '{print $2}' | awk -F/ '{print $1}'| tr "[A-Z]" "[a-z]"`
./ctm/scripts/shagent:434:full_dir=$CONTROLM/pid
./ctm/scripts/sharch:3:if [ -n "$CONTROLM" ]; then
./ctm/scripts/sharch:4: N=`echo $CONTROLM | wc -c`
./ctm/scripts/sharch:6: HOME_DIR=`echo $CONTROLM | cut -c 1-$END`
./ctm/scripts/shut-ag:93:# check if the agent owner can write to the $CONTROLM/temp directory because we create temporary files there
./ctm/scripts/shut-ag:97:    $SU - $user -c "$bash_prefix test -w $CONTROLM/temp" 1>/dev/null 2>&1
./ctm/scripts/shut-ag:99:    test -w $CONTROLM/temp 1>/dev/null 2>&1
./ctm/scripts/shut-ag:148:Solaris*) LD_LIBRARY_PATH=${CONTROLM}/exe
./ctm/scripts/shut-ag:151:OSF*)   LD_LIBRARY_PATH=${CONTROLM}/exe
./ctm/scripts/shut-ag:154:HP-UX*) SHLIB_PATH=${CONTROLM}/exe
./ctm/scripts/shut-ag:157:AIX)  LIBPATH=${CONTROLM}/exe
./ctm/scripts/shut-ag:160:Linux*) LD_LIBRARY_PATH=${CONTROLM}/exe
./ctm/scripts/shut-ag:163:*)    LD_LIBRARY_PATH=${CONTROLM}/exe
./ctm/scripts/shut-ag:172:# verify the the CONTROLM environment variable is defined in the account
./ctm/scripts/shut-ag:177:   CONTROLM=`$SU - $user -c "$bash_prefix env" 2>/dev/null | grep 'CONTROLM=' | awk -F= '{print $2}'`
./ctm/scripts/shut-ag:178:   if [ -z "$CONTROLM" ] ; then
./ctm/scripts/shut-ag:181:     # look for CONTROLM_SERVER variable to determine if this is a joined server/agent installation
./ctm/scripts/shut-ag:182:     CONTROLM_SERVER=`$SU - $user -c "$bash_prefix env" 2>/dev/null | grep 'CONTROLM_SERVER=' | awk -F= '{print $2}'`
./ctm/scripts/shut-ag:186:   # running as non root. verify that $CONTROLM exists
./ctm/scripts/shut-ag:187:   if [ -z "$CONTROLM" ] ; then
./ctm/scripts/shut-ag:192:DEBUG "get_env: Exit - CONTROLM - $CONTROLM    CONTROLM_SERVER - $CONTROLM_SERVER"
./ctm/scripts/shut-ag:332:cm_shutdown_interval=`grep CM_SHUTDOWN_INTERVAL $CONTROLM/data/CONFIG.dat | awk '{print $2}'`
./ctm/scripts/shut-ag:339:      cmlist_count=`grep CMLIST $CONTROLM/data/CONFIG.dat | awk '{n=split($0,a,"|"); print n}'`;;
./ctm/scripts/shut-ag:355:    proc_file=`ls -rt $CONTROLM/pid/$1_* 2>/dev/null | tail -1`
./ctm/scripts/shut-ag:387:              echo $CONTROLM/dailylog/daily_ctmag_"`date +\"%Y%m%d\"`".log
./ctm/scripts/shut-ag:396:          rm -f $CONTROLM/pid/$1_[0-9]* > /dev/null 2>&1
./ctm/scripts/shut-ag:414: persistent_connection=`grep PERSISTENT_CONNECTION $CONTROLM/data/CONFIG.dat | awk '{print $2}' | awk -F/ '{print $1}'`
./ctm/scripts/shut-ag:421: remote_utils=`grep -w UPLOAD_REMOTE_UTILS $CONTROLM/data/CONFIG.dat | awk '{print $2}' | awk -F/ '{print $1}' | tr "[:lower:]" "[:upper:]"`
./ctm/scripts/shut-ag:424: wkl_cpu=`grep WKL_NODEID_CPU_UPDATE $CONTROLM/data/CONFIG.dat | awk '{print $2}'`
./ctm/scripts/shut-ag:432:cd $CONTROLM/exe
./ctm/scripts/shut-ag:444:      rm -f $CONTROLM/pid/wk_*
./ctm/scripts/shut-ag:459:    rm -f $CONTROLM/pid/ar_*
./ctm/scripts/shut-ag:470:    rm -f $CONTROLM/pid/ru_*
./ctm/scripts/shut-ag:515:    listen_interface=`grep LISTEN_INTERFACE $CONTROLM/data/CONFIG.dat | awk '{print $2}'`
./ctm/scripts/shut-ag:524:    persistent_connection=`grep PERSISTENT_CONNECTION $CONTROLM/data/CONFIG.dat | awk '{print $2}' | awk -F/ '{print $1}'`
./ctm/scripts/shut-ag:531:      ar_pid_file=`ls -rt $CONTROLM/pid/ar_* 2>/dev/null | tail -1`
./ctm/scripts/shut-ag:533:          port=`grep AGCMNDATA $CONTROLM/data/CONFIG.dat | awk '{print $2}' | awk -F/ '{print $1}'`
./ctm/scripts/shut-ag:558:    ag_pid_file=`ls -rt $CONTROLM/pid/ag_* 2>/dev/null | tail -1`
./ctm/scripts/shut-ag:563:          port=`grep AR_AG_COMM_PORT $CONTROLM/data/CONFIG.dat | awk '{print $2}' | awk -F/ '{print $1}'`
./ctm/scripts/shut-ag:565:          port=`grep AGCMNDATA $CONTROLM/data/CONFIG.dat | awk '{print $2}' | awk -F/ '{print $1}'`
./ctm/scripts/shut-ag:595:    at_pid_file=`ls -rt $CONTROLM/pid/at_* 2>/dev/null | tail -1`
./ctm/scripts/shut-ag:597:      port=`grep TRACKER_EVENT_PORT $CONTROLM/data/CONFIG.dat | awk '{print $2}'`
./ctm/scripts/shut-ag:605:    remote_utils=`grep -w UPLOAD_REMOTE_UTILS $CONTROLM/data/CONFIG.dat | awk '{print $2}' | awk -F/ '{print $1}' | tr "[:lower:]" "[:upper:]"`
./ctm/scripts/shut-ag:607:      ru_pid_file=`ls -rt $CONTROLM/pid/ru_* 2>/dev/null | tail -1`
./ctm/scripts/shut-ag:609:          port=`grep RU_COMM_PORT $CONTROLM/data/CONFIG.dat | awk '{print $2}' | awk -F/ '{print $1}'`
./ctm/scripts/shut-ag:642:  INSTALL_TYPE=`grep INSTALL_TYPE $CONTROLM/data/CONFIG.dat | awk '{print $2}' | tr "[a-z]" "[A-Z]"`
./ctm/scripts/shut-ag:645:     LOCALHOST=`grep LOCALHOST $CONTROLM/data/CONFIG.dat | awk '{print $2}' | awk -F/ '{print $1}'| tr "[A-Z]" "[a-z]"`
./ctm/scripts/shut-ag:676:CONTROLM_DBGLVL=0
./ctm/scripts/shut-ag:752:# verify the CONTROLM environment variable and check if the CONTROLM_SERVER
./ctm/scripts/shut-ag:756:   echo "*** CONTROLM environment variable is not defined . ***"
./ctm/scripts/shut-ag:778:DISABLE_CM_SHUTDOWN_FILE=$CONTROLM/temp/DISABLE_CM_SHUTDOWN_Y.cfg
./ctm/scripts/shut-ag:779:DISABLE_WATCHDOG_FILE=$CONTROLM/temp/WATCHDOG_ENABLED_N.cfg
./ctm/scripts/shut-ag:780:AGENT_STATUS_FILE=$CONTROLM/data/ctm_agent_status.dat
./ctm/scripts/shut-ag:781:LOG_FILE=$CONTROLM/proclog/shut_ag_$$.log
./ctm/scripts/shut-ag:786:last_agent_owner=`grep AGENT_OWNER $CONTROLM/data/CONFIG.dat | awk '{print $2}' | awk -F/ '{print $1}'`
./ctm/scripts/shut-ag:793:#check that $CONTROLM/temp is writable by agent user
./ctm/scripts/shut-ag:796:   echo "*** $CONTROLM/temp directory is not writable by user $user. ***"
./ctm/scripts/shut-ag:828:CONTROLM_PROCLOG=$CONTROLM/proclog
./ctm/scripts/shut-ag:829:export CONTROLM_DBGLVL
./ctm/scripts/shut-ag:830:export CONTROLM_PROCLOG
./ctm/scripts/shut-ag:831:export CONTROLM
./ctm/scripts/shut-ag:872:   rm -f $CONTROLM/locks/*
./ctm/scripts/shut-ag:874:   rm -f $CONTROLM/temp/newday
./ctm/scripts/shut-ag:878:      chown $user  $CONTROLM/dailylog/*
./ctm/scripts/shut-ag:879:      chgrp $group $CONTROLM/dailylog/*
./ctm/scripts/start-ag:39:echo "         [-t ] (set CONTROLM_DONT_DELETE to YES)"
./ctm/scripts/start-ag:59:    AIX_large_mem_maxdata=`grep AIX_LARGE_MEM_MAXDATA $CONTROLM/data/CONFIG.dat | awk '{print $2}'`
./ctm/scripts/start-ag:131:   sap_config_file=$CONTROLM/data/SAP.dat
./ctm/scripts/start-ag:202:# check if the agent owner can write to the $CONTROLM/temp directory because we create temporary files there
./ctm/scripts/start-ag:206:    $SU - $user -c "$bash_prefix test -w $CONTROLM/temp" 1>/dev/null 2>&1
./ctm/scripts/start-ag:208:    test -w $CONTROLM/temp 1>/dev/null 2>&1
./ctm/scripts/start-ag:261:                 LD_LIBRARY_PATH=${CONTROLM}/exe
./ctm/scripts/start-ag:268:                 LD_LIBRARY_PATH=${CONTROLM}/exe
./ctm/scripts/start-ag:273:    HP-UX*)  SHLIB_PATH=${CONTROLM}/exe
./ctm/scripts/start-ag:279:                 LIBPATH=${CONTROLM}/exe
./ctm/scripts/start-ag:287:                 LD_LIBRARY_PATH=${CONTROLM}/exe
./ctm/scripts/start-ag:294:                 LD_LIBRARY_PATH=${CONTROLM}/exe
./ctm/scripts/start-ag:305:# verify the the CONTROLM environment variable is defined in the account
./ctm/scripts/start-ag:309:   CONTROLM=`$SU - $user -c "$bash_prefix env" 2>/dev/null | grep 'CONTROLM=' | awk -F= '{print $2}'`
./ctm/scripts/start-ag:310:   if [ -z "$CONTROLM" ] ; then
./ctm/scripts/start-ag:313:     # look for CONTROLM_SERVER variable to determine if this is a joined server/agent installation
./ctm/scripts/start-ag:314:     CONTROLM_SERVER=`$SU - $user -c "$bash_prefix env" 2>/dev/null | grep 'CONTROLM_SERVER=' | awk -F= '{print $2}'`
./ctm/scripts/start-ag:317:   # running as non root. verify that $CONTROLM exists
./ctm/scripts/start-ag:318:   if [ -z "$CONTROLM" ] ; then
./ctm/scripts/start-ag:432:     port=`grep AR_AG_COMM_PORT $CONTROLM/data/CONFIG.dat | awk '{print $2}' | awk -F/ '{print $1}'`
./ctm/scripts/start-ag:434:     port=`grep AGCMNDATA $CONTROLM/data/CONFIG.dat | awk '{print $2}' | awk -F/ '{print $1}'`
./ctm/scripts/start-ag:462:       ag_pid_file=`ls -rt $CONTROLM/pid/ag_* 2>/dev/null | tail -1`
./ctm/scripts/start-ag:477:    nohup $CONTROLM/exe/p_ctmag >> $LOG_FILE 2>&1 &
./ctm/scripts/start-ag:495:    port=`grep TRACKER_EVENT_PORT $CONTROLM/data/CONFIG.dat | awk '{print $2}'`
./ctm/scripts/start-ag:501:       at_pid_file=`ls -rt $CONTROLM/pid/at_* 2>/dev/null | tail -1`
./ctm/scripts/start-ag:510:    nohup $CONTROLM/exe/p_ctmat >> $LOG_FILE 2>&1 &
./ctm/scripts/start-ag:526:    port=`grep AGCMNDATA $CONTROLM/data/CONFIG.dat | awk '{print $2}' | awk -F/ '{print $1}'`
./ctm/scripts/start-ag:548:       ar_pid_file=`ls -rt $CONTROLM/pid/ar_* 2>/dev/null | tail -1`
./ctm/scripts/start-ag:558:    nohup $CONTROLM/exe/p_ctmar >> $LOG_FILE 2>&1 &
./ctm/scripts/start-ag:574:    port=`grep RU_COMM_PORT $CONTROLM/data/CONFIG.dat | awk '{print $2}' | awk -F/ '{print $1}'`
./ctm/scripts/start-ag:596:       ru_pid_file=`ls -rt $CONTROLM/pid/ru_* 2>/dev/null | tail -1`
./ctm/scripts/start-ag:606:    nohup $CONTROLM/exe/p_ctmru >> $LOG_FILE 2>&1 &
./ctm/scripts/start-ag:649:    full_path=$CONTROLM/pid/$1_*
./ctm/scripts/start-ag:675:         echo_to_file "No file found for $proc_name process in '$CONTROLM/pid/'."
./ctm/scripts/start-ag:710: listen_interface=`grep LISTEN_INTERFACE $CONTROLM/data/CONFIG.dat | awk '{print $2}'`
./ctm/scripts/start-ag:720: persistent_connection=`grep PERSISTENT_CONNECTION $CONTROLM/data/CONFIG.dat | awk '{print $2}' | awk -F/ '{print $1}'`
./ctm/scripts/start-ag:786:   remote_utils=`grep -w UPLOAD_REMOTE_UTILS $CONTROLM/data/CONFIG.dat | awk '{print $2}' | awk -F/ '{print $1}' | tr "[:lower:]" "[:upper:]"`
./ctm/scripts/start-ag:821: grep -v WATCHDOG_ENABLED $CONTROLM/data/CONFIG.dat > $TEMP_FILE
./ctm/scripts/start-ag:834: mv $TEMP_FILE $CONTROLM/data/CONFIG.dat
./ctm/scripts/start-ag:837:   chown $user $CONTROLM/data/CONFIG.dat
./ctm/scripts/start-ag:838:   chgrp $group $CONTROLM/data/CONFIG.dat
./ctm/scripts/start-ag:846: grep -v WATCHDOG_ENABLED $CONTROLM/data/CONFIG.dat > $TEMP_FILE
./ctm/scripts/start-ag:859: mv $TEMP_FILE $CONTROLM/data/CONFIG.dat
./ctm/scripts/start-ag:862:   chown $user $CONTROLM/data/CONFIG.dat
./ctm/scripts/start-ag:863:   chgrp $group $CONTROLM/data/CONFIG.dat
./ctm/scripts/start-ag:886: grep -v AGENT_OWNER $CONTROLM/data/CONFIG.dat > $TEMP_FILE
./ctm/scripts/start-ag:892:    echo_to_file "Could not set AGENT_OWNER parameter to $myself in $CONTROLM/data/CONFIG.dat"
./ctm/scripts/start-ag:899: mv $TEMP_FILE $CONTROLM/data/CONFIG.dat
./ctm/scripts/start-ag:902:   chown $user $CONTROLM/data/CONFIG.dat
./ctm/scripts/start-ag:903:   chgrp $group $CONTROLM/data/CONFIG.dat
./ctm/scripts/start-ag:912:  INSTALL_TYPE=`grep INSTALL_TYPE $CONTROLM/data/CONFIG.dat | awk '{print $2}' | tr "[a-z]" "[A-Z]"`
./ctm/scripts/start-ag:915:     LOCALHOST=`grep LOCALHOST $CONTROLM/data/CONFIG.dat | awk '{print $2}' | awk -F/ '{print $1}'| tr "[A-Z]" "[a-z]"`
./ctm/scripts/start-ag:927:        FILE_NAME=$CONTROLM/test_start.txt
./ctm/scripts/start-ag:934:        FILE_OWNER=`ls -ltr $CONTROLM | grep "test_start.txt" | awk '{print $3}'`
./ctm/scripts/start-ag:956:CONTROLM_DBGLVL=0
./ctm/scripts/start-ag:979:    -d) CONTROLM_DBGLVL=$2; shift 2
./ctm/scripts/start-ag:980:     if [ $CONTROLM_DBGLVL -lt 0 -o $CONTROLM_DBGLVL -gt 5 ]; then
./ctm/scripts/start-ag:988:    -t) CONTROLM_DONT_DELETE=YES; export CONTROLM_DONT_DELETE ; shift ;;
./ctm/scripts/start-ag:1043:# verify the CONTROLM environment variable and check if the CONTROLM_SERVER
./ctm/scripts/start-ag:1047:   echo "*** CONTROLM environment variable is not defined . ***"
./ctm/scripts/start-ag:1051:# now check that the CONTROLM variable is not too long because we need the full path not to be longer than the limit of 'ps -ef'
./ctm/scripts/start-ag:1055:CONTROLM_LIMIT=65
./ctm/scripts/start-ag:1056:CONTROLM_LEN=`expr $CONTROLM : '.*'`
./ctm/scripts/start-ag:1057:if [ $CONTROLM_LEN -gt $CONTROLM_LIMIT ] ; then
./ctm/scripts/start-ag:1058:   echo "*** CONTROLM environment variable is too long."
./ctm/scripts/start-ag:1059:   echo "*** It's set to '$CONTROLM'."
./ctm/scripts/start-ag:1060:   echo "*** Its length is $CONTROLM_LEN while the limit is $CONTROLM_LIMIT."
./ctm/scripts/start-ag:1073:TEMP_FILE=$CONTROLM/temp/$$.tmp
./ctm/scripts/start-ag:1074:DISABLE_WATCHDOG_FILE=$CONTROLM/temp/WATCHDOG_ENABLED_N.cfg
./ctm/scripts/start-ag:1075:AGENT_STATUS_FILE=$CONTROLM/data/ctm_agent_status.dat
./ctm/scripts/start-ag:1076:CONTROLM_PROCLOG=$CONTROLM/proclog
./ctm/scripts/start-ag:1077:LOG_FILE=$CONTROLM/proclog/start_ag_$$.log
./ctm/scripts/start-ag:1088:LOG_FILE=$CONTROLM/proclog/start_ag_$$.log
./ctm/scripts/start-ag:1089:TEMP_FILE=$CONTROLM/temp/$$.tmp
./ctm/scripts/start-ag:1101:last_agent_owner=`grep AGENT_OWNER $CONTROLM/data/CONFIG.dat | awk '{print $2}' | awk -F/ '{print $1}'`
./ctm/scripts/start-ag:1103:  if [ -z "$CONTROLM_SERVER" ] ; then  # standalone installation
./ctm/scripts/start-ag:1122:            ctm_agent_user=`ls -Xld $CONTROLM | awk '{print $3}'`
./ctm/scripts/start-ag:1124:            ctm_agent_user=`ls -ld $CONTROLM | awk '{print $3}'`
./ctm/scripts/start-ag:1135:    echo "   1. Login as root user, execute the '$CONTROLM/scripts/set_agent_mode' script and enable non-root mode."
./ctm/scripts/start-ag:1139:    echo " is restarted, replace the current startup script with '$CONTROLM/scripts/rc.agent_user'"
./ctm/scripts/start-ag:1142:    echo " After the agent starts, you should execute the '$CONTROLM/scripts/set_agent_mode' script"
./ctm/scripts/start-ag:1156:#check that $CONTROLM/temp is writable by agent user
./ctm/scripts/start-ag:1159:#check that $CONTROLM/temp is writable by agent user
./ctm/scripts/start-ag:1162:   echo_to_file "*** $CONTROLM/temp directory is not writable by user $user. ***"
./ctm/scripts/start-ag:1183:export CONTROLM_DBGLVL
./ctm/scripts/start-ag:1184:export CONTROLM_PROCLOG
./ctm/scripts/start-ag:1185:export CONTROLM
./ctm/scripts/start-ag:1186:if [ -n "$CONTROLM_SERVER" ] ; then
./ctm/scripts/start-ag:1187:  export CONTROLM_SERVER
./ctm/scripts/start-ag:1193:PATH=$PATH:$CONTROLM/exe ; export PATH
./ctm/scripts/start-ag:1206:is_SAP_installed=`grep CMLIST $CONTROLM/data/CONFIG.dat | egrep 'SAP$|SAP[ |]'`
./ctm/scripts/start-ag:1221:   $CONTROLM/exe/agxalert "CM_incompatible"
grep: ./ctm/sysout/exportPartition_sh.LOG_0091hq_00001: Permissão negada
grep: ./ctm/sysout/exportPartition_sh.LOG_0091hc_00001: Permissão negada
grep: ./ctm/sysout/importPartition_sh.LOG_0091hi_00001: Permissão negada
grep: ./ctm/sysout/exportPartition_sh.LOG_009463_00001: Permissão negada
grep: ./ctm/sysout/CMD.LOG_0091il_00001: Permissão negada
grep: ./ctm/sysout/exportPartition_sh.LOG_0091hd_00001: Permissão negada
grep: ./ctm/sysout/exportPartition_sh.LOG_0094gs_00001: Permissão negada
grep: ./ctm/sysout/exportPartition_sh.LOG_0090b2_00001: Permissão negada
grep: ./ctm/sysout/exportPartition_sh.LOG_0091kx_00001: Permissão negada
grep: ./ctm/sysout/iniciar_sincronismo_sh.LOG_00944h_00001: Permissão negada
grep: ./ctm/sysout/verificar_finalizacao_sincronismo_sh.LOG_00944i_00001: Permissão negada
grep: ./ctm/sysout/iniciar_sincronismo_sh.LOG_0090a7_00001: Permissão negada
grep: ./ctm/sysout/exportPartition_sh.LOG_0091hr_00001: Permissão negada
grep: ./ctm/sysout/exportPartition_sh.LOG_0093ln_00001: Permissão negada
grep: ./ctm/sysout/exportPartition_sh.LOG_009462_00001: Permissão negada
grep: ./ctm/sysout/iniciar_sincronismo_sh.LOG_0094yb_00001: Permissão negada
grep: ./ctm/sysout/iniciar_sincronismo_sh.LOG_0091lo_00001: Permissão negada
grep: ./ctm/sysout/importPartition_sh.LOG_0091he_00001: Permissão negada
grep: ./ctm/sysout/exportPartition_sh.LOG_008zsl_00001: Permissão negada
grep: ./ctm/sysout/iniciar_sincronismo_sh.LOG_00911l_00001: Permissão negada
grep: ./ctm/sysout/exportPartition_sh.LOG_0091hx_00001: Permissão negada
grep: ./ctm/sysout/exportPartition_sh.LOG_0090b3_00001: Permissão negada
grep: ./ctm/sysout/exportPartition_sh.LOG_0091mc_00001: Permissão negada
grep: ./ctm/sysout/exportPartition_sh.LOG_0091hf_00001: Permissão negada
grep: ./ctm/sysout/exportPartition_sh.LOG_0091hp_00001: Permissão negada
grep: ./ctm/sysout/exportPartition_sh.LOG_008ywv_00001: Permissão negada
grep: ./ctm/sysout/exportPartition_sh.LOG_0091hh_00001: Permissão negada
grep: ./ctm/sysout/importPartition_sh.LOG_0091hs_00001: Permissão negada
grep: ./ctm/sysout/exportPartition_sh.LOG_0090mv_00001: Permissão negada
grep: ./ctm/sysout/exportPartition_sh.LOG_0091hv_00001: Permissão negada
grep: ./ctm/sysout/exportPartition_sh.LOG_009461_00001: Permissão negada
grep: ./ctm/sysout/exportPartition_sh.LOG_0090b4_00001: Permissão negada
grep: ./ctm/sysout/exportPartition_sh.LOG_0093qd_00001: Permissão negada
grep: ./ctm/sysout/exportPartition_sh.LOG_0091kq_00001: Permissão negada
grep: ./ctm/sysout/exportPartition_sh.LOG_0093qi_00001: Permissão negada
grep: ./ctm/sysout/exportPartition_sh.LOG_0091ku_00001: Permissão negada
grep: ./ctm/sysout/exportPartition_sh.LOG_008zg3_00001: Permissão negada
grep: ./ctm/sysout/importPartition_sh.LOG_0091ha_00001: Permissão negada
grep: ./ctm/sysout/exportPartition_sh.LOG_0091hk_00001: Permissão negada
grep: ./ctm/sysout/verificar_finalizacao_sincronismo_sh.LOG_0090a8_00001: Permissão negada
grep: ./ctm/sysout/exportPartition_sh.LOG_0091kw_00001: Permissão negada
grep: ./ctm/sysout/verificar_finalizacao_sincronismo_sh.LOG_0090a9_00001: Permissão negada
grep: ./ctm/sysout/CMD.LOG_00909h_00001: Permissão negada
grep: ./ctm/sysout/exportPartition_sh.LOG_0094zk_00001: Permissão negada
grep: ./ctm/sysout/exportPartition_sh.LOG_008zwm_00001: Permissão negada
grep: ./ctm/sysout/exportPartition_sh.LOG_0091hl_00001: Permissão negada
grep: ./ctm/sysout/exportPartition_sh.LOG_0093qe_00001: Permissão negada
grep: ./ctm/sysout/exportPartition_sh.LOG_0094ke_00001: Permissão negada
grep: ./ctm/sysout/exportPartition_sh.LOG_008z1p_00001: Permissão negada
grep: ./ctm/sysout/importPartition_sh.LOG_0091hg_00001: Permissão negada
grep: ./ctm/sysout/exportPartition_sh.LOG_0091i6_00001: Permissão negada
grep: ./ctm/sysout/exportPartition_sh.LOG_008z1m_00001: Permissão negada
grep: ./ctm/sysout/exportPartition_sh.LOG_0091i1_00001: Permissão negada
grep: ./ctm/sysout/exportPartition_sh.LOG_0091hz_00001: Permissão negada
grep: ./ctm/sysout/exportPartition_sh.LOG_0093qg_00001: Permissão negada
grep: ./ctm/sysout/exportPartition_sh.LOG_008zg2_00001: Permissão negada
grep: ./ctm/sysout/verificar_finalizacao_sincronismo_sh.LOG_00911n_00001: Permissão negada
grep: ./ctm/sysout/exportPartition_sh.LOG_0091i7_00001: Permissão negada
grep: ./ctm/sysout/exportPartition_sh.LOG_0093qq_00001: Permissão negada
grep: ./ctm/sysout/exportPartition_sh.LOG_0090b6_00001: Permissão negada
grep: ./ctm/sysout/exportPartition_sh.LOG_0091kv_00001: Permissão negada
grep: ./ctm/sysout/exportPartition_sh.LOG_009468_00001: Permissão negada
grep: ./ctm/sysout/exportPartition_sh.LOG_0094zl_00001: Permissão negada
grep: ./ctm/sysout/exportPartition_sh.LOG_008z20_00001: Permissão negada
grep: ./ctm/sysout/exportPartition_sh.LOG_0091i5_00001: Permissão negada
grep: ./ctm/sysout/exportPartition_sh.LOG_0094kb_00001: Permissão negada
grep: ./ctm/sysout/exportPartition_sh.LOG_0091i0_00001: Permissão negada
grep: ./ctm/sysout/exportPartition_sh.LOG_0091hw_00001: Permissão negada
grep: ./ctm/sysout/exportPartition_sh.LOG_0091hn_00001: Permissão negada
grep: ./ctm/sysout/exportPartition_sh.LOG_0091kz_00001: Permissão negada
grep: ./ctm/sysout/exportPartition_sh.LOG_008zwl_00001: Permissão negada
grep: ./ctm/sysout/exportPartition_sh.LOG_0091i8_00001: Permissão negada
grep: ./ctm/sysout/exportPartition_sh.LOG_008zg1_00001: Permissão negada
grep: ./ctm/sysout/exportPartition_sh.LOG_0090b5_00001: Permissão negada
grep: ./ctm/sysout/exportPartition_sh.LOG_009138_00001: Permissão negada
grep: ./ctm/sysout/exportPartition_sh.LOG_0091kt_00001: Permissão negada
grep: ./ctm/sysout/exportPartition_sh.LOG_0094zj_00001: Permissão negada
grep: ./ctm/sysout/exportPartition_sh.LOG_0090b9_00001: Permissão negada
grep: ./ctm/sysout/exportPartition_sh.LOG_009133_00001: Permissão negada
grep: ./ctm/sysout/importPartition_sh.LOG_0091ht_00001: Permissão negada
grep: ./ctm/sysout/exportPartition_sh.LOG_0091hm_00001: Permissão negada
grep: ./ctm/sysout/verificar_finalizacao_sincronismo_sh.LOG_0091lt_00001: Permissão negada
grep: ./ctm/sysout/iniciar_sincronismo_sh.LOG_009398_00001: Permissão negada
grep: ./ctm/sysout/exportPartition_sh.LOG_009464_00001: Permissão negada
grep: ./ctm/sysout/exportPartition_sh.LOG_008zg8_00001: Permissão negada
grep: ./ctm/sysout/exportPartition_sh.LOG_0091ky_00001: Permissão negada
grep: ./ctm/sysout/exportPartition_sh.LOG_008zwn_00001: Permissão negada
grep: ./ctm/sysout/exportPartition_sh.LOG_0094kq_00001: Permissão negada
grep: ./ctm/sysout/exportPartition_sh.LOG_0090bb_00001: Permissão negada
grep: ./ctm/sysout/exportPartition_sh.LOG_0091ks_00001: Permissão negada
grep: ./ctm/sysout/exportPartition_sh.LOG_009465_00001: Permissão negada
grep: ./ctm/sysout/importPartition_sh.LOG_0093qb_00001: Permissão negada
grep: ./ctm/sysout/dropPartition_sh.LOG_0091hb_00001: Permissão negada
grep: ./ctm/sysout/CMD.LOG_008zeg_00001: Permissão negada
grep: ./ctm/sysout/exportPartition_sh.LOG_0090b8_00001: Permissão negada
grep: ./ctm/sysout/importPartition_sh.LOG_0091hu_00001: Permissão negada
grep: ./ctm/sysout/exportPartition_sh.LOG_0091kr_00001: Permissão negada
grep: ./ctm/sysout/exportPartition_sh.LOG_008z1z_00001: Permissão negada
grep: ./ctm/sysout/verificar_finalizacao_sincronismo_sh.LOG_0094yc_00001: Permissão negada
grep: ./ctm/sysout/exportPartition_sh.LOG_0093aj_00001: Permissão negada
grep: ./ctm/sysout/exportPartition_sh.LOG_0094kc_00001: Permissão negada
grep: ./ctm/sysout/verificar_finalizacao_sincronismo_sh.LOG_00939d_00001: Permissão negada
grep: ./ctm/sysout/CMD.LOG_0094xj_00001: Permissão negada
grep: ./ctm/sysout/exportPartition_sh.LOG_0094kg_00001: Permissão negada
grep: ./ctm/sysout/verificar_finalizacao_sincronismo_sh.LOG_00939a_00001: Permissão negada
grep: ./ctm/sysout/exportPartition_sh.LOG_0092r5_00001: Permissão negada
grep: ./ctm/sysout/exportPartition_sh.LOG_0092v9_00001: Permissão negada
grep: ./ctm/sysout/exportPartition_sh.LOG_0094ko_00001: Permissão negada
grep: ./ctm/sysout/exportPartition_sh.LOG_008zg9_00001: Permissão negada
grep: ./ctm/sysout/exportPartition_sh.LOG_00945x_00001: Permissão negada
grep: ./ctm/sysout/exportPartition_sh.LOG_0093af_00001: Permissão negada
grep: ./ctm/sysout/exportPartition_sh.LOG_0094zq_00001: Permissão negada
grep: ./ctm/sysout/verificar_finalizacao_sincronismo_sh.LOG_00939c_00001: Permissão negada
grep: ./ctm/sysout/exportPartition_sh.LOG_0093al_00001: Permissão negada
grep: ./ctm/sysout/exportPartition_sh.LOG_0092v5_00001: Permissão negada
grep: ./ctm/sysout/exportPartition_sh.LOG_0093qr_00001: Permissão negada
grep: ./ctm/sysout/exportPartition_sh.LOG_0093ak_00001: Permissão negada
grep: ./ctm/sysout/exportPartition_sh.LOG_0092v7_00001: Permissão negada
grep: ./ctm/sysout/exportPartition_sh.LOG_0093qs_00001: Permissão negada
grep: ./ctm/sysout/exportPartition_sh.LOG_0094kp_00001: Permissão negada
grep: ./ctm/sysout/exportPartition_sh.LOG_008z21_00001: Permissão negada
grep: ./ctm/sysout/exportPartition_sh.LOG_009135_00001: Permissão negada
grep: ./ctm/sysout/exportPartition_sh.LOG_0092vj_00001: Permissão negada
grep: ./ctm/sysout/importPartition_sh.LOG_0093qf_00001: Permissão negada
grep: ./ctm/sysout/exportPartition_sh.LOG_0094zm_00001: Permissão negada
grep: ./ctm/sysout/exportPartition_sh.LOG_0091l4_00001: Permissão negada
grep: ./ctm/sysout/exportPartition_sh.LOG_0093am_00001: Permissão negada
grep: ./ctm/sysout/exportPartition_sh.LOG_0091l1_00001: Permissão negada
grep: ./ctm/sysout/exportPartition_sh.LOG_0091xd_00001: Permissão negada
grep: ./ctm/sysout/importPartition_sh.LOG_008zwo_00001: Permissão negada
grep: ./ctm/sysout/verificar_finalizacao_sincronismo_sh.LOG_0091lp_00001: Permissão negada
grep: ./ctm/sysout/exportPartition_sh.LOG_0093ar_00001: Permissão negada
grep: ./ctm/sysout/exportPartition_sh.LOG_009466_00001: Permissão negada
grep: ./ctm/sysout/exportPartition_sh.LOG_0094zr_00001: Permissão negada
grep: ./ctm/sysout/exportPartition_sh.LOG_0092vi_00001: Permissão negada
grep: ./ctm/sysout/exportPartition_sh.LOG_009134_00001: Permissão negada
grep: ./ctm/sysout/exportPartition_sh.LOG_0091l3_00001: Permissão negada
grep: ./ctm/sysout/importPartition_sh.LOG_0093qh_00001: Permissão negada
grep: ./ctm/sysout/importPartition_sh.LOG_0094ks_00001: Permissão negada
grep: ./ctm/sysout/exportPartition_sh.LOG_008zwd_00001: Permissão negada
grep: ./ctm/sysout/exportPartition_sh.LOG_0092v4_00001: Permissão negada
grep: ./ctm/sysout/importPartition_sh.LOG_0093qj_00001: Permissão negada
grep: ./ctm/sysout/exportPartition_sh.LOG_0092vh_00001: Permissão negada
grep: ./ctm/sysout/exportPartition_sh.LOG_009139_00001: Permissão negada
grep: ./ctm/sysout/importPartition_sh.LOG_0094kd_00001: Permissão negada
grep: ./ctm/sysout/exportPartition_sh.LOG_008z1r_00001: Permissão negada
grep: ./ctm/sysout/importPartition_sh.LOG_0093qt_00001: Permissão negada
grep: ./ctm/sysout/exportPartition_sh.LOG_0093an_00001: Permissão negada
grep: ./ctm/sysout/verificar_finalizacao_sincronismo_sh.LOG_00944j_00001: Permissão negada
grep: ./ctm/sysout/exportPartition_sh.LOG_0094zs_00001: Permissão negada
grep: ./ctm/sysout/importPartition_sh.LOG_0093qv_00001: Permissão negada
grep: ./ctm/sysout/exportPartition_sh.LOG_008zg4_00001: Permissão negada
grep: ./ctm/sysout/exportPartition_sh.LOG_0093ao_00001: Permissão negada
grep: ./ctm/sysout/exportPartition_sh.LOG_008z1n_00001: Permissão negada
grep: ./ctm/sysout/exportPartition_sh.LOG_008zw9_00001: Permissão negada
grep: ./ctm/sysout/exportPartition_sh.LOG_0091l0_00001: Permissão negada
grep: ./ctm/sysout/exportPartition_sh.LOG_0091l2_00001: Permissão negada
grep: ./ctm/sysout/exportPartition_sh.LOG_0092gc_00001: Permissão negada
grep: ./ctm/sysout/importPartition_sh.LOG_0092v2_00001: Permissão negada
grep: ./ctm/sysout/verificar_finalizacao_sincronismo_sh.LOG_00944m_00001: Permissão negada
grep: ./ctm/sysout/verificar_finalizacao_sincronismo_sh.LOG_0094ye_00001: Permissão negada
grep: ./ctm/sysout/exportPartition_sh.LOG_0094zp_00001: Permissão negada
grep: ./ctm/sysout/exportPartition_sh.LOG_008zwj_00001: Permissão negada
grep: ./ctm/sysout/importPartition_sh.LOG_0093qu_00001: Permissão negada
grep: ./ctm/sysout/dropPartition_sh.LOG_0091ho_00001: Permissão negada
grep: ./ctm/sysout/exportPartition_sh.LOG_0092gf_00001: Permissão negada
grep: ./ctm/sysout/CMD.LOG_00938i_00001: Permissão negada
grep: ./ctm/sysout/exportPartition_sh.LOG_008zw8_00001: Permissão negada
grep: ./ctm/sysout/verificar_finalizacao_sincronismo_sh.LOG_0092fh_00001: Permissão negada
grep: ./ctm/sysout/verificar_finalizacao_sincronismo_sh.LOG_00939b_00001: Permissão negada
grep: ./ctm/sysout/exportPartition_sh.LOG_0094zt_00001: Permissão negada
grep: ./ctm/sysout/exportPartition_sh.LOG_0094zu_00001: Permissão negada
grep: ./ctm/sysout/importPartition_sh.LOG_008zwe_00001: Permissão negada
grep: ./ctm/sysout/exportPartition_sh.LOG_0090q7_00001: Permissão negada
grep: ./ctm/sysout/exportPartition_sh.LOG_0093aq_00001: Permissão negada
grep: ./ctm/sysout/exportPartition_sh.LOG_009467_00001: Permissão negada
grep: ./ctm/sysout/exportPartition_sh.LOG_0094zn_00001: Permissão negada
grep: ./ctm/sysout/exportPartition_sh.LOG_008zwb_00001: Permissão negada
grep: ./ctm/sysout/exportPartition_sh.LOG_008zg5_00001: Permissão negada
grep: ./ctm/sysout/exportPartition_sh.LOG_008z2h_00001: Permissão negada
grep: ./ctm/sysout/exportPartition_sh.LOG_00913b_00001: Permissão negada
grep: ./ctm/sysout/importPartition_sh.LOG_0090q6_00001: Permissão negada
grep: ./ctm/sysout/verificar_finalizacao_sincronismo_sh.LOG_0094yd_00001: Permissão negada
grep: ./ctm/sysout/importPartition_sh.LOG_008zwq_00001: Permissão negada
grep: ./ctm/sysout/verificar_finalizacao_sincronismo_sh.LOG_00911m_00001: Permissão negada
grep: ./ctm/sysout/importPartition_sh.LOG_0092vk_00001: Permissão negada
grep: ./ctm/sysout/exportPartition_sh.LOG_008zwr_00001: Permissão negada
grep: ./ctm/sysout/exportPartition_sh.LOG_009136_00001: Permissão negada
grep: ./ctm/sysout/exportPartition_sh.LOG_009137_00001: Permissão negada
grep: ./ctm/sysout/CMD.LOG_009110_00001: Permissão negada
grep: ./ctm/sysout/importPartition_sh.LOG_008z1o_00001: Permissão negada
grep: ./ctm/sysout/exportPartition_sh.LOG_0090qf_00001: Permissão negada
grep: ./ctm/sysout/exportPartition_sh.LOG_0093ag_00001: Permissão negada
grep: ./ctm/sysout/importPartition_sh.LOG_0092vm_00001: Permissão negada
grep: ./ctm/sysout/verificar_finalizacao_sincronismo_sh.LOG_0090aa_00001: Permissão negada
grep: ./ctm/sysout/importPartition_sh.LOG_008zwc_00001: Permissão negada
grep: ./ctm/sysout/verificar_finalizacao_sincronismo_sh.LOG_0091lq_00001: Permissão negada
grep: ./ctm/sysout/importPartition_sh.LOG_0092vl_00001: Permissão negada
grep: ./ctm/sysout/importPartition_sh.LOG_008z1k_00001: Permissão negada
grep: ./ctm/sysout/importPartition_sh.LOG_0092v6_00001: Permissão negada
grep: ./ctm/sysout/exportPartition_sh.LOG_008z1u_00001: Permissão negada
grep: ./ctm/sysout/verificar_finalizacao_sincronismo_sh.LOG_0091lr_00001: Permissão negada
grep: ./ctm/sysout/iniciar_sincronismo_sh.LOG_0092ff_00001: Permissão negada
grep: ./ctm/sysout/importPartition_sh.LOG_0092va_00001: Permissão negada
grep: ./ctm/sysout/exportPartition_sh.LOG_008zg7_00001: Permissão negada
grep: ./ctm/sysout/CMD.LOG_008zot_00001: Permissão negada
grep: ./ctm/sysout/exportPartition_sh.LOG_008zws_00001: Permissão negada
grep: ./ctm/sysout/exportPartition_sh.LOG_0090b7_00001: Permissão negada
grep: ./ctm/sysout/exportPartition_sh.LOG_0093ap_00001: Permissão negada
grep: ./ctm/sysout/importPartition_sh.LOG_0094kt_00001: Permissão negada
grep: ./ctm/sysout/importPartition_sh.LOG_0090qi_00001: Permissão negada
grep: ./ctm/sysout/exportPartition_sh.LOG_008z1v_00001: Permissão negada
grep: ./ctm/sysout/importPartition_sh.LOG_008zwp_00001: Permissão negada
grep: ./ctm/sysout/importPartition_sh.LOG_008zwa_00001: Permissão negada
grep: ./ctm/sysout/exportPartition_sh.LOG_0092vn_00001: Permissão negada
grep: ./ctm/sysout/importPartition_sh.LOG_008z1s_00001: Permissão negada
grep: ./ctm/sysout/exportPartition_sh.LOG_008zwg_00001: Permissão negada
grep: ./ctm/sysout/verificar_finalizacao_sincronismo_sh.LOG_0090ac_00001: Permissão negada
grep: ./ctm/sysout/exportPartition_sh.LOG_0094zo_00001: Permissão negada
grep: ./ctm/sysout/importPartition_sh.LOG_008z23_00001: Permissão negada
grep: ./ctm/sysout/exportPartition_sh.LOG_0092vc_00001: Permissão negada
grep: ./ctm/sysout/importPartition_sh.LOG_0094k9_00001: Permissão negada
grep: ./ctm/sysout/importPartition_sh.LOG_0092v8_00001: Permissão negada
grep: ./ctm/sysout/importPartition_sh.LOG_008z22_00001: Permissão negada
grep: ./ctm/sysout/exportPartition_sh.LOG_0090q3_00001: Permissão negada
grep: ./ctm/sysout/exportPartition_sh.LOG_0093ql_00001: Permissão negada
grep: ./ctm/sysout/verificar_finalizacao_sincronismo_sh.LOG_0090ab_00001: Permissão negada
grep: ./ctm/sysout/verificar_finalizacao_sincronismo_sh.LOG_00911o_00001: Permissão negada
grep: ./ctm/sysout/exportPartition_sh.LOG_00913a_00001: Permissão negada
grep: ./ctm/sysout/exportPartition_sh.LOG_0090qc_00001: Permissão negada
grep: ./ctm/sysout/exportPartition_sh.LOG_0092ve_00001: Permissão negada
grep: ./ctm/sysout/exportPartition_sh.LOG_0094kj_00001: Permissão negada
grep: ./ctm/sysout/exportPartition_sh.LOG_0090ba_00001: Permissão negada
grep: ./ctm/sysout/verificar_finalizacao_sincronismo_sh.LOG_0094yg_00001: Permissão negada
grep: ./ctm/sysout/exportPartition_sh.LOG_0092w0_00001: Permissão negada
grep: ./ctm/sysout/exportPartition_sh.LOG_00945y_00001: Permissão negada
grep: ./ctm/sysout/importPartition_sh.LOG_0094kf_00001: Permissão negada
grep: ./ctm/sysout/exportPartition_sh.LOG_0094kk_00001: Permissão negada
grep: ./ctm/sysout/dropPartition_sh.LOG_0094ki_00001: Permissão negada
grep: ./ctm/sysout/exportPartition_sh.LOG_0093qx_00001: Permissão negada
grep: ./ctm/sysout/exportPartition_sh.LOG_0094l6_00001: Permissão negada
grep: ./ctm/sysout/exportPartition_sh.LOG_0094l7_00001: Permissão negada
grep: ./ctm/sysout/exportPartition_sh.LOG_0092vs_00001: Permissão negada
grep: ./ctm/sysout/exportPartition_sh.LOG_0094kl_00001: Permissão negada
grep: ./ctm/sysout/exportPartition_sh.LOG_0092vd_00001: Permissão negada
grep: ./ctm/sysout/exportPartition_sh.LOG_0092vx_00001: Permissão negada
grep: ./ctm/sysout/exportPartition_sh.LOG_008z2i_00001: Permissão negada
grep: ./ctm/sysout/exportPartition_sh.LOG_008zx2_00001: Permissão negada
grep: ./ctm/sysout/verificar_finalizacao_sincronismo_sh.LOG_00944l_00001: Permissão negada
grep: ./ctm/sysout/exportPartition_sh.LOG_008zwi_00001: Permissão negada
grep: ./ctm/sysout/exportPartition_sh.LOG_008zg6_00001: Permissão negada
grep: ./ctm/sysout/exportPartition_sh.LOG_0092vo_00001: Permissão negada
grep: ./ctm/sysout/exportPartition_sh.LOG_0093qy_00001: Permissão negada
grep: ./ctm/sysout/importPartition_sh.LOG_008z24_00001: Permissão negada
grep: ./ctm/sysout/exportPartition_sh.LOG_008zx1_00001: Permissão negada
grep: ./ctm/sysout/exportPartition_sh.LOG_0092vp_00001: Permissão negada
grep: ./ctm/sysout/exportPartition_sh.LOG_00945z_00001: Permissão negada
grep: ./ctm/sysout/exportPartition_sh.LOG_0094km_00001: Permissão negada
grep: ./ctm/sysout/exportPartition_sh.LOG_0092vz_00001: Permissão negada
grep: ./ctm/sysout/verificar_finalizacao_sincronismo_sh.LOG_009399_00001: Permissão negada
grep: ./ctm/sysout/exportPartition_sh.LOG_0092vy_00001: Permissão negada
grep: ./ctm/sysout/dropPartition_sh.LOG_0092vb_00001: Permissão negada
grep: ./ctm/sysout/importPartition_sh.LOG_0094kh_00001: Permissão negada
grep: ./ctm/sysout/importPartition_sh.LOG_008z1q_00001: Permissão negada
grep: ./ctm/sysout/exportPartition_sh.LOG_0094ku_00001: Permissão negada
grep: ./ctm/sysout/exportPartition_sh.LOG_0094kv_00001: Permissão negada
grep: ./ctm/sysout/exportPartition_sh.LOG_008z27_00001: Permissão negada
grep: ./ctm/sysout/exportPartition_sh.LOG_0093qo_00001: Permissão negada
grep: ./ctm/sysout/exportPartition_sh.LOG_0094kw_00001: Permissão negada
grep: ./ctm/sysout/exportPartition_sh.LOG_008z26_00001: Permissão negada
grep: ./ctm/sysout/importPartition_sh.LOG_008zw6_00001: Permissão negada
grep: ./ctm/sysout/exportPartition_sh.LOG_0093qm_00001: Permissão negada
grep: ./ctm/sysout/dropPartition_sh.LOG_0093qk_00001: Permissão negada
grep: ./ctm/sysout/exportPartition_sh.LOG_0093r0_00001: Permissão negada
grep: ./ctm/sysout/exportPartition_sh.LOG_0093r7_00001: Permissão negada
grep: ./ctm/sysout/exportPartition_sh.LOG_008z25_00001: Permissão negada
grep: ./ctm/sysout/CMD.LOG_0092ep_00001: Permissão negada
grep: ./ctm/sysout/exportPartition_sh.LOG_00946a_00001: Permissão negada
grep: ./ctm/sysout/dropPartition_sh.LOG_0092v3_00001: Permissão negada
grep: ./ctm/sysout/exportPartition_sh.LOG_0092vt_00001: Permissão negada
grep: ./ctm/sysout/exportPartition_sh.LOG_0093r9_00001: Permissão negada
grep: ./ctm/sysout/exportPartition_sh.LOG_0093r2_00001: Permissão negada
grep: ./ctm/sysout/exportPartition_sh.LOG_0094l5_00001: Permissão negada
grep: ./ctm/sysout/exportPartition_sh.LOG_0090qd_00001: Permissão negada
grep: ./ctm/sysout/dropPartition_sh.LOG_008z1t_00001: Permissão negada
grep: ./ctm/sysout/exportPartition_sh.LOG_0092vf_00001: Permissão negada
grep: ./ctm/sysout/exportPartition_sh.LOG_009469_00001: Permissão negada
grep: ./ctm/sysout/verificar_finalizacao_sincronismo_sh.LOG_00944k_00001: Permissão negada
grep: ./ctm/sysout/exportPartition_sh.LOG_0093qw_00001: Permissão negada
grep: ./ctm/sysout/CMD.LOG_00942f_00001: Permissão negada
grep: ./ctm/sysout/exportPartition_sh.LOG_0090qg_00001: Permissão negada
grep: ./ctm/sysout/importPartition_sh.LOG_0094kr_00001: Permissão negada
grep: ./ctm/sysout/exportPartition_sh.LOG_0090qw_00001: Permissão negada
grep: ./ctm/sysout/exportPartition_sh.LOG_0093r8_00001: Permissão negada
grep: ./ctm/sysout/exportPartition_sh.LOG_0093r1_00001: Permissão negada
grep: ./ctm/sysout/exportPartition_sh.LOG_0093qn_00001: Permissão negada
grep: ./ctm/sysout/dropPartition_sh.LOG_0093qp_00001: Permissão negada
grep: ./ctm/sysout/dropPartition_sh.LOG_008z1y_00001: Permissão negada
grep: ./ctm/sysout/dropPartition_sh.LOG_008zw7_00001: Permissão negada
grep: ./ctm/sysout/exportPartition_sh.LOG_0090qy_00001: Permissão negada
grep: ./ctm/sysout/exportPartition_sh.LOG_00913c_00001: Permissão negada
grep: ./ctm/sysout/exportPartition_sh.LOG_00913e_00001: Permissão negada
grep: ./ctm/sysout/dropPartition_sh.LOG_008zwf_00001: Permissão negada
grep: ./ctm/sysout/exportPartition_sh.LOG_0090qr_00001: Permissão negada
grep: ./ctm/sysout/exportPartition_sh.LOG_0090qh_00001: Permissão negada
grep: ./ctm/sysout/importPartition_sh.LOG_0090qk_00001: Permissão negada
grep: ./ctm/sysout/importPartition_sh.LOG_0090q0_00001: Permissão negada
grep: ./ctm/sysout/exportPartition_sh.LOG_0090qb_00001: Permissão negada
grep: ./ctm/sysout/exportPartition_sh.LOG_0094l0_00001: Permissão negada
grep: ./ctm/sysout/dropPartition_sh.LOG_0094kn_00001: Permissão negada
grep: ./ctm/sysout/exportPartition_sh.LOG_008z2g_00001: Permissão negada
grep: ./ctm/sysout/exportPartition_sh.LOG_008zx4_00001: Permissão negada
grep: ./ctm/sysout/verificar_finalizacao_sincronismo_sh.LOG_00911q_00001: Permissão negada
grep: ./ctm/sysout/exportPartition_sh.LOG_0090qp_00001: Permissão negada
grep: ./ctm/sysout/dropPartition_sh.LOG_008z1l_00001: Permissão negada
grep: ./ctm/sysout/exportPartition_sh.LOG_008zww_00001: Permissão negada
grep: ./ctm/sysout/importPartition_sh.LOG_0090qj_00001: Permissão negada
grep: ./ctm/sysout/exportPartition_sh.LOG_008z1w_00001: Permissão negada
grep: ./ctm/sysout/exportPartition_sh.LOG_008zge_00001: Permissão negada
grep: ./ctm/sysout/exportPartition_sh.LOG_0090be_00001: Permissão negada
grep: ./ctm/sysout/exportPartition_sh.LOG_0094ky_00001: Permissão negada
grep: ./ctm/sysout/exportPartition_sh.LOG_008z1x_00001: Permissão negada
grep: ./ctm/sysout/exportPartition_sh.LOG_008zgf_00001: Permissão negada
grep: ./ctm/sysout/exportPartition_sh.LOG_0090bf_00001: Permissão negada
grep: ./ctm/sysout/importPartition_sh.LOG_0090q8_00001: Permissão negada
grep: ./ctm/sysout/exportPartition_sh.LOG_0090qa_00001: Permissão negada
grep: ./ctm/sysout/verificar_finalizacao_sincronismo_sh.LOG_0094yf_00001: Permissão negada
grep: ./ctm/sysout/exportPartition_sh.LOG_008z2f_00001: Permissão negada
grep: ./ctm/sysout/exportPartition_sh.LOG_008zwv_00001: Permissão negada
grep: ./ctm/sysout/exportPartition_sh.LOG_00913d_00001: Permissão negada
grep: ./ctm/sysout/exportPartition_sh.LOG_00913f_00001: Permissão negada
grep: ./ctm/sysout/exportPartition_sh.LOG_008z2a_00001: Permissão negada
grep: ./ctm/sysout/exportPartition_sh.LOG_008zgd_00001: Permissão negada
grep: ./ctm/sysout/exportPartition_sh.LOG_0090bd_00001: Permissão negada
grep: ./ctm/sysout/exportPartition_sh.LOG_0090qq_00001: Permissão negada
grep: ./ctm/sysout/importPartition_sh.LOG_0090q4_00001: Permissão negada
grep: ./ctm/sysout/exportPartition_sh.LOG_008zgb_00001: Permissão negada
grep: ./ctm/sysout/dropPartition_sh.LOG_008zwk_00001: Permissão negada
grep: ./ctm/sysout/dropPartition_sh.LOG_0090q1_00001: Permissão negada
grep: ./ctm/sysout/exportPartition_sh.LOG_008z2b_00001: Permissão negada
grep: ./ctm/sysout/exportPartition_sh.LOG_008zgc_00001: Permissão negada
grep: ./ctm/sysout/exportPartition_sh.LOG_0090bc_00001: Permissão negada
grep: ./ctm/sysout/exportPartition_sh.LOG_0094kz_00001: Permissão negada
grep: ./ctm/sysout/exportPartition_sh.LOG_008zga_00001: Permissão negada
grep: ./ctm/sysout/exportPartition_sh.LOG_008zwx_00001: Permissão negada
grep: ./ctm/sysout/exportPartition_sh.LOG_0090q5_00001: Permissão negada
grep: ./ctm/sysout/dropPartition_sh.LOG_0090q9_00001: Permissão negada
grep: ./ctm/sysout/exportPartition_sh.LOG_00913g_00001: Permissão negada
grep: ./ctm/sysout/exportPartition_sh.LOG_008zwh_00001: Permissão negada
grep: ./ctm/sysout/exportPartition_sh.LOG_0090bg_00001: Permissão negada
grep: ./ctm/sysout/verificar_finalizacao_sincronismo_sh.LOG_00911p_00001: Permissão negada
grep: ./ctm/sysout/exportPartition_sh.LOG_0090ql_00001: Permissão negada
grep: ./ctm/sysout/exportPartition_sh.LOG_0090qn_00001: Permissão negada
grep: ./ctm/sysout/dropPartition_sh.LOG_0090qe_00001: Permissão negada
grep: ./ctm/sysout/exportPartition_sh.LOG_008zx3_00001: Permissão negada
grep: ./ctm/sysout/exportPartition_sh.LOG_0090qv_00001: Permissão negada
grep: ./ctm/sysout/exportPartition_sh.LOG_0090q2_00001: Permissão negada
grep: ./ctm/sysout/exportPartition_sh.LOG_0090qx_00001: Permissão negada
grep: ./ctm/sysout/exportPartition_sh.LOG_008z29_00001: Permissão negada
grep: ./ctm/sysout/exportPartition_sh.LOG_008zwt_00001: Permissão negada
grep: ./ctm/sysout/exportPartition_sh.LOG_0090qm_00001: Permissão negada
grep: ./ctm/sysout/exportPartition_sh.LOG_00913h_00001: Permissão negada
grep: ./ctm/sysout/exportPartition_sh.LOG_00923c_00001: Permissão negada
grep: ./ctm/sysout/exportPartition_sh.LOG_0092gb_00001: Permissão negada
grep: ./ctm/sysout/verificar_finalizacao_sincronismo_sh.LOG_0091ls_00001: Permissão negada
grep: ./ctm/sysout/importPartition_sh.LOG_00922p_00001: Permissão negada
grep: ./ctm/sysout/exportPartition_sh.LOG_00922z_00001: Permissão negada
grep: ./ctm/sysout/exportPartition_sh.LOG_00923n_00001: Permissão negada
grep: ./ctm/sysout/exportPartition_sh.LOG_0093au_00001: Permissão negada
grep: ./ctm/sysout/importPartition_sh.LOG_009239_00001: Permissão negada
grep: ./ctm/sysout/exportPartition_sh.LOG_0092ge_00001: Permissão negada
grep: ./ctm/sysout/dropPartition_sh.LOG_0091hj_00001: Permissão negada
grep: ./ctm/sysout/exportPartition_sh.LOG_009230_00001: Permissão negada
grep: ./ctm/sysout/exportPartition_sh.LOG_0093ah_00001: Permissão negada
grep: ./ctm/sysout/verificar_finalizacao_sincronismo_sh.LOG_0092fi_00001: Permissão negada
grep: ./ctm/sysout/verificar_finalizacao_sincronismo_sh.LOG_0092fg_00001: Permissão negada
grep: ./ctm/sysout/importPartition_sh.LOG_009238_00001: Permissão negada
grep: ./ctm/sysout/importPartition_sh.LOG_00922x_00001: Permissão negada
grep: ./ctm/sysout/exportPartition_sh.LOG_0092gj_00001: Permissão negada
grep: ./ctm/sysout/exportPartition_sh.LOG_00923g_00001: Permissão negada
grep: ./ctm/sysout/exportPartition_sh.LOG_0093as_00001: Permissão negada
grep: ./ctm/sysout/verificar_finalizacao_sincronismo_sh.LOG_0092fj_00001: Permissão negada
grep: ./ctm/sysout/exportPartition_sh.LOG_00923f_00001: Permissão negada
grep: ./ctm/sysout/exportPartition_sh.LOG_0092vr_00001: Permissão negada
grep: ./ctm/sysout/verificar_finalizacao_sincronismo_sh.LOG_0092fk_00001: Permissão negada
grep: ./ctm/sysout/exportPartition_sh.LOG_00923b_00001: Permissão negada
grep: ./ctm/sysout/exportPartition_sh.LOG_009232_00001: Permissão negada
grep: ./ctm/sysout/exportPartition_sh.LOG_0093r6_00001: Permissão negada
grep: ./ctm/sysout/exportPartition_sh.LOG_0092g9_00001: Permissão negada
grep: ./ctm/sysout/exportPartition_sh.LOG_0092gi_00001: Permissão negada
grep: ./ctm/sysout/exportPartition_sh.LOG_0094l4_00001: Permissão negada
grep: ./ctm/sysout/exportPartition_sh.LOG_00922w_00001: Permissão negada
grep: ./ctm/sysout/exportPartition_sh.LOG_00922s_00001: Permissão negada
grep: ./ctm/sysout/exportPartition_sh.LOG_0092gl_00001: Permissão negada
grep: ./ctm/sysout/exportPartition_sh.LOG_0094zx_00001: Permissão negada
grep: ./ctm/sysout/exportPartition_sh.LOG_00922r_00001: Permissão negada
grep: ./ctm/sysout/exportPartition_sh.LOG_00923k_00001: Permissão negada
grep: ./ctm/sysout/exportPartition_sh.LOG_00946b_00001: Permissão negada
grep: ./ctm/sysout/exportPartition_sh.LOG_00922u_00001: Permissão negada
grep: ./ctm/sysout/importPartition_sh.LOG_00922t_00001: Permissão negada
grep: ./ctm/sysout/importPartition_sh.LOG_00922v_00001: Permissão negada
grep: ./ctm/sysout/exportPartition_sh.LOG_00923m_00001: Permissão negada
grep: ./ctm/sysout/exportPartition_sh.LOG_0093at_00001: Permissão negada
grep: ./ctm/sysout/exportPartition_sh.LOG_009236_00001: Permissão negada
grep: ./ctm/sysout/dropPartition_sh.LOG_00922q_00001: Permissão negada
grep: ./ctm/sysout/exportPartition_sh.LOG_00946c_00001: Permissão negada
grep: ./ctm/sysout/exportPartition_sh.LOG_009234_00001: Permissão negada
grep: ./ctm/sysout/exportPartition_sh.LOG_00923e_00001: Permissão negada
grep: ./ctm/sysout/exportPartition_sh.LOG_0094zv_00001: Permissão negada
grep: ./ctm/sysout/exportPartition_sh.LOG_009235_00001: Permissão negada
grep: ./ctm/sysout/dropPartition_sh.LOG_009233_00001: Permissão negada
grep: ./ctm/sysout/dropPartition_sh.LOG_0094ka_00001: Permissão negada
grep: ./ctm/sysout/exportPartition_sh.LOG_0092gg_00001: Permissão negada
grep: ./ctm/sysout/exportPartition_sh.LOG_00923l_00001: Permissão negada
grep: ./ctm/sysout/exportPartition_sh.LOG_0092gd_00001: Permissão negada
grep: ./ctm/sysout/exportPartition_sh.LOG_0092gm_00001: Permissão negada
grep: ./ctm/sysout/exportPartition_sh.LOG_0094zw_00001: Permissão negada
grep: ./ctm/sysout/exportPartition_sh.LOG_0092ga_00001: Permissão negada
grep: ./ctm/sysout/exportPartition_sh.LOG_0092gn_00001: Permissão negada
grep: ./ctm/sysout/importPartition_sh.LOG_009237_00001: Permissão negada
grep: ./ctm/sysout/exportPartition_sh.LOG_0092gh_00001: Permissão negada
grep: ./ctm/sysout/exportPartition_sh.LOG_00923a_00001: Permissão negada
grep: ./ctm/sysout/exportPartition_sh.LOG_0092gk_00001: Permissão negada
grep: ./ctm/sysout/exportPartition_sh.LOG_009231_00001: Permissão negada
grep: ./ctm/sysout/dropPartition_sh.LOG_0092vg_00001: Permissão negada
grep: ./ctm/sysout/dropPartition_sh.LOG_00922y_00001: Permissão negada
grep: ./ctm/sysout/dropPartition_sh.LOG_0093qc_00001: Permissão negada
./ctm/toolbox/analyze_disk_space_in_agent_dirs.pl:82:           $agentDir =  $ENV{'CONTROLM'};
./ctm/toolbox/check_memory_leak_in_agent_logs.pl:83:            my $currPath =  $ENV{'CONTROLM'};
./ctm/toolbox/toolbox.pl:113:           $AGENT_DIR = $ENV{"CONTROLM"};
./ctm/toolbox/toolbox.pl:114:           $LOG_DIR        = $ENV{"CONTROLM"}."/proclog";
./ctm/toolbox/toolbox.pl:115:           $BMC_PERL       = $ENV{"CONTROLM"}."/bmcperl/perl";
./ctm/toolbox/toolbox.pl:682:                           $controlmPath =  $ENV{'CONTROLM'};
./ctm/toolbox/toolbox.pl:683:                           $pathToDir = File::Spec->catfile($controlmPath,"exe");
./ctm/toolbox/toolbox.pl:965:                           my $controlmPathEnv =  $ENV{'CONTROLM'};
./ctm/toolbox/toolbox.pl:966:                           $execArgsH{($currMenu."0")}[3] = File::Spec->catfile($controlmPathEnv,"proclog");
./ctm/toolbox/toolbox.pl:1379:   $controlmPath =  $ENV{'CONTROLM'};
./ctm/toolbox/toolbox.pl:1380:   $pathToJar = "${controlmPath}/toolbox/";
./ctm/toolbox/toolbox.pl:1382:   chomp ($value = `grep BMC_JAVA_HOME $controlmPath/data/CONFIG.dat | sed 's/ //g' | sed 's/BMC_JAVA_HOME//g'`);
./ctm/toolbox/toolbox.pl:1385:          $pathToDir = File::Spec->catfile($controlmPath,"JRE/bin/java");
grep: ./ctm/toolbox/wkl_cpu: arquivo binário coincide com o padrão
./.cshrc:7:setenv CONTROLM "/opt/ctmage/ctm"
./.bash_profile:7:CONTROLM="/opt/ctmage/ctm"
./.bash_profile:8:export CONTROLM
./.bash_profile:10:[ -f $CONTROLM/scripts/bash_profile.agcheck ] && . $CONTROLM/scripts/bash_profile.agcheck
[ctmagelx@caddeapllx2501 ~]$
