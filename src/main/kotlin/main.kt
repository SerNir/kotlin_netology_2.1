fun main() {
    val commission = 0.75
    val minCommission = 3500
    val amount = 500000
    val result = amount / 100 * commission

    if (result <= minCommission) {
        println("Коммиссия составит ${minCommission / 100} рублей")
    } else {
        println("Коммиссия составит ${result / 100} рублей")
    }
}