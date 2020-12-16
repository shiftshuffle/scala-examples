object MapExample extends App{
  val example = Map("a" -> 1, "b" -> 2, "c" -> 3)
  println(example("a"))

  val ratings = Map("Lady in the Water"-> 3.0,
    "Snakes on a Plane"-> 4.0,
    "You, Me and Dupree"-> 3.5)

  for ((k,v) <- ratings) println(s"key: $k, value: $v")


}
