ipconfig | findstr IPv4
powershell -c "Test-NetConnection 10.249.79.56 -Port 443"
powershell -c "Test-NetConnection 10.249.79.82 -Port 443"
tracert -d -h 15 10.249.79.56
