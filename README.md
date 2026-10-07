ps -ef | grep [j]boss-modules | tr ' ' '\n' | grep -E '^-D(\[|jboss\.(home|server\.base)|.*modcluster)'
