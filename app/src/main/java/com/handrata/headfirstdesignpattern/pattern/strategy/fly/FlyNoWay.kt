package com.handrata.headfirstdesignpattern.pattern.strategy.fly

class FlyNoWay: FlyingBehavior {
    override fun fly() {
        println("I can't fly!!")
    }
}