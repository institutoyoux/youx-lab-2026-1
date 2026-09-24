import styles from "../assets/pages/Personagens.module.css";
import semFoto from "../img/semFoto.png";

export default function Personagem({ personagem, setModal }) {
  return (
    <div className={styles.personagem}>
      <div className={styles.image}>
        <img src={personagem.image ? personagem.image : semFoto} />
      </div>
      <p>{personagem.name}</p>
      <button onClick={() => setModal(personagem)}>More information</button>
    </div>
  );
}
