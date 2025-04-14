//
//interface Worker {
//    fun work()
//    fun takeVacation()
//}
//
//open class JavaProgrammer(): Worker {
//    override fun work() { println("code with Java") }
//    override fun takeVacation() { println("code at the beach") }
//}
//
//class PythonProgrammer(): Worker {
//    override fun work() { println("code with Python") }
//    override fun takeVacation() { println("code at the home") }
//}
//
//class Manager(): JavaProgrammer() {
//
//}
//
//fun main() {
//    val manager:JavaProgrammer = Manager()
//    val coder :JavaProgrammer = JavaProgrammer()
//    manager.work()
//    manager.takeVacation()
//}
/**
 * 문제점1: Manager 클래스가 JavaProgrammer에 같혀버려서 PythonProgrammer의 구현을 사용할 수 없다.
 * 문제점2: Manager 클래스로 JavaProgrammer 타입의 변수를 초기화할 수 있는 설계 오류 발생(리스코프 치환 원칙 위반)
 * */