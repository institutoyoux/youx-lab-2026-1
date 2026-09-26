import { useEffect, useState } from 'react'
import styles from '../css/AddModal.module.css'
import { enviarDados, obterUsers } from '../../api/api'
export default function AddModal({ setModal }) {
    const [usuario, setUsuario] = useState({
        nome: '',
        username: '',
        foto: null,
        comprovante: null
    })
    const close = () => {
        setModal(atual => false)
    }
    const adicionar = (e) => {
        e.preventDefault()
        const formData = new FormData()

        formData.append('nome', usuario.nome)
        formData.append('username', usuario.username)
        formData.append('foto', usuario.foto)
        formData.append('comprovante', usuario.comprovante)
        enviarDados(formData)
        .then(data => {
            setModal(false)
        })
        .catch(erro => console.error(erro))
    }
    return (
        <>
            <div className={styles.back} onClick={close}></div>
            <div className={styles.modal}>
                <div className={styles.title}>
                    <span>Adicionar</span>
                    <i onClick={close} className="bx bx-x"></i>
                </div>
                <form onSubmit={adicionar}>
                    <input type="text" placeholder='Nome' value={usuario.nome} onChange={(e) => setUsuario(atual => ({ ...atual, nome: e.target.value }))} />
                    <input type="text" placeholder='Username' value={usuario.username} onChange={(e) => setUsuario(atual => ({ ...atual, username: e.target.value }))} />
                    <input type="file" onChange={(e) => setUsuario(atual => ({ ...atual, foto: e.target.files[0] }))} />
                    <input type="file" onChange={(e) => setUsuario(atual => ({ ...atual, comprovante: e.target.files[0] }))} />
                    <button>k</button>
                </form>
            </div>
        </>
    )
}