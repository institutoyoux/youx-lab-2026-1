import Bar from "../components/Graficos/RadarGrafico";
import Line from "../components/Graficos/Line";
import PieGrafico from "../components/Graficos/PieGrafico";
import BarGrafico from "../components/Graficos/BarGrafico";
import NovoGraficoPizza from "../components/Graficos/NovoGraficoPizza";

export default function Graficos() {
    return (
        <>
        <Line />
        <Bar />
        <PieGrafico />
        <BarGrafico />
        <NovoGraficoPizza />
        </>
    )
}