import java.text.DecimalFormat

fun main() {

    val tax = .025
    val tip = .175
    var cost = 0.00
    do{
        print("What are the costs of all your items? Enter 0 when you're done. ")
        var newCost = readln().toDouble()
        cost += newCost
    } while((newCost.toInt()) != 0)

    var costWithTax = cost + tax * cost
    var costWithTip = costWithTax + tip * costWithTax

    val twoDigits = DecimalFormat("$#,###.00")
    var totalCost = twoDigits.format(cost)
    var totalCostTaxes = twoDigits.format(costWithTax)
    var totalCostTip = twoDigits.format(costWithTip)

    val percent = DecimalFormat("##.##%")
    var taxPercent = percent.format(tax)
    var tipPercent = percent.format(tip)

    println("Your total cost is $totalCost. There is a $taxPercent tax. With taxes, your total cost is now $totalCostTaxes. Would you like to add a $tipPercent tip? Type yes or no.")
    val addTip = readln().lowercase()
    if(addTip == "yes")
        println("Your total cost is now $totalCostTip. Thank you for shopping with us!")
    else
        println("Got it. Your total cost is still $totalCostTaxes. Thank you for shopping with us!")
}