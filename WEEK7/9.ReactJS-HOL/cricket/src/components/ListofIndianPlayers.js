import React from 'react';

const ListofIndianPlayers = ({IndianPlayers}) => {
  return (
    IndianPlayers.map((item)=>{
return(
    <div>
      <li>Mr.<span/> {item} </li>
    </div>
)
    })
  );
};

export default ListofIndianPlayers;
