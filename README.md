Run caixagithub/DevSecOps-Actions/.github/integrations/apim/import/dotnet@main
Run curl -sL https://aka.ms/InstallAzureCLIDeb | sudo bash
Get:1 http://security.ubuntu.com/ubuntu noble-security InRelease [126 kB]
Get:2 http://archive.ubuntu.com/ubuntu noble InRelease [256 kB]
Get:3 http://security.ubuntu.com/ubuntu noble-security/main amd64 Packages [1022 kB]
Get:4 http://security.ubuntu.com/ubuntu noble-security/universe amd64 Packages [1490 kB]
Get:5 http://security.ubuntu.com/ubuntu noble-security/multiverse amd64 Packages [43.8 kB]
Get:6 http://security.ubuntu.com/ubuntu noble-security/restricted amd64 Packages [1417 kB]
Get:7 http://archive.ubuntu.com/ubuntu noble-updates InRelease [126 kB]
Get:8 https://ppa.launchpadcontent.net/git-core/ppa/ubuntu noble InRelease [24.3 kB]
Get:9 http://archive.ubuntu.com/ubuntu noble-backports InRelease [126 kB]
Get:10 http://archive.ubuntu.com/ubuntu noble/main amd64 Packages [1808 kB]
Get:11 http://archive.ubuntu.com/ubuntu noble/multiverse amd64 Packages [331 kB]
Get:12 http://archive.ubuntu.com/ubuntu noble/universe amd64 Packages [19.3 MB]
Get:13 http://archive.ubuntu.com/ubuntu noble/restricted amd64 Packages [117 kB]
Get:14 http://archive.ubuntu.com/ubuntu noble-updates/multiverse amd64 Packages [49.5 kB]
Get:15 http://archive.ubuntu.com/ubuntu noble-updates/universe amd64 Packages [2111 kB]
Get:16 http://archive.ubuntu.com/ubuntu noble-updates/restricted amd64 Packages [1490 kB]
Get:17 http://archive.ubuntu.com/ubuntu noble-updates/main amd64 Packages [1342 kB]
Get:18 http://archive.ubuntu.com/ubuntu noble-backports/main amd64 Packages [48.9 kB]
Get:19 http://archive.ubuntu.com/ubuntu noble-backports/universe amd64 Packages [35.9 kB]
Get:20 http://archive.ubuntu.com/ubuntu noble-backports/multiverse amd64 Packages [671 B]
Get:21 https://ppa.launchpadcontent.net/git-core/ppa/ubuntu noble/main amd64 Packages [2988 B]
Fetched 31.3 MB in 3s (10.9 MB/s)
Reading package lists...
Reading package lists...
Building dependency tree...
Reading state information...
lsb-release is already the newest version (12.0-2).
The following additional packages will be installed:
  dirmngr gnupg-utils gpgsm keyboxd libcurl3t64-gnutls libcurl4t64 libksba8
Suggested packages:
  dbus-user-session pinentry-gnome3 tor parcimonie xloadimage gpg-wks-server
Recommended packages:
  gnupg-l10n gpg-wks-client
The following NEW packages will be installed:
  apt-transport-https dirmngr gnupg gnupg-utils gpgsm keyboxd libksba8
The following packages will be upgraded:
  ca-certificates curl libcurl3t64-gnutls libcurl4t64
4 upgraded, 7 newly installed, 0 to remove and 22 not upgraded.
Need to get 2270 kB of archives.
After this operation, 2660 kB of additional disk space will be used.
Get:1 http://archive.ubuntu.com/ubuntu noble-updates/main amd64 ca-certificates all 20260601~24.04.1 [139 kB]
Get:2 http://archive.ubuntu.com/ubuntu noble-updates/universe amd64 apt-transport-https all 2.8.3 [3970 B]
Get:3 http://archive.ubuntu.com/ubuntu noble-updates/main amd64 curl amd64 8.5.0-2ubuntu10.10 [227 kB]
Get:4 http://archive.ubuntu.com/ubuntu noble-updates/main amd64 libcurl4t64 amd64 8.5.0-2ubuntu10.10 [343 kB]
Get:5 http://archive.ubuntu.com/ubuntu noble/main amd64 libksba8 amd64 1.6.6-1build1 [122 kB]
Get:6 http://archive.ubuntu.com/ubuntu noble-updates/main amd64 dirmngr amd64 2.4.4-2ubuntu17.4 [323 kB]
Get:7 http://archive.ubuntu.com/ubuntu noble-updates/main amd64 gnupg-utils amd64 2.4.4-2ubuntu17.4 [109 kB]
Get:8 http://archive.ubuntu.com/ubuntu noble-updates/main amd64 gpgsm amd64 2.4.4-2ubuntu17.4 [232 kB]
Get:9 http://archive.ubuntu.com/ubuntu noble-updates/main amd64 keyboxd amd64 2.4.4-2ubuntu17.4 [78.3 kB]
Get:10 http://archive.ubuntu.com/ubuntu noble-updates/main amd64 gnupg all 2.4.4-2ubuntu17.4 [359 kB]
Get:11 http://archive.ubuntu.com/ubuntu noble-updates/main amd64 libcurl3t64-gnutls amd64 8.5.0-2ubuntu10.10 [335 kB]
debconf: delaying package configuration, since apt-utils is not installed
Fetched 2270 kB in 0s (15.0 MB/s)
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
(Reading database ... 14358 files and directories currently installed.)
Preparing to unpack .../00-ca-certificates_20260601~24.04.1_all.deb ...
Unpacking ca-certificates (20260601~24.04.1) over (20240203) ...
Selecting previously unselected package apt-transport-https.
Preparing to unpack .../01-apt-transport-https_2.8.3_all.deb ...
Unpacking apt-transport-https (2.8.3) ...
Preparing to unpack .../02-curl_8.5.0-2ubuntu10.10_amd64.deb ...
Unpacking curl (8.5.0-2ubuntu10.10) over (8.5.0-2ubuntu10.9) ...
Preparing to unpack .../03-libcurl4t64_8.5.0-2ubuntu10.10_amd64.deb ...
Unpacking libcurl4t64:amd64 (8.5.0-2ubuntu10.10) over (8.5.0-2ubuntu10.9) ...
Selecting previously unselected package libksba8:amd64.
Preparing to unpack .../04-libksba8_1.6.6-1build1_amd64.deb ...
Unpacking libksba8:amd64 (1.6.6-1build1) ...
Selecting previously unselected package dirmngr.
Preparing to unpack .../05-dirmngr_2.4.4-2ubuntu17.4_amd64.deb ...
Unpacking dirmngr (2.4.4-2ubuntu17.4) ...
Selecting previously unselected package gnupg-utils.
Preparing to unpack .../06-gnupg-utils_2.4.4-2ubuntu17.4_amd64.deb ...
Unpacking gnupg-utils (2.4.4-2ubuntu17.4) ...
Selecting previously unselected package gpgsm.
Preparing to unpack .../07-gpgsm_2.4.4-2ubuntu17.4_amd64.deb ...
Unpacking gpgsm (2.4.4-2ubuntu17.4) ...
Selecting previously unselected package keyboxd.
Preparing to unpack .../08-keyboxd_2.4.4-2ubuntu17.4_amd64.deb ...
Unpacking keyboxd (2.4.4-2ubuntu17.4) ...
Selecting previously unselected package gnupg.
Preparing to unpack .../09-gnupg_2.4.4-2ubuntu17.4_all.deb ...
Unpacking gnupg (2.4.4-2ubuntu17.4) ...
Preparing to unpack .../10-libcurl3t64-gnutls_8.5.0-2ubuntu10.10_amd64.deb ...
Unpacking libcurl3t64-gnutls:amd64 (8.5.0-2ubuntu10.10) over (8.5.0-2ubuntu10.9) ...
Setting up libksba8:amd64 (1.6.6-1build1) ...
Setting up apt-transport-https (2.8.3) ...
Setting up libcurl4t64:amd64 (8.5.0-2ubuntu10.10) ...
Setting up gpgsm (2.4.4-2ubuntu17.4) ...
Setting up libcurl3t64-gnutls:amd64 (8.5.0-2ubuntu10.10) ...
Setting up dirmngr (2.4.4-2ubuntu17.4) ...
Created symlink /etc/systemd/user/sockets.target.wants/dirmngr.socket → /usr/lib/systemd/user/dirmngr.socket.

Setting up ca-certificates (20260601~24.04.1) ...
Updating certificates in /etc/ssl/certs...
rehash: warning: skipping duplicate certificate in Autoridad_de_Certificacion_Firmaprofesional_CIF_A62634068_2.pem
rehash: warning: skipping ca-certificates.crt,it does not contain exactly one certificate or CRL
121 added, 0 removed; done.
Setting up keyboxd (2.4.4-2ubuntu17.4) ...
Created symlink /etc/systemd/user/sockets.target.wants/keyboxd.socket → /usr/lib/systemd/user/keyboxd.socket.

Setting up curl (8.5.0-2ubuntu10.10) ...
Setting up gnupg-utils (2.4.4-2ubuntu17.4) ...
Setting up gnupg (2.4.4-2ubuntu17.4) ...
Processing triggers for libc-bin (2.39-0ubuntu8.7) ...
Processing triggers for ca-certificates (20260601~24.04.1) ...
Updating certificates in /etc/ssl/certs...
0 added, 0 removed; done.
Running hooks in /etc/ca-certificates/update.d...
done.
Types: deb
URIs: https://packages.microsoft.com/repos/azure-cli/
Suites: noble
Components: main
Architectures: amd64
Signed-by: /etc/apt/keyrings/microsoft.gpg
Get:1 https://packages.microsoft.com/repos/azure-cli noble InRelease [3564 B]
Get:2 https://packages.microsoft.com/repos/azure-cli noble/main amd64 Packages [2314 B]
Hit:3 http://security.ubuntu.com/ubuntu noble-security InRelease
Hit:4 http://archive.ubuntu.com/ubuntu noble InRelease
Hit:5 http://archive.ubuntu.com/ubuntu noble-updates InRelease
Hit:6 http://archive.ubuntu.com/ubuntu noble-backports InRelease
Hit:7 https://ppa.launchpadcontent.net/git-core/ppa/ubuntu noble InRelease
Fetched 5878 B in 1s (6532 B/s)
Reading package lists...
Reading package lists...
Building dependency tree...
Reading state information...
The following NEW packages will be installed:
  azure-cli
0 upgraded, 1 newly installed, 0 to remove and 22 not upgraded.
Need to get 56.2 MB of archives.
After this operation, 598 MB of additional disk space will be used.
Get:1 https://packages.microsoft.com/repos/azure-cli noble/main amd64 azure-cli amd64 2.88.0-1~noble [56.2 MB]
debconf: delaying package configuration, since apt-utils is not installed
Fetched 56.2 MB in 0s (177 MB/s)
Selecting previously unselected package azure-cli.
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
(Reading database ... 14433 files and directories currently installed.)
Preparing to unpack .../azure-cli_2.88.0-1~noble_amd64.deb ...
Unpacking azure-cli (2.88.0-1~noble) ...
Setting up azure-cli (2.88.0-1~noble) ...
WARNING: The detected architecture of current device is "x86_64", and the binary for "amd64" will be downloaded. If the detection is wrong, please download and install the binary corresponding to the appropriate architecture.
WARNING: No version specified, will get the latest version of kubectl from "https://dl.k8s.io/release/stable.txt"
WARNING: Downloading client to "/usr/local/bin/kubectl" from "https://dl.k8s.io/release/v1.36.2/bin/linux/amd64/kubectl"
WARNING: Please ensure that /usr/local/bin is in your search PATH, so the `kubectl` command can be found.
WARNING: No version specified, will get the latest version of kubelogin from "https://api.github.com/repos/Azure/kubelogin/releases/latest"
WARNING: Downloading client to "/tmp/tmpergk_ru6/kubelogin.zip" from "https://github.com/Azure/kubelogin/releases/download/v0.2.19/kubelogin.zip"
WARNING: Moving binary to "/usr/local/bin/kubelogin" from "/tmp/tmpergk_ru6/bin/linux_amd64/kubelogin"
WARNING: Please ensure that /usr/local/bin is in your search PATH, so the `kubelogin` command can be found.
Run az login --identity --client-id *** --output none
Run set -x  # Ativa o modo de depuração
+ echo 'Iniciando a publicação da API para APIM...'
+ swaggerUrl=http://sirmc-api-trilhas-carga.apl.des-nprd.private.azure/swagger/v1/swagger.json
Iniciando a publicação da API para APIM...
Verificando a URL do Swagger: http://sirmc-api-trilhas-carga.apl.des-nprd.private.azure/swagger/v1/swagger.json
+ echo 'Verificando a URL do Swagger: http://sirmc-api-trilhas-carga.apl.des-nprd.private.azure/swagger/v1/swagger.json'
++ curl -k --max-time 10 --write-out '%{http_code}' --silent --output /dev/null http://sirmc-api-trilhas-carga.apl.des-nprd.private.azure/swagger/v1/swagger.json
+ httpStatus=000
Error: Process completed with exit code 6.
