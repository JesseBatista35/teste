/home/sadscp01/.nvm/versions/node/v12.18.1/bin/node --version
/home/sadscp01/.nvm/versions/node/v14.17.0/bin/node --version


cat /home/sadscp01/.nvm/alias/default 2>/dev/null
readlink -f /home/sadscp01/.nvm/versions/node/current 2>/dev/null
su - sadscp01 -c 'source ~/.nvm/nvm.sh && nvm current'
su - sadscp01 -c 'which node; which firebase; node --version'

