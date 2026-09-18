import { Pie, PieChart } from 'recharts';

const data = [{ name: 'Group A', value: 400 },
{ name: 'Group B', value: 300 },
{ name: 'Group C', value: 300 },
{ name: 'Group D', value: 200 }]

export default function PieGrafico() {
    return (
        <>
            <PieChart style={{ width: '100%', maxWidth: '500px', maxHeight: '80vh', aspectRatio: 1 }} responsive>
                <Pie
                    data={data}
                    innerRadius="80%"
                    outerRadius="100%"
                    cornerRadius="50%"
                    paddingAngle={5}
                    dataKey="value"
                />
            </PieChart>
        </>
    )
}