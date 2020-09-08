package pro.devil.demo

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component

@Component
class TrackCoach : ICoach {

    private val fortuneService: IFortuneService

    @Autowired
    constructor(fortuneService: IFortuneService) {
        this.fortuneService = fortuneService
    }


    override fun getDailyWorkout() = "Пробеги много много километров"

    override fun getDailyFortune() = fortuneService.getFortune() ?: "No fortune"
}