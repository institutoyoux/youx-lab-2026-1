import {  Box, Typography,  Avatar } from "@mui/material";

function Inicio() {

    return (

      <Box 
        sx={{
            display: 'flex',
            flexDirection: 'column',
            alignItems: 'center',
            gap: 2,
            padding: 3
        }}
      >
            <Typography variant="h2" color="lightblue" paragraph>
                Conheça o App Test!
            </Typography>


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
            component="img"
            src="https://static.nationalgeographicbrasil.com/files/styles/image_3200/public/o_patricarca_04.webp?w=1600&h=2134"
            alt="imagem"
            sx={{
                width: '650px',
                maxWidth: '100%',
                height: "auto",
                borderRadius: 2
            }}
            >
            {/* <img src="https://static.nationalgeographicbrasil.com/files/styles/image_3200/public/o_patricarca_04.webp?w=1600&h=2134" alt="Imagem" /> */}
        </Box>

    </Box>

    )
}

export default Inicio