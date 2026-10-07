import { Rating } from "@mui/material"
import styles from "./ProductCard.module.css"

export default function ProductCard({tenis}) {
    const valor = tenis.price.toLocaleString('pt-BR', {
        style: 'currency',
        currency: 'BRL'
    })
    return(
        <div className={styles.ProductCard}>
            <div className={styles.divImagem}>
                <img src={tenis.image} />
            </div>
            <p>{tenis.name}</p>
            <p>Categoria do tênis: {tenis.category}</p>
            <p>Cor: {tenis.color}</p>
            <p>{valor.toLocaleString('pt-br')}</p>
            <Rating name="half-rating-read" defaultValue={tenis.rating} precision={0.5} readOnly/>

        </div>
    )
}