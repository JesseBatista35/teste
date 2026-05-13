

Use "oc options" for a list of global command-line options (applies to all commands).

-sh-4.2$ oc exec -it pod/sitop-frontend-des-5-mzzkd -n NSsitop-des -- sh
error: invalid resource name "pod/sitop-frontend-des-5-mzzkd": [may not contain '/']
-sh-4.2$ find /opt/app-roor/src -name "*,js"
find: ‘/opt/app-roor/src’: Arquivo ou diretório não encontrado
-sh-4.2$ find /opt/app-root/src -name "*,js"
find: ‘/opt/app-root/src’: Arquivo ou diretório não encontrado
-sh-4.2$ find /opt/app-root/src -name "*.js"
find: ‘/opt/app-root/src’: Arquivo ou diretório não encontrado
-sh-4.2$ find /opt/app-root/src -name "*.js"
find: ‘/opt/app-root/src’: Arquivo ou diretório não encontrado
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ find / -name "main*.js" 2>/dev/null
/opt/ads-agent/externals/node10/lib/node_modules/npm/node_modules/qrcode-terminal/lib/main.js
/opt/ads-agent/externals/node10/lib/node_modules/npm/node_modules/dotenv/lib/main.js
/opt/ads-agent/_work/_tasks/DownloadSecureFile_2a6ca863-f2ce-4f4d-8bcb-15e64608ec4b/1.181.0/node_modules/resolve/test/module_dir/zmodules/bbb/main.js
/opt/ads-agent/_work/_tasks/DownloadSecureFile_2a6ca863-f2ce-4f4d-8bcb-15e64608ec4b/1.181.0/node_modules/resolve/test/pathfilter/deep_ref/main.js
/opt/ads-agent/_work/_tasks/DownloadSecureFile_2a6ca863-f2ce-4f4d-8bcb-15e64608ec4b/1.181.0/node_modules/resolve/test/precedence/aaa/main.js
/opt/ads-agent/_work/_tasks/DownloadSecureFile_2a6ca863-f2ce-4f4d-8bcb-15e64608ec4b/1.181.0/node_modules/resolve/test/precedence/bbb/main.js
/opt/ads-agent/_work/_tasks/DownloadSecureFile_2a6ca863-f2ce-4f4d-8bcb-15e64608ec4b/1.181.0/node_modules/resolve/test/resolver/without_basedir/main.js
/opt/ads-agent/_work/_tasks/DownloadSecureFile_2a6ca863-f2ce-4f4d-8bcb-15e64608ec4b/1.220.0/node_modules/resolve/test/module_dir/zmodules/bbb/main.js
/opt/ads-agent/_work/_tasks/DownloadSecureFile_2a6ca863-f2ce-4f4d-8bcb-15e64608ec4b/1.220.0/node_modules/resolve/test/pathfilter/deep_ref/main.js
/opt/ads-agent/_work/_tasks/DownloadSecureFile_2a6ca863-f2ce-4f4d-8bcb-15e64608ec4b/1.220.0/node_modules/resolve/test/precedence/aaa/main.js
/opt/ads-agent/_work/_tasks/DownloadSecureFile_2a6ca863-f2ce-4f4d-8bcb-15e64608ec4b/1.220.0/node_modules/resolve/test/precedence/bbb/main.js
/opt/ads-agent/_work/_tasks/DownloadSecureFile_2a6ca863-f2ce-4f4d-8bcb-15e64608ec4b/1.220.0/node_modules/resolve/test/resolver/without_basedir/main.js
/opt/ads-agent/_work/_tasks/Bash_6c731c3c-3c68-459a-a5c9-bde6e6595b5b/3.179.0/node_modules/resolve/test/module_dir/zmodules/bbb/main.js
/opt/ads-agent/_work/_tasks/Bash_6c731c3c-3c68-459a-a5c9-bde6e6595b5b/3.179.0/node_modules/resolve/test/pathfilter/deep_ref/main.js
/opt/ads-agent/_work/_tasks/Bash_6c731c3c-3c68-459a-a5c9-bde6e6595b5b/3.179.0/node_modules/resolve/test/precedence/aaa/main.js
/opt/ads-agent/_work/_tasks/Bash_6c731c3c-3c68-459a-a5c9-bde6e6595b5b/3.179.0/node_modules/resolve/test/precedence/bbb/main.js
/opt/ads-agent/_work/_tasks/Bash_6c731c3c-3c68-459a-a5c9-bde6e6595b5b/3.179.0/node_modules/resolve/test/resolver/without_basedir/main.js
/opt/ads-agent/_work/_tasks/Bash_6c731c3c-3c68-459a-a5c9-bde6e6595b5b/3.227.0/node_modules/resolve/test/module_dir/zmodules/bbb/main.js
/opt/ads-agent/_work/_tasks/Bash_6c731c3c-3c68-459a-a5c9-bde6e6595b5b/3.227.0/node_modules/resolve/test/pathfilter/deep_ref/main.js
/opt/ads-agent/_work/_tasks/Bash_6c731c3c-3c68-459a-a5c9-bde6e6595b5b/3.227.0/node_modules/resolve/test/precedence/aaa/main.js
/opt/ads-agent/_work/_tasks/Bash_6c731c3c-3c68-459a-a5c9-bde6e6595b5b/3.227.0/node_modules/resolve/test/precedence/bbb/main.js
/opt/ads-agent/_work/_tasks/Bash_6c731c3c-3c68-459a-a5c9-bde6e6595b5b/3.227.0/node_modules/resolve/test/resolver/without_basedir/main.js
/opt/ads-agent/_work/_tasks/PythonScript_6392f95f-7e76-4a18-b3c7-7f078d2f7700/0.151.1/main.js
/opt/ads-agent/_work/_tasks/PythonScript_6392f95f-7e76-4a18-b3c7-7f078d2f7700/0.167.2/main.js
/opt/ads-agent/_work/_tasks/PythonScript_6392f95f-7e76-4a18-b3c7-7f078d2f7700/0.213.0/main.js
/opt/ads-agent/_work/_tasks/PythonScript_6392f95f-7e76-4a18-b3c7-7f078d2f7700/0.213.0/node_modules/resolve/test/module_dir/zmodules/bbb/main.js
/opt/ads-agent/_work/_tasks/PythonScript_6392f95f-7e76-4a18-b3c7-7f078d2f7700/0.213.0/node_modules/resolve/test/pathfilter/deep_ref/main.js
/opt/ads-agent/_work/_tasks/PythonScript_6392f95f-7e76-4a18-b3c7-7f078d2f7700/0.213.0/node_modules/resolve/test/precedence/aaa/main.js
/opt/ads-agent/_work/_tasks/PythonScript_6392f95f-7e76-4a18-b3c7-7f078d2f7700/0.213.0/node_modules/resolve/test/precedence/bbb/main.js
/opt/ads-agent/_work/_tasks/PythonScript_6392f95f-7e76-4a18-b3c7-7f078d2f7700/0.213.0/node_modules/resolve/test/resolver/without_basedir/main.js
/opt/ads-agent/_work/_tasks/Maven_ac4ee482-65da-4485-a532-7b085873e532/3.181.1/node_modules/adm-zip/headers/mainHeader.js
/opt/ads-agent/_work/_tasks/Maven_ac4ee482-65da-4485-a532-7b085873e532/3.181.1/node_modules/resolve/test/module_dir/zmodules/bbb/main.js
/opt/ads-agent/_work/_tasks/Maven_ac4ee482-65da-4485-a532-7b085873e532/3.181.1/node_modules/resolve/test/pathfilter/deep_ref/main.js
/opt/ads-agent/_work/_tasks/Maven_ac4ee482-65da-4485-a532-7b085873e532/3.181.1/node_modules/resolve/test/precedence/aaa/main.js
/opt/ads-agent/_work/_tasks/Maven_ac4ee482-65da-4485-a532-7b085873e532/3.181.1/node_modules/resolve/test/precedence/bbb/main.js
/opt/ads-agent/_work/_tasks/Maven_ac4ee482-65da-4485-a532-7b085873e532/3.181.1/node_modules/resolve/test/resolver/without_basedir/main.js
/opt/ads-agent/_work/_tasks/Maven_ac4ee482-65da-4485-a532-7b085873e532/3.225.0/node_modules/adm-zip/headers/mainHeader.js
/opt/ads-agent/_work/_tasks/Maven_ac4ee482-65da-4485-a532-7b085873e532/3.225.0/node_modules/resolve/test/module_dir/zmodules/bbb/main.js
/opt/ads-agent/_work/_tasks/Maven_ac4ee482-65da-4485-a532-7b085873e532/3.225.0/node_modules/resolve/test/pathfilter/deep_ref/main.js
/opt/ads-agent/_work/_tasks/Maven_ac4ee482-65da-4485-a532-7b085873e532/3.225.0/node_modules/resolve/test/precedence/aaa/main.js
/opt/ads-agent/_work/_tasks/Maven_ac4ee482-65da-4485-a532-7b085873e532/3.225.0/node_modules/resolve/test/precedence/bbb/main.js
/opt/ads-agent/_work/_tasks/Maven_ac4ee482-65da-4485-a532-7b085873e532/3.225.0/node_modules/resolve/test/resolver/without_basedir/main.js
/opt/ads-agent/_work/_tasks/Maven_ac4ee482-65da-4485-a532-7b085873e532/4.225.0/node_modules/adm-zip/headers/mainHeader.js
/opt/ads-agent/_work/_tasks/Maven_ac4ee482-65da-4485-a532-7b085873e532/4.225.0/node_modules/resolve/test/module_dir/zmodules/bbb/main.js
/opt/ads-agent/_work/_tasks/Maven_ac4ee482-65da-4485-a532-7b085873e532/4.225.0/node_modules/resolve/test/pathfilter/deep_ref/main.js
/opt/ads-agent/_work/_tasks/Maven_ac4ee482-65da-4485-a532-7b085873e532/4.225.0/node_modules/resolve/test/precedence/aaa/main.js
/opt/ads-agent/_work/_tasks/Maven_ac4ee482-65da-4485-a532-7b085873e532/4.225.0/node_modules/resolve/test/precedence/bbb/main.js
/opt/ads-agent/_work/_tasks/Maven_ac4ee482-65da-4485-a532-7b085873e532/4.225.0/node_modules/resolve/test/resolver/without_basedir/main.js
/opt/ads-agent/_work/_tasks/CopyFilesOverSSH_67cec91b-0351-4c2f-8465-d74b3d2a2d96/0.221.0/node_modules/resolve/test/module_dir/zmodules/bbb/main.js
/opt/ads-agent/_work/_tasks/CopyFilesOverSSH_67cec91b-0351-4c2f-8465-d74b3d2a2d96/0.221.0/node_modules/resolve/test/pathfilter/deep_ref/main.js
/opt/ads-agent/_work/_tasks/CopyFilesOverSSH_67cec91b-0351-4c2f-8465-d74b3d2a2d96/0.221.0/node_modules/resolve/test/precedence/aaa/main.js
/opt/ads-agent/_work/_tasks/CopyFilesOverSSH_67cec91b-0351-4c2f-8465-d74b3d2a2d96/0.221.0/node_modules/resolve/test/precedence/bbb/main.js
/opt/ads-agent/_work/_tasks/CopyFilesOverSSH_67cec91b-0351-4c2f-8465-d74b3d2a2d96/0.221.0/node_modules/resolve/test/resolver/without_basedir/main.js
/opt/ads-agent/_work/_tasks/DownloadBuildArtifacts_a433f589-fce1-4460-9ee6-44a624aeb1fb/0.153.3/main.js
/opt/ads-agent/_work/_tasks/CmdLine_d9bafed4-0b18-4f58-968d-86655b4d2ce9/2.212.0/node_modules/resolve/test/module_dir/zmodules/bbb/main.js
/opt/ads-agent/_work/_tasks/CmdLine_d9bafed4-0b18-4f58-968d-86655b4d2ce9/2.212.0/node_modules/resolve/test/pathfilter/deep_ref/main.js
/opt/ads-agent/_work/_tasks/CmdLine_d9bafed4-0b18-4f58-968d-86655b4d2ce9/2.212.0/node_modules/resolve/test/precedence/aaa/main.js
/opt/ads-agent/_work/_tasks/CmdLine_d9bafed4-0b18-4f58-968d-86655b4d2ce9/2.212.0/node_modules/resolve/test/precedence/bbb/main.js
/opt/ads-agent/_work/_tasks/CmdLine_d9bafed4-0b18-4f58-968d-86655b4d2ce9/2.212.0/node_modules/resolve/test/resolver/without_basedir/main.js
/opt/ads-agent/_work/_tasks/UsePythonVersion_33c63b11-352b-45a2-ba1b-54cb568a29ca/0.151.1/main.js
/opt/ads-agent/_work/_tasks/UseNode_31c75bbb-bcdf-4706-8d7c-4da6a1959bc2/1.179.2/node_modules/adm-zip/headers/mainHeader.js
/opt/ads-agent/_work/_tasks/UseNode_31c75bbb-bcdf-4706-8d7c-4da6a1959bc2/1.179.2/node_modules/resolve/test/module_dir/zmodules/bbb/main.js
/opt/ads-agent/_work/_tasks/UseNode_31c75bbb-bcdf-4706-8d7c-4da6a1959bc2/1.179.2/node_modules/resolve/test/pathfilter/deep_ref/main.js
/opt/ads-agent/_work/_tasks/UseNode_31c75bbb-bcdf-4706-8d7c-4da6a1959bc2/1.179.2/node_modules/resolve/test/precedence/aaa/main.js
/opt/ads-agent/_work/_tasks/UseNode_31c75bbb-bcdf-4706-8d7c-4da6a1959bc2/1.179.2/node_modules/resolve/test/precedence/bbb/main.js
/opt/ads-agent/_work/_tasks/UseNode_31c75bbb-bcdf-4706-8d7c-4da6a1959bc2/1.179.2/node_modules/resolve/test/resolver/without_basedir/main.js
/opt/ads-agent/_work/_tasks/Npm_fe47e961-9fa8-4106-8639-368c022d43ad/1.180.0/node_modules/adm-zip/headers/mainHeader.js
/opt/ads-agent/_work/_tasks/PublishTestResults_0b0f01ed-7dde-43ff-9cbb-e48954daf9b1/2.216.2/node_modules/resolve/test/module_dir/zmodules/bbb/main.js
/opt/ads-agent/_work/_tasks/PublishTestResults_0b0f01ed-7dde-43ff-9cbb-e48954daf9b1/2.216.2/node_modules/resolve/test/pathfilter/deep_ref/main.js
/opt/ads-agent/_work/_tasks/PublishTestResults_0b0f01ed-7dde-43ff-9cbb-e48954daf9b1/2.216.2/node_modules/resolve/test/precedence/aaa/main.js
/opt/ads-agent/_work/_tasks/PublishTestResults_0b0f01ed-7dde-43ff-9cbb-e48954daf9b1/2.216.2/node_modules/resolve/test/precedence/bbb/main.js
/opt/ads-agent/_work/_tasks/PublishTestResults_0b0f01ed-7dde-43ff-9cbb-e48954daf9b1/2.216.2/node_modules/resolve/test/resolver/without_basedir/main.js
/opt/ads-agent/_work/_tasks/CopyFiles_5bfb729a-a7c8-4a78-a7c3-8d717bb7c13c/2.211.0/node_modules/resolve/test/module_dir/zmodules/bbb/main.js
/opt/ads-agent/_work/_tasks/CopyFiles_5bfb729a-a7c8-4a78-a7c3-8d717bb7c13c/2.211.0/node_modules/resolve/test/pathfilter/deep_ref/main.js
/opt/ads-agent/_work/_tasks/CopyFiles_5bfb729a-a7c8-4a78-a7c3-8d717bb7c13c/2.211.0/node_modules/resolve/test/precedence/aaa/main.js
/opt/ads-agent/_work/_tasks/CopyFiles_5bfb729a-a7c8-4a78-a7c3-8d717bb7c13c/2.211.0/node_modules/resolve/test/precedence/bbb/main.js
/opt/ads-agent/_work/_tasks/CopyFiles_5bfb729a-a7c8-4a78-a7c3-8d717bb7c13c/2.211.0/node_modules/resolve/test/resolver/without_basedir/main.js
/opt/ads-agent/_work/_tasks/PublishBuildArtifacts_2ff763a7-ce83-4e1f-bc89-0ae63477cebe/1.225.0/node_modules/resolve/test/module_dir/zmodules/bbb/main.js
/opt/ads-agent/_work/_tasks/PublishBuildArtifacts_2ff763a7-ce83-4e1f-bc89-0ae63477cebe/1.225.0/node_modules/resolve/test/pathfilter/deep_ref/main.js
/opt/ads-agent/_work/_tasks/PublishBuildArtifacts_2ff763a7-ce83-4e1f-bc89-0ae63477cebe/1.225.0/node_modules/resolve/test/precedence/aaa/main.js
/opt/ads-agent/_work/_tasks/PublishBuildArtifacts_2ff763a7-ce83-4e1f-bc89-0ae63477cebe/1.225.0/node_modules/resolve/test/precedence/bbb/main.js
/opt/ads-agent/_work/_tasks/PublishBuildArtifacts_2ff763a7-ce83-4e1f-bc89-0ae63477cebe/1.225.0/node_modules/resolve/test/resolver/without_basedir/main.js
/opt/ads-agent/_work/_tasks/FortifyScanCentralSAST_55a97a52-a238-46af-9de9-e4245ab45e72/7.5.0/node_modules/adm-zip/headers/mainHeader.js
/opt/ads-agent/_work/_tasks/FortifyScanCentralSAST_55a97a52-a238-46af-9de9-e4245ab45e72/7.5.0/node_modules/nodejs-file-downloader/main.test.js
/opt/ads-agent/_work/_tasks/FortifyScanCentralSAST_55a97a52-a238-46af-9de9-e4245ab45e72/7.5.0/node_modules/resolve/test/module_dir/zmodules/bbb/main.js
/opt/ads-agent/_work/_tasks/FortifyScanCentralSAST_55a97a52-a238-46af-9de9-e4245ab45e72/7.5.0/node_modules/resolve/test/pathfilter/deep_ref/main.js
/opt/ads-agent/_work/_tasks/FortifyScanCentralSAST_55a97a52-a238-46af-9de9-e4245ab45e72/7.5.0/node_modules/resolve/test/precedence/aaa/main.js
/opt/ads-agent/_work/_tasks/FortifyScanCentralSAST_55a97a52-a238-46af-9de9-e4245ab45e72/7.5.0/node_modules/resolve/test/precedence/bbb/main.js
/opt/ads-agent/_work/_tasks/FortifyScanCentralSAST_55a97a52-a238-46af-9de9-e4245ab45e72/7.5.0/node_modules/resolve/test/resolver/without_basedir/main.js
/opt/ads-agent/_work/_tasks/DeleteFiles_b7e8b412-0437-4065-9371-edc5881de25b/1.211.0/node_modules/resolve/test/module_dir/zmodules/bbb/main.js
/opt/ads-agent/_work/_tasks/DeleteFiles_b7e8b412-0437-4065-9371-edc5881de25b/1.211.0/node_modules/resolve/test/pathfilter/deep_ref/main.js
/opt/ads-agent/_work/_tasks/DeleteFiles_b7e8b412-0437-4065-9371-edc5881de25b/1.211.0/node_modules/resolve/test/precedence/aaa/main.js
/opt/ads-agent/_work/_tasks/DeleteFiles_b7e8b412-0437-4065-9371-edc5881de25b/1.211.0/node_modules/resolve/test/precedence/bbb/main.js
/opt/ads-agent/_work/_tasks/DeleteFiles_b7e8b412-0437-4065-9371-edc5881de25b/1.211.0/node_modules/resolve/test/resolver/without_basedir/main.js
^C
-sh-4.2$
-sh-4.2$
-sh-4.2$ ls -la /opt
total 392
drwxr-xr-x. 17 root     root        244 Mar 13 10:25 .
dr-xr-xr-x. 20 root     root        287 Dez 13 02:59 ..
drwxr-xr-x  20 sadscp01 sadscp01   4096 Mai 13 01:31 ads-agent
drwxr-xr-x   3 root     root         32 Nov 21  2019 apache-maven
drwxr-xr-x   5 root     root         49 Jun 27  2025 azcmagent
drwxrwxr-x   5 ctmagelx controlm    155 Fev 15  2018 ctmage
drwxrwxrwx   2 root     root         45 Mar 13  2024 dump
drwxr-xr-x   3 root     root        188 Jun 29  2021 fortify-20.2.2
drwxr-xr-x   5 root     root         50 Jun 27  2025 GC_Ext
drwxr-xr-x   3 root     root         16 Jun 27  2025 GC_Service
drwxr-xr-x   3 root     root         21 Mar 13 10:25 jboss-eap
drwxr-xr-x   3 root     root         19 Jun 28  2025 microsoft
drwxr-xr-x.  7 root     root         81 Set  5  2024 puppetlabs
drwxr-xr-x   3 root     root         22 Jun 18  2024 rh
drwxr-xr-x   2 root     root          6 Jan 12  2023 SONAR
drwxrwxrwx   2 root     root     319488 Abr  1  2025 SSC-ssc
drwxr-xr-x   3 root     root         17 Jun 25  2020 tivoli
-sh-4.2$
