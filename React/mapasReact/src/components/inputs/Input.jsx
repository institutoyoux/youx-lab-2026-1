import styles from './Input.module.css'

export default function InputLabel({label, type, className, value, onChange}) {
    const estilo = className ? `${styles.input} ${className}` : styles.input
    return (
        <div className={estilo}>
            <label>{label}</label>
            <input type={type} value={value} onChange={onChange}/>
        </div>
    )
}