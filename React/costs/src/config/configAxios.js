import axios from "axios";

const api = axios.create({
  baseURL: process.env.REACT_APP_MINHA_API
})

export async function Get(url) {
  const response = await api.get(url);
  return response.data
}

export async function Patch(url, body) {
  const response = await api.patch(url, body);
  return response.data
}

export async function Delete(url) {
  const response = await api.delete(url);
  return response.data
}

export async function Post(url, body) {
  const response = await api.post(url, body);
  return response.data
}
