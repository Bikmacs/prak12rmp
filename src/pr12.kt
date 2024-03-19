import kotlinx.coroutines.*

suspend fun main(): Unit = coroutineScope {
    val repositories = mutableListOf<Repository>() // Создание пустого списка репозиториев
    repeat(3) { // Повторяем 2 раза
        val repository = Repository.input() // Вводим данные для создания репозитория
        repositories.add(repository) // Добавляем репозиторий в список
    }
    repositories.sortByDescending { it.count } // Сортировка списка по убыванию количества репозиториев
    println("Список репозиториев:")
    repositories.forEach {
        println("Название: ${it.name}, Количество репозиториев: ${it.count}, Пароль: ${it.password}")
    }
}
