import { useState } from "react";

function ImageOnAndOff() {
  const [count, setCount] = useState(true);

  const switchFunction = () => {
    setCount(!count);
  };

  return (
    <div style={styles.container}>
      <div style={styles.card}>
        <h2 style={styles.title}>Toggle Switch</h2>

        <div style={count ? styles.onBox : styles.offBox}>
          {count ? "🟢 ON" : "🔴 OFF"}
        </div>

        <button style={styles.button} onClick={switchFunction}>
          Toggle
        </button>
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
    background: "linear-gradient(135deg, #36d1dc, #5b86e5)",
  },
  card: {
    background: "#fff",
    padding: "30px",
    borderRadius: "15px",
    textAlign: "center",
    width: "280px",
    boxShadow: "0 10px 25px rgba(0,0,0,0.2)",
  },
  title: {
    marginBottom: "20px",
  },
  onBox: {
    padding: "20px",
    borderRadius: "10px",
    background: "#4CAF50",
    color: "#fff",
    fontSize: "24px",
    marginBottom: "20px",
    transition: "0.3s",
  },
  offBox: {
    padding: "20px",
    borderRadius: "10px",
    background: "#f44336",
    color: "#fff",
    fontSize: "24px",
    marginBottom: "20px",
    transition: "0.3s",
  },
  button: {
    padding: "10px 20px",
    background: "#333",
    color: "#fff",
    border: "none",
    borderRadius: "8px",
    cursor: "pointer",
    fontSize: "16px",
  },
};

export default ImageOnAndOff;