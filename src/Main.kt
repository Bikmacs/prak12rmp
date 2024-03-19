import kotlinx.coroutines.runBlocking

fun main(){
    val escape = Class1()
    val count = escape.Input()
    runBlocking { escape.escape(count) }
}