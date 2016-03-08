Purely functional parallelism 
=======================
- Parallel computation

## Actor object

Messages are sent to an Actor through one of the following methods.
```
! means “fire-and-forget”, e.g. send a message asynchronously and return immediately. Also known as tell.

? sends a message asynchronously and returns a Future representing a possible reply. Also known as ask.
```