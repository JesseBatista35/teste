
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ telnet nfsctcnprd.ctc.caixa 2049
Trying 192.168.224.100...
nc -zv nfsctcnprd.ctc.caixa 2049
^C
-sh-4.2$ nc -zv nfsctcnprd.ctc.caixa 2049
Ncat: Version 7.50 ( https://nmap.org/ncat )
Ncat: Connection timed out.
-sh-4.2$ oc get events -n siinp-des --sort-by='.lastTimestamp' | tail -30
F0914 15:20:30.970268   36850 sorter.go:306] Field {.lastTimestamp} in *unstructured.Unstructured is an unsortable type: interface, err: unsortable interface: interface
-sh-4.2$ oc get nodes ceadecldlx081.nprd.caixa -o yaml | grep -A10 conditions
        f:conditions:
          k:{"type":"DiskPressure"}:
            f:lastHeartbeatTime: {}
            f:lastTransitionTime: {}
            f:message: {}
            f:reason: {}
            f:status: {}
          k:{"type":"MemoryPressure"}:
            f:lastHeartbeatTime: {}
            f:lastTransitionTime: {}
            f:message: {}
--
  conditions:
  - lastHeartbeatTime: 2026-09-14T18:20:29Z
    lastTransitionTime: 2025-07-21T17:30:48Z
    message: kubelet has sufficient memory available
    reason: KubeletHasSufficientMemory
    status: "False"
    type: MemoryPressure
  - lastHeartbeatTime: 2026-09-14T18:20:29Z
    lastTransitionTime: 2026-02-13T11:11:28Z
    message: kubelet has no disk pressure
    reason: KubeletHasNoDiskPressure
-sh-4.2$ oc delete pod siinp-nucleo-des-293-dhxbs -n siinp-des
Error from server (NotFound): pods "siinp-nucleo-des-293-dhxbs" not found
-sh-4.2$ oc get pods -n siinp-des -l deploymentconfig=siinp-nucleo-des -o wide -w
NAME                         READY     STATUS    RESTARTS   AGE       IP            NODE                       NOMINATED NODE
siinp-nucleo-des-291-4vtrx   1/1       Running   0          4h        25.3.36.161   ceadecldlx079.nprd.caixa   <none>
siinp-nucleo-des-291-c55mr   1/1       Running   0          4h        25.2.32.145   ceadecldlx068.nprd.caixa   <none>
siinp-nucleo-des-291-rvnkb   1/1       Running   0          4h        25.0.37.7     ceadecldlx076.nprd.caixa   <none>

