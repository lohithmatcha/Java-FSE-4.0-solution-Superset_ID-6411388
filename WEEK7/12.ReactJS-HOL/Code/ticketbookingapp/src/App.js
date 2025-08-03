//import logo from './logo.svg';
import './App.css';
import React from 'react';
import { useState } from 'react';
import LogoutButton from './LogoutButton';
import LoginButton from './LoginButton';
import Greeting from './Greeting';
function App() { 
  const [isLog,setisLog] =useState(false);
  const handleLogin =()=>{
    setisLog(true);
  }

  const handleLogout = ()=>{
    setisLog(false);
  }
  let button;
  if(isLog){
    button =<LogoutButton onClick={handleLogout} />
  }
  else{
    button =<LoginButton onClick={handleLogin}/>
  } 
  return (
    <div >
       <Greeting isLog={isLog}/>
       {button}
    </div>
  );
}

export default App;
