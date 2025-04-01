# Spring Boot MVC - Book List Application

This is a Spring Boot MVC application that displays a list of books. It uses three main components: `BookController`, `BookDto`, and `bookList.jsp`.

## Project Structure

The project consists of the following components:

- **BookController**: Handles HTTP requests and retrieves the list of books.
- **BookDto**: Data Transfer Object (DTO) representing a book, containing properties like book ID, book name, publisher, and price.
- **bookList.jsp**: JSP file that displays the list of books.

### File Overview:

- **BookController.java**: 
  - The controller class that handles the request mapping and provides data to the view.
  - It retrieves a list of books from the service or database and sends them to the view (bookList.jsp).
  
- **BookDto.java**:
  - A simple DTO class used to represent the properties of a book, such as `bookid`, `bookname`, `publisher`, and `price`.

- **bookList.jsp**:
  - The JSP page that displays the list of books in a simple HTML format.
  - Uses JSP tags to iterate over the list and display book details.


