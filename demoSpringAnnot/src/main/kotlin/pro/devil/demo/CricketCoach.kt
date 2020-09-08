package pro.devil.demo

class CricketCoach : ICoach {

    var emailAddress: String = ""
    var team: String = ""

    lateinit var fortuneService: IFortuneService

    override fun getDailyWorkout() = "Play some cricket! With your Team - ${this.team} ($emailAddress)"

    override fun getDailyFortune(): String {
        if (this::fortuneService.isInitialized) {
            return fortuneService.getFortune()
        }

        return "No fortune"
    }
}