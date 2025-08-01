//import logo from './logo.svg';
import './App.css';
import ListofPlayers from './components/ListofPlayers';
import Scorebelow70 from './components/Scorebelow70';
import ListofIndianPlayers from './components/ListofIndianPlayers';
import { OddPlayers } from './components/OddPlayers';
import { EvenPlayers } from './components/EvenPlayers';
function App() { 
  var flag=false;
  const players = [
    { name: 'Jack', score: 50 },
    { name: 'Michael', score: 70 },
    { name: 'John', score: 40 },
    { name: 'Ann', score: 61 },
    { name: 'Elisabeth', score: 61 },
    { name: 'Sachin', score: 95 },
    { name: 'Dhoni', score: 100 },
    { name: 'Virat', score: 84 },
    { name: 'Jadeja', score: 64 },
    { name: 'Raina', score: 75 },
    { name: 'Rohit', score: 80 },
  ];

  const T20Players=['First Player','Second Player','Third Player'];
  const RanjiTrophyPlayers=['Fourth Player','Fifth Player','Sixth Player'];
 
  const T20 = ['Sachin1', 'Dhoni2', 'Virat3'];
  const Ranji = ['Rohit4', 'Yuvaraj5', 'Raina6'];
 
  const IndianTeam=[...T20,...Ranji];  
  const IndianPlayers=[ 
    ...T20Players,
    ...RanjiTrophyPlayers
  ]
  if(flag==true){
  return (
    <div>
       <h1>List of Players</h1>
       <ListofPlayers players={players}/>
       <hr/>
       <h1>List of Players having Scores Less than 70</h1>
       <Scorebelow70 players={players}/>
    </div>
  );
  }
  else{
    return(
       <div>
            <div>
              
              <h1>Odd Players</h1>
              {OddPlayers(IndianTeam)}
              <hr/>
              <h1>Even Players</h1>
              {EvenPlayers(IndianTeam)}
            </div>
            <hr/>
            <div>
              <h1>List of Indian Players Merged:</h1>
              <ListofIndianPlayers IndianPlayers={IndianPlayers}/>
            </div>
       </div>
    );
  }

}

export default App;
