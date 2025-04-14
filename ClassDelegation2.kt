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
//class Manager(private val worker: Worker) {
//    fun work() {
//        worker.work()
//    }
//
//    fun takeVacation() {
//        worker.takeVacation()
//    }
//}
//
//fun main() {
//    val manager1:Manager = Manager(JavaProgrammer())
//    val manager2:Manager = Manager(PythonProgrammer())
//    manager1.work()
//    manager1.takeVacation()
//    manager2.work()
//    manager2.takeVacation()
//}
//
///**
// * 해결된 점: Manager의 생성자를 통해 Worker인터페이스를 구현하는 어떤 인스턴스라도 넘길 수 있게 되었다. -> 문제점 1 해결
// * 문제점 3: Worker의 기능이 확장될 수록 Manager 클래스에서 해당 메소드를 호출하기 위한 ㅁ소드를 추가해야하므로, 개방폐쇄원칙 위반
// * */