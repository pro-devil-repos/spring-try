package pro.devil.demo

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.beans.factory.annotation.Qualifier
import org.springframework.beans.factory.annotation.Value
import org.springframework.stereotype.Component

@Component
class CricketCoach : ICoach {

    @Value("\${foo.email}")
    private lateinit var email: String

    @Value("\${foo.team}")
    private lateinit var team: String

    @Autowired
    @Qualifier("sadFortuneService")
    lateinit var fortuneService: IFortuneService

    override fun getDailyWorkout() = "Play some cricket! With your Team - $team ($email)"

    override fun getDailyFortune(): String {
        if (this::fortuneService.isInitialized) {
            return fortuneService.getFortune()
        }

        return "No fortune"
    }
}