
[root@caddeapllx1369 p585600]# find /opt/batch -type f \( -name "*.sh" -o -name "*.yml" -o -name "*.properties" \) 2>/dev/null
[root@caddeapllx1369 p585600]#
[root@caddeapllx1369 p585600]#
[root@caddeapllx1369 p585600]#
[root@caddeapllx1369 p585600]# grep -rl "java" /opt/batch 2>/dev/null | head -20
/opt/batch/deploy/sirsa-batch.jar
[root@caddeapllx1369 p585600]#
[root@caddeapllx1369 p585600]#
[root@caddeapllx1369 p585600]# crontab -l 2>/dev/null
15 21 * * *  /var/tmp/inv_software.sh 7562
[root@caddeapllx1369 p585600]# curl -s "http://binario.caixa:8081/service/rest/v1/search?q=jdk-17" | head -c 2000
{
  "items" : [ {
    "id" : "ZG9ja2VyLXByb3h5OjAyYTRmNGU4NWEwZmM3MjU1OGQzMThiMzFkZmY0OGE2",
    "repository" : "docker-proxy",
    "format" : "docker",
    "group" : null,
    "name" : "library/eclipse-temurin",
    "version" : "17-jdk-ubi9-minimal",
    "assets" : [ {
      "downloadUrl" : "http://binario.caixa:8081/repository/docker-proxy/v2/library/eclipse-temurin/manifests/17-jdk-ubi9-minimal",
      "path" : "v2/library/eclipse-temurin/manifests/17-jdk-ubi9-minimal",
      "id" : "ZG9ja2VyLXByb3h5OjBhMmVhYmYwNGJlNDM0ZTJmMWVhYzkyYzVjZDc2Y2M5",
      "repository" : "docker-proxy",
      "format" : "docker",
      "checksum" : {
        "sha1" : "5650b4a954d716fb5fdaa39e135ef2a2740058f4",
        "sha256" : "70b03876058d83d6247440ffc8bcdd5e212fcb34774ae854e86399aa0c4abf47"
      },
      "contentType" : "application/vnd.oci.image.index.v1+json",
      "lastModified" : "2025-08-25T13:18:14.879+00:00",
      "lastDownloaded" : "2025-08-25T13:18:14.941+00:00",
      "uploader" : "anonymous",
      "uploaderIp" : "10.205.252.66",
      "fileSize" : 5353,
      "blobCreated" : null
    } ]
  }, {
    "id" : "amJvc3MtcHJvZHVjdC1yZXBvc2l0b3J5LUdBOjBiZjEyY2JhNWY4YjdhNDhhYTk1NDRkOWY4MmE3NzQy",
    "repository" : "jboss-product-repository-GA",
    "format" : "maven2",
    "group" : "io.smallrye.classfile",
    "name" : "jdk-classfile-backport",
    "version" : "26.0.0.redhat-00001",
    "assets" : [ {
      "downloadUrl" : "http://binario.caixa:8081/repository/jboss-product-repository-GA/io/smallrye/classfile/jdk-classfile-backport/26.0.0.redhat-00001/jdk-classfile-backport-26.0.0.redhat-00001.jar",
      "path" : "io/smallrye/classfile/jdk-classfile-backport/26.0.0.redhat-00001/jdk-classfile-backport-26.0.0.redhat-00001.jar",
      "id" : "amJvc3MtcHJvZHVjdC1yZXBvc2l0b3J5LUdBOmRjODEzYzBiZTBjNmViNWUxZmE3NjM4NTlkNTIxYmVi",
      "repository" : "jboss-product-repository-GA",
      "format" : "maven2",
      "checksum" : {
        "sha1" : "a444dee9e9c2312c19067fabb0b572ff197[root@caddeapllx1369 p585600]#
[root@caddeapllx1369 p585600]#
[root@caddeapllx1369 p585600]#
[root@caddeapllx1369 p585600]#
[root@caddeapllx1369 p585600]# curl -s -o /dev/null -w "%{http_code}\n" http://binario.caixa:8081
200
[root@caddeapllx1369 p585600]#
