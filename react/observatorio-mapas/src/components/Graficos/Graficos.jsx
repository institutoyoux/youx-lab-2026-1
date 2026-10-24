import styles from './Grafico.module.css'
import GraficoBarra from './GraficoBarra'
import GraficoLine from './GraficoLine'

export default function Graficos({ focos }) {
    const cont = [{}, {}, {}];
    focos?.forEach(foco => {
        const date = new Date(foco?.properties.data_hora);
        const dataform = `${date.getDate()}/${date.getMonth() + 1}/${date.getFullYear()}`;

        if (cont[0][dataform] !== undefined) {
            cont[0][dataform]++;
        } else {
            cont[0][dataform] = 1;
        }



        const municipio = foco.properties.municipio
        if (cont[1][municipio] !== undefined) {
            cont[1][municipio]++;
        } else {
            cont[1][municipio] = 1;
        }



        const bioma = foco.properties.bioma
        if (cont[2][bioma] !== undefined) {
            cont[2][bioma]++;
        } else {
            cont[2][bioma] = 1;
        }
    });
    let dia = "";
    let focosDia = 0;
    const porDia = []
    for (const data in cont[0]) {
        if (cont[0][data] > focosDia) {
            focosDia = cont[0][data];
            dia = data;
        }
        porDia.push({
            data: data,
            focos: cont[0][data]
        })
    }

    let municipioFocos = ''
    let focosMun = 0;
    const porMun = []
    for (const municipio in cont[1]) {
        if (cont[1][municipio] > focosMun) {
            focosMun = cont[1][municipio]
            municipioFocos = municipio
        }
        porMun.push({
            nome: municipio,
            focos: cont[1][municipio]
        })
    }


    let bioma = ''
    let focosBi = 0;
    const porBio = []
    for (const biomaDic in cont[2]) {
        if (cont[2][biomaDic] > focosBi) {
            focosBi = cont[2][biomaDic]
            bioma = biomaDic
        }
        porBio.push({
            nome: biomaDic,
            focos: cont[2][biomaDic]
        })
    }
    return (
        <section className={styles.graficos}>
            <div className={styles.drash}>
                <div className={styles.comp}>
                    <p>Total de focos</p>
                    <span>{focos.length}</span>
                    <p>no filtro atual</p>
                </div>
                <div className={styles.comp}>
                    <p>Dia com mais focos</p>
                    <span>{dia}</span>
                    <p>{focosDia} focos</p>
                </div>
                <div className={styles.comp}>
                    <p>Municipio lider</p>
                    <span>{municipioFocos}</span>
                    <p>{focosMun} focos</p>
                </div>
                <div className={styles.comp}>
                    <p>Bioma lider</p>
                    <span>{bioma}</span>
                    <p>{focosBi} focos</p>
                </div>
            </div>
            <div className={styles.grafico}>
                <span>Focos por dia</span>
                <GraficoLine data={porDia} dataKey='focos' />
            </div>
            <div className={styles.grafico}>
                <span>Focos por bioma</span>
                <GraficoBarra data={porBio} />
            </div>
            <div className={styles.grafico}>
                <span>Focos por bioma</span>
                <GraficoBarra data={porMun} layout="vertical" />
            </div>
        </section>
    )
}