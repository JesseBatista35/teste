https://devops.caixa/projetos/Caixa/_releaseProgress?_a=release-environment-logs&releaseId=504238&environmentId=2342298

2026-07-22T19:40:08.3597635Z ##[section]Starting: Upload de App - Faixa Internal Test
2026-07-22T19:40:08.3601173Z ==============================================================================
2026-07-22T19:40:08.3601332Z Task         : Google Play - Release
2026-07-22T19:40:08.3601477Z Description  : Release an app to the Google Play Store
2026-07-22T19:40:08.3601556Z Version      : 3.172.0
2026-07-22T19:40:08.3601608Z Author       : Microsoft Corporation
2026-07-22T19:40:08.3601674Z Help         : ms-resource:loc.helpMarkDown
2026-07-22T19:40:08.3601737Z ==============================================================================
2026-07-22T19:40:08.9376878Z Found main APK to upload: /opt/temp/simsc/app-7.1.1.504238/simsc-7.1.1-Piloto.504238.apk (version code 202613019)
2026-07-22T19:40:09.1724689Z Authenticated with Google Play and getting new edit 
2026-07-22T19:40:23.9458959Z Updating track information...
2026-07-22T19:40:26.5206678Z ##[error]Error: Changes cannot be sent for review automatically. Please set the query parameter changesNotSentForReview to true. Once committed, the changes in this edit can be sent for review from the Google Play Console UI.
2026-07-22T19:40:26.5270514Z ##[section]Finishing: Upload de App - Faixa Internal Test



solicitamos suporte no erro apontado acima.


conforme avaliacao da fsw a alteracao do parametro deverá ser nos stages de envio a loja para "changesNotSentForReview=true"

Isso faz com que a publicação seja carregada e salva no Play Console, mas não seja submetida automaticamente para revisão. A revisão deverá ser iniciada manualmente na interface do Google Play Console, permitindo assim o ajuste do erro apontado pela revisao anterior daquela loja



<img width="1898" height="901" alt="image" src="https://github.com/user-attachments/assets/73cb1518-5ccd-4105-9009-394058ed5191" />
