import axios from "axios";

const api = axios.create({
    baseURL: import.meta.env.VITE_BASEURL
})
export async function obterResumo(tipo) {
    try {
        const resp = await api.get("/resumo/"+tipo)
        return resp.data
    }
    catch (erro) {
        console.log(erro)
    }
}