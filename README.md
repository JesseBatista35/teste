


Last login: Mon Aug 31 11:36:50 2026 from 10.122.150.31
[p585600@sspdeaprlx0027 ~]$
[p585600@sspdeaprlx0027 ~]$
[p585600@sspdeaprlx0027 ~]$
[p585600@sspdeaprlx0027 ~]$
[p585600@sspdeaprlx0027 ~]$ cd /opt/apache/jbcs-httpd24-2.4/httpd/conf.d/siavl
[p585600@sspdeaprlx0027 siavl]$
[p585600@sspdeaprlx0027 siavl]$ python3 -c "
> import re
> with open('siavl.conf') as f:
>     content = f.read()
>
> old_block = re.search(r'    <Location /siavl-web>.*?    </Location>\n', content, re.DOTALL)
> print(repr(old_block.group(0)) if old_block else 'NAO ENCONTRADO')
> "
-bash: python3: command not found
[p585600@sspdeaprlx0027 siavl]$
[p585600@sspdeaprlx0027 siavl]$
[p585600@sspdeaprlx0027 siavl]$

