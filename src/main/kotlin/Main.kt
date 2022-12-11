import java.util.*

fun main(args: Array<String>) {

    val scan = Scanner(System.`in`)
    var hundredRubleDiscount = 100

    val peter: Customer = Customer("Пётр",2)
    val alexander: Customer = Customer("Александр",1)
    val andrey: Customer = Customer("Андрей",0)

    val customers = arrayOf(peter, alexander, andrey)

    while (true) {
        println("Введите имя покупателя (Пётр, Андрей, Александр) и сумму покупки через пробел")
        var (inputName: String, inputSum: String) = readLine()!!.split(' ')

        // проверю, соответствует ли введенное имя значению объекта в массиве
        val nameMatch = customers.any { it.equals(inputName) }


        if (!nameMatch) {
            d
    }

}