package com.handrata.headfirstdesignpattern.pattern.strategy

import com.handrata.headfirstdesignpattern.pattern.strategy.fly.FlyNoWay
import com.handrata.headfirstdesignpattern.pattern.strategy.quack.MuteQuack

class DecoyDuck: Duck(
    flyingBehavior = FlyNoWay(),
    quackBehavior = MuteQuack()
)