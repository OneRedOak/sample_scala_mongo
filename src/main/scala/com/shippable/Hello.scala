package com.shippable

class HelloWorld {
   def main(args: Array[String]) {
      println("Hello, world!")
      println(square(10))
      println(multiple(5,4))
   }
   def square(x:Int): Int= {
	x*x
   }
   def multiple(x:Int,y:Int): Int= {
	x*y
   }
}
