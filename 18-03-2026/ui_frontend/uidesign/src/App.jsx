import { useState } from "react";
import ImageOnAndOff from "./components/imageonandoff";
import GuessingTheNumber from "./components/GuessingTheNumber";
import GradingSystem from "./components/GradingSystem";
import ListDisplay from "./components/ListDisplay";
import PrimeNumber from "./components/PrimeNUmber";
import ListOfPrimeNumber from "./components/LIstOfPrimeNumbers";

function App() {
  
  const [count, setCount] = useState(0);

  const incrementCounter = () => {
    setCount(prev => prev + 1);
  };

  const decrementCounter = () => {
    setCount(prev => prev - 1);
  };

  const resetCounter = () => {
    setCount(0);
  };

  return (
    <><div style={styles.container}>
      <div style={styles.card}>
        <h1 style={styles.title}>Counter App</h1>

        <div style={styles.count}>{count}</div>

        <div style={styles.buttonContainer}>
          <button style={styles.addBtn} onClick={incrementCounter}>
            ➕ Add
          </button>

          <button style={styles.subBtn} onClick={decrementCounter}>
            ➖ Subtract
          </button>
        </div>

        <button style={styles.resetBtn} onClick={resetCounter}>
          🔄 Reset
        </button>
      </div>
    </div>
      <ImageOnAndOff/>
      <GuessingTheNumber/>
      <GradingSystem/>
      <ListDisplay/>
      <PrimeNumber/>
      <ListOfPrimeNumber/>
      
      </>
  );
}

const styles = {
  container: {
    height: "100vh",
    display: "flex",
    justifyContent: "center",
    alignItems: "center",
    background: "linear-gradient(to right, #667eea, #764ba2)",
  },
  card: {
    background: "#fff",
    padding: "30px",
    borderRadius: "15px",
    textAlign: "center",
    boxShadow: "0 10px 25px rgba(0,0,0,0.2)",
    width: "300px",
  },
  title: {
    marginBottom: "20px",
  },
  count: {
    fontSize: "48px",
    fontWeight: "bold",
    marginBottom: "20px",
    color: "#333",
  },
  buttonContainer: {
    display: "flex",
    justifyContent: "space-between",
    marginBottom: "15px",
  },
  addBtn: {
    padding: "10px 15px",
    background: "#4CAF50",
    color: "#fff",
    border: "none",
    borderRadius: "8px",
    cursor: "pointer",
  },
  subBtn: {
    padding: "10px 15px",
    background: "#f44336",
    color: "#fff",
    border: "none",
    borderRadius: "8px",
    cursor: "pointer",
  },
  resetBtn: {
    padding: "10px",
    width: "100%",
    background: "#2196F3",
    color: "#fff",
    border: "none",
    borderRadius: "8px",
    cursor: "pointer",
  },
};

export default App;