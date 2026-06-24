import {useState} from 'react'
export default function Number() {
    const [num, setNum] = useState(10)

    let num1=10

    return (
        <p>
            <p>{num}</p>
            <button onClick={() => setNum(num + 100)}>Mudar</button>
        </p>
    )
}