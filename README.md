You have access to 960 projects, the list has been suppressed. You can list all projects with 'oc projects'

Using project "build-images-ads".
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc project sicia-tqs
Now using project "sicia-tqs" on server "https://api.nprd.caixa:6443".
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ kubectl logs -n sicia-frontend-tqs-11-deploy
-sh: kubectl: comando não encontrado
-sh-4.2$ kubectl logs -n siscia-tqs  sicia-frontend-tqs-11-deploy
-sh: kubectl: comando não encontrado
-sh-4.2$ kubectl logs -n siscia-tqs sicia-frontend-tqs-11-deploy
-sh: kubectl: comando não encontrado
-sh-4.2$ kubectl describe pod -n siscia-tqs sicia-frontend-tqs-11-deploy
-sh: kubectl: comando não encontrado
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ kubectl get configmap -n sicia-tqs nginx-conf-d-sicia-frontend -o yaml
-sh: kubectl: comando não encontrado
-sh-4.2$ kubectl rollout undo -n sicia-tqs dc/sicia-frontend-tqs
-sh: kubectl: comando não encontrado
-sh-4.2$ kubectl patch dc sicia-frontend-tqs -n sicia-tqs -p \
>   '{"spec":{"strategy":{"rollingParams":{"timeoutSeconds":1800}}}}'
-sh: kubectl: comando não encontrado
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ kubectl rollout history -n sicia-tqs dc/sicia-frontend-tqs
-sh: kubectl: comando não encontrado
-sh-4.2$
-sh-4.2$
-sh-4.2$
