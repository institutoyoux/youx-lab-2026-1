import {
  PolarAngleAxis,
  PolarGrid,
  PolarRadiusAxis,
  Radar,
  RadarChart,
  Tooltip,
} from "recharts";

const data = [
  { materia: "Tecnologia", nota: 95 },
  { materia: "Design", nota: 82 },
  { materia: "Marketing", nota: 76 },
  { materia: "Finanças", nota: 88 },
  { materia: "Inovação", nota: 91 },
  { materia: "Gestão", nota: 69 },
];

export default function GraficoRadar() {
  return (
    <RadarChart
      style={{
        width: "100%",
        height: "100%",
        maxWidth: "600px",
        maxHeight: "80vh",
        aspectRatio: 1,
      }}
      responsive
      data={data}
    >
      <PolarGrid />
      <PolarAngleAxis dataKey="materia" />
      <PolarRadiusAxis />
      <Radar label={{fill: "black", fontSize: "larger"}} stroke="blue" fill="rgb(59, 112, 182)" name="Média" dataKey="nota" />
      <Tooltip />
    </RadarChart>
  );
}
