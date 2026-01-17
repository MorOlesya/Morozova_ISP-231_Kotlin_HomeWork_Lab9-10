fun main() {
    //задание 2
    println("Задание 2")
    val employee = Employee("Kira", "Продавец", 1000, 1)
    employee.Esalary = -5
    println("Текущаяя зарплата ${employee.Esalary}")
    employee.Eexprience = 60

    //задание 3
    println()
    println("Задание 3")
    val tasl1 = Task("jump", "jump up", Priority.low, true)
    val tasl2 = Task("run", "run forward", Priority.medium, true)
    val tasl3 = Task("run", "run forward", Priority.medium, true)

    println("equals: ${tasl2 == tasl3}")
    println("equals: ${tasl1 == tasl3}")

    println("hashcode: ${tasl1.hashCode()}")
    println("hashcode: ${tasl2.hashCode()}")

    val task4 = tasl1.copy(priority = Priority.high)
    println(task4.toString())

    //Задание 4
    println()
    println("Задание 4")

    val d1 = DevelopmentDepartment()
    println("d1: ${d1.departmentName}")
    d1.printDepartmentGoal()

    val d2 = TestingDepartment()
    println("d2: ${d2.departmentName}")
    d2.printDepartmentGoal()

    //Задание 5
    println()
    println("Задание 5")
    val reports : List<ReportGenerator> = listOf(
        Employee("Hik","Worker",100,1),
        DevelopmentDepartment("Разработка мобильных игр"),
        TestingDepartment("Тестирование") )
    reports.forEach { part -> println(part.generateReport()) }

    //Задание 6
    println()
    println("Задание 6")
    val emp = Employee("Иванов Иван Иванович", "Стажёр", 100, 5)
    val d3 = DevelopmentDepartment()
    val d4 = TestingDepartment()
    val task1 = Task("Собрать цветы", "Найти поле цветов и собрать их", Priority.medium,false)
    val task2 = Task("Собрать травы", "Найти поле цветов и собрать лечебные травы", Priority.medium,false)
    emp.assignTask(task1)
    emp.assignTask(task2)

}