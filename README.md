---
#- name: Import role Java
#  import_role:
#    name: ansible-java-oracle-jdk
#      vars:
#        java_oracle_jdk_version: 8
#        java_oracle_jdk_subversion: 191
#  tags: java

- name: JBoss OS group
  group:
    name: "{{ jboss_group }}"

- name: JBoss OS user
  user:
    name: "{{ jboss_user }}"
    group: "{{ jboss_group }}"

- name: JBoss home dir
  file:
    path: "{{ jboss_home }}"
    owner: "{{ jboss_user }}"
    group: "{{ jboss_group }}"
    state: directory
    mode: 0755

#- name: ensure jboss
#  stat: 
#    path: "{{ jboss_home }}/jboss-modules.jar"
#  register: jboss_install

#- block:
#    - name: Verificando se o ambiente foi criado
#      debug:
#        msg: "Jboss já esta instalado"
#
#  #  - meta: end_host
#  when: jboss_install.stat.exists == True

#- name: fail jboss_install
#  fail:
#    msg: "playbook is stopped because jboss is installed: {{ jboss_home }}"
#  when: jboss_install.stat.exists == True


- name: Determine JBoss download url
  set_fact:
    jboss_install_src: "{{ jboss_download_info[jboss_release_major|int][jboss_release_minor|int].url }}" 
    jboss_java_home: "/usr/java/jdk1.{{ jboss_java_version_major }}.0_{{ jboss_java_version_minor }}"
  tags: untar

# Firewalld
#- name: Habilitando firewalld
#  firewalld:
#    port: "{{ item }}/tcp"
#    permanent: yes
#    state: present 
#    immediate: yes
#  loop:
#    - 8080
#    - 9990
#  tags: firewall

- name: Desabilitando o firewalld
  systemd:
    name: firewalld
    enabled: no
    state: stopped
  tags: firewall

#- name: Ajustando o sysctl
#  copy:
#    src: "sysctl.jboss.conf"
#    dest: "/etc/sysctl.d/jboss.conf"
#    owner: root
#    group: root
#
#- name: Ajustando o limits
#  copy:
#    src: "limits.jboss.conf"
#    dest: "/etc/security/limits.d/90-jboss.conf"
#    owner: root
#    group: root
#
- name: Add or modify memlock limit for the user jboss
  pam_limits:
    domain: jboss
    limit_type: '-'
    limit_item: "{{ item.parametro }}"
    value: "{{ item.valor }}"
    use_max: yes
    dest: "/etc/security/limits.d/90-jboss.conf"
  loop:
    - { parametro: 'memlock', valor: '2621440'}
    - { parametro: 'nofile',  valor: '262140'}
    - { parametro: 'nproc',   valor: '131072'}
        
#- name: Add or modify nofile limit for the user jboss
#  pam_limits:
#    domain: jboss
#    limit_type: '-'
#    limit_item: nofile
#    value: 262140
#    use_max: yes
#    dest: "/etc/security/limits.d/90-jboss.conf"
#
#- name: Add or modify nofile limit for the user jboss
#  pam_limits:
#    domain: jboss
#    limit_type: '-'
#    limit_item: nproc
#    value: 131072
#    use_max: yes
#    dest: "/etc/security/limits.d/90-jboss.conf"

#- sysctl:
#    name: "{{ item.parametro }}"
#    value: "{{ item.valor }}"
#    sysctl_set: yes
#    state: present
#    sysctl_file: /etc/sysctl.d/jboss.conf
#    reload: yes 
#    ignoreerrors: yes
#  loop:
#    - { parametro: 'fs.file-max', valor: '262140'}
#    - { parametro: 'kernel.core_uses_pid', valor: '1'}
#    - { parametro: 'kernel.msgmax', valor: '65536'}
#    - { parametro: 'kernel.msgmnb', valor: '65536'}
#    - { parametro: 'kernel.pid_max', valor: '65536'}
#    - { parametro: 'kernel.shmall', valor: '{{ ( ( ansible_memtotal_mb * 1048576 + 100000000 ) / 4 ) | int }}'}
#    - { parametro: 'kernel.shmmax', valor: '{{ ( ansible_memtotal_mb * 1048576 + 100000000 ) | int }}'}
#    - { parametro: 'kernel.sysrq', valor: '0'}
#    - { parametro: 'net.bridge.bridge-nf-call-arptables', valor: '0'}
#    - { parametro: 'net.bridge.bridge-nf-call-ip6tables', valor: '0'}
#    - { parametro: 'net.bridge.bridge-nf-call-iptables', valor: '0'}
#    - { parametro: 'net.core.netdev_max_backlog', valor: '3000'}
#    - { parametro: 'net.core.rmem_mae', valor: '26214400'}
#    - { parametro: 'net.core.somaxconn', valor: '3000'}
#    - { parametro: 'net.core.wmem_max', valor: '1048576'}
#    - { parametro: 'net.ipv4.conf.all.accept_redirects', valor: '0'}
#    - { parametro: 'net.ipv4.conf.all.secure_redirects', valor: '0'}
#    - { parametro: 'net.ipv4.conf.all.send_redirects', valor: '0'}
#    - { parametro: 'net.ipv4.conf.default.accept_redirects', valor: '0'}
#    - { parametro: 'net.ipv4.conf.default.accept_source_route', valor: '0'}
#    - { parametro: 'net.ipv4.conf.default.rp_filter', valor: '1'}
#    - { parametro: 'net.ipv4.conf.default.secure_redirects', valor: '0'}
#    - { parametro: 'net.ipv4.conf.default.send_redirects', valor: '0'}
#    - { parametro: 'net.ipv4.ip_forward', valor: '0'}
#    - { parametro: 'net.ipv4.tcp_keepalive_intvl', valor: '15'}
#    - { parametro: 'net.ipv4.tcp_keepalive_probes', valor: '5'}
#    - { parametro: 'net.ipv4.tcp_syncookies', valor: '1'}
#    - { parametro: 'vm.nr_hugepages', valor: '{{ ( ansible_memtotal_mb / 4 ) | int }}'}
#    - { parametro: 'vm.nr_hugepages_mempolicy', valor: '{{ ( ansible_memtotal_mb / 4 ) | int }}'}

- name: Install packages gtar and unzip
  yum:
    name: 
      - tar
      - unzip
      - git
    state: present

- name: Mount nfs modules
  mount:
    path: "{{ jboss_home }}/modules/" 
    src: "{{ jboss_nfs_ip }}:{{ jboss_nfs_path }}"
    fstype: nfs
    opts: defaults
    state: mounted
  when: jboss_modules_nfs|bool
  ignore_errors: on
  tags: nfs

- name: Download and Extract Tarball not using NFS
  unarchive:
    src: "{{ jboss_install_src }}"
    dest: "{{ jboss_home }}"
    extra_opts:
      - "--no-same-owner"
      - "--no-same-permissions"
      - "--strip-components=1"
    creates: "{{ jboss_home }}/jboss-modules.jar"
    owner: "{{ jboss_user }}"
    group: "{{ jboss_group }}"
    remote_src: "yes"
  when: not jboss_modules_nfs|bool
  tags: untar

- name: Download and Extract Tarball using NFS DC
  unarchive:
    src: "{{ jboss_install_src }}"
    dest: "{{ jboss_home }}"
    extra_opts:
      - "--no-same-owner"
      - "--no-same-permissions"
      - "--strip-components=1"
    creates: "{{ jboss_home }}/jboss-modules.jar"
    owner: "{{ jboss_user }}"
    group: "{{ jboss_group }}"
    remote_src: "yes"
  when: 
    - jboss_modules_nfs|bool
    - jboss_host_config == "host-master.xml"
  tags: untar

- name: Download and Extract Tarball using NFS HC
  unarchive:
    src: "{{ jboss_install_src }}"
    dest: "{{ jboss_home }}"
    extra_opts:
      - "--no-same-owner"
      - "--no-same-permissions"
      - "--strip-components=1"
    creates: "{{ jboss_home }}/jboss-modules.jar"
    owner: "{{ jboss_user }}"
    group: "{{ jboss_group }}"
    exclude: "modules/*"
    remote_src: 'yes'
  when: 
    - jboss_modules_nfs|bool
    - jboss_host_config == "host-slave.xml"
  tags: untar

- name: Determine variable jboss_domain_instance DC
  set_fact:
    jboss_domain_instance: "{{ jboss_instance_dc }}" 
  when: 
    - jboss_host_config == "host-master.xml"
  tags: 
    - conf
    - always

- name: Determine variable jboss_domain_instance HC
  set_fact:
    jboss_domain_instance: "{{ jboss_instance_hc }}" 
  when: 
    - jboss_host_config == "host-slave.xml"
  tags: 
    - conf
    - always

- name: Determine variable jboss_domain_instance standalone
  set_fact:
    jboss_domain_instance: "standalone" 
  when: 
    - jboss_mode == "standalone"
  tags: 
    - conf
    - always

- name: Copy directory domain to instance name
  synchronize:
    src: "{{ jboss_home }}/domain/"
    dest: "{{ jboss_home }}/{{ jboss_domain_instance }}/"
  when: jboss_mode == "domain"
  delegate_to: "{{ inventory_hostname }}"


- name: Management Realm user 
  lineinfile:
    path: "{{ jboss_home }}/{{ jboss_domain_instance }}/configuration/mgmt-users.properties"
    line: "{{ jboss_mgmt_user }}={{ [jboss_mgmt_user, 'ManagementRealm', jboss_mgmt_password] | join(':') | hash('md5') }}"
    regexp: "^{{ jboss_mgmt_user }}="

- name: Management Realm user 
  lineinfile:
    path: "{{ jboss_home }}/bin/{{ jboss_mode }}.conf"
    line: "JAVA_HOME={{ jboss_java_home }}"
    regexp: "^#JAVA_HOME="

# Configurations host-slave.xml
- name: Update name host controller
  replace:
    path: "{{ jboss_home }}/{{ jboss_domain_instance }}/configuration/host-slave.xml"
    regexp: (?P<open><host )(?P<name>name="[^"]*" *)*(?P<xmlns>xmlns.*)
    replace: \g<open>name="{{ ansible_hostname|upper if jboss_vertical is not defined else '_'.join((ansible_hostname,jboss_vertical))|upper }}" \g<xmlns>
  when: 
    - jboss_mode == "domain"
    - jboss_host_config == "host-slave.xml"
  tags: name

- name: Update remote secret
  replace:
    path: "{{ jboss_home }}/{{ jboss_domain_instance }}/configuration/host-slave.xml"
    regexp: <secret value=".*"/>
    replace: '<secret value="{{ jboss_mgmt_password | b64encode }}"/>'
  when: 
    - jboss_mode == "domain"
    - jboss_host_config == "host-slave.xml"
  tags: secret

- name: Update remote username
  replace:
    path: "{{ jboss_home }}/{{ jboss_domain_instance }}/configuration/host-slave.xml"
    regexp: (?P<open><remote .*ManagementRealm")(?P<username> username="[^"]*")*(?P<close>/?>)
    replace: \g<open> username="{{ jboss_mgmt_user }}"\g<close>
  when: 
    - jboss_mode == "domain"
    - jboss_host_config == "host-slave.xml"
  tags: secret

- name: Update file host-slave.xml to directory log
  replace:
    path: "{{ jboss_home }}/{{ jboss_domain_instance }}/configuration/host-slave.xml"
    regexp: '<servers>'
    replace: '<servers directory-grouping="{{ jboss_directory_grouping }}">'
  when: 
    - jboss_mode == "domain"

# Configure modcluster
- name: Configure outbound-socket-binding in mode standalone
  blockinfile:
    path: "{{ jboss_home }}/{{ jboss_mode }}/configuration/{{ jboss_config }}"
    marker: "        <!-- {mark} ANSIBLE MANAGED BLOCK -->"
    insertbefore: </socket-binding-group>
    block: "{{ lookup('file','{{ role_path}}/files/outbound-socket-binding.xml') }}"
  when:
    - jboss_mode == "standalone" and jboss_config == "{{ jboss_config }}" and jboss_config_modcluster|bool
  tags: modcluster

- name: Configure modcluster in mode standalone
  lineinfile:
    path: "{{ jboss_home }}/{{ jboss_mode }}/configuration/{{ jboss_config }}"
    regexp: "<mod-cluster-config "
    line: "        <mod-cluster-config advertise-socket=\"modcluster\" proxies=\"proxy1 proxy2\" balancer=\"{{ jboss_modcluster_balancer }}\" load-balancing-group=\"{{ jboss_modcluster_balancer }}\" connector=\"ajp\">"
  when:
    - jboss_mode == "standalone" and jboss_config == "{{ jboss_config }}" and jboss_config_modcluster|bool
  tags: modcluster
    - jboss_host_config == "host-slave.xml"

# Configuration ldap
- name: Update file host-master.xml subsystem security-realm to LDAP
  blockinfile:
    dest: "{{ jboss_home }}/{{ jboss_domain_instance }}/configuration/host-master.xml"
    backup: no
    state: "{{ 'present' if jboss_ldap_connection|bool == true else 'absent' }}"
    marker: "           <!-- {mark} - security-realm for ldap -->"
    block: "{{ lookup('file','{{ role_path }}/files/security-realm.xml') }}"
    insertafter: "</security-realm>"
  when: 
    - jboss_mode == "domain"
    - jboss_host_config == "host-master.xml"
  tags: ldap

- name: Update file host-master.xml subsystem outbound-connections to LDAP
  blockinfile:
    dest: "{{ jboss_home }}/{{ jboss_domain_instance }}/configuration/host-master.xml"
    backup: no
    state: "{{ 'present' if jboss_ldap_connection|bool == true else 'absent' }}"
    marker: "        <!-- {mark} - outbound-connections for ldap -->"
    block: |2
              <outbound-connections>
                  <ldap name="ldap_connection" url="{{ jboss_ldap_url }}" search-dn="{{ jboss_ldap_search }}" search-credential="{{ jboss_ldap_credential }}"/>
              </outbound-connections>
    insertbefore: "<audit-log>"
  when: 
    - jboss_mode == "domain"
    - jboss_host_config == "host-master.xml"
  tags: ldap

- name: Get namespace domain
  shell: grep "<domain " "{{ jboss_home }}/{{ jboss_domain_instance }}/configuration/domain.xml" | cut -d\" -f2
  register: namespacevalue
  when: 
    - jboss_mode == "domain"
    - jboss_host_config == "host-master.xml"
  tags: ldap

- name: Set file config to use domain.xml subsystem management
  set_fact:
    management_file: "{{ 'management_ldap.xml' if jboss_ldap_connection|bool == true else 'management_noldap.xml' }}"
  tags: 
    - ldap
    - always

- name: Update domain.xml to use LDAP
  xml:
    path: "{{ jboss_home }}/{{ jboss_domain_instance }}/configuration/domain.xml"
    xpath: /x:domain/x:management
    namespaces:
      x: "{{ namespacevalue.stdout }}"
    input_type: xml
    set_children: "{{ lookup('file','{{ role_path}}/files/{{ management_file }}') }}"
  when: 
    - jboss_mode == "domain"
    - jboss_host_config == "host-master.xml"
  tags: 
    - ldap
    - always

# Create dir log
- name: Create Jboss log dir in mode domain
  file:
    path: "{{ jboss_log_dir }}/{{ jboss_home|basename }}/{{ jboss_domain_instance }}"
    owner: "{{ jboss_user }}"
    group: "{{ jboss_group }}"
    state: directory
    recurse: yes
    mode: 0755
  when:
    - jboss_mode == "domain"
  tags: logdir

- name: Create Jboss log dir in mode standalone
  file:
    path: "{{ jboss_log_dir }}/{{ jboss_home|basename }}/{{ jboss_mode }}"
    owner: "{{ jboss_user }}"
    group: "{{ jboss_group }}"
    state: directory
    recurse: yes
    mode: 0755
  when:
    - jboss_mode == "standalone"
  tags: logdir


# Configuration scripts
- name: Standalone | Set service name 
  set_fact:
    #jboss_service_name: "jboss-eap-{{ jboss_mode }}-{{ jboss_release_major }}{{ jboss_release_minor }}"
    jboss_service_name: "jboss-eap-{{ jboss_mode }}"
  when: jboss_mode == "standalone"
  tags: 
    - scripts
    - always
   

- name: Domain | Set service name 
  set_fact:
    jboss_service_name: "jboss-eap-{{ jboss_mode }}-{{ jboss_domain_instance }}-{{ jboss_release_major }}{{ jboss_release_minor }}"
  when: jboss_mode == "domain"
  tags: 
    - scripts
    - always

- name: Copy template script {{ jboss_home }}/bin/common_start.sh
  template:
    src: common_start.sh
    dest: "{{ jboss_home }}/bin/common_start.sh"
    owner: "{{ jboss_user }}"
    group: "{{ jboss_group }}"
    mode: 0755
  tags: 
    - scripts
    - deploy
    - scripts_common

- name: Copy template script
  template:
    src: jboss-eap.sh.j2
    dest: "{{ jboss_home }}/bin/init.d/{{ jboss_service_name }}.sh"
    owner: "{{ jboss_user }}"
    group: "{{ jboss_group }}"
    mode: 0755
  tags: 
    - scripts
    - always
    - scripts_common



- name: JBoss systemd wrapper for sysvinit script mode domain
  template:
    src: jboss.sysvinit.service.j2
    dest: "/etc/systemd/system/{{ jboss_service_name }}.service"
    owner: "{{ jboss_user }}"
    group: "{{ jboss_group }}"
    mode: 0644
  notify: Start Jboss
  tags: 
    - scripts
    - scripts_common



- name: Download modules add-ons (keycloak, oracle, db2)
  unarchive:
    src: http://cbrsvaprlx017.intra.caixa.gov.br/deploy/add-ons.tar.gz
    dest: "{{ jboss_home }}/modules/system"
    extra_opts:
      - "--no-same-owner"
      - "--no-same-permissions"
    creates: "{{ jboss_home }}/add-ons"
    owner: "{{ jboss_user }}"
    group: "{{ jboss_group }}"
    remote_src: "yes"
  when: jboss_modules_add_ons|bool
  tags: modules

- name: Deploy modules db
  copy:
    src: "{{ jboss_home }}/modules/system/add-ons/{{ item.module }}/."
    dest: "{{ jboss_home }}/modules/system/layers/base/{{ item.module }}/"
    remote_src: yes
    owner: jboss
    group: jboss
  loop:
    - { module: 'com'}
    - { module: 'org'}
  tags:
    - modules

