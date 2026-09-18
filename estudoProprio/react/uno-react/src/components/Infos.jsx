import styles from '../css/Infos.module.css'


export default function Infos({username, quant}) {
    return (
        <>
        <div className={styles.primeirasInfos}><span className={styles.username}>{username} </span> <span className={styles.quantidade}>{quant}</span></div>
        </>
    )
}