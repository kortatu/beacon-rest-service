# Beacons REST service

Service that manages a catalog of iBeacons to URL association using REST and HATEOAS

Curl urls:

curl http://localhost:8080/beacons


Add beacon:

curl -i -X POST -H "Content-Type:application/json" -d '{  "beaconId" : "8877712",  "url" : "www.educa2.madrid.org" }' http://127.0.0.1:8080/beacons

Remove beacon:

curl -i -X DELETE http://127.0.0.1:8080/beacons/13

