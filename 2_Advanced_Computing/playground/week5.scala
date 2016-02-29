def rollDie: Int = {
    val rng = new scala.util.Random
    rng.nextInt(6)
}

trait RNG {
    def nextInt: (Int, RNG)
} 


case class SimpleRNG(seed: Long) extends RNG{
    def nextInt: (Int, RNG) = {     // Tuple invoked like:  val (v1, rng1) = ...
        val newSeed = (seed * 0x5DEECE66DL + 0xBL) & 0xFFFFFFFFFFFFL
        val nextRNG = SimpleRNG(newSeed)
        val n = (newSeed >>> 16).toInt
        (n, nextRNG)
    }
    
    def unit[A](a: A): Rand[A] = rng => (a, rng)
    
    def map[A,B](s: Rand[A])(f: A => B): Rand[B] = 
        rng => {
            val (a, rng2) = s(rng)
            (f(a), rng2)
        }
        
    def nonNegativeEven: Rand[Int] = map(nonNegativeEven) (i => i - i % 2)
}

type Rand[+A] = RNG => (A, RNG)