import { useEffect, useState } from "react";
import Graficos from "../components/Graficos/Graficos";
import Header from "../components/Header/Header";
import Mapa from "../components/Mapa/Mapa";
import SideBar from "../components/SideBar/SideBar";
import styles from './Home.module.css'
import { obterFocos, obterMunicipios } from "../utils/api";

export default function Home() {
    const [focos, setFocos] = useState([])
    const [municipiosArray, setMunicipiosArray] = useState()
    useEffect(() => {
        obterFocos()
            .then(resp => {
                setFocos(resp)
            })
            .catch(erro => console.error(erro));
        obterMunicipios()
            .then(data => setMunicipiosArray(data))
            .catch(erro => console.error(erro))
    }, [])
    const [filtros, setFiltros] = useState({
        bioma: 'all',
        municipio: 'all',
        satelite: 'all',
        risco: 'all',
        inicio: '2024-09-01',
        fim: '2024-09-15'
    })
    const verificacoes = (foco) => {
        const dataFoco = new Date(foco.properties.data_hora)
        return (
            (foco.properties.bioma === filtros.bioma || filtros.bioma === 'all') &&
            (foco.properties.municipio === filtros.municipio || filtros.municipio === 'all') &&
            (foco.properties.satelite === filtros.satelite || filtros.satelite === 'all') &&
            (foco.properties.risco === filtros.risco || filtros.risco === 'all') &&
            (dataFoco >= new Date(filtros.inicio)) &&
            (dataFoco <= new Date(filtros.fim))
        )
    }
    const obterMun = (municipio) => {
        const mun = municipiosArray.find(mun => mun.nome === municipio)
        return [mun.latitude, mun.longitude]
    }
    const focosAgora = focos.filter(verificacoes)
    const biomas = [...new Set(focos.map(foco => (foco.properties.bioma)))]
    const municipios = [...new Set(focos.map(foco => (foco.properties.municipio)))]
    const satelites = [...new Set(focos.map(foco => (foco.properties.satelite)))]
    const riscos = [...new Set(focos.map(foco => (foco.properties.risco)))]
    return (
        <>
            <Header />
            <main className={styles.main}>
                <SideBar biomas={biomas} municipios={municipios} filtros={filtros} satelites={satelites} riscos={riscos} setFiltros={setFiltros} />
                <Mapa center={filtros.municipio != 'all' ? obterMun(filtros.municipio) : [-13.30793, -56.04147]} focos={focosAgora} municipios={municipiosArray} />
                <Graficos focos={focosAgora} />
            </main>
        </>
    )
}