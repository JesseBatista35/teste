Skip to content
GitHub Enterprise
Users managed by Caixa Economica Federal
caixagithub
siarx-backend-autoridade-registro
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
caixagithub/siarx-backend-autoridade-registro_main_34386495130.1 #1
All jobs
Run details
Annotations
1 error and 1 warning
CI_DES / BUILD / BUILD
failed on Sep 9 in 1m 1s
Search logs
9s
0s
1s
1s
23s
0s
0s
0s
0s
14s
    Labels:
     org.mobyproject.buildkit.worker.executor:         oci
     org.mobyproject.buildkit.worker.hostname:         0febe46e74ef
     org.mobyproject.buildkit.worker.network:          host
     org.mobyproject.buildkit.worker.oci.process-mode: sandbox
     org.mobyproject.buildkit.worker.selinux.enabled:  false
     org.mobyproject.buildkit.worker.snapshotter:      overlayfs
    GC Policy rule#0:
     All:            false
     Filters:        type==source.local type==exec.cachemount type==source.git.checkout
     Keep Duration:  48h0m0s
     Max Used Space: 488.3MiB
    GC Policy rule#1:
     All:            false
     Keep Duration:  1440h0m0s
     Reserved Space: 1.863GiB
     Max Used Space: 14.9GiB
     Min Free Space: 3.725GiB
    GC Policy rule#2:
     All:            false
     Reserved Space: 1.863GiB
     Max Used Space: 14.9GiB
     Min Free Space: 3.725GiB
    GC Policy rule#3:
     All:            true
     Reserved Space: 1.863GiB
     Max Used Space: 14.9GiB
     Min Free Space: 3.725GiB
Inspect builder
    {
      "nodes": [
        {
          "name": "builder-608a32ff-6150-47a4-8a8a-75890eac24170",
          "endpoint": "unix:///var/run/docker.sock",
          "status": "running",
          "buildkitd-flags": "--allow-insecure-entitlement security.insecure --allow-insecure-entitlement network.host",
          "buildkit": "v0.32.2",
          "platforms": "linux/amd64,linux/amd64/v2,linux/amd64/v3,linux/amd64/v4,linux/386",
          "features": {
            "Automatically load images to the Docker Engine image store": true,
            "Cache export": true,
            "Direct push": true,
            "Docker exporter": true,
            "Multi-platform build": true,
            "OCI exporter": true
          },
          "labels": {
            "org.mobyproject.buildkit.worker.executor": "oci",
            "org.mobyproject.buildkit.worker.hostname": "0febe46e74ef",
            "org.mobyproject.buildkit.worker.network": "host",
            "org.mobyproject.buildkit.worker.oci.process-mode": "sandbox",
            "org.mobyproject.buildkit.worker.selinux.enabled": "false",
            "org.mobyproject.buildkit.worker.snapshotter": "overlayfs"
          },
          "gcPolicy": [
            {
              "all": false,
              "filter": [
                "type==source.local type==exec.cachemount type==source.git.checkout"
              ],
              "keepDuration": "48h0m0s",
              "maxUsedSpace": "488.3MiB"
            },
            {
              "all": false,
              "keepDuration": "1440h0m0s",
              "reservedSpace": "1.863GiB",
              "maxUsedSpace": "14.9GiB",
              "minFreeSpace": "3.725GiB"
            },
            {
              "all": false,
              "reservedSpace": "1.863GiB",
              "maxUsedSpace": "14.9GiB",
              "minFreeSpace": "3.725GiB"
            },
            {
              "all": true,
              "reservedSpace": "1.863GiB",
              "maxUsedSpace": "14.9GiB",
              "minFreeSpace": "3.725GiB"
            }
          ]
        }
      ],
      "name": "builder-608a32ff-6150-47a4-8a8a-75890eac2417",
      "driver": "docker-container",
      "lastActivity": "2026-09-09T18:03:14.000Z"
    }
BuildKit version
    builder-608a32ff-6150-47a4-8a8a-75890eac24170: v0.32.2
0s
6s
0s
0s
1s
0s
0s
