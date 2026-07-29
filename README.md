oc get deployment sispl-processamento-sumarizacao-des -n sispl-des -o yaml | grep -A 15 livenessProbe

oc adm top pod -n sispl-des | grep sispl-processamento-sumarizacao

