package com.handrata.headfirstdesignpattern.pattern.decorator.beverage

import com.handrata.headfirstdesignpattern.pattern.decorator.beverage.Beverage

class Espresso :
    Beverage {
    override fun cost(): Double = 1.99

    override fun description(): String = "Espresso"
}