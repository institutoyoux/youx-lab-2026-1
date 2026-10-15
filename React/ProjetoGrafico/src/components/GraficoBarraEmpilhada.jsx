import { Bar, BarChart, CartesianGrid, Legend, Tooltip, XAxis, YAxis } from "recharts";

const data = [
  {
    name: 'Janeiro',
    vendas: 300,
    despesas: 610,
  },
  {
    name: 'Fevereiro',
    vendas: 300,
    despesas: 530,
  },
  {
    name: 'Março',
    vendas: 125,
    despesas: 450,
  },
  {
    name: 'Abril',
    vendas: 230,
    despesas: 690,
  },
  {
    name: 'Maio',
    vendas: 145,
    despesas: 780,
  },
  {
    name: 'Junho',
    vendas: 195,
    despesas: 675,
  },
];

export default function GraficoBarraEmpilhada() {
    return(
         <BarChart
      style={{ width: '100%', maxWidth: '700px', maxHeight: '70vh', aspectRatio: 1.618 }}
      responsive
      data={data}
      margin={{
        top: 20,
        right: 0,
        left: 0,
        bottom: 5,
      }}
    >
      <CartesianGrid />
      <XAxis dataKey="name" niceTicks="snap125" />
      <YAxis width="auto" niceTicks="snap125" />
      <Tooltip />
      <Legend />
      <Bar fill="#3179ff" dataKey="vendas" stackId="a" background />
      <Bar fill="#0b7e00" dataKey="despesas" stackId="a" background />
    </BarChart>
    )
}