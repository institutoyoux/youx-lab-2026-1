
const removerLoading = () => {
    document.querySelector(".loading").remove()
}

const todosDados = async () => {
    try {
        const meResponse = await authApi.get('/me');
        const postsResponse = await authApi.get('/post/all');
        return { me: meResponse.data, posts: postsResponse.data.content }
    } catch (error) {
        alert("Ocorreu um erro!")
    }
}

const renderizarApi = async () => {
    const respApi = await todosDados();
    document.getElementById("perfil").src = respApi.me.urlFoto
    const post = respApi.posts
    document.getElementById("posts").innerHTML = '';
    post.map((post) => {
        const newPost = document.createElement("section");
        newPost.className = "post";
        newPost.innerHTML = `<img src="${post.user.urlFoto}" class="foto">
                <div class="postContent">
                    <span class="username">${post.user.username}</span>
                    <section>${post.conteudo}</section>
                </div>`
        document.getElementById("posts").appendChild(newPost)
    })
    removerLoading()
}
document.getElementById("menu").addEventListener("click", () => {
    modal()
})
const modal = () => {
    const divModal = document.getElementById("modal")
    if (divModal.style.display == 'none') {
        divModal.style.display = ''
    } else {
        divModal.style.display = 'none'
    }
}

const postar = document.getElementById("postar")

postar.addEventListener("click", async (event) => {
    event.preventDefault()
    const conteudo = document.getElementById("novidades")
    if (!conteudo.value || conteudo.value.replace(" ", "") == '') {
        return
    }
    try {
        const responsePostar = await authApi.post("/post/new", { conteudo: conteudo.value })
        conteudo.value = "";
        renderizarApi()
    } catch (error) {
        conteudo.style.border = '1px solid red'
    }
})
if (!token) {
    window.location.href = '/auth/login/'
} else {
    renderizarApi()
}