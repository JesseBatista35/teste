oc describe rolebinding admin -n selenium-grid
oc rsh -n selenium-grid dc/chrome google-chrome --version
oc rsh -n selenium-grid dc/chrome df -h /dev/shm
oc get dc chrome -n selenium-grid -o yaml | grep -iA3 shm



é esse cara aqui Wanderson Farias Franca



-sh: dc-chrome: Arquivo ou diretório não encontrado
-sh-4.2$ oc describe rolebinding admin -n selenium-grid
Name:         admin
Labels:       <none>
Annotations:  <none>
Role:
  Kind:  ClusterRole
  Name:  admin
Subjects:
  Kind  Name     Namespace
  ----  ----     ---------
  User  p911751
-sh-4.2$ oc rsh -n selenium-grid dc/chrome google-chrome --version
Google Chrome 120.0.6099.224
-sh-4.2$ oc rsh -n selenium-grid dc/chrome df -h /dev/shm
Filesystem      Size  Used Avail Use% Mounted on
shm              64M     0   64M   0% /dev/shm
-sh-4.2$ oc get dc chrome -n selenium-grid -o yaml | grep -iA3 shm
-sh-4.2$
