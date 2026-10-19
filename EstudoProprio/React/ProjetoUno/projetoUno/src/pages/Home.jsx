import Carta from "../components/Carta";
import styles from "../css/Home.module.css";
export default function Home() {
  return (
    <>
      <section className={styles.cartasOponente}>
        <Carta verso={true} />
        <Carta verso={true} />
        <Carta verso={true} />
        <Carta verso={true} />
      </section>
      <section className={styles.mesa}>
        <div class={styles.baralho}>
            <Carta verso={true}/>
            <Carta verso={true}/>
            <Carta verso={true}/>
            <Carta verso={true}/>
            <Carta verso={true}/>
            <Carta verso={true}/>
            <Carta verso={true}/>
            <Carta verso={true}/>
        </div>
        <div class={styles.cartasMesa}>
          <Carta verso={false} />
        </div>
        <div class={styles.botoes}>
            <button>Cor</button>
            <button>Escolher Cor</button>
        </div>
      </section>
      <section className={styles.cartasJogador}>
        <Carta verso={false} />
        <Carta verso={false} />
        <Carta verso={false} />
        <Carta verso={false} />
        <Carta verso={false} />
        <Carta verso={false} />
        <Carta verso={false} />
      </section>
    </>
  );
}
