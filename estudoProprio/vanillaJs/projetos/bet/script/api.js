const normalReq = axios.create({
    baseURL: 'http://localhost:8080'
})
const token = localStorage.getItem("token")

const logReq = axios.create({
    baseURL: 'http://localhost:8080',
    headers: {
        Authorization: `Bearer ${token}`
    }
})