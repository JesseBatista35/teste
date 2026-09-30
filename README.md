for r in 80 81; do
  oc get rc sirex-agenda-api-des-$r -o json | python -c 'import json,sys; print(json.dumps(json.load(sys.stdin)["spec"]["template"]["spec"], indent=2, sort_keys=True))' > /tmp/rc$r.json
done
diff /tmp/rc80.json /tmp/rc81.json

oc debug rc/sirex-agenda-api-des-81 -n sirex-des
# dentro do pod de debug:
env | grep -iE 'java|applicationinsights'
ls -l /deployments/ | grep -i insights
/usr/local/s2i/run
