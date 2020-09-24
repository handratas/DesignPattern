package com.handrata.headfirstdesignpattern.pattern.strategy.badcode

abstract class Duck {
    open fun quack() {
        print("Quack")
    }
    open fun swim() {
        print("swimming away")
    }
    open fun display() {
        print("looks like a " + this.javaClass.simpleName)
    }
    open fun fly() {
        print("flying away")
    }
}