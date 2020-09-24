package com.handrata.headfirstdesignpattern.pattern.decorator.beverage

import com.handrata.headfirstdesignpattern.pattern.decorator.beverage.Beverage

class DarkRoast :
    Beverage {
    override fun cost(): Double  = 0.99

    override fun description(): String = "Dark Roast"
}