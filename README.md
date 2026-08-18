Skip to content
GitHub Enterprise
Users managed by Caixa Economica Federal
caixagithub
siaci-api-worker-auditoria
Repository navigation
Code
Issues
Pull requests
Actions
Projects
Wiki
Security and quality
2
 (2)
Insights
Settings
CI/CD Workflow Generic
caixagithub/siaci-api-worker-auditoria_main_31217709994.6 #6
All jobs
Run details
CI_DES / ArgoCD_Deploy / ArgoCD_Deploy (TQS)
failed 15 hours ago in 11m 51s. View latest attempt.
Search logs
10s
0s
1s
0s
0s
0s
0s
0s
0s
0s
0s
0s
0s
56s
0s
5s
0s
0s
0s
4s
0s
1s
0s
1s
0s
11s
5s
2s
0s
2s
10m 3s
1s
  {"@t":"2026-08-17T21:35:29.0095373Z","@mt":"HealthCheck: {Name} - Status: {Status} | {Description} | {Details}","@tr":"dc8417ad58cfe302caea19eaadc4b3da","@sp":"4010c8dcfb6b981e","Name":"blobaccumulator","Status":"Healthy","Description":"BlobAccumulator metrics coletadas com sucesso","Details":"CheckedAt=08/17/2026 21:35:28, PartitionCount=0","SourceContext":"Program","RequestId":"0HNNSKR1T8RRS:00000001","RequestPath":"/healthz","ConnectionId":"0HNNSKR1T8RRS","ServiceName":"Auditoria.Worker","Environment":"Production","MachineName":"siaci-api-worker-auditoria-tqs-76755fdc77-v4njv","ProcessId":1,"ThreadId":26}
  {"@t":"2026-08-17T21:35:29.0095660Z","@mt":"HealthCheck: {Name} - Status: {Status} | {Description} | {Details}","@tr":"dc8417ad58cfe302caea19eaadc4b3da","@sp":"4010c8dcfb6b981e","Name":"self","Status":"Healthy","Description":"Worker está executando","Details":"sem dados adicionais","SourceContext":"Program","RequestId":"0HNNSKR1T8RRS:00000001","RequestPath":"/healthz","ConnectionId":"0HNNSKR1T8RRS","ServiceName":"Auditoria.Worker","Environment":"Production","MachineName":"siaci-api-worker-auditoria-tqs-76755fdc77-v4njv","ProcessId":1,"ThreadId":26}
  {"@t":"2026-08-17T21:35:31.3631662Z","@mt":"HealthCheck: {Name} - Status: {Status} | {Description} | {Details}","@tr":"a78181c997c08d9e7511eb65f004e0d5","@sp":"7f1613acd84cd1e1","Name":"cosmosdb","Status":"Healthy","Description":"Cosmos DB está acessível e respondendo","Details":"DatabaseName=siaci-auditoria-tqs, CheckedAt=08/17/2026 21:35:31","SourceContext":"Program","RequestId":"0HNNSKR1T8RRT:00000001","RequestPath":"/healthz","ConnectionId":"0HNNSKR1T8RRT","ServiceName":"Auditoria.Worker","Environment":"Production","MachineName":"siaci-api-worker-auditoria-tqs-76755fdc77-v4njv","ProcessId":1,"ThreadId":6}
  {"@t":"2026-08-17T21:35:31.3632079Z","@mt":"HealthCheck: {Name} - Status: {Status} | {Description} | {Details}","@tr":"a78181c997c08d9e7511eb65f004e0d5","@sp":"7f1613acd84cd1e1","Name":"eventhub","Status":"Healthy","Description":"Event Hub está acessível e respondendo","Details":"EventHubName=eh-siaci-tqs, AuthMode=ConnectionString, ConsumerGroupCosmos=$Default, ConsumerGroupBlob=auditoria-worker-worm, PartitionCount=1, CheckedAt=08/17/2026 21:35:31","SourceContext":"Program","RequestId":"0HNNSKR1T8RRT:00000001","RequestPath":"/healthz","ConnectionId":"0HNNSKR1T8RRT","ServiceName":"Auditoria.Worker","Environment":"Production","MachineName":"siaci-api-worker-auditoria-tqs-76755fdc77-v4njv","ProcessId":1,"ThreadId":6}
  {"@t":"2026-08-17T21:35:31.3632241Z","@mt":"HealthCheck: {Name} - Status: {Status} | {Description} | {Details}","@tr":"a78181c997c08d9e7511eb65f004e0d5","@sp":"7f1613acd84cd1e1","Name":"blobstorage","Status":"Healthy","Description":"Blob Storage está acessível e os containers foram encontrados","Details":"CheckedAt=08/17/2026 21:35:31, Container:siaci-auditoria-eventhub-checkpoints-tqs:Exists=True, Container:siaci-auditoria-eventos-invalidos-tqs:Exists=True, Container:siaci-auditoria-eventos-validos-tqs:Exists=True","SourceContext":"Program","RequestId":"0HNNSKR1T8RRT:00000001","RequestPath":"/healthz","ConnectionId":"0HNNSKR1T8RRT","ServiceName":"Auditoria.Worker","Environment":"Production","MachineName":"siaci-api-worker-auditoria-tqs-76755fdc77-v4njv","ProcessId":1,"ThreadId":6}
  {"@t":"2026-08-17T21:35:31.3632426Z","@mt":"HealthCheck: {Name} - Status: {Status} | {Description} | {Details}","@tr":"a78181c997c08d9e7511eb65f004e0d5","@sp":"7f1613acd84cd1e1","Name":"blobaccumulator","Status":"Healthy","Description":"BlobAccumulator metrics coletadas com sucesso","Details":"CheckedAt=08/17/2026 21:35:31, PartitionCount=0","SourceContext":"Program","RequestId":"0HNNSKR1T8RRT:00000001","RequestPath":"/healthz","ConnectionId":"0HNNSKR1T8RRT","ServiceName":"Auditoria.Worker","Environment":"Production","MachineName":"siaci-api-worker-auditoria-tqs-76755fdc77-v4njv","ProcessId":1,"ThreadId":6}
  {"@t":"2026-08-17T21:35:31.3632762Z","@mt":"HealthCheck: {Name} - Status: {Status} | {Description} | {Details}","@tr":"a78181c997c08d9e7511eb65f004e0d5","@sp":"7f1613acd84cd1e1","Name":"self","Status":"Healthy","Description":"Worker está executando","Details":"sem dados adicionais","SourceContext":"Program","RequestId":"0HNNSKR1T8RRT:00000001","RequestPath":"/healthz","ConnectionId":"0HNNSKR1T8RRT","ServiceName":"Auditoria.Worker","Environment":"Production","MachineName":"siaci-api-worker-auditoria-tqs-76755fdc77-v4njv","ProcessId":1,"ThreadId":6}
  {"@t":"2026-08-17T21:35:44.0034930Z","@mt":"HealthCheck: {Name} - Status: {Status} | {Description} | {Details}","@tr":"283b7b37b51910dafdc9ab6cebcc0e1b","@sp":"2721b9c18270b04c","Name":"cosmosdb","Status":"Healthy","Description":"Cosmos DB está acessível e respondendo","Details":"DatabaseName=siaci-auditoria-tqs, CheckedAt=08/17/2026 21:35:43","SourceContext":"Program","RequestId":"0HNNSKR1T8RRU:00000001","RequestPath":"/healthz","ConnectionId":"0HNNSKR1T8RRU","ServiceName":"Auditoria.Worker","Environment":"Production","MachineName":"siaci-api-worker-auditoria-tqs-76755fdc77-v4njv","ProcessId":1,"ThreadId":23}
  {"@t":"2026-08-17T21:35:44.0035312Z","@mt":"HealthCheck: {Name} - Status: {Status} | {Description} | {Details}","@tr":"283b7b37b51910dafdc9ab6cebcc0e1b","@sp":"2721b9c18270b04c","Name":"eventhub","Status":"Healthy","Description":"Event Hub está acessível e respondendo","Details":"EventHubName=eh-siaci-tqs, AuthMode=ConnectionString, ConsumerGroupCosmos=$Default, ConsumerGroupBlob=auditoria-worker-worm, PartitionCount=1, CheckedAt=08/17/2026 21:35:44","SourceContext":"Program","RequestId":"0HNNSKR1T8RRU:00000001","RequestPath":"/healthz","ConnectionId":"0HNNSKR1T8RRU","ServiceName":"Auditoria.Worker","Environment":"Production","MachineName":"siaci-api-worker-auditoria-tqs-76755fdc77-v4njv","ProcessId":1,"ThreadId":23}
  {"@t":"2026-08-17T21:35:44.0035445Z","@mt":"HealthCheck: {Name} - Status: {Status} | {Description} | {Details}","@tr":"283b7b37b51910dafdc9ab6cebcc0e1b","@sp":"2721b9c18270b04c","Name":"blobstorage","Status":"Healthy","Description":"Blob Storage está acessível e os containers foram encontrados","Details":"CheckedAt=08/17/2026 21:35:43, Container:siaci-auditoria-eventhub-checkpoints-tqs:Exists=True, Container:siaci-auditoria-eventos-invalidos-tqs:Exists=True, Container:siaci-auditoria-eventos-validos-tqs:Exists=True","SourceContext":"Program","RequestId":"0HNNSKR1T8RRU:00000001","RequestPath":"/healthz","ConnectionId":"0HNNSKR1T8RRU","ServiceName":"Auditoria.Worker","Environment":"Production","MachineName":"siaci-api-worker-auditoria-tqs-76755fdc77-v4njv","ProcessId":1,"ThreadId":23}
  {"@t":"2026-08-17T21:35:44.0035943Z","@mt":"HealthCheck: {Name} - Status: {Status} | {Description} | {Details}","@tr":"283b7b37b51910dafdc9ab6cebcc0e1b","@sp":"2721b9c18270b04c","Name":"blobaccumulator","Status":"Healthy","Description":"BlobAccumulator metrics coletadas com sucesso","Details":"CheckedAt=08/17/2026 21:35:43, PartitionCount=0","SourceContext":"Program","RequestId":"0HNNSKR1T8RRU:00000001","RequestPath":"/healthz","ConnectionId":"0HNNSKR1T8RRU","ServiceName":"Auditoria.Worker","Environment":"Production","MachineName":"siaci-api-worker-auditoria-tqs-76755fdc77-v4njv","ProcessId":1,"ThreadId":23}
  {"@t":"2026-08-17T21:35:44.0036104Z","@mt":"HealthCheck: {Name} - Status: {Status} | {Description} | {Details}","@tr":"283b7b37b51910dafdc9ab6cebcc0e1b","@sp":"2721b9c18270b04c","Name":"self","Status":"Healthy","Description":"Worker está executando","Details":"sem dados adicionais","SourceContext":"Program","RequestId":"0HNNSKR1T8RRU:00000001","RequestPath":"/healthz","ConnectionId":"0HNNSKR1T8RRU","ServiceName":"Auditoria.Worker","Environment":"Production","MachineName":"siaci-api-worker-auditoria-tqs-76755fdc77-v4njv","ProcessId":1,"ThreadId":23}
  {"@t":"2026-08-17T21:35:46.3879450Z","@mt":"HealthCheck: {Name} - Status: {Status} | {Description} | {Details}","@tr":"14acfc7d9a992281878e8fa630716ca8","@sp":"8dcacbffbb5ecb59","Name":"cosmosdb","Status":"Healthy","Description":"Cosmos DB está acessível e respondendo","Details":"DatabaseName=siaci-auditoria-tqs, CheckedAt=08/17/2026 21:35:46","SourceContext":"Program","RequestId":"0HNNSKR1T8RRV:00000001","RequestPath":"/healthz","ConnectionId":"0HNNSKR1T8RRV","ServiceName":"Auditoria.Worker","Environment":"Production","MachineName":"siaci-api-worker-auditoria-tqs-76755fdc77-v4njv","ProcessId":1,"ThreadId":23}
  {"@t":"2026-08-17T21:35:46.3879920Z","@mt":"HealthCheck: {Name} - Status: {Status} | {Description} | {Details}","@tr":"14acfc7d9a992281878e8fa630716ca8","@sp":"8dcacbffbb5ecb59","Name":"eventhub","Status":"Healthy","Description":"Event Hub está acessível e respondendo","Details":"EventHubName=eh-siaci-tqs, AuthMode=ConnectionString, ConsumerGroupCosmos=$Default, ConsumerGroupBlob=auditoria-worker-worm, PartitionCount=1, CheckedAt=08/17/2026 21:35:46","SourceContext":"Program","RequestId":"0HNNSKR1T8RRV:00000001","RequestPath":"/healthz","ConnectionId":"0HNNSKR1T8RRV","ServiceName":"Auditoria.Worker","Environment":"Production","MachineName":"siaci-api-worker-auditoria-tqs-76755fdc77-v4njv","ProcessId":1,"ThreadId":23}
  {"@t":"2026-08-17T21:35:46.3880079Z","@mt":"HealthCheck: {Name} - Status: {Status} | {Description} | {Details}","@tr":"14acfc7d9a992281878e8fa630716ca8","@sp":"8dcacbffbb5ecb59","Name":"blobstorage","Status":"Healthy","Description":"Blob Storage está acessível e os containers foram encontrados","Details":"CheckedAt=08/17/2026 21:35:46, Container:siaci-auditoria-eventhub-checkpoints-tqs:Exists=True, Container:siaci-auditoria-eventos-invalidos-tqs:Exists=True, Container:siaci-auditoria-eventos-validos-tqs:Exists=True","SourceContext":"Program","RequestId":"0HNNSKR1T8RRV:00000001","RequestPath":"/healthz","ConnectionId":"0HNNSKR1T8RRV","ServiceName":"Auditoria.Worker","Environment":"Production","MachineName":"siaci-api-worker-auditoria-tqs-76755fdc77-v4njv","ProcessId":1,"ThreadId":23}
  {"@t":"2026-08-17T21:35:46.3880345Z","@mt":"HealthCheck: {Name} - Status: {Status} | {Description} | {Details}","@tr":"14acfc7d9a992281878e8fa630716ca8","@sp":"8dcacbffbb5ecb59","Name":"blobaccumulator","Status":"Healthy","Description":"BlobAccumulator metrics coletadas com sucesso","Details":"CheckedAt=08/17/2026 21:35:46, PartitionCount=0","SourceContext":"Program","RequestId":"0HNNSKR1T8RRV:00000001","RequestPath":"/healthz","ConnectionId":"0HNNSKR1T8RRV","ServiceName":"Auditoria.Worker","Environment":"Production","MachineName":"siaci-api-worker-auditoria-tqs-76755fdc77-v4njv","ProcessId":1,"ThreadId":23}
  {"@t":"2026-08-17T21:35:46.3880643Z","@mt":"HealthCheck: {Name} - Status: {Status} | {Description} | {Details}","@tr":"14acfc7d9a992281878e8fa630716ca8","@sp":"8dcacbffbb5ecb59","Name":"self","Status":"Healthy","Description":"Worker está executando","Details":"sem dados adicionais","SourceContext":"Program","RequestId":"0HNNSKR1T8RRV:00000001","RequestPath":"/healthz","ConnectionId":"0HNNSKR1T8RRV","ServiceName":"Auditoria.Worker","Environment":"Production","MachineName":"siaci-api-worker-auditoria-tqs-76755fdc77-v4njv","ProcessId":1,"ThreadId":23}
  
  ================================================
  Script executado com sucesso!
  Pod utilizado: siaci-api-worker-auditoria-tqs-76755fdc77-v4njv
  Falha na sincronização
  Error: Process completed with exit code 1.
0s
0s
0s
0s
0s
0s
0s
0s
1s
0s
0s
