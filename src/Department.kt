abstract class Department {
    abstract val departmentName: String
    abstract fun printDepartmentGoal()
}

class DevelopmentDepartment(override val departmentName: String = "Разработка") : Department(), ReportGenerator {
    override fun printDepartmentGoal() {
        println("Цель: Писать чистый код")
    }

    override fun generateReport(): String {
        return "Название: $departmentName | Цель: Писать чистый код"
    }
}

class TestingDepartment(override val departmentName: String = "Тестирование") : Department() , ReportGenerator{
    override fun printDepartmentGoal() {
        println("Цель: Находить все баги")
    }
    override fun generateReport(): String {
        return "Название: $departmentName | Цель: Находить все баги}"
    }
}