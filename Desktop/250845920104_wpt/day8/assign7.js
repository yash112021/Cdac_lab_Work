 // Get the display
            let display = document.getElementById("reslt");
            // Buttons
            let buttons = document.querySelectorAll("button");
            // Current expression
            let expression = "";

            // Handle button clicks
            buttons.forEach(button => {
                button.addEventListener("click", () => {
                    let value = button.innerText;

                    if (value === "C") {
                        // Clear
                        expression = "";
                        display.innerText = "";
                    } else if (value === "=") {
                        // Evaluate
                        try {
                            expression = eval(expression).toString();
                            display.innerText = expression;
                        } catch {
                            display.innerText = "Error";
                            expression = "";
                        }
                    } else {
                        // Append value
                        expression += value;
                        display.innerText = expression;
                    }
                });
            });