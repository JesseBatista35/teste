Skip to main content
Azure DevOps
projetos
/
Infraestrutura
/
Repos
/
Files
/

esteira-jboss-vm
Search


Infraestrutura

Overview

Boards

Repos
Files
Commits
Pushes
Branches
Tags
Pull requests

Pipelines

Test Plans

Artifacts
Project settings
esteira-jboss-vm

group_vars
inventory
library
roles
apache_exporter
apm_agent
cmdb
control_m
dns
filebeat
graylog-streams
java
jboss
jmx_exporter
ldap
node_exporter
tsm
vhost
vmware
validadores
.gitignore
.vault.sh
a.yml
alocaip_desalocar.json.j2
alocaip_gerar.json.j2
ansible.cfg
BotBMCDetailedDescription.j2
BotCreateChange.jar
ChangeHSI.j2
changehsi.yml

master

/
roles
/
java
java

New

Contents
History

defaults
17 de mar. de 2020
5b22f8ed
Apagados arquivos que não estão sendo utilizados root
examples
21 de fev. de 2020
bd61528f
carga inicial root
files
21 de fev. de 2020
bd61528f
carga inicial root

meta
21 de fev. de 2020
bd61528f
carga inicial root
tasks
17 de mar. de 2020
5b22f8ed
Apagados arquivos que não estão sendo utilizados root
tests
21 de fev. de 2020
bd61528f
carga inicial root
vars
21 de fev. de 2020
bd61528f
carga inicial root
LICENSE
21 de fev. de 2020
bd61528f
carga inicial root
README.md
21 de fev. de 2020
bd61528f
carga inicial root
Role Name
I needed a role that didn't rely on yum to install Oracle JDK. It's not pretty but sometimes I need multiple JAVA_HOMES. This role allows that. Additionally it can install the JCE, as well as set the alternatives, latest, and default symlinks.

Finally, it can set the entropy fix for running on virtualized hardware.

CRYPTO CHANGE! The java_install_jce flag continues to set policy, however to use the new crypt.policy flag set the 'java_crypto_policy' variable also.

Leaving the java_crypto_policy variable undefined (and setting java_install_jce to true) will install the JCE files as normal. Setting the java_crypto_policy variable will not install the files and will set the java.security crypto.policy setting so the policy folders will be used instead.

Use of this role implies acceptance of Oracle's terms of service and licenses; Use of JCE and Cryptography imply acceptance and complete understanding of your cryptography rules and law governing use.

NOTE: This is just for RHEL, CentOS, EL.

To install,

sudo ansible-galaxy install staylorx.oracle-jdk
Role Variables
Variables and defaults follow.

Install the Oracle JCE:

java_install_jce: false
Set the Oracle Crypto Policy (also requires the 'java_install_jce' flag be true):

java_crypto_policy: unlimited
Sets the entropy source, securerandom.source=file:/dev/./urandom

java_entropy_fix: false
Sets the default install location for RHEL

java_install_dir: /usr/java
Clean up after yourself?

java_remove_download: yes
Pull the files from Oracle? Saying yes implies you have accepted the license agreement!

java_download_from_oracle: yes
Where to locate the files on the local machines. Also where the files need to be if not downloaded. Set the 'java_download_from_oracle' flag if you have the correct files already placed.

java_download_path: /usr/local/src
Which version of course. Look to the defaults for the dictionary of latest versions.

java_version: 8u91
Set the default symlink? Also fires off the alternatives routine.

java_set_as_default: true
Set the latest symlink?

java_set_as_latest: true
Want to install 32 bit Java? Defaults to linux-x64

java_architecture: linux-x586
Dependencies
No dependencies on other roles.

IMPORTANT: Using this role implies that you have accepted the Oracle license agreement to download the Oracle JDK and JCE. If you don't agree, don't use this role please.

Example Playbook
Including an example of how to use your role (for instance, with variables passed in as parameters) is always nice for users too:

- hosts: servers
  become: yes
  become_user: root
  vars:
    java_install_jce: yes
    java_entropy_fix: yes
    java_remove_download: yes
    java_download_from_oracle: yes
    java_version: 8u74
    java_architecture: linux-x64
    java_set_as_default: yes
    java_set_as_latest: yes
  roles:
    - role: staylorx.oracle-jdk
Another example Playbook
This example show setting JCE by using the java.security file... and no files.

- hosts: servers
  become: yes
  become_user: root
  vars:
    java_install_jce: yes
    java_crypto_policy: unlimited
    java_entropy_fix: yes
    java_remove_download: yes
    java_download_from_oracle: yes
  roles:
    - role: staylorx.oracle-jdk
License
MIT

Expanded

Collapsed

Collapsed

Showing filters 1 through 3

No code files found for 'create a symbolic link' with applied filters

No code files found for 'symbolic link' with applied filters

No code files found for 'symbolic' with applied filters

Showing filters 1 through 3

Showing filters 1 through 3

Showing filters 1 through 3

