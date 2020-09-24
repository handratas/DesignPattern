package com.handrata.headfirstdesignpattern.pattern.decorator

import com.handrata.headfirstdesignpattern.pattern.decorator.beverage.Beverage
import com.handrata.headfirstdesignpattern.pattern.decorator.beverage.DarkRoast
import com.handrata.headfirstdesignpattern.pattern.decorator.beverage.Espresso
import com.handrata.headfirstdesignpattern.pattern.decorator.beverage.HouseBlend
import com.handrata.headfirstdesignpattern.pattern.decorator.condiment.Mocha
import com.handrata.headfirstdesignpattern.pattern.decorator.condiment.Soy
import com.handrata.headfirstdesignpattern.pattern.decorator.condiment.SteamedMilk
import com.handrata.headfirstdesignpattern.pattern.decorator.condiment.Whip
import com.handrata.headfirstdesignpattern.pattern.strategy.DecoyDuck
import com.handrata.headfirstdesignpattern.pattern.strategy.fly.FlyRocketPowered

class CoffeeMaker {
    val beverage = Espresso()
}

fun main() {
    val beverage = Espresso()
    println(beverage.description() + " $" + beverage.cost())

    var beverage2: Beverage = DarkRoast()
    beverage2 = Mocha(beverage2)
    beverage2 = Mocha(beverage2)
    beverage2 = Whip(beverage2)
    println(beverage2.description() + " $" + beverage2.cost())

    val beverage3: Beverage = Soy(SteamedMilk(Whip(HouseBlend())))
    println(beverage3.description() + " $" + beverage3.cost())
}