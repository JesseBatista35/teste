[root@sbrdeapllx104 servers]#
[root@sbrdeapllx104 servers]#
[root@sbrdeapllx104 servers]#
[root@sbrdeapllx104 servers]#
[root@sbrdeapllx104 servers]#
[root@sbrdeapllx104 servers]# jar tf /opt/jboss/jboss-eap/modules/system/layers/base/org/jboss/logmanager/main/jboss-logmanager-1.5.4.Final-redhat-1.jar | head -5
java.util.zip.ZipException: error in opening zip file
        at java.util.zip.ZipFile.open(Native Method)
        at java.util.zip.ZipFile.<init>(ZipFile.java:231)
        at java.util.zip.ZipFile.<init>(ZipFile.java:156)
        at java.util.zip.ZipFile.<init>(ZipFile.java:127)
        at sun.tools.jar.Main.list(Main.java:1115)
        at sun.tools.jar.Main.run(Main.java:293)
        at sun.tools.jar.Main.main(Main.java:1288)
[root@sbrdeapllx104 servers]#
[root@sbrdeapllx104 servers]#
[root@sbrdeapllx104 servers]# python3 -c "import zipfile; z=zipfile.ZipFile('/opt/jboss/jboss-eap/modules/system/layers/base/org/jboss/logmanager/main/jboss-logmanager-1.5.4.Final-redhat-1.jar'); print('bad file:', z.testzip()); print('entries:', len(z.namelist()))"
bash: python3: comando não encontrado
[root@sbrdeapllx104 servers]#
[root@sbrdeapllx104 servers]#
[root@sbrdeapllx104 servers]# tail -c 200 /opt/jboss/jboss-eap/modules/system/layers/base/org/jboss/logmanager/main/jboss-logmanager-1.5.4.Final-redhat-1.jar | xxd | tail -10
0000030: 5441 2d49 4e46 2f6d 6176 656e 2f6f 7267  TA-INF/maven/org
0000040: 2e6a 626f 7373 2e6c 6f67 6d61 6e61 6765  .jboss.logmanage
0000050: 722f 6a62 6f73 732d 6c6f 676d 616e 6167  r/jboss-logmanag
0000060: 6572 2f70 6f6d 2e70 726f 7065 7274 6965  er/pom.propertie
0000070: 7350 4b01 0214 030a 0000 0008 00dc 5d75  sPK...........]u
0000080: 453d fed3 ee9d 0000 0081 0100 0013 0000  E=..............
0000090: 0000 0000 0000 0000 00a4 810d a804 004d  ...............M
00000a0: 4554 412d 494e 462f 494e 4445 582e 4c49  ETA-INF/INDEX.LI
00000b0: 5354 504b 0507 0000 0000 fe00 fe00 1061  STPK...........a
00000c0: 0000 dba8 0400 0000                      ........
[root@sbrdeapllx104 servers]# which java
/usr/bin/java
[root@sbrdeapllx104 servers]# java -version
java version "1.8.0_471"
Java(TM) SE Runtime Environment (build 1.8.0_471-b09)
Java HotSpot(TM) 64-Bit Server VM (build 25.471-b09, mixed mode)
[root@sbrdeapllx104 servers]#
[root@sbrdeapllx104 servers]#
[root@sbrdeapllx104 servers]#
