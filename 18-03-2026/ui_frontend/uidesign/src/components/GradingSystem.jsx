import { useState } from "react";

function GradingSystem() {
  const [marks, setMarks] = useState("");
  const [result, setResult] = useState("");

  const calculateResult = () => {
    const m = Number(marks);

    if (m > 100 || m < 0) {
      setResult("Invalid marks");
      return;
    }

    if (m >= 90) setResult("A");
    else if (m >= 70) setResult("B");
    else if (m >= 55) setResult("C");
    else if (m >= 30) setResult("D");
    else setResult("F");
  };

  return (
    <div style={styles.container}>
      <div style={styles.card}>
        <h2 style={styles.title}>Grading System</h2>

        <input
          type="number"
          placeholder="Enter marks (0–100)"
          value={marks}
          onChange={(e) => setMarks(e.target.value)}
          style={styles.input}
        />

        <button style={styles.button} onClick={calculateResult}>
          Check Grade
        </button>

        <h3 style={styles.result}>
          Grade: <span>{result}</span>
        </h3>
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
    backgroundColor: "#f4f6f8", // ✅ standard light gray
  },
  card: {
    backgroundColor: "#ffffff",
    padding: "30px",
    borderRadius: "10px",
    width: "300px",
    boxShadow: "0 4px 10px rgba(0,0,0,0.1)",
    textAlign: "center",
  },
  title: {
    marginBottom: "20px",
    color: "#333",
  },
  input: {
    width: "100%",
    padding: "10px",
    marginBottom: "15px",
    borderRadius: "6px",
    border: "1px solid #ccc",
    fontSize: "16px",
  },
  button: {
    width: "100%",
    padding: "10px",
    backgroundColor: "#007BFF", 
    color: "#fff",
    border: "none",
    borderRadius: "6px",
    cursor: "pointer",
    fontSize: "16px",
  },
  result: {
    marginTop: "15px",
    color: "#333",
  },
};

export default GradingSystem;