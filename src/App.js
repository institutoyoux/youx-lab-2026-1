import { BrowserRouter as Router, Routes, Route, Link } from 'react-router-dom'

import Home from './components/pages/Home'
import Contato from './components/pages/Contato'
import Empresa from './components/pages/Empresa'
import Navbar from './components/layout/Navbar'


function App() {
  return (
    <Router> 
      <Navbar />
      <Routes>
        <Route path="/" element={<Home />} />
        <Route path="/empresa" element={<Empresa />} />
        <Route path="/contato" element={<Contato />} />
      </Routes>
      <Foozz
    </Router>
  )
}

export default App
