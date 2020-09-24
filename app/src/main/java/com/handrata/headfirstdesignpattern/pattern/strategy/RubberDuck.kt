package com.handrata.headfirstdesignpattern.pattern.strategy

import com.handrata.headfirstdesignpattern.pattern.strategy.fly.FlyNoWay
import com.handrata.headfirstdesignpattern.pattern.strategy.quack.Squeak

class RubberDuck: Duck(
    flyingBehavior = FlyNoWay(),
    quackBehavior = Squeak()
)