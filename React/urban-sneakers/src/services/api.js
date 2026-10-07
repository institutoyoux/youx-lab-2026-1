import axios from "axios";

export async function Get() {
  const response = await axios.get('http://192.168.4.8:3000/products');
  return response.data
}