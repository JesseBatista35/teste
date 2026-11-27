
-sh-4.2$ oc get resourcequota quota-resources -n sidsc-des -o yaml
apiVersion: v1
kind: ResourceQuota
metadata:
  creationTimestamp: 2025-02-22T14:23:58Z
  name: quota-resources
  namespace: sidsc-des
  resourceVersion: "2348009197"
  uid: d55ade56-86c2-4419-b943-3d3ecd43a6b9
spec:
  hard:
    limits.cpu: "6"
    limits.memory: 4Gi
    pods: "10"
status:
  hard:
    limits.cpu: "6"
    limits.memory: 4Gi
    pods: "10"
  used:
    limits.cpu: 3262m
    limits.memory: 3840Mi
    pods: "5"
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc patch resourcequota quota-resources -n sidsc-des --type merge \
>   -p '{"spec":{"hard":{"limits.memory":"8Gi","limits.cpu":"8"}}}'
resourcequota/quota-resources patched
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc describe quota quota-resources -n sidsc-des
Name:          quota-resources
Namespace:     sidsc-des
Resource       Used    Hard
--------       ----    ----
limits.cpu     3262m   8
limits.memory  3840Mi  8Gi
pods           5       10
-sh-4.2$
