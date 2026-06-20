import './Auth.css'
import Header from '../components/Header'
import Input from '../components/Input'
import { useState } from 'react'
import axios from 'axios'
import api from '../api';

export default function login() {
    const [formErro, setFormErro] = useState(false)
    const [passValid, setPassValid] = useState(false)
    const [emailValid, setEmailValid] = useState(false)
    const validForm = emailValid && passValid
    const login = async (form) => {
        form.preventDefault()
        if (validForm) {
            setFormErro(false)
            const body = {
                email: form.target[0].value,
                password: form.target[1].value
            }
            try {
                const res = await api.post('/login', body)
                if (res.data.status === 'sucess') {
                    localStorage.setItem('logged', res.data.user)
                    window.location.href = '/'
                }
            } catch {
                console.log('deu erro')
            }
        } else {
            setFormErro('Email ou senha invalidos!')
        }
    }
    return (
        <>
            <Header />
            <main>
                <h1>Fazer login</h1>
                <p>Entre em sua conta para ter acesso ao seu painel admin.</p>
                <form className='form' onSubmit={(e) => login(e)}>
                    <Input label="E-mail" placeholder="Digite seu e-mail" type="email" setEmailValid={setEmailValid} />
                    <Input label="Senha" placeholder="Digite sua senha" type="password" setPassValid={setPassValid}/>
                    {!formErro ? null : <span className='error'><i className='bx bx-error-circle'></i> {formErro}</span>}
                    <button type='submit' disabled={!validForm}>Continuar</button>
                </form>
                <div className='or'>
                    <div className='line'></div>
                    <p>or</p>
                    <div className='line'></div>
                </div>
                <span>Não possui uma conta? <a href='/signup/'>Crie uma!</a></span>
            </main>
        </>
    )
}