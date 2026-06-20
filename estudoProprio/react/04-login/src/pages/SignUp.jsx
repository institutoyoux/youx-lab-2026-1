import './Auth.css';
import Header from '../components/Header.jsx';
import Input from '../components/Input.jsx';
import { useState } from 'react';
import axios from 'axios';

export default function SignUp() {
    const [emailValid, setEmailValid] = useState(false)
    const [passValid, setPassValid] = useState(false)
    const formValid = emailValid && passValid
    const [signupError, setSignupError] = useState(false)
    const teste = async (e) => {
        e.preventDefault()
        const res = await axios.post('https://pkaxumnblawdcytysltv.supabase.co/functions/v1/cadastrar', {
            email: e.target[0].value,
            pass: e.target[1].value
        })
        if (res.data.status === 'sucess') {
            setSignupError(false)
            window.location.href = '/login/'
        } else try {
            if (res.data.erro.code === "23505") {
                setSignupError('Erro: Este e-mail já está em uso!')
            }
        } catch {
            setSignupError(true)
        }
    }

    return (
        <>
            <Header />
            <main className='mainLogin'>
                <h1>Criar conta</h1>
                <p>Crie sua conta para ter acesso ao seu painel admin.</p>
                <form className='form' onSubmit={(e) => teste(e)} method="post">
                    <Input label='E-mail' placeholder="Seu endereço de e-mail" type="email" setEmailValid={setEmailValid} />
                    <Input label='Senha' placeholder="Sua senha" type="password" setPassValid={setPassValid} />
                    {!signupError ? null : <span className='error'><i className='bx bx-error-circle'></i> {signupError}</span>}
                    <button type="submit" disabled={!formValid}>Continuar</button>
                </form>
                <div className='or'>
                    <div className='line'></div>
                    <p>ou</p>
                    <div className='line'></div>
                </div>
                <span>Já tem uma conta? <a href="/login/">Faça login</a></span>
            </main>
        </>
    )
}
