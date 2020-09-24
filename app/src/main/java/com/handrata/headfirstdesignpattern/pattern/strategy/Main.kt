package com.handrata.headfirstdesignpattern.pattern.strategy

import com.handrata.headfirstdesignpattern.pattern.strategy.fly.FlyRocketPowered

fun main() {
    val duck = DecoyDuck()
    duck.performFly()
    duck.performQuack()

    duck.flyingBehavior = FlyRocketPowered() // now we can change behavior at run time
    duck.performFly()
}