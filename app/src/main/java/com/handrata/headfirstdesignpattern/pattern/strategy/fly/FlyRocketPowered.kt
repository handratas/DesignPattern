package com.handrata.headfirstdesignpattern.pattern.strategy.fly

class FlyRocketPowered: FlyingBehavior {
    override fun fly() {
        println("I'm flying with a rocket!!")
    }
}