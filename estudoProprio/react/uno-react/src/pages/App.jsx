import Home from './Home'
import SalaModal from './SalaModal'
export default function App() {
    !localStorage.getItem("token") && navigation.navigate("/login")
    const code = window.location.search.replace("?sala=", "")
    return (
        <>
            {code != '' ? <Home /> : <SalaModal />}
        </>
    )
}