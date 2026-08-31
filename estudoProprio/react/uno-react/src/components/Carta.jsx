import styles from '../css/Carta.module.css'
export default function Carta({ verso }) {
    return (
        <>
            <section className={styles.carta}>
                <img src={verso ? 'https' : 'https://raw.githubusercontent.com/eperezcosano/Uno/master/public/images/uno.svg'} />
            </section>
        </>
    )
}