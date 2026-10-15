import { Bar, BarChart, CartesianGrid, Rectangle, Tooltip, XAxis, YAxis } from "recharts";

const data = [
  {
    name: 'Login de usuário',
    type: 'API',
    outcome: 'success',
    firstCycle: [0, 2.5],
    secondCycle: [4.0, 9.5],
  },
  {
    name: 'Cadastro',
    type: 'DB',
    outcome: 'success',
    firstCycle: [1.0, 4.0],
    secondCycle: [6.5, 12.0],
  },
  {
    name: 'Pagamento',
    type: 'API',
    outcome: 'error',
    firstCycle: [2.0, 5.5],
    secondCycle: [8.0, 13.5],
  },
  {
    name: 'Envio de e-mail',
    type: 'JOB',
    outcome: 'success',
    firstCycle: [3.5, 6.0],
    secondCycle: [9.0, 15.0],
  },
  {
    name: 'Relatório',
    type: 'DB',
    outcome: 'pending',
    firstCycle: [4.5, 7.0],
    secondCycle: [11.0, 17.5],
  },
  {
    name: 'Upload de arquivo',
    type: 'API',
    outcome: 'success',
    firstCycle: [5.0, 8.5],
    secondCycle: [12.0, 18.0],
  },
  {
    name: 'Backup',
    type: 'JOB',
    outcome: 'success',
    firstCycle: [6.0, 9.0],
    secondCycle: [13.5, 19.0],
  },
  {
    name: 'Sincronização',
    type: 'DB',
    outcome: 'pending',
    firstCycle: [7.5, 10.0],
    secondCycle: [15.0, 21.0],
  },
];

const getBarColor = (outcome) => {
  switch (outcome) {
    case 'success':
      return 'blue';
    case 'error':
      return 'red';
    default:
      return 'grey';
  }
};

const CustomFillRectangle = (props) => {
  const { outcome, isActive } = props;
  const barColor = getBarColor(outcome);
  return (
    <Rectangle {...props} stroke={isActive ? 'green' : barColor} strokeWidth={isActive ? 4 : 1} fill={barColor} />
  );
};

const Barra = (props) => {
     return <Bar {...props} stackId="a" radius={25} activeBar shape={CustomFillRectangle} />
}

export default function GraficoLinhaTempo() {
    return(
        <BarChart
      layout="vertical"
      style={{ width: '100%', maxWidth: '700px', maxHeight: '70vh', aspectRatio: 1.618 }}
      responsive
      data={data}
      margin={{ bottom: 20 }}
    >
      <CartesianGrid strokeDasharray="2 2" />
      <Tooltip shared={false} defaultIndex={1} />
      <XAxis type="number" height={50} label={{ value: 'Time (s)', position: 'insideBottomRight' }} />
      <YAxis
        type="category"
        dataKey="name"
        width="auto"
        label={{
          value: 'Test run',
          angle: -90,
          position: 'insideTopLeft',
          textAnchor: 'end',
        }}
      />
      <Barra dataKey="firstCycle" />
      <Barra dataKey="secondCycle" />
    </BarChart>
    )
}