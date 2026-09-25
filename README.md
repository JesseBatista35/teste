

Did you mean this?
        project

Run 'oc --help' for usage.
-sh-4.2$ oc project sijur-des
Now using project "sijur-des" on server "https://api.nprd.caixa:6443".
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc get pods
NAME                                               READY     STATUS             RESTARTS        AGE
sijur-ajuizamento-backend-des-15-deploy            0/1       Completed          0               7d
sijur-ajuizamento-backend-des-16-4phw6             1/1       Running            0               2d
sijur-ajuizamento-backend-des-16-deploy            0/1       Completed          0               2d
sijur-api-expediente-des-476-deploy                0/1       Completed          0               8d
sijur-api-expediente-des-477-deploy                0/1       Completed          0               6d19h
sijur-api-expediente-des-477-t5cm9                 1/1       Running            0               6d19h
sijur-api-expediente-partner-des-12-deploy         0/1       Completed          0               76d
sijur-api-expediente-partner-des-13-deploy         0/1       Completed          0               76d
sijur-api-expediente-partner-des-13-vf2jw          1/1       Running            0               76d
sijur-middleware-backend-des-761-deploy            0/1       Completed          0               7d
sijur-middleware-backend-des-762-5rhw5             1/1       Running            0               42h
sijur-middleware-backend-des-762-deploy            0/1       Completed          0               42h
sijur-middleware-backend-v2-des-30-deploy          0/1       Completed          0               44h
sijur-middleware-backend-v2-des-31-deploy          0/1       Completed          0               18h
sijur-middleware-backend-v2-des-31-q5g4q           1/1       Running            0               18h
sijur-middleware-backend-v2-des-33-deploy          0/1       Error              0               17h
sijur-middleware-backend-v2-des-34-deploy          0/1       Error              0               3h16m
sijur-middleware-backend-v2-des-35-bcrxs           0/1       CrashLoopBackOff   6 (21s ago)     7m43s
sijur-middleware-backend-v2-des-35-deploy          1/1       Running            0               7m48s
sijur-middleware-frontend-des-508-deploy           0/1       Completed          0               42h
sijur-middleware-frontend-des-509-6x8ds            2/2       Running            1 (3h22m ago)   3h22m
sijur-middleware-frontend-des-509-deploy           0/1       Completed          0               3h22m
sijur-middleware-frontend-internet-des-47-deploy   0/1       Completed          0               2d1h
sijur-middleware-frontend-internet-des-48-deploy   0/1       Completed          0               47h
sijur-middleware-frontend-internet-des-48-zvv9z    2/2       Running            0               47h
sijur-middleware-frontend-v2-des-68-deploy         0/1       Completed          0               10d
sijur-middleware-frontend-v2-des-69-6mkp6          2/2       Running            0               9d
sijur-middleware-frontend-v2-des-69-deploy         0/1       Completed          0               9d
sijur-publicacoes-backend-des-320-deploy           0/1       Completed          0               44h
sijur-publicacoes-backend-des-321-deploy           0/1       Completed          0               23m
sijur-publicacoes-backend-des-321-q9x98            1/1       Running            0               23m
sijur-publicacoes-frontend-des-255-deploy          0/1       Completed          0               2d19h
sijur-publicacoes-frontend-des-256-deploy          0/1       Completed          0               44h
sijur-publicacoes-frontend-des-256-qdnc4           2/2       Running            2 (44h ago)     44h
sijur-shell-frontend-des-2-deploy                  0/1       Completed          0               3d8h
sijur-shell-frontend-des-3-c25c8                   2/2       Running            1 (3d8h ago)    3d8h
sijur-shell-frontend-des-3-deploy                  0/1       Completed          0               3d8h
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ javap -v -cp <lib-componentes>.jar br.com.sijur.componentes.model.Log | grep -i persistence/Entity
-sh: lib-componentes: Arquivo ou diretório não encontrado
-sh-4.2$
-sh-4.2$
-sh-4.2$
