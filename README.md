
-sh-4.2$
-sh-4.2$ oc get events | grep -i frontend
165m        Normal    Pulling            pod/sipar-inter-frontend-des-28-8gx8h               Pulling image "image-registry.openshift-image-registry.svc:5000/openshift/httpd-24-rhel7@sha256:acf76a30d454816ddfe5064e6abc61c1ad58b9bcb5116ca908ff0911c5d6c62d"
105m        Normal    BackOff            pod/sipar-inter-frontend-des-28-8gx8h               Back-off pulling image "image-registry.openshift-image-registry.svc:5000/openshift/httpd-24-rhel7@sha256:acf76a30d454816ddfe5064e6abc61c1ad58b9bcb5116ca908ff0911c5d6c62d"
104m        Normal    Scheduled          pod/sipar-inter-frontend-des-28-ks9fm               Successfully assigned sipar-des/sipar-inter-frontend-des-28-ks9fm to ceadecldlx042.nprd.caixa
104m        Normal    AddedInterface     pod/sipar-inter-frontend-des-28-ks9fm               Add eth0 [25.2.18.4/23] from openshift-sdn
103m        Normal    Pulling            pod/sipar-inter-frontend-des-28-ks9fm               Pulling image "image-registry.openshift-image-registry.svc:5000/openshift/httpd-24-rhel7@sha256:acf76a30d454816ddfe5064e6abc61c1ad58b9bcb5116ca908ff0911c5d6c62d"
103m        Warning   Failed             pod/sipar-inter-frontend-des-28-ks9fm               Failed to pull image "image-registry.openshift-image-registry.svc:5000/openshift/httpd-24-rhel7@sha256:acf76a30d454816ddfe5064e6abc61c1ad58b9bcb5116ca908ff0911c5d6c62d": rpc error: code = Unknown desc = reading manifest sha256:acf76a30d454816ddfe5064e6abc61c1ad58b9bcb5116ca908ff0911c5d6c62d in image-registry.openshift-image-registry.svc:5000/openshift/httpd-24-rhel7: manifest unknown: manifest unknown
103m        Warning   Failed             pod/sipar-inter-frontend-des-28-ks9fm               Error: ErrImagePull
4m38s       Normal    BackOff            pod/sipar-inter-frontend-des-28-ks9fm               Back-off pulling image "image-registry.openshift-image-registry.svc:5000/openshift/httpd-24-rhel7@sha256:acf76a30d454816ddfe5064e6abc61c1ad58b9bcb5116ca908ff0911c5d6c62d"
103m        Warning   Failed             pod/sipar-inter-frontend-des-28-ks9fm               Error: ImagePullBackOff
104m        Normal    SuccessfulCreate   replicationcontroller/sipar-inter-frontend-des-28   Created pod: sipar-inter-frontend-des-28-ks9fm
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
