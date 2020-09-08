package pro.devil.demo

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component

@Component
class BaseballCoach @Autowired constructor(private var fortuneService: IFortuneService) : ICoach {

    override fun getDailyWorkout() = "Потрать 30 минут на тренировку отбивания мяча"

    override fun getDailyFortune() = fortuneService.getFortune() ?: "No fortune"
}