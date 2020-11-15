/*
Android 101 - Kotlin Control Flow | Homework Assignment #4: Control Flow
FizzBuzz
 */
 */

for (number in 1..100) {
    // Testing if a number is prime:
    var isPrime = true
    if (number == 2) isPrime = true
    else if (number < 2) isPrime = false
    else {
        for (value in 2 until (Math.sqrt(number.toDouble()) + 1).toInt()) {
            if (number % value == 0) {
                isPrime = false
                break
            }
        }
    }
    if (isPrime) {
        println("Prime")
        continue
    }
    // FizzBuzz implementation:
    var string = String()
    if (number % 3 == 0) string += "Fizz"
    if (number % 5 == 0) string += "Buzz"
    println(if (string.isEmpty()) number else string)
}