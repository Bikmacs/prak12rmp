import kotlinx.coroutines.*
import kotlin.coroutines.CoroutineContext

data class Repository(val name: String, val password: String, var count: Int) {
    companion object {
        suspend fun input(): Repository = withContext(Dispatchers.IO) {
            println("Введите свой Login:")
            val name = readlnOrNull() ?: ""
            println("Введите свой Password:")
            val password = readlnOrNull() ?: ""
            println("Сколько у вас открытых или закрытых репозиториев?")
            val count = readlnOrNull()?.toInt() ?: 0
            Repository(name, password, count)
        }
    }

}