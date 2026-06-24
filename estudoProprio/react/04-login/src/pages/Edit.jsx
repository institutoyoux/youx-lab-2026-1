import Input from "../components/Input"
import api from '../api'
import { useState } from "react";

export default function Edit(props) {
    const [btnText, setText] = useState('Salvar')
    async function editar(form) {
        setText('Salvando...')
        form.preventDefault();
        const admin = localStorage.getItem("logged")
        if (!admin) {
            return alert("erro na requisição!")
        }
        const body = {
            user: admin,
            edit: {id: props.id, nome: form.target[0].value, idade: form.target[1].value}
        }
        try {
            const res = await api.post('/edit', body)
            const resposta = res.data
            if (resposta.status === 'sucess') {
                alert('Usuário alterado com sucesso!')
                window.location.reload()
            } else {
                setText('Salvar')
                alert('erro an requisição ' + resposta.message)
            }
        } catch {alert('erro na requisição')}
    }
    return (
        <>
        <div className="bg"></div>
        <form className="edit" onSubmit={(e) => editar(e)}>
            <section className="top"><h1>Editar usuário</h1> <i className='bx bx-x' onClick={()=>props.setEdit(false)}></i></section>
            <div className="line"></div>
            <Input className="username" defaultValue={props.username} type="text" placeholder="Nome do usuario" label="Nome"/>
            <Input className="username" defaultValue={props.idade} type="number" placeholder="Idade do usuario" label="Idade"/>
            <button type="submit">{btnText}</button>
        </form>
        </>
    )
}