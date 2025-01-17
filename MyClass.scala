```scala
class MyClass[T](val value: T) {
  def this() = this(null.asInstanceOf[T]) // Using null.asInstanceOf[T]
}
```