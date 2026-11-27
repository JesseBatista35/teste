
-sh-4.2$ oc get events -n sidsc-des --sort-by=.lastTimestamp | tail -10
No resources found.
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc project sidsc-des
Now using project "sidsc-des" on server "https://api.nprd.caixa:6443".
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc get events -n sidsc-des --sort-by=.lastTimestamp | tail -10
No resources found.
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc get pods
NAME                                READY     STATUS      RESTARTS   AGE
sidsc-portal-des-8-fnbpr            2/2       Running     0          471d
sidsc-portal-v16-des-50-deploy      0/1       Completed   0          59d
sidsc-portal-v16-des-51-deploy      0/1       Completed   0          21d
sidsc-portal-v16-des-51-zzgn6       2/2       Running     0          21d
sidsc-react-des-69-deploy           0/1       Completed   0          315d
sidsc-react-des-70-deploy           0/1       Completed   0          272d
sidsc-react-des-70-w62t5            2/2       Running     0          272d
sidsc-storybook-v19-des-78-deploy   0/1       Completed   0          14d
sidsc-storybook-v19-des-79-deploy   0/1       Completed   0          13d
sidsc-storybook-v20-des-2-deploy    0/1       Completed   0          5h12m
sidsc-storybook-v20-des-2-kfcmq     2/2       Running     0          5h12m
sidsc-storybook-v20-des-3-deploy    0/1       Error       0          5h8m
sidsc-storybook-v20-des-4-deploy    0/1       Error       0          4h49m
sidsc-storybook-v22-des-1-deploy    0/1       Completed   0          5h30m
sidsc-storybook-v22-des-1-qpbbw     2/2       Running     0          5h30m
-sh-4.2$
-sh-4.2$
-sh-4.2$
