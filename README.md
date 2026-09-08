for pid in 15838 15883 15890 50140 50143 117056; do
  echo "PID $pid:"; sudo ls -la /proc/$pid/cwd 2>/dev/null
done


ps -ef | grep -i pm2
ps -ef | grep -i forever
sudo systemctl list-units --all | grep -i sirpl
find / -iname "*sirpl*" -path "*/systemd/*" 2>/dev/null
crontab -l -u spnoddr1 2>/dev/null

sudo -u spnoddr1 pm2 list 2>/dev/null
