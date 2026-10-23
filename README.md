
-sh-4.2$
-sh-4.2$ oc logs sicow-penhor-okd-des-61-m19pq -n sicow-des --since=5m | grep -E "ERROR|SEVERE|Exception|veio sem valor|scowdb01" | head -40
Error from server (NotFound): pods "sicow-penhor-okd-des-61-m19pq" not found
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc get pods
NAME                                        READY     STATUS              RESTARTS          AGE
sicow-conres-job-des-10-deploy              0/1       Completed           0                 168d
sicow-conres-job-des-11-deploy              0/1       Completed           0                 148d
sicow-conres-job-des-11-k4q6m               1/1       Running             139 (3d16h ago)   148d
sicow-conres-okd-des-25-deploy              0/1       Completed           0                 6d19h
sicow-conres-okd-des-26-deploy              0/1       Completed           0                 6d19h
sicow-conres-okd-des-26-j9l2h               1/1       Running             0                 6d19h
sicow-imp-job-des-39-deploy                 0/1       Completed           0                 171d
sicow-imp-job-des-40-4vrwb                  1/1       Running             0                 121d
sicow-imp-job-des-40-deploy                 0/1       Completed           0                 121d
sicow-imp-okd-des-34-deploy                 0/1       Completed           0                 26d
sicow-imp-okd-des-35-d9bwb                  0/1       ContainerCreating   0                 15d
sicow-imp-okd-des-35-deploy                 0/1       Completed           0                 16d
sicow-lg-job-des-10-deploy                  0/1       Completed           0                 109d
sicow-lg-job-des-10-rjlg7                   1/1       Running             2                 109d
sicow-lg-job-des-9-deploy                   0/1       Completed           0                 119d
sicow-lg-okd-des-40-695zp                   1/1       Running             0                 9d
sicow-lg-okd-des-40-deploy                  0/1       Completed           0                 9d
sicow-mte-job-des-15-deploy                 0/1       Completed           0                 115d
sicow-mte-job-des-16-deploy                 0/1       Completed           0                 114d
sicow-mte-job-des-16-k7q8f                  1/1       Running             0                 114d
sicow-mte-okd-des-47-deploy                 0/1       Completed           0                 8d
sicow-mte-okd-des-47-f58c5                  1/1       Running             0                 8d
sicow-nia-job-des-6-deploy                  0/1       Completed           0                 168d
sicow-nia-job-des-7-deploy                  0/1       Completed           0                 106d
sicow-nia-job-des-7-x4vn8                   0/1       ContainerCreating   0                 100d
sicow-nia-okd-des-30-52p5v                  1/1       Running             0                 15d
sicow-nia-okd-des-30-deploy                 0/1       Completed           0                 15d
sicow-penhor-okd-des-56-hxsk7-debug-8xldx   1/1       Running             0                 24h
sicow-penhor-okd-des-60-deploy              0/1       Completed           0                 29m
sicow-penhor-okd-des-61-deploy              0/1       Completed           0                 8m22s
sicow-penhor-okd-des-61-ml9pq               1/1       Running             0                 8m18s
sicow-portal-job-des-23-7rzk7               1/1       Running             0                 121d
sicow-portal-job-des-23-deploy              0/1       Completed           0                 121d
sicow-portal-okd-des-197-deploy             0/1       Completed           0                 9d
sicow-portal-okd-des-197-nzdl5              1/1       Running             0                 9d
sicow-seg-job-des-12-deploy                 0/1       Completed           0                 168d
sicow-seg-job-des-13-cgpbj                  1/1       Running             0                 113d
sicow-seg-job-des-13-deploy                 0/1       Completed           0                 113d
sicow-seg-okd-des-24-deploy                 0/1       Completed           0                 107d
sicow-seg-okd-des-25-deploy                 0/1       Completed           0                 107d
sicow-seg-okd-des-25-ntfcc                  1/1       Running             0                 107d
-sh-4.2$
-sh-4.2$
