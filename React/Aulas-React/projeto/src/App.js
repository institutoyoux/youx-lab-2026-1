import './App.css';
import Pessoa from './components/Pessoas';
import Frases from './components/Frase';
import List from './components/List';

function App() {

  return (
    <div className="App">
      
      {/* <SayMyName nome=""/> */}
      <Frases />
      <List />
    
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
