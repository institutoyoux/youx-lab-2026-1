import { Link } from "react-router-dom";
import Container from "./Container";
import styles from "./NavBar.module.css";
import logo from "../img/costs_logo.png";
import { useState } from "react";

function NavBar() {
  const [navbar, setNavbar] = useState(false);

  return (
    <nav className={styles.navbar}>
      <Container>
        <div className={styles.divMenu}>
          <img
            className={styles.logoMobile}
            onClick={() => setNavbar(!navbar)}
            src={logo}
            alt="Costs"
          />
          {navbar && (
            <>
              <ul onClick={() => setNavbar(false)} className={styles.listNavbar}>
                <li className={styles.item}>
                  <Link to="/">Home</Link>
                </li>
                <li className={styles.item}>
                  <Link to="/projects">Projetos</Link>
                </li>
                <li className={styles.item}>
                  <Link to="/company">Empresa</Link>
                </li>
                <li className={styles.item}>
                  <Link to="/contact">Contato</Link>
                </li>
              </ul>
            </>
          )}
        </div>
        <Link to="/">
          <img className={styles.logo} src={logo} alt="Costs" />
        </Link>
        <ul className={styles.list}>
          <li className={styles.item}>
            <Link to="/">Home</Link>
          </li>
          <li className={styles.item}>
            <Link to="/projects">Projetos</Link>
          </li>
          <li className={styles.item}>
            <Link to="/company">Empresa</Link>
          </li>
          <li className={styles.item}>
            <Link to="/contact">Contato</Link>
          </li>
        </ul>
      </Container>
    </nav>
  );
}

export default NavBar;
