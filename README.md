cd /opt/apache/jbcs-httpd24-2.4/httpd/conf.d/siavl

python3 -c "
import re
with open('siavl.conf') as f:
    content = f.read()

old_block = re.search(r'    <Location /siavl-web>.*?    </Location>\n', content, re.DOTALL)
print(repr(old_block.group(0)) if old_block else 'NAO ENCONTRADO')
"
