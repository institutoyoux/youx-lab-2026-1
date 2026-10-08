import Header from "../components/Header";
import styles from "./Home.module.css";
import ProductList from "../components/ProductList";
import { useState } from "react";
import Options from "../form/Options";

export default function Home() {
  const [filter, setFilter] = useState(false);

  const [sneakersPesquisados, setSneakersPesquisados] = useState([]);

  const [sneakers, setSneakers] = useState([]);
  const [categoria, setCategoria] = useState();
  const [valor, setValor] = useState(4);

  const modalFilter = () => {
    setFilter(!filter);
  };

  

  const verValor = (valor, price) => {
    const validacoes = [
      100 <= price && price <= 200,
      200 <= price && price <= 300,
      300 <= price && price <= 500,
      price >= 500,
      true
    ];
    return validacoes[valor];
  };
  const filtrar = (e) => {
    setFilter(!filter);

    setSneakersPesquisados(
      sneakers.filter(
        (tenis) => categoria != undefined ? tenis.category === categoria && verValor(valor, tenis.price) : verValor(valor, tenis.price) ,
      ),
    );
    setCategoria(undefined)
    setValor(4)
  };


  return (
    <div className={styles.Home}>
      <Header
        sneakers={sneakers}
        setSneakersPesquisados={setSneakersPesquisados}
      />
      {filter ? (
        <div>
          <div className={styles.filter}>
            <h3>
              Urban Sneakers - Encontre o modelo de tênis ideal para você.
            </h3>
          </div>
          <div className={styles.opcoes}>
            <Options setCategoria={setCategoria} setValor={setValor} />
            <box-icon
              name="check-square"
              onClick={filtrar}
              type="regular"
            ></box-icon>
          </div>
        </div>
      ) : (
        <div className={styles.filter}>
          <h3>Urban Sneakers - Encontre o modelo de tênis ideal para você.</h3>
          <box-icon onClick={modalFilter} name="filter-alt"></box-icon>
        </div>
      )}
      <ProductList
        sneakers={sneakers}
        setSneakers={setSneakers}
        setSneakersPesquisados={setSneakersPesquisados}
        sneakersPesquisados={sneakersPesquisados}
      />
    </div>
  );
}
