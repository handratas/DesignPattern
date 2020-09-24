package com.handrata.headfirstdesignpattern.pattern.strategy.quack

class Quack: QuackBehavior {
    override fun quack() {
        println("Quack!")
    }
}