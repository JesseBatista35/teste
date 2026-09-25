sudo grep -rn -A10 'groups_name *=' /opt/sicia/server/services/ldap/ --include=*.js

sudo grep -rn 'groups_name' /opt/sicia/server/services/ldap/ --include=*.js | head
