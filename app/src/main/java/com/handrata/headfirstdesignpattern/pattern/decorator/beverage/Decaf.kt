package com.handrata.headfirstdesignpattern.pattern.decorator.beverage

import com.handrata.headfirstdesignpattern.pattern.decorator.beverage.Beverage

class Decaf :
    Beverage {
    override fun cost(): Double = 1.05

    override fun description(): String = "Decaf"
}