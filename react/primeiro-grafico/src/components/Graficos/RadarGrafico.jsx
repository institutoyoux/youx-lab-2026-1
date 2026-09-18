import { Radar, RadarChart, Tooltip, PolarGrid, PolarAngleAxis, PolarRadiusAxis } from 'recharts';

const data = [
    { subject: 'Taxa hs', A: 100 },
    { subject: 'Taxa am', A: 20 },
    { subject: 'Taxa booyah', A: 50 },
    { subject: 'Taxa assist', A: 70 },

];
export default function RadarGrafico() {

    return (
        <>
            <RadarChart style={{ width: '100%', height: '100%', maxWidth: '500px', maxHeight: '80vh', aspectRatio: 1 }}
                responsive
                data={data}>
                <PolarGrid stroke='#ff0000' fill='#00ff00' />
                <PolarAngleAxis dataKey="subject" />
                <PolarRadiusAxis />
                <Radar name='teste' dataKey="A" fill='#0000ff' />

                <Tooltip />
            </RadarChart>
        </>
    )
}