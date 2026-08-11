sh-5.1$ ls -la /opt/app-root/src/
total 24764
drwxrwxr-x. 1 default root       62 Aug 10 15:25 .
drwxr-xr-x. 1 root    root       17 Mar  1 21:36 ..
drwxrwxr-x. 1 default root       19 Feb 17 21:49 .pki
drwxrwxr-x. 2 default root        6 Mar  1 21:39 nginx-start
-rw-rw-r--. 1 default root 25355796 Aug 10 15:25 siavl-gerencial-frontend-0.2.2.2.zip
sh-5.1$ ^C
sh-5.1$ 
sh-5.1$ 
sh-5.1$ ls -la /opt/app-root/nginx-start/
ls: cannot access '/opt/app-root/nginx-start/': No such file or directory
sh-5.1$ ls -la /opt/app-root/src/nginx-start/
total 0
drwxrwxr-x. 2 default root  6 Mar  1 21:39 .
drwxrwxr-x. 1 default root 62 Aug 10 15:25 ..
sh-5.1$ cat /opt/app-root/src/nginx-start/*
cat: '/opt/app-root/src/nginx-start/*': No such file or directory
sh-5.1$ 
