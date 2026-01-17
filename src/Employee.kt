class Employee (
    private val fullName: String,
    private val position: String,
    private val salary: Int,
    private val yearsOfExperience: Int
) {
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
}