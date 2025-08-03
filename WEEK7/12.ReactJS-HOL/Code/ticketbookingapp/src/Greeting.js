import React from "react";
import UserGreeting from './UserGreeting';
import GuestGreeting from './GuestGreeting';

function Greeting(props) {
    const isLog2 =props.isLog;
    if(isLog2)
        return <UserGreeting/>;
    return <GuestGreeting/>;
}

export default Greeting;