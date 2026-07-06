import { useState } from 'react'
import sim from './assets/posso.png'
import nao from './assets/nao.png'
import './App.css'

function App() {
  const [posso, setPosso] = useState(false)
  return (
    <>
    <img style={{height:'10rem', width:'10rem', margin: '0 auto'}} src={posso ? nao : sim}/>
    <button onClick={() => setPosso(!posso)}>Me permite falar?</button>
    </>
  )
}

export default App