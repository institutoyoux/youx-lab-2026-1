import Header from "../components/Header"
import api from "../api"
import { useState } from "react"
import { useEffect } from "react"
import Loading from './Loading.jsx'
import './Home.css'
import Edit from "./Edit.jsx"
import Add from './Add.jsx'

export default function app() {
    const admin = localStorage.getItem('logged')
    if (!localStorage.getItem('logged')) {
        window.location.href = '/login'
    }
    const [usersRetornado, setUsers] = useState([])
    const [loading, setLoading] = useState(true)
    const users = async () => {
        const body = { user: admin }
        try {
            const res = await api.post('/users', body)
            setUsers(res.data)
            setLoading(false)
        } catch {
            console.error('deu erro pae')
        }
    }
    useEffect(() => {
        users()
    }, [])
    let totalIdades = 0
    const idades = usersRetornado.map((user) => totalIdades = totalIdades + user.idade)
    const media = totalIdades / usersRetornado.length
    let maiorI = 0
    const maiorIdade = usersRetornado.map((user) => user.idade > maiorI ? maiorI = user.idade : null)

    const logout = () => {
        localStorage.removeItem('logged');
        window.location.href = '/login'
    }

    const [editMenu, setEdit] = useState(null)
    const [addMenu, setAdd] = useState(false)
    async function deletar(id) {
        const body = {user: localStorage.getItem('logged'), id: id}
        try {
            const res = await api.post('/delete', body);
            if (res.data.status === 'sucess') {
                alert('Usuario deletado com sucesso')
                window.location.reload()
            }
        } catch {
            alert('erro ao deletar usuario')
        }
    }
    return (
        <>
            {loading ? <Loading /> : null}
            <Header />
            <main className="mainApp">
                <section className="details">
                    <div className="detail">
                        <div className="icon"><i className="bx bx-group"></i></div>
                        <p>Total de usuarios</p>
                        <span>{usersRetornado.length}</span>
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
                    <span className="usersTitle">Usuários <i className="bx bx-plus" onClick={() => setAdd(true)}></i></span>
                    <div className="line"></div>
                    {usersRetornado.length > 0 ? usersRetornado.map((user) => <div className="user"><i className="bx bx-user"></i><div className="userDados"><span className="userName">{user.nome}</span><span>{user.idade}</span></div><i className='bx bx-pencil' onClick={()=>setEdit({id: user.id, n: user.nome, i: user.idade})}></i><i className='bx bx-trash'onClick={() => {deletar(user.id)}} ></i></div>) : <span>Nenhum usuario encontrado</span>}
                </section>
            </main>
            <button className="logout" onClick={logout}>Sair do painel</button>
            {editMenu ? <Edit id={editMenu.id} username={editMenu.n} idade={editMenu.i} setEdit={setEdit}/> : null}
            {addMenu ? <Add setAdd={setAdd}/> : null}
        </>
    )
}