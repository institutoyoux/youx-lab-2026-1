import styles from "./Frase.module.css"

function Frases(){
    return(
        <div className={styles.fraseContainer}>
            <p className={styles.fraseContent}>Esté e o componente com uma frase</p>
        </div>
    )
}

export default Frases