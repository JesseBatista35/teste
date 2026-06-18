
error: failed to ping registry image-registry.openshift-image-registry.svc:5000: [Get https://image-registry.openshift-image-registry.svc:5000/: dial tcp: lookup image-registry.openshift-image-registry.svc on 10.122.150.12:53: no such host, Get http://image-registry.openshift-image-registry.svc:5000/: dial tcp: lookup image-registry.openshift-image-registry.svc on 10.122.150.12:53: no such host]
* Please provide a reachable route to the integrated registry using --registry-url.
-sh-4.2$ oc delete pods --field-selector=status.phase=Failed -n build-images-ads
No resources found
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc delete pods --field-selector=status.phase=Succeeded -n build-images-ads
No resources found
-sh-4.2$ oc delete builds -n build-images-ads --field-selector=status=Failed
No resources found
-sh-4.2$



uam bosta
