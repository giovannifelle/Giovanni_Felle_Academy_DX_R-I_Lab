document.addEventListener("DOMContentLoaded", () => {
    const bookListContainer = document.getElementById("book-list");

    // Recupera i dati dall'API
    fetch("http://localhost:8080/api/books")
        .then(response => response.json())
        .then(books => {
            books.forEach(book => {
                const listItem = document.createElement("li");
                listItem.textContent = `${book.title} by ${book.author} - $${book.price}`;
                bookListContainer.appendChild(listItem);
            });
        })
        .catch(error => console.error("Error fetching books:", error));
});
