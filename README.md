sudo grep -n -A10 'findUser' /opt/sicia/server/config/passport/utils.js 2>/dev/null || \
sudo grep -rn 'findUser *=' /opt/sicia/server --include=*.js --exclude-dir=node_modules | head
