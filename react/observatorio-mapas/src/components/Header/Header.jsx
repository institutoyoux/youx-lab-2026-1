import styles from './Header.module.css'

export default function Header() {
    return (
        <header className={styles.header}>
            <div className={styles.bolinha}></div>
            <div className={styles.dados}>
                <h1>Observatorio de Focos de Calor</h1>
                <p>Mato grosso - 1 a 15 de setembro de 2024</p>
            </div>
            <span>Dados didáticos - não são medições oficiais</span>
        </header>
    )
}