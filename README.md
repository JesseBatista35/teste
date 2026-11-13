
[root@cbrdeapllx471 p585600]#
[root@cbrdeapllx471 p585600]#
[root@cbrdeapllx471 p585600]#
[root@cbrdeapllx471 p585600]#
[root@cbrdeapllx471 p585600]#
[root@cbrdeapllx471 p585600]# grep -n -A1 -E 'deployment name="SIFEC-CCR[0-9]*"' /opt/jboss/jboss-eap/dc/configuration/domain.xml | grep -E 'deployment name|sha1'
4249:        <deployment name="SIFEC-CCR4" runtime-name="SIFEC-CCR-4.24.1-b4437.ear">
4250-            <content sha1="b11b68d16a52e59dbefad8c723b4ec3e7d5983ac"/>
4297:        <deployment name="SIFEC-CCR3" runtime-name="SIFEC-CCR-6.0.0-b4564.ear">
4298-            <content sha1="d2b2a920326c4ac441139a5b874dafb49786da4a"/>
4339:        <deployment name="SIFEC-CCR" runtime-name="SIFEC-CCR-6.3.0-b4587.ear">
4340-            <content sha1="e6ed64ba9ddcbc4ef402e34a524d7018581eed75"/>
4375:        <deployment name="SIFEC-CCR5" runtime-name="SIFEC-CCR-6.4.0-b4589.ear">
4376-            <content sha1="33f9682f7cc8b257c5754ee0476f0fcc9a48abb1"/>
4387:        <deployment name="SIFEC-CCR2" runtime-name="SIFEC-CCR-6.3.0-b4591.ear">
4388-            <content sha1="cd54a9ecfa5fc5bf7287a875f1fbd3e9f39865f1"/>
4488:                <deployment name="SIFEC-CCR" runtime-name="SIFEC-CCR-6.3.0-b4587.ear"/>
4489-                <deployment name="SIFEC-FBN4" runtime-name="sifec-fbn-1.0.1.0-b84.ear"/>
[root@cbrdeapllx471 p585600]# 
