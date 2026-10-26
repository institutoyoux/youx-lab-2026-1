import './App.css';
import Pessoa from './components/Pessoas';
//import SayMyName from './components/SayMyName';

function App() {

  return (
    <div className="App">
      
      {/* <SayMyName nome=""/> */}
      <Pessoa
        nome="Alfredo" 
        idade="29" 
        profissao="Programador" 
        foto="https://via.placeholder.com/150" 
      />
    </div>
  )
}

export default App;
