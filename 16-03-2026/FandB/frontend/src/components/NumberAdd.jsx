import { useState } from "react";

function NumberAdd() {

  const [num1, setNum1] = useState();
  const [num2, setNum2] = useState();
  const [result, setResult] = useState();

  

  const addNumbers = () => {
    setResult(Number(num1) + Number(num2));
  };

  function subtraction() {
    setResult(Number(num1) - Number(num2));
  }

  function multiplication() {
    setResult(Number(num1) * Number(num2));
  }

  function division() {
    if (Number(num2) === 0) {
      setResult("Cannot divide by zero");
    } else {
      setResult(Number(num1) / Number(num2));
    }
  }

  function modulus() {
    setResult(Number(num1) % Number(num2));
  }

  function Double() {
    setNum1(Number(num1) + Number(num1));
  }

  return (
    <div>
      <h2>Calculator</h2>

      <input
        type="number"
        value={num1}
        onChange={(e) => setNum1(e.target.value)}
        placeholder="Enter first number"
      />

      <br /><br />

      <input
        type="number"
        value={num2}
        onChange={(e) => setNum2(e.target.value)}
        placeholder="Enter second number"
      />

      <br /><br />

      <button 
  onClick={addNumbers}
  style={{
    width: "120px",
    height: "45px",
    borderRadius: "25px",
    border: "none",
    backgroundColor: "#4CAF50",
    color: "white",
    fontSize: "16px",
    margin: "10px",
    cursor: "pointer"
  }}
>
  Add
</button>

<button 
  onClick={subtraction}
  style={{
    width: "120px",
    height: "45px",
    borderRadius: "25px",
    border: "none",
    backgroundColor: "#2196F3",
    color: "white",
    fontSize: "16px",
    margin: "10px",
    cursor: "pointer"
  }}
>
  Subtraction
</button>

<button 
  onClick={multiplication}
  style={{
    width: "120px",
    height: "45px",
    borderRadius: "25px",
    border: "none",
    backgroundColor: "#FF9800",
    color: "white",
    fontSize: "16px",
    margin: "10px",
    cursor: "pointer"
  }}
>
  Multiplication
</button>

<button 
  onClick={division}
  style={{
    width: "120px",
    height: "45px",
    borderRadius: "25px",
    border: "none",
    backgroundColor: "#9C27B0",
    color: "white",
    fontSize: "16px",
    margin: "10px",
    cursor: "pointer"
  }}
>
  Division
</button>

<button 
  onClick={modulus}
  style={{
    width: "120px",
    height: "45px",
    borderRadius: "25px",
    border: "none",
    backgroundColor: "#f44336",
    color: "white",
    fontSize: "16px",
    margin: "10px",
    cursor: "pointer"
  }}
>
  Modulus
</button>

      <h3>Result: {result}</h3>
      
    </div>
  );
}

export default NumberAdd;