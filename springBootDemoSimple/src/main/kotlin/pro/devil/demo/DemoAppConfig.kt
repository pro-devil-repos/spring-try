package pro.devil.demo

import org.springframework.context.annotation.ComponentScan
import org.springframework.context.annotation.Configuration
import org.springframework.context.annotation.PropertySource

@Configuration
@ComponentScan("pro.devil.demo")
@PropertySource(value = ["classpath:student.properties"])
class DemoAppConfig {
}