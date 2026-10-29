 1 12:5
   1 13:1
root@sspdeaplux0100:/opt/SUNWas8/nodeagents/naux0100/dsv08/applications/j2ee-apps/cobranca# ^C
root@sspdeaplux0100:/opt/SUNWas8/nodeagents/naux0100/dsv08/applications/j2ee-apps/cobranca# /usr/gnu/bin/grep -a "Read timed out" /log_ias/ceflib/ceflib-dsv08.log | cut -c1-4 | uniq -c
  14 11:1
  19 11:2
   6 11:3
   4 11:5
   1 12:4
   1 12:5
   1 13:1
root@sspdeaplux0100:/opt/SUNWas8/nodeagents/naux0100/dsv08/applications/j2ee-apps/cobranca#
root@sspdeaplux0100:/opt/SUNWas8/nodeagents/naux0100/dsv08/applications/j2ee-apps/cobranca#
root@sspdeaplux0100:/opt/SUNWas8/nodeagents/naux0100/dsv08/applications/j2ee-apps/cobranca#
root@sspdeaplux0100:/opt/SUNWas8/nodeagents/naux0100/dsv08/applications/j2ee-apps/cobranca# /usr/gnu/bin/grep -a -n -E "^11:(1[0-9]|[2-5][0-9])" /log_ias/connector/connector.log | /usr/gnu/bin/grep -a -i -E "9683|erro|timeout|exce|reconect|desconect" | head -60
root@sspdeaplux0100:/opt/SUNWas8/nodeagents/naux0100/dsv08/applications/j2ee-apps/cobranca#
root@sspdeaplux0100:/opt/SUNWas8/nodeagents/naux0100/dsv08/applications/j2ee-apps/cobranca#
root@sspdeaplux0100:/opt/SUNWas8/nodeagents/naux0100/dsv08/applications/j2ee-apps/cobranca#
root@sspdeaplux0100:/opt/SUNWas8/nodeagents/naux0100/dsv08/applications/j2ee-apps/cobranca# /usr/gnu/bin/grep -n -E "9683|9690" /connector/config/map.properties /connector/config/connector.properties
/connector/config/map.properties:2:9683=sirotcics 9683
/connector/config/map.properties:52:9690=sirotcics 9690
/connector/config/map.properties:130:0012=sirotcics 9690
/connector/config/map.properties:147:0029=sirotcics 9683
root@sspdeaplux0100:/opt/SUNWas8/nodeagents/naux0100/dsv08/applications/j2ee-apps/cobranca#
