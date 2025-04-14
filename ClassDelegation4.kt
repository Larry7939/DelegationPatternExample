
interface Worker {
    fun work()
    fun takeVacation()
}

class JavaProgrammer(): Worker {
    override fun work() { println("code with Java") }
    override fun takeVacation() { println("code at the beach") }
}

class PythonProgrammer(): Worker {
    override fun work() { println("code with Python") }
    override fun takeVacation() { println("code at the home") }
}

class Manager(private val staff: Worker): Worker by staff {
    fun meeting() = println("organizing meeting with ${staff.javaClass.simpleName}")
    override fun takeVacation() {println("manager vacation")}
}

fun main() {
    val manager = Manager(JavaProgrammer())
    manager.work() //
    manager.takeVacation() // manager vacation
    manager.meeting() // organizing meeting with JavaProgrammer
}

/**
 * Manager가 특정 Worker 인터페이스 구현체에 묶이지 않아, 유연하게 사용할 수 있다.
 * 클래스 내부에서 델리게이션에 접근할 수 있다.
 * 델리게이션 클래스와 동일한 이름의 함수가 있는 경우,(takeVacation) override를 사용하면 Manager가 우선권을 갖는다.
 * val를 var로 변경하면 안되는 이유, 위임 받는 대상은 프로퍼티가 아닌 파라미터이기 때문에, 외부에서 staff를 변경하더라도 파라미터는 기존 그대로이다.
 * 또한, 프로퍼티 staff만 바꾸면 이전 위임 상태가 그대로 유지되어 메모리 릭이 발생할 수 있다.
 * */