

<img width="1878" height="842" alt="image" src="https://github.com/user-attachments/assets/f0aae219-53b7-4fbe-9e50-9613ccaf5e21" />

<img width="1874" height="861" alt="image" src="https://github.com/user-attachments/assets/522bc6bb-750e-4cf0-a023-27b586f33a84" />



-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc get pod -n sigsj-des -l name=sigsj-alvara-des -o wide
NAME                         READY     STATUS    RESTARTS   AGE       IP          NODE                       NOMINATED NODE   READINESS GATES
sigsj-alvara-des-669-bsj5j   1/1       Running   0          17h       25.1.25.3   ceadecldlx073.nprd.caixa   <none>           <none>
-sh-4.2$ oc logs sigsj-alvara-des-669-bsj5j -n sigsj-des | grep -i 'custom events emitidos' | tail -3
09:23:11 INFO  [id=] Monitoramento de alvaras AC concluido: 0/0 custom events emitidos
09:28:11 INFO  [id=] Monitoramento de alvaras AC concluido: 0/0 custom events emitidos
09:33:11 INFO  [id=] Monitoramento de alvaras AC concluido: 0/0 custom events emitidos
-sh-4.2$


