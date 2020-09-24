package com.handrata.headfirstdesignpattern.pattern.decorator.condiment

import com.handrata.headfirstdesignpattern.pattern.decorator.beverage.Beverage

class SteamedMilk(
    override val beverage: Beverage
) : CondimentDecorator {
    override fun cost(): Double = 0.10 + beverage.cost()

    override fun description(): String {
        return beverage.description() + ", Steamed Milk"
    }
}