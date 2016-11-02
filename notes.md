
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




