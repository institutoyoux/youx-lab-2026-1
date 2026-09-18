import { Pie, PieChart, Tooltip } from "recharts";
export default function GraficoPizza({data}) {
    return (
        <section>
            <PieChart style={{ width: '100%', maxWidth: '500px', maxHeight: '80vh', aspectRatio: 1 }} responsive>
                <Pie
        data={data}
        labelLine={false}
        dataKey="perdas"
        fill="red"
      />
      <Tooltip />
            </PieChart>
        </section>
    )
}