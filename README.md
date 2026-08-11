adscp01@cadsvaprlx015 app-5.12.0.512762]$ unzip -l habitacao-5.12.0-Dev.512762.apk | grep -iE "google.services|firebase"
      290  01-01-1981 01:01   res/raw/firebase_common_keep.xml
       82  01-01-1981 01:01   firebase-analytics-ktx.properties
       74  01-01-1981 01:01   firebase-analytics.properties
       78  01-01-1981 01:01   firebase-annotations.properties
       64  01-01-1981 01:01   firebase-core.properties
       82  01-01-1981 01:01   firebase-encoders-json.properties
       84  01-01-1981 01:01   firebase-encoders-proto.properties
       72  01-01-1981 01:01   firebase-encoders.properties
       78  01-01-1981 01:01   firebase-iid-interop.properties
       98  01-01-1981 01:01   firebase-measurement-connector.properties
[sadscp01@cadsvaprlx015 app-5.12.0.512762]$
[sadscp01@cadsvaprlx015 app-5.12.0.512762]$
[sadscp01@cadsvaprlx015 app-5.12.0.512762]$
[sadscp01@cadsvaprlx015 app-5.12.0.512762]$ unzip -p habitacao-5.12.0-Dev.512762.apk AndroidManifest.xml | strings | grep -E "^1:[0-9]{10,}:android:"
[sadscp01@cadsvaprlx015 app-5.12.0.512762]$
[sadscp01@cadsvaprlx015 app-5.12.0.512762]$
[sadscp01@cadsvaprlx015 app-5.12.0.512762]$
[sadscp01@cadsvaprlx015 app-5.12.0.512762]$ unzip -p habitacao-5.12.0-Dev.512762.apk resources.arsc | strings | grep -E "^1:[0-9]{10,}:android:"
[sadscp01@cadsvaprlx015 app-5.12.0.512762]$
[sadscp01@cadsvaprlx015 app-5.12.0.512762]$
[sadscp01@cadsvaprlx015 app-5.12.0.512762]$ unzip -p habitacao-5.12.0-Dev.512762.apk AndroidManifest.xml | strings | grep "978309264263"
[sadscp01@cadsvaprlx015 app-5.12.0.512762]$
[sadscp01@cadsvaprlx015 app-5.12.0.512762]$
[sadscp01@cadsvaprlx015 app-5.12.0.512762]$
[sadscp01@cadsvaprlx015 app-5.12.0.512762]$ unzip -p habitacao-5.12.0-Dev.512762.apk resources.arsc | strings | grep "978309264263"
--1:978309264263:android:fb2ea54ff4fdfdc1b95922
978309264263
HH978309264263-08hl7vgncm1p4pa51i2uhsf2nbsdnko9.apps.googleusercontent.com
[sadscp01@cadsvaprlx015 app-5.12.0.512762]$
[sadscp01@cadsvaprlx015 app-5.12.0.512762]$
[sadscp01@cadsvaprlx015 app-5.12.0.512762]$
[sadscp01@cadsvaprlx015 app-5.12.0.512762]$
[sadscp01@cadsvaprlx015 app-5.12.0.512762]$
[sadscp01@cadsvaprlx015 app-5.12.0.512762]$
