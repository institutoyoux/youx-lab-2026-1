import styles from '../css/Carta.module.css'
export default function Carta({ verso, cor, numero, click }) {
    const enumCartas = {
        verde: "Green",
        amarelo: "Yellow",
        vermelho: "Red",
        azul: "Blue"
    }
    return (
        <>
            <section onClick={click} className={styles.carta}>
                <img src={verso ? 'https://raw.githubusercontent.com/eperezcosano/Uno/master/public/images/uno.svg' : `https://cdn.jsdelivr.net/gh/john-costanzo/uno-card-images@master/${enumCartas[cor]}_${numero}.png`} />
            </section>
        </>
    )
}