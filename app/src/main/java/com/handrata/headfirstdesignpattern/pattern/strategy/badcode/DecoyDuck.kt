package com.handrata.headfirstdesignpattern.pattern.strategy.badcode

class DecoyDuck: Duck() {
    override fun quack() {
        // cannot quack
    }
    override fun fly() {
        // cannot flying
    }
}