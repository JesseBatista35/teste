sudo sed -n '10,75p' /opt/sicia/server/config/passport/ldap-search.js

sudo grep -rn -E "define\(|tableName" /opt/sicia/server/src --include=*.js --exclude-dir=node_modules | grep -i user

