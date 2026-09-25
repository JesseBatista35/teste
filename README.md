oc rollout history dc/chrome -n selenium-grid
oc rollout history dc/chrome -n selenium-grid --revision=3 > /tmp/r3.txt
oc rollout history dc/chrome -n selenium-grid --revision=4 > /tmp/r4.txt
diff /tmp/r3.txt /tmp/r4.txt
