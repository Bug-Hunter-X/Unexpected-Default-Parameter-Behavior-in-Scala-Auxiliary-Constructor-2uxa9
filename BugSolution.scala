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

//The solution is to either provide default parameter value in primary constructor or handle the case carefully in auxiliary constructor.

class MyClassCorrected(val x: Int = 0) {
  // No need for an auxiliary constructor now.
}

val myCorrectedInstance = new MyClassCorrected()
println(myCorrectedInstance.x) // Prints 0

class MyOtherClassCorrected(val x:Int){
  def this() = this(0)
}
val myOtherCorrectedInstance = new MyOtherClassCorrected()
println(myOtherCorrectedInstance.x) //Prints 0
```