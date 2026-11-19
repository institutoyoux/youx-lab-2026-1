import { TextField, Box, Avatar, Button } from "@mui/material";


function CadastroPagina() {
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
            Conclua seu cadastro.
        </Box>

            <Box
                sx={{
                    display: 'flex',
                    justifyContent: 'center',
                    alignItems: 'center',
                    width: '100%',
                    mt: 4,
                }}
            >
                 <Avatar
                   alt="Logo do aplicativo"
                   src="https://play-lh.googleusercontent.com/vnhuONWj1eQRuFt0nNYINChFzh2hbUvFnAkrgwAEmU5wXfufbsuWIrjZyVtuw_pYEDhJGPMxuCncZfpQyyvdhg"
                />
            </Box>

        <Box 
            sx={{
                display: 'flex',
                flexDirection: 'column',
                alignItems: 'center',
                justifyContent: 'center',
                gap: 2, // cria espaço entre os inputs
                mt: 3 // adiciona espaço em cima dos inputs
            }}
        >
            <TextField 
                label="Digite seu CPF"
            />
            <TextField
                label="Digite sua Data de Nascimento"
            />
            <TextField 
                label="Senha"
                type="password required"
            />

            <Button color="primary">
                Adicionar
            </Button>

        </Box>

    </div>
    )
}

export default CadastroPagina