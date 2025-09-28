import React, { useState } from 'react';

export default function Calculator() {
  // State to track inputs and operation
  const [inputs, setInputs] = useState({ num1: '', num2: '', operation: '' });
  // State to store calculation result
  const [result, setResult] = useState(null);

  // Handler to update inputs state on input change
  const handleChange = (e) => {
    const { name, value } = e.target;
    setInputs((prev) => ({
      ...prev,
      [name]: value,
    }));
  };

  // Handler for the Calculate button click
  const handleCalculate = () => {
    const n1 = parseFloat(inputs.num1);
    const n2 = parseFloat(inputs.num2);

    if (isNaN(n1) || isNaN(n2)) {
      setResult('Please enter valid numbers.');
      return;
    }
    let output;
    switch (inputs.operation) {
      case 'add':
        output = n1 + n2;
        break;
      case 'sub':
        output = n1 - n2;
        break;
      case 'mul':
        output = n1 * n2;
        break;
      case 'div':
        output = n2 !== 0 ? n1 / n2 : 'Cannot divide by zero!';
        break;
      default:
        output = 'Please select an operation.';
    }
    setResult(output);
  };

  return (
    <div style={{ maxWidth: '320px', margin: '30px auto', fontFamily: 'Arial, sans-serif' }}>
      <h2>Simple Calculator</h2>

      <label htmlFor="num1">First Number:</label>
      <input
        type="number"
        id="num1"
        name="num1"
        value={inputs.num1}
        onChange={handleChange}
        placeholder="Enter first number"
        style={{ width: '100%', marginBottom: '15px', padding: '8px' }}
      />

      <label htmlFor="num2">Second Number:</label>
      <input
        type="number"
        id="num2"
        name="num2"
        value={inputs.num2}
        onChange={handleChange}
        placeholder="Enter second number"
        style={{ width: '100%', marginBottom: '15px', padding: '8px' }}
      />

      <label htmlFor="operation">Operation:</label>
      <select
        id="operation"
        name="operation"
        value={inputs.operation}
        onChange={handleChange}
        style={{ width: '100%', marginBottom: '20px', padding: '8px' }}
      >
        <option value="">Select operation</option>
        <option value="add">Addition (+)</option>
        <option value="sub">Subtraction (-)</option>
        <option value="mul">Multiplication (×)</option>
        <option value="div">Division (÷)</option>
      </select>

      <button
        onClick={handleCalculate}
        style={{
          width: '100%',
          padding: '10px',
          backgroundColor: '#007BFF',
          color: '#fff',
          border: 'none',
        //   cursor: 'pointer',
          fontSize: '16px',
        }}
      >
        Calculate
      </button>

      {result !== null && (
        <div
          style={{
            marginTop: '25px',
            padding: '15px',
            backgroundColor: '#F4F4F4',
            borderRadius: '5px',
            textAlign: 'center',
            fontWeight: 'bold',
          }}
          aria-live="polite"
        >
          Result: {result}
        </div>
      )}
    </div>
  );
}
