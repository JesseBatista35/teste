:read-children-names(child-type=host)

/host=sbrdeapllx105:read-attribute(name=host-state)

# no próprio host sbrdeapllx105
ps -ef | grep jboss
# localizar o PID do processo [Host Controller]
kill -9 <PID>


