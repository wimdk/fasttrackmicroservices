
#Day 1

## Introduction

> The web is a large middleware platform

nice idea : talk with business people and use a swearbox-principle : every time they use the word database, one dollar in the swearbox, or the word application server, one dollar in the swearbox : it seems a good tool to facilitate finding out business requirements

capability map : focus on capabilities, makes it easier to talk with business.


When vendors or ivory tower enterprise architects (like those of some companies we all know) come talking about how some middleware tool leverages -ilities, just refer to the web : it has all those -ilities without the unnecessary complexity (eg. https vs kerberos), or simple http vs wsdl, ...

##The web as a platform

If you read REST in practice, you probably won't learn many new things here

Who has read rfc2616 ? Yet we're all professionnally web-developers...

Don't call it an URL, call it an URI

A lot of attention paid to idempotency, and how the http-verbs are idempotent (except for post)

Async behaviour by using message queues are essentially ringbuffers, we have an upperbound to queue sizes.

Lookup JSON-LD as an hypermedia-format HAL Collection-JSON




# References 

* essential .net : according to Jim, best book on oo-design [https://www.amazon.co.uk/Essential-NET-Microsoft-Development-Paperback/dp/0201734117](https://www.amazon.co.uk/Essential-NET-Microsoft-Development-Paperback/dp/0201734117)

* Enterprise architecture as strategy : "capabilities drive the entity lifecycle" [https://www.amazon.co.uk/Enterprise-Architecture-Strategy-Foundation-Execution/dp/1591398398](https://www.amazon.co.uk/Enterprise-Architecture-Strategy-Foundation-Execution/dp/1591398398)

* FLP theorema eens bekijken (voorafgaand aan CAP)

* Starbucks does not use two-phase commit [http://www.enterpriseintegrationpatterns.com/ramblings/18_starbucks.html](http://www.enterpriseintegrationpatterns.com/ramblings/18_starbucks.html)
