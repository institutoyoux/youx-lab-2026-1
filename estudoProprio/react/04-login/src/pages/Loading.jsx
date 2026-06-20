import Logo from '../assets/img/logo.png'
import './Loading.css'

export default function loading() {
    return (
        <>
            <div className="loading">
                <img src={Logo} />
            </div>
        </>
    )
}