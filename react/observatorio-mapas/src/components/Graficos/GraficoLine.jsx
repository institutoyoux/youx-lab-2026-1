import { Area, AreaChart, Tooltip, XAxis, YAxis } from 'recharts';

export default function GraficoLine({data, dataKey}) {
  return (
    <section>
      <AreaChart
      style={{ width: '100%', aspectRatio: 2.2/1, maxWidth: 600}}
      responsive
      data={data}
    >
      <defs>
        <linearGradient id="colorUv" x1="0" y1="0" x2="0" y2="1">
          <stop offset="5%" stopColor="red" stopOpacity={0.8} />
          <stop offset="95%" stopColor="red" stopOpacity={0} />
        </linearGradient>
      </defs>

      <Area
        dataKey={dataKey}
        stroke="red"
        fill="url(#colorUv)"
        fillOpacity={1} 
      />
      <XAxis />
      <YAxis />

      <Tooltip labelFormatter={(e) => data[e].data}/>
    </AreaChart>
    </section>
  );
}