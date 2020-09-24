package com.handrata.headfirstdesignpattern.pattern.decorator.beverage

import com.handrata.headfirstdesignpattern.pattern.decorator.beverage.Beverage

class HouseBlend :
    Beverage {
    override fun cost(): Double = 0.89

    override fun description(): String = "House Blend Coffee"
}