package com.handrata.headfirstdesignpattern.pattern.strategy

import com.handrata.headfirstdesignpattern.pattern.strategy.fly.FlyingBehavior
import com.handrata.headfirstdesignpattern.pattern.strategy.quack.QuackBehavior

abstract class Duck(
    var flyingBehavior: FlyingBehavior,
    var quackBehavior: QuackBehavior
) {
    open fun swim() {
        print("swimming away")
    }
    open fun display() {
        print("looks like a " + this.javaClass.simpleName)
    }

    fun performFly() {
        flyingBehavior.fly() // delegate to the behavior class
    }

    fun performQuack() {
        quackBehavior.quack() // delegate to the behavior class
    }
}