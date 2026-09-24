import axios from "axios";

export async function GetGeral() {
  const resposta = await axios.get("https://hp-api.onrender.com/api/characters");
  return resposta.data
}

export async function GetPersonagem(url) {
    const resposta = await axios.get(`https://hp-api.onrender.com/api/character/${url}`)
    return resposta.data
}