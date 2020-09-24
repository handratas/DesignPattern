package com.handrata.headfirstdesignpattern.pattern.decorator.condiment

import com.handrata.headfirstdesignpattern.pattern.decorator.beverage.Beverage

class Mocha(
    override val beverage: Beverage
) : CondimentDecorator {

    override fun cost(): Double = 0.2 + beverage.cost()

    override fun description(): String {
        return beverage.description() + ", Mocha"
    }
}