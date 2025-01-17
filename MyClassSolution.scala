```scala
class MyClass[T](val value: T) {
  def this() = this(implicitly[NullValue[T]].nullValue) // Using NullValue typeclass
}

trait NullValue[T] {
  def nullValue: T
}

object NullValueInstances {
  implicit val nullValueString: NullValue[String] = new NullValue[String] { override def nullValue: String = null }
  implicit val nullValueInt: NullValue[Int] = new NullValue[Int] { override def nullValue: Int = 0 }
  // Add more instances as needed
}
```