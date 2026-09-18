import styles from '../css/Jogador.module.css'
import Carta from './Carta'
import Infos from './Infos'


export default function Jogador({ jogador }) {
    return (
        <>
            <section className={styles.jogador}>
                <Infos username={jogador.username} quant={jogador.cartas.length}/>
                <section className={styles.cartas}>
                    {jogador.cartas.map((carta, index) => <Carta numero={carta.numero} cor={carta.cor} verso={true} />)}
                </section>
            </section>
        </>
    )
}