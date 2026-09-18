import styles from '../css/Me.module.css'
import Infos from './Infos'
import Carta from './Carta'

export default function Me({ me, click, vez}) {
    return (
        <>
            <section className={styles.me}>
                <Infos username={me.username} quant={me.cartas.length}/>
                <div>
                    {me.cartas.map((carta) => <Carta click={() => click(carta.id)} cor={carta.cor} numero={carta.numero} rotate={false} vez={vez} />)}
                </div>
            </section>
        </>
    )
}