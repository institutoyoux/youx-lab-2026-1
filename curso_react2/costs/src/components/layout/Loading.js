import loading from '../../img/loading.svg'

import styles from './Loading.module.css'

function Loading() {
    return (
        <div className={styles.louder_container}>
            <img className={styles.louder} src={loading} alt="Loading"/>
        </div>
    )
}

export default Loading