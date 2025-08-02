//import logo from './logo.svg';
import './App.css';
import { useState } from 'react';
import CurrencyConvertor from './CurrencyConvertor';
function App() {
  const [count, setCount] = useState(0);

  const increment=() => {
    setCount(prev=>prev+1);
    Hello();
  };

  const decrement=() => {
    setCount(prev =>prev-1);
  };

  const Hello= () => {
    console.log("Hello-This is a static message.");
  };

  const Welcome = (msg_argu) => {
    alert(msg_argu);
  };

  const Press = (event) => {
    alert("I was clicked");
  };


  return (
    <div >
      {count}<br/>
      <button onClick={increment}>Increment</button> <br/>
      <button onClick={decrement}>Decrement</button><br/>
      <button onClick={()=>Welcome("Welcome")}>Say Welcome</button><br/>
      <button onClick={Press}>Click on me</button><br/>
      <CurrencyConvertor/>
    </div>
  );
}

export default App;
