package pro.devil.demo

import org.springframework.stereotype.Component

@Component("myCoach")
class BaseballCoach(private val fortuneService: IFortuneService? = null) : ICoach {
    override fun getDailyWorkout() = "Потрать 30 минут на тренировку отбивания мяча"

    override fun getDailyFortune() = fortuneService?.getFortune() ?: "No fortune"
}