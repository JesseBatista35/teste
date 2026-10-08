2026-09-29T17:01:32.0579011Z ##[section]Starting: Publica no Nexus
2026-09-29T17:01:32.0582699Z ==============================================================================
2026-09-29T17:01:32.0582798Z Task         : Bash
2026-09-29T17:01:32.0582842Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-09-29T17:01:32.0582906Z Version      : 3.227.0
2026-09-29T17:01:32.0582960Z Author       : Microsoft Corporation
2026-09-29T17:01:32.0583013Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-09-29T17:01:32.0583080Z ==============================================================================
2026-09-29T17:01:32.1900413Z Generating script.
2026-09-29T17:01:32.1918824Z ========================== Starting Command Output ===========================
2026-09-29T17:01:32.1926287Z [command]/usr/bin/bash /opt/ads-agent/_work/_temp/f80d0911-0162-49a4-a7bc-245e210e98bf.sh
2026-09-29T17:01:32.1977530Z VEC true
2026-09-29T17:01:32.1977717Z ##[section]=== Info do pacote ===
2026-09-29T17:01:32.1978100Z ##[section]groupid= br.gov.caixa.sipbs-estatico
2026-09-29T17:01:32.1978259Z ##[section]artifact= sipbs-estatico
2026-09-29T17:01:32.1979839Z ##[section]version= 3.26.0.6
2026-09-29T17:01:32.1980066Z =========================================================
2026-09-29T17:01:32.1980565Z /opt/ads-agent/_work/_temp/f80d0911-0162-49a4-a7bc-245e210e98bf.sh: line 28: library: comando não encontrado
2026-09-29T17:01:32.1981915Z -Dversion.app=3.26.0.6 -DgroupId=br.gov.caixa.sipbs-estatico -DartifactId=sipbs-estatico -Dversion=3.26.0.6 -Dpackaging=zip -Dfile=/opt/ads-agent/_work/6840/a/sipbs-estatico-0.0.1-snapshot.zip -DrepositoryId=NEXUS_INTERNO -DgeneratePom=true -Durl=http://binario.caixa:8081/repository/caixa-raw-releases/angular
2026-09-29T17:01:33.1321466Z [INFO] Scanning for projects...
2026-09-29T17:01:33.2496613Z [INFO] 
2026-09-29T17:01:33.2578354Z [INFO] ------------------< org.apache.maven:standalone-pom >-------------------
2026-09-29T17:01:33.2585027Z [INFO] Building Maven Stub Project (No POM) 1
2026-09-29T17:01:33.2606893Z [INFO] --------------------------------[ pom ]---------------------------------
2026-09-29T17:01:33.2607498Z [INFO] 
2026-09-29T17:01:33.2660010Z [INFO] --- maven-deploy-plugin:2.7:deploy-file (default-cli) @ standalone-pom ---
2026-09-29T17:01:33.6323942Z Uploading to NEXUS_INTERNO: http://binario.caixa:8081/repository/caixa-raw-releases/angular/br/gov/caixa/sipbs-estatico/sipbs-estatico/3.26.0.6/sipbs-estatico-3.26.0.6.zip
2026-09-29T17:01:33.7513637Z Progress (1): 0/2.7 MB
2026-09-29T17:01:33.7514218Z Progress (1): 0/2.7 MB
2026-09-29T17:01:33.7514548Z Progress (1): 0.1/2.7 MB
2026-09-29T17:01:33.7518766Z Progress (1): 0.1/2.7 MB
2026-09-29T17:01:33.7519016Z Progress (1): 0.1/2.7 MB
2026-09-29T17:01:33.7519194Z Progress (1): 0.1/2.7 MB
2026-09-29T17:01:33.7519422Z Progress (1): 0.2/2.7 MB
2026-09-29T17:01:33.7519786Z Progress (1): 0.2/2.7 MB
2026-09-29T17:01:33.7520004Z Progress (1): 0.2/2.7 MB
2026-09-29T17:01:33.7520169Z Progress (1): 0.2/2.7 MB
2026-09-29T17:01:33.7520329Z Progress (1): 0.3/2.7 MB
2026-09-29T17:01:33.7528077Z Progress (1): 0.3/2.7 MB
2026-09-29T17:01:33.7528889Z Progress (1): 0.3/2.7 MB
2026-09-29T17:01:33.7529152Z Progress (1): 0.3/2.7 MB
2026-09-29T17:01:33.7529390Z Progress (1): 0.4/2.7 MB
2026-09-29T17:01:33.7529663Z Progress (1): 0.4/2.7 MB
2026-09-29T17:01:33.7530325Z Progress (1): 0.4/2.7 MB
2026-09-29T17:01:33.7530588Z Progress (1): 0.4/2.7 MB
2026-09-29T17:01:33.7530850Z Progress (1): 0.5/2.7 MB
2026-09-29T17:01:33.7531119Z Progress (1): 0.5/2.7 MB
2026-09-29T17:01:33.7531344Z Progress (1): 0.5/2.7 MB
2026-09-29T17:01:33.7532120Z Progress (1): 0.5/2.7 MB
2026-09-29T17:01:33.7532409Z Progress (1): 0.6/2.7 MB
2026-09-29T17:01:33.7532631Z Progress (1): 0.6/2.7 MB
2026-09-29T17:01:33.7532866Z Progress (1): 0.6/2.7 MB
2026-09-29T17:01:33.7533072Z Progress (1): 0.6/2.7 MB
2026-09-29T17:01:33.7533273Z Progress (1): 0.7/2.7 MB
2026-09-29T17:01:33.7533455Z Progress (1): 0.7/2.7 MB
2026-09-29T17:01:33.7533666Z Progress (1): 0.7/2.7 MB
2026-09-29T17:01:33.7533875Z Progress (1): 0.7/2.7 MB
2026-09-29T17:01:33.7534418Z Progress (1): 0.8/2.7 MB
2026-09-29T17:01:33.7534621Z Progress (1): 0.8/2.7 MB
2026-09-29T17:01:33.7534850Z Progress (1): 0.8/2.7 MB
2026-09-29T17:01:33.7535034Z Progress (1): 0.8/2.7 MB
2026-09-29T17:01:33.7535208Z Progress (1): 0.9/2.7 MB
2026-09-29T17:01:33.7535528Z Progress (1): 0.9/2.7 MB
2026-09-29T17:01:33.7536423Z Progress (1): 0.9/2.7 MB
2026-09-29T17:01:33.7569562Z Progress (1): 0.9/2.7 MB
2026-09-29T17:01:33.7569883Z Progress (1): 1.0/2.7 MB
2026-09-29T17:01:33.7571719Z Progress (1): 1.0/2.7 MB
2026-09-29T17:01:33.7571902Z Progress (1): 1.0/2.7 MB
2026-09-29T17:01:33.7572419Z Progress (1): 1.0/2.7 MB
2026-09-29T17:01:33.7575417Z Progress (1): 1.1/2.7 MB
2026-09-29T17:01:33.7575624Z Progress (1): 1.1/2.7 MB
2026-09-29T17:01:33.7575803Z Progress (1): 1.1/2.7 MB
2026-09-29T17:01:33.7576031Z Progress (1): 1.1/2.7 MB
2026-09-29T17:01:33.7579884Z Progress (1): 1.2/2.7 MB
2026-09-29T17:01:33.7580117Z Progress (1): 1.2/2.7 MB
2026-09-29T17:01:33.7582194Z Progress (1): 1.2/2.7 MB
2026-09-29T17:01:33.7619951Z Progress (1): 1.2/2.7 MB
2026-09-29T17:01:33.7620361Z Progress (1): 1.3/2.7 MB
2026-09-29T17:01:33.7622505Z Progress (1): 1.3/2.7 MB
2026-09-29T17:01:33.7622733Z Progress (1): 1.3/2.7 MB
2026-09-29T17:01:33.7622953Z Progress (1): 1.3/2.7 MB
2026-09-29T17:01:33.7625748Z Progress (1): 1.4/2.7 MB
2026-09-29T17:01:33.7625924Z Progress (1): 1.4/2.7 MB
2026-09-29T17:01:33.7626117Z Progress (1): 1.4/2.7 MB
2026-09-29T17:01:33.7626391Z Progress (1): 1.4/2.7 MB
2026-09-29T17:01:33.7628928Z Progress (1): 1.4/2.7 MB
2026-09-29T17:01:33.7668951Z Progress (1): 1.5/2.7 MB
2026-09-29T17:01:33.7670668Z Progress (1): 1.5/2.7 MB
2026-09-29T17:01:33.7670917Z Progress (1): 1.5/2.7 MB
2026-09-29T17:01:33.7672533Z Progress (1): 1.5/2.7 MB
2026-09-29T17:01:33.7672725Z Progress (1): 1.6/2.7 MB
2026-09-29T17:01:33.7674679Z Progress (1): 1.6/2.7 MB
2026-09-29T17:01:33.7674891Z Progress (1): 1.6/2.7 MB
2026-09-29T17:01:33.7675130Z Progress (1): 1.6/2.7 MB
2026-09-29T17:01:33.7677940Z Progress (1): 1.7/2.7 MB
2026-09-29T17:01:33.7680213Z Progress (1): 1.7/2.7 MB
2026-09-29T17:01:33.7682061Z Progress (1): 1.7/2.7 MB
2026-09-29T17:01:33.7727385Z Progress (1): 1.7/2.7 MB
2026-09-29T17:01:33.7729106Z Progress (1): 1.8/2.7 MB
2026-09-29T17:01:33.7729358Z Progress (1): 1.8/2.7 MB
2026-09-29T17:01:33.7729584Z Progress (1): 1.8/2.7 MB
2026-09-29T17:01:33.7732366Z Progress (1): 1.8/2.7 MB
2026-09-29T17:01:33.7732578Z Progress (1): 1.9/2.7 MB
2026-09-29T17:01:33.7732796Z Progress (1): 1.9/2.7 MB
2026-09-29T17:01:33.7733206Z Progress (1): 1.9/2.7 MB
2026-09-29T17:01:33.7735896Z Progress (1): 1.9/2.7 MB
2026-09-29T17:01:33.7736096Z Progress (1): 2.0/2.7 MB
2026-09-29T17:01:33.7736295Z Progress (1): 2.0/2.7 MB
2026-09-29T17:01:33.7817097Z Progress (1): 2.0/2.7 MB
2026-09-29T17:01:33.7817417Z Progress (1): 2.0/2.7 MB
2026-09-29T17:01:33.7817681Z Progress (1): 2.1/2.7 MB
2026-09-29T17:01:33.7817929Z Progress (1): 2.1/2.7 MB
2026-09-29T17:01:33.7818225Z Progress (1): 2.1/2.7 MB
2026-09-29T17:01:33.7819429Z Progress (1): 2.1/2.7 MB
2026-09-29T17:01:33.7819582Z Progress (1): 2.2/2.7 MB
2026-09-29T17:01:33.7819742Z Progress (1): 2.2/2.7 MB
2026-09-29T17:01:33.7820720Z Progress (1): 2.2/2.7 MB
2026-09-29T17:01:33.7820918Z Progress (1): 2.2/2.7 MB
2026-09-29T17:01:33.7868673Z Progress (1): 2.3/2.7 MB
2026-09-29T17:01:33.7868992Z Progress (1): 2.3/2.7 MB
2026-09-29T17:01:33.7869193Z Progress (1): 2.3/2.7 MB
2026-09-29T17:01:33.7872124Z Progress (1): 2.3/2.7 MB
2026-09-29T17:01:33.7872406Z Progress (1): 2.4/2.7 MB
2026-09-29T17:01:33.7872626Z Progress (1): 2.4/2.7 MB
2026-09-29T17:01:33.7872815Z Progress (1): 2.4/2.7 MB
2026-09-29T17:01:33.7873337Z Progress (1): 2.4/2.7 MB
2026-09-29T17:01:33.7874979Z Progress (1): 2.5/2.7 MB
2026-09-29T17:01:33.7875273Z Progress (1): 2.5/2.7 MB
2026-09-29T17:01:33.7875649Z Progress (1): 2.5/2.7 MB
2026-09-29T17:01:33.7875886Z Progress (1): 2.5/2.7 MB
2026-09-29T17:01:33.7877532Z Progress (1): 2.6/2.7 MB
2026-09-29T17:01:33.7877716Z Progress (1): 2.6/2.7 MB
2026-09-29T17:01:33.7878241Z Progress (1): 2.6/2.7 MB
2026-09-29T17:01:33.7880686Z Progress (1): 2.6/2.7 MB
2026-09-29T17:01:33.7881441Z Progress (1): 2.7/2.7 MB
2026-09-29T17:01:33.7881738Z Progress (1): 2.7/2.7 MB
2026-09-29T17:01:33.9223832Z Progress (1): 2.7 MB    
2026-09-29T17:01:33.9224370Z                     
2026-09-29T17:01:33.9225536Z Uploaded to NEXUS_INTERNO: http://binario.caixa:8081/repository/caixa-raw-releases/angular/br/gov/caixa/sipbs-estatico/sipbs-estatico/3.26.0.6/sipbs-estatico-3.26.0.6.zip (2.7 MB at 9.1 MB/s)
2026-09-29T17:01:33.9228197Z Uploading to NEXUS_INTERNO: http://binario.caixa:8081/repository/caixa-raw-releases/angular/br/gov/caixa/sipbs-estatico/sipbs-estatico/3.26.0.6/sipbs-estatico-3.26.0.6.pom
2026-09-29T17:01:33.9858259Z Progress (1): 447 B
2026-09-29T17:01:33.9858831Z                    
2026-09-29T17:01:33.9860171Z Uploaded to NEXUS_INTERNO: http://binario.caixa:8081/repository/caixa-raw-releases/angular/br/gov/caixa/sipbs-estatico/sipbs-estatico/3.26.0.6/sipbs-estatico-3.26.0.6.pom (447 B at 7.1 kB/s)
2026-09-29T17:01:33.9901081Z Downloading from NEXUS_INTERNO: http://binario.caixa:8081/repository/caixa-raw-releases/angular/br/gov/caixa/sipbs-estatico/sipbs-estatico/maven-metadata.xml
2026-09-29T17:01:34.0089209Z Progress (1): 4.1/34 kB
2026-09-29T17:01:34.0091020Z Progress (1): 6.8/34 kB
2026-09-29T17:01:34.0092409Z Progress (1): 11/34 kB 
2026-09-29T17:01:34.0095559Z Progress (1): 15/34 kB
2026-09-29T17:01:34.0095870Z Progress (1): 19/34 kB
2026-09-29T17:01:34.0096667Z Progress (1): 23/34 kB
2026-09-29T17:01:34.0096924Z Progress (1): 27/34 kB
2026-09-29T17:01:34.0098688Z Progress (1): 31/34 kB
2026-09-29T17:01:34.0349889Z Progress (1): 34 kB   
2026-09-29T17:01:34.0350364Z                    
2026-09-29T17:01:34.0351811Z Downloaded from NEXUS_INTERNO: http://binario.caixa:8081/repository/caixa-raw-releases/angular/br/gov/caixa/sipbs-estatico/sipbs-estatico/maven-metadata.xml (34 kB at 715 kB/s)
2026-09-29T17:01:34.0532263Z Uploading to NEXUS_INTERNO: http://binario.caixa:8081/repository/caixa-raw-releases/angular/br/gov/caixa/sipbs-estatico/sipbs-estatico/maven-metadata.xml
2026-09-29T17:01:34.0554229Z Progress (1): 4.1/34 kB
2026-09-29T17:01:34.0554605Z Progress (1): 8.2/34 kB
2026-09-29T17:01:34.0554873Z Progress (1): 12/34 kB 
2026-09-29T17:01:34.0555132Z Progress (1): 16/34 kB
2026-09-29T17:01:34.0555540Z Progress (1): 20/34 kB
2026-09-29T17:01:34.0558703Z Progress (1): 25/34 kB
2026-09-29T17:01:34.0558993Z Progress (1): 29/34 kB
2026-09-29T17:01:34.0559495Z Progress (1): 33/34 kB
2026-09-29T17:01:34.1269745Z Progress (1): 34 kB   
2026-09-29T17:01:34.1270201Z                    
2026-09-29T17:01:34.1271920Z Uploaded to NEXUS_INTERNO: http://binario.caixa:8081/repository/caixa-raw-releases/angular/br/gov/caixa/sipbs-estatico/sipbs-estatico/maven-metadata.xml (34 kB at 443 kB/s)
2026-09-29T17:01:34.1277746Z [INFO] ------------------------------------------------------------------------
2026-09-29T17:01:34.1278196Z [INFO] BUILD SUCCESS
2026-09-29T17:01:34.1278745Z [INFO] ------------------------------------------------------------------------
2026-09-29T17:01:34.1290382Z [INFO] Total time:  1.018 s
2026-09-29T17:01:34.1293062Z [INFO] Finished at: 2026-09-29T14:01:34-03:00
2026-09-29T17:01:34.1293436Z [INFO] ------------------------------------------------------------------------
2026-09-29T17:01:34.1681897Z ##[section]Finishing: Publica no Nexus





tem como excluir esa tag no binario?

<img width="1876" height="910" alt="image" src="https://github.com/user-attachments/assets/159dd443-3143-4d10-b344-b287e0bc8227" />
