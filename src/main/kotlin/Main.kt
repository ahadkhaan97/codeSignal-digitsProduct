fun main() {
    print(solution(33))
}

fun solution(product: Int): Int {
    if (product == 0)
        return 10
    if (product == 1)
        return 1

    var digit = ""
    var tempDigit = product
    while (tempDigit > 1) {
        var wasDivided = false
        for (i in 9 downTo 2) {
            if (tempDigit % i == 0) {
                digit += i
                tempDigit /= i
                wasDivided = true
                break
            }
        }
        if (!wasDivided)
            return -1
    }
    return digit.reversed().toInt()
}
