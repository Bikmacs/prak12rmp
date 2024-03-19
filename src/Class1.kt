import kotlinx.coroutines.*
open class Class1 {
    fun Input(): Int {
        print("Введите, сколько хотите раз сбежать: ")
        var Save = readLine()!!.toInt()
        if (Save > 0)
            return Save
        else println("Число должно быть больше нуля! Автоматический установлено число 1")
        return 1
    }
    suspend fun escape(count: Int) {
        repeat(count) {
            println("Начинаем побег из Саратова!")
            val job = GlobalScope.launch {
                delay(1000)
                println("Пробегаем мимо Казанская площадь")
                delay(1500)
                println("Уже в Тамбовской области")
                delay(2000)
                println("Проезжаем Воронеж")
                delay(2500)
                println("И вот мы на свободе!")
                delay(2500)
                println("")
                println("")
            }
            job.join()
        }
    }
}