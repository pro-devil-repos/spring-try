package pro.devil.demo

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component

@Component
class CricketCoach : ICoach {

    @Autowired
    lateinit var fortuneService: IFortuneService

    override fun getDailyWorkout() = "Play some cricket! With your Team"

    override fun getDailyFortune(): String {
        if (this::fortuneService.isInitialized) {
            return fortuneService.getFortune()
        }

        return "No fortune"
    }
}