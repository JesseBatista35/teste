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
caixagithub/siarx-backend-autoridade-registro_main_38740866749.2 #2
All jobs
Run details
CI_DES / BUILD / BUILD
failed 3 minutes ago in 3m 3s
Search logs
7s
1s
1s
1s
13s
0s
10s
1m 14s
Run caixagithub/DevSecOps-Actions/.github/integrations/azure/install-az-cli@main
Init variables
0s
Verify AZ CLI Latest Version
0s
Verify AZ CLI Runner
3s
Install prerequisites (wget, python3, pipx)
14s
Install Azure CLI from Microsoft repo (latest)
57s
Run echo -e "\033[1;34m[INFO] Instalando Azure CLI (latest) via repositório oficial da Microsoft...\033[0m"
  [INFO] Instalando Azure CLI (latest) via repositório oficial da Microsoft...
  Hit:1 https://cli.github.com/packages stable InRelease
  Hit:2 https://packages.microsoft.com/repos/azure-cli noble InRelease
  Hit:3 https://packages.microsoft.com/ubuntu/24.04/prod noble InRelease
  Hit:4 https://deb.nodesource.com/node_24.x nodistro InRelease
  Hit:6 https://dl.google.com/linux/chrome-stable/deb stable InRelease
  Hit:5 https://prod-cdn.packages.k8s.io/repositories/isv:/kubernetes:/core:/stable:/v1.34/deb  InRelease
  Hit:7 http://security.ubuntu.com/ubuntu noble-security InRelease
  Hit:8 http://archive.ubuntu.com/ubuntu noble InRelease
  Hit:10 http://archive.ubuntu.com/ubuntu noble-updates InRelease
  Hit:11 https://ppa.launchpadcontent.net/git-core/ppa/ubuntu noble InRelease
  Hit:12 http://archive.ubuntu.com/ubuntu noble-backports InRelease
  Hit:13 https://ppa.launchpadcontent.net/mozillateam/ppa/ubuntu noble InRelease
  Hit:9 https://packages.buildkite.com/helm-linux/helm-debian/any any InRelease
  Reading package lists...
  Reading package lists...
  Building dependency tree...
  Reading state information...
  apt-transport-https is already the newest version (2.8.3).
  ca-certificates is already the newest version (20260601~24.04.1).
  lsb-release is already the newest version (12.0-2).
  The following additional packages will be installed:
    dirmngr gnupg-utils gpg gpg-agent gpgconf gpgsm gpgv keyboxd
    libcurl3t64-gnutls libcurl4t64
  Suggested packages:
    pinentry-gnome3 tor parcimonie xloadimage gpg-wks-server scdaemon
  Recommended packages:
    gnupg-l10n gpg-wks-client
  The following packages will be upgraded:
    curl dirmngr gnupg gnupg-utils gpg gpg-agent gpgconf gpgsm gpgv keyboxd
    libcurl3t64-gnutls libcurl4t64
  12 upgraded, 0 newly installed, 0 to remove and 90 not upgraded.
  Need to get 3063 kB of archives.
  After this operation, 6144 B of additional disk space will be used.
  Get:1 http://archive.ubuntu.com/ubuntu noble-updates/main amd64 dirmngr amd64 2.4.4-2ubuntu17.6 [323 kB]
  Get:2 http://security.ubuntu.com/ubuntu noble-security/main amd64 curl amd64 8.5.0-2ubuntu10.16 [226 kB]
  Get:3 http://archive.ubuntu.com/ubuntu noble-updates/main amd64 gpgsm amd64 2.4.4-2ubuntu17.6 [232 kB]
  Get:4 http://archive.ubuntu.com/ubuntu noble-updates/main amd64 gnupg-utils amd64 2.4.4-2ubuntu17.6 [109 kB]
  Get:5 http://archive.ubuntu.com/ubuntu noble-updates/main amd64 gpg-agent amd64 2.4.4-2ubuntu17.6 [227 kB]
  Get:6 http://archive.ubuntu.com/ubuntu noble-updates/main amd64 gpg amd64 2.4.4-2ubuntu17.6 [565 kB]
  Get:7 http://archive.ubuntu.com/ubuntu noble-updates/main amd64 gpgconf amd64 2.4.4-2ubuntu17.6 [104 kB]
  Get:8 http://archive.ubuntu.com/ubuntu noble-updates/main amd64 gnupg all 2.4.4-2ubuntu17.6 [359 kB]
  Get:9 http://archive.ubuntu.com/ubuntu noble-updates/main amd64 keyboxd amd64 2.4.4-2ubuntu17.6 [78.3 kB]
  Get:10 http://archive.ubuntu.com/ubuntu noble-updates/main amd64 gpgv amd64 2.4.4-2ubuntu17.6 [158 kB]
  Get:11 http://security.ubuntu.com/ubuntu noble-security/main amd64 libcurl4t64 amd64 8.5.0-2ubuntu10.16 [344 kB]
  Get:12 http://security.ubuntu.com/ubuntu noble-security/main amd64 libcurl3t64-gnutls amd64 8.5.0-2ubuntu10.16 [337 kB]
  debconf: delaying package configuration, since apt-utils is not installed
  Fetched 3063 kB in 2s (1403 kB/s)
  (Reading database ... 
  (Reading database ... 5%
  (Reading database ... 10%
  (Reading database ... 15%
  (Reading database ... 20%
  (Reading database ... 25%
  (Reading database ... 30%
  (Reading database ... 35%
  (Reading database ... 40%
  (Reading database ... 45%
  (Reading database ... 50%
  (Reading database ... 55%
  (Reading database ... 60%
  (Reading database ... 65%
  (Reading database ... 70%
  (Reading database ... 75%
  (Reading database ... 80%
  (Reading database ... 85%
  (Reading database ... 90%
  (Reading database ... 95%
  (Reading database ... 100%
  (Reading database ... 69402 files and directories currently installed.)
  Preparing to unpack .../0-dirmngr_2.4.4-2ubuntu17.6_amd64.deb ...
  Unpacking dirmngr (2.4.4-2ubuntu17.6) over (2.4.4-2ubuntu17.4) ...
  Preparing to unpack .../1-gpgsm_2.4.4-2ubuntu17.6_amd64.deb ...
  Unpacking gpgsm (2.4.4-2ubuntu17.6) over (2.4.4-2ubuntu17.4) ...
  Preparing to unpack .../2-gnupg-utils_2.4.4-2ubuntu17.6_amd64.deb ...
  Unpacking gnupg-utils (2.4.4-2ubuntu17.6) over (2.4.4-2ubuntu17.4) ...
  Preparing to unpack .../3-gpg-agent_2.4.4-2ubuntu17.6_amd64.deb ...
  Unpacking gpg-agent (2.4.4-2ubuntu17.6) over (2.4.4-2ubuntu17.4) ...
  Preparing to unpack .../4-gpg_2.4.4-2ubuntu17.6_amd64.deb ...
  Unpacking gpg (2.4.4-2ubuntu17.6) over (2.4.4-2ubuntu17.4) ...
  Preparing to unpack .../5-gpgconf_2.4.4-2ubuntu17.6_amd64.deb ...
  Unpacking gpgconf (2.4.4-2ubuntu17.6) over (2.4.4-2ubuntu17.4) ...
  Preparing to unpack .../6-gnupg_2.4.4-2ubuntu17.6_all.deb ...
  Unpacking gnupg (2.4.4-2ubuntu17.6) over (2.4.4-2ubuntu17.4) ...
  Preparing to unpack .../7-keyboxd_2.4.4-2ubuntu17.6_amd64.deb ...
  Unpacking keyboxd (2.4.4-2ubuntu17.6) over (2.4.4-2ubuntu17.4) ...
  Preparing to unpack .../8-gpgv_2.4.4-2ubuntu17.6_amd64.deb ...
  Unpacking gpgv (2.4.4-2ubuntu17.6) over (2.4.4-2ubuntu17.4) ...
  Setting up gpgv (2.4.4-2ubuntu17.6) ...
  (Reading database ... 
  (Reading database ... 5%
  (Reading database ... 10%
  (Reading database ... 15%
  (Reading database ... 20%
  (Reading database ... 25%
  (Reading database ... 30%
  (Reading database ... 35%
  (Reading database ... 40%
  (Reading database ... 45%
  (Reading database ... 50%
  (Reading database ... 55%
  (Reading database ... 60%
  (Reading database ... 65%
  (Reading database ... 70%
  (Reading database ... 75%
  (Reading database ... 80%
  (Reading database ... 85%
  (Reading database ... 90%
  (Reading database ... 95%
  (Reading database ... 100%
  (Reading database ... 69402 files and directories currently installed.)
  Preparing to unpack .../curl_8.5.0-2ubuntu10.16_amd64.deb ...
  Unpacking curl (8.5.0-2ubuntu10.16) over (8.5.0-2ubuntu10.11) ...
  Preparing to unpack .../libcurl4t64_8.5.0-2ubuntu10.16_amd64.deb ...
  Unpacking libcurl4t64:amd64 (8.5.0-2ubuntu10.16) over (8.5.0-2ubuntu10.11) ...
  Preparing to unpack .../libcurl3t64-gnutls_8.5.0-2ubuntu10.16_amd64.deb ...
  Unpacking libcurl3t64-gnutls:amd64 (8.5.0-2ubuntu10.16) over (8.5.0-2ubuntu10.11) ...
  Setting up libcurl4t64:amd64 (8.5.0-2ubuntu10.16) ...
  Setting up libcurl3t64-gnutls:amd64 (8.5.0-2ubuntu10.16) ...
  Setting up gpgconf (2.4.4-2ubuntu17.6) ...
  Setting up curl (8.5.0-2ubuntu10.16) ...
  Setting up gpg (2.4.4-2ubuntu17.6) ...
  Setting up gnupg-utils (2.4.4-2ubuntu17.6) ...
  Setting up gpg-agent (2.4.4-2ubuntu17.6) ...
  Setting up gpgsm (2.4.4-2ubuntu17.6) ...
  Setting up dirmngr (2.4.4-2ubuntu17.6) ...
  Setting up keyboxd (2.4.4-2ubuntu17.6) ...
  Setting up gnupg (2.4.4-2ubuntu17.6) ...
  Processing triggers for libc-bin (2.39-0ubuntu8.8) ...
  Types: deb
  URIs: https://packages.microsoft.com/repos/azure-cli/
  Suites: noble
  Components: main
  Architectures: amd64
  Signed-by: /etc/apt/keyrings/microsoft.gpg
  Hit:1 https://cli.github.com/packages stable InRelease
  Hit:2 https://deb.nodesource.com/node_24.x nodistro InRelease
  Hit:3 https://packages.microsoft.com/repos/azure-cli noble InRelease
  Hit:4 https://packages.microsoft.com/ubuntu/24.04/prod noble InRelease
  Hit:5 https://prod-cdn.packages.k8s.io/repositories/isv:/kubernetes:/core:/stable:/v1.34/deb  InRelease
  Hit:6 https://dl.google.com/linux/chrome-stable/deb stable InRelease
  Hit:7 http://archive.ubuntu.com/ubuntu noble InRelease
  Hit:9 http://archive.ubuntu.com/ubuntu noble-updates InRelease
  Hit:10 http://security.ubuntu.com/ubuntu noble-security InRelease
  Hit:11 http://archive.ubuntu.com/ubuntu noble-backports InRelease
  Hit:12 https://ppa.launchpadcontent.net/git-core/ppa/ubuntu noble InRelease
  Hit:13 https://ppa.launchpadcontent.net/mozillateam/ppa/ubuntu noble InRelease
  Hit:8 https://packages.buildkite.com/helm-linux/helm-debian/any any InRelease
  Reading package lists...
  Reading package lists...
  Building dependency tree...
  Reading state information...
  The following packages will be upgraded:
    azure-cli
  1 upgraded, 0 newly installed, 0 to remove and 89 not upgraded.
  Need to get 57.1 MB of archives.
  After this operation, 15.8 MB of additional disk space will be used.
  Get:1 https://packages.microsoft.com/repos/azure-cli noble/main amd64 azure-cli amd64 2.91.0-1~noble [57.1 MB]
  debconf: delaying package configuration, since apt-utils is not installed
  Fetched 57.1 MB in 1s (114 MB/s)
  (Reading database ... 
  (Reading database ... 5%
  (Reading database ... 10%
  (Reading database ... 15%
  (Reading database ... 20%
  (Reading database ... 25%
  (Reading database ... 30%
  (Reading database ... 35%
  (Reading database ... 40%
  (Reading database ... 45%
  (Reading database ... 50%
  (Reading database ... 55%
  (Reading database ... 60%
  (Reading database ... 65%
  (Reading database ... 70%
  (Reading database ... 75%
  (Reading database ... 80%
  (Reading database ... 85%
  (Reading database ... 90%
  (Reading database ... 95%
  (Reading database ... 100%
  (Reading database ... 69402 files and directories currently installed.)
  Preparing to unpack .../azure-cli_2.91.0-1~noble_amd64.deb ...
  Unpacking azure-cli (2.91.0-1~noble) over (2.89.0-1~noble) ...
  Setting up azure-cli (2.91.0-1~noble) ...
  Curl executado com sucesso
  [OK] Instalação via repositório Microsoft bem-sucedida.
  az version: { "azure-cli": "2.91.0", "azure-cli-core": "2.91.0", "azure-cli-telemetry": "1.1.0", "extensions": {} }
0s
Run caixagithub/DevSecOps-Actions/.github/util/setting_initial_vars@main
Extrair SIGLA e MODULO
0s
Run REPO_NAME="siarx-backend-autoridade-registro"
46s
Run caixagithub/DevSecOps-Actions/.github/chaintools/dockercontainer/build@main
  with:
    buildContext: /home/runner/_work/siarx-backend-autoridade-registro/siarx-backend-autoridade-registro
    sigla: siarx
    modulo: backend-autoridade-registro
    uses_packages: false
    uses_nexus: false
    client_id_runner: ***
    cloud_provider: azure
    github_token_org: ***
    repository: siarx-backend-autoridade-registro
    command: build
    Dockerfile: ./Dockerfile
  env:
    pythonLocation: /home/runner/_work/_tool/Python/3.11.17/x64
    PKG_CONFIG_PATH: /home/runner/_work/_tool/Python/3.11.17/x64/lib/pkgconfig
    Python_ROOT_DIR: /home/runner/_work/_tool/Python/3.11.17/x64
    Python2_ROOT_DIR: /home/runner/_work/_tool/Python/3.11.17/x64
    Python3_ROOT_DIR: /home/runner/_work/_tool/Python/3.11.17/x64
    LD_LIBRARY_PATH: /home/runner/_work/_tool/Python/3.11.17/x64/lib
    REPOSITORY_ARTIFACTS_APP: NEXUS
    LANGUAGES: ["java"]
    Informe o nome da variavel usada no projeto: Informe o valor referente a esta variavel
    AZ_INSTALL_STATUS: ms_repo_ok
    AZ_VERSION: latest
    INSTALL_PREREQUISITES: true
    AZ_LATEST_VERSION: 2.91.0
Set up QEMU
6s
Run docker/setup-qemu-action@v3
    with:
      image: docker.io/tonistiigi/binfmt:latest
      platforms: all
      cache-image: true
    env:
      pythonLocation: /home/runner/_work/_tool/Python/3.11.17/x64
      PKG_CONFIG_PATH: /home/runner/_work/_tool/Python/3.11.17/x64/lib/pkgconfig
      Python_ROOT_DIR: /home/runner/_work/_tool/Python/3.11.17/x64
      Python2_ROOT_DIR: /home/runner/_work/_tool/Python/3.11.17/x64
      Python3_ROOT_DIR: /home/runner/_work/_tool/Python/3.11.17/x64
      LD_LIBRARY_PATH: /home/runner/_work/_tool/Python/3.11.17/x64/lib
      REPOSITORY_ARTIFACTS_APP: NEXUS
      LANGUAGES: ["java"]
      Informe o nome da variavel usada no projeto: Informe o valor referente a esta variavel
      AZ_INSTALL_STATUS: ms_repo_ok
      AZ_VERSION: latest
      INSTALL_PREREQUISITES: true
      AZ_LATEST_VERSION: 2.91.0
    
Docker info
    (node:3035) [DEP0040] DeprecationWarning: The `punycode` module is deprecated. Please use a userland alternative instead.
    (Use `node --trace-deprecation ...` to show where the warning was created)
    /usr/bin/docker version
    Client:
     Version:           29.3.0
     API version:       1.54
     Go version:        go1.25.7
     Git commit:        5927d80
     Built:             Thu Mar  5 14:24:57 2026
     OS/Arch:           linux/amd64
     Context:           default
    Server: Docker Engine - Community
     Engine:
      Version:          29.9.0
      API version:      1.56 (minimum version 1.40)
      Go version:       go1.26.9
      Git commit:       a5b58c9
      Built:            Thu Oct  8 20:39:33 2026
      OS/Arch:          linux/amd64
      Experimental:     false
     containerd:
      Version:          v2.4.1
      GitCommit:        
     runc:
      Version:          1.5.2
      GitCommit:        v1.5.2-0-g29dd3dc
     docker-init:
      Version:          0.19.0
      GitCommit:        de40ad0
    /usr/bin/docker info
    Client:
     Version:    29.3.0
     Context:    default
     Debug Mode: false
     Plugins:
      buildx: Docker Buildx (Docker Inc.)
        Version:  v0.36.1
        Path:     /usr/local/lib/docker/cli-plugins/docker-buildx
    Server:
     Containers: 0
      Running: 0
      Paused: 0
      Stopped: 0
     Images: 0
     Server Version: 29.9.0
     Storage Driver: overlayfs
      driver-type: io.containerd.snapshotter.v1
     Logging Driver: json-file
     Cgroup Driver: cgroupfs
     Cgroup Version: 2
     Plugins:
      Volume: local
      Network: bridge host ipvlan macvlan null overlay
      Log: awslogs fluentd gcplogs gelf journald json-file local splunk syslog
     CDI spec directories:
      /etc/cdi
      /var/run/cdi
     Swarm: inactive
     Runtimes: io.containerd.runc.v2 runc
     Default Runtime: runc
     Init Binary: docker-init
     containerd version: 
     runc version: v1.5.2-0-g29dd3dc
     init version: de40ad0
     Security Options:
      apparmor
       Profile: default
      seccomp
       Profile: builtin
      cgroupns
     Kernel Version: 6.8.0-1067-azure
     Operating System: Alpine Linux v3.24 (containerized)
     OSType: linux
     Architecture: x86_64
     CPUs: 16
     Total Memory: 31.34GiB
     Name: arc-runner-set-default-nprod-nqlwl-runner-7jdnz
     ID: 9e86183d-2b69-4ba4-b58d-c50851e1c5b8
     Docker Root Dir: /var/lib/docker
     Debug Mode: false
     Experimental: false
     Insecure Registries:
      127.0.0.0/8
      ::1/128
     Live Restore Enabled: false
     Product License: Community Engine
     Firewall Backend: iptables
      EnableUserlandProxy: true
      UserlandProxyPath: /usr/local/bin/docker-proxy
Pulling binfmt Docker image
    /usr/bin/docker pull docker.io/tonistiigi/binfmt:latest
    latest: Pulling from tonistiigi/binfmt
    0c46aa6e9c41: Pulling fs layer
    56685a25fbf3: Pulling fs layer
    0c46aa6e9c41: Download complete
    44136fa355b3: Download complete
    76bf583f0cc9: Download complete
    56685a25fbf3: Download complete
    44136fa355b3: Download complete
    c9e92217fbff: Download complete
    0c46aa6e9c41: Pull complete
    56685a25fbf3: Pull complete
    Digest: sha256:400a4873b838d1b89194d982c45e5fb3cda4593fbfd7e08a02e76b03b21166f0
    Status: Downloaded newer image for tonistiigi/binfmt:latest
    docker.io/tonistiigi/binfmt:latest
    /usr/bin/docker save -o /home/runner/_work/_temp/docker-actions-toolkit-PzFZFf/749e64100d3fa0c09bdbc8a02e4fb9cb3ee64266f7f661c98371040689abacb3.tar docker.io/tonistiigi/binfmt:latest
    Copying /home/runner/_work/_temp/docker-actions-toolkit-PzFZFf/749e64100d3fa0c09bdbc8a02e4fb9cb3ee64266f7f661c98371040689abacb3.tar to /home/runner/.docker/.cache/images/docker.io--tonistiigi--binfmt/latest/linux-x64/image.tar
    Image cached to /home/runner/.docker/.cache/images/docker.io--tonistiigi--binfmt/latest/linux-x64/image.tar
Image info
    /usr/bin/docker image inspect docker.io/tonistiigi/binfmt:latest
    [
        {
            "Id": "sha256:400a4873b838d1b89194d982c45e5fb3cda4593fbfd7e08a02e76b03b21166f0",
            "RepoTags": [
                "tonistiigi/binfmt:latest"
            ],
            "RepoDigests": [
                "tonistiigi/binfmt@sha256:400a4873b838d1b89194d982c45e5fb3cda4593fbfd7e08a02e76b03b21166f0"
            ],
            "Comment": "buildkit.dockerfile.v0",
            "Created": "2026-06-05T19:12:02.167333037Z",
            "Config": {
                "Env": [
                    "PATH=/usr/local/sbin:/usr/local/bin:/usr/sbin:/usr/bin:/sbin:/bin",
                    "QEMU_PRESERVE_ARGV0=1"
                ],
                "Entrypoint": [
                    "/usr/bin/binfmt"
                ],
                "Volumes": {
                    "/tmp": {}
                },
                "WorkingDir": "/"
            },
            "Architecture": "amd64",
            "Os": "linux",
            "Size": 118038494,
            "RootFS": {
                "Type": "layers",
                "Layers": [
                    "sha256:c747b796d990a647df062f87e24f1ef5e4a90a312cd9c4ae8b7d09667d57befb",
                    "sha256:6d831b0f477d9df7afe18e5a65c97e8084fef8fe10c2930b65f728ab68d0bb5b"
                ]
            },
            "Metadata": {
                "LastTagTime": "2026-10-15T13:16:22.782280357Z"
            },
            "Descriptor": {
                "mediaType": "application/vnd.oci.image.index.v1+json",
                "digest": "sha256:400a4873b838d1b89194d982c45e5fb3cda4593fbfd7e08a02e76b03b21166f0",
                "size": 6774
            },
            "Identity": {
                "Signature": [
                    {
                        "Name": "Docker GitHub Builder (tonistiigi/binfmt@master)",
                        "Timestamps": [
                            {
                                "Type": "Tlog",
                                "URI": "https://rekor.sigstore.dev",
                                "Timestamp": "2026-06-08T09:31:17Z"
                            },
                            {
                                "Type": "TimestampAuthority",
                                "URI": "https://timestamp.sigstore.dev/api/v1/timestamp",
                                "Timestamp": "2026-06-08T09:31:17Z"
                            }
                        ],
                        "Signer": {
                            "CertificateIssuer": "CN=sigstore-intermediate,O=sigstore.dev",
                            "SubjectAlternativeName": "https://github.com/docker/github-builder/.github/workflows/bake.yml@70ac3fc303efa83d2b94905e6ab78bb83cbdc2ae",
                            "Issuer": "https://token.actions.githubusercontent.com",
                            "BuildSignerURI": "https://github.com/docker/github-builder/.github/workflows/bake.yml@70ac3fc303efa83d2b94905e6ab78bb83cbdc2ae",
                            "BuildSignerDigest": "70ac3fc303efa83d2b94905e6ab78bb83cbdc2ae",
                            "RunnerEnvironment": "github-hosted",
                            "SourceRepositoryURI": "https://github.com/tonistiigi/binfmt",
                            "SourceRepositoryDigest": "e29e7d72c9672c8c8bf846655ab149b50e1a62bd",
                            "SourceRepositoryRef": "refs/heads/master",
                            "SourceRepositoryIdentifier": "243668393",
                            "SourceRepositoryOwnerURI": "https://github.com/tonistiigi",
                            "SourceRepositoryOwnerIdentifier": "585223",
                            "BuildConfigURI": "https://github.com/tonistiigi/binfmt/.github/workflows/release.yml@refs/heads/master",
                            "BuildConfigDigest": "e29e7d72c9672c8c8bf846655ab149b50e1a62bd",
                            "BuildTrigger": "workflow_dispatch",
                            "RunInvocationURI": "https://github.com/tonistiigi/binfmt/actions/runs/27128419115/attempts/1",
                            "SourceRepositoryVisibilityAtSigning": "public"
                        },
                        "SignatureType": "bundle-v0.3"
                    }
                ],
                "Pull": [
                    {
                        "Repository": "docker.io/tonistiigi/binfmt"
                    }
                ]
            }
        }
    ]
Binfmt version
    /usr/bin/docker run --rm --privileged docker.io/tonistiigi/binfmt:latest --version
    binfmt/e29e7d7 qemu/v10.2.3 go/1.26.4
Installing QEMU static binaries
    /usr/bin/docker run --rm --privileged docker.io/tonistiigi/binfmt:latest --install all
    {
      "supported": [
        "linux/amd64",
        "linux/amd64/v2",
        "linux/amd64/v3",
        "linux/amd64/v4",
        "linux/arm64",
        "linux/riscv64",
        "linux/ppc64le",
        "linux/s390x",
        "linux/386",
        "linux/mips64le",
        "linux/mips64",
        "linux/loong64",
        "linux/arm/v7",
        "linux/arm/v6"
      ],
      "emulators": [
        "python3.12",
        "qemu-aarch64",
        "qemu-arm",
        "qemu-loongarch64",
        "qemu-mips64",
        "qemu-mips64el",
        "qemu-ppc64le",
        "qemu-riscv64",
        "qemu-s390x"
      ]
    }
Extracting available platforms
Set up Docker Buildx
8s
Run docker/setup-buildx-action@v3
    with:
      driver: docker-container
      use: true
      keep-state: false
      cache-binary: true
      cleanup: true
      install: false
    env:
      pythonLocation: /home/runner/_work/_tool/Python/3.11.17/x64
      PKG_CONFIG_PATH: /home/runner/_work/_tool/Python/3.11.17/x64/lib/pkgconfig
      Python_ROOT_DIR: /home/runner/_work/_tool/Python/3.11.17/x64
      Python2_ROOT_DIR: /home/runner/_work/_tool/Python/3.11.17/x64
      Python3_ROOT_DIR: /home/runner/_work/_tool/Python/3.11.17/x64
      LD_LIBRARY_PATH: /home/runner/_work/_tool/Python/3.11.17/x64/lib
      REPOSITORY_ARTIFACTS_APP: NEXUS
      LANGUAGES: ["java"]
      Informe o nome da variavel usada no projeto: Informe o valor referente a esta variavel
      AZ_INSTALL_STATUS: ms_repo_ok
      AZ_VERSION: latest
      INSTALL_PREREQUISITES: true
      AZ_LATEST_VERSION: 2.91.0
    
  (node:3140) [DEP0040] DeprecationWarning: The `punycode` module is deprecated. Please use a userland alternative instead.
  (Use `node --trace-deprecation ...` to show where the warning was created)
Docker info
    /usr/bin/docker version
    Client:
     Version:           29.3.0
     API version:       1.54
     Go version:        go1.25.7
     Git commit:        5927d80
     Built:             Thu Mar  5 14:24:57 2026
     OS/Arch:           linux/amd64
     Context:           default
    Server: Docker Engine - Community
     Engine:
      Version:          29.9.0
      API version:      1.56 (minimum version 1.40)
      Go version:       go1.26.9
      Git commit:       a5b58c9
      Built:            Thu Oct  8 20:39:33 2026
      OS/Arch:          linux/amd64
      Experimental:     false
     containerd:
      Version:          v2.4.1
      GitCommit:        
     runc:
      Version:          1.5.2
      GitCommit:        v1.5.2-0-g29dd3dc
     docker-init:
      Version:          0.19.0
      GitCommit:        de40ad0
    /usr/bin/docker info
    Client:
     Version:    29.3.0
     Context:    default
     Debug Mode: false
     Plugins:
      buildx: Docker Buildx (Docker Inc.)
        Version:  v0.36.1
        Path:     /usr/local/lib/docker/cli-plugins/docker-buildx
    Server:
     Containers: 0
      Running: 0
      Paused: 0
      Stopped: 0
     Images: 1
     Server Version: 29.9.0
     Storage Driver: overlayfs
      driver-type: io.containerd.snapshotter.v1
     Logging Driver: json-file
     Cgroup Driver: cgroupfs
     Cgroup Version: 2
     Plugins:
      Volume: local
      Network: bridge host ipvlan macvlan null overlay
      Log: awslogs fluentd gcplogs gelf journald json-file local splunk syslog
     CDI spec directories:
      /etc/cdi
      /var/run/cdi
     Swarm: inactive
     Runtimes: io.containerd.runc.v2 runc
     Default Runtime: runc
     Init Binary: docker-init
     containerd version: 
     runc version: v1.5.2-0-g29dd3dc
     init version: de40ad0
     Security Options:
      apparmor
       Profile: default
      seccomp
       Profile: builtin
      cgroupns
     Kernel Version: 6.8.0-1067-azure
     Operating System: Alpine Linux v3.24 (containerized)
     OSType: linux
     Architecture: x86_64
     CPUs: 16
     Total Memory: 31.34GiB
     Name: arc-runner-set-default-nprod-nqlwl-runner-7jdnz
     ID: 9e86183d-2b69-4ba4-b58d-c50851e1c5b8
     Docker Root Dir: /var/lib/docker
     Debug Mode: false
     Experimental: false
     Insecure Registries:
      127.0.0.0/8
      ::1/128
     Live Restore Enabled: false
     Product License: Community Engine
     Firewall Backend: iptables
      EnableUserlandProxy: true
      UserlandProxyPath: /usr/local/bin/docker-proxy
Buildx version
Inspecting default docker context
Creating a new builder instance
    /usr/bin/docker buildx create --name builder-68d1f00b-dfb7-4524-a989-47cbd7a6832a --driver docker-container --buildkitd-flags --allow-insecure-entitlement security.insecure --allow-insecure-entitlement network.host --use
    builder-68d1f00b-dfb7-4524-a989-47cbd7a6832a
Booting builder
    /usr/bin/docker buildx inspect --bootstrap --builder builder-68d1f00b-dfb7-4524-a989-47cbd7a6832a
    #1 [internal] booting buildkit
    #1 pulling image moby/buildkit:buildx-stable-1
    #1 pulling image moby/buildkit:buildx-stable-1 4.5s done
    #1 creating container buildx_buildkit_builder-68d1f00b-dfb7-4524-a989-47cbd7a6832a0
    #1 creating container buildx_buildkit_builder-68d1f00b-dfb7-4524-a989-47cbd7a6832a0 1.4s done
    #1 DONE 6.0s
    Name:          builder-68d1f00b-dfb7-4524-a989-47cbd7a6832a
    Driver:        docker-container
    Last Activity: 2026-10-15 13:16:26 +0000 UTC
    Nodes:
    Name:                  builder-68d1f00b-dfb7-4524-a989-47cbd7a6832a0
    Endpoint:              unix:///var/run/docker.sock
    Status:                running
    BuildKit daemon flags: --allow-insecure-entitlement security.insecure --allow-insecure-entitlement network.host
    BuildKit version:      v0.33.1
    Platforms:             linux/amd64, linux/amd64/v2, linux/amd64/v3, linux/amd64/v4, linux/arm64, linux/riscv64, linux/ppc64le, linux/s390x, linux/386, linux/mips64le, linux/mips64, linux/loong64, linux/arm/v7, linux/arm/v6
    Labels:
     org.mobyproject.buildkit.worker.executor:         oci
     org.mobyproject.buildkit.worker.hostname:         ec1f7efc4609
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
     Reserved Space: 9.313GiB
     Max Used Space: 92.2GiB
     Min Free Space: 23.28GiB
    GC Policy rule#2:
     All:            false
     Reserved Space: 9.313GiB
     Max Used Space: 92.2GiB
     Min Free Space: 23.28GiB
    GC Policy rule#3:
     All:            true
     Reserved Space: 9.313GiB
     Max Used Space: 92.2GiB
     Min Free Space: 23.28GiB
Inspect builder
    {
      "nodes": [
        {
          "name": "builder-68d1f00b-dfb7-4524-a989-47cbd7a6832a0",
          "endpoint": "unix:///var/run/docker.sock",
          "status": "running",
          "buildkitd-flags": "--allow-insecure-entitlement security.insecure --allow-insecure-entitlement network.host",
          "buildkit": "v0.33.1",
          "platforms": "linux/amd64,linux/amd64/v2,linux/amd64/v3,linux/amd64/v4,linux/arm64,linux/riscv64,linux/ppc64le,linux/s390x,linux/386,linux/mips64le,linux/mips64,linux/loong64,linux/arm/v7,linux/arm/v6",
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
            "org.mobyproject.buildkit.worker.hostname": "ec1f7efc4609",
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
              "reservedSpace": "9.313GiB",
              "maxUsedSpace": "92.2GiB",
              "minFreeSpace": "23.28GiB"
            },
            {
              "all": false,
              "reservedSpace": "9.313GiB",
              "maxUsedSpace": "92.2GiB",
              "minFreeSpace": "23.28GiB"
            },
            {
              "all": true,
              "reservedSpace": "9.313GiB",
              "maxUsedSpace": "92.2GiB",
              "minFreeSpace": "23.28GiB"
            }
          ]
        }
      ],
      "name": "builder-68d1f00b-dfb7-4524-a989-47cbd7a6832a",
      "driver": "docker-container",
      "lastActivity": "2026-10-15T13:16:26.000Z"
    }
BuildKit version
Connecting on Registry
3s
Run set -euo pipefail
  Connecting to Azure Container Registry...
  WARNING: Note: The token in both the accessToken and refreshToken fields is an ACR Refresh Token, not an ACR Access Token. This ACR Refresh Token cannot be used directly to authenticate with registry APIs such as pushing/pulling images and listing repositories/tags. This ACR Refresh Token must be subsequently exchanged for an ACR Access.Please see https://aka.ms/acr/auth/oauth
  WARNING: You can perform manual login using the provided refresh token below, for example: 'docker login loginServer -u 00000000-0000-0000-0000-000000000000 -p refreshToken'
  IMAGE=acrcentralcaixanprd.azurecr.io/siarx/backend-autoridade-registro/siarx-backend-autoridade-registro
Login to Docker
1s
Run docker/login-action@v3
    
  Logging into acrcentralcaixanprd.azurecr.io...
  (node:3485) [DEP0040] DeprecationWarning: The `punycode` module is deprecated. Please use a userland alternative instead.
  (Use `node --trace-deprecation ...` to show where the warning was created)
  Login Succeeded!
Docker meta
2s
Run docker/metadata-action@v5
    
  (node:3508) [DEP0040] DeprecationWarning: The `punycode` module is deprecated. Please use a userland alternative instead.
  (Use `node --trace-deprecation ...` to show where the warning was created)
Context info
    eventName: workflow_dispatch
    sha: fde1b59103fc55ad724570a9b2a85434905d944a
    ref: refs/heads/main
    workflow: CI/CD Workflow Generic
    action: docker_build
    actor: p585600_caixa
    runNumber: 2
    runId: 38740866749
    commitDate: Wed Sep 09 2026 18:06:15 GMT+0000 (Coordinated Universal Time)
Processing images input
    name=acrcentralcaixanprd.azurecr.io/siarx/backend-autoridade-registro/siarx-backend-autoridade-registro,enable=true
Processing tags input
    type=ref,event=tag,enable=false,priority=600
    type=raw,enable=true,value=38740866749,priority=200
Processing flavor input
    latest=false
    prefix=
    prefixLatest=false
    suffix=
    suffixLatest=false
Docker image version
    38740866749
Docker tags
    acrcentralcaixanprd.azurecr.io/siarx/backend-autoridade-registro/siarx-backend-autoridade-registro:38740866749
Docker labels
    org.opencontainers.image.created=2026-10-15T13:16:38.864Z
    org.opencontainers.image.description=Adicionando aplicação: siarx-backend-autoridade-registro
    org.opencontainers.image.licenses=
    org.opencontainers.image.revision=fde1b59103fc55ad724570a9b2a85434905d944a
    org.opencontainers.image.source=https://github.com/caixagithub/siarx-backend-autoridade-registro
    org.opencontainers.image.title=siarx-backend-autoridade-registro
    org.opencontainers.image.url=https://github.com/caixagithub/siarx-backend-autoridade-registro
    org.opencontainers.image.version=38740866749
Annotations
    manifest:org.opencontainers.image.created=2026-10-15T13:16:38.864Z
    manifest:org.opencontainers.image.description=Adicionando aplicação: siarx-backend-autoridade-registro
    manifest:org.opencontainers.image.licenses=
    manifest:org.opencontainers.image.revision=fde1b59103fc55ad724570a9b2a85434905d944a
    manifest:org.opencontainers.image.source=https://github.com/caixagithub/siarx-backend-autoridade-registro
    manifest:org.opencontainers.image.title=siarx-backend-autoridade-registro
    manifest:org.opencontainers.image.url=https://github.com/caixagithub/siarx-backend-autoridade-registro
    manifest:org.opencontainers.image.version=38740866749
JSON output
    {
      "tags": [
        "acrcentralcaixanprd.azurecr.io/siarx/backend-autoridade-registro/siarx-backend-autoridade-registro:38740866749"
      ],
      "tag-names": [
        "38740866749"
      ],
      "labels": {
        "org.opencontainers.image.created": "2026-10-15T13:16:38.864Z",
        "org.opencontainers.image.description": "Adicionando aplicação: siarx-backend-autoridade-registro",
        "org.opencontainers.image.licenses": "",
        "org.opencontainers.image.revision": "fde1b59103fc55ad724570a9b2a85434905d944a",
        "org.opencontainers.image.source": "https://github.com/caixagithub/siarx-backend-autoridade-registro",
        "org.opencontainers.image.title": "siarx-backend-autoridade-registro",
        "org.opencontainers.image.url": "https://github.com/caixagithub/siarx-backend-autoridade-registro",
        "org.opencontainers.image.version": "38740866749"
      },
      "annotations": [
        "manifest:org.opencontainers.image.created=2026-10-15T13:16:38.864Z",
        "manifest:org.opencontainers.image.description=Adicionando aplicação: siarx-backend-autoridade-registro",
        "manifest:org.opencontainers.image.licenses=",
        "manifest:org.opencontainers.image.revision=fde1b59103fc55ad724570a9b2a85434905d944a",
        "manifest:org.opencontainers.image.source=https://github.com/caixagithub/siarx-backend-autoridade-registro",
        "manifest:org.opencontainers.image.title=siarx-backend-autoridade-registro",
        "manifest:org.opencontainers.image.url=https://github.com/caixagithub/siarx-backend-autoridade-registro",
        "manifest:org.opencontainers.image.version=38740866749"
      ]
    }
Bake file definition (tags)
    {
      "target": {
        "docker-metadata-action": {
          "tags": [
            "acrcentralcaixanprd.azurecr.io/siarx/backend-autoridade-registro/siarx-backend-autoridade-registro:38740866749"
          ],
          "args": {
            "DOCKER_META_IMAGES": "acrcentralcaixanprd.azurecr.io/siarx/backend-autoridade-registro/siarx-backend-autoridade-registro",
            "DOCKER_META_VERSION": "38740866749"
          }
        }
      }
    }
Bake file definition (labels)
    {
      "target": {
        "docker-metadata-action": {
          "labels": {
            "org.opencontainers.image.created": "2026-10-15T13:16:38.864Z",
            "org.opencontainers.image.description": "Adicionando aplicação: siarx-backend-autoridade-registro",
            "org.opencontainers.image.licenses": "",
            "org.opencontainers.image.revision": "fde1b59103fc55ad724570a9b2a85434905d944a",
            "org.opencontainers.image.source": "https://github.com/caixagithub/siarx-backend-autoridade-registro",
            "org.opencontainers.image.title": "siarx-backend-autoridade-registro",
            "org.opencontainers.image.url": "https://github.com/caixagithub/siarx-backend-autoridade-registro",
            "org.opencontainers.image.version": "38740866749"
          }
        }
      }
    }
Bake file definition (annotations)
    {
      "target": {
        "docker-metadata-action": {
          "annotations": [
            "manifest:org.opencontainers.image.created=2026-10-15T13:16:38.864Z",
            "manifest:org.opencontainers.image.description=Adicionando aplicação: siarx-backend-autoridade-registro",
            "manifest:org.opencontainers.image.licenses=",
            "manifest:org.opencontainers.image.revision=fde1b59103fc55ad724570a9b2a85434905d944a",
            "manifest:org.opencontainers.image.source=https://github.com/caixagithub/siarx-backend-autoridade-registro",
            "manifest:org.opencontainers.image.title=siarx-backend-autoridade-registro",
            "manifest:org.opencontainers.image.url=https://github.com/caixagithub/siarx-backend-autoridade-registro",
            "manifest:org.opencontainers.image.version=38740866749"
          ]
        }
      }
    }
Checkout DevSecOps config repo
2s
Run actions/checkout@v5
    with:
      repository: caixagithub/devsecops-actions
      ref: main
      path: actions
      token: ***
      persist-credentials: false
      ssh-strict: true
      ssh-user: git
      clean: true
      sparse-checkout-cone-mode: true
      fetch-depth: 1
      fetch-tags: false
      show-progress: true
      lfs: false
      submodules: false
      set-safe-directory: true
      allow-unsafe-pr-checkout: false
    env:
      pythonLocation: /home/runner/_work/_tool/Python/3.11.17/x64
      PKG_CONFIG_PATH: /home/runner/_work/_tool/Python/3.11.17/x64/lib/pkgconfig
      Python_ROOT_DIR: /home/runner/_work/_tool/Python/3.11.17/x64
      Python2_ROOT_DIR: /home/runner/_work/_tool/Python/3.11.17/x64
      Python3_ROOT_DIR: /home/runner/_work/_tool/Python/3.11.17/x64
      LD_LIBRARY_PATH: /home/runner/_work/_tool/Python/3.11.17/x64/lib
      REPOSITORY_ARTIFACTS_APP: NEXUS
      LANGUAGES: ["java"]
      Informe o nome da variavel usada no projeto: Informe o valor referente a esta variavel
      AZ_INSTALL_STATUS: ms_repo_ok
      AZ_VERSION: latest
      INSTALL_PREREQUISITES: true
      AZ_LATEST_VERSION: 2.91.0
      DOCKER_METADATA_OUTPUT_VERSION: 38740866749
      DOCKER_METADATA_OUTPUT_TAGS: acrcentralcaixanprd.azurecr.io/siarx/backend-autoridade-registro/siarx-backend-autoridade-registro:38740866749
      DOCKER_METADATA_OUTPUT_TAG_NAMES: 38740866749
      DOCKER_METADATA_OUTPUT_LABELS: org.opencontainers.image.created=2026-10-15T13:16:38.864Z
    org.opencontainers.image.description=Adicionando aplicação: siarx-backend-autoridade-registro
    org.opencontainers.image.licenses=
    org.opencontainers.image.revision=fde1b59103fc55ad724570a9b2a85434905d944a
    org.opencontainers.image.source=https://github.com/caixagithub/siarx-backend-autoridade-registro
    org.opencontainers.image.title=siarx-backend-autoridade-registro
    org.opencontainers.image.url=https://github.com/caixagithub/siarx-backend-autoridade-registro
    org.opencontainers.image.version=38740866749
      DOCKER_METADATA_OUTPUT_ANNOTATIONS: manifest:org.opencontainers.image.created=2026-10-15T13:16:38.864Z
    manifest:org.opencontainers.image.description=Adicionando aplicação: siarx-backend-autoridade-registro
    manifest:org.opencontainers.image.licenses=
    manifest:org.opencontainers.image.revision=fde1b59103fc55ad724570a9b2a85434905d944a
    manifest:org.opencontainers.image.source=https://github.com/caixagithub/siarx-backend-autoridade-registro
    manifest:org.opencontainers.image.title=siarx-backend-autoridade-registro
    manifest:org.opencontainers.image.url=https://github.com/caixagithub/siarx-backend-autoridade-registro
    manifest:org.opencontainers.image.version=38740866749
      DOCKER_METADATA_OUTPUT_JSON: {"tags":["acrcentralcaixanprd.azurecr.io/siarx/backend-autoridade-registro/siarx-backend-autoridade-registro:38740866749"],"tag-names":["38740866749"],"labels":{"org.opencontainers.image.created":"2026-10-15T13:16:38.864Z","org.opencontainers.image.description":"Adicionando aplicação: siarx-backend-autoridade-registro","org.opencontainers.image.licenses":"","org.opencontainers.image.revision":"fde1b59103fc55ad724570a9b2a85434905d944a","org.opencontainers.image.source":"https://github.com/caixagithub/siarx-backend-autoridade-registro","org.opencontainers.image.title":"siarx-backend-autoridade-registro","org.opencontainers.image.url":"https://github.com/caixagithub/siarx-backend-autoridade-registro","org.opencontainers.image.version":"38740866749"},"annotations":["manifest:org.opencontainers.image.created=2026-10-15T13:16:38.864Z","manifest:org.opencontainers.image.description=Adicionando aplicação: siarx-backend-autoridade-registro","manifest:org.opencontainers.image.licenses=","
      DOCKER_METADATA_OUTPUT_BAKE_FILE_TAGS: /home/runner/_work/_temp/docker-actions-toolkit-huXD1u/docker-metadata-action-bake-tags.json
      DOCKER_METADATA_OUTPUT_BAKE_FILE_LABELS: /home/runner/_work/_temp/docker-actions-toolkit-huXD1u/docker-metadata-action-bake-labels.json
      DOCKER_METADATA_OUTPUT_BAKE_FILE_ANNOTATIONS: /home/runner/_work/_temp/docker-actions-toolkit-huXD1u/docker-metadata-action-bake-annotations.json
      DOCKER_METADATA_OUTPUT_BAKE_FILE: /home/runner/_work/_temp/docker-actions-toolkit-huXD1u/docker-metadata-action-bake.json
    
  Syncing repository: caixagithub/devsecops-actions
Getting Git version info
    Working directory is '/home/runner/_work/siarx-backend-autoridade-registro/siarx-backend-autoridade-registro/actions'
    /usr/bin/git version
    git version 2.55.0
  Temporarily overriding HOME='/home/runner/_work/_temp/02e3c7b5-00a9-4e41-8e19-78445e73722d' before making global git config changes
  Adding repository directory to the temporary git global config as a safe directory
  /usr/bin/git config --global --add safe.directory /home/runner/_work/siarx-backend-autoridade-registro/siarx-backend-autoridade-registro/actions
Initializing the repository
    /usr/bin/git init /home/runner/_work/siarx-backend-autoridade-registro/siarx-backend-autoridade-registro/actions
    hint: Using 'master' as the name for the initial branch. This default branch name
    hint: will change to "main" in Git 3.0. To configure the initial branch name
    hint: to use in all of your new repositories, which will suppress this warning,
    hint: call:
    hint:
    hint: 	git config --global init.defaultBranch <name>
    hint:
    hint: Names commonly chosen instead of 'master' are 'main', 'trunk' and
    hint: 'development'. The just-created branch can be renamed via this command:
    hint:
    hint: 	git branch -m <name>
    hint:
    hint: Disable this message with "git config set advice.defaultBranchName false"
    Initialized empty Git repository in /home/runner/_work/siarx-backend-autoridade-registro/siarx-backend-autoridade-registro/actions/.git/
    /usr/bin/git remote add origin https://github.com/caixagithub/devsecops-actions
Disabling automatic garbage collection
    /usr/bin/git config --local gc.auto 0
Setting up auth
    /usr/bin/git config --local --name-only --get-regexp core\.sshCommand
    /usr/bin/git submodule foreach --recursive sh -c "git config --local --name-only --get-regexp 'core\.sshCommand' && git config --local --unset-all 'core.sshCommand' || :"
    /usr/bin/git config --local --name-only --get-regexp http\.https\:\/\/github\.com\/\.extraheader
    /usr/bin/git submodule foreach --recursive sh -c "git config --local --name-only --get-regexp 'http\.https\:\/\/github\.com\/\.extraheader' && git config --local --unset-all 'http.https://github.com/.extraheader' || :"
    /usr/bin/git config --local --name-only --get-regexp ^includeIf\.gitdir:
    /usr/bin/git submodule foreach --recursive git config --local --show-origin --name-only --get-regexp remote.origin.url
    /usr/bin/git config --local http.https://github.com/.extraheader AUTHORIZATION: basic ***
Fetching the repository
    /usr/bin/git -c protocol.version=2 fetch --no-tags --prune --no-recurse-submodules --depth=1 origin +refs/heads/main*:refs/remotes/origin/main* +refs/tags/main*:refs/tags/main*
    From https://github.com/caixagithub/devsecops-actions
     * [new branch]      main               -> origin/main
     * [new branch]      main-back-20260901 -> origin/main-back-20260901
     * [new branch]      mainframe          -> origin/mainframe
Determining the checkout info
  /usr/bin/git sparse-checkout disable
  /usr/bin/git config --local --unset-all extensions.worktreeConfig
Checking out the ref
  /usr/bin/git log -1 --format=%H
  a79e586c597725d00f0e476029ded8413b6f0151
Removing auth
Localiza arquivos nexus
0s
Run find actions -name 'settings.xml'
  actions/config/maven/settings.xml
  actions/config/certs/binario.jks
Show nexus
0s
Run find actions -name 'nexus_to_dockerfile.sh'
    find actions -name 'nexus_to_dockerfile.sh'
    shell: /usr/bin/bash --noprofile --norc -e -o pipefail {0}
    env:
      pythonLocation: /home/runner/_work/_tool/Python/3.11.17/x64
      PKG_CONFIG_PATH: /home/runner/_work/_tool/Python/3.11.17/x64/lib/pkgconfig
      Python_ROOT_DIR: /home/runner/_work/_tool/Python/3.11.17/x64
      Python2_ROOT_DIR: /home/runner/_work/_tool/Python/3.11.17/x64
      Python3_ROOT_DIR: /home/runner/_work/_tool/Python/3.11.17/x64
      LD_LIBRARY_PATH: /home/runner/_work/_tool/Python/3.11.17/x64/lib
      REPOSITORY_ARTIFACTS_APP: NEXUS
      LANGUAGES: ["java"]
      Informe o nome da variavel usada no projeto: Informe o valor referente a esta variavel
      AZ_INSTALL_STATUS: ms_repo_ok
      AZ_VERSION: latest
      INSTALL_PREREQUISITES: true
      AZ_LATEST_VERSION: 2.91.0
      DOCKER_METADATA_OUTPUT_VERSION: 38740866749
      DOCKER_METADATA_OUTPUT_TAGS: acrcentralcaixanprd.azurecr.io/siarx/backend-autoridade-registro/siarx-backend-autoridade-registro:38740866749
      DOCKER_METADATA_OUTPUT_TAG_NAMES: 38740866749
      DOCKER_METADATA_OUTPUT_LABELS: org.opencontainers.image.created=2026-10-15T13:16:38.864Z
    org.opencontainers.image.description=Adicionando aplicação: siarx-backend-autoridade-registro
    org.opencontainers.image.licenses=
    org.opencontainers.image.revision=fde1b59103fc55ad724570a9b2a85434905d944a
    org.opencontainers.image.source=https://github.com/caixagithub/siarx-backend-autoridade-registro
    org.opencontainers.image.title=siarx-backend-autoridade-registro
    org.opencontainers.image.url=https://github.com/caixagithub/siarx-backend-autoridade-registro
    org.opencontainers.image.version=38740866749
      DOCKER_METADATA_OUTPUT_ANNOTATIONS: manifest:org.opencontainers.image.created=2026-10-15T13:16:38.864Z
    manifest:org.opencontainers.image.description=Adicionando aplicação: siarx-backend-autoridade-registro
    manifest:org.opencontainers.image.licenses=
    manifest:org.opencontainers.image.revision=fde1b59103fc55ad724570a9b2a85434905d944a
    manifest:org.opencontainers.image.source=https://github.com/caixagithub/siarx-backend-autoridade-registro
    manifest:org.opencontainers.image.title=siarx-backend-autoridade-registro
    manifest:org.opencontainers.image.url=https://github.com/caixagithub/siarx-backend-autoridade-registro
    manifest:org.opencontainers.image.version=38740866749
      DOCKER_METADATA_OUTPUT_JSON: {"tags":["acrcentralcaixanprd.azurecr.io/siarx/backend-autoridade-registro/siarx-backend-autoridade-registro:38740866749"],"tag-names":["38740866749"],"labels":{"org.opencontainers.image.created":"2026-10-15T13:16:38.864Z","org.opencontainers.image.description":"Adicionando aplicação: siarx-backend-autoridade-registro","org.opencontainers.image.licenses":"","org.opencontainers.image.revision":"fde1b59103fc55ad724570a9b2a85434905d944a","org.opencontainers.image.source":"https://github.com/caixagithub/siarx-backend-autoridade-registro","org.opencontainers.image.title":"siarx-backend-autoridade-registro","org.opencontainers.image.url":"https://github.com/caixagithub/siarx-backend-autoridade-registro","org.opencontainers.image.version":"38740866749"},"annotations":["manifest:org.opencontainers.image.created=2026-10-15T13:16:38.864Z","manifest:org.opencontainers.image.description=Adicionando aplicação: siarx-backend-autoridade-registro","manifest:org.opencontainers.image.licenses=","
      DOCKER_METADATA_OUTPUT_BAKE_FILE_TAGS: /home/runner/_work/_temp/docker-actions-toolkit-huXD1u/docker-metadata-action-bake-tags.json
      DOCKER_METADATA_OUTPUT_BAKE_FILE_LABELS: /home/runner/_work/_temp/docker-actions-toolkit-huXD1u/docker-metadata-action-bake-labels.json
      DOCKER_METADATA_OUTPUT_BAKE_FILE_ANNOTATIONS: /home/runner/_work/_temp/docker-actions-toolkit-huXD1u/docker-metadata-action-bake-annotations.json
      DOCKER_METADATA_OUTPUT_BAKE_FILE: /home/runner/_work/_temp/docker-actions-toolkit-huXD1u/docker-metadata-action-bake.json
    
  actions/src/scripts/nexus_to_dockerfile.sh
Inject nexus repo
0s
Run chmod +x actions/src/scripts/nexus_to_dockerfile.sh
    chmod +x actions/src/scripts/nexus_to_dockerfile.sh
    ./actions/src/scripts/nexus_to_dockerfile.sh
    shell: /usr/bin/bash --noprofile --norc -e -o pipefail {0}
    env:
      pythonLocation: /home/runner/_work/_tool/Python/3.11.17/x64
      PKG_CONFIG_PATH: /home/runner/_work/_tool/Python/3.11.17/x64/lib/pkgconfig
      Python_ROOT_DIR: /home/runner/_work/_tool/Python/3.11.17/x64
      Python2_ROOT_DIR: /home/runner/_work/_tool/Python/3.11.17/x64
      Python3_ROOT_DIR: /home/runner/_work/_tool/Python/3.11.17/x64
      LD_LIBRARY_PATH: /home/runner/_work/_tool/Python/3.11.17/x64/lib
      REPOSITORY_ARTIFACTS_APP: NEXUS
      LANGUAGES: ["java"]
      Informe o nome da variavel usada no projeto: Informe o valor referente a esta variavel
      AZ_INSTALL_STATUS: ms_repo_ok
      AZ_VERSION: latest
      INSTALL_PREREQUISITES: true
      AZ_LATEST_VERSION: 2.91.0
      DOCKER_METADATA_OUTPUT_VERSION: 38740866749
      DOCKER_METADATA_OUTPUT_TAGS: acrcentralcaixanprd.azurecr.io/siarx/backend-autoridade-registro/siarx-backend-autoridade-registro:38740866749
      DOCKER_METADATA_OUTPUT_TAG_NAMES: 38740866749
      DOCKER_METADATA_OUTPUT_LABELS: org.opencontainers.image.created=2026-10-15T13:16:38.864Z
    org.opencontainers.image.description=Adicionando aplicação: siarx-backend-autoridade-registro
    org.opencontainers.image.licenses=
    org.opencontainers.image.revision=fde1b59103fc55ad724570a9b2a85434905d944a
    org.opencontainers.image.source=https://github.com/caixagithub/siarx-backend-autoridade-registro
    org.opencontainers.image.title=siarx-backend-autoridade-registro
    org.opencontainers.image.url=https://github.com/caixagithub/siarx-backend-autoridade-registro
    org.opencontainers.image.version=38740866749
      DOCKER_METADATA_OUTPUT_ANNOTATIONS: manifest:org.opencontainers.image.created=2026-10-15T13:16:38.864Z
    manifest:org.opencontainers.image.description=Adicionando aplicação: siarx-backend-autoridade-registro
    manifest:org.opencontainers.image.licenses=
    manifest:org.opencontainers.image.revision=fde1b59103fc55ad724570a9b2a85434905d944a
    manifest:org.opencontainers.image.source=https://github.com/caixagithub/siarx-backend-autoridade-registro
    manifest:org.opencontainers.image.title=siarx-backend-autoridade-registro
    manifest:org.opencontainers.image.url=https://github.com/caixagithub/siarx-backend-autoridade-registro
    manifest:org.opencontainers.image.version=38740866749
      DOCKER_METADATA_OUTPUT_JSON: {"tags":["acrcentralcaixanprd.azurecr.io/siarx/backend-autoridade-registro/siarx-backend-autoridade-registro:38740866749"],"tag-names":["38740866749"],"labels":{"org.opencontainers.image.created":"2026-10-15T13:16:38.864Z","org.opencontainers.image.description":"Adicionando aplicação: siarx-backend-autoridade-registro","org.opencontainers.image.licenses":"","org.opencontainers.image.revision":"fde1b59103fc55ad724570a9b2a85434905d944a","org.opencontainers.image.source":"https://github.com/caixagithub/siarx-backend-autoridade-registro","org.opencontainers.image.title":"siarx-backend-autoridade-registro","org.opencontainers.image.url":"https://github.com/caixagithub/siarx-backend-autoridade-registro","org.opencontainers.image.version":"38740866749"},"annotations":["manifest:org.opencontainers.image.created=2026-10-15T13:16:38.864Z","manifest:org.opencontainers.image.description=Adicionando aplicação: siarx-backend-autoridade-registro","manifest:org.opencontainers.image.licenses=","
      DOCKER_METADATA_OUTPUT_BAKE_FILE_TAGS: /home/runner/_work/_temp/docker-actions-toolkit-huXD1u/docker-metadata-action-bake-tags.json
      DOCKER_METADATA_OUTPUT_BAKE_FILE_LABELS: /home/runner/_work/_temp/docker-actions-toolkit-huXD1u/docker-metadata-action-bake-labels.json
      DOCKER_METADATA_OUTPUT_BAKE_FILE_ANNOTATIONS: /home/runner/_work/_temp/docker-actions-toolkit-huXD1u/docker-metadata-action-bake-annotations.json
      DOCKER_METADATA_OUTPUT_BAKE_FILE: /home/runner/_work/_temp/docker-actions-toolkit-huXD1u/docker-metadata-action-bake.json
  Backup created: Dockerfile.bak-20261015-131640
  Inserted before marker: COPY actions/config/maven/settings.xml ${MAVEN_CONFIG}/settings.xml
  Marker not found; FAIL_IF_MISSING=true. Skipping: COPY actions/config/certs/binario.jks /tmp/binario.jks
  Fallback: inserting cert before 'COPY . .'
  Inserted before marker: COPY actions/config/certs/binario.jks /tmp/binario.jks
  Updated RUN mvn (if needed) with: -Djavax.net.ssl.trustStore=/tmp/binario.jks
  Done. File updated: Dockerfile
Build and push
25s
Run docker/build-push-action@v6
0s
14s
Post job cleanup.
Build and push
4s
Checkout DevSecOps config repo
1s
Login to Docker
1s
1s
Post job cleanup.
Parse config map to vars
0s
Local repository checkout
1s
  Post job cleanup.
  /usr/bin/git version
  git version 2.55.0
  Temporarily overriding HOME='/home/runner/_work/_temp/b432b79f-4d6b-419a-a5aa-c0e24a9a47ea' before making global git config changes
  Adding repository directory to the temporary git global config as a safe directory
  /usr/bin/git config --global --add safe.directory /home/runner/_work/siarx-backend-autoridade-registro/siarx-backend-autoridade-registro/siarx-backend-autoridade-registro-infranprd
  Removing SSH command configuration
  /usr/bin/git config --local --name-only --get-regexp core\.sshCommand
  /usr/bin/git submodule foreach --recursive sh -c "git config --local --name-only --get-regexp 'core\.sshCommand' && git config --local --unset-all 'core.sshCommand' || :"
  Removing HTTP extra header
  /usr/bin/git config --local --name-only --get-regexp http\.https\:\/\/github\.com\/\.extraheader
  /usr/bin/git submodule foreach --recursive sh -c "git config --local --name-only --get-regexp 'http\.https\:\/\/github\.com\/\.extraheader' && git config --local --unset-all 'http.https://github.com/.extraheader' || :"
  Removing includeIf entries pointing to credentials config files
  /usr/bin/git config --local --name-only --get-regexp ^includeIf\.gitdir:
  includeif.gitdir:/home/runner/_work/siarx-backend-autoridade-registro/siarx-backend-autoridade-registro/siarx-backend-autoridade-registro-infranprd/.git.path
  includeif.gitdir:/home/runner/_work/siarx-backend-autoridade-registro/siarx-backend-autoridade-registro/siarx-backend-autoridade-registro-infranprd/.git/worktrees/*.path
  includeif.gitdir:/github/workspace/siarx-backend-autoridade-registro-infranprd/.git.path
  includeif.gitdir:/github/workspace/siarx-backend-autoridade-registro-infranprd/.git/worktrees/*.path
  /usr/bin/git config --local --get-all includeif.gitdir:/home/runner/_work/siarx-backend-autoridade-registro/siarx-backend-autoridade-registro/siarx-backend-autoridade-registro-infranprd/.git.path
  /home/runner/_work/_temp/git-credentials-38f508ec-15cc-44ec-927f-bc2e555657eb.config
  /usr/bin/git config --local --unset includeif.gitdir:/home/runner/_work/siarx-backend-autoridade-registro/siarx-backend-autoridade-registro/siarx-backend-autoridade-registro-infranprd/.git.path /home/runner/_work/_temp/git-credentials-38f508ec-15cc-44ec-927f-bc2e555657eb.config
  /usr/bin/git config --local --get-all includeif.gitdir:/home/runner/_work/siarx-backend-autoridade-registro/siarx-backend-autoridade-registro/siarx-backend-autoridade-registro-infranprd/.git/worktrees/*.path
  /home/runner/_work/_temp/git-credentials-38f508ec-15cc-44ec-927f-bc2e555657eb.config
  /usr/bin/git config --local --unset includeif.gitdir:/home/runner/_work/siarx-backend-autoridade-registro/siarx-backend-autoridade-registro/siarx-backend-autoridade-registro-infranprd/.git/worktrees/*.path /home/runner/_work/_temp/git-credentials-38f508ec-15cc-44ec-927f-bc2e555657eb.config
  /usr/bin/git config --local --get-all includeif.gitdir:/github/workspace/siarx-backend-autoridade-registro-infranprd/.git.path
  /github/runner_temp/git-credentials-38f508ec-15cc-44ec-927f-bc2e555657eb.config
  /usr/bin/git config --local --unset includeif.gitdir:/github/workspace/siarx-backend-autoridade-registro-infranprd/.git.path /github/runner_temp/git-credentials-38f508ec-15cc-44ec-927f-bc2e555657eb.config
  /usr/bin/git config --local --get-all includeif.gitdir:/github/workspace/siarx-backend-autoridade-registro-infranprd/.git/worktrees/*.path
  /github/runner_temp/git-credentials-38f508ec-15cc-44ec-927f-bc2e555657eb.config
  /usr/bin/git config --local --unset includeif.gitdir:/github/workspace/siarx-backend-autoridade-registro-infranprd/.git/worktrees/*.path /github/runner_temp/git-credentials-38f508ec-15cc-44ec-927f-bc2e555657eb.config
  /usr/bin/git submodule foreach --recursive git config --local --show-origin --name-only --get-regexp remote.origin.url
  Removing credentials config '/home/runner/_work/_temp/git-credentials-38f508ec-15cc-44ec-927f-bc2e555657eb.config'
1s
Post job cleanup.
/usr/bin/git version
git version 2.55.0
Temporarily overriding HOME='/home/runner/_work/_temp/fb55d3f4-e5f5-4086-97d8-dc847a49b9f7' before making global git config changes
Adding repository directory to the temporary git global config as a safe directory
/usr/bin/git config --global --add safe.directory /home/runner/_work/siarx-backend-autoridade-registro/siarx-backend-autoridade-registro
/usr/bin/git config --local --name-only --get-regexp core\.sshCommand
/usr/bin/git submodule foreach --recursive sh -c "git config --local --name-only --get-regexp 'core\.sshCommand' && git config --local --unset-all 'core.sshCommand' || :"
/usr/bin/git config --local --name-only --get-regexp http\.https\:\/\/github\.com\/\.extraheader
http.https://github.com/.extraheader
/usr/bin/git config --local --unset-all http.https://github.com/.extraheader
/usr/bin/git submodule foreach --recursive sh -c "git config --local --name-only --get-regexp 'http\.https\:\/\/github\.com\/\.extraheader' && git config --local --unset-all 'http.https://github.com/.extraheader' || :"
/usr/bin/git config --local --name-only --get-regexp ^includeIf\.gitdir:
/usr/bin/git submodule foreach --recursive git config --local --show-origin --name-only --get-regexp remote.origin.url
0s
Post job cleanup.
Token revoked
1s
Post job cleanup.
Token revoked
0s
