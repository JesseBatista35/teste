
-sh-4.2$ oc debug dc/sifug-siofg-api-des -n sifug-des --keep-init-containers=false -c sifug-siofg-api-des -- /bin/sh -c 'echo "=== file-system source ==="; ls -1 /deployments/lib/main/ | grep -i "config-source-file-system"; echo "=== smallrye-config core ==="; ls -1 /deployments/lib/main/ | grep -i "smallrye-config" | grep -iv "source-file"'
Debugging with pod/sifug-siofg-api-des-debug, original command: <image entrypoint>
Waiting for pod to start ...
=== file-system source ===
io.smallrye.config.smallrye-config-source-file-system-2.4.2.jar
=== smallrye-config core ===
io.smallrye.config.smallrye-config-2.4.4.jar
io.smallrye.config.smallrye-config-common-2.4.4.jar
io.smallrye.config.smallrye-config-core-2.4.4.jar
io.smallrye.config.smallrye-config-validator-2.4.4.jar

Removing debug pod ...
-sh-4.2$ oc get pods -n sifug-des | grep siofg-api-des
sifug-siofg-api-des-213-deploy              0/1       Completed          0                32d
sifug-siofg-api-des-214-deploy              0/1       Completed          0                19d
sifug-siofg-api-des-214-jlkmq               1/1       Running            0                19d
sifug-siofg-api-des-214-wcbk4               1/1       Running            0                19d
sifug-siofg-api-des-258-tl8hd-debug-9m2lt   1/1       Running            0                3d15h
sifug-siofg-api-des-271-deploy              0/1       Error              0                49m
sifug-siofg-api-des-272-deploy              1/1       Running            0                82s
sifug-siofg-api-des-272-f5rvw               0/1       CrashLoopBackOff   3 (20s ago)      79s
-sh-4.2$
