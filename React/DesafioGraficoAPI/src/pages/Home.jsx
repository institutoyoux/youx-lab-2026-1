import GraficoBarras from "../components/GraficoBarras";
import GraficoLinha from "../components/GraficoLinha";
import styles from "./Home.module.css";

export default function Home() {
  return (
    <div className={styles.home}>
      <h1>Painel de Pesquisas e Satisfação</h1>
      <p>
        Acompanhe os principais indicadores das pesquisas realizadas, visualize
        a evolução mensal das respostas e analise os níveis de satisfação dos
        participantes. Explore também os métodos de pesquisa utilizados, como
        questionários, entrevistas e observação, para compreender melhor os
        dados e identificar oportunidades de melhoria.
      </p>
      <p>
        Com gráficos interativos e informações organizadas, este painel facilita
        a análise dos resultados e apoia a tomada de decisões com base nos
        dados.
      </p>
      <div className={styles.graficos}>
        <GraficoLinha />
        <GraficoBarras />
      </div>
    </div>
  );
}
