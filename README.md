
[root@sspdeaprlx0027 siavl]# cd /opt/apache/jbcs-httpd24-2.4/httpd/conf.d/siavl
[root@sspdeaprlx0027 siavl]#
[root@sspdeaprlx0027 siavl]# sudo awk '
> skipblank && /^$/ { skipblank=0; next }
> /<Location \/siavl-web>/ { collecting=1 }
> collecting { loc = loc $0 "\n"; if (/<\/Location>/) { collecting=0; skipblank=1 }; next }
> /RewriteCond %{REQUEST_METHOD} =OPTIONS/ && !inserted {
>   printf "%s", loc
>   inserted=1
> }
> { print }
> ' siavl.conf | sudo tee siavl.conf.NOVO > /dev/null
Sorry, user root is not allowed to execute '/bin/awk
skipblank && /^$/ { skipblank=0; next }
/<Location \/siavl-web>/ { collecting=1 }
collecting { loc = loc $0 "\n"; if (/<\/Location>/) { collecting=0; skipblank=1 }; next }
/RewriteCond %{REQUEST_METHOD} =OPTIONS/ && !inserted {
  printf "%s", loc
  inserted=1
}
{ print }
 siavl.conf' as root on sspdeaprlx0027.
Sorry, user root is not allowed to execute '/usr/bin/tee siavl.conf.NOVO' as root on sspdeaprlx0027.
[root@sspdeaprlx0027 siavl]#
[root@sspdeaprlx0027 siavl]# diff siavl.conf siavl.conf.NOVO
diff: siavl.conf.NOVO: No such file or directory
[root@sspdeaprlx0027 siavl]#
[root@sspdeaprlx0027 siavl]#
[root@sspdeaprlx0027 siavl]#
[root@sspdeaprlx0027 siavl]#
