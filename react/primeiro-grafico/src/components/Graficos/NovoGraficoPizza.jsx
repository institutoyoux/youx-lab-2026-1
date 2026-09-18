import { Pie, PieChart } from "recharts";
const data = [
  { name: 'Group A', value: 400 },
  { name: 'Group B', value: 300 },
  { name: 'Group C', value: 300 },
  { name: 'Group D', value: 200 },
];
export default function NovoGraficoPizza() {
    return (
        <>
            <PieChart style={{ width: '100%', maxWidth: '500px', maxHeight: '80vh', aspectRatio: 1 }} responsive>
                <Pie
        data={data}
        labelLine={false}
        dataKey="value"
      />
            </PieChart>
        </>
    )
}