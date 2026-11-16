
Using project "siinp-tqs".
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc get istag -n build images-ads | grep 20261116.1231
No resources found.
Error from server (BadRequest): ImageStreamTags must be retrieved with <name>:<tag>
-sh-4.2$ oc get istag -n build-images-ads | grep 20261116.1231
-sh-4.2$

