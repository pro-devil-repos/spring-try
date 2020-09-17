package pro.devil.demo

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class DemoHibernateApplication

fun main(args: Array<String>) {
    runApplication<DemoHibernateApplication>(*args)
}
