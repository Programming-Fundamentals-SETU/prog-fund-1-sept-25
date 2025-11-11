
# Library Management System

```plantuml
@startuml
skinparam backgroundColor #f9f9f6
skinparam classBackgroundColor #fff6e5
title Library Management System


class Library {
  .. Attributes ..

  - String libraryName
  - Book[] books
  - int bookCount
  .. Constructor ..

  + Library(String, int)
  
  .. Methods ..
  + setLibraryName(String): void
  + getLibraryName(): String
  + getBookCount(): int
  + getBooks(): Book[]
  + setBooks(Book[]): void
  + addBook(Book): boolean
  + findBook(String): Book
  + borrowBook(String): boolean
  + countBooksOnLoan(): int
  + calculateAverageRating(): double
  + findHighestRatedBook(): Book
  + listAllBooks()
  + listAvailableBooks()
  + toString(): String
  - isEmpty(): boolean
  - isFull(): boolean
}

class LibraryDriver {
  .. Attributes ..
   
  - Scanner input
  - Library lib
  - String libraryName
  - int maxBooks
  .. Constructor ..

  + LibraryDriver()

  .. Methods ..
  + main(String[]): void
  + runMenu(): void
  + chooseOption(): int

}

@enduml
