const token = localStorage.getItem("token")

const authApi = axios.create({
    baseURL: 'http://localhost:8080',
    headers: {
        Authorization: `Bearer ${token}`
    }
})