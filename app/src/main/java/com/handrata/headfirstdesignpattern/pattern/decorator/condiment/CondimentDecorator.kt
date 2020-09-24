package com.handrata.headfirstdesignpattern.pattern.decorator.condiment

import com.handrata.headfirstdesignpattern.pattern.decorator.beverage.Beverage

interface CondimentDecorator: Beverage {
    val beverage: Beverage
}