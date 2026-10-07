import logo from "../assets/logo.png";
import "boxicons";
import styles from "./Header.module.css";
import { useState } from "react";

export default function Header() {
  const [caixaPesquisar, setCaixaPesquisar] = useState(false);

  const modal = () => {
    setCaixaPesquisar(!caixaPesquisar);
  };

  return (
    <div className={styles.header}>
      <img src={logo} alt="Urban Sneakers" />
      <h3 className={styles.title}>Urban Sneakers</h3>
      <div className={styles.filtros}>
        <a>Masculino</a>
        <a>Feminino</a>
        <a>Infantil</a>
        <a>Lançamentos</a>
        <a>Promoções</a>
      </div>
      {caixaPesquisar ? (
        <div className={styles.modalCaixaPesquisar}>
          <div>
            <box-icon onClick={modal} name="arrow-back"></box-icon>
            <input
              className={styles.modalPesquisar}
              type="text"
              placeholder="Buscar"
            />{" "}
          </div>
        </div>
      ) : (
        <box-icon
          className={styles.iconeSearch}
          onClick={modal}
          name="search-alt"
        ></box-icon>
      )}
      <div className={styles.caixaAcoes}>
        <input className={styles.pesquisar} type="text" placeholder="Buscar" />
        <box-icon type="solid" name="cart"></box-icon>
      </div>
    </div>
  );
}
