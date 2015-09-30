# airline-api-management

The idea is to have a policy for an airline to rate limit travel agencies, OTAs or other external users of booking and lookup services of that airline.
So, a travel agencies might be allowed to do 500 lookups per one requested booking. If no bookings are coming in the agency will be blocked to use the lookup service further.

The demo contains
- the custom policy for the look 2 book ratio
- an object store based look 2 book API that returns the ratio for a given customer and takes events from the lookup and booking service
- every event increases the lookups or booking count accordingly to keep the ration up 2 date
- two SOAP services that represent an example booking and lookup service, sending correspondent events to the look 2 book API



