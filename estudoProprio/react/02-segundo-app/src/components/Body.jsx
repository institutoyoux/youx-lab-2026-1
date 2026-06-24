import {useState} from 'react'
import Number from './Numero'

export default function Body() {
    const [hora, setHora] = useState()
    setInterval(() => setHora(new Date().toLocaleTimeString()), 1000)
    return (
        <main>
            {hora}
            <Number />
        </main>
    )
}