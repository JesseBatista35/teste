unzip -p /tmp/bkp_sirotcon/sirotcon-ejb.jar META-INF/MANIFEST.MF
unzip -p /tmp/bkp_sirotcon/sirotcon-ejb.jar 'META-INF/maven/*/pom.xml' 2>/dev/null | grep -B2 -A4 -iE "log|<scope>"
