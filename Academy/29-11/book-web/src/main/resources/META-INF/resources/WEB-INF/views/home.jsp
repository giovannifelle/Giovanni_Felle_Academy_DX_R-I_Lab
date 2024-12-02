<%@ page contentType="text/html; charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="it">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Elenco Libri</title>
    <style>
        /* Global Styles */
        body {
            font-family: Arial, sans-serif;
            line-height: 1.6;
            margin: 0;
            padding: 0;
            color: #333;
            background-color: #f9f9f9;
        }

        /* Header */
        header {
            background-color: #4CAF50;
            color: white;
            padding: 1rem 0;
            text-align: center;
        }

        .main-title {
            font-size: 2.5rem;
            margin: 0;
        }

        /* Book List Section */
        #book-list-section {
            margin: 2rem auto;
            max-width: 800px;
            padding: 1rem;
            background: white;
            border-radius: 8px;
            box-shadow: 0 2px 4px rgba(0, 0, 0, 0.1);
        }

        #book-list-section h2 {
            text-align: center;
            color: #333;
            margin-bottom: 1rem;
        }

        /* Book List */
        #book-list {
            list-style: none;
            padding: 0;
        }

        .book-item {
            padding: 0.8rem;
            margin: 0.5rem 0;
            display: flex;
            justify-content: space-between;
            background: #f1f1f1;
            border-radius: 4px;
            box-shadow: 0 1px 3px rgba(0, 0, 0, 0.1);
        }

        .book-title {
            font-weight: bold;
            color: #555;
        }

        .book-author {
            color: #888;
            font-style: italic;
        }

        /* Footer */
        footer {
            text-align: center;
            padding: 1rem;
            background-color: #333;
            color: white;
            margin-top: 2rem;
        }
    </style>
</head>
<body>
<header>
    <h1 class="main-title">Benvenuto nella Libreria</h1>
</header>
<main>
    <section id="book-list-section">
        <h2>Elenco dei Libri</h2>
        <!-- Lista dinamica dei libri -->
        <ul id="book-list">
            <c:forEach var="book" items="${books}">
                <li class="book-item">
                    <span class="book-title">${book.title}</span>
                    <span class="book-author">di ${book.author}</span>
                </li>
            </c:forEach>
        </ul>
    </section>
</main>
<footer>
    <p>&copy; 2024 Libreria Online. Tutti i diritti riservati.</p>
</footer>
<script src="script.js"></script>
</body>
</html>
