import axios from "axios"

const api = axios.create({
    baseURL: import.meta.env.VITE_BASE_URL
})

export const enviarDados = async (body) => {
    const response = await api.post("/users", body)
    return response.data
}

export const obterUsers = async () => {
    const response = await api.get("/users")
    return response.data
}