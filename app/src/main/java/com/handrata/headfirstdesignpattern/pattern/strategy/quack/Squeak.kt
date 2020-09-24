package com.handrata.headfirstdesignpattern.pattern.strategy.quack

class Squeak: QuackBehavior {
    override fun quack() {
        println("Squeak!")
    }
}