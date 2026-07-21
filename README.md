
-sh-4.2$ ls -la /usr/java/ 2>/dev/null
total 0
drwxr-xr-x   3 root root  55 Jul 13  2020 .
drwxr-xr-x. 14 root root 167 Jul 13  2020 ..
lrwxrwxrwx   1 root root  22 Jul 13  2020 default -> /usr/java/jdk1.8.0_181
drwxr-xr-x   7 root root 245 Jul  7  2018 jdk1.8.0_181
lrwxrwxrwx   1 root root  22 Jul 13  2020 latest -> /usr/java/jdk1.8.0_181
-sh-4.2$
-sh-4.2$
-sh-4.2$ find / -iname "java" -patch "*17*" -type f 2>/dev/null
-sh-4.2$

