import { BarChart, Bar, Tooltip, Legend } from 'recharts';

import styles from '../css/GraficoBarra.module.css'
export default function GraficoBarra({data, formatter}) {
    return (
        <section className={styles.section}>
            <BarChart style={{ width: '100%', maxWidth: '700px', maxHeight: '70vh', aspectRatio: 1.618 }}
                responsive
                data={data}
                margin={{
                    top: 5,
                    right: 0,
                    left: 0,
                    bottom: 5,
                }} >
                <Tooltip 
                itemStyle={{color: '#000'}} 
                contentStyle={{ backgroundColor: 'rgba(255, 255, 255, 0.3)', backdropFilter: 'blur(10px)', border: '1px solid #777', borderRadius: '0.5rem', color: '#000'}} 
                labelFormatter={(value) => data[value].data.split("-").reverse().join("/")}
                formatter={(value) => formatter.format(value)}  />
                <Legend />
                <Bar dataKey="ganhos" radius={[10, 10, 0, 0]} />
                <Bar dataKey="perdas" radius={[10, 10, 0, 0]} fill='red' />
            </BarChart>
        </section>
    )
}