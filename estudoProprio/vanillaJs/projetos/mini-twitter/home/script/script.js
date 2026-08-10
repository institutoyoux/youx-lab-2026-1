
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
                    <div class="like">${post.liked ? `<i class="bx bxs-like" postId="${post.id}"></i>` : `<i class="bx bx-like" postId="${post.id}"></i>`}${post.likes}</div>
                </div>`
        document.getElementById("posts").appendChild(newPost)
    })
    permitirLike()
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

const permitirLike = () => {
    const liked = document.querySelectorAll(".like .bxs-like");
    const like = document.querySelectorAll(".like .bx-like")
    liked.forEach(icon => {
        const url = `post/${icon.getAttribute("postId")}/dislike`
        icon.addEventListener("click", async () => {
            try {
                const likeRes = await authApi.delete(url);
                renderizarApi();
            } catch (error) {
                alert("Não foi possivel descurtir o post!")
            }
        })
    })
    like.forEach(icon => {
        const url = `post/${icon.getAttribute("postId")}/like`
        icon.addEventListener("click", async () => {
            try {
                const likeRes = await authApi.post(url)
                renderizarApi();
            } catch (error) {
                alert("Não foi possivel curtir o post!")
            }
        })
    })
}