
-sh-4.2$ oc exec -it sisgf-backend-des-232-bj4lp -n sisgf-des -- /bin/bash
error: unable to upgrade connection: container not found ("sisgf-backend-des")
-sh-4.2$ oc image extract default-route-openshift-image-registry.apps.produtos4.caixa/build-images-ads/sisgf-backend:20260528.1112-11.01.01.01-SNAPSHOT --path /deployments/lib/main/:/tmp/check-jar/ --confirm
Error: unknown flag: --confirm


Usage:
  oc image extract [flags]

Examples:
  # Extract the busybox image into the current directory
  oc image docker.io/library/busybox:latest

  # Extract the busybox image to a temp directory (must exist)
  oc image docker.io/library/busybox:latest --path /:/tmp/busybox

  # Extract a single file from the image into the current directory
  oc image docker.io/library/centos:7 --path /bin/bash:.

  # Extract all .repo files from the image's /etc/yum.repos.d/ folder.
  oc image docker.io/library/centos:7 --path /etc/yum.repos.d/*.repo:.

  # Extract the last layer in the image
  oc image docker.io/library/centos:7[-1]

  # Extract the first three layers of the image
  oc image docker.io/library/centos:7[:3]

  # Extract the last three layers of the image
  oc image docker.io/library/centos:7[-3:]

Options:
      --dry-run=false: Print the actions that would be taken and exit without writing any contents.
      --filter-by-os='': A regular expression to control which images are mirrored. Images will be passed as '<platform>/<architecture>[/<variant>]'.
      --insecure=false: Allow pull operations to registries to be made over HTTP
      --only-files=false: Only extract regular files and directories from the image.
      --path=[/:.]: Extract only part of an image. Must be SRC:DST where SRC is the path within the image and DST a local directory. If not specified the default is to extract everything to the current directory.

Use "oc options" for a list of global command-line options (applies to all commands).

-sh-4.2$ ls -la /tmp/check-jar/
ls: não é possível acessar /tmp/check-jar/: Arquivo ou diretório não encontrado
-sh-4.2$
