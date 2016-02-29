Strictness and laziness
=======================
###Strict
A strict function always evaluates all it's arguments. That is:  
A function f(x) is strict if for every expression x that diverges the execution of f(x) also diverges.

An example of a strict function could be `def sum(x: Int, y: Int): Int = x+y`. All arguments are invoked

###Non-strict

A non-strict function doesn't evaluate all it's arguments.
Examples of non-strict expression in most programming languages include `if(e)`, `true || f(x)`, `false && f(x)` and so on.

###=> syntax
The `a: => A` syntax will delay the evaluation of `a`.

**example 1:** 
Notice the `=> A` syntax means the function `onTrue` is not evaluated before being called. 
In this example `onFalse` is never evaluated when `if2` is invoked with a `cond=true` argument.  

```scala
def if2[A](cond: Boolean, onTrue: => A, onFalse: => A): A =
    if (cond) onTrue else onFalse
```

**example 2:**
non-strict implementation of `exists`. The function will only 
evaluate until it finds a true value or the list of traversed.

```scala
def exists(p: A => Boolean): Boolean = this match {
    case Cons(h, t) => p(h()) || t().exists(p)
    case _ => false
}
```

###Lazy keyword
Problem: a: => A a will be evaluated every time the argument is used in a function depending on a. This can be expensive if the function is.

Solution: 
```
lazy val y = if(2a < 22, f(x), g(x))
```

The value `y` will be memorized/cached first time it is evaluated.

###Streams
Streams are like Lists but unlike lists they are "lazy".  
An implementation of the traits and constructors could be:

```
sealed trait Stream[+A]{
    ...
}
case object Empty extend Stream[Nothing]
case class Cons[+A](h: () => A, t: () => Stream[A]) extend Stream[A] 
```

An example function could be `headOption`. Notice `h()` is evaluating h to get the value.
```
def loadOption[A] = this match {
    case Empty => None
    case Cons(h,t) => Some(h())
}
```

To enable lazy loading for streams we'll create a lazy load constructor.
```
object Stream {
    def cons[A](h1: => A, t1: => Stream[A]): Stream[A]{
        lazy val head = h1
        lazy val tail = h1
        Cons(() => head, () => tail)
    }
    ...
}
```

###Infinite stream
Example using the cons function from the Streams example:
```
val ones: Stream[Int] = cons(1, ones)
```

Can be used to handle big data. the head is the size of the memory and when done handling that data the next iteration can be done.

______

####Keywords
- Strict function
- Non-strict function
- `lazy` keyword
- `Stream` object
- Explicitly forced vs. by name parameter (? functions)
- `apply(...)` method
- Smart constructor (f.ex. `Stream` object)
- Infinite streams.
- Corecursion (alt. guarded recursion)
- `unfold` function
- Liskov's substitution principle states that you should only weaken the parameter of strengthen the result.

###Hints
Implement 
- drop 
- take 
- toList