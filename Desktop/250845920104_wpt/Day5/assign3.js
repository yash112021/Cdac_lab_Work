 let count = 0;

    function updateDisplay() {
      document.getElementById("pa").textContent = count;
    }

    function increment() {
      count++;
      updateDisplay();
    }
