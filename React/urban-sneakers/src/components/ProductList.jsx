import styles from "./ProductList.module.css"
import { useEffect, useState } from "react";
import Loading from "../assets/Loading.svg"
import { Get } from "../services/api";
import ProductCard from "./ProductCard";

export default function ProductList() {
  const [sneakers, setSneakers] = useState([]);
  const [loading, setLoading] = useState(true);

  useEffect(() => {
    Get()
      .then((data) => {
        setSneakers(data);
        setLoading(false);
      })
      .catch((err) => console.log(err));
  }, []);

  return (
    <>
      <div className={styles.produtos}>
        {loading ? (
          <img className={styles.loading} src={Loading} />
        ) : (
          sneakers.map((tenis) => <ProductCard key={tenis.id} tenis={tenis} />)
        )}
      </div>
    </>
  );
}
