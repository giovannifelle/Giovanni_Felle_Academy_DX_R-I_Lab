document.getElementById('sommaForm').addEventListener('submit', function(event) {
    event.preventDefault();
  
    // Otteniamo i valori dai campi input
    let num1 = document.getElementById('num1').value;
    let num2 = document.getElementById('num2').value;
  
    // Verifica se i numeri sono stati inseriti
    if (num1 === '' || num2 === '') {
      alert('Per favore, inserisci entrambi i numeri.');
      return;
    }
  
    // Convertiamo i valori in numeri
    num1 = parseFloat(num1);
    num2 = parseFloat(num2);
  
    // Controlliamo se i valori sono numeri validi
    if (isNaN(num1) || isNaN(num2)) {
      alert('Inserisci valori numerici validi.');
      return;
    }
  
    // Calcoliamo la somma
    let somma = num1 + num2;
  
    // Mostriamo il risultato
    document.getElementById('risultato').textContent = `La somma è: ${somma}`;
  });
  