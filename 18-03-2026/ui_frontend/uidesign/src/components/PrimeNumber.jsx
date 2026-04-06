import { useState } from "react";

function PrimeNumber() {
    const [num, setNum] = useState(0);
    const [result, setResult] = useState(null);

    const checkPrime = () => {
        const n = Number(num);

        if (n === 0 || n === 1) {
            setResult(false);
            return;
        }

        let isPrime = true;

        for (let i = 2; i < num/2; i++) {
            if (n % i === 0) {
                isPrime = false;
                break;
            }
        }

        setResult(isPrime);
    };

    return (
        <div>
            <input
                type="number"
                placeholder="Enter number"
                value={num}
                onChange={(e) => setNum(e.target.value)}
            />

            <button onClick={checkPrime}>Check</button>

            <h1>
                {result === null
                    ? ""
                    : result
                    ? "Prime"
                    : "Not Prime"}
            </h1>
        </div>
    );
}

export default PrimeNumber;