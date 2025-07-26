import './App.css';
import { CalculateScore } from './Components/CalculateScore';
function App() {
  return (
    <div className='formatstyle'>
     < CalculateScore Name={"alice"}
       School={"VVVS Public School"}
       total={303}
       goal={9}  />
    </div>
  );
}

export default App;
