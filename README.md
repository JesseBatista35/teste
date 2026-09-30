
Using project "sirex-des".
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc get build sirex-adenda-api-63 -n build-images-ads
No resources found.
Error from server (NotFound): builds.build.openshift.io "sirex-adenda-api-63" not found
-sh-4.2$ oc get build sirex-agenda-api-63 -n build-images-ads
No resources found.
Error from server (NotFound): builds.build.openshift.io "sirex-agenda-api-63" not found
-sh-4.2$ oc logs build/sirex-agenda-api-63 -n build-images-ads | tail -20
Error from server (NotFound): builds.build.openshift.io "sirex-agenda-api-63" not found
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
