grep -i "JBOSS_USER" /etc/jboss-as/jboss-as.conf
echo $JBOSS_USER

cat /home/siaoi/.bash_profile 2>/dev/null | grep -i JBOSS
cat /home/siaoi/.bashrc 2>/dev/null | grep -i JBOSS
cat /etc/profile.d/*.sh 2>/dev/null | grep -i JBOSS
