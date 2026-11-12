****



-sh-4.2$
-sh-4.2$
-sh-4.2$ oc get pods -n siinp-tqs | grep siinp-nucleo-tqs
siinp-nucleo-tqs-654-deploy                 0/1       Completed   0          6m7s
siinp-nucleo-tqs-654-fr4q8                  1/1       Running     0          6m3s
siinp-nucleo-tqs2-tqs-56-deploy             0/1       Completed   0          91d
siinp-nucleo-tqs2-tqs-57-bg6sj              1/1       Running     0          85d
siinp-nucleo-tqs2-tqs-57-deploy             0/1       Completed   0          85d
siinp-nucleo-tqs2-tqs-57-jzzjc              1/1       Running     0          85d
siinp-nucleo-tqs2-tqs-57-rlvfn              1/1       Running     0          85d
-sh-4.2$    oc exec <pod-novo> -n siinp-tqs -- ls -la /usr/src/app/secrets_files/SIINP_TQS/
-sh: pod-novo: Arquivo ou diretório não encontrado
-sh-4.2$    oc logs <pod-novo> -n siinp-tqs | grep -i "Failed to load config"
-sh: pod-novo: Arquivo ou diretório não encontrado
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$



deu bom subiu



<img width="1816" height="891" alt="image" src="https://github.com/user-attachments/assets/0262c180-0764-4e31-9005-bbb6516367a0" />


<img width="1574" height="611" alt="image" src="https://github.com/user-attachments/assets/55dbda5b-a3ed-46c5-bacc-a3f7f7825d6f" />
