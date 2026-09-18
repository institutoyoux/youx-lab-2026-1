import { BarChart, Bar, XAxis, YAxis, CartesianGrid, Tooltip, Legend } from 'recharts';

import { data } from './data';

export default function BarGrafico() {
    return (
        <>
            <BarChart
                style={{ width: '100%', maxWidth: '700px', maxHeight: '70vh', aspectRatio: 1.618 }}
                responsive
                data={data}
                margin={{
                    top: 5,
                    right: 0,
                    left: 0,
                    bottom: 5,
                }}
            >
                <Tooltip />
                <Legend />
                <Bar dataKey="uv" radius={[10, 10, 0, 0]} />
                <Bar dataKey="pv" radius={[10, 10, 0, 0]} fill='red' />
            </BarChart>
        </>
    )
}