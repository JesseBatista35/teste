
-sh-4.2$ oc rsh firefox-3-rwpfb -n selenium-grid
ERRO[0000] exec failed: unable to start container process: exec: "-n": executable file not found in $PATH
command terminated with exit code 255
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc rsh firefox-3-rwpfb
$ oc rsh -n selenium-grid firefox-3-rwpfb
/bin/sh: 1: oc: not found
$ cul^Htl^H^H^H^H^[[2~^H^H^H^H^H^H^H^H
/bin: not foundl
$ curl -v --max-time 15 https://cdn.perfdrive.com/
*   Trying 130.211.29.114:443...
* Connection timed out after 15001 milliseconds
* Closing connection 0
curl: (28) Connection timed out after 15001 milliseconds
$
