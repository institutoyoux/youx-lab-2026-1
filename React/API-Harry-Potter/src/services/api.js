const API_URL = "https://hp-api.onrender.com/api/characters";

export async function getCharacters() {
  const response = await fetch(API_URL);
  const data = await response.json();

  return data;
}