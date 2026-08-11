unzip -l habitacao-5.12.0-Dev.512762.apk | grep -iE "google.services|firebase"


unzip -p habitacao-5.12.0-Dev.512762.apk AndroidManifest.xml | strings | grep -E "^1:[0-9]{10,}:android:"


unzip -p habitacao-5.12.0-Dev.512762.apk resources.arsc | strings | grep -E "^1:[0-9]{10,}:android:"


unzip -p habitacao-5.12.0-Dev.512762.apk AndroidManifest.xml | strings | grep "978309264263"
unzip -p habitacao-5.12.0-Dev.512762.apk resources.arsc | strings | grep "978309264263"
