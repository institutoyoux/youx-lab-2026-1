function CharacterCard({ character, onDetails }) {
  return (
    <div className="character-card">
      {character.image && (
        <img
          src={character.image}
          alt={character.name}
        />
      )}
      <div className="character-info">
        <h2>{character.name}</h2>
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
        <button onClick={() => onDetails(character)}>
          Ver mais detalhes
        </button>
      </div>
    </div>
  );
}

export default CharacterCard;
