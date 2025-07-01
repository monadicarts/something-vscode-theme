// TypeScript with JSX Sample for Something Theme
import React, { useState } from 'react';

interface SampleProps {
  title: string;
  initialCount?: number;
}

type Status = 'idle' | 'loading' | 'success' | 'error';

const SampleComponent: React.FC<SampleProps> = ({ title, initialCount = 0 }) => {
  const [count, setCount] = useState<number>(initialCount);
  const status: Status = 'idle';

  return (
    <div className="sample-container">
      <h1>{title}</h1>
      <p>Current count: {count}</p>
      <p>Status: {status}</p>
      <button onClick={() => setCount(c => c + 1)}>Increment</button>
    </div>
  );
};

export default SampleComponent;