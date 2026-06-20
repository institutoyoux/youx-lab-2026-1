import { useState } from 'react'
import './App.css'
import Header from './components/Header.jsx'
import Input from './components/Input.jsx'
import SignUp from './pages/SignUp.jsx'
import Login from './pages/Login.jsx'
import Home from './pages/Home.jsx'
import { BrowserRouter as Router, Routes, Route } from 'react-router-dom';

function App() {

  return (
    <>
      <Router>
        <Routes>
          <Route path='/' element={<Home />} />
          <Route path="/signup" element={<SignUp />} />
          <Route path="/login" element={<Login />} />
        </Routes>
      </Router>
    </>
  )
}

export default App
