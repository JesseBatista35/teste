oc -n selenium-grid get dc firefox -o yaml | grep -iE 'argocd|helm|managed-by|last-applied|app.kubernetes.io/instance'
