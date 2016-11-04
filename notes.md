
#Day 1

## Introduction

> The web is a large middleware platform

nice idea : talk with business people and use a swearbox-principle : every time they use the word database, one dollar in the swearbox, or the word application server, one dollar in the swearbox : it seems a good tool to facilitate finding out business requirements

capability map : focus on capabilities, makes it easier to talk with business.


When vendors or ivory tower enterprise architects (like those of some companies we all know) come talking about how some middleware tool leverages -ilities, just refer to the web : it has all those -ilities without the unnecessary complexity (eg. https vs kerberos), or simple http vs wsdl, ...

## The web as a platform

If you have read REST in practice, you probably won't learn many new things here

Who has read rfc2616 ? Yet we're all professionnally web-developers...

Don't call it an URL, call it an [URI](https://en.wikipedia.org/wiki/Uniform_Resource_Identifier)

A lot of attention paid to idempotency, and [how the http-verbs are idempotent](http://restcookbook.com/HTTP%20Methods/idempotency/)

Async behaviour by using message queues are essentially ringbuffers, we have an upperbound to queue sizes.

Lookup JSON-LD as an hypermedia-format HAL Collection-JSON


#Day 2

## exercise one

- see exercises
Again spring boot sucks. All goes well as long as you don't have to do exotic things together : getting started with resttemplate was rather easy. Afterwards using resttemplate with xml responses messed everything up...
TODO : take some time after course to build up the exercise again but not using spring


## Hypermedia deep dive
Hypermedia is like a fluent interface 
Design an api : focus on capabilities, make sure to hide everything that's related to implementations (lot's of reference to ddd and bounded contexts :-)
rpc idioms break the web : using headers+payload params makes a service less cacheable

## Scalability
Must remember to use the term "grandmother antipattern" when talking about stateful systems
REST services (as mentioned here in this course) are about speedsaving on the human scale (seconds, minutes, hours not milliseconds, microseconds, nanonseconds)
Collapsed forwarding : when a tsunami of traffic occurs, block all calls, except one. Let this one call retrieve the content and all the other traffic gets the cached content.

## Event-driven systems
A lot of things on atomfeeds, repeat of stuff in the book. 

## Securing microservices
Not sure I understood this quite well : don't use atomfeeds on the wide web even if tls is used. feeds stay available on the web forever (since immutable hence cacheable), this makes bruteforce attacks feasible on atomfeeds...

#Day 3

## Dealing with distribution
Distributed systems are hard - no-one with a sane mind would call distributed systems easy.
look into :https://github.com/real-logic/Aeron
look into paxos, raft as acid-related alternatives : apparently paxos can fry your brain if you try to understand it. Raft is specifically designed to be an alternative to paxos but better understandable : [https://raft.github.io/](https://raft.github.io/)

## design exercise
Think about an transactional event with REST for entering massive bank account updates : all the rich people should get it otherwise you're fired
Important message for this exercise is : see it as a resourceproblem where you have to find out what the right capability is you want to expose as a resource

## From monolyths to microservices


## Operating microservices
See microservices operations as more then just an api : vm's, network, ...
see : [https://neo4j.com/blog/managing-microservices-neo4j/](https://neo4j.com/blog/managing-microservices-neo4j/)
If a tool is called macgyver it has to be great : [https://github.com/LendingClub/macgyver](https://github.com/LendingClub/macgyver)
Some signs you are not at microservice levels yet 
* Different services do coördinated deployments
* A change in one service has _unexpected_ consequences or require a change in other services
* Services share a persistent store
* You cannot change your service's persistence tier without anyone caring
* Engineers need intimate knowledge of the designs and schemas of other teams' services



