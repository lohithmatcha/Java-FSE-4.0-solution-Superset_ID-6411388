//import { text } from "body-parser";
import React from "react";
import { useState } from "react";

function CurrencyConvertor() {
    const [rupees,setrupees] = useState('');
    const [euro,seteuro]=useState(null);

    const handleSubmit=()=>{
        const rs = parseFloat(rupees);
        if(!isNaN(rs)){
            const convert=rs/90;
            seteuro(convert.toFixed(2));
            alert("Converting to Euro Amount is "+convert.toFixed(2));
        }
        else{
           alert("Enter valid amount");
        }
}
    return(
        <div>
            <h2 style={{ color: 'green' }}>Currency Convertor</h2>

            Amount: &nbsp;
            <input type="text" placeholder="Enter amount in INR"
            value={rupees}
            onChange={(ev)=> setrupees(ev.target.value)}/><br/>
            Currency: &nbsp;
            <input></input><br/>
            &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
            <button onClick={handleSubmit}>Submit</button>
        </div>
    )
}
export default CurrencyConvertor;