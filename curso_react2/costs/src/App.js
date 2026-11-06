import { BrowserRouter, Routes, Route } from "react-router-dom";

import Home from "./components/Pages/Home";
import Company from "./components/Pages/Company";
import Contact from "./components/Pages/Contact";
import NewProject from "./components/Pages/NewProject";
import Projects from "./components/Pages/Projects";
import Project from "./components/Pages/Project";

import Container from "./components/layout/Container";
import Navbar from "./components/layout/Navbar";
import Footer from "./components/layout/Footer";

function App() {
  return (
    <BrowserRouter>
      <Navbar />
      <Container customClass="min-height">
        <Routes>
          <Route path="/" element={<Home />} />

          <Route path="/Projects" element={<Projects />} />

          <Route path="/Company" element={<Company />} />

          <Route path="/Contact" element={<Contact />} />

          <Route path="/NewProject" element={<NewProject />} />

          <Route path="/Project/:id" element={<Project />} />
        </Routes>
      </Container>
      <Footer />
    </BrowserRouter>
  );
}

export default App;
