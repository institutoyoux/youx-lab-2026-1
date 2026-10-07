import Header from "../components/Header";
import styles from "./Home.module.css";
import ProductList from "../components/ProductList";
import { useState } from "react";
import Options from "../form/Options";

export default function Home() {
  const [filter, setFilter] = useState(false);

  const modalFilter = () => {
    setFilter(!filter);
  };

  return (
    <div className={styles.Home}>
      <Header />
      {filter ? (
        <div>
          <div className={styles.filter}>
            <h3>
              Urban Sneakers - Encontre o modelo de tênis ideal para você.
            </h3>
          </div>
          <div className={styles.opcoes}>
            <Options />
            <box-icon
              name="check-square"
              onClick={() => setFilter(!filter)}
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
      <ProductList />
    </div>
  );
}
