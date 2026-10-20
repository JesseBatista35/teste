<img width="548" height="908" alt="image" src="https://github.com/user-attachments/assets/f15dbc08-3e35-4469-9a8d-af010a60f27b" />


Home logo
Home
Catalogo
Self-service
APIs
Aprendizado
Meu grupo
Notifications
1
RBAC
Adoption Insights
Extensions
component — service

sisph-bff-jnd-baixa-garantia
Owner

G_AZ_BOX_BPNNM

Lifecycle

estavel

🚪 Sair




Error Reporting
aks-hab-des	sisph-bff-jnd-baixa-garantia	Deployment	sisph-bff-jnd-baixa-garantia-tst	Deployment does not have minimum availability.
aks-hab-des	sisph-bff-jnd-baixa-garantia	Deployment	sisph-bff-jnd-baixa-garantia-tst	ReplicaSet "sisph-bff-jnd-baixa-garantia-tst-9cf98b4dd" has timed out progressing.
aks-hab-des	sisph-bff-jnd-baixa-garantia	Pod	sisph-bff-jnd-baixa-garantia-des-56fb5579c8-lgd8v	container=sisph-bff-jnd-baixa-garantia-des restarted 36 times
5
table.pagination.labelDisplayedRows
Your Clusters


Running	
OK
1/1	36	
unknown

unknown

5
table.pagination.labelDisplayedRows














sisph-bff-jnd-baixa-garantia-des-56fb5579c8-lgd8v
Pod (192.168.139.15)
YAML
Managed Fields
metadata:
  name: sisph-bff-jnd-baixa-garantia-des-56fb5579c8-lgd8v
  generateName: sisph-bff-jnd-baixa-garantia-des-56fb5579c8-
  namespace: sisph-bff-jnd-baixa-garantia
  uid: 7df703dc-3851-49d5-96dd-986392f4a9f8
  resourceVersion: '337311479'
  generation: 1
  creationTimestamp: '2026-10-20T11:20:55Z'
  labels:
    app.kubernetes.io/app: sisph-bff-jnd-baixa-garantia-des
    app.kubernetes.io/instance: sisph-bff-jnd-baixa-garantia-des
    app.kubernetes.io/managed-by: Helm
    app.kubernetes.io/name: sisph-bff-jnd-baixa-garantia-des
    app.kubernetes.io/version: 1.16.0
    appName: sisph-bff-jnd-baixa-garantia
    backstage.io/kubernetes-id: sisph-bff-jnd-baixa-garantia
    helm.sh/chart: caixa-base-chart-1.1.9
    pod-template-hash: 56fb5579c8
    topology.kubernetes.io/region: brazilsouth
    topology.kubernetes.io/zone: '0'
  ownerReferences:
    - apiVersion: apps/v1
      kind: ReplicaSet
      name: sisph-bff-jnd-baixa-garantia-des-56fb5579c8
      uid: fa7b2bde-aca2-4b3e-a86a-54a136c379f7
      controller: true
      blockOwnerDeletion: true
spec:
  volumes:
    - name: kube-api-access-mhskg
      projected:
        sources:
          - serviceAccountToken:
              expirationSeconds: 3607
              path: token
          - configMap:
              name: kube-root-ca.crt
              items:
                - key: ca.crt
                  path: ca.crt
          - downwardAPI:
              items:
                - path: namespace
                  fieldRef:
                    apiVersion: v1
                    fieldPath: metadata.namespace
        defaultMode: 420
    - name: azure-keyvault-env
      emptyDir:
        medium: Memory
    - name: akv2k8s-client-cert
      secret:
        secretName: akv2k8s-sisph-bff-jnd-baixa-garantia-des
        defaultMode: 420
  initContainers:
    - name: copy-azurekeyvault-env
      image: spvest/azure-keyvault-env:1.7.4
      command:
        - sh
        - '-c'
        - cp /usr/local/bin/azure-keyvault-env /azure-keyvault/
      resources: {}
      volumeMounts:
        - name: azure-keyvault-env
          mountPath: /azure-keyvault/
        - name: kube-api-access-mhskg
          readOnly: true
          mountPath: /var/run/secrets/kubernetes.io/serviceaccount
      terminationMessagePath: /dev/termination-log
      terminationMessagePolicy: File
      imagePullPolicy: IfNotPresent
      securityContext:
        capabilities:
          drop:
            - ALL
        privileged: true
        runAsNonRoot: false
        readOnlyRootFilesystem: false
  containers:
    - name: sisph-bff-jnd-baixa-garantia-des
      image: >-
        acrcentralcaixanprd.azurecr.io/sisph/bff-jnd-baixa-garantia/sisph-bff-jnd-baixa-garantia:39294182741
      command:
        - /azure-keyvault/azure-keyvault-env
      args:
        - dotnet
        - BffJndBaixaGarantia.API.dll
      ports:
        - name: port
          containerPort: 8080
          protocol: TCP
      envFrom:
        - configMapRef:
            name: cm-sisph-bff-jnd-baixa-garantia-des
      env:
        - name: API_MANAGER_API_KEY
          value: akvs-sisph-api-key-des@azurekeyvault
        - name: APPLICATIONINSIGHTS_CONNECTION_STRING
          value: akvs-sisph-apm-appinsights-conn-string-des@azurekeyvault
        - name: SSO_CAIXA_SER_CLIENT_SECRET
          value: akvs-sisph-token-clientsecret-des@azurekeyvault
        - name: sisph-kv-eventhub-conn-string
          value: akvs-sisph-kv-eventhub-conn-string-des@azurekeyvault
        - name: ENV_INJECTOR_ARGS_SIGNATURE
          value: >-
            ZzIybVAxRnZGcnFxeUt4Z2hYdWxtc2tMNVk3TEhNWHRUa3B1bVZTUGw0Sy9MeHVhWTk1YWpuSy82YVpDWm16SVlrSi9FVnZCb3M0aE1kQ3hyNXhmRmRqY3NMQmdVOTVld2Y0aUJySUtUQ2xPdHZyS2E4YktYV2Y4SFBlTGM1a1Y4b0k3Y0NtNTBjNTJ5YWdUU25mZHg4b1JvdDl3S1JjdjJiVDZSZUdpUkRyYWVPZitiN2pzOUJiS1g5bTJwOWh2cmF6TEx3dnFVVm55VUx1TDl3YUVXWG5UMjV3VzdTOVpVeG0wUWdzd3Mwa05LUWlWdmFaTDZtNXZzRGpqclNrUXNiOVR0QnJ4WEdkbFdqdDNtQ2xpZSthUklKdUQzVHQvME5nVDJMTkliL0VDL0IzVVQzdC9MUS94b2FRK003azJBQTQvSWI1SUpteUV4RlZWOEkyYWZRPT0=
        - name: ENV_INJECTOR_ARGS_KEY
          value: >-
            LS0tLS1CRUdJTiBSU0EgUFVCTElDIEtFWS0tLS0tCk1JSUJJakFOQmdrcWhraUc5dzBCQVFFRkFBT0NBUThBTUlJQkNnS0NBUUVBeThRa0N2dUVOQVlMMUl6cDNZOEsKV0FEK1RDbkpCS05EaURWUGNVdHFlaFNNdHpNNlh1VUV5YTkycFBWcFd3c2dWWUc2K1A3cnZGSXhvSDVhRHNWMQphY2NlNys0MmpZallPRmFjZDRiSjUzMm56NFBYKzRJTEdaYS9MVzR3WGh3Y05RVXRpOFlhUlJQMS9tVFhOa2xNClNWMlNSNm1vQm9udStwNytmd2hWQklNU1ZMckVsMnBSRjZpZkhiSzRmSHZSckJ3cnJJKzRLZStmdGZrcUZIZ2MKYUFmSlNGbWJsY05uZHoybVBoelFPNkhQM3N5cDVuNjZLQ1V1U3FDaUN0NytJOUVBUFhpVWVITXpFRUNkSVBtbgpFRHRzdmJSTm1idmY5TElyNVNIMWZibndBTVZTbDBvUEg4bWVYQjJhaUpaNXBoeURTay9lMVVrYWlNelNBVTVhCjZRSURBUUFCCi0tLS0tRU5EIFJTQSBQVUJMSUMgS0VZLS0tLS0K
        - name: ENV_INJECTOR_USE_AUTH_SERVICE
          value: 'true'
        - name: ENV_INJECTOR_POD_NAMESPACE
          valueFrom:
            fieldRef:
              apiVersion: v1
              fieldPath: metadata.namespace
        - name: ENV_INJECTOR_POD_NAME
          valueFrom:
            fieldRef:
              apiVersion: v1
              fieldPath: metadata.name
        - name: ENV_INJECTOR_CLIENT_CERT_DIR
          value: /var/client-cert/
        - name: ENV_INJECTOR_AUTH_SERVICE
          value: https://akv2k8s-envinjector.akv2k8s.svc:9443
        - name: ENV_INJECTOR_AUTH_SERVICE_VALIDATION
          value: http://akv2k8s-envinjector.akv2k8s.svc:80
        - name: ENV_INJECTOR_AUTH_SERVICE_SECRET
          value: akv2k8s-sisph-bff-jnd-baixa-garantia-des
      resources:
        limits:
          cpu: 500m
          memory: 512Mi
        requests:
          cpu: 250m
          memory: 256Mi
      volumeMounts:
        - name: kube-api-access-mhskg
          readOnly: true
          mountPath: /var/run/secrets/kubernetes.io/serviceaccount
        - name: azure-keyvault-env
          readOnly: true
          mountPath: /azure-keyvault/
        - name: akv2k8s-client-cert
          readOnly: true
          mountPath: /var/client-cert/
      livenessProbe:
        httpGet:
          path: /healthz
          port: 8080
          scheme: HTTP
        initialDelaySeconds: 30
        timeoutSeconds: 1
        periodSeconds: 15
        successThreshold: 1
        failureThreshold: 10
      readinessProbe:
        httpGet:
          path: /healthz
          port: 8080
          scheme: HTTP
        initialDelaySeconds: 15
        timeoutSeconds: 1
        periodSeconds: 15
        successThreshold: 1
        failureThreshold: 3
      terminationMessagePath: /dev/termination-log
      terminationMessagePolicy: File
      imagePullPolicy: Always
  restartPolicy: Always
  terminationGracePeriodSeconds: 30
  dnsPolicy: ClusterFirst
  serviceAccountName: default
  serviceAccount: default
  nodeName: aks-appshab-39542064-vmss0003gy
  securityContext: {}
  schedulerName: default-scheduler
  tolerations:
    - key: kubernetes.azure.com/scalesetpriority
      operator: Equal
      value: spot
      effect: NoSchedule
    - key: nuvem.caixa/nodepoolname
      operator: Equal
      value: appshab
      effect: NoSchedule
    - key: node.kubernetes.io/not-ready
      operator: Exists
      effect: NoExecute
      tolerationSeconds: 300
    - key: node.kubernetes.io/unreachable
      operator: Exists
      effect: NoExecute
      tolerationSeconds: 300
    - key: node.kubernetes.io/memory-pressure
      operator: Exists
      effect: NoSchedule
  priority: 0
  enableServiceLinks: true
  preemptionPolicy: PreemptLowerPriority
status:
  observedGeneration: 1
  phase: Running
  conditions:
    - type: PodReadyToStartContainers
      observedGeneration: 1
      status: 'True'
      lastProbeTime: null
      lastTransitionTime: '2026-10-20T11:22:39Z'
    - type: Initialized
      observedGeneration: 1
      status: 'True'
      lastProbeTime: null
      lastTransitionTime: '2026-10-20T11:22:39Z'
    - type: Ready
      observedGeneration: 1
      status: 'True'
      lastProbeTime: null
      lastTransitionTime: '2026-10-20T14:04:30Z'
    - type: ContainersReady
      observedGeneration: 1
      status: 'True'
      lastProbeTime: null
      lastTransitionTime: '2026-10-20T14:04:30Z'
    - type: PodScheduled
      observedGeneration: 1
      status: 'True'
      lastProbeTime: null
      lastTransitionTime: '2026-10-20T11:22:33Z'
  hostIP: 10.245.170.22
  hostIPs:
    - ip: 10.245.170.22
  podIP: 192.168.139.15
  podIPs:
    - ip: 192.168.139.15
  startTime: '2026-10-20T11:22:33Z'
  initContainerStatuses:
    - name: copy-azurekeyvault-env
      state:
        terminated:
          exitCode: 0
          reason: Completed
          startedAt: '2026-10-20T11:22:39Z'
          finishedAt: '2026-10-20T11:22:39Z'
          containerID: >-
            containerd://2c5d0f6ac7b56354ae36852b066d901e10c1606b307129480ad1c9917df41571
      lastState: {}
      ready: true
      restartCount: 0
      image: docker.io/spvest/azure-keyvault-env:1.7.4
      imageID: >-
        docker.io/spvest/azure-keyvault-env@sha256:d86a5c678da578c9e24cf664b879876708fab45e10f76e3ba7ba018138e54ad6
      containerID: >-
        containerd://2c5d0f6ac7b56354ae36852b066d901e10c1606b307129480ad1c9917df41571
      started: false
      resources: {}
      volumeMounts:
        - name: azure-keyvault-env
          mountPath: /azure-keyvault/
        - name: kube-api-access-mhskg
          mountPath: /var/run/secrets/kubernetes.io/serviceaccount
          readOnly: true
          recursiveReadOnly: Disabled
      user:
        linux:
          uid: 65534
          gid: 65534
          supplementalGroups:
            - 65534
  containerStatuses:
    - name: sisph-bff-jnd-baixa-garantia-des
      state:
        running:
          startedAt: '2026-10-20T14:04:12Z'
      lastState:
        terminated:
          exitCode: 139
          reason: Error
          startedAt: '2026-10-20T13:59:08Z'
          finishedAt: '2026-10-20T13:59:11Z'
          containerID: >-
            containerd://0bff07c6c0a9b2e211b7f7ba34a013fe9915d6ba238c10aeb13b66890befce8c
      ready: true
      restartCount: 36
      image: >-
        acrcentralcaixanprd.azurecr.io/sisph/bff-jnd-baixa-garantia/sisph-bff-jnd-baixa-garantia:39294182741
      imageID: >-
        acrcentralcaixanprd.azurecr.io/sisph/bff-jnd-baixa-garantia/sisph-bff-jnd-baixa-garantia@sha256:c3917c56a6d679e8cf1604528c7482c4349d522a2f1bf3359b5293223174a8d7
      containerID: >-
        containerd://4c41dc7ddb7de87c11f74c7d44adf227090865ea1e5d0286fa8f800894a6f6f6
      started: true
      allocatedResources:
        cpu: 250m
        memory: 256Mi
      resources:
        limits:
          cpu: 500m
          memory: 512Mi
        requests:
          cpu: 250m
          memory: 256Mi
      volumeMounts:
        - name: kube-api-access-mhskg
          mountPath: /var/run/secrets/kubernetes.io/serviceaccount
          readOnly: true
          recursiveReadOnly: Disabled
        - name: azure-keyvault-env
          mountPath: /azure-keyvault/
          readOnly: true
          recursiveReadOnly: Disabled
        - name: akv2k8s-client-cert
          mountPath: /var/client-cert/
          readOnly: true
          recursiveReadOnly: Disabled
      user:
        linux:
          uid: 0
          gid: 0
          supplementalGroups:
            - 0
  qosClass: Burstable
id: 7df703dc-3851-49d5-96dd-986392f4a9f8
tableData:
  id: 7df703dc-3851-49d5-96dd-986392f4a9f8
  uuid: 7ae66ceb-a6cf-4976-a3ac-b9b00f513757




  Errors
container=sisph-bff-jnd-baixa-garantia-des restarted 36 times
sisph-bff-jnd-baixa-garantia-des-56fb5579c8-lgd8v


      Execution attempt. Source: 'ServiceToken-default-pipeline//Retry', Operation Key: '', Result: '200', Handled: 'False', Attempt: '0', Execution Time: 246.8643ms90info: System.Net.Http.HttpClient.ServiceToken.LogicalHandler[101]91      End processing HTTP request after 256.5811ms - 20092fail: Polly[0]93      Resilience event occurred. EventName: 'OnTimeout', Source: 'ServiceToken-default-pipeline//Timeout', Operation Key: '', Result: ''94warn: Polly[3]95      Execution attempt. Source: 'ServiceToken-default-pipeline//Retry', Operation Key: '', Result: 'The operation didn't complete within the allowed timeout of '00:00:03'.', Handled: 'True', Attempt: '0', Execution Time: 3018.698ms96      Polly.Timeout.TimeoutRejectedException: The operation didn't complete within the allowed timeout of '00:00:03'.97       ---> System.Threading.Tasks.TaskCanceledException: The operation was canceled.98       ---> System.IO.IOException: Unable to read data from the transport connection: Operation canceled.99       ---> System.Net.Sockets.SocketException (125): Operation canceled100         --- End of inner exception stack trace ---101         at System.Net.Sockets.Socket.AwaitableSocketAsyncEventArgs.ThrowException(SocketError error, CancellationToken cancellationToken)102         at System.Net.Sockets.Socket.AwaitableSocketAsyncEventArgs.System.Threading.Tasks.Sources.IValueTaskSource<System.Int32>.GetResult(Int16 token)103         at System.Net.Security.SslStream.EnsureFullTlsFrameAsync[TIOAdapter](CancellationToken cancellationToken, Int32 estimatedSize)104         at System.Runtime.CompilerServices.PoolingAsyncValueTaskMethodBuilder`1.StateMachineBox`1.System.Threading.Tasks.Sources.IValueTaskSource<TResult>.GetResult(Int16 token)105         at System.Net.Security.SslStream.ReadAsyncInternal[TIOAdapter](Memory`1 buffer, CancellationToken cancellationToken)106         at System.Runtime.CompilerServices.PoolingAsyncValueTaskMethodBuilder`1.StateMachineBox`1.System.Threading.Tasks.Sources.IValueTaskSource<TResult>.GetResult(Int16 token)107         at System.Net.Http.HttpConnection.InitialFillAsync(Boolean async)108         at System.Net.Http.HttpConnection.SendAsync(HttpRequestMessage request, Boolean async, CancellationToken cancellationToken)109         --- End of inner exception stack trace ---110         at System.Net.Http.HttpConnection.SendAsync(HttpRequestMessage request, Boolean async, CancellationToken cancellationToken)111         at System.Net.Http.HttpConnectionPool.SendWithVersionDetectionAndRetryAsync(HttpRequestMessage request, Boolean async, Boolean doRequestAuth, CancellationToken cancellationToken)112         at System.Net.Http.DiagnosticsHandler.SendAsyncCore(HttpRequestMessage request, Boolean async, CancellationToken cancellationToken)113         at System.Net.Http.Metrics.MetricsHandler.SendAsyncWithMetrics(HttpRequestMessage request, Boolean async, CancellationToken cancellationToken)114         at System.Net.Http.RedirectHandler.SendAsync(HttpRequestMessage request, Boolean async, CancellationToken cancellationToken)115         at Microsoft.Extensions.Http.Logging.LoggingHttpMessageHandler.<SendCoreAsync>g__Core|4_0(HttpRequestMessage request, Boolean useAsync, CancellationToken cancellationToken)116         at Microsoft.Extensions.Http.Resilience.ResilienceHandler.<>c.<<SendAsync>b__3_0>d.MoveNext()117         --- End of inner exception stack trace ---118         at Polly.Utils.ExceptionUtilities.TrySetStackTrace[T](T exception)119         at Polly.Timeout.TimeoutResilienceStrategy.ExecuteCore[TResult,TState](Func`3 callback, ResilienceContext context, TState state)120         at System.Runtime.CompilerServices.AsyncTaskMethodBuilder`1.AsyncStateMachineBox`1.ExecutionContextCallback(Object s)







            Execution attempt. Source: 'ServiceToken-default-pipeline//Retry', Operation Key: '', Result: '200', Handled: 'False', Attempt: '0', Execution Time: 246.8643ms90info: System.Net.Http.HttpClient.ServiceToken.LogicalHandler[101]91      End processing HTTP request after 256.5811ms - 20092fail: Polly[0]93      Resilience event occurred. EventName: 'OnTimeout', Source: 'ServiceToken-default-pipeline//Timeout', Operation Key: '', Result: ''94warn: Polly[3]95      Execution attempt. Source: 'ServiceToken-default-pipeline//Retry', Operation Key: '', Result: 'The operation didn't complete within the allowed timeout of '00:00:03'.', Handled: 'True', Attempt: '0', Execution Time: 3018.698ms96      Polly.Timeout.TimeoutRejectedException: The operation didn't complete within the allowed timeout of '00:00:03'.97       ---> System.Threading.Tasks.TaskCanceledException: The operation was canceled.98       ---> System.IO.IOException: Unable to read data from the transport connection: Operation canceled.99       ---> System.Net.Sockets.SocketException (125): Operation canceled100         --- End of inner exception stack trace ---101         at System.Net.Sockets.Socket.AwaitableSocketAsyncEventArgs.ThrowException(SocketError error, CancellationToken cancellationToken)102         at System.Net.Sockets.Socket.AwaitableSocketAsyncEventArgs.System.Threading.Tasks.Sources.IValueTaskSource<System.Int32>.GetResult(Int16 token)103         at System.Net.Security.SslStream.EnsureFullTlsFrameAsync[TIOAdapter](CancellationToken cancellationToken, Int32 estimatedSize)104         at System.Runtime.CompilerServices.PoolingAsyncValueTaskMethodBuilder`1.StateMachineBox`1.System.Threading.Tasks.Sources.IValueTaskSource<TResult>.GetResult(Int16 token)105         at System.Net.Security.SslStream.ReadAsyncInternal[TIOAdapter](Memory`1 buffer, CancellationToken cancellationToken)106         at System.Runtime.CompilerServices.PoolingAsyncValueTaskMethodBuilder`1.StateMachineBox`1.System.Threading.Tasks.Sources.IValueTaskSource<TResult>.GetResult(Int16 token)107         at System.Net.Http.HttpConnection.InitialFillAsync(Boolean async)108         at System.Net.Http.HttpConnection.SendAsync(HttpRequestMessage request, Boolean async, CancellationToken cancellationToken)109         --- End of inner exception stack trace ---110         at System.Net.Http.HttpConnection.SendAsync(HttpRequestMessage request, Boolean async, CancellationToken cancellationToken)111         at System.Net.Http.HttpConnectionPool.SendWithVersionDetectionAndRetryAsync(HttpRequestMessage request, Boolean async, Boolean doRequestAuth, CancellationToken cancellationToken)112         at System.Net.Http.DiagnosticsHandler.SendAsyncCore(HttpRequestMessage request, Boolean async, CancellationToken cancellationToken)113         at System.Net.Http.Metrics.MetricsHandler.SendAsyncWithMetrics(HttpRequestMessage request, Boolean async, CancellationToken cancellationToken)114         at System.Net.Http.RedirectHandler.SendAsync(HttpRequestMessage request, Boolean async, CancellationToken cancellationToken)115         at Microsoft.Extensions.Http.Logging.LoggingHttpMessageHandler.<SendCoreAsync>g__Core|4_0(HttpRequestMessage request, Boolean useAsync, CancellationToken cancellationToken)116         at Microsoft.Extensions.Http.Resilience.ResilienceHandler.<>c.<<SendAsync>b__3_0>d.MoveNext()117         --- End of inner exception stack trace ---118         at Polly.Utils.ExceptionUtilities.TrySetStackTrace[T](T exception)119         at Polly.Timeout.TimeoutResilienceStrategy.ExecuteCore[TResult,TState](Func`3 callback, ResilienceContext context, TState state)120         at System.Runtime.CompilerServices.AsyncTaskMethodBuilder`1.AsyncStateMachineBox`1.ExecutionContextCallback(Object s)
