
-sh-4.2$
-sh-4.2$ oc describe istag httpd-24-rhel7:2.4-cef -n openshift | head -25
Image Name:     sha256:acf76a30d454816ddfe5064e6abc61c1ad58b9bcb5116ca908ff0911c5d6c62d
Docker Image:   image-registry.openshift-image-registry.svc:5000/openshift/httpd-24-rhel7@sha256:acf76a30d454816ddfe5064e6abc61c1ad58b9bcb5116ca908ff0911c5d6c62d
Name:           sha256:acf76a30d454816ddfe5064e6abc61c1ad58b9bcb5116ca908ff0911c5d6c62d
Created:        20 months ago
Annotations:    image.openshift.io/dockerLayersOrder=ascending
                image.openshift.io/manifestBlobStored=true
                openshift.io/image.managed=true
Image Size:     127.2MB in 7 layers
Layers:         80.48MB sha256:b961c83332b03c835809e3b93052bc3d222467abb864a892fb00e4ce797897d3
                1.893kB sha256:cadfabc98e44d133890453ae9a171fe3aa8a726edf364119a380245d440bb70f
                7.635MB sha256:6db370a5602ad883dcf984dbadfa1c06fc27a211c77579ad4b395a2465d73904
                39.11MB sha256:5c43adee4171fc61bbaa15c2c958821aa3e3e07e3db0242da69674d2af6c93af
                5.065kB sha256:0a72a2793166f3ec78d1f5b6ea13cba4d727bd05d84ed1ee19aa8ba0aa7024b5
                3.38kB  sha256:4ad33dfeef5443a5639525692c220a0bce82ff9f87dcc5fb4195711f6c8a5914
                505B    sha256:aaa3e2f4f092afa92aa50bd32bae9fe533b5231b0bf4bf7813bbc78ba482f9a5
Image Created:  5 years ago
Author:         <none>
Arch:           amd64
Entrypoint:     container-entrypoint
Command:        /bin/sh -c httpd -D FOREGROUND
Working Dir:    /opt/app-root/src
User:           1001
Exposes Ports:  8080/tcp, 8443/tcp
Docker Labels:  architecture=x86_64
                build-date=2020-12-25T04:32:46.598148
-sh-4.2$
