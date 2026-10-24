import { corEnum } from '../../utils/enums'
import styles from './Sidebar.module.css'
export default function SideBar({ biomas, municipios, satelites, riscos, filtros, setFiltros }) {
    const limparFilros = () => {
        setFiltros(
            {
                bioma: 'all',
                municipio: 'all',
                satelite: 'all',
                risco: 'all',
                inicio: '2024-09-01',
                fim: '2024-09-15'
            }
        )
    }
    return (
        <section className={styles.side}>
            <div className={styles.comp}>
                <span>Período</span>
                <input type="date" value={filtros.inicio} onChange={(e) => setFiltros(atual => ({ ...atual, inicio: e.target.value }))} />
                <input type="date" value={filtros.fim} onChange={(e) => setFiltros(atual => ({ ...atual, fim: e.target.value }))} />
            </div>
            <div className={styles.comp}>
                <span>Bioma</span>
                <select value={filtros.bioma} onChange={(e) => setFiltros(atual => ({ ...atual, bioma: e.target.value }))}>
                    <option value="all">Todos</option>
                    {biomas.length > 0 && biomas.map((bioma, index) => (
                        <option key={bioma + index} value={bioma}>{bioma}</option>
                    ))}
                </select>
            </div>
            <div className={styles.comp}>
                <span>Municipio</span>
                <select value={filtros.municipio} onChange={(e) => setFiltros(atual => ({ ...atual, municipio: e.target.value }))}>
                    <option value="all">Todos</option>
                    {municipios.length > 0 && municipios.map((municipio, index) => (
                        <option key={municipio + index} value={municipio}>{municipio}</option>
                    ))}
                </select>
            </div>
            <div className={styles.comp}>
                <span>Satélite</span>
                <select value={filtros.satelite} onChange={(e) => setFiltros(atual => ({ ...atual, satelite: e.target.value }))}>
                    <option value="all">Todos</option>
                    {satelites.length > 0 && satelites.map((satelite, index) => (
                        <option key={satelite + index} value={satelite}>{satelite}</option>
                    ))}
                </select>
            </div>
            <div className={styles.comp}>
                <span>Risco</span>
                <select value={filtros.risco} onChange={(e) => setFiltros(atual => ({ ...atual, risco: e.target.value }))}>
                    <option value="all">Todos</option>
                    {riscos.length > 0 && riscos.map((risco, index) => (
                        <option key={risco + index} value={risco}>{risco}</option>
                    ))}
                </select>
            </div>
            <button onClick={limparFilros}>Limpar filtros</button>
            <div className={styles.legenda}>
                <h5>Legenda</h5>
                {biomas.length > 0 && biomas.map(bioma => (
                    <span key={bioma}><div style={{ backgroundColor: corEnum[bioma] }}></div>{bioma}</span>
                ))}
            </div>
        </section>
    )
} 