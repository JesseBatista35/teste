sudo cp /opt/jboss/jboss-4.2.3.GA-jdk6/server/sinac01/conf/certs/00360305000104.p12 \
  /opt/jboss/jboss-4.2.3.GA-jdk6/server/sinac01/conf/certs/00360305000104.p12.bak_$(date +%Y%m%d)


  sudo cp /tmp/s-4570-5_CERT_legacy.p12 \
  /opt/jboss/jboss-4.2.3.GA-jdk6/server/sinac01/conf/certs/00360305000104.p12

  sudo chown c160397:desenv /opt/jboss/jboss-4.2.3.GA-jdk6/server/sinac01/conf/certs/00360305000104.p12
sudo chmod 644 /opt/jboss/jboss-4.2.3.GA-jdk6/server/sinac01/conf/certs/00360305000104.p12

ls -la /opt/jboss/jboss-4.2.3.GA-jdk6/server/sinac01/conf/certs/00360305000104.p12
md5sum /opt/jboss/jboss-4.2.3.GA-jdk6/server/sinac01/conf/certs/00360305000104.p12

sudo /opt/jboss/jboss-4.2.3.GA-jdk6/jboss.sh sinac01 stop
sleep 5
sudo /opt/jboss/jboss-4.2.3.GA-jdk6/jboss.sh sinac01 start
