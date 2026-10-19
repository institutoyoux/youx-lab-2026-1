import styles from '../css/Carta.module.css'
export default function Carta({ verso }) {
    return (
        <>
            <section className={styles.carta}>
                <img src={verso ? 'https://raw.githubusercontent.com/eperezcosano/Uno/master/public/images/uno.svg' : 'https://cdn.jsdelivr.net/gh/john-costanzo/uno-card-images@master/Green_8.png'} />
            </section>
        </>
    )
}