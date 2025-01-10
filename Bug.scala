```scala
class MyClass(val x: Int) {
  def this() = this(0) 
}

val myInstance = new MyClass()
println(myInstance.x) //Prints 0

class MyOtherClass(val x: Int = 0) {
  
}

val myOtherInstance = new MyOtherClass()
println(myOtherInstance.x) //Prints 0
```