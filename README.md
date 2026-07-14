find / -iname "*taccon*" 2>/dev/null
find / -iname "*dinamo*" -not -path "*/proc/*" 2>/dev/null
find / -iname "*.ini" -o -iname "*hsm*" 2>/dev/null | grep -v proc


env | grep -i hsm
env | grep -i dinamo
env | grep -i tac

find /opt -iname "*.properties" | xargs grep -li "hsm\|dinamo\|taccon" 2>/dev/null




-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ find / -iname "*taccon*" 2>/dev/null
^C
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ find / -iname "*dinamo*" -not -path "*/proc/*" 2>/dev/null
^C
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ find / -iname "*.ini" -o -iname "*hsm*" 2>/dev/null | grep -v proc
/opt/puppetlabs/puppet/share/augeas/lenses/dist/rhsm.aug
/opt/puppetlabs/puppet/share/augeas/lenses/dist/tests/test_rhsm.aug
/opt/ctmage/bmcperl/lib/site_perl/5.8.4/XML/SAX/ParserDetails.ini
/opt/ctmage/BMCINSTALL/backup4restore/backup/ctm/data/version.ini
/opt/ctmage/BMCINSTALL/backup4restore/backup/ctm/data/config.ini
/opt/ctmage/BMCINSTALL/backup4restore/Setup_files/product_identificator_restoreag.ini
/opt/ctmage/ctm/data/version.ini
/opt/ctmage/ctm/data/config.ini
/opt/ads-agent/ansible/lib/python2.7/site-packages/ansible/modules/packaging/os/rhsm_release.py
/opt/ads-agent/ansible/lib/python2.7/site-packages/ansible/modules/packaging/os/rhsm_repository.py
/opt/ads-agent/ansible/lib/python2.7/site-packages/ansible/modules/packaging/os/rhsm_release.pyc
/opt/ads-agent/ansible/lib/python2.7/site-packages/ansible/modules/packaging/os/rhsm_repository.pyc
/opt/ads-agent/ansible/lib/python2.7/site-packages/ansible_test/_data/pytest.ini
/opt/ads-agent/ansible/lib/python2.7/site-packages/ansible_test/_data/tox.ini
/opt/ads-agent/esteira-pix/inventory_canais_digitais.ini
/opt/ads-agent/_work/r18440/a/_SISPI-container-dict-config/mqclient.ini
/opt/ads-agent/_work/r18521/a/_SISPI-dict-batch-config/configuration/mqclient.ini
/opt/ads-agent/_work/r18521/a/_SISPI-dict-batch-config/hsm-des
/opt/ads-agent/_work/r18521/a/_SISPI-dict-batch-config/hsm-hmp
/opt/ads-agent/_work/r18521/a/_SISPI-dict-batch-config/hsm-prd
/opt/ads-agent/_work/r18441/a/_SISPI-container-backend-config/mqclient.ini
/opt/ads-agent/_work/r18522/a/_SISEI-mgi-config/99-custom.ini
/opt/ads-agent/_work/r18384/a/_infradevops-novoportal-backend-config/99-custom.ini
/opt/ads-agent/_work/r18436/a/_SIMPI-resolve-pendencia-config/hsm_loadbalance-des.cfg
/opt/ads-agent/_work/r18436/a/_SIMPI-resolve-pendencia-config/hsm_loadbalance-hmp.cfg
/opt/ads-agent/_work/r18436/a/_SIMPI-resolve-pendencia-config/hsm_loadbalance-prd.cfg
/opt/ads-agent/_work/r18436/a/_SIMPI-resolve-pendencia-config/hsm_loadbalance-tqs.cfg
/opt/ads-agent/_work/r18511/a/_SIMPI-container-dict-config/hsm_loadbalance-des.cfg
/opt/ads-agent/_work/r18511/a/_SIMPI-container-dict-config/hsm_loadbalance-hmp.cfg
/opt/ads-agent/_work/r18511/a/_SIMPI-container-dict-config/hsm_loadbalance-prd.cfg
/opt/ads-agent/_work/r18511/a/_SIMPI-container-dict-config/hsm_loadbalance-tqs.cfg
/opt/ads-agent/_work/r18663/a/_SISPI-dict-batch-polling-config/mqclient.ini
/opt/ads-agent/_work/r18593/a/_SISEI-mgi-sip-config/99-custom.ini
/opt/ads-agent/esteira-ibc/inventory_canais_digitais.ini
/opt/ads-agent/esteira-jboss-vm-v2/inventory_canais_digitais.ini
/opt/ads-agent/esteira-jboss-vm-v2/esteira-jboss-vm-legado/inventory_canais_digitais.ini
/opt/ads-agent/esteira-jboss-vm.old/variable_hsm_ok.yml
/opt/ads-agent/esteira-jboss-vm.old/inventory_canais_digitais.ini
/opt/ads-agent/esteira-jboss-vm/variable_hsm_ok.yml
/opt/ads-agent/esteira-jboss-vm/inventory_canais_digitais.ini
/run/rhsm
/run/lock/subsys/rhsmcertd
/sys/fs/cgroup/memory/system.slice/rhsmcertd.service
/sys/fs/cgroup/devices/system.slice/rhsmcertd.service
/sys/fs/cgroup/pids/system.slice/rhsmcertd.service
/sys/fs/cgroup/blkio/system.slice/rhsmcertd.service
/sys/fs/cgroup/cpu,cpuacct/system.slice/rhsmcertd.service
/sys/fs/cgroup/systemd/system.slice/rhsmcertd.service
/var/lib/yum/yumdb/s/5524538ab239a25fb554fc47d57e21442ec0b78f-subscription-manager-rhsm-certificates-1.24.26-3.el7_8-x86_64
/var/lib/yum/yumdb/s/f122042ca3a998e5344f43dcad0adf9fbb51eb33-subscription-manager-rhsm-1.24.26-3.el7_8-x86_64
/var/lib/rhsm
/var/log/rhsm
/var/log/rhsm/rhsmcertd.log
/var/log/rhsm/rhsm.log
/var/log/rhsm/rhsm.log-20260621
/var/log/rhsm/rhsmcertd.log-20260628
/var/log/rhsm/rhsm.log-20260628
/var/log/rhsm/rhsmcertd.log-20260705
/var/log/rhsm/rhsm.log-20260705
/var/log/rhsm/rhsmcertd.log-20260712
/var/log/rhsm/rhsm.log-20260712
/var/log/rhsm/rhsmcertd.log-20260621
/var/spool/rhsm
/etc/dbus-1/system.d/com.redhat.RHSM1.Facts.conf
/etc/dbus-1/system.d/com.redhat.RHSM1.conf
/etc/systemd/system/multi-user.target.wants/rhsmcertd.service
/etc/mc/filehighlight.ini
/etc/mc/sfs.ini
/etc/bash_completion.d/rhn-migrate-classic-to-rhsm
/etc/bash_completion.d/rhsm-debug
/etc/bash_completion.d/rhsm-icon
/etc/bash_completion.d/rhsmcertd
/etc/rhsm
/etc/rhsm/rhsm.conf
/etc/rhsm/rhsm.conf.kat-backup
/etc/rhsm/rhsm.conf.rpmnew
/etc/rhsm/rhsm.conf.bak
/etc/cron.daily/rhsmd
/usr/bin/rhsm-debug
/usr/bin/rhsmcertd
/usr/lib/systemd/system/rhsm.service
/usr/lib/systemd/system/rhsm-facts.service
/usr/lib/systemd/system/rhsmcertd.service
/usr/lib64/python2.7/site-packages/rhsmlib
/usr/lib64/python2.7/site-packages/subscription_manager/scripts/rhn_migrate_classic_to_rhsm.py
/usr/lib64/python2.7/site-packages/subscription_manager/scripts/rhsm_d.py
/usr/lib64/python2.7/site-packages/subscription_manager/scripts/rhsm_debug.py
/usr/lib64/python2.7/site-packages/subscription_manager/scripts/rhsm_facts_service.py
/usr/lib64/python2.7/site-packages/subscription_manager/scripts/rhsm_service.py
/usr/lib64/python2.7/site-packages/subscription_manager/scripts/rhsmcertd_worker.py
/usr/lib64/python2.7/site-packages/subscription_manager/scripts/rhn_migrate_classic_to_rhsm.pyc
/usr/lib64/python2.7/site-packages/subscription_manager/scripts/rhn_migrate_classic_to_rhsm.pyo
/usr/lib64/python2.7/site-packages/subscription_manager/scripts/rhsm_d.pyc
/usr/lib64/python2.7/site-packages/subscription_manager/scripts/rhsm_d.pyo
/usr/lib64/python2.7/site-packages/subscription_manager/scripts/rhsm_debug.pyc
/usr/lib64/python2.7/site-packages/subscription_manager/scripts/rhsm_debug.pyo
/usr/lib64/python2.7/site-packages/subscription_manager/scripts/rhsm_facts_service.pyc
/usr/lib64/python2.7/site-packages/subscription_manager/scripts/rhsm_facts_service.pyo
/usr/lib64/python2.7/site-packages/subscription_manager/scripts/rhsm_service.pyc
/usr/lib64/python2.7/site-packages/subscription_manager/scripts/rhsm_service.pyo
/usr/lib64/python2.7/site-packages/subscription_manager/scripts/rhsmcertd_worker.pyc
/usr/lib64/python2.7/site-packages/subscription_manager/scripts/rhsmcertd_worker.pyo
/usr/lib64/python2.7/site-packages/rhsm_debug
/usr/lib64/python2.7/site-packages/rhsm
/usr/share/locale/as/LC_MESSAGES/rhsm.mo
/usr/share/locale/bn_IN/LC_MESSAGES/rhsm.mo
/usr/share/locale/de/LC_MESSAGES/rhsm.mo
/usr/share/locale/es/LC_MESSAGES/rhsm.mo
/usr/share/locale/fr/LC_MESSAGES/rhsm.mo
/usr/share/locale/gu/LC_MESSAGES/rhsm.mo
/usr/share/locale/hi/LC_MESSAGES/rhsm.mo
/usr/share/locale/it/LC_MESSAGES/rhsm.mo
/usr/share/locale/ja/LC_MESSAGES/rhsm.mo
/usr/share/locale/kn/LC_MESSAGES/rhsm.mo
/usr/share/locale/ko/LC_MESSAGES/rhsm.mo
/usr/share/locale/ml/LC_MESSAGES/rhsm.mo
/usr/share/locale/mr/LC_MESSAGES/rhsm.mo
/usr/share/locale/or/LC_MESSAGES/rhsm.mo
/usr/share/locale/pa/LC_MESSAGES/rhsm.mo
/usr/share/locale/pt_BR/LC_MESSAGES/rhsm.mo
/usr/share/locale/ru/LC_MESSAGES/rhsm.mo
/usr/share/locale/te/LC_MESSAGES/rhsm.mo
/usr/share/locale/zh_CN/LC_MESSAGES/rhsm.mo
/usr/share/locale/zh_TW/LC_MESSAGES/rhsm.mo
/usr/share/locale/ta_IN/LC_MESSAGES/rhsm.mo
/usr/share/man/man5/rhsm.conf.5.gz
/usr/share/man/man8/rhsm-debug.8.gz
/usr/share/man/man8/rhsmcertd.8.gz
/usr/share/dbus-1/system-services/com.redhat.RHSM1.Facts.service
/usr/share/dbus-1/system-services/com.redhat.RHSM1.service
/usr/share/polkit-1/actions/com.redhat.RHSM1.Facts.policy
/usr/share/polkit-1/actions/com.redhat.RHSM1.policy
/usr/share/rhsm-plugins
/usr/share/mc/skins/dark.ini
/usr/share/mc/skins/darkfar.ini
/usr/share/mc/skins/default.ini
/usr/share/mc/skins/double-lines.ini
/usr/share/mc/skins/featured.ini
/usr/share/mc/skins/gotar.ini
/usr/share/mc/skins/mc46.ini
/usr/share/mc/skins/nicedark.ini
/usr/share/mc/skins/sand256.ini
/usr/share/mc/skins/xoria256.ini
/usr/share/rhel/secrets/rhsm
/usr/share/ansible/collections/ansible_collections/community/zabbix/scripts/inventory/zabbix.ini
/usr/share/ansible/collections/ansible_collections/community/zabbix/tox.ini
/usr/share/ansible/collections/ansible_collections/community/postgresql/tox.ini
/usr/share/ansible/collections/ansible_collections/community/general/plugins/modules/rhsm_release.py
/usr/share/ansible/collections/ansible_collections/community/general/plugins/modules/rhsm_repository.py
/usr/share/ansible/collections/ansible_collections/community/general/tests/unit/plugins/modules/test_rhsm_release.py
/usr/share/ansible/collections/ansible_collections/community/general/tests/unit/plugins/modules/test_rhsm_repository.py
/usr/share/ansible/collections/ansible_collections/ansible/utils/mypy.ini
/usr/share/ansible/collections/ansible_collections/ansible/utils/tox-ansible.ini
/usr/share/ansible/collections/ansible_collections/ansible/utils/tox.ini
/usr/share/ansible/collections/ansible_collections/ansible/netcommon/tox.ini
/usr/libexec/rhsmcertd-worker
/usr/libexec/rhsmd
/usr/libexec/rhsm-facts-service
/usr/libexec/rhsm-service
/usr/local/lib/python3.6/site-packages/azure/mgmt/keyvault/v2020_04_01_preview/aio/operations/_managed_hsms_operations.py
/usr/local/lib/python3.6/site-packages/azure/mgmt/keyvault/v2020_04_01_preview/aio/operations/__pycache__/_managed_hsms_operations.cpython-36.pyc
/usr/local/lib/python3.6/site-packages/azure/mgmt/keyvault/v2020_04_01_preview/operations/_managed_hsms_operations.py
/usr/local/lib/python3.6/site-packages/azure/mgmt/keyvault/v2020_04_01_preview/operations/__pycache__/_managed_hsms_operations.cpython-36.pyc
/usr/local/lib/python3.6/site-packages/azure/mgmt/keyvault/v2021_04_01_preview/aio/operations/_managed_hsms_operations.py
/usr/local/lib/python3.6/site-packages/azure/mgmt/keyvault/v2021_04_01_preview/aio/operations/_mhsm_private_endpoint_connections_operations.py
/usr/local/lib/python3.6/site-packages/azure/mgmt/keyvault/v2021_04_01_preview/aio/operations/_mhsm_private_link_resources_operations.py
/usr/local/lib/python3.6/site-packages/azure/mgmt/keyvault/v2021_04_01_preview/aio/operations/__pycache__/_managed_hsms_operations.cpython-36.pyc
/usr/local/lib/python3.6/site-packages/azure/mgmt/keyvault/v2021_04_01_preview/aio/operations/__pycache__/_mhsm_private_endpoint_connections_operations.cpython-36.pyc
/usr/local/lib/python3.6/site-packages/azure/mgmt/keyvault/v2021_04_01_preview/aio/operations/__pycache__/_mhsm_private_link_resources_operations.cpython-36.pyc
/usr/local/lib/python3.6/site-packages/azure/mgmt/keyvault/v2021_04_01_preview/operations/_managed_hsms_operations.py
/usr/local/lib/python3.6/site-packages/azure/mgmt/keyvault/v2021_04_01_preview/operations/_mhsm_private_endpoint_connections_operations.py
/usr/local/lib/python3.6/site-packages/azure/mgmt/keyvault/v2021_04_01_preview/operations/_mhsm_private_link_resources_operations.py
/usr/local/lib/python3.6/site-packages/azure/mgmt/keyvault/v2021_04_01_preview/operations/__pycache__/_managed_hsms_operations.cpython-36.pyc
/usr/local/lib/python3.6/site-packages/azure/mgmt/keyvault/v2021_04_01_preview/operations/__pycache__/_mhsm_private_endpoint_connections_operations.cpython-36.pyc
/usr/local/lib/python3.6/site-packages/azure/mgmt/keyvault/v2021_04_01_preview/operations/__pycache__/_mhsm_private_link_resources_operations.cpython-36.pyc
/usr/local/lib/python3.6/site-packages/azure/mgmt/keyvault/v2021_06_01_preview/aio/operations/_managed_hsms_operations.py
/usr/local/lib/python3.6/site-packages/azure/mgmt/keyvault/v2021_06_01_preview/aio/operations/_mhsm_private_endpoint_connections_operations.py
/usr/local/lib/python3.6/site-packages/azure/mgmt/keyvault/v2021_06_01_preview/aio/operations/_mhsm_private_link_resources_operations.py
/usr/local/lib/python3.6/site-packages/azure/mgmt/keyvault/v2021_06_01_preview/aio/operations/__pycache__/_managed_hsms_operations.cpython-36.pyc
/usr/local/lib/python3.6/site-packages/azure/mgmt/keyvault/v2021_06_01_preview/aio/operations/__pycache__/_mhsm_private_endpoint_connections_operations.cpython-36.pyc
/usr/local/lib/python3.6/site-packages/azure/mgmt/keyvault/v2021_06_01_preview/aio/operations/__pycache__/_mhsm_private_link_resources_operations.cpython-36.pyc
/usr/local/lib/python3.6/site-packages/azure/mgmt/keyvault/v2021_06_01_preview/operations/_managed_hsms_operations.py
/usr/local/lib/python3.6/site-packages/azure/mgmt/keyvault/v2021_06_01_preview/operations/_mhsm_private_endpoint_connections_operations.py
/usr/local/lib/python3.6/site-packages/azure/mgmt/keyvault/v2021_06_01_preview/operations/_mhsm_private_link_resources_operations.py
/usr/local/lib/python3.6/site-packages/azure/mgmt/keyvault/v2021_06_01_preview/operations/__pycache__/_managed_hsms_operations.cpython-36.pyc
/usr/local/lib/python3.6/site-packages/azure/mgmt/keyvault/v2021_06_01_preview/operations/__pycache__/_mhsm_private_endpoint_connections_operations.cpython-36.pyc
/usr/local/lib/python3.6/site-packages/azure/mgmt/keyvault/v2021_06_01_preview/operations/__pycache__/_mhsm_private_link_resources_operations.cpython-36.pyc






-sh-4.2$ pwd
/home/p585600
-sh-4.2$ cd /opt/jboss-eap/
-sh-4.2$ ls -la
total 0
drwxr-xr-x   3 root root  21 Mar 13 10:25 .
drwxr-xr-x. 17 root root 244 Mar 13 10:25 ..
drwxr-xr-x   3 root root  20 Mar 13 10:25 modules
-sh-4.2$ cd modules
-sh-4.2$ ls -la
total 0
drwxr-xr-x 3 root root 20 Mar 13 10:25 .
drwxr-xr-x 3 root root 21 Mar 13 10:25 ..
drwxr-xr-x 3 root root 20 Mar 13 10:25 system
-sh-4.2$ cd system
-sh-4.2$ ls -la
total 0
drwxr-xr-x 3 root root 20 Mar 13 10:25 .
drwxr-xr-x 3 root root 20 Mar 13 10:25 ..
drwxr-xr-x 3 root root 18 Mar 13 10:25 layers
-sh-4.2$ cd layers
-sh-4.2$ ls -la
total 0
drwxr-xr-x 3 root root 18 Mar 13 10:25 .
drwxr-xr-x 3 root root 20 Mar 13 10:25 ..
drwxr-xr-x 3 root root 17 Mar 13 10:25 base
-sh-4.2$ cd base
-sh-4.2$ ls -la
total 0
drwxr-xr-x 3 root root 17 Mar 13 10:25 .
drwxr-xr-x 3 root root 18 Mar 13 10:25 ..
drwxr-xr-x 3 root root 21 Mar 13 10:25 org
-sh-4.2$ cd org
-sh-4.2$ ls -la
total 0
drwxr-xr-x 3 root root 21 Mar 13 10:25 .
drwxr-xr-x 3 root root 17 Mar 13 10:25 ..
drwxr-xr-x 3 root root 23 Mar 13 10:25 wildfly
-sh-4.2$ cd wildfly
-sh-4.2$ ls -la
total 0
drwxr-xr-x 3 root root 23 Mar 13 10:25 .
drwxr-xr-x 3 root root 21 Mar 13 10:25 ..
drwxr-xr-x 3 root root 33 Mar 13 10:25 extension
-sh-4.2$

-sh-4.2$
-sh-4.2$ env | grep -i hsm
-sh-4.2$
-sh-4.2$
-sh-4.2$ find /opt -iname "*.properties" | xargs grep -li "hsm\|dinamo\|taccon" 2>/dev/null
find: ‘/opt/puppetlabs/puppet/cache’: Permissão negada
find: ‘/opt/puppetlabs/pxp-agent/spool’: Permissão negada
find: ‘/opt/puppetlabs/pxp-agent/tasks-cache’: Permissão negada
find: ‘/opt/ctmage/ctm/onstmt’: Permissão negada
find: ‘/opt/ctmage/ctm/backup’: Permissão negada
find: ‘/opt/ctmage/ctm/status’: Permissão negada
find: ‘/opt/ctmage/ctm/procid’: Permissão negada


find: ‘/opt/rh/python27/root/root’: Permissão negada
find: ‘/opt/GC_Ext/GC/sockets’: Permissão negada
find: ‘/opt/GC_Service/GC/sockets’: Permissão negada
find: ‘/opt/microsoft/mdatp/resources/cache’: Permissão negada
-sh-4.2$
-sh-4.2$
-sh-4.2$
