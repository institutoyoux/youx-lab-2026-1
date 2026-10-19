import axios from "axios";

export default async function Get(url) {
  const response = await axios.get(`http://localhost:3000/${url}`);
  return response.data
}