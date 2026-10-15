import { Area, Bar, CartesianGrid, ComposedChart, Legend, Line, Scatter, Tooltip, XAxis, YAxis } from "recharts";
const data = [
  {
    name: 'Mercúrio',
    diametro: 650,
    gravidade: 720,
    duracaoAno: 850,
    velocidadeOrbital: 950,
  },
  {
    name: 'Vênus',
    diametro: 780,
    gravidade: 820,
    duracaoAno: 900,
    velocidadeOrbital: 880,
  },
  {
    name: 'Terra',
    diametro: 820,
    gravidade: 850,
    duracaoAno: 920,
    velocidadeOrbital: 800,
  },
  {
    name: 'Marte',
    diametro: 700,
    gravidade: 730,
    duracaoAno: 870,
    velocidadeOrbital: 760,
  },
  {
    name: 'Júpiter',
    diametro: 980,
    gravidade: 960,
    duracaoAno: 990,
    velocidadeOrbital: 680,
  },
  {
    name: 'Saturno',
    diametro: 950,
    gravidade: 840,
    duracaoAno: 970,
    velocidadeOrbital: 620,
  },
];

export default function GraficoLinhaBarraArea() {
    return (
        <ComposedChart
      style={{ width: '100%', maxWidth: '700px', maxHeight: '70vh', aspectRatio: 1.618 }}
      responsive
      data={data}
      margin={{
        top: 20,
        right: 0,
        bottom: 0,
        left: 0,
      }}
    >
      <CartesianGrid stroke="#e37474" />
      <XAxis dataKey="name" scale="band" />
      <YAxis width="auto" niceTicks="snap125" />
      <Tooltip />
      <Legend />
      <Area type="monotone" dataKey="duracaoAno" />
      <Bar dataKey="gravidade" barSize={30} />
      <Line fill="red" stroke="red" type="monotone" dataKey="diametro" />
      <Scatter fill="green" dataKey="velocidadeOrbital" />
    </ComposedChart>
    )
}