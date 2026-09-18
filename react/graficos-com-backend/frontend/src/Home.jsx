import { useEffect, useState } from "react";
import GraficoBarra from "./components/GraficoBarra";
import api, { obterResumo } from "./api/api";
import RadarGrafico from "./components/GraficoRadar";
import GraficoLine from "./components/GraficoLine";
import GraficoPizza from "./components/GraficoPizza";
export default function Home() {
    const [data, setData] = useState()
    const [dadosRadar, setRadar] = useState()
    const chamarApi = async () => {
        setData(await obterResumo("barras"))
        setRadar(await obterResumo("radar"))
    }
    useEffect(() => {
        chamarApi()
    }, [])
    const formatter = new Intl.NumberFormat('pt-BR', {minimumFractionDigits: 2, maximumFractionDigits: 2});
    return (
        <>
            <GraficoBarra formatter={formatter} data={data} />
            <RadarGrafico formatter={formatter} data={dadosRadar} />
            <GraficoLine formatter={formatter} data={data}/>
            <GraficoPizza data={data} />
        </>
    )
}