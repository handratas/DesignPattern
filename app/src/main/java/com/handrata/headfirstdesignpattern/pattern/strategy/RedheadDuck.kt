package com.handrata.headfirstdesignpattern.pattern.strategy

import com.handrata.headfirstdesignpattern.pattern.strategy.fly.FlyWithWings
import com.handrata.headfirstdesignpattern.pattern.strategy.quack.Quack

class RedheadDuck: Duck(
    flyingBehavior = FlyWithWings(),
    quackBehavior = Quack()
)