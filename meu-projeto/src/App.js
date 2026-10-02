import { BrowserRouter as Router, Route, Routes} from "react-router-dom";
import Home from "./components/pages/Home";
import Empresa from "./components/pages/Empresa";
import Contato from "./components/pages/Contato";
import Navbar from "./components/layout/Navbar";
import Footer from "./components/layout/Footer";

function App() {
 
 return (
  <Router>
    <Navbar />
    <Routes >
      <Route element={<Home />} path="/" />
      <Route element={<Empresa />} path="/empresa" />
      <Route element={<Contato />} path="/contato" />
    </Routes>
    <Footer />
  </Router>
  );
}

export default App;
