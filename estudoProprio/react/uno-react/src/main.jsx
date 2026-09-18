import { StrictMode } from 'react';
import { createRoot } from 'react-dom/client';
import { Route, BrowserRouter as Router, Routes } from 'react-router-dom';
import './index.css';
import App from './pages/App';
import Login from './pages/Login';

createRoot(document.getElementById('root')).render(
  <StrictMode>
    <Router>
      <Routes>
        <Route path="/" element={<App />} />
        <Route path='/login' element={<Login />}/>
      </Routes>
    </Router>
  </StrictMode>,
)
