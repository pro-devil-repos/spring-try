package pro.devil.demo

import org.springframework.stereotype.Service

@Service
class SadFortuneService : IFortuneService {
    override fun getFortune() = "Неее, в этот раз тебе не повезло! Пока пока!"
}