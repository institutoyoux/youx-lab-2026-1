
import { Link, useLocation } from "react-router-dom";

function CharacterDetails() {
  const { state } = useLocation();
  const character = state?.character;

  if (!character) {
    return (
      <div className="fundo">
        <main className="app">
          <h1>Personagem não encontrado</h1>
          <Link to="/">Voltar para a wiki</Link>
        </main>
      </div>
    );
  }

  return (
    <div className="fundo">
      <main className="app">
        <Link className="back-link" to="/">
          ← Voltar para a wiki
        </Link>

        <section className="details-page">
          {character.image && (
            <img
              className="details-image"
              src={character.image}
              alt={character.name}
            />
          )}

          <div className="details-info">
            <h1>{character.name}</h1>

            <p>
              <strong>Casa:</strong>{" "}
              {character.house || "Desconhecida"}
            </p>

            <p>
              <strong>Ator:</strong>{" "}
              {character.actor || "Desconhecido"}
            </p>

            <p>
              <strong>Espécie:</strong>{" "}
              {character.species || "Desconhecida"}
            </p>

            <p>
              <strong>Gênero:</strong>{" "}
              {character.gender || "Não informado"}
            </p>

            <p>
              <strong>Patrono:</strong>{" "}
              {character.patronus || "Não informado"}
            </p>

            <p>
              <strong>Ancestralidade:</strong>{" "}
              {character.ancestry || "Não informada"}
            </p>

            <p>
              <strong>Data de nascimento:</strong>{" "}
              {character.dateOfBirth || "Não informada"}
            </p>
          </div>
        </section>
      </main>
    </div>
  );
}

export default CharacterDetails;
