import { CartesianGrid, Legend, Line, LineChart, Tooltip, XAxis, YAxis } from "recharts";
const data = [
  {
    mes: "Janeiro",
    vendas: 400,
    visitas: 2400,
    faturamento: 2400,
  },
  {
    mes: "Fevereiro",
    vendas: 300,
    visitas: 4567,
    faturamento: 2800,
  },
  {
    mes: "Março",
    vendas: 520,
    visitas: 1398,
    faturamento: 3200,
  },
  {
    mes: "Abril",
    vendas: 700,
    visitas: 9800,
    faturamento: 4100,
  },
  {
    mes: "Maio",
    vendas: 480,
    visitas: 3908,
    faturamento: 3500,
  },
  {
    mes: "Junho",
    vendas: 650,
    visitas: 4800,
    faturamento: 4500,
  },
];
export default function GraficoLinha() {
  return (
    <LineChart

      style={{ width: "100%", aspectRatio: 1.618, maxWidth: 600 }}
      responsive
      data={data}
    >
      <CartesianGrid strokeDasharray="5 5" />
      <Line type="monotone" stroke="blue" dataKey="vendas" fill="bluepurple" />
      <Line type="monotone" stroke="green" dataKey="faturamento" fill="green" />
      <Line type="monotone" stroke="red" dataKey="visitas" fill="red" />
      <XAxis dataKey="mes" />
      <YAxis />
      <Legend /> 
      <Tooltip contentStyle={{backgroundColor: 'rgba(255, 255, 255, 0.15)', backdropFilter: 'blur(8px)'}} />

    </LineChart>
  );
}
