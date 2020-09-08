package pro.devil.demo

import org.springframework.stereotype.Component

@Component
class TrackCoach(private val fortuneService: IFortuneService? = null) : ICoach {

    override fun getDailyWorkout() = "Пробеги много много километров"

    override fun getDailyFortune() = fortuneService?.getFortune() ?: "No fortune"
}