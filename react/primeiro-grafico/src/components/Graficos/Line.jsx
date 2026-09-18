import { Area, AreaChart, Tooltip } from 'recharts';
import { data } from './data';

export default function Line() {
  return (
    <AreaChart
      style={{ width: '100%', aspectRatio: 1, maxWidth: 600 }}
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
        dataKey="pv"
        type="monotone"
        stroke="red"
        fill="url(#colorUv)"
        fillOpacity={1}
      />

      <Area
        dataKey="uv"
        type="monotone"
        stroke="red"
        fill="url(#colorUv)"
        fillOpacity={1}
      />

      <Tooltip />
    </AreaChart>
  );
}