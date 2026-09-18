import axios from "axios"
const token = localStorage.getItem("token")
const api = axios.create({
    baseURL: 'http://192.168.1.59:8080',
    headers: {
        Authorization: "Bearer " + token
    }
})
export const normalAPi = axios.create({
    baseURL: 'http://192.168.1.59:8080'
})
export default api;