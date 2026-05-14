-sh-4.2$ oc debug dc/sitop-frontend-des -- /bin/sh -c "pwd; ls -la /; ls -la /opt; ls -la /opt/app-root -type f - name '*js' 2>/dev/null | head -50"
Defaulting container name to sitop-frontend-des.
Use 'oc describe pod/sitop-frontend-des-debug -n sitop-des' to see all of the containers in this pod.

Debugging with pod/sitop-frontend-des-debug, original command: <image entrypoint>
Waiting for pod to start ...
/opt/app-root/src
total 12
dr-xr-xr-x.    1 root root   17 May 13 21:19 .
dr-xr-xr-x.    1 root root   17 May 13 21:19 ..
lrwxrwxrwx.    1 root root    7 Apr 23  2020 bin -> usr/bin
dr-xr-xr-x.    2 root root    6 Apr 23  2020 boot
drwxr-xr-x.    5 root root  360 May 13 21:19 dev
drwxr-xr-x.    1 root root   19 Oct  7  2021 etc
-rw-r--r--.    1 root root 9474 Sep 15  2021 help.1
drwxr-xr-x.    2 root root    6 Apr 23  2020 home
lrwxrwxrwx.    1 root root    7 Apr 23  2020 lib -> usr/lib
lrwxrwxrwx.    1 root root    9 Apr 23  2020 lib64 -> usr/lib64
drwx------.    2 root root    6 Sep 14  2021 lost+found
drwxr-xr-x.    2 root root    6 Apr 23  2020 media
drwxr-xr-x.    2 root root    6 Apr 23  2020 mnt
drwxr-xr-x.    1 root root   22 Sep 15  2021 opt
dr-xr-xr-x. 1297 root root    0 May 13 21:19 proc
dr-xr-x---.    1 root root   23 Sep 14  2021 root
drwxrwxrwx.    1 root root   27 May 13 18:41 run
lrwxrwxrwx.    1 root root    8 Apr 23  2020 sbin -> usr/sbin
drwxr-xr-x.    2 root root    6 Apr 23  2020 srv
dr-xr-xr-x.   13 root root    0 Jun 22  2025 sys
drwxrwxrwt.    1 root root   32 May 13 18:41 tmp
drwxr-xr-x.    1 root root   81 Sep 15  2021 usr
drwxr-xr-x.    1 root root   63 Sep 14  2021 var
total 0
drwxr-xr-x. 1 root    root 22 Sep 15  2021 .
dr-xr-xr-x. 1 root    root 17 May 13 21:19 ..
drwxr-xr-x. 1 default root 17 Sep 15  2021 app-root

Removing debug pod ...
-sh-4.2$

