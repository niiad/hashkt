package base

/**
 * calculates the area of a circle given its radius
 *
 * @param radius the radius of the circle
 * @return the area of the circle
 *
 * */
fun areaOfCircle(radius: Double): Double = 3.14159 * radius * radius

/**
 * converts a temperature from celsius to fahrenheit
 *
 * @param celsius the temperature in Celsius
 * @return the temperature in Fahrenheit
 * */
fun celsiusToFahrenheit(celsius: Double): Double = celsius * (9 / 5) + 32

/**
 * calculates the factorial of a non-negative integer using iteration
 *
 * @param number the number for which to find the factorial
 * @return the factorial of the number
 * @throws IllegalArgumentException if the input number is negative
 * */
fun iterationFactorial(number: Int): Long {
    require(number >= 0) {
        "Only works for non-negative numbers"
    }

    var result: Long = 1

    for (i in 2..number) {
        result *= i
    }

    return result
}

/**
 * calculates the factorial of a non-negative integer using recursion
 *
 * @param number the number for which to find the factorial
 * @return the factorial of the number
 * @throws IllegalArgumentException if the input number is negative
 * */
fun recursiveFactorial(number: Int): Long {
    require(number >= 0) {
        "Only works for non-negative numbers"
    }

    return if (number == 0 || number == 1) {
        1
    } else {
        number.toLong() * recursiveFactorial(number = number - 1)
    }
}

/**
 * calculates the factorial of non-negative integer using tail recursion
 *
 * @param number the number for which to find the factorial
 * @param accumulator the accumulator used in the tail recursion, initially set to 1
 * @return the factorial of the number
 * @throws IllegalArgumentException if the input number is negative
 * */
tailrec fun tailRecursiveFactorial(number: Int, accumulator: Long = 1): Long {
    require(number >= 0) {
        "Only works for non-negative numbers"
    }

    return if (number == 0) {
        accumulator
    } else {
        tailRecursiveFactorial(number = number - 1, accumulator = number.toLong() * accumulator)
    }
}

/**
 * checks if a given string is a valid url
 *
 * @param url the given string
 * @return 'true' if the given string is a valid url, 'false' otherwise
 * */
fun isValidURL(url: String) : Boolean {
    if (url.isEmpty()) {
        return false
    }

    if (!url.contains("://")) {
        return false
    }

    val schemes = listOf("http://", "https://", "ftp://")

    val isFound = schemes.any { scheme ->
        url.startsWith(scheme)
    }

    return isFound
}

