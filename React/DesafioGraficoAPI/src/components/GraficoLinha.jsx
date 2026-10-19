import { useEffect, useState } from "react";
import carregando from "../img/carregando.svg";
import { CartesianGrid, Legend, Line, LineChart, Tooltip, XAxis, YAxis } from "recharts";
import Get from "../api/apiAxios";

export default function GraficoLinha() {
  const [dados, setDados] = useState([]);
  const [loading, setLoading] = useState(true);

  useEffect(() => {
    Get(`pesquisasMensais`)
      .then((data) => {
        setDados(data);
        setLoading(false);
      })
      .catch((err) => console.log(err));
  }, []);

  return (
    <div>
      {loading ? (
        <>
          <img src={carregando} />
        </>
      ) : (
        <LineChart
          style={{
            width: "100vw",
            maxWidth: "600px",
            height: "100vh",
            maxHeight: "70vh",
            aspectRatio: 1.618,
          }}
          responsive
          data={dados}
          margin={{
            top: 5,
            right: 0,
            left: 0,
            bottom: 5,
          }}
        >
          <CartesianGrid />
          <XAxis dataKey="mes" />
          <YAxis width="auto" />
          <Tooltip />
          <Legend />
          <Line type={"monotone"} stroke="green" dataKey="respostas" />
          <Line type={"monotone"} dataKey="satisfacao" />
        </LineChart>
      )}
    </div>
  );
}
