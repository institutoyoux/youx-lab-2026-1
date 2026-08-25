import "./App.css";
import HelloWorld from "./components/HelloWorld";
import Frase from "./components/Frase";

function App() {
  const nome = "Luiz";

  const newName = nome.toUpperCase();

  function sum(a, b) {
    return a + b;
  }

  const url = "https://via.placeholder.com/150";

  return (
    <div className="App">
      <h1>Alterando o JSX</h1>
      <p>Olá, {newName}</p>
      <p>Soma: {sum(2, 4)}</p>
      <img src={url} alt="Minha imagem" />
      <HelloWorld />
    </div>
  );
}

export default App;
