
import { useEffect, useState } from "react";
import {
  Routes,
  Route,
  useNavigate,
} from "react-router-dom";

import { getCharacters } from "./services/api";
import CharacterCard from "./components/CharacterCard";
import CharacterDetails from "./pages/CharacterDetails";
import "./style.css";

function Home() {
  const [characters, setCharacters] = useState([]);
  const [loading, setLoading] = useState(true);
  const [error, setError] = useState("");

  const navigate = useNavigate();

  useEffect(() => {
    async function loadCharacters() {
      try {
        const data = await getCharacters();
        setCharacters(data);
      } catch (error) {
        setError("Não foi possível carregar os personagens.");
        console.error(error);
      } finally {
        setLoading(false);
      }
    }

    loadCharacters();
  }, []);

  function handleDetails(character) {
    const id = character.id ?? character.name;

    navigate(`/personagem/${encodeURIComponent(id)}`, {
      state: { character },
    });
  }

  return (
    <div className="fundo">
      <main className="app">
        <header className="header">
          <h1>Harry Potter</h1>
          <p>Explore o mundo mágico de Harry Potter</p>
        </header>

        {loading && <p>Carregando personagens...</p>}

        {error && <p>{error}</p>}

        {!loading && !error && (
          <section className="characters-grid">
            {characters.map((character) => (
              <CharacterCard
                key={character.id || character.name}
                character={character}
                onDetails={handleDetails}
              />
            ))}
          </section>
        )}
      </main>
    </div>
  );
}

function HApp() {
  return (
    <Routes>
      <Route path="/" element={<Home />} />
      <Route
        path="/personagem/:id"
        element={<CharacterDetails />}
      />
    </Routes>
  );
}

export default HApp;
