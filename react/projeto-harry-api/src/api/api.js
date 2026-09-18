import axios from "axios"

const api = axios.create({
    baseURL: import.meta.env.VITE_HARRYAPIURL
})

export const getPersonagens = async () => {
    const response = await api.get("/characters")
    return response.data
}

export const getPersonagemById = async (id) => {
    const response = await api.get("/character/"+id)
    return response.data
}