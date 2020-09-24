package com.handrata.headfirstdesignpattern.pattern.strategy.quack

class MuteQuack: QuackBehavior {
    override fun quack() {
        println("I can't quack")
    }
}