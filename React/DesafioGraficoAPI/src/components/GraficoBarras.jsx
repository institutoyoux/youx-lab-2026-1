import { Bar, BarChart, CartesianGrid, Legend, Tooltip, XAxis, YAxis } from "recharts";
import { useEffect, useState } from "react";
import carregando from "../img/carregando.svg"
import Get from "../api/apiAxios";

export default function GraficoBarras() {
     const [dados, setDados] = useState([]);
  const [loading, setLoading] = useState(true);

  useEffect(() => {
    Get(`metodosPesquisa`)
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
         <BarChart
      style={{ width: '100vw', maxWidth: '600px', maxHeight: '100vh', aspectRatio: 1.618 }}
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
      <XAxis dataKey="metodo" />
      <YAxis width="auto" />
      <Tooltip />
      <Legend />
      <Bar dataKey="quantidade" fill="green" radius={[10, 10, 0, 0]} />
      <Bar dataKey="percentual" fill="#4280fb" radius={[10, 10, 0, 0]} />
    </BarChart>
      )}
    </div>
  );
}