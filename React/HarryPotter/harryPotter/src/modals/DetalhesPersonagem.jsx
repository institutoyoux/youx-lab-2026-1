import { useEffect, useState } from "react";
import styles from "./DetalhesPersonagem.module.css";
import semFoto from "../img/semFoto.png";
import { GetPersonagem } from "../api/axiosApi";

export default function DetalhesPersonagem({ idPersonagem, setModal }) {
  const [personagem, setPersonagem] = useState();

  useEffect(() => {
    GetPersonagem(idPersonagem)
      .then((resp) => {
        setPersonagem(resp[0]);
      })
      .catch((err) => console.log(err));
  }, []);

  return (
    <>
      {personagem != null && (
        <div className={styles.modal} onClick={() => setModal(null)}>
          <div className={styles.caixa} onClick={(e) => e.stopPropagation()}>
            <div className={styles.image}>
              <img src={personagem.image ? personagem.image : semFoto}></img>
            </div>
            <div>
              <h2>{personagem.name}</h2>
              <p>
                Gender:{" "}
                {personagem.gender ? personagem.gender : "Não identificado"}
              </p>
              <p>
                Specie::{" "}
                {personagem.species ? personagem.species : "Não identificado"}
              </p>
              <p>
                House:{" "}
                {personagem.house ? personagem.house : "Não identificado"}
              </p>
              <p>
                Ancestry:{" "}
                {personagem.ancestry ? personagem.ancestry : "Não identificado"}
              </p>
              <p>
                Patronus:{" "}
                {personagem.patronus ? personagem.patronus : "Não identificado"}
              </p>
              <button onClick={() => setModal(null)}>Back</button>
            </div>
          </div>
        </div>
      )}
    </>
  );
}
