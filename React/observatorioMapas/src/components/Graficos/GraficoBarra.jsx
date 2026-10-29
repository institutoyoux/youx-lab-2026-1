import { BarChart, Bar, Tooltip, Legend, Cell, XAxis, YAxis } from 'recharts';
import { corEnum } from '../../utils/enums';


export default function GraficoBarra({ data, layout }) {
    return (
        <>
            <BarChart
                style={{ width: '100%', maxWidth: '700px', aspectRatio: 2.2 / 1 }}
                responsive
                data={data}
                layout={layout}
                margin={{
                    top: 5,
                    right: 0,
                    left: 0,
                    bottom: 5,
                }}
            >
                <Tooltip labelFormatter={(e) => data[e].nome} />
                <Bar dataKey="focos" radius={[10, 10, 0, 0]}>
                    {data.map((cell, index) => (
                        <Cell key={`cell-${index}`} fill={corEnum[cell.nome]} />
                    ))}
                </Bar>
                {layout !== 'vertical' && <XAxis tickFormatter={(e) => data[e]?.nome} />}
                <YAxis />
            </BarChart>
        </>
    )
}