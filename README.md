oc cp sijur-des/sijur-middleware-backend-v2-des-35-debug:/deployments/SIJUR-middleware-backend-v2.jar ./sijur-v2-35.jar
ls -lh sijur-v2-35.jar
unzip -l sijur-v2-35.jar | grep -i -E 'componentes|model/Log.class'

oc delete pod sijur-middleware-backend-v2-des-35-debug -n sijur-des
