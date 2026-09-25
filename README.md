
-sh-4.2$ oc cp sijur-des/sijur-middleware-backend-v2-des-35-debug:/deployments/SIJUR-middleware-backend-v2.jar ./sijur-v2-35.jar
tar: Removing leading `/' from member names
-sh-4.2$ ls -lh sijur-v2-35.jar
-rw-r--r-- 1 p585600 usucef 87M Set 25 11:39 sijur-v2-35.jar
-sh-4.2$ unzip -l sijur-v2-35.jar | grep -i -E 'componentes|model/Log.class'
   321288  09-11-2026 08:57   BOOT-INF/lib/SIJUR-componentes-1.0.25-SNAPSHOT.jar
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc delete pod sijur-middleware-backend-v2-des-35-debug -n sijur-des
pod "sijur-middleware-backend-v2-des-35-debug" deleted

