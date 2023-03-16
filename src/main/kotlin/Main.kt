fun main(){
number()
  var adding=  names(arrayOf("belyse","keke","nyampundu"))
    println(adding)


    drinking(5)
    drinking(14)
    drinking(54)

    alphabet()
}
//Create a function that prints out all the odd numbers between 1 and 100 (2pts)
fun number(){
 var numbers = 1..100
     for (i in numbers){
    if (i%2 >0)
        println(i)
  }
}
//Create a function that takes in an array of names and returns the number of
//names longer than 5 characters (2pts)
fun names(num:Array<String>): Int{
    var sum=0
    for (items in num){
        if (items.length >5) {
            sum++
        }
    }
    return sum
}
//You are creating a robot to serve drinks at a party. The robot is required to
//serve a glass of milk for guests under the age of 6. For guests under the age of
//15 but over the age of 6, the robot serves a bottle of fanta orange. Everybody
//else gets a bottle of coca cola. Create a function that will make these
//decisions, printing out the name of the drink each person gets according to
//their age. (2pts)
//milk0..6,fanta 7..15,coca
fun drinking(drink: Int) {
   when (drink){
       in 0..6 -> println("a glass of milk")
       in 7..15 ->println("fanta orange")
       else ->println("coca cola")
   }
}
//Write a function that prints each number from 1 to 100 on a new line. For each
//multiple of 3, print "Fizz" instead of the number. For each multiple of 5, print
//"Buzz" instead of the number. For numbers which are multiples of both 3 and
//5, print "FizzBuzz" instead of the number. (4pts)

fun alphabet() {
    var words = 1..100
    for (x in words) {
       if (x % 3 == 0 && x%5==0) {
         println("FizzBuzz")
    }else if (x % 3 == 0) {
           println("Fizz")
        } else if (x % 5 ==0) {
           println("Buzz")
       } else {
          println(x)
       }
   }


}