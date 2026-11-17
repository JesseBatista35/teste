PID=$(pgrep -f "Server:srjtqapllx0056_sigaf_intra_8083"); echo "PID=$PID"; ls -l /proc/$PID/fd | grep -i log
