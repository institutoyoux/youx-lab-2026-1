import axios from "axios";

const api = axios.create()

export const obterFocos = async () => {
    const resp = await api.get("/focos.geojson")
    return resp.data.features
}

export const obterMunicipios = async () => {
    const resp = await api.get("/municipios.json")
    return resp.data
}
