
-sh-4.2$ oc rsh firefox-3-rwpfb -n selenium-grid
ERRO[0000] exec failed: unable to start container process: exec: "-n": executable file not found in $PATH
command terminated with exit code 255
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc rsh firefox-3-rwpfb
$ oc rsh -n selenium-grid firefox-3-rwpfb
/bin/sh: 1: oc: not found
$ cul^Htl^H^H^H^H^[[2~^H^H^H^H^H^H^H^H
/bin: not foundl
$ curl -v --max-time 15 https://cdn.perfdrive.com/
*   Trying 130.211.29.114:443...
* Connection timed out after 15001 milliseconds
* Closing connection 0
curl: (28) Connection timed out after 15001 milliseconds
$ -sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc get netnamespace selenium-grid -o yaml
apiVersion: network.openshift.io/v1
egressIPs:
- 10.121.104.113
kind: NetNamespace
metadata:
  creationTimestamp: 2024-03-13T00:05:42Z
  generation: 2
  managedFields:
  - apiVersion: network.openshift.io/v1
    fieldsType: FieldsV1
    fieldsV1:
      f:netid: {}
      f:netname: {}
    manager: Go-http-client
    operation: Update
    time: 2024-03-13T00:05:42Z
  - apiVersion: network.openshift.io/v1
    fieldsType: FieldsV1
    fieldsV1:
      f:egressIPs: {}
    manager: kubectl-patch
    operation: Update
    time: 2024-03-25T20:11:07Z
  name: selenium-grid
  resourceVersion: "251974098"
  uid: 510f2287-40e8-45e4-91a7-86296dda83d6
netid: 15032641
netname: selenium-grid
-sh-4.2$
