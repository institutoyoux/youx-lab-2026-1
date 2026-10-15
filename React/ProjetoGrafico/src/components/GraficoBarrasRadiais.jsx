import { Legend, RadialBar, RadialBarChart, Tooltip } from "recharts";
const data = [
  { name: "Índia", uv: 1463.9 },
  { name: "China", uv: 1416.1 },
  { name: "Estados Unidos", uv: 347.3 },
  { name: "Indonésia", uv: 285.7 },
  { name: "Paquistão", uv: 255.2 },
  { name: "Nigéria", uv: 237.5 },
  { name: "Brasil", uv: 212.8 },
];

export default function GraficoBarrasRadiais() {
  return (
    <RadialBarChart
      style={{
        width: "100%",
        maxWidth: "700px",
        maxHeight: "80vh",
        aspectRatio: 1.618,
      }}
      responsive
      cx="30%"
      barSize={18}
      data={data}
      
    >
      <RadialBar label={{ position: "insideStart", fill: "white", fontSize: "medium"  }} stroke="red" background dataKey="uv"/>
      <Legend iconSize={10} position="right" />
      <Tooltip contentStyle={{backgroundColor: 'rgba(255, 255, 255, 0.15)', backdropFilter: 'blur(8px)'}} />
    </RadialBarChart>
  );
}
