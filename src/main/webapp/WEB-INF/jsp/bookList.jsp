<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ page import="com.mycom.myapp.dto.BookDto"%>
<%

    BookDto bookDto = (BookDto) request.getAttribute("bookDto");
%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Book List</title>
</head>
<body>
    <h1>bookList.jsp</h1>
    
    <h1> ! 책 목록 !</h1>

        <h4>책 ID : <%= bookDto.getBookid() %></h4>
        <h4>책 제목 : <%= bookDto.getBookname() %></h4>
        <h4>출판사 : <%= bookDto.getPublisher() %></h4>
        <h4>가격 : <%= bookDto.getPrice() %> 억</h4>
        <hr>

</body>
</html>
