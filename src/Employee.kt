class Employee (
    private val fullName: String,
    private val position: String,
    private val salary: Int,
    private val yearsOfExperience: Int,
    private var currentTask: Task? = null
) : ReportGenerator {
    val Ename: String
        get() = fullName
    val Eposition: String
        get() = position
    var Esalary: Int = salary
        set(value) {
            if (value < 0) {
                println("Зарплата не может быть отрицательной!")
            } else {
                field = value
            }
        }
    var Eexprience: Int = yearsOfExperience
        set(value) {
            if (value > 50){
                println("Макс опыт 50 лет!")
            } else {
                field = value
            }
        }

    override fun generateReport(): String {
        return "ФИО: $Ename | Должность: $Eposition | Зарплата: $Esalary | Лет опыта: $Eexprience"
    }

    fun assignTask(newTask: Task) {
        if (currentTask != null && currentTask!!.isCompleted == false) {
            println("Сотрудник уже занят задачей: ${currentTask!!.title}")
        } else {
            currentTask = newTask
            println("Задача переназначена")
        }
    }
}