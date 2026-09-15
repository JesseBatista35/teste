
<
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="refresh" content="0;url=main/home"/>
</head>
* Connection #0 to host localhost left intact
* Closing connection #0
</html>-sh-4.1$ netsat -an | grep :8380 | grep ESTABLISHED
-sh: netsat: comando não encontrado
-sh-4.1$ netstat -an | grep :8380 | grep ESTABLISHED
-sh-4.1$ ss -tnp | grep :8380
-sh-4.1$
-sh-4.1$
-sh-4.1$
-sh-4.1$ nslookup sitec.desenvolvimento.extracaixa
Server:         10.192.224.137
Address:        10.192.224.137#53

Name:   sitec.desenvolvimento.extracaixa
Address: 10.192.220.98

-sh-4.1$ dig sitec.desenvolvimento.extracaixa

; <<>> DiG 9.8.2rc1-RedHat-9.8.2-0.68.rc1.el6 <<>> sitec.desenvolvimento.extracaixa
;; global options: +cmd
;; Got answer:
;; ->>HEADER<<- opcode: QUERY, status: NOERROR, id: 63921
;; flags: qr aa rd ra; QUERY: 1, ANSWER: 1, AUTHORITY: 0, ADDITIONAL: 0

;; QUESTION SECTION:
;sitec.desenvolvimento.extracaixa. IN   A

;; ANSWER SECTION:
sitec.desenvolvimento.extracaixa. 20 IN A       10.192.220.98

;; Query time: 4 msec
;; SERVER: 10.192.224.137#53(10.192.224.137)
;; WHEN: Tue Sep 15 10:57:44 2026
;; MSG SIZE  rcvd: 66

-sh-4.1$
