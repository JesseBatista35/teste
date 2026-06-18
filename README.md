
-sh-4.2$ ^C
-sh-4.2$ oc adm prune images --confirm --keep-tag-revisions=3
error: failed to ping registry image-registry.openshift-image-registry.svc:5000: [Get https://image-registry.openshift-image-registry.svc:5000/: dial tcp: lookup image-registry.openshift-image-registry.svc on 10.122.150.12:53: no such host, Get http://image-registry.openshift-image-registry.svc:5000/: dial tcp: lookup image-registry.openshift-image-registry.svc on 10.122.150.12:53: no such host]
* Please provide a reachable route to the integrated registry using --registry-url.
-sh-4.2$
