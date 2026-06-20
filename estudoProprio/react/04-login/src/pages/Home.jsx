import Header from "../components/Header"
import api from "../api"
import { useState } from "react"
import { useEffect } from "react"
import Loading from './Loading.jsx'
import './Home.css'

export default function app() {
    const admin = localStorage.getItem('logged')
    if (!localStorage.getItem('logged')) {
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
    }, [])
    let totalIdades = 0
    const idades = teste.map((user) => totalIdades = totalIdades + user.idade)
    const media = totalIdades / teste.length
    let maiorI = 0
    const maiorIdade = teste.map((user) => user.idade > maiorI ? maiorI = user.idade : null)
    return (
        <>
            {loading ? <Loading /> : null}
            <Header />
            <main className="mainApp">
                {/* {teste.length > 0 ? teste.map((user) => <span>{user.nome}</span>) : <span>Nenhum usuario encontrado</span>} */}
                <section className="details">
                    <div className="detail">
                        <div className="icon"><i className="bx bx-group"></i></div>
                        <p>Total de usuarios</p>
                        <span>{teste.length}</span>
                    </div>
                    <div className="detail">
                        <div className="icon"><i className="bx bx-calendar"></i></div>
                        <p>Idade média</p>
                        <span>{media}</span>
                    </div>
                    <div className="detail">
                        <div className="icon"><i className="bx bx-cake"></i></div>
                        <p>Maior idade</p>
                        <span>{maiorI}</span>
                    </div>
                </section>
                <section className="users">
                    <span className="usersTitle">Usuários</span>
                    <div className="line"></div>
                    {teste.length > 0 ? teste.map((user) => <div className="user"><i className="bx bx-user"></i><div className="userDados"><span className="userName">{user.nome}</span><span>{user.idade}</span></div><i class='bx bx-pencil'></i><i class='bx bx-trash' ></i></div>) : <span>Nenhum usuario encontrado</span>}
                </section>
            </main>
        </>
    )
}