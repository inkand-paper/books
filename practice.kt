data class BookType(
    val ebook: Ebook,
    val audioBook: AudioBook,
    val hardCopyBook: HardCopyBook
)
data class Book(
    val name: String,
    val author: String,
    val price: Double
)
data class Ebook(
    val books: List<Book> = listOf(
        Book("Kotlin for Kids","Aarav Mitra",5.99),
        Book("Galaxy Explorer: Code Edition","Luna Ray",6.49),
        Book("Minimalist Mindset","Zayn Hossain",4.75)
    )
)
data class AudioBook(
    val books: List<Book> = listOf(
        Book("Voices of the Jungle","Sofia Rahman",7.99),
        Book("Dream Code","Leo Karim",6.99),
        Book("Legends Reimagined","Nadia Ahmed",8.49)
    )
)
data class HardCopyBook(
    val books: List<Book> = listOf(
        Book("The Ink Chronicles","Elina Faruk",11.99),
        Book("Deep Design Dive","Arman Chowdhury",13.50),
        Book("Old Cities, New Stories","Reran Saleh",12.25)
    )
)
