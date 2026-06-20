import Logo from '../assets/img/logo.png'
import './Header.css'
export default function Header() {
    return (
        <header className="header">
            <img src={Logo} alt="logo" />
        </header>
    )
}