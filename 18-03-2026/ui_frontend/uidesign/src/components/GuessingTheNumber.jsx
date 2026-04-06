import { useState } from "react";

function GuessingTheNumber() {
  const [num, setNum] = useState("");
  const [result, setResult] = useState("");
  const [randomNumber, setRandom] = useState("");

  const generateRandomNumber = () => {
    const rand = Math.floor(Math.random() * 10);

    if (Number(num) === rand) {
      setResult("✅ Your guess is right!");
      setRandom("🎯 Number: " + rand);
    } else {
      setResult("❌ Wrong guess!");
      setRandom("🎯 Number: " + rand);
    }
  };

  return (
    <div style={styles.container}>
      <div style={styles.card}>
        <h2 style={styles.title}>🎮 Guess The Number</h2>

        <input
          type="number"
          placeholder="Enter 0–9"
          value={num}
          onChange={(e) => setNum(e.target.value)}
          style={styles.input}
        />

        <button onClick={generateRandomNumber} style={styles.button}>
          Check
        </button>

        <h3 style={styles.result}>{result}</h3>
        <h3 style={styles.random}>{randomNumber}</h3>
      </div>
    </div>
  );
}

const styles = {
  container: {
    height: "100vh",
    display: "flex",
    justifyContent: "center",
    alignItems: "center",
    background: "linear-gradient(135deg, #667eea, #764ba2)",
  },
  card: {
    background: "#fff",
    padding: "30px",
    borderRadius: "15px",
    textAlign: "center",
    width: "300px",
    boxShadow: "0 10px 25px rgba(0,0,0,0.2)",
  },
  title: {
    marginBottom: "20px",
  },
  input: {
    width: "100%",
    padding: "10px",
    borderRadius: "8px",
    border: "1px solid #ccc",
    marginBottom: "15px",
    fontSize: "16px",
  },
  button: {
    width: "100%",
    padding: "10px",
    background: "#4CAF50",
    color: "#fff",
    border: "none",
    borderRadius: "8px",
    cursor: "pointer",
    fontSize: "16px",
  },
  result: {
    marginTop: "15px",
    fontWeight: "bold",
  },
  random: {
    marginTop: "5px",
    color: "#555",
  },
};

export default GuessingTheNumber;