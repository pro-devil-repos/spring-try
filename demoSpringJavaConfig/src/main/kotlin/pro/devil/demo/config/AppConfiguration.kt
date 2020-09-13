package pro.devil.demo.config

import org.springframework.context.annotation.ComponentScan
import org.springframework.context.annotation.Configuration
import org.springframework.context.annotation.PropertySource

@Configuration
@ComponentScan("pro.devil.demo")
@PropertySource("classpath:sport.properties")
open class AppConfiguration {

}