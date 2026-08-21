[root@caddeapllx2560 opt]#
[root@caddeapllx2560 opt]# getent passwd 20003846
sansbp01:*:20003846:20001077:Usuario do Ansible - WO0000049756814:/home/sansbp01:/bin/bash
[root@caddeapllx2560 opt]#
[root@caddeapllx2560 opt]#
[root@caddeapllx2560 opt]# id 20003846 2>/dev/null
uid=20003846(sansbp01) gid=20001077(sansbp01) grupos=20001077(sansbp01)
[root@caddeapllx2560 opt]# grep 20003846 /etc/passwd
[root@caddeapllx2560 opt]# ausearch -ui 20003846 --start today | grep -i "acct=\|USER_LOGIN\|USER_START" | tail -20
type=USER_ACCT msg=audit(1787331285.241:150480): pid=749921 uid=20003846 auid=20003846 ses=285 msg='op=PAM:accounting grantors=pam_unix,pam_sss,pam_permit acct="sansbp01" exe="/usr/bin/sudo" hostname=? addr=? terminal=? res=success'
type=CRED_REFR msg=audit(1787331285.242:150482): pid=749921 uid=20003846 auid=20003846 ses=285 msg='op=PAM:setcred grantors=pam_env,pam_localuser,pam_unix acct="root" exe="/usr/bin/sudo" hostname=? addr=? terminal=? res=success'
type=USER_START msg=audit(1787331285.244:150483): pid=749921 uid=20003846 auid=20003846 ses=285 msg='op=PAM:session_open grantors=pam_keyinit,pam_keyinit,pam_limits,pam_systemd,pam_unix acct="root" exe="/usr/bin/sudo" hostname=? addr=? terminal=? res=success'
type=USER_END msg=audit(1787331285.498:150484): pid=749921 uid=20003846 auid=20003846 ses=285 msg='op=PAM:session_close grantors=pam_keyinit,pam_keyinit,pam_limits,pam_systemd,pam_unix acct="root" exe="/usr/bin/sudo" hostname=? addr=? terminal=? res=success'
type=CRED_DISP msg=audit(1787331285.498:150485): pid=749921 uid=20003846 auid=20003846 ses=285 msg='op=PAM:setcred grantors=pam_env,pam_localuser,pam_unix acct="root" exe="/usr/bin/sudo" hostname=? addr=? terminal=? res=success'
type=USER_ACCT msg=audit(1787331285.648:150496): pid=749988 uid=20003846 auid=20003846 ses=285 msg='op=PAM:accounting grantors=pam_unix,pam_sss,pam_permit acct="sansbp01" exe="/usr/bin/sudo" hostname=? addr=? terminal=? res=success'
type=CRED_REFR msg=audit(1787331285.649:150498): pid=749988 uid=20003846 auid=20003846 ses=285 msg='op=PAM:setcred grantors=pam_env,pam_localuser,pam_unix acct="root" exe="/usr/bin/sudo" hostname=? addr=? terminal=? res=success'
type=USER_START msg=audit(1787331285.650:150499): pid=749988 uid=20003846 auid=20003846 ses=285 msg='op=PAM:session_open grantors=pam_keyinit,pam_keyinit,pam_limits,pam_systemd,pam_unix acct="root" exe="/usr/bin/sudo" hostname=? addr=? terminal=? res=success'
type=USER_END msg=audit(1787331285.799:150500): pid=749988 uid=20003846 auid=20003846 ses=285 msg='op=PAM:session_close grantors=pam_keyinit,pam_keyinit,pam_limits,pam_systemd,pam_unix acct="root" exe="/usr/bin/sudo" hostname=? addr=? terminal=? res=success'
type=CRED_DISP msg=audit(1787331285.800:150501): pid=749988 uid=20003846 auid=20003846 ses=285 msg='op=PAM:setcred grantors=pam_env,pam_localuser,pam_unix acct="root" exe="/usr/bin/sudo" hostname=? addr=? terminal=? res=success'
type=USER_ACCT msg=audit(1787331285.910:150507): pid=750031 uid=20003846 auid=20003846 ses=285 msg='op=PAM:accounting grantors=pam_unix,pam_sss,pam_permit acct="sansbp01" exe="/usr/bin/sudo" hostname=? addr=? terminal=? res=success'
type=CRED_REFR msg=audit(1787331285.910:150509): pid=750031 uid=20003846 auid=20003846 ses=285 msg='op=PAM:setcred grantors=pam_env,pam_localuser,pam_unix acct="root" exe="/usr/bin/sudo" hostname=? addr=? terminal=? res=success'
type=USER_START msg=audit(1787331285.912:150510): pid=750031 uid=20003846 auid=20003846 ses=285 msg='op=PAM:session_open grantors=pam_keyinit,pam_keyinit,pam_limits,pam_systemd,pam_unix acct="root" exe="/usr/bin/sudo" hostname=? addr=? terminal=? res=success'
type=USER_END msg=audit(1787331286.059:150511): pid=750031 uid=20003846 auid=20003846 ses=285 msg='op=PAM:session_close grantors=pam_keyinit,pam_keyinit,pam_limits,pam_systemd,pam_unix acct="root" exe="/usr/bin/sudo" hostname=? addr=? terminal=? res=success'
type=CRED_DISP msg=audit(1787331286.059:150512): pid=750031 uid=20003846 auid=20003846 ses=285 msg='op=PAM:setcred grantors=pam_env,pam_localuser,pam_unix acct="root" exe="/usr/bin/sudo" hostname=? addr=? terminal=? res=success'
type=USER_ACCT msg=audit(1787331286.325:150518): pid=750074 uid=20003846 auid=20003846 ses=285 msg='op=PAM:accounting grantors=pam_unix,pam_sss,pam_permit acct="sansbp01" exe="/usr/bin/sudo" hostname=? addr=? terminal=? res=success'
type=CRED_REFR msg=audit(1787331286.325:150520): pid=750074 uid=20003846 auid=20003846 ses=285 msg='op=PAM:setcred grantors=pam_env,pam_localuser,pam_unix acct="root" exe="/usr/bin/sudo" hostname=? addr=? terminal=? res=success'
type=USER_START msg=audit(1787331286.327:150521): pid=750074 uid=20003846 auid=20003846 ses=285 msg='op=PAM:session_open grantors=pam_keyinit,pam_keyinit,pam_limits,pam_systemd,pam_unix acct="root" exe="/usr/bin/sudo" hostname=? addr=? terminal=? res=success'
type=USER_END msg=audit(1787331286.483:150522): pid=750074 uid=20003846 auid=20003846 ses=285 msg='op=PAM:session_close grantors=pam_keyinit,pam_keyinit,pam_limits,pam_systemd,pam_unix acct="root" exe="/usr/bin/sudo" hostname=? addr=? terminal=? res=success'
type=CRED_DISP msg=audit(1787331286.483:150523): pid=750074 uid=20003846 auid=20003846 ses=285 msg='op=PAM:setcred grantors=pam_env,pam_localuser,pam_unix acct="root" exe="/usr/bin/sudo" hostname=? addr=? terminal=? res=success'
[root@caddeapllx2560 opt]#
