/usr/gnu/bin/grep -a "Read timed out" /log_ias/ceflib/ceflib-dsv08.log | tail -3 | /usr/gnu/bin/grep -a -o -E "^[0-9:]{8}|Aplic\([^)]*\) Trans\. CICS\([^)]*\)|;[0-9]{4};;;;;;"
getent hosts sirotcics

