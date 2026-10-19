import styles from "./Pesquisar.module.css";

export default function Pesuisar({ handleChange, valor }) {
  return (
    <div>
      <input
        id="inputPesquisar"
        className={styles.pesquisarInput}
        onChange={handleChange}
        value={valor}
        type="text"
        placeholder="Enter the character's name"
      />
    </div>
  );
}
