Prezados,

Estamos com erro na pipeline do projeto_SIGCB_Backend

##[warning]Git fetch failed with exit code 128, back off 1.845 seconds before retry.
git -c http.extraheader="AUTHORIZATION: bearer ***" -c http.sslVerify=false fetch --force --tags --prune --prune-tags --progress --no-recurse-submodules origin
fatal: unable to connect to devops.caixa:
devops.caixa[0: 10.122.142.80]: errno=Conexão recusada

##[error]Git fetch failed with exit code: 128

Att.



Starting: Checkout SIGCB-backend@develop to s
==============================================================================
Task         : Get sources
Description  : Get sources from a repository. Supports Git, TfsVC, and SVN repositories.
Version      : 1.0.0
Author       : Microsoft
Help         : [More Information](https://go.microsoft.com/fwlink/?LinkId=798199)
==============================================================================
Syncing repository: SIGCB-backend (Git)
git version
git version 2.22.1
git config --get remote.origin.url
git config gc.auto 0
git config --get-all http.https://devops.caixa/projetos/Caixa/_git/SIGCB-backend.extraheader
git config --get-all http.extraheader
git config --get-regexp .*extraheader
git config --get-all http.proxy
git config http.version HTTP/1.1
git -c http.extraheader="AUTHORIZATION: bearer ***" -c http.sslVerify=false fetch --force --tags --prune --prune-tags --progress --no-recurse-submodules origin
fatal: unable to connect to devops.caixa:
devops.caixa[0: 10.122.142.80]: errno=Conexão recusada

##[warning]Git fetch failed with exit code 128, back off 1.622 seconds before retry.
git -c http.extraheader="AUTHORIZATION: bearer ***" -c http.sslVerify=false fetch --force --tags --prune --prune-tags --progress --no-recurse-submodules origin
fatal: unable to connect to devops.caixa:
devops.caixa[0: 10.122.142.80]: errno=Conexão recusada

##[warning]Git fetch failed with exit code 128, back off 9.99 seconds before retry.
git -c http.extraheader="AUTHORIZATION: bearer ***" -c http.sslVerify=false fetch --force --tags --prune --prune-tags --progress --no-recurse-submodules origin
fatal: unable to connect to devops.caixa:
devops.caixa[0: 10.122.142.80]: errno=Conexão recusada

##[error]Git fetch failed with exit code: 128
Finishing: Checkout SIGCB-backend@develop to s




acabei de tenar rodar uma build e passou do cjekut


2026-08-21T17:59:26.6232012Z ##[section]Starting: Checkout SIGCB-backend@develop to s
2026-08-21T17:59:26.6382510Z ==============================================================================
2026-08-21T17:59:26.6382957Z Task         : Get sources
2026-08-21T17:59:26.6383227Z Description  : Get sources from a repository. Supports Git, TfsVC, and SVN repositories.
2026-08-21T17:59:26.6383363Z Version      : 1.0.0
2026-08-21T17:59:26.6383650Z Author       : Microsoft
2026-08-21T17:59:26.6383855Z Help         : [More Information](https://go.microsoft.com/fwlink/?LinkId=798199)
2026-08-21T17:59:26.6383963Z ==============================================================================
2026-08-21T17:59:27.0689025Z Syncing repository: SIGCB-backend (Git)
2026-08-21T17:59:27.0694150Z ##[command]git version
2026-08-21T17:59:27.1016098Z git version 2.22.1
2026-08-21T17:59:27.1065710Z ##[command]git config --get remote.origin.url
2026-08-21T17:59:27.1180732Z ##[command]git config gc.auto 0
2026-08-21T17:59:27.1225800Z ##[command]git config --get-all http.https://devops.caixa/projetos/Caixa/_git/SIGCB-backend.extraheader
2026-08-21T17:59:27.1249571Z ##[command]git config --get-all http.extraheader
2026-08-21T17:59:27.1283472Z ##[command]git config --get-regexp .*extraheader
2026-08-21T17:59:27.1304575Z ##[command]git config --get-all http.proxy
2026-08-21T17:59:27.1348465Z ##[command]git config http.version HTTP/1.1
2026-08-21T17:59:27.1469048Z ##[command]git -c http.extraheader="AUTHORIZATION: bearer ***" -c http.sslVerify=false fetch --force --tags --prune --prune-tags --progress --no-recurse-submodules origin
2026-08-21T17:59:27.8913472Z remote: Azure Repos        
2026-08-21T17:59:27.9049089Z remote: 
2026-08-21T17:59:27.9049441Z remote: Found 117 objects to send. (13 ms)        
2026-08-21T17:59:27.9093982Z 
2026-08-21T17:59:27.9094971Z                                                                                 
2026-08-21T17:59:27.9095205Z Receiving objects:   0% (1/117)
2026-08-21T17:59:27.9095283Z 
2026-08-21T17:59:27.9097095Z                                                                                 
2026-08-21T17:59:27.9105955Z Receiving objects:   1% (2/117)
2026-08-21T17:59:27.9106280Z 
2026-08-21T17:59:27.9106735Z                                                                                 
2026-08-21T17:59:27.9106895Z Receiving objects:   2% (3/117)
2026-08-21T17:59:27.9106963Z 
2026-08-21T17:59:27.9107090Z                                                                                 
2026-08-21T17:59:27.9107231Z Receiving objects:   3% (4/117)
2026-08-21T17:59:27.9107307Z 
2026-08-21T17:59:27.9107423Z                                                                                 
2026-08-21T17:59:27.9107562Z Receiving objects:   4% (5/117)
2026-08-21T17:59:27.9108046Z 
2026-08-21T17:59:27.9108501Z                                                                                 
2026-08-21T17:59:27.9108735Z Receiving objects:   5% (6/117)
2026-08-21T17:59:27.9109264Z 
2026-08-21T17:59:27.9109421Z                                                                                 
2026-08-21T17:59:27.9109557Z Receiving objects:   6% (8/117)
2026-08-21T17:59:27.9109608Z 
2026-08-21T17:59:27.9109719Z                                                                                 
2026-08-21T17:59:27.9113763Z Receiving objects:   7% (9/117)
2026-08-21T17:59:27.9114161Z 
2026-08-21T17:59:27.9114552Z                                                                                 
2026-08-21T17:59:27.9115253Z Receiving objects:   8% (10/117)
2026-08-21T17:59:27.9115394Z 
2026-08-21T17:59:27.9115507Z                                                                                 
2026-08-21T17:59:27.9115620Z Receiving objects:   9% (11/117)
2026-08-21T17:59:27.9115687Z 
2026-08-21T17:59:27.9115884Z                                                                                 
2026-08-21T17:59:27.9116173Z Receiving objects:  10% (12/117)
2026-08-21T17:59:27.9116254Z 
2026-08-21T17:59:27.9116361Z                                                                                 
2026-08-21T17:59:27.9120901Z Receiving objects:  11% (13/117)
2026-08-21T17:59:27.9124864Z 
2026-08-21T17:59:27.9127121Z                                                                                 
2026-08-21T17:59:27.9129140Z Receiving objects:  12% (15/117)
2026-08-21T17:59:27.9131208Z 
2026-08-21T17:59:27.9133096Z                                                                                 
2026-08-21T17:59:27.9134417Z Receiving objects:  13% (16/117)
2026-08-21T17:59:27.9134558Z 
2026-08-21T17:59:27.9134930Z                                                                                 
2026-08-21T17:59:27.9135368Z Receiving objects:  14% (17/117)
2026-08-21T17:59:27.9135708Z 
2026-08-21T17:59:27.9136108Z                                                                                 
2026-08-21T17:59:27.9136463Z Receiving objects:  15% (18/117)
2026-08-21T17:59:27.9136712Z 
2026-08-21T17:59:27.9137240Z                                                                                 
2026-08-21T17:59:27.9137648Z Receiving objects:  16% (19/117)
2026-08-21T17:59:27.9137945Z 
2026-08-21T17:59:27.9138345Z                                                                                 
2026-08-21T17:59:27.9138706Z Receiving objects:  17% (20/117)
2026-08-21T17:59:27.9139158Z 
2026-08-21T17:59:27.9139360Z                                                                                 
2026-08-21T17:59:27.9140215Z Receiving objects:  18% (22/117)
2026-08-21T17:59:27.9140646Z 
2026-08-21T17:59:27.9141235Z                                                                                 
2026-08-21T17:59:27.9141360Z Receiving objects:  19% (23/117)
2026-08-21T17:59:27.9141504Z 
2026-08-21T17:59:27.9142397Z                                                                                 
2026-08-21T17:59:27.9142616Z Receiving objects:  20% (24/117)
2026-08-21T17:59:27.9142792Z 
2026-08-21T17:59:27.9143176Z                                                                                 
2026-08-21T17:59:27.9143847Z Receiving objects:  21% (25/117)
2026-08-21T17:59:27.9143915Z 
2026-08-21T17:59:27.9144240Z                                                                                 
2026-08-21T17:59:27.9144648Z Receiving objects:  22% (26/117)
2026-08-21T17:59:27.9144797Z 
2026-08-21T17:59:27.9145250Z                                                                                 
2026-08-21T17:59:27.9145777Z Receiving objects:  23% (27/117)
2026-08-21T17:59:27.9145916Z 
2026-08-21T17:59:27.9146190Z                                                                                 
2026-08-21T17:59:27.9146384Z Receiving objects:  24% (29/117)
2026-08-21T17:59:27.9146440Z 
2026-08-21T17:59:27.9146543Z                                                                                 
2026-08-21T17:59:27.9147257Z Receiving objects:  25% (30/117)
2026-08-21T17:59:27.9147339Z 
2026-08-21T17:59:27.9148358Z                                                                                 
2026-08-21T17:59:27.9148730Z Receiving objects:  26% (31/117)
2026-08-21T17:59:27.9148813Z 
2026-08-21T17:59:27.9148902Z                                                                                 
2026-08-21T17:59:27.9149015Z Receiving objects:  27% (32/117)
2026-08-21T17:59:27.9149071Z 
2026-08-21T17:59:27.9149156Z                                                                                 
2026-08-21T17:59:27.9149268Z Receiving objects:  28% (33/117)
2026-08-21T17:59:27.9149323Z 
2026-08-21T17:59:27.9149409Z                                                                                 
2026-08-21T17:59:27.9149519Z Receiving objects:  29% (34/117)
2026-08-21T17:59:27.9149577Z 
2026-08-21T17:59:27.9149664Z                                                                                 
2026-08-21T17:59:27.9149772Z Receiving objects:  30% (36/117)
2026-08-21T17:59:27.9149826Z 
2026-08-21T17:59:27.9149917Z                                                                                 
2026-08-21T17:59:27.9150110Z Receiving objects:  31% (37/117)
2026-08-21T17:59:27.9150163Z 
2026-08-21T17:59:27.9150258Z                                                                                 
2026-08-21T17:59:27.9150367Z Receiving objects:  32% (38/117)
2026-08-21T17:59:27.9150421Z 
2026-08-21T17:59:27.9150504Z                                                                                 
2026-08-21T17:59:27.9150610Z Receiving objects:  33% (39/117)
2026-08-21T17:59:27.9150663Z 
2026-08-21T17:59:27.9150747Z                                                                                 
2026-08-21T17:59:27.9150851Z Receiving objects:  34% (40/117)
2026-08-21T17:59:27.9150904Z 
2026-08-21T17:59:27.9150985Z                                                                                 
2026-08-21T17:59:27.9151194Z Receiving objects:  35% (41/117)
2026-08-21T17:59:27.9151295Z 
2026-08-21T17:59:27.9151418Z                                                                                 
2026-08-21T17:59:27.9151567Z Receiving objects:  36% (43/117)
2026-08-21T17:59:27.9151645Z 
2026-08-21T17:59:27.9151780Z                                                                                 
2026-08-21T17:59:27.9151948Z Receiving objects:  37% (44/117)
2026-08-21T17:59:27.9152018Z 
2026-08-21T17:59:27.9152269Z                                                                                 
2026-08-21T17:59:27.9152430Z Receiving objects:  38% (45/117)
2026-08-21T17:59:27.9152500Z 
2026-08-21T17:59:27.9152617Z                                                                                 
2026-08-21T17:59:27.9152747Z Receiving objects:  39% (46/117)
2026-08-21T17:59:27.9152793Z 
2026-08-21T17:59:27.9152890Z                                                                                 
2026-08-21T17:59:27.9154690Z Receiving objects:  40% (47/117)
2026-08-21T17:59:27.9154816Z 
2026-08-21T17:59:27.9154993Z                                                                                 
2026-08-21T17:59:27.9155194Z Receiving objects:  41% (48/117)
2026-08-21T17:59:27.9155296Z 
2026-08-21T17:59:27.9155564Z                                                                                 
2026-08-21T17:59:27.9155770Z Receiving objects:  42% (50/117)
2026-08-21T17:59:27.9155856Z 
2026-08-21T17:59:27.9156020Z                                                                                 
2026-08-21T17:59:27.9156193Z Receiving objects:  43% (51/117)
2026-08-21T17:59:27.9156288Z 
2026-08-21T17:59:27.9156456Z                                                                                 
2026-08-21T17:59:27.9156631Z Receiving objects:  44% (52/117)
2026-08-21T17:59:27.9156722Z 
2026-08-21T17:59:27.9156886Z                                                                                 
2026-08-21T17:59:27.9157077Z Receiving objects:  45% (53/117)
2026-08-21T17:59:27.9157157Z 
2026-08-21T17:59:27.9157319Z                                                                                 
2026-08-21T17:59:27.9157711Z Receiving objects:  46% (54/117)
2026-08-21T17:59:27.9157810Z 
2026-08-21T17:59:27.9157973Z                                                                                 
2026-08-21T17:59:27.9158153Z Receiving objects:  47% (55/117)
2026-08-21T17:59:27.9158245Z 
2026-08-21T17:59:27.9158407Z                                                                                 
2026-08-21T17:59:27.9158598Z Receiving objects:  48% (57/117)
2026-08-21T17:59:27.9158678Z 
2026-08-21T17:59:27.9158857Z                                                                                 
2026-08-21T17:59:27.9159038Z Receiving objects:  49% (58/117)
2026-08-21T17:59:27.9159118Z 
2026-08-21T17:59:27.9159418Z                                                                                 
2026-08-21T17:59:27.9159593Z Receiving objects:  50% (59/117)
2026-08-21T17:59:27.9159760Z 
2026-08-21T17:59:27.9159949Z                                                                                 
2026-08-21T17:59:27.9160141Z Receiving objects:  51% (60/117)
2026-08-21T17:59:27.9160298Z 
2026-08-21T17:59:27.9160466Z                                                                                 
2026-08-21T17:59:27.9160649Z Receiving objects:  52% (61/117)
2026-08-21T17:59:27.9160732Z 
2026-08-21T17:59:27.9160895Z                                                                                 
2026-08-21T17:59:27.9161065Z Receiving objects:  53% (63/117)
2026-08-21T17:59:27.9161241Z 
2026-08-21T17:59:27.9161407Z                                                                                 
2026-08-21T17:59:27.9161578Z Receiving objects:  54% (64/117)
2026-08-21T17:59:27.9161670Z 
2026-08-21T17:59:27.9161829Z                                                                                 
2026-08-21T17:59:27.9161997Z Receiving objects:  55% (65/117)
2026-08-21T17:59:27.9162089Z 
2026-08-21T17:59:27.9162261Z                                                                                 
2026-08-21T17:59:27.9162430Z Receiving objects:  56% (66/117)
2026-08-21T17:59:27.9162522Z 
2026-08-21T17:59:27.9162686Z                                                                                 
2026-08-21T17:59:27.9162853Z Receiving objects:  57% (67/117)
2026-08-21T17:59:27.9162943Z 
2026-08-21T17:59:27.9163102Z                                                                                 
2026-08-21T17:59:27.9163270Z Receiving objects:  58% (68/117)
2026-08-21T17:59:27.9163493Z 
2026-08-21T17:59:27.9163664Z                                                                                 
2026-08-21T17:59:27.9163833Z Receiving objects:  59% (70/117)
2026-08-21T17:59:27.9163927Z 
2026-08-21T17:59:27.9164089Z                                                                                 
2026-08-21T17:59:27.9164357Z Receiving objects:  60% (71/117)
2026-08-21T17:59:27.9164483Z 
2026-08-21T17:59:27.9164632Z                                                                                 
2026-08-21T17:59:27.9164759Z Receiving objects:  61% (72/117)
2026-08-21T17:59:27.9164810Z 
2026-08-21T17:59:27.9164922Z                                                                                 
2026-08-21T17:59:27.9165069Z Receiving objects:  62% (73/117)
2026-08-21T17:59:27.9165121Z 
2026-08-21T17:59:27.9165247Z                                                                                 
2026-08-21T17:59:27.9165368Z Receiving objects:  63% (74/117)
2026-08-21T17:59:27.9165418Z 
2026-08-21T17:59:27.9165526Z                                                                                 
2026-08-21T17:59:27.9165646Z Receiving objects:  64% (75/117)
2026-08-21T17:59:27.9165697Z 
2026-08-21T17:59:27.9165807Z                                                                                 
2026-08-21T17:59:27.9165929Z Receiving objects:  65% (77/117)
2026-08-21T17:59:27.9165980Z 
2026-08-21T17:59:27.9166087Z                                                                                 
2026-08-21T17:59:27.9166275Z Receiving objects:  66% (78/117)
2026-08-21T17:59:27.9166328Z 
2026-08-21T17:59:27.9166440Z                                                                                 
2026-08-21T17:59:27.9166562Z Receiving objects:  67% (79/117)
2026-08-21T17:59:27.9166613Z 
2026-08-21T17:59:27.9166720Z                                                                                 
2026-08-21T17:59:27.9166864Z Receiving objects:  68% (80/117)
2026-08-21T17:59:27.9166919Z 
2026-08-21T17:59:27.9167026Z                                                                                 
2026-08-21T17:59:27.9167146Z Receiving objects:  69% (81/117)
2026-08-21T17:59:27.9167196Z 
2026-08-21T17:59:27.9167305Z                                                                                 
2026-08-21T17:59:27.9167426Z Receiving objects:  70% (82/117)
2026-08-21T17:59:27.9167477Z 
2026-08-21T17:59:27.9167585Z                                                                                 
2026-08-21T17:59:27.9167705Z Receiving objects:  71% (84/117)
2026-08-21T17:59:27.9167758Z 
2026-08-21T17:59:27.9167863Z                                                                                 
2026-08-21T17:59:27.9168045Z Receiving objects:  72% (85/117)
2026-08-21T17:59:27.9168096Z 
2026-08-21T17:59:27.9168208Z                                                                                 
2026-08-21T17:59:27.9168330Z Receiving objects:  73% (86/117)
2026-08-21T17:59:27.9168380Z 
2026-08-21T17:59:27.9168666Z                                                                                 
2026-08-21T17:59:27.9168795Z Receiving objects:  74% (87/117)
2026-08-21T17:59:27.9168916Z 
2026-08-21T17:59:27.9169041Z                                                                                 
2026-08-21T17:59:27.9169163Z Receiving objects:  75% (88/117)
2026-08-21T17:59:27.9169214Z 
2026-08-21T17:59:27.9169346Z                                                                                 
2026-08-21T17:59:27.9169473Z Receiving objects:  76% (89/117)
2026-08-21T17:59:27.9169531Z 
2026-08-21T17:59:27.9169643Z                                                                                 
2026-08-21T17:59:27.9169769Z Receiving objects:  77% (91/117)
2026-08-21T17:59:27.9169822Z 
2026-08-21T17:59:27.9169932Z                                                                                 
2026-08-21T17:59:27.9170055Z Receiving objects:  78% (92/117)
2026-08-21T17:59:27.9170107Z 
2026-08-21T17:59:27.9170220Z                                                                                 
2026-08-21T17:59:27.9170346Z Receiving objects:  79% (93/117)
2026-08-21T17:59:27.9170398Z 
2026-08-21T17:59:27.9170510Z                                                                                 
2026-08-21T17:59:27.9170634Z Receiving objects:  80% (94/117)
2026-08-21T17:59:27.9170686Z 
2026-08-21T17:59:27.9170799Z                                                                                 
2026-08-21T17:59:27.9170924Z Receiving objects:  81% (95/117)
2026-08-21T17:59:27.9170980Z 
2026-08-21T17:59:27.9171159Z                                                                                 
2026-08-21T17:59:27.9171300Z Receiving objects:  82% (96/117)
2026-08-21T17:59:27.9171353Z 
2026-08-21T17:59:27.9171463Z                                                                                 
2026-08-21T17:59:27.9171586Z Receiving objects:  83% (98/117)
2026-08-21T17:59:27.9171638Z 
2026-08-21T17:59:27.9171750Z                                                                                 
2026-08-21T17:59:27.9171882Z Receiving objects:  84% (99/117)
2026-08-21T17:59:27.9171934Z 
2026-08-21T17:59:27.9172047Z                                                                                 
2026-08-21T17:59:27.9172172Z Receiving objects:  85% (100/117)
2026-08-21T17:59:27.9172228Z 
2026-08-21T17:59:27.9172338Z                                                                                 
2026-08-21T17:59:27.9172645Z Receiving objects:  86% (101/117)
2026-08-21T17:59:27.9172889Z 
2026-08-21T17:59:27.9173017Z                                                                                 
2026-08-21T17:59:27.9173151Z Receiving objects:  87% (102/117)
2026-08-21T17:59:27.9173207Z 
2026-08-21T17:59:27.9173320Z                                                                                 
2026-08-21T17:59:27.9173446Z Receiving objects:  88% (103/117)
2026-08-21T17:59:27.9173498Z 
2026-08-21T17:59:27.9173612Z                                                                                 
2026-08-21T17:59:27.9173757Z Receiving objects:  89% (105/117)
2026-08-21T17:59:27.9173808Z 
2026-08-21T17:59:27.9173919Z                                                                                 
2026-08-21T17:59:27.9174042Z Receiving objects:  90% (106/117)
2026-08-21T17:59:27.9174093Z 
2026-08-21T17:59:27.9174203Z                                                                                 
2026-08-21T17:59:27.9174347Z Receiving objects:  91% (107/117)
2026-08-21T17:59:27.9174532Z 
2026-08-21T17:59:27.9174653Z                                                                                 
2026-08-21T17:59:27.9174845Z Receiving objects:  92% (108/117)
2026-08-21T17:59:27.9174898Z 
2026-08-21T17:59:27.9175007Z                                                                                 
2026-08-21T17:59:27.9175138Z Receiving objects:  93% (109/117)
2026-08-21T17:59:27.9175189Z 
2026-08-21T17:59:27.9175298Z                                                                                 
2026-08-21T17:59:27.9175593Z Receiving objects:  94% (110/117)
2026-08-21T17:59:27.9175649Z 
2026-08-21T17:59:27.9175765Z                                                                                 
2026-08-21T17:59:27.9175889Z Receiving objects:  95% (112/117)
2026-08-21T17:59:27.9175941Z 
2026-08-21T17:59:27.9176054Z                                                                                 
2026-08-21T17:59:27.9176175Z Receiving objects:  96% (113/117)
2026-08-21T17:59:27.9176231Z 
2026-08-21T17:59:27.9176343Z                                                                                 
2026-08-21T17:59:27.9176468Z Receiving objects:  97% (114/117)
2026-08-21T17:59:27.9176520Z 
2026-08-21T17:59:27.9176629Z                                                                                 
2026-08-21T17:59:27.9176753Z Receiving objects:  98% (115/117)
2026-08-21T17:59:27.9176803Z 
2026-08-21T17:59:27.9176913Z                                                                                 
2026-08-21T17:59:27.9177034Z Receiving objects:  99% (116/117)
2026-08-21T17:59:27.9177084Z 
2026-08-21T17:59:27.9177193Z                                                                                 
2026-08-21T17:59:27.9177314Z Receiving objects: 100% (117/117)
2026-08-21T17:59:27.9177365Z 
2026-08-21T17:59:27.9177474Z                                                                                 
2026-08-21T17:59:27.9177618Z Receiving objects: 100% (117/117), 27.87 KiB | 27.87 MiB/s, done.
2026-08-21T17:59:27.9177695Z 
2026-08-21T17:59:27.9177805Z                                                                                 
2026-08-21T17:59:27.9177931Z Resolving deltas:   0% (0/43)
2026-08-21T17:59:27.9177984Z 
2026-08-21T17:59:27.9178094Z                                                                                 
2026-08-21T17:59:27.9178217Z Resolving deltas:   2% (1/43)
2026-08-21T17:59:27.9178271Z 
2026-08-21T17:59:27.9178549Z                                                                                 
2026-08-21T17:59:27.9178954Z Resolving deltas:   9% (4/43)
2026-08-21T17:59:27.9179017Z 
2026-08-21T17:59:27.9179138Z                                                                                 
2026-08-21T17:59:27.9179264Z Resolving deltas:  16% (7/43)
2026-08-21T17:59:27.9179318Z 
2026-08-21T17:59:27.9179430Z                                                                                 
2026-08-21T17:59:27.9179552Z Resolving deltas:  20% (9/43)
2026-08-21T17:59:27.9179632Z 
2026-08-21T17:59:27.9179815Z                                                                                 
2026-08-21T17:59:27.9179954Z Resolving deltas:  23% (10/43)
2026-08-21T17:59:27.9180009Z 
2026-08-21T17:59:27.9180124Z                                                                                 
2026-08-21T17:59:27.9180249Z Resolving deltas:  27% (12/43)
2026-08-21T17:59:27.9180302Z 
2026-08-21T17:59:27.9180413Z                                                                                 
2026-08-21T17:59:27.9180538Z Resolving deltas:  32% (14/43)
2026-08-21T17:59:27.9180590Z 
2026-08-21T17:59:27.9180698Z                                                                                 
2026-08-21T17:59:27.9180820Z Resolving deltas:  44% (19/43)
2026-08-21T17:59:27.9180872Z 
2026-08-21T17:59:27.9180978Z                                                                                 
2026-08-21T17:59:27.9181160Z Resolving deltas:  55% (24/43)
2026-08-21T17:59:27.9181219Z 
2026-08-21T17:59:27.9181338Z                                                                                 
2026-08-21T17:59:27.9181510Z Resolving deltas:  67% (29/43)
2026-08-21T17:59:27.9181572Z 
2026-08-21T17:59:27.9181682Z                                                                                 
2026-08-21T17:59:27.9181795Z Resolving deltas:  79% (34/43)
2026-08-21T17:59:27.9181875Z 
2026-08-21T17:59:27.9182034Z                                                                                 
2026-08-21T17:59:27.9182179Z Resolving deltas:  90% (39/43)
2026-08-21T17:59:27.9182266Z 
2026-08-21T17:59:27.9182403Z                                                                                 
2026-08-21T17:59:27.9182515Z Resolving deltas:  93% (40/43)
2026-08-21T17:59:27.9182574Z 
2026-08-21T17:59:27.9182680Z                                                                                 
2026-08-21T17:59:27.9182790Z Resolving deltas:  95% (41/43)
2026-08-21T17:59:27.9182854Z 
2026-08-21T17:59:27.9182961Z                                                                                 
2026-08-21T17:59:27.9183091Z Resolving deltas:  97% (42/43)
2026-08-21T17:59:27.9183144Z 
2026-08-21T17:59:27.9183256Z                                                                                 
2026-08-21T17:59:27.9183373Z Resolving deltas: 100% (43/43)
2026-08-21T17:59:27.9183424Z 
2026-08-21T17:59:27.9183532Z                                                                                 
2026-08-21T17:59:27.9183669Z Resolving deltas: 100% (43/43), completed with 15 local objects.
2026-08-21T17:59:27.9791928Z From https://devops.caixa/projetos/Caixa/_git/SIGCB-backend
2026-08-21T17:59:27.9802931Z    f4441cf1b..d6aa869d9  003/sprint3/STRY00036934-consulta-banco-pagadores -> origin/003/sprint3/STRY00036934-consulta-banco-pagadores
2026-08-21T17:59:27.9803370Z    1497b0e3f..4c63cb08a  003/sprint3/STRY00067741-Codigo-Erro-Cip-Detalhe-Titulo -> origin/003/sprint3/STRY00067741-Codigo-Erro-Cip-Detalhe-Titulo
2026-08-21T17:59:27.9832297Z    bc7b655b0..0a64eadab  develop                 -> origin/develop
2026-08-21T17:59:27.9846474Z  * [new branch]          feat-develop-appl-props -> origin/feat-develop-appl-props
2026-08-21T17:59:27.9849872Z  * [new tag]             1.00.4.13               -> 1.00.4.13
2026-08-21T17:59:27.9852921Z  * [new tag]             1.00.4.14               -> 1.00.4.14
2026-08-21T17:59:28.0291070Z ##[command]git -c http.extraheader="AUTHORIZATION: bearer ***" -c http.sslVerify=false fetch --force --tags --prune --prune-tags --progress --no-recurse-submodules origin  +0a64eadabff8de8b9909fe4a3079fe61f26259db
2026-08-21T17:59:28.1573633Z From https://devops.caixa/projetos/Caixa/_git/SIGCB-backend
2026-08-21T17:59:28.1574159Z  * branch                0a64eadabff8de8b9909fe4a3079fe61f26259db -> FETCH_HEAD
2026-08-21T17:59:28.2033082Z ##[command]git checkout --progress --force 0a64eadabff8de8b9909fe4a3079fe61f26259db
2026-08-21T17:59:28.2900514Z Previous HEAD position was bc7b655b0 fix-lista-hist-simulacao-do-cedente
2026-08-21T17:59:28.2907214Z HEAD is now at 0a64eadab feat-develop-appl-props-arquetura
2026-08-21T17:59:28.3029959Z ##[section]Finishing: Checkout SIGCB-backend@develop to s
