package com.handrata.headfirstdesignpattern.pattern.strategy.fly

class FlyWithWings: FlyingBehavior {
    override fun fly() {
        println("Fly with wings!!")
    }
}