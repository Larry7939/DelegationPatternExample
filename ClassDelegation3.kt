//
//interface Worker {
//    fun work()
//    fun takeVacation()
//}
//
//class JavaProgrammer(): Worker {
//    override fun work() { println("code with Java") }
//    override fun takeVacation() { println("code at the beach") }
//}
//
//class PythonProgrammer(): Worker {
//    override fun work() { println("code with Python") }
//    override fun takeVacation() { println("code at the home") }
//}
//
//class Manager: Worker by JavaProgrammer() {
//    fun a() {
//
//    }
//}
//
//fun main() {
//    val manager = Manager()
//    manager.work()
//    manager.takeVacation()
//}
//
///**
// * 문제점 4: Manager 클래스 인스턴스는 오직 JavaProgrammer의 인스턴스에게만 요청할 수 있고, 다른 종류의 Worker인터페이스를 구현한 클래스(PythonProgrammer)에게 요청이 불가능하다.
// * 문제점 5: Manager의 인스턴스는 델리게이션에 접근할 수 없다. 즉, Manager 내부 메소드에서 델리게이션에 접근할 수 없다.
// * */