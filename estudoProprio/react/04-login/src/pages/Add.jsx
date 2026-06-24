import { useState } from "react"
import Input from "../components/Input"
import api from '../api'
export default function Add(props) {
    const [btnText, setText] = useState('Criar')
    const add = async (form) => {
        form.preventDefault()
        try {
            const nome = form.target[0].value
            const idade = form.target[1].value
            if (!nome || !idade) {
                return alert('Nome e idade são obrigatórios')
            }
            const body = {
                user: localStorage.getItem('logged'),
                nome: nome,
                idade: idade
            }
            console.log(body)
            const res = await api.post('/add', body)
            if (res.data.status === 'sucess') {
                alert('Usuario criado com sucesso!')
                window.location.reload()
            }
        } catch {
            alert('erro ao criar usuario')
        }
    }
    return (
        <>
            <div className="bg"></div>
            <form className="edit" onSubmit={(e) => add(e)}>
                <section className="top"><h1>Criar usuário</h1> <i className='bx bx-x' onClick={() => props.setAdd(false)}></i></section>
                <div className="line"></div>
                <Input className="username" type="text" placeholder="Nome do usuario" label="Nome" />
                <Input className="username" type="number" placeholder="Idade do usuario" label="Idade" />
                <button type="submit">{btnText}</button>
            </form>
        </>
    )
}