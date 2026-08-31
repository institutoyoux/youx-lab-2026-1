import PropTypes from 'prop-types'

function Item({marca = 'as', ano_lancamento}) {
  return (
    <>
      <li>
        {marca} - {ano_lancamento}
      </li>
    </>
  );
}

Item.propTypes = {
    marca: PropTypes.string,
    ano_lancamento: PropTypes.number,
}

Item.defaultProps = {
    marca: 'Faltou a marca',
    ano_lancamento: 0,
}

export default Item