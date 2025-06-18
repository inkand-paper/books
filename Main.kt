import java.util.*
fun main(){
    showWelcomeMessage()
}
fun showWelcomeMessage(){
    val scanner = Scanner(System.`in`)
    println("║          📚 Welcome to Abir's Book Hub!        ║")
    println("║   Explore a world of books in 3 unique forms:  ║")
    println("║     📘 Ebooks  🔊 Audiobooks  📗 Hard copy     ║")
    println("║     1. View Available Books                    ║")
    println("║     2. Buy a Book                              ║")
    println("║     3. Exit                                    ║")
    print("      Type a number to begin: ")
    val input = scanner.next()
    when(input){
        "1" -> {
            println("Available Book Types: ")
            val bookType =BookType(
                ebook = Ebook(),
                audioBook = AudioBook(),
                hardCopyBook = HardCopyBook()
            )
            println("\u001B[33mEbooks: ")
            printBooks(bookType.ebook.books)
            println("Audio Books: ")
            printBooks(bookType.audioBook.books)
            println("Hard Copy Books: ")
            printBooks(bookType.hardCopyBook.books)
        }
        "2" -> {}
        "3" -> {}
    }
}
fun printBooks(books: List<Book>){
    var number = 1
    for (book in books){
        println("Book: $number")
        println("Name: ${book.name}")
        println("Author: ${book.author}")
        println("Price: $${book.price}")
        println("-----------------------")
        number ++
    }
}
