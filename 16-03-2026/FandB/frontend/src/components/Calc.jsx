import { useState } from "react";


function Calc() {

  const [expression, setExpression] = useState("");
  const [result, setResult] = useState("");

  const Calculate = () => {
    try {
      setResult(XPathEvaluator(expression));
    } catch {
      setResult("Invalid Expression!");
    }
  };

  return (
    <>
      <input
        type="text"
        placeholder="(5+7*2)"
        value={expression}
        onChange={(e) => setExpression(e.target.value)}
      />

      <button onClick={Calculate}>Calculate</button>

      <h1>{result}</h1>
    </>
  );
}

export default Calc;