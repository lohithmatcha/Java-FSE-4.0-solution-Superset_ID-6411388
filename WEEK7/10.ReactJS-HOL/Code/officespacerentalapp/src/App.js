//import logo from './logo.svg';
import sr from './sr.png'
import './App.css';

function App() {
  const element = "Office Space";
  const jsxatt = <img src={sr} width="25%" height="25%" alt="Office Space" />;

  const ItemName = { Name: "DBS", Rent: 50000, Address: 'Chennai' };
  let colors =[];
  if(ItemName.Rent <=60000){
    colors.push('textRed');
    
  }
  else
    colors.push('textGreen');
  return (
    <div className='cc'>
          <h1>{element}, at Affordable Range</h1>  
          {jsxatt}
          <h2>Name: {ItemName.Name}</h2>
          <h3 className={colors[0]}>Rent : Rs.{ItemName.Rent}</h3>
          <h3>Address: {ItemName.Address}</h3>
    </div>
  );
}

export default App;
