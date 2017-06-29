object Main {
  def main(args: Array[String]): Unit = println("hello world")
/*
  //language fundamentals
  var x = 10
  println(x)
  x = 11
  println(x)
  x += 1
  println(x)
  x -= 1
  println(x)

  val y = 10
  //y=11

  val z: Double = 10
  println(z)
  val greeting: String = null
  val greeting1: Any = "hello"
  println(greeting)
  println(greeting1)

  val xmax, ymax = 100
  val a0 = 1
  var b0 = 3
  val c0 = 2.4
  println(xmax, ymax)
  println(a0, b0, c0)

  val (a, b, c) = (5, "Hello", 3.14)
  println(a) //  println(a, b, c)


  //String declarations
  val s1 = "String"
  println(s1)
  val s2 = "My " + s1
  println(s2)
  val s3 = s1 + " " + 100
  println(s3)
  val s4 = 100.toString
  println(s4)
  val s5 =
    """first line
      second line"""
  println(s5)

  //Strings are java.lang.string
  println("".isEmpty())
  println("abc".getBytes)
  println("abc".charAt(2)) // zero index based
  println("abc".length()) // the number of elements

  //Strings are Sea (scala list abstraction)
  println("Hello".intersect("world"))
  println("Hello" intersect "world") //takes common letter, in this case "lo"
  println("aabbbccc".distinct) //doesn't print repeated chars so this gives "abc"
  println("abcde".head) //takes first element
  println("abcde".size) // the number of elements
  println("abcde".reverse) //reverses elements
  println("aBcDe".filter(x => x.isUpper)) //prints upper case
  println("aBcDe".filter(x => x.isLower)) // prints lower case


  //Variable length arrays
  import scala.collection.mutable.ArrayBuffer

  val b2 = ArrayBuffer[Int]()
  b2 += 1
  println(b2)
  b2 += (1, 2, 3, 5) // adding to array buffer
  println(b2)
  b2 ++= Array(8, 13, 21) // ++= adds onto b2 further
  println(b2)
  b2.trimEnd(5) //trims off last 5 elements
  println(b2)
  b2.insert(1, 6) // inserts int at elements outlined in first number. In this case 6 is implemented into position 1
  println(b2)
  b2.insert(2, 7, 8, 9) // puts 7, 8, 9 in array starting at element 2
  println(b2)
  b2.remove(2) //removes element 2
  println(b2)
  b2.remove(2, 3) //removes 3 elements starting from position 2
  println(b2)
  val c2 = b2.toArray
  println("c2=", c2.toBuffer)

  //multi-dimensional arrays
  val matrix = Array.ofDim[Double](3, 4) //3 rows and 4 columns
  println(matrix(2)(3))
  matrix(2)(3) = 42
  println(matrix(2)(3))

  /*Jave to Scal collection conversions
  val list = new ArrayBuffer[String]()
  list.add("abc")
  println(list)
  println(list.)
  list.toBuffer*/

  val map = Map(a -> 10)
  println(map)


  //collections
  val l1 = List(1, 2, 3)
  println(l1)
  val l2 = List()
  println(l1.isEmpty) //false
  println(l2.isEmpty) //true
  val l3 = List(2, "a")
  println(l3)
  println(l3(1)) //prints element 1 which is A
  val l4 = List(1, -2, 3, 2, -1, 0, 3)
  println(l4.sorted) //sorts the list
  println(l4.sorted.reverse) //prints sort in reverse
  println(List("b", "a").sorted) //sorts chars
  //println(List(1,"a").sorted) //cant do different data types
  //println(l4.sortwith((x,y) => x+"" < y+"")) compares 2 elements and sees if left is smaller that right

  //mutable list
  import scala.collection.mutable.ListBuffer

  val lb = ListBuffer.empty[String]
  lb += "a"
  println(lb)
  lb += ("c", "d", "e")
  println(lb)
  lb -= "d"
  println(lb)
  lb ++= List("f", "g")
  println(lb)

  println(List(1, 1, 2, 2)) // prints 1,1,2,2
  println(Set(1, 1, 2, 2)) // does not print repeated elements
  println(List(1, 2, 3, 4) ++ List(3, 4, 5, 6)) //concat adds into the same list
  println(Set(1, 2, 3, 4) ++ Set(3, 4, 5, 6)) //doesnt allow for duplicates
  println(Set(1, 2, 3) == Set(3, 1, 2)) // disregards order
  println(List(1, 2, 3) == List(3, 1, 2)) //returns false
  println(Set(1, 2, 3) + 2) //disregards +2 as the set has a 2
  println(Set(1, 2, 3, 4, 5).toList)
  println(Set(5, 4, 3, 2, 1).toList)

  //immutable Map
  val scores0 = Map("John" -> 75, "Julia" -> 60, "Kevin" -> 26) //Map[String.Int] Int is they key
  println(scores0)
  val scores1 = Map(("John", 60), ("Julia", 60), ("Kevin", 26))
  println(scores1)
  println(scores0("Julia")) //matches key
  println(if (scores0.contains("Julia")) scores0("Julia") else 0) //prints 60
  println(scores0.getOrElse("Julia", 0)) //if julia key is not present prints 0
  //best syntax above
  println(scores0.get("Julia")) //gets corresponding int
  println(scores0.get("Jacob"))
  println(scores0.get("Julia").getOrElse(0))
  println(scores0.get("Jacob").getOrElse(0))
*/
  //mutable maps
  import scala.collection.mutable.{Map => MMap}

  val scores = MMap("John" -> 75, "Julia" -> 60, "Kevin" -> 26)
  println(scores("Julia"))
  //println(scores("Jacob")) //no key, error thrown
  scores += ("Julia" -> 65, "Jacob" -> 78) //changes Juli to 65 and adds jacob
  println(scores)
  scores -= "Jacob" //Jacob is removed
  println(scores)
  val scores3 = scores + ("Julia" -> 55, "Jacob" -> 77) //takes other map and add jacob and julie keys
  println(scores3)
  val scores4 = scores - "Jacob" //takes scores and removes Jacob
  println(scores4)

  //element traversing
  for((k,v) <- scores) println((k,v)) //tuple that prints keys and values
  for((k,v) <- scores) println(k+" -> "+v)
  println(scores.keySet) //shows keys (kevin, julia, john)
  for(v <- scores.values) println(v) // shows values (26, 65, 75)
  for((k,v) <- scores) yield println((v,k)) //reversing order

  //streams are lists with lazy access to elements
  val st = (1 to 100).toStream
  println(st)
  println(st.filter(_%10==0))
  println(st.filter(_%10==0).toList)

  //tuples
  val t = (1,3.14,"John") //created a tuple
  println(t) //shows data types
  println(t._1) //prints element in tuple
  println(t._2)
  println(t._3)
  println("t._3: ", t._3)
  val (first, second, third) = t //labels the tuple
  println("first: ", first, "second: ", second)
  val (first1, second1, _) =t //disregards 3rd elements

  //zipping
  val symbols = Array("<", "-", ">")
  val counts = Array(2, 10, 2)
  var pairs = symbols zip counts //zips arrays together (<,2)...
  for ((s,n) <- pairs) print(s*n) //times the together so <*2....

  //two Lists to Map tansformation
  val keys = List(1, 2, 3)
  val values = List("a", "b", "c")
  val newMap = (keys zip values).toMap
  println(newMap)
  println(newMap(1))
}

  //Lists
  //From abstraction collections to lists
  val t2 = Traversable(1,2,3)
  println(t2)
  val i = Iterable(1,2,3)
  println(i)
  val sq = Seq(1,2,3)
  println(sq)

  //operations with list
  val odd = List(1,3,5,7,9)
  val evens = List(2,4,6,8)
  val nums = odd ++ evens //concats lists with odds following evens
  println(nums)
  val digs = 0 :: nums //put 0 at start of list
  println(digs)
  val lstr = "a" :: "b" :: "c" :: Nil //another way to create a list of a,b,c
  println(lstr)

  //other useful examples
  val list1 = List(1,-2,3,2,-1,0,-3)
  println(list1.head) //prints 1 as 0th element or head
  println(list1.tail) //prints rest of the list as the tail
  println(list1.last) //prints lastt element
  println(list1.take(4)) //first four
  println(list1.takeRight(4)) //last 4
  println(list1.slice(3,6)) //position 3 to 6
  println(list1.sum) // adds all elements to give 0
  println(list1.min) // smallet int -3
  println(list1.max) // biggest int 3
  println(list1.contains(7)) //checks if it contains 7 false
  println(list1.indexOf(3)) //gets 3rd element which is 2
  println(list1.mkString) //convert to string
  println(list1.mkString(","))
  println(list1.count(x => x*x>1)) //multiplying each pair of numbers and checking if greater then 1, if it does then it counts

  println(List(1,2,3) intersect List(2,3,4)) //takes common elements into new list (2,3)
  println(List(1,2,3) diff List(2,3,4)) //1 is in list 1 but not in list 2
  println(List(1,2,3).permutations.toList) //all diff permutations
  println(List(1,2,3).combinations(2).toList) //all combinations using 2 elements
  println(List(List(1,2), List(3,4)).flatten) //concats into 1 list

  //Conditionals
  val x3 = 0
  val y2 = if (x3 > 0) 1 else -1 //prints -1
  println(y2)
println(if (x3 > 0) "plus" else -1) //pritns -1
println(if (x3 > 0) 1 else ()) //prints ()
println(if (x3 > 0) 1) //still prints ()

 //loops
var sum = 0
while (sum <10) sum += 1 //Counts up to 10
println(sum)
  sum = 0
  var k = 0
  while (k < 10){ //cycles through until k = 10
    sum += k*k // sum = 1 then k=2, 2*2=4, 1+4=5 etc.
    k += 1 // adds 1 to k each time
  }
println(sum,k)







