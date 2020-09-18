package pro.devil.demo.jdbc

import java.sql.DriverManager

fun main() {
    val connectionString = "jdbc:postgresql://localhost:5432/student-tracker"
    val user = "db_user"
    val password = "db_pass"

    try {
        println("Connecting to the DataBase")
        val myConn = DriverManager.getConnection(connectionString, user, password)
        println("Successful connection!")
    } catch (ex: Exception) {
        ex.printStackTrace()
    }
}