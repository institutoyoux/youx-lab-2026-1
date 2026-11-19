import {  Box } from "@mui/material";

function Perfil() {
    return (
        <div>
            <Box 
            sx={{
                display: 'flex',
                justifyContent: 'center', //centraliza
                alignItems: 'center',
                width: '100%', //aumenta o tamanho
                minHeight: '80px', // aumenta a frase
                backgroundColor: 'lightblue', 
                fontSize: '24px', //aumenta o tamanho da frase
                fontWeight: 'bold',
                textAlign: 'center' //faz ocupar tudo
            }}>
                Veja seu Perfil!
            </Box>

            

        </div>
    )
}

export default Perfil