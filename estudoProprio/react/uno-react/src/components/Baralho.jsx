import Carta from "./Carta";
import styles from '../css/Baralho.module.css'


export default function Baralho({ baralho, click }) {
    return (
        <>
            <div className={styles.baralho} onClick={click}>
                {baralho.map(carta => <Carta numero={0} cor={"vermelho"} verso={true}/>)}
            </div>
        </>
            
    )
}