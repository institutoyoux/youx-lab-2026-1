import { useEffect, useState } from "react";
import Personagem from "../../components/Personagem";
import styles from "./Personagens.module.css";
import DetalhesPersonagem from "../../modals/DetalhesPersonagem";
import Loading from "../../img/Loading.svg";
import { GetGeral } from "../../api/axiosApi";
import PaginationRounded from "../../components/form/PaginationRounded";
import Pesuisar from "../../components/form/Pesquisar";

export default function Personagens() {
  const [todosPersonagens, setTodosPersonagens] = useState([]);
  const [paginaAtual, setPaginaAtual] = useState(1);
  const quantidadePersonagensPagina = 6;
  const [modal, setModal] = useState(false);
  const [loading, setLoading] = useState(true);
  const [personagensPesquisados, setPersonagensPesquisados] = useState(null);

  useEffect(() => {
    GetGeral()
      .then((resp) => {
        setTodosPersonagens(resp);
        setLoading(false);
      })
      .catch((err) => console.log(err));
  }, []);
  
  const handleChange = (event, value) => {
    setPaginaAtual(value);
  };

  const valorInput = (event) => {
    console.log("valor do pesquisar: ", event.target.value);
    let resPesquisa = todosPersonagens.filter((personagem) =>
      personagem.name.toLowerCase().includes(event.target.value),
    );
    setPersonagensPesquisados(resPesquisa);
  };
  
    const ultimoPersonagem = paginaAtual * quantidadePersonagensPagina;
    const primeiroPersonagem = ultimoPersonagem - quantidadePersonagensPagina;
    const personagensExibidos = personagensPesquisados ? personagensPesquisados.slice(
      primeiroPersonagem,
      ultimoPersonagem,
    ) : todosPersonagens.slice(
      primeiroPersonagem,
      ultimoPersonagem,
    );
    const totalPaginas = Math.floor(
      personagensPesquisados ? personagensPesquisados.length / quantidadePersonagensPagina :
      todosPersonagens.length / quantidadePersonagensPagina
    );

  return (
    <>
      <div className={styles.caixaPesquisar}>
        <h1 className={styles.titulo}>Harry Potter</h1>
        <Pesuisar
          // valor={valor}
          handleChange={valorInput}
          personagens={personagensExibidos}
        />
      </div>
      <div className={styles.container}>
        {loading ? (
          <img className={styles.loading} src={Loading} />
        ) : (
        personagensExibidos.map((personagem) => (
            <Personagem personagem={personagem} setModal={setModal} />
          )) 
        
        
        )}
      </div>
      {modal && (
        <DetalhesPersonagem setModal={setModal} idPersonagem={modal.id} />
      )}
      <div className={styles.paginas}>
        <PaginationRounded
          count={totalPaginas}
          page={paginaAtual}
          handleChange={handleChange}
        />
      </div>
    </>
  );
}
