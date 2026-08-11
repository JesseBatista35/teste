-sh-4.2$
-sh-4.2$ oc logs siavl-gerencial-frontend-des-5-deploy -n siavl-des
--> Scaling siavl-gerencial-frontend-des-5 to 1
error: update acceptor rejected siavl-gerencial-frontend-des-5: pods for rc 'siavl-des/siavl-gerencial-frontend-des-5' took longer than 600 seconds to become available
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc get events -n build-images-ads --sort-by='.lastTimestamp' | tail -40
No resources found.
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc get events -n siavl-des --sort-by='.lastTimestamp' | tail -40
F0811 13:35:21.599419   30742 sorter.go:306] Field {.lastTimestamp} in *unstructured.Unstructured is an unsortable type: interface, err: unsortable type: <nil>
-sh-4.2$
