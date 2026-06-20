import Header from "../components/Header"
import api from "../api"
import { useState } from "react"
import { useEffect } from "react"
import Loading from './Loading.jsx'

export default function app() {
    const admin = localStorage.getItem('logged')
    if (!localStorage.getItem('logged') ) {
        window.location.href = '/login'
    }
    const [teste, setTeste] = useState([])
    const [loading, setLoading] = useState(true)
    const users = async () => {
        const body = { user: admin }
        try {
            const res = await api.post('/users', body)
            setTeste(res.data)
            setLoading(false)
        } catch {
            console.error('deu erro pae')
        }
    }
    useEffect(() => {
        users()
    })
    return (
        <>
            {loading ? <Loading /> : null}
            <Header />
            <main>
            {teste.length > 0 ? teste.map((user) => <span>{user.nome}</span>) : <span>Nenhum usuario encontrado</span>}
            {/* continuar daqui (fazer cards de users!) */}
            </main>
        </>
    )
}