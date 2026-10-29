import Item from "./Item"

function List() {
    return (
        <>
            <h1>Minha Lista</h1>
            <ul>
                <Item marca="La Ferrari" ano_lancamento={2013}/>
                <Item marca="Lamborghini Aventador" ano_lancamento={2013}/>
                <Item />
            </ul>
        </>
    )
}

export default List 