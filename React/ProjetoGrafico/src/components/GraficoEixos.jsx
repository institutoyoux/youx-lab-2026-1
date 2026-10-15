import { Line, LineChart, Tooltip, XAxis } from "recharts";

const data = [
  {
    name: 'Brasil',
    populacao: 4200,
    pib: 3500,
    areaTerritorial: 2800,
  },
  {
    name: 'Japão',
    populacao: 3100,
    pib: 2800,
    areaTerritorial: 2200,
  },
  {
    name: 'Índia',
    populacao: 9800,
    pib: 8500,
    areaTerritorial: 4200,
  },
  {
    name: 'Alemanha',
    populacao: 2600,
    pib: 3200,
    areaTerritorial: 1900,
  },
  {
    name: 'Estados Unidos',
    populacao: 7600,
    pib: 6800,
    areaTerritorial: 3900,
  },
  {
    name: 'Portugal',
    populacao: 1800,
    pib: 1500,
    areaTerritorial: 1200,
  },
  {
    name: 'China',
    populacao: 9400,
    pib: 9000,
    areaTerritorial: 4500,
  },
];

export default function GraficoEixos() {
    return(
         <LineChart
      style={{ width: '100%', maxWidth: '700px', maxHeight: '70vh', aspectRatio: 1.618 }}
      responsive
      data={data}
    >
      <XAxis dataKey="name" xAxisId="a" orientation="top" height={40} />
      <XAxis mirror dataKey="populacao" xAxisId="b" height={50} />
      <XAxis dataKey="pib" type="number" xAxisId="c" height={60} />
      <XAxis mirror dataKey="areaTerritorial" type="number" orientation="top" xAxisId="d" height={20} />
      <Tooltip defaultIndex={2} axisId="a" />
      <Line stroke="red" dataKey="populacao" xAxisId="b" />
      <Line stroke="green" dataKey="pib" xAxisId="c" />
      <Line stroke="blue" dataKey="areaTerritorial" xAxisId="d" />
    </LineChart>
    )
}