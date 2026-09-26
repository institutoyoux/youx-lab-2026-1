import { useEffect, useState } from 'react'
import Button from '../components/Button'
import Back from '../images/back.png'
import styles from './css/Home.module.css'
import AddModal from '../components/modals/AddModal'
import { obterUsers } from '../api/api'
import Loading from '../components/Loading'

export default function Home() {
    const [modal, setModal] = useState(false)
    const [users, setUsers] = useState([])
    const [loading, setLoading] = useState(true)

    useEffect(() => {
        obterUsers()
        .then(response => {
            setUsers(response)
            setLoading(false)
        })
        .catch(erro => console.error(erro))
    }, [])
    const download = (url) => {
        window.location.href = url
    }
    return (
        <>
            {loading ? (<Loading />) : (<> <img src={Back} className="back" />
                <main>
                    <div className={styles.title}><h1>Usuários</h1><Button onClick={() => setModal(!modal)}><i className="bx bx-plus"></i>Adicionar</Button></div>
                    <section className={styles.users}>
                        {users.length > 0 && users.map(user =>
                            <div key={user.username} className={styles.user}>
                                <div className={styles.userFoto}><img src={user.fotoUrl} /></div>
                                <div className={styles.dados}>
                                    <span>{user.nome}</span>
                                    <span>{user.username}</span>
                                </div>
                                <Button className='submit' onClick={() => download(user.docUrl)}><i className="bx bx-download"></i></Button>
                            </div>
                        )}
                    </section>
                </main>
                {modal && <AddModal setModal={setModal} />}</>)}
        </>
    )
}