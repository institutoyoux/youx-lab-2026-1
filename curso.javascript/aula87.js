const url=document.getElementById("url")
btn_url=document.getElementById("btn_url")

btn_url.addEventListener("click",(evt)=>{
    // window.location="https://www.google.com.br"
    // window.location.replace("https://www.google.com.br") //DEleta a URL corrente do historico
    // window.location.assign("https://www.google.com.br") //Nao deleta a URL corrente do historico
    // window.location.reload()
    // window.location.back()
    // window.history.forward() 
    // window.history.go(1) 
    // console.log(window.history.length)
    // console.log(url.value)
    window.location=url.value
})